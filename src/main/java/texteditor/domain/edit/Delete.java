package texteditor.domain.edit;

import texteditor.domain.Cursor;
import texteditor.utils.Parser;

public class Delete implements Selection {
    @Override
    public void edit(String answer) {
        Object[] parsedAnswer = Parser.parse(answer);
        int answerSize = (parsedAnswer).length;

        switch (answerSize) {
            case 1:
                Cursor.delete((int) parsedAnswer[0]);
                break;
            case 2:
                Cursor.delete((int) parsedAnswer[0], (int) parsedAnswer[1]);
                break;
            case 3:
                Cursor.delete((int) parsedAnswer[0], (int) parsedAnswer[1], (int) parsedAnswer[2]);
                break;
        }
        System.out.println("[삭제 되었습니다]");
        Cursor.readAll();
    }
}
