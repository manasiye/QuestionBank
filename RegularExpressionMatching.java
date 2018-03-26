import java.io.*;
import java.util.*;

public class RegularExpressionMatching {

    public static boolean isMatch(String text, String pattern) {
        char[] txt = text.toCharArray();
        char[] pat = pattern.toCharArray();
        boolean[][] result = new boolean[txt.length + 1][pat.length + 1];

        result[0][0] = true;

        //
        for (int i = 1; i < result[0].length; i++) {
            if (pat[i - 1] == '*')
                result[0][i] = result[0][i - 2];
        }

        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[0].length; j++) {
                if (pat[j - 1] == '.' || pat[j - 1] == txt[j - 1]) {
                    result[i][j] = result[i - 1][j - 1];
                } else if (pat[j - 1] == '*') {
                    result[i][j] = result[i][j - 2];
                    if (pat[j - 1] == '.' || pat[j - 1] == txt[j - 1]) {
                        result[i][j] = result[i][j] | result[i - 1][j];
                    }
                } else {
                    result[i][j] = false;
                }
            }
        }
        return result[txt.length][pat.length];
    }

    public static void main(String[] args) {
        String text = "Manasi";
        String pattern = ".*";
        System.out.println(isMatch(text, pattern));
    }
}