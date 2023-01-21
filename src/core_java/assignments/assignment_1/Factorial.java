package core_java.assignments.assignment_1;

import java.util.Scanner;

public class Factorial {
    private static int factorial = 1;
    public static void main(String[] args) {

       System.out.println(getFactorial());
    }

    public static String getFactorial(){
        int number = -1;
        String result = "";
        try{
            while (number<0){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, introduce a positive integer.");
                number = scanner.nextInt();
            }
            if(number == 0){
                factorial = 1;
                result = "El factorial de " + number + " es: " + factorial;
            }else{
                for(int i=1; i<=number; i++){
                    factorial *= i;
                    result = "El factorial de " + number + " es: " + factorial;
                }
            }
        } catch (Exception e){
            System.out.println("This system only allows positive integers.");
        }
        return result;
    }
}
