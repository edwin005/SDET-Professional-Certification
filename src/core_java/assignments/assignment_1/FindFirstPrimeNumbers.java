package core_java.assignments.assignment_1;

public class FindFirstPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(getFirstPrimeNumbers(100));
    }

    public static String getFirstPrimeNumbers(int n){
        String primes = "The first " + n + " prime numbers are: ";
        int primeCounter=0;
        int i=2;
        while (primeCounter<n){
            if(i%2!=0 || i==2){
                primes += i +" ";
                primeCounter++;
            }
            i++;
        }
        return primes;
    }
}
