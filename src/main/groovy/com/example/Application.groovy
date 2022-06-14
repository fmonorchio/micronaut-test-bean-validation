package com.example

import io.micronaut.context.MessageSource
import io.micronaut.context.annotation.Bean
import io.micronaut.context.i18n.ResourceBundleMessageSource
import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application, args)
    }

    @Bean
    MessageSource messageSource() {
        return new ResourceBundleMessageSource('messages')
    }

}
