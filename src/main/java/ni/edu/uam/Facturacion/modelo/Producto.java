package ni.edu.uam.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Producto {
    @Id
    @Column(length = 10)
    int numero;

    @Column(length = 100)
    @Required
    String descripcion;

}

