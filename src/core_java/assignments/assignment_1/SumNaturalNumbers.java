package core_java.assignments.assignment_1;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(getFirstNaturalNumbers(20));
    }

    public static int getFirstNaturalNumbers(int n){
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
