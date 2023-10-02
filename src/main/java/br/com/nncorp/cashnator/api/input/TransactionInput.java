package br.com.nncorp.cashnator.api.input;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransactionInput {

    private BigDecimal value;

    private Long payerId;

    private Long payeeId;

}
