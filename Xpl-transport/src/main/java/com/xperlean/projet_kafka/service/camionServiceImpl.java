package com.xperlean.projet_kafka.service;

import com.xperlean.projet_kafka.Repository.camionRepository;
import com.xperlean.projet_kafka.model.camion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class camionServiceImpl implements camionService{
    private final camionRepository cr;

    @Override
    public void ajouterCamion(camion ca) {
        cr.save(ca);
    }
}
