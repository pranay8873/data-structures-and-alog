package fundamentals.abstraction.anonymous;

public class Hello_World_Class implements Hello_World{
    @Override
    public void welcome() {
        System.out.println("Welcome from hello world class..:-)");
    }

    @Override
    public void welcome(String name) {
        System.out.println("Welcome "+name+" From hello world class");
    }
}
