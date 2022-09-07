package Collection.Framework.Assessment;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Question_5 {
    public static boolean greaterKeyExist(int GivenKey,TreeMap<Integer,Integer> map){
        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()){
            int val = itr.next();
            if(val>GivenKey){
                System.out.println("DEBUGGING console: "+val+" is greater than "+GivenKey);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        map.put(-1,-1);
        map.put(-2,-2);
        map.put(-3,-3);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(0,0);

        System.out.println("Any Key greater than 4 "+greaterKeyExist(4,map));
        System.out.println(" ");
        System.out.println("Any Key greater than 1 "+greaterKeyExist(1,map));

    }
}
