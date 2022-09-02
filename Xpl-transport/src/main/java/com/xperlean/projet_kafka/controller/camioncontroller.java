package com.xperlean.projet_kafka.controller;

import com.xperlean.projet_kafka.model.camion;
import com.xperlean.projet_kafka.service.camionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class camioncontroller {

    private final camionServiceImpl service;

    @PostMapping(path = "/add/camion")
    public void  addCamion (@RequestBody camion ca){
        service.ajouterCamion(ca);
    }


}
