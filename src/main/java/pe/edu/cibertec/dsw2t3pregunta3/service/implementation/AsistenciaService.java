package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dsw2t3pregunta3.model.Asistencia;
import pe.edu.cibertec.dsw2t3pregunta3.model.Curso;
import pe.edu.cibertec.dsw2t3pregunta3.model.Estudiante;
import pe.edu.cibertec.dsw2t3pregunta3.repository.AsistenciaRepository;
import pe.edu.cibertec.dsw2t3pregunta3.repository.CursoRepository;
import pe.edu.cibertec.dsw2t3pregunta3.repository.EstudianteRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IAsistenciaService;

@Service
@RequiredArgsConstructor
public class AsistenciaService implements IAsistenciaService {

    private final AsistenciaRepository asistenciaRepository;
    private final EstudianteRepository estudianteRepository;
    private final CursoRepository cursoRepository;

    @Override
    @Transactional
    public Asistencia registrarAsistencia(Asistencia asistencia) {
        if (asistencia.getEstudiante() == null || asistencia.getEstudiante().getId() == null) {
            throw new RuntimeException("Estudiante es obligatorio");
        }
        if (asistencia.getCurso() == null || asistencia.getCurso().getId() == null) {
            throw new RuntimeException("Curso es obligatorio");
        }

        Estudiante estudiante = estudianteRepository.findById(asistencia.getEstudiante().getId())
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
        Curso curso = cursoRepository.findById(asistencia.getCurso().getId())
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        if (asistencia.getEstado() == null || asistencia.getEstado().isBlank()) {
            throw new RuntimeException("Estado es obligatorio");
        }

        if (!asistencia.getEstado().matches("Presente|Ausente|Justificado")) {
            throw new RuntimeException("Estado debe ser Presente, Ausente o Justificado");
        }

        asistencia.setEstudiante(estudiante);
        asistencia.setCurso(curso);
        return asistenciaRepository.save(asistencia);
    }
}