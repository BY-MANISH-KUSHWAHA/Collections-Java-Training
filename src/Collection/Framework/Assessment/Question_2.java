package Collection.Framework.Assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_2 {
    static int QueryIndex;
    public static ArrayList<Integer> readInput(){
        //Scanner scan = new Scanner(System.in);
        String consoleInput = "5 5 41 77 74 22 44 1 12 4 37 34 36 52 0 3 20 22 33 5 1 3 3 4 3 1 4 3 5 5";//scan.nextLine();
        //scan.close();

        // Array of String Integer
        String[] arr = consoleInput.split(" ");

        // Back to integer
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(String sint: arr){
            intArr.add(Integer.parseInt(sint));
        }
        return intArr;
    }

    public static ArrayList<ArrayList<Integer>> matrixGenerater(ArrayList<Integer> array){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        int index=1;
        for(int row=0; row<array.get(0) ; row++){
            int Upto = array.get(index);
            ArrayList<Integer> runner = new ArrayList<>();
            index++;
            for(int col=0; col<Upto;col++){
                runner.add(array.get(index));
                index++;
            }
            matrix.add(runner);
        }
        QueryIndex = index;
        return matrix;
    }

    public static ArrayList<String> Output(ArrayList<ArrayList<Integer>> matrix,ArrayList<Integer> array){
        int Index = QueryIndex;
        System.out.println("");
        System.out.println("---------- DBUG CONSOLE ----------------");
        ArrayList<String> output = new ArrayList<>();
        for(int query=0; query< array.get(QueryIndex) ; query++){
            Index++;
            int lineNumber = array.get(Index)-1;
            Index++;
            int arrayIndex = array.get(Index)-1;

            if(arrayIndex<matrix.get(lineNumber).size()){
                output.add(String.valueOf(matrix.get(lineNumber).get(arrayIndex)));
                System.out.println("Query Number: "+query+", Line Number: "+lineNumber+" , ArrayIndex: "+arrayIndex+" , Output: "+output.get(output.size()-1));
            }
            else{
                output.add("ERROE!");
                System.out.println("Query Number: "+query+", Line Number: "+lineNumber+" , ArrayIndex: "+arrayIndex+" , Output: ERROR!");
            }

        }
        System.out.println("----------------------------------------");
        System.out.println("");
        return output;
    }

    public static void main(String[] args) {
        // String: 5 5 41 77 74 22 44 1 12 4 37 34 36 52 0 3 20 22 33 5 1 3 3 4 3 1 4 3 5 5
        ArrayList<Integer> input_array = readInput();
        System.out.println("Input: "+input_array);
        ArrayList<ArrayList<Integer>> matrix = matrixGenerater(input_array);
        System.out.println("matrix: "+matrix);
        ArrayList<String> output = Output(matrix,input_array);
        System.out.println("Output: "+output);
    }
}
