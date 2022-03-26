package com.bandtec.mais.consulta.usecase.patient;

import com.bandtec.mais.consulta.models.dto.response.PatientHistoricResponseDTO;

import java.util.List;
import java.util.Optional;

public interface GetHistorico {
    Optional<List<PatientHistoricResponseDTO>> execute(Integer idPaciente);
}
