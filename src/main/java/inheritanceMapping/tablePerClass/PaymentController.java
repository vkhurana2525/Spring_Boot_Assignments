package inheritanceMapping.tablePerClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payment/addcheque")
    public String getPay(){
       Cheque cq=new Cheque();
       cq.setCheque("234");
       cq.setId(1);
       cq.setAmount(4567);
       paymentRepository.save(cq);
       return "Added";
    }

    @GetMapping("/payment/addcreditCard")
    public String getCredit(){
        CreditCard cd=new CreditCard();
        cd.setCreditCard("234");
        paymentRepository.save(cd);
        return "Added";
    }



}
