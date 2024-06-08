package br.com.fiap.bluehope.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TipoMedalhaValidator.class)
public @interface TipoMedalha {

    String message() default "{medalha.tipo}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
