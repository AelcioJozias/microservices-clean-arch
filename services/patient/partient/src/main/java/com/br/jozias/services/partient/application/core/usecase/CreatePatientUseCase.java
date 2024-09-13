package com.br.jozias.services.partient.application.core.usecase;

import com.br.jozias.services.partient.application.core.domains.Patient;
import com.br.jozias.services.partient.application.core.ports.input.CreatePatientInputGateway;
import com.br.jozias.services.partient.application.core.ports.output.CreatePatientOutputGateway;
import com.br.jozias.services.partient.application.core.ports.output.FindPatientByNameOutputGateway;
import com.br.jozias.services.partient.application.core.validators.PatientValidators;

import java.util.Objects;

import static java.util.Objects.nonNull;

public class CreatePatientUseCase implements CreatePatientInputGateway {

    private final CreatePatientOutputGateway createPatientOutputGateWay;
    private final FindPatientByNameOutputGateway findPatientByNameOutputGateway;

    public CreatePatientUseCase(CreatePatientOutputGateway createPatientOutputGateWay, FindPatientByNameOutputGateway findPatientByNameOutputGateway) {
        this.createPatientOutputGateWay = createPatientOutputGateWay;
        this.findPatientByNameOutputGateway = findPatientByNameOutputGateway;
    }

    @Override
    public Patient create(Patient patient) {
        if(nonNull(findPatientByNameOutputGateway.findByName(patient.getName()))) {
            throw new IllegalArgumentException("Patient already exists");
        }
        PatientValidators.validateToCreate(patient);
        return createPatientOutputGateWay.create(patient);
    }
}
