package br.com.nncorp.cashnator.api.assembler;

import br.com.nncorp.cashnator.api.input.TransactionInput;
import br.com.nncorp.cashnator.domain.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionInputDisassembler {

    public Transaction toDomainObject(TransactionInput transactionInput) {
        return Transaction.builder()
                .value(transactionInput.getValue())
                .payer(transactionInput.getPayer())
                .payee(transactionInput.getPayee())
                .build();
    }

}
