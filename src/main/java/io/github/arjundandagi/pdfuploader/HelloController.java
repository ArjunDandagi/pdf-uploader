package io.github.arjundandagi.pdfuploader;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;


@RestController
public class HelloController {

    private AmazonS3Client amazonS3Client;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

