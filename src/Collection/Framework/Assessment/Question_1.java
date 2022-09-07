package Collection.Framework.Assessment;
import java.util.*;
//Q1: Write a program to see whether an element exists in the
//    third position and if it is  replace the
//    third position of a ArrayList with the newly
//    specified element ?
public class Question_1 {
    public static boolean Check3rdReplace(ArrayList<Integer> array,int Value){
        if(array.size()<3)  return false;
        array.set(2,Value);
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("");
        // Less than 3 element
        arr.add(0); arr.add(1);
        System.out.println("Array Before operation: "+arr);
        System.out.println("Function able to Replace 3rd one: "+Check3rdReplace(arr,2));
        System.out.println("Array After operation: "+arr);
        System.out.println("");

        // Greater than 3 elements
        arr.add(2); arr.add(3);
        System.out.println("Array Before operation: "+arr);
        System.out.println("Function able to Replace 3rd one: "+Check3rdReplace(arr,4));
        System.out.println("Array After operation: "+arr);

    }
}
