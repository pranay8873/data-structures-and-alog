package dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Max_occuring {
    int method(int[] arr){
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int x:arr){
            mpp.put(x,mpp.getOrDefault(x,0)+1);
        }
        int maxfreq=0;
//        int answer=0;
        for(int x: mpp.keySet()){
            if(mpp.get(x)>maxfreq){
                maxfreq=mpp.get(x);
            }
        }
        int answer=Integer.MAX_VALUE;
        for(int x: mpp.keySet()){
            if(mpp.get(x)==maxfreq){
                answer=Math.min(answer,x);
            }

        }
        return answer;

    }

    void main() {
        int[] arr={1,2,3,3,3,4,4,5};
        System.out.println(method(arr));

    }

}
