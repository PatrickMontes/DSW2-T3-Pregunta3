package pe.edu.cibertec.dsw2t3pregunta3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;


    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_pago")
    private final LocalDateTime fechaPago = LocalDateTime.now();
    private Double monto;
    private String estado;
}