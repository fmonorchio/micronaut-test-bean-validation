package com.example

import io.micronaut.core.annotation.Introspected

@Introspected
class User {

    @LowerCase
    String firstname

    @LowerCase
    String lastname

}
