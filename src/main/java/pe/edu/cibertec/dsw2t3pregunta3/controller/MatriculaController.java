package pe.edu.cibertec.dsw2t3pregunta3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.dsw2t3pregunta3.model.Matricula;
import pe.edu.cibertec.dsw2t3pregunta3.service.implementation.MatriculaService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/matricula")
public class MatriculaController {

    private final MatriculaService matriculaService;

    @PostMapping("/matricular")
    public ResponseEntity<Matricula> matricularEstudiante(@RequestParam Long estudianteId, @RequestParam Long cursoId) {
        return ResponseEntity.ok(this.matriculaService.matricularEstudiante(estudianteId, cursoId));
    }

    @PutMapping("/cancelar/{matriculaId}")
    public ResponseEntity<Matricula> cancelarMatricula(@PathVariable Long matriculaId) {
        return ResponseEntity.ok(this.matriculaService.cancelarMatricula(matriculaId));
    }
}