import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
        public static String stringReverser() {
            String sampleString = "this is a string.";
            char[] oldString = sampleString.toCharArray();
            StringBuilder reversedString = new StringBuilder();

            for (int x = sampleString.length() - 1; x >= 0; x--) {
                reversedString.append(oldString[x]);
            }

            return reversedString.toString();
        }

        public static void main(String[] args) {
            String reversed = stringReverser();
            System.out.println(reversed);
        }
    }
    