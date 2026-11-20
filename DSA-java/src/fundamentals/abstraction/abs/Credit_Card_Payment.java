package fundamentals.abstraction.abs;

public class Credit_Card_Payment extends PAYMENT {

    Credit_Card_Payment(int id, float amount, String name) {
        super(id, amount, name);
    }

    @Override
    boolean pay() {
        System.out.println("Payment of " + super.get_amount() + " done through Credit card...:-)");

        return true;
    }
}
