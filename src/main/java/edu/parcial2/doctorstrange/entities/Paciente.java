package edu.parcial2.doctorstrange.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pacientes")
@Getter @Setter
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long id;
    @Column(name = "primer_nombre_paciente")
    private String primerNombre;
    @Column(name = "segundo_nombre_paciente")
    private String segundoNombre;
    @Column(name = "primer_apellido_paciente")
    private String primerApellido;
    @Column(name = "segundo_apellido_paciente")
    private String segundoApellido;
    @Column(name = "edad_paciente")
    private Integer edad;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Paciente paciente = (Paciente) o;
        return id != null && Objects.equals(id, paciente.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
