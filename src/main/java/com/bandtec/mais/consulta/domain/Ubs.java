package com.bandtec.mais.consulta.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "Ubs", schema = "dbo", catalog = "maisconsultadb")
@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ubs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubs")
    private Integer ubsId;

    @Column(name = "nome")
    private String name;

    @Column(name = "telefone")
    private String phone;

    @JoinColumn(name = "endereco_id", referencedColumnName = "id_endereco", nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ubs ubs = (Ubs) o;

        return Objects.equals(ubsId, ubs.ubsId);
    }

    @Override
    public int hashCode() {
        return 1227588814;
    }
}
