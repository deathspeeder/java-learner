package org.nowhere.collections;

/**
 * Created by junwang on 16-5-9.
 */
public class SortIntegers {
    public static String parseAndSortIntegers(String source) {
        // TODO implement this
        return source;
    }

    public static void main(String[] args) {
        String testA = "1 10 9 4 5 2 7 3 6 8";
        String expectedA = "1 2 3 4 5 6 7 8 9 10";
        String testB = "10  90   100 80 21  -1 32      1000";
        String expectedB = "-1 10 21 32 80 90 100 1000";
        String testC = " ";
        String expectedC = "";
        String testD = "0 2 3 0 1 4 0 5 6 0";
        String expectedD = "0 0 0 0 1 2 3 4 5 6";

        String[] tests = {testA, testB, testC, testD};
        String[] expects = {expectedA, expectedB, expectedC, expectedD};

        for (int i = 0; i < tests.length; i++) {
            String actual = parseAndSortIntegers(tests[i]);
            if (!expects[i].equals(actual)) {
                System.out.println("Expected \"" + expects[i] + "\", actual \"" + actual + "\"");
            }
        }
    }
}
