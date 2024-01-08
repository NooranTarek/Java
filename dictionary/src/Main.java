import java.util.*;

public class Main {
    public static void main(String[] args) {
        DictionaryForEnglishCharacters dictionary = new DictionaryForEnglishCharacters();
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter words separated by spaces: ");
        String inputLine = scanner.nextLine();
        List<String> wordsToAdd = Arrays.asList(inputLine.split("\\s"));

        dictionary.insertWords(wordsToAdd);
        dictionary.printDictionary();

        System.out.print("please enter a word to delete: ");
        String wordToDelete = scanner.nextLine();
        dictionary.removeWord(wordToDelete);
        dictionary.printDictionary();



        System.out.print("please enter a letter to remove all words for that letter: ");
        String userInput1 = scanner.next();
        char letterToRemove = userInput1.charAt(0);
        dictionary.removeWordsForKey(letterToRemove);
        dictionary.printDictionary();


        System.out.print("please enter a string to search for matching words: ");
        String searchString = scanner.next();
        dictionary.searchWords(searchString);

        System.out.print("please enter a letter to display words for that letter: ");
        String userInput2 = scanner.next();
        char selectedLetter = userInput2.charAt(0);
        dictionary.printWordsForLetter(dictionary, selectedLetter);


    }
}
