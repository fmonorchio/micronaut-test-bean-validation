package com.example

import io.micronaut.context.MessageSource
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Context
import io.micronaut.context.annotation.Factory
import io.micronaut.context.i18n.ResourceBundleMessageSource
import io.micronaut.runtime.context.CompositeMessageSource
import jakarta.inject.Inject

@Context
@Factory
class MessageSourceFactory {

    @Bean
    MessageSource messageSource() {
        return new ResourceBundleMessageSource('messages')
    }

}
