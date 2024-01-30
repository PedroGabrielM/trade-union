package br.com.gameoverproject.tradeunion.tradeunion.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "trade_union")
@Table(name = "trade-union")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TradeUnion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}