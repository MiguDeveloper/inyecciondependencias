package pe.tuna.inyecciondependencias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.tuna.inyecciondependencias.models.domain.ItemFactura;
import pe.tuna.inyecciondependencias.models.domain.Producto;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("itemsFactura")
    public List<ItemFactura> registrarItem(){
        Producto producto1 = new Producto("Camara Sony", 125.23);
        Producto producto2 = new Producto("Bicicleta Bianchi", 1528.34);

        ItemFactura itemFactura1 = new ItemFactura(producto1, 2);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 5);

        return Arrays.asList(itemFactura1, itemFactura2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG", 1225.23);
        Producto producto2 = new Producto("Notebook Asus", 2528.34);
        Producto producto3 = new Producto("Impresora", 328.34);
        Producto producto4 = new Producto("Escritorio oficina", 278.34);

        ItemFactura itemFactura1 = new ItemFactura(producto1, 2);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 5);
        ItemFactura itemFactura3 = new ItemFactura(producto3, 3);
        ItemFactura itemFactura4 = new ItemFactura(producto4, 4);

        return Arrays.asList(itemFactura1, itemFactura2, itemFactura3, itemFactura4);
    }
}
