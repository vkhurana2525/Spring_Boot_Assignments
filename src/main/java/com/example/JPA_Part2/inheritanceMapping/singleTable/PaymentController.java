package com.example.JPA_Part2.inheritanceMapping.singleTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payment/addCheque")
    public String getPay(){
       Cheque cq=new Cheque();
       cq.setCheque("234");
       cq.setId(1);
       cq.setAmount(4567);
       paymentRepository.save(cq);
       return "Added";
    }

    @GetMapping("/payment/addCreditCard")
    public String getCredit(){
        CreditCard cd=new CreditCard();
        cd.setCreditCard("234");
        paymentRepository.save(cd);
        return "Added";
    }



}
