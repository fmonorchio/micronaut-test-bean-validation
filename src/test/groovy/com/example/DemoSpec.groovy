package com.example

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import io.micronaut.validation.validator.Validator
import spock.lang.Specification
import jakarta.inject.Inject

import javax.validation.ConstraintViolation

@MicronautTest
class DemoSpec extends Specification {

    @Inject
    Validator validator

    @Inject
    EmbeddedApplication<?> application

    void 'test it works'() {
        expect:
        application.running
    }

    void 'Validation of composite constraint not override attributes'() {

        given:
        def user = new User(
                firstname: 'Frank',
                lastname: 'Monorchio'
        )

        when:
        def violations = validator.validate(user)

        then:
        //Must override the message template of Pattern annotation
        violations[0].messageTemplate == '{javax.validation.constraints.LowerCase.message}'
        violations[1].messageTemplate == '{javax.validation.constraints.LowerCase.message}'
    }

}
