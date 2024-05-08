/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7;

import java.util.Calendar;

/**
 *
 * @author User
 */
class SavingsAccount extends Account {
    private long creditCardNumber;
    private Calendar expiryDate;

    public SavingsAccount() {
        super();
        creditCardNumber = 0;
        expiryDate = Calendar.getInstance();
    }

    public SavingsAccount(int id, double balance, double annualInterestRate, long creditCardNumber, Calendar expiryDate) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = creditCardNumber;
        this.expiryDate = expiryDate;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

    public double getCreditBalance() {
        return getBalance() * 3;        // we get getBalance() form parent class......!
    }
}

