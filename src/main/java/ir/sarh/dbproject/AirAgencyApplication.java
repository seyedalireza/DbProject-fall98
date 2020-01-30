package in.nimbo.rssreader;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
public class AirAgencyApplication {
	public static void main(String[] args) {
		SpringApplication.run(AirAgencyApplication.class, args);
	}
}
