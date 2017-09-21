package com.example.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by svarpe on 21.09.17.
 */
@RestController
@RequestMapping("order")
public class OrderController {


    @RequestMapping(method = RequestMethod.GET)
    public String index(Principal principal){
        return "Hallo from Order Service to  " +principal.getName();
    }
}
