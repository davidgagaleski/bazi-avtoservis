package web.baziavtoservis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.baziavtoservis.entities.Defekt;

public interface DefektRepository extends JpaRepository<Defekt,String> {
}
