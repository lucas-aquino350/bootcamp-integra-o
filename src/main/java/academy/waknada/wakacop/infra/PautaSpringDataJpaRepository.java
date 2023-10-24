package academy.waknada.wakacop.infra;

import academy.waknada.wakacop.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaSpringDataJpaRepository extends JpaRepository<Pauta, UUID> {
}
