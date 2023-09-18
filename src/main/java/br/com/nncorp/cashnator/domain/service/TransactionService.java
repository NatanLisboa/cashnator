package br.com.nncorp.cashnator.domain.service;

import br.com.nncorp.cashnator.domain.model.Transaction;
import br.com.nncorp.cashnator.domain.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Transactional
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

}
