package fonseca.ricardo.aplicacion_web_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fonsomp
 */
@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
