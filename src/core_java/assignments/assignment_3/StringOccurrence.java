package core_java.assignments.assignment_3;

import java.util.Locale;

public class StringOccurrence {
    public static void main(String[] args) {
        System.out.println(getOccurrence("You should always test your software."));
    }

    public static String getOccurrence(String text){
        String newText = text.replaceAll(" ", "").toLowerCase();
        String result = "";
            while (newText.length()>0){
                int firstElement = 0;
                int counter = 1;
                if(newText.length()>1){
                    for(int i=1; i<newText.length(); i++){
                        if(newText.charAt(firstElement)==newText.charAt(i)){
                            counter++;
                        }
                    }
                }
                result += newText.charAt(firstElement) + "" + counter + " ";
                newText = newText.replaceAll(newText.charAt(firstElement)+"", "");
            }
        return result;
    }
}
