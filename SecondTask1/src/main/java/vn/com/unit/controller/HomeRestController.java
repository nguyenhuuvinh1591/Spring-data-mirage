package vn.com.unit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.unit.entity.Account;
import vn.com.unit.service.AccountService;

@RestController
public class HomeRestController {
	@Autowired
	AccountService accountService;
	
	@PostMapping("/account")
	public String findByName(String username) {
		Account account = accountService.findAccountName(username);
		System.out.println(username);
		return account.getUsername();
	}
}
