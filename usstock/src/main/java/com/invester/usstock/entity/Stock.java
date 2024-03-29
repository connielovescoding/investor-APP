package com.invester.usstock.entity;

import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "stock")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "ipo_date")
    private LocalDate ipoDate;

    private String logo;

    @Column(name = "market_cap", columnDefinition = "NUMERIC(15,2)")
    private Double marketCap;

    private String currency;

    @Column(name = "status", columnDefinition = "VARCHAR(1)") // 'A', 'I'
    private String stockStatus;
    
    @OneToOne
    @JoinColumn(name = "symbol_id", nullable = false)
    private StockSymbol stockSymbol;
    
}
