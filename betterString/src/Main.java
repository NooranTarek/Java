public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "and welcome from java world";

        String longer = StringsComparing.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("better string is the longer : " + longer);

        String first = StringsComparing.betterString(str1, str2, (s1, s2) -> true);
        System.out.println("better string is the first one : " + first);
    }
}
