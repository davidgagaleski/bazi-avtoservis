package web.baziavtoservis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.baziavtoservis.entities.Klient;

public interface KlientRepository extends JpaRepository<Klient,String> {
}
