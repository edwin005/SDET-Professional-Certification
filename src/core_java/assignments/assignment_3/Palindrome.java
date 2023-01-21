package core_java.assignments.assignment_3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Is a palindrome? " + isPalindrome("tattarrattat"));
    }

    public static boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        String newText = text.replaceAll(" ", "").toLowerCase();
        int middleIndex;
        int length = newText.length();
        if (newText.length() > 1) {
            middleIndex = length % 2 == 0 ? length / 2 : (length - 1) / 2;
            for (int i = 0; i < middleIndex; i++) {
                if (newText.charAt(i) == newText.charAt(newText.length() - (i + 1))) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }}
