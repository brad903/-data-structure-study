package texteditor;

import texteditor.domain.Cursor;
import texteditor.domain.edit.*;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private int selectNum;
    private String answer;
    private static Map<Integer, Selection> workflow = new HashMap<>();

    static {
        workflow.put(1, new Create());
        workflow.put(2, new Read());
        workflow.put(3, new Update());
        workflow.put(4, new Delete());
    }

    public Controller(int selectNum, String answer) {
        this.selectNum = selectNum;
        this.answer = answer;
    }

    public void basicWork() {
        Selection selection = workflow.get(selectNum);
        selection.edit(answer);
    }

    public static void extraWork(int selection) {
        if(selection == 5) {
            Cursor.readAll();
        }
    }
}
