package dsa;

public class Main {
    boolean pal(String num,int i){
        int len=num.length();
        if(i==len/2)
            return true;
        if(num.charAt(i)!=num.charAt(len-i-1))
            return false;
        return pal(num,i+1);
    }
    public int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) {
                min = prices[i];
                index = i;
            }
        }
        int j=min;
        while(index<prices.length){
            if (min<prices[index])
                return prices[index]-min;
            index++;
        }
        return 0;
    }
    void main() {
        int[] numbers=new int[101];
        int j=0;
        int count=0;
        for(int i=100;i<=200;i++){
            numbers[j]+=i;
            j++;


        }
        for (int i=0;i<100;i++){
            String number=new StringBuilder(numbers[i]).toString();
            if(pal(number,0))
                count++;
        }
//        String str=String.valueOf(numbers[100]);
        System.out.println("number of palindrome numbers between 100 and 200 are : "+count);
//        for(int i=0;i<numbers.length;i++){
//
//
//        }
        int[] numb={1,23,10,40};
        System.out.println("Profit is : "+maxProfit(numb));
    }
}
