package src;

import java.math.BigDecimal;
import java.util.Date;

public class Operation {

    private BigDecimal value;
    private Date date;



    public Operation(BigDecimal value) {
        this.value = value;
        this.date = new Date();
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString(){
        return (this.value.compareTo(BigDecimal.ZERO) < 0 ? "w " : "d ") + value.abs() + " date : " + this.date + "\n";
    }
}
