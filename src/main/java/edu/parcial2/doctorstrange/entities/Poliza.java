package edu.parcial2.doctorstrange.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Getter @Setter
@ToString
@Table(name = "polizas")
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_poliza")
    private Long id;
    @ManyToOne(cascade ={CascadeType.PERSIST})
    @JoinColumn(name = "id_cliente")
    private Paciente paciente;
    @Column(name = "estado_poliza")
    private String estado;
    @Column(name = "fecha_inicio_poliza")
    private Date fechaInicio;
    @Column(name = "fecha_fin_poliza")
    private Date fechaFin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poliza poliza = (Poliza) o;
        return Objects.equals(id, poliza.id) && Objects.equals(paciente, poliza.paciente) && Objects.equals(estado, poliza.estado) && Objects.equals(fechaInicio, poliza.fechaInicio) && Objects.equals(fechaFin, poliza.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paciente, estado, fechaInicio, fechaFin);
    }
}