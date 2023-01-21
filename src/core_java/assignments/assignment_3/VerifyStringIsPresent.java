package core_java.assignments.assignment_3;

public class VerifyStringIsPresent {
    public static void main(String[] args) {
        String text = "A brown fox ran away fast.";
        String expectedText = "brown";

        System.out.println(verifyString(text, expectedText, true));
    }

    private static String verifyString(String text, String expectedText, boolean isCaseSensitive){
        int wordCounter;
        boolean isPresent = false;
        String newText = isCaseSensitive? text : text.toLowerCase();
        String newExpectedText = isCaseSensitive? expectedText : expectedText.toLowerCase();
        for(int i=0; i<newText.length(); i++){
            wordCounter = 0;
            if(newText.charAt(i) == newExpectedText.charAt(wordCounter)){
                if(newExpectedText.length()!=1){
                    if(i != (newText.length()-1)){
                        for(int j=i+1; wordCounter<(newExpectedText.length()-1); j++){
                            wordCounter++;
                            if(newText.charAt(j) == newExpectedText.charAt(wordCounter)){
                                isPresent = wordCounter == (newExpectedText.length()-1)? true : false;
                            }else{
                                break;
                            }
                        }
                    }
                } else{
                    isPresent = true;
                }

            }
        }
        return isPresent? "The text " + expectedText + " is present in the given data." :
                "The text " + expectedText + " is not present in the given data.";
    }
}
