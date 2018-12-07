package texteditor.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Parser {
    private static StringTokenizer stk;

    public static Object[] parse(String answer) {
        List list = new ArrayList();
        stk = new StringTokenizer(answer);

        while (stk.hasMoreElements()) {
            String nextToken = stk.nextToken();
            if (!isNumeric(nextToken)) {
                list.add(nextToken);
                continue;
            }
            list.add(Integer.parseInt(nextToken));
        }
        return list.toArray();
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
