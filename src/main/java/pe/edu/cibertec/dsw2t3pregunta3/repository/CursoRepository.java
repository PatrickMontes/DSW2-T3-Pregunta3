package pe.edu.cibertec.dsw2t3pregunta3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dsw2t3pregunta3.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
