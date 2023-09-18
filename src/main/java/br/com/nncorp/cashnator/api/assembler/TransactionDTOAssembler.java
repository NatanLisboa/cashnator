package br.com.nncorp.cashnator.api.assembler;

import br.com.nncorp.cashnator.api.dto.TransactionDTO;
import br.com.nncorp.cashnator.domain.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDTOAssembler {

    public TransactionDTO toDTO(Transaction transaction) {
        return TransactionDTO.builder()
                .id(transaction.getId())
                .value(transaction.getValue())
                .payer(transaction.getPayer())
                .payee(transaction.getPayee())
                .build();
    }

}
