package texteditor.domain;

import java.util.ArrayList;
import java.util.List;

public class Cursor {
    private static List<StringBuilder> rows = new ArrayList<>();

    public static void create(String data) {
        rows.add(new StringBuilder(data));
    }

    public static String read(int row) {
        return rows.get(row).toString();
    }

    public static String read(int row, int colStart) {
        return rows.get(row).substring(colStart);
    }

    public static String read(int row, int colStart, int colEnd) {
        // colEnd index char ignored
        return rows.get(row).substring(colStart, colEnd);
    }

    public static void update(int row, String value) {
        rows.set(row, new StringBuilder(value));
    }

    public static void update(int row, int colStart, String value) {
        int colLength = rows.get(row).length();
        rows.get(row).replace(colStart, colLength, value);
    }

    public static void update(int row, int colStart, int colEnd, String value) {
        // colEnd index char ignored
        rows.set(row, rows.get(row).replace(colStart, colEnd, value));
    }

    public static String delete(int row) {
        return rows.remove(row).toString();
    }

    public static String delete(int row, int colStart) {
        int colLength = rows.get(row).length();
        return rows.get(row).delete(colStart, colLength).toString();
    }

    public static String delete(int row, int colStart, int colEnd) {
        // colEnd index char ignored
        return rows.get(row).delete(colStart, colEnd).toString();
    }

    public static void readAll() {
        for (int i = 0; i < rows.size(); i++) {
            System.out.println(i + "  " + rows.get(i).toString());
        }
    }
}
