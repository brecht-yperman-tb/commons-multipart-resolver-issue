package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
    private static final Logger LOG = LoggerFactory.getLogger(UploadController.class);

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = { "application/json" })
    public Response testUpload(@RequestParam("file") MultipartFile file) {
        return new Response(file.getName());
    }
}
