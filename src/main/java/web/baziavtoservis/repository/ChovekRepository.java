package web.baziavtoservis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.baziavtoservis.entities.Chovek;

public interface ChovekRepository extends JpaRepository<Chovek,String> {
}
