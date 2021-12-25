package com.sdp.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.explorer.filehandle.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@RestController
public class ExplorerApplication {

	public static void main(String[] args) {
		System.out.println("done ------------------------------");
		SpringApplication.run(ExplorerApplication.class, args);

	}
	@GetMapping
	public String video(){
		return "  <video controls>\n" +
				"\n" +
				"        <source src=\"/test.mp4\" type=\"video/mp4\">\n" +
				"    </video>";
	}
	
}
