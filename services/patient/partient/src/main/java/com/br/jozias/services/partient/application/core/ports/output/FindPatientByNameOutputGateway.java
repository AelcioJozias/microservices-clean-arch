package com.br.jozias.services.partient.application.core.ports.output;

import com.br.jozias.services.partient.application.core.domains.Patient;

import java.util.Optional;

public interface FindPatientByNameOutputGateway {
    Patient findByName(String name);
}
