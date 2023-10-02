package br.com.nncorp.cashnator.domain.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private BigDecimal value;

    @Column(name = "payer_id", nullable = false)
    private Long payerId;

    @Column(name = "payee_id", nullable = false)
    private Long payeeId;

    @OneToOne
    @JoinColumn(name = "payer_id", nullable = false, insertable = false, updatable = false)
    private User payer;

    @OneToOne
    @JoinColumn(name = "payee_id", nullable = false, insertable = false, updatable = false)
    private User payee;

}
