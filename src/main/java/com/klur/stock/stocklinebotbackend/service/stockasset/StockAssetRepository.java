package com.klur.stock.stocklinebotbackend.service.stockasset;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockAssetRepository extends JpaRepository<StockAsset,String> {

}
