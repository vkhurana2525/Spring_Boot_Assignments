package inheritanceMapping.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cheque1 extends Payment1 {
    private String chequeNumber;

    public String getCheque() {
        return chequeNumber;
    }

    public void setCheque(String cheque) {
        this.chequeNumber = cheque;
    }
}
