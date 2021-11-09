package com.bandtec.mais.consulta.usecase.info;

import com.bandtec.mais.consulta.domain.PacienteHasAlergia;
import com.bandtec.mais.consulta.domain.PacienteHasRemedios;
import com.bandtec.mais.consulta.domain.Remedio;

import java.util.Optional;
import java.util.Set;

public interface PostRemedio {
    Optional<PacienteHasRemedios> execute(Iterable<Integer> remedios, Integer id);
}
