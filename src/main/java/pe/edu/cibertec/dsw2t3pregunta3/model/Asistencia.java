package pe.edu.cibertec.dsw2t3pregunta3.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    private String estado;

    @Column(name = "fecha")
    private final LocalDateTime fechaHora = LocalDateTime.now();
}
