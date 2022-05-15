package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Account;

import java.math.BigDecimal;
import java.util.Date;

class AccountTest {

    private Account account = new Account();


    @Test
    void makeDeposit() {
        account.makeDeposit(BigDecimal.valueOf(100));
        Assertions.assertEquals(BigDecimal.valueOf(100),account.calculateBalance());
    }

    @Test
    void makeWithdrawal() {
        account.makeWithdrawal(BigDecimal.valueOf(100));
        Assertions.assertEquals(BigDecimal.valueOf(-100),account.calculateBalance());
    }

    @Test
    void listOperations() {
        String testString = "w 100 date : " + new Date() + "\n";
        account.makeWithdrawal(BigDecimal.valueOf(100));
        Assertions.assertEquals(testString,account.listOperations());
    }
}
