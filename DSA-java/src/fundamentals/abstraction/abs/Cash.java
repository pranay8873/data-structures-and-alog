package fundamentals.abstraction.abs;

public class Cash extends PAYMENT{
    Cash(int id,float amount,String name){

        super(id,amount,name);
    }
    @Override
    boolean pay() {
        System.out.println("Payment of "+super.get_amount()+" done through cash...:-)");
        return true;
    }
}
