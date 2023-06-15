package com.example.selesmanagement;

import com.example.selesmanagement.ENTITY.SalesEntity;
import com.example.selesmanagement.REPOSITORY.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelesmanagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SelesmanagementApplication.class, args);
    }
    @Autowired
    private SalesRepository salesRepository;

    @Override
    public void run(String... args) throws Exception {
        SalesEntity salesEntity=new SalesEntity();
        salesEntity.setCost(3000);
        salesEntity.setLocation("mwanjelwa");
        salesEntity.setProductName("container");
        salesEntity.setEmail("wwwa322");
        salesRepository.save(salesEntity);

        SalesEntity salesEntity1=new SalesEntity();
        salesEntity1.setCost(4000);
        salesEntity1.setLocation("kabwe");
        salesEntity1.setProductName("kalamu");
        salesEntity1.setEmail("wwwa322");
        salesRepository.save(salesEntity1);


    }
}
