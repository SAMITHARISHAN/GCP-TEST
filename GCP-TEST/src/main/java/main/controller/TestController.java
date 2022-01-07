package main.controller;

import main.repositories.MetricTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class TestController {

    @Autowired
    private MetricTypeRepository repo;

    @GetMapping(value = "/")
    public String hello() {
        StringBuilder message = new StringBuilder("Hello Google App Engine!");
        try {
            List<String> list = Collections.singletonList(repo.findAll().toString());
            repo.findAll().stream().forEach(k->
            {
                k.getDisplayName();
            });
            InetAddress ip = InetAddress.getLocalHost();
            list.forEach(m->{
                message.append(" From host: " + m);

            });
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }
}
