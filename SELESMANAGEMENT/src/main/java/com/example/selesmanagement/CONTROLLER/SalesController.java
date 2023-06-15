package com.example.selesmanagement.CONTROLLER;

import com.example.selesmanagement.ENTITY.SalesEntity;
import com.example.selesmanagement.SERVICE.SalesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class SalesController {
    private SalesService salesService;

    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }
    // create
    @PostMapping
    public ResponseEntity<SalesEntity>createSalesEntity(@PathVariable SalesEntity salesEntity){
        return new ResponseEntity<>(salesService.createSalesEntity(salesEntity), HttpStatus.CREATED);
    }
    // get all
    @GetMapping
    public List<SalesEntity>getAllSalesEntity(){
        return salesService.getAll();
    }
    // get by id
    @GetMapping("{id}")
    public ResponseEntity<SalesEntity>getSalesEntityById(@PathVariable Long id){
        return  new ResponseEntity<>(salesService.getSalesEntityById(id),HttpStatus.OK);
    }
    // update
    @PutMapping("{id}")
    public  ResponseEntity<SalesEntity>updateSalesEntity(Long id,SalesEntity salesEntity){
        return new ResponseEntity<>(salesService.updateSalesEntity(id,salesEntity),HttpStatus.OK);
    }
    // delete
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteSalesEntity(Long id){
        salesService.deleteSalesEntity(id);
        return new ResponseEntity<>(" deleted successfully",HttpStatus.OK);
    }
}
