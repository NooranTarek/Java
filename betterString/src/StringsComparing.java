import java.util.function.BiPredicate;
public class StringsComparing {
    public static String betterString(String str1, String str2, BiPredicate<String, String> better) {
        return better.test(str1, str2) ? str1 : str2;
    }
}
