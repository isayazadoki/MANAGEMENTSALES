package com.example.selesmanagement.SERVICE;

import com.example.selesmanagement.ENTITY.SalesEntity;

import java.util.List;

public interface SalesService {
    // Create
    SalesEntity createSalesEntity(SalesEntity salesEntity);
    // get all
    List<SalesEntity>getAll();
    // get by id
    SalesEntity getSalesEntityById(Long id);
    // update
    SalesEntity updateSalesEntity(Long id,SalesEntity salesEntity);
    // delete
    void deleteSalesEntity(Long id);
}
