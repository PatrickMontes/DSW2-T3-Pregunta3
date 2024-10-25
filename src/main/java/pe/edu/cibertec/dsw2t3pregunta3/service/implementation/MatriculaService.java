package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dsw2t3pregunta3.model.Curso;
import pe.edu.cibertec.dsw2t3pregunta3.model.Estudiante;
import pe.edu.cibertec.dsw2t3pregunta3.model.Matricula;
import pe.edu.cibertec.dsw2t3pregunta3.repository.MatriculaRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IMatriculaService;

@Service
@RequiredArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final CursoService cursoService;
    private final EstudianteService estudianteService;
    private final MatriculaRepository matriculaRepository;


    @Override
    @Transactional
    public Matricula matricularEstudiante(Long estudianteId, Long cursoId) {
        Estudiante validarEstudiante = this.estudianteService.getEstudianteById(estudianteId);
        Curso validarCurso = this.cursoService.getCursoById(cursoId);

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
