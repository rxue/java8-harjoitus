package rx.practice.advanced.generictype;

import java.util.ArrayList;
import java.util.List;

public class DownCastDemo {
    public static void main(String[] args) {
        List<CharSequence> charSeqList = new ArrayList<>();
        charSeqList.add("hello");
        Object o = charSeqList;
        List<String> stringList = (List<String>) o;
        System.out.println(stringList.get(0));
    }
}
