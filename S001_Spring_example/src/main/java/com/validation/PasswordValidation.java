package com.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.Password;

public class PasswordValidation implements Validator{

	@Override
	public boolean supports(Class<?> paramClass) {
		// TODO Auto-generated method stub
		return Password.class.equals(paramClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cnfpassword", "valid.cnfpassword");
		Password password=(Password) target;
		if(!password.getPassword().equals(password.getCnfpassword())) {
			errors.rejectValue("cnfpassword", "valid.cnfpasswordDiff");
		}
	}

}
