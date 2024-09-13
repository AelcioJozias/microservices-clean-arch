package com.br.jozias.services.partient.application.core.ports.input;

import com.br.jozias.services.partient.application.core.domains.Patient;

public interface CreatePatientInputGateway {
    Patient create(Patient patient);
}
