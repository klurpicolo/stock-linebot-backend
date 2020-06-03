package com.klur.stock.stocklinebotbackend.service.target;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="stock_target")
public class Target {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer targetId;
    private String symbol;
    private BigDecimal targetPoint;
    private BigDecimal cutOffPoint;

}
