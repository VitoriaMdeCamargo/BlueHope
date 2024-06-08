package br.com.fiap.bluehope.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoMedalhaValidator implements ConstraintValidator<TipoMedalha, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("Iniciante") || value.equals("Intermediario") || value.equals("Avançado");
    }

}