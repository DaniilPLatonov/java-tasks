package JetBrains_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ViewString viewString = new ViewString(str);
        viewString.getAnswer();
    }
}

class ViewString {
    private String stringView;
    private final char[] subsequence = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public ViewString(String stringView) {
        this.stringView = stringView;
    }

    public void getAnswer() {
        int minLength = 10;
        for (int i = 0; i < stringView.length(); i++) {
            String strLength;
            if (i + minLength <= stringView.length()) {
                strLength = stringView.substring(i, i + minLength);
            } else {
                strLength = null;
            }

            if (strLength != null) {
                if (stringValidation(strLength)) {
                    System.out.println("YES");
                    return;
                }
            }

        }
        System.out.println("NO");
    }

    private boolean stringValidation(String strLength) {
        int amountOfOtherCharacter = 0;
        Map<Character, Integer> numberOfEachCharacter = new HashMap<>();
        for (Character character : strLength.toCharArray()) {
            if (!numberOfEachCharacter.containsKey(character)) {
                numberOfEachCharacter.put(character, 1);
            } else {
                numberOfEachCharacter.put(character, numberOfEachCharacter.get(character) + 1);
            }
        }
        if(!checkCharacter(numberOfEachCharacter)){
            return false;
        }

        for(Character character: subsequence){
            if(!numberOfEachCharacter.containsKey(character)){
                amountOfOtherCharacter++;
            }
        }

        if( amountOfOtherCharacter == numberOfEachCharacter.get('?')
                && numberOfEachCharacter.get('?') != null ){
            return true;
        }
        return  amountOfOtherCharacter == 0;
    }

    private boolean checkCharacter(Map <Character,Integer> numberOfEachCharacter ){
        for (Character character : numberOfEachCharacter.keySet()) {
            if (character != '?' && numberOfEachCharacter.get(character) > 1) return false;
        }
        return true;
    }
}
