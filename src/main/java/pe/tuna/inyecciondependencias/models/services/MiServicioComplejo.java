package pe.tuna.inyecciondependencias.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("servicioComplejo")
public class MiServicioComplejo implements IMiServicio{
    @Override
    public String operacion() {
        return "Ejecutando un proceso bastante complejo...";
    }
}
