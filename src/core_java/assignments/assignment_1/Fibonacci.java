package core_java.assignments.assignment_1;

import java.sql.Array;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int index=10;
        String result="";
        int [] series = new int[index];

        for(int i=0; i<index; i++){
            if(i<=1){
                series[i] = i;
            }else{
                series[i] = series[i-2] + series[i-1];
            }
            result += series[i] + " ";
        }
        System.out.println(result);
    }
}
