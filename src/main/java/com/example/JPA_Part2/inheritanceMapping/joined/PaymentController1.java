package com.example.JPA_Part2.inheritanceMapping.joined;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController1 {

    @Autowired
    private PaymentRepository1 paymentRepository;

    @GetMapping("/payment/addchequejoined")
    public String getPay(){
       Cheque1 cq=new Cheque1();
       cq.setCheque("234");
       cq.setId(1);
       cq.setAmount(4567);
       paymentRepository.save(cq);
       return "Added";
    }

    @GetMapping("/payment/addcreditCardjoined")
    public String getCredit(){
        CreditCard1 cd=new CreditCard1();
        cd.setCreditCard("234");
        paymentRepository.save(cd);
        return "Added";
    }



}
