package pe.edu.cibertec.dsw2t3pregunta3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.dsw2t3pregunta3.model.Asistencia;
import pe.edu.cibertec.dsw2t3pregunta3.service.interfaces.IAsistenciaService;

@RestController
@RequestMapping("api/v1/asistencia")
@RequiredArgsConstructor
public class AsistenciaController {

    private final IAsistenciaService asistenciaService;

    @PostMapping("/registrar")
    public ResponseEntity<Asistencia> registrarAsistencia(@RequestBody Asistencia asistencia) {
        Asistencia nuevaAsistencia = asistenciaService.registrarAsistencia(asistencia);
        return ResponseEntity.ok(nuevaAsistencia);
    }
}