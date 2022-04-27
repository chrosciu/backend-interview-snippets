package controller;

import business.Account;
import business.AccountEngine;
import client.AccountCreationRequest;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/accounts")
public class AccountController {

    private final AccountEngine accountEngine;

    public AccountController(AccountEngine accountEngine) {
        this.accountEngine = accountEngine;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> getOpenAccounts(long typeId) {
        return accountEngine.findOpenAccounts(typeId);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public long createAccount(AccountCreationRequest request) {
        // implementation
        return 1L; // Account ID
    }
}
