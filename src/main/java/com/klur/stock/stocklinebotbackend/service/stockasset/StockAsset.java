package com.klur.stock.stocklinebotbackend.service.stockasset;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="stock_asset")
public class StockAsset {

    @Id
    @Column(unique = true)
    private String symbol;

}
