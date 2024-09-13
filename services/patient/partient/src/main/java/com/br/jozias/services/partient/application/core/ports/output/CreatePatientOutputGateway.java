package com.br.jozias.services.partient.application.core.ports.output;

import com.br.jozias.services.partient.application.core.domains.Patient;

public interface CreatePatientOutputGateway {
    Patient create(Patient patient);
}
