package fundamentals.abstraction.encapsulation.p1;

public class A {
    private int a=10;
    int b=100;
    public int d=50;

    static void main() {
        A a;
        a=new A();
        System.out.println(a.a);
    }
}
