package pe.edu.cibertec.dsw2t3pregunta3.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dsw2t3pregunta3.repository.DetallePagoRepository;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IDetallePagoService;

@Service
@RequiredArgsConstructor
public class DetallePagoService implements IDetallePagoService {

    private final DetallePagoRepository detallePagoRepository;

}
