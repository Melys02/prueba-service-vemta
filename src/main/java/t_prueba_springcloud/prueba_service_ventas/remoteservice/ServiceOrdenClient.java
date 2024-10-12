package t_prueba_springcloud.prueba_service_ventas.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="prueba-service-mantenimiento")

public interface ServiceOrdenClient {


    @GetMapping("/orden")
    String consultarOrden();
}