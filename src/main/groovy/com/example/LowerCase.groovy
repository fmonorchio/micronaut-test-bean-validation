package com.example

import javax.validation.Constraint
import javax.validation.OverridesAttribute
import javax.validation.ReportAsSingleViolation
import javax.validation.constraints.Pattern
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Constraint
@Pattern(regexp = '[a-z]+')
@ReportAsSingleViolation
@Retention(RetentionPolicy.RUNTIME)
@Target([
        ElementType.ANNOTATION_TYPE,
        ElementType.FIELD,
        ElementType.PARAMETER,
        ElementType.TYPE_USE
])
@interface LowerCase {

    @OverridesAttribute(constraint = Pattern, name = 'message')
    String message() default '{javax.validation.constraints.LowerCase.message}'

}
