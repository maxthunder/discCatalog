package com.maxthunder.discCatalog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author maxwell.stark
 * @since 2023-05-02
 */
@Controller
public class StatusController {

    @GetMapping(value = "/status")
    public ResponseEntity<String> getStatus() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
