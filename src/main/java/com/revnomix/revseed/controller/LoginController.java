package com.revnomix.revseed.controller;

import javax.validation.Valid;
import javax.ws.rs.*;

import com.revnomix.revseed.model.Accounts;
import com.revnomix.revseed.model.User;
import com.revnomix.revseed.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.revnomix.revseed.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

    @RequestMapping(value="/admin/login/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public Accounts partialLogin(@RequestBody User1  user1){
        Accounts accounts = new Accounts();
        accounts.setStatus(true);
        accounts.setClienId(1);
        accounts.setRole("client");
        return accounts;
    }

    @RequestMapping(value="/clients/clients/getAllClients", method = RequestMethod.OPTIONS)
    @ResponseBody
    public Accounts getAllClients(){
        Accounts accounts = new Accounts();
        accounts.setStatus(true);
        accounts.setClienId(1);
        accounts.setRole("client");
        return accounts;
    }
}
