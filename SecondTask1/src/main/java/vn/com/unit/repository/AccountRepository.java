package vn.com.unit.repository;

import java.util.List;

import org.springframework.data.mirage.repository.MirageRepository;
import org.springframework.data.repository.query.Param;

import vn.com.unit.entity.Account;

public interface AccountRepository extends MirageRepository<Account, Long> {

    List<Account> findAllAccount();
    
    Account findAccountName(@Param("username") String username);
}