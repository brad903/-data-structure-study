package texteditor;

import java.util.ArrayList;
import java.util.List;

public class Cursor {
    private List<StringBuilder> rows = new ArrayList<>();

    public void create(String data) {
        rows.add(new StringBuilder(data));
    }

    public String read(int row) {
        return rows.get(row).toString();
    }

    public String read(int row, int colStart) {
        return rows.get(row).substring(colStart);
    }

    public String read(int row, int colStart, int colEnd) {
        // colEnd index char ignored
        return rows.get(row).substring(colStart, colEnd);
    }

    public void update(int row, String value) {
        rows.set(row, new StringBuilder(value));
    }

    public void update(int row, int colStart, String value) {
        int colLength = rows.get(row).length();
        rows.get(row).replace(colStart, colLength, value);
    }

    public void update(int row, int colStart, int colEnd, String value) {
        // colEnd index char ignored
        rows.get(row).replace(colStart, colEnd, value);
    }

    public String delete(int row) {
        return rows.remove(row).toString();
    }

    public String delete(int row, int colStart) {
        int colLength = rows.get(row).length();
        return rows.get(row).delete(colStart, colLength).toString();
    }

    public String delete(int row, int colStart, int colEnd) {
        // colEnd index char ignored
        return rows.get(row).delete(colStart, colEnd).toString();
    }
}
