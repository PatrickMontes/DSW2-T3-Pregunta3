package pe.edu.cibertec.dsw2t3pregunta3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.dsw2t3pregunta3.service.implementation.MatriculaService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/matricula")
public class MatriculaController {

    private final MatriculaService matriculaService;

}
