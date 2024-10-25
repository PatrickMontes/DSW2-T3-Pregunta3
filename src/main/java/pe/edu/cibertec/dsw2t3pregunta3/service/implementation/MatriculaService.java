package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dsw2t3pregunta3.model.Curso;
import pe.edu.cibertec.dsw2t3pregunta3.model.Estudiante;
import pe.edu.cibertec.dsw2t3pregunta3.model.Matricula;
import pe.edu.cibertec.dsw2t3pregunta3.repository.CursoRepository;
import pe.edu.cibertec.dsw2t3pregunta3.repository.EstudianteRepository;
import pe.edu.cibertec.dsw2t3pregunta3.repository.MatriculaRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IMatriculaService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final CursoRepository cursoRepository;
    private final MatriculaRepository matriculaRepository;
    private final EstudianteRepository estudianteRepository;


    @Override
    @Transactional
    public Matricula matricularEstudiante(Long estudianteId, Long cursoId) {
        Estudiante validarEstudiante = this.estudianteRepository.findById(estudianteId).orElseThrow(
                () -> new RuntimeException("Estudiante ID no encontrado"));

        Curso validarCurso = this.cursoRepository.findById(cursoId).orElseThrow(
                () -> new RuntimeException("Curso ID no encontrado"));

        Matricula matricula = new Matricula();
        matricula.setEstudiante(validarEstudiante);
        matricula.setCurso(validarCurso);
        matricula.setEstado("Activa");

        this.matriculaRepository.save(matricula);

        return matricula;
    }


    @Override
    public Matricula cancelarMatricula(Long matriculaId) {
        Matricula modificarMatricula = this.matriculaRepository.findById(matriculaId).orElseThrow(
                () -> new RuntimeException("Matricula ID no encontrada"));

        modificarMatricula.setEstado("Cancelada");
        this.matriculaRepository.save(modificarMatricula);

        return modificarMatricula;
    }
}
