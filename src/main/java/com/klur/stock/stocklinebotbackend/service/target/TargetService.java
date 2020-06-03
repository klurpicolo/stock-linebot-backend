package com.klur.stock.stocklinebotbackend.service.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetService {

    @Autowired
    TargetRepository targetRepository;

    public List<Target> getStockTarget(){
        return targetRepository.findAll();
    }

    public Target addStockTarget(Target target){
        return targetRepository.save(target);
    }

    public void deleteStockTarget(String id) throws IllegalArgumentException{
        Target deletedStock = targetRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid target with ID : " + id));
        targetRepository.delete(deletedStock);
    }
}
