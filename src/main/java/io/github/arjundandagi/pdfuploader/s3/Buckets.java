package io.github.arjundandagi.pdfuploader.s3;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import io.github.arjundandagi.pdfuploader.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Buckets {

    @GetMapping("/buckets")
    public List<Bucket> listBuckets(){
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
        List<Bucket> buckets = s3.listBuckets();
        /*        System.out.println("Your Amazon S3 buckets are:");
                   System.out.println("* " + b.getName());
        }*/
        return buckets;
    }

    @GetMapping("/throwserror")
    public int throwserror(){
        throw new ResourceNotFoundException("just trying to scare you some excpetion");
    }

}
