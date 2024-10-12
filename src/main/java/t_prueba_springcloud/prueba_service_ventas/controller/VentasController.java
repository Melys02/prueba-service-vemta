package t_prueba_springcloud.prueba_service_ventas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import t_prueba_springcloud.prueba_service_ventas.remoteservice.ServiceOrdenClient;

@RequiredArgsConstructor
@RestController
public class VentasController {

    private ServiceOrdenClient serviceOrdenClient;

    @GetMapping("/monto")
    public String consultarMonto() {
        return "Respuesta Del Servicio De Ventas - Monto";
    }

    @GetMapping("/detalle")
    public String consultarDetalle() {
        return "Respuesta Del Servicio De Ventas - Detalle";
    }

    @GetMapping("/monto-orden")
    public String consultarMontoOrden() {
        return serviceOrdenClient.consultarOrden();
    }


}
