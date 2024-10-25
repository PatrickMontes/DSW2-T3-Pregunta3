package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2t3pregunta3.repository.MatriculaRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IMatriculaService;

@Service
@RequiredArgsConstructor
public class MatriculaService implements IMatriculaService {

    private final MatriculaRepository matriculaRepository;

}
