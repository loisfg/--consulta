package com.bandtec.mais.consulta.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PacienteHasDoencas {
    @EmbeddedId
    PacienteHasDoencasKey id;

    @ManyToOne
    @JoinColumn(name = "doenca_id", insertable = false, updatable = false)
    private Doenca doenca;

    @ManyToOne
    @JoinColumn(name = "paciente_id", insertable = false, updatable = false)
    private Paciente paciente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PacienteHasDoencas that = (PacienteHasDoencas) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}