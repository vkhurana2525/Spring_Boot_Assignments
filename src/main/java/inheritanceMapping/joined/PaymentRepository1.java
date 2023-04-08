package inheritanceMapping.joined;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository1 extends CrudRepository<Payment1,Long> {

}
