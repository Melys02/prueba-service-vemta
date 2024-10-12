package t_prueba_springcloud.prueba_service_ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PruebaServiceVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaServiceVentasApplication.class, args);
	}

}
