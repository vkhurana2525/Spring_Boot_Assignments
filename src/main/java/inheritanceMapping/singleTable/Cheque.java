package inheritanceMapping.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Payment {
    private String chequeNumber;

    public String getCheque() {
        return chequeNumber;
    }

    public void setCheque(String cheque) {
        this.chequeNumber = cheque;
    }
}
