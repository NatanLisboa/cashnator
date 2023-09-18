package br.com.nncorp.cashnator.api.controller;

import br.com.nncorp.cashnator.api.assembler.TransactionDTOAssembler;
import br.com.nncorp.cashnator.api.assembler.TransactionInputDisassembler;
import br.com.nncorp.cashnator.api.dto.TransactionDTO;
import br.com.nncorp.cashnator.api.input.TransactionInput;
import br.com.nncorp.cashnator.domain.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transactions")
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionInputDisassembler transactionInputDisassembler;
    private final TransactionDTOAssembler transactionDTOAssembler;

    @PostMapping
    public TransactionDTO createTransaction(@RequestBody TransactionInput transactionInput) {
        return transactionDTOAssembler.toDTO(transactionService.createTransaction(transactionInputDisassembler.toDomainObject(transactionInput)));
    }

}
