package vn.com.unit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.com.unit.entity.Account;
import vn.com.unit.service.AccountService;

@Controller
public class HomeController {

    @Autowired
    AccountService accountService;
    
    @RequestMapping("/")
    public ModelAndView home(Model model) {

        List<Account> accounts = accountService.findAllAccount();
        model.addAttribute("accounts", accounts);

        return new ModelAndView("index");
    }
    
    

}