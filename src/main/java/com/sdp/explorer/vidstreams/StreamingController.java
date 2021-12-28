package com.sdp.explorer.vidstreams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class StreamingController {

    @Autowired
    private StreamingService service;

    @GetMapping(value = "video/{ownerid}/{title}", produces = "video/mp4")
    public Mono<Resource> getVideo(@PathVariable("title") String title,@PathVariable("ownerid") String ownid, @RequestHeader("Range") String range) {
//        System.out.println(range);
        return service.getVideo(ownid+"/"+title);
    }

}