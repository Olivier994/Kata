package src;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;


public class Account {


    private List<Operation> lop = new LinkedList<>();



    /**
     * make a deposit
     * @param amount
     */
    public void makeDeposit(BigDecimal amount){
        lop.add(new Operation(amount));
    }

    /**
     * make a withdrawal
     * @param amount
     */
    public void makeWithdrawal(BigDecimal amount){
        lop.add(new Operation(amount.negate()));
    }

    /**
     * calculate the balance of the account
     * @return the balance of the account
     */
    public BigDecimal calculateBalance(){
        return lop.stream().map(Operation::getValue).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * list all the operations
     */
    public String listOperations(){
        return lop.stream().map(Operation::toString).reduce("",String::concat);
    }
}
