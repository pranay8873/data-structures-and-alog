package fundamentals.abstraction.anonymous;

public class m {
    static void main() {
        Hello_World_Class HW=new Hello_World_Class();
        HW.welcome();
        HW.welcome("Pranay ");
        Hello_World hello=new Hello_World() {
            @Override
            public void welcome() {
                System.out.println("Welcome from anonymous inner class...:-)");
            }

            @Override
            public void welcome(String name) {
                System.out.println("Welcome "+name+" from anonymous inner class....");

            }
        };
        hello.welcome();
        hello.welcome("Pranay");
        Addition sum=(a,b)->a+b;
        System.out.println("Functional Interface : "+sum.add(10,20));

    }
}
