package com.example.JPA_Part2.inheritanceMapping.tablePerClass;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class CreditCard extends Payment {
    private String creditCard;


    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}
