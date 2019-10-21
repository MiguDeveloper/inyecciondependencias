package pe.tuna.inyecciondependencias.models.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// IMPORTANTE!!: si usamos la inyeccion de dependencias siempre que tengamos un constructor es obligatorio
// incluir el constructor vacio
// Si en caso hubieran varias clases que implementen la interface, debemos de usar la anotacion @qualifier
// y nombrar el @Component("miServicioSimple") de manera que al inyectarlo debemos de indicar que clase usar
@Component("servicioSimple")
public class MiServicio implements IMiServicio{

    @Override
    public String operacion() {
        return "Ejecutando algun proceso sencillo...";
    }
}
