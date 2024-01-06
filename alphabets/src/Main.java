//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "NOURAN";
        String str2 = "NOURAN1234";
        String str3 = "$%@nouran";
        Containsalphabets onlyAlphabets=new Containsalphabets();
        System.out.println(str1+" contains only alphabets? -->" + onlyAlphabets.containsOnlyAlphabets(str1));
        System.out.println(str2+" contains only alphabets? -->" + onlyAlphabets.containsOnlyAlphabets(str2));
        System.out.println(str3+" contains only alphabets? -->" + onlyAlphabets.containsOnlyAlphabets(str3));

    }
}