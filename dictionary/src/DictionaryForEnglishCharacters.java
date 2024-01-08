import java.util.*;

public class DictionaryForEnglishCharacters {
    Map<Character, Set<String>> dictionaryWords;

    public DictionaryForEnglishCharacters() {
        dictionaryWords = new TreeMap<>();
        initializeKeys();
    }

    void initializeKeys() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            dictionaryWords.put(letter, new TreeSet<>());
        }
    }

    void insertWords(List<String> words) {
        for (String word : words) {
            insertWord(word);
        }
    }

    void insertWord(String word) {
        if (word != null && !word.isEmpty()) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            Set<String> keySet = dictionaryWords.get(firstLetter);
            if (keySet.contains(word)) {
                System.out.println("word '" + word + "' already exists for key '" + firstLetter + "'");
            } else {
                keySet.add(word);
                System.out.println("word '" + word + "' inserted successfully for key '" + firstLetter + "'");
            }
        }
    }

    void removeWord(String word) {
        if (!word.isEmpty()) {
            Set<String> valueSet = dictionaryWords.get(word.charAt(0));
            if (valueSet != null && valueSet.contains(word)) {
                valueSet.remove(word);
                System.out.println("'" + word + "' removed from the dictionary.");
            } else {
                System.out.println("'" + word + "' not found in the dictionary.");
            }
        } else {
            System.out.println("invalid word");
        }
    }
    void removeWordsForKey(char letter) {
            Set<String> valueSet = dictionaryWords.get(Character.toLowerCase(letter));
            if (!valueSet.isEmpty()) {
                valueSet.clear();
                System.out.println("all words for letter '" + letter + "' removed from the dictionary.");
            } else {
                System.out.println("no words found for letter '" + letter + "'");
            }
        }

    void searchWords(String searchString) {
        searchString = searchString.toLowerCase();
        boolean flag = true;
        System.out.println("matching words are :");
        for (Map.Entry<Character, Set<String>> entry : dictionaryWords.entrySet()) {
            char key = entry.getKey();
            Set<String> words = entry.getValue();
            for (String word : words) {
                if (word.toLowerCase().contains(searchString)) {
                    System.out.println(key + ": " + word);
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("no matching words found.");
        }
    }



    void printDictionary() {
        System.out.println("Dictionary:");
        for (Map.Entry<Character, Set<String>> entry : dictionaryWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    void printWordsForLetter(DictionaryForEnglishCharacters dictionary, char letter) {
        Set<String> wordsForLetter = dictionary.dictionaryWords.get(letter);
        if (!wordsForLetter.isEmpty()) {
            System.out.println("words for letter '" + letter + "': " + wordsForLetter);
        } else {
            System.out.println("no words found for letter '" + letter + "'");
        }
    }}