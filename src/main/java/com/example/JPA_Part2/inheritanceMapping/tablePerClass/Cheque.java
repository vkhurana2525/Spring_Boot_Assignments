package com.example.JPA_Part2.inheritanceMapping.tablePerClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class Cheque extends Payment {
    private String chequeNumber;

    public String getCheque() {
        return chequeNumber;
    }

    public void setCheque(String cheque) {
        this.chequeNumber = cheque;
    }
}
