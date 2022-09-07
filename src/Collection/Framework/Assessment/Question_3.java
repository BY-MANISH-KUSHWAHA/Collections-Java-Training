package Collection.Framework.Assessment;

import java.util.ArrayList;
import java.util.HashSet;

public class Question_3 {
    public static ArrayList<String> readInput(){
        //Scanner scan = new Scanner(System.in);
        String consoleInput = "5 john tom john mary john tom mary anna mary anna";//scan.nextLine();
        //scan.close();

        // Array of String Integer
        String[] arr = consoleInput.split(" ");

        // Back to integer
        ArrayList<String> pairs = new ArrayList<String>();
        int index = 1;
        for(int i=0; i<Integer.parseInt(arr[0]);i++){
            pairs.add(arr[index]+"-"+arr[index+1]);
            index=index+2;
        }
        return pairs;
    }
    public static ArrayList<Integer> output(ArrayList<String > pairs){
        ArrayList<Integer> out = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String pair: pairs){
            set.add(pair);
            out.add(set.size());
        }
        return out;
    }
    public static void main(String[] args) {
        ArrayList<String> input_pairs = readInput();
        System.out.println("Input-Pairs: "+input_pairs);
        ArrayList<Integer> output = output(input_pairs);
        System.out.println("Output: "+output);
    }
}
