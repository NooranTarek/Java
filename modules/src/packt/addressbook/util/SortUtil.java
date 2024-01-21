package packt.addressbook.util;

import java.util.Collections;
import java.util.List;

public class SortUtil {
    public static <T extends Comparable<? super T>> List<T> sortList(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
