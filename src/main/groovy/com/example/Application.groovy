package com.example

import groovy.transform.CompileStatic
import io.micronaut.context.MessageSource
import io.micronaut.context.annotation.Bean
import io.micronaut.context.i18n.ResourceBundleMessageSource
import io.micronaut.runtime.Micronaut

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
