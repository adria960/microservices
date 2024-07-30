package com.eureka.image.controller;

import com.eureka.image.model.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class ImageController {

    private static final Logger log = LoggerFactory.getLogger(ImageController.class);

    @GetMapping("/images")
    public List<Image> getImagaes() throws Exception {

        log.info("In ImageController BEGIN");
        // With Sleuth dependency added in pom.xml ->
//        Now, when you make a request to gallery (image) service, you should see the trace and span ids in the console logs.
//        INFO [gallery-service,adcd5217a36fe469,8639d164315daca9,false] ...

        List<Image> images = Arrays.asList(
                new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112")
        );
        // for testing failure *****
        // adding this to test Hystrix - Circuit Breaker pattern
        // in gallery-service there is fallback method
//        if (true)
//            throw new Exception("Images can't be fetched");
//  *****
        log.info("In ImageController END");
        return images;
    }
}
