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
    @Column(name = "fecha_cita")
    private Date fecha;
    @Column(name = "hora_cita")
    private Time hora;
//    @ManyToOne
//    @JoinColumn(name = "id_poliza")
    @Column(name = "poliza_cita")
    private String poliza;
    @Column(name = "observaciones_cita")
    private String observaciones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return Objects.equals(id, cita.id) && Objects.equals(fecha, cita.fecha) && Objects.equals(hora, cita.hora) && Objects.equals(poliza, cita.poliza) && Objects.equals(observaciones, cita.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, hora, poliza, observaciones);
    }
}
