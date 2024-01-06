public class Containsalphabets {
    boolean containsOnlyAlphabets(String input) {
        char[] characters = input.toCharArray();
        for (char character : characters) {
            if (!Character.isLetter(character)) {
                return false;
            }
        }
        return true;
}}
