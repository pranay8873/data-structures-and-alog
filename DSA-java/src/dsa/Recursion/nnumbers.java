package dsa.Recursion;

public class nnumbers {
    int count=0;
    void print(int a){
        if(count==a)
            return ;
        System.out.println(count);
        count++;
        print(a);

    }

    void main() {
        print(10);
    }
}
