package admin.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinStreamServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZipkinStreamServerApplication.class, args);
    }

}
