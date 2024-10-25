package pe.edu.cibertec.dsw2t3pregunta3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dsw2t3pregunta3.model.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
