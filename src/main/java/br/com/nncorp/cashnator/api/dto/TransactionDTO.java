package br.com.nncorp.cashnator.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class TransactionDTO {

    private Long id;

    private BigDecimal value;

    private Long payer;

    private Long payee;

}
