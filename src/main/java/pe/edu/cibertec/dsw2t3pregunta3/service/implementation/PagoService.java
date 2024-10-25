package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2t3pregunta3.repository.PagoRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IPagoService;

@Service
@RequiredArgsConstructor
public class PagoService implements IPagoService {

    private final PagoRepository pagoRepository;

}
