package com.klur.stock.stocklinebotbackend.service.stockasset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockAssetService {

    @Autowired
    StockAssetRepository stockAssetRepository;

    public List<StockAsset> getStockAsset(){
        return stockAssetRepository.findAll();
    }

    public StockAsset addStockAsset(StockAsset stockAsset){
        return stockAssetRepository.save(stockAsset);
    }

    public void deleteStockAsset(String symbol) throws IllegalArgumentException{
        StockAsset deletedStock = stockAssetRepository.findById(symbol)
                .orElseThrow(()-> new IllegalArgumentException("Invalid stock symbol: " + symbol));
        stockAssetRepository.delete(deletedStock);
    }
}
