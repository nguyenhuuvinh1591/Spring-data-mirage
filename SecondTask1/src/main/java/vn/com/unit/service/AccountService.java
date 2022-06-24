package vn.com.unit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.unit.entity.Account;
import vn.com.unit.repository.AccountRepository;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAllAccount() {
        return accountRepository.findAllAccount();
    }
    
    public Account findAccountName(String username) {
		return accountRepository.findAccountName(username);
	}

}