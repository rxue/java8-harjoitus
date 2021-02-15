package rx.practice.advanced.benchmarking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Comparator {
    private static String random() {
        char[] chars = new char[26*2];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('A' + i);
            chars[i+26] = (char) ('a' + i);
        }

        int randomSize = ThreadLocalRandom.current().nextInt(2, 15);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < randomSize; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(0, 26*2);
            stringBuilder.append(chars[randomIndex]);
        }
        return stringBuilder.toString();
    }
    private static List<String> populations(int size) {
        List<String> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++)
            randomList.add(random());
        return randomList;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            List<String> populations = populations(1000);
            ParseDouble originalParseDoubleBenchMarker = new ParseDouble(populations);
            NumberUtilsParser numberUtilsParser = new NumberUtilsParser(populations);
            System.out.println("Double.parseDouble: " + originalParseDoubleBenchMarker.total());
            System.out.println("NumberUtils.isCreatable: " + numberUtilsParser.total());
        }
    }
}
