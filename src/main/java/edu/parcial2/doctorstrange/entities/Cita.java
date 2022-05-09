package edu.parcial2.doctorstrange.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "citas")
@Getter @Setter
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long id;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "id_poliza")
    private Poliza poliza;
    @Column(name = "fecha_cita")
    private Date fecha;
    @Column(name = "hora_cita")
    private Time hora;
    @Column(name = "estado_cita")
    private String estado;
    @Column(name = "observacion_cita")
    private String observacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return Objects.equals(id, cita.id) && Objects.equals(fecha, cita.fecha) && Objects.equals(hora, cita.hora) && Objects.equals(poliza, cita.poliza) && Objects.equals(estado, cita.estado) && Objects.equals(observacion, cita.observacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, hora, poliza, estado, observacion);
    }
}
