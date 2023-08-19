package com.sakcode.springkube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/ping")
public class DemoController {

    @Autowired
    private Environment environment;

    @GetMapping()
    public ResponseEntity<?> greeting() {
        String host;
        try {
            InetAddress ipAddress = InetAddress.getLocalHost();
            host = ipAddress.getHostAddress() + " -- " + ipAddress.getHostName() + " -0- " + ipAddress.getCanonicalHostName();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok("Working on " + host);
    }
}
