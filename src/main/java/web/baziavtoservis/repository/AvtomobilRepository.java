package web.baziavtoservis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.baziavtoservis.entities.Avtomobil;

public interface AvtomobilRepository extends JpaRepository<Avtomobil,String> {
}
