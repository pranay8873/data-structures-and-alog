package fundamentals.abstraction;

public class Encapsulation {
    class student{
        private int age;
        public void setage(int age){
            if(age>0){
                this.age=age;
            }
        }
        public int getage(){
            return this.age;
        }

    }

    void main() {
        student s1=new student();
        s1.setage(20);
        System.out.println(s1.getage());
    }
}
