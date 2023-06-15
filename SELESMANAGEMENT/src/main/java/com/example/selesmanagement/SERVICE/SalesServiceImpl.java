package com.example.selesmanagement.SERVICE;

import com.example.selesmanagement.ENTITY.SalesEntity;
import com.example.selesmanagement.EXCEPTION.ResourceNotFoundException;
import com.example.selesmanagement.REPOSITORY.SalesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalesServiceImpl implements SalesService{
    private SalesRepository salesRepository;

    public SalesServiceImpl(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }
// create
    @Override
    public SalesEntity createSalesEntity(SalesEntity salesEntity) {
        return salesRepository.save(salesEntity);
    }
// get all
    @Override
    public List<SalesEntity> getAll() {
        return salesRepository.findAll();
    }
// get by id
    @Override
    public SalesEntity getSalesEntityById(Long id) {
        SalesEntity salesEntity=salesRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
        return salesEntity;
    }
// update
    @Override
    public SalesEntity updateSalesEntity(Long id, SalesEntity salesEntity) {
        SalesEntity existingSalesEntity=salesRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
        existingSalesEntity.setProductName(salesEntity.getProductName());
        existingSalesEntity.setLocation(salesEntity.getLocation());
        existingSalesEntity.setEmail(salesEntity.getEmail());
        existingSalesEntity.setCost(salesEntity.getCost());
        SalesEntity updateSalesEntity=salesRepository.save(salesEntity);
        return updateSalesEntity;
    }

    @Override
    public void deleteSalesEntity(Long id) {
        SalesEntity  deleteSalesEntity=salesRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("NotFound"));
          salesRepository.delete(deleteSalesEntity);
    }
}
