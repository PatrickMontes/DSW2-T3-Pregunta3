package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2t3pregunta3.repository.AsistenciaRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IAsistenciaService;

@Service
@RequiredArgsConstructor
public class AsistenciaService implements IAsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

}
