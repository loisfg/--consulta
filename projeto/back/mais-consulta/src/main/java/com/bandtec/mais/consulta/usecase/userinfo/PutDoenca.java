package com.bandtec.mais.consulta.usecase.userinfo;

import com.bandtec.mais.consulta.domain.Doenca;

import java.util.Optional;

public interface PutDoenca {
    Optional<Doenca> execute(Integer id, Doenca doenca);
}
