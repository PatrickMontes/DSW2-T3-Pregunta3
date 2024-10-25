package pe.edu.cibertec.dsw2t3pregunta3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dsw2t3pregunta3.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
}
