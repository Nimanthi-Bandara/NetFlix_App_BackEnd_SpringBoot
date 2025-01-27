package com.Springboot.NetflixApp.Controller;

import com.Springboot.NetflixApp.Services.StreamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/stream")
    public class StreamingController {

        @Autowired
        private StreamingService streamingService;

        @GetMapping("/{movieId}")
        public String streamMovie(@PathVariable Long movieId) {
            return streamingService.streamMovie(movieId);
        }
    }