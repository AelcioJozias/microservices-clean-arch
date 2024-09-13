package com.br.jozias.services.partient.application.core.validators;

import com.br.jozias.services.partient.application.core.domains.Patient;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PatientValidators {
    public static void validateToCreate(Patient patient) {
        if(patient.getName() == null || patient.getName().isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }
    }
}
