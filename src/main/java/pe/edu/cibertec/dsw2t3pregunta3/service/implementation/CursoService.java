package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2t3pregunta3.model.Curso;
import pe.edu.cibertec.dsw2t3pregunta3.repository.CursoRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.ICursoService;

@Service
@RequiredArgsConstructor
public class CursoService implements ICursoService {

    private final CursoRepository cursoRepository;


    @Override
    public Curso getCursoById(Long id) {

        return cursoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Curso ID no encontrado"));
    }

}
