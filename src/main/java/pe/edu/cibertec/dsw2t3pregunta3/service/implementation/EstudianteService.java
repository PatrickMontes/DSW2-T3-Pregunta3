package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2t3pregunta3.repository.EstudianteRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IEstudianteService;

@Service
@RequiredArgsConstructor
public class EstudianteService implements IEstudianteService {

    private final EstudianteRepository estudianteRepository;

}
