package fundamentals.abstraction.abs;

import java.util.Scanner;

public abstract class PAYMENT {
    private int id;
    private float amount;
    private String name;

    PAYMENT(int id,float amount,String name){
        this.id=id;
        this.amount=amount;
        this.name=name;

    }
    float get_amount(){
        return this.amount;
    }
    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    abstract boolean pay();




}
