package pe.edu.cibertec.dsw2t3pregunta3.service.interfaces;

import pe.edu.cibertec.dsw2t3pregunta3.model.Matricula;

public interface IMatriculaService {

    Matricula matricularEstudiante(Long estudianteId, Long cursoId);
    Matricula cancelarMatricula(Long matriculaId);

}
