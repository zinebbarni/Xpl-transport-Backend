package com.xperlean.projet_kafka.Repository;


import com.xperlean.projet_kafka.model.camion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface camionRepository extends JpaRepository<camion,Long> {
}
