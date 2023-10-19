package fonseca.ricardo.aplicacion_web_springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;
import lombok.Data;
/**
 *
 * @author Fonsomp
 */
@Data
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String direccion;
    private LocalDateTime fechaRegistro;
    
    
    //Captura la fecha del registro mediante los call backs del ciclo de vida de la emtidad
    @PrePersist
    private void cargarFechaRegistro(){
        fechaRegistro = LocalDateTime.now();
     } 
}
