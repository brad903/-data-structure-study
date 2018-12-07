package texteditor.domain.edit;

import texteditor.domain.Cursor;
import texteditor.utils.Parser;

public class Update implements Selection {
    @Override
    public void edit(String answer) {
        Object[] parsedAnswer = Parser.parse(answer);
        int answerSize = parsedAnswer.length;

        switch(answerSize) {
            case 2:
                Cursor.update((int)parsedAnswer[0], (String)parsedAnswer[1]);
                break;
            case 3:
                Cursor.update((int)parsedAnswer[0], (int)parsedAnswer[1], (String)parsedAnswer[2]);
                break;
            case 4:
                Cursor.update((int)parsedAnswer[0], (int)parsedAnswer[1], (int)parsedAnswer[2], (String)parsedAnswer[3]);
                break;
        }
        System.out.println("[업데이트 되었습니다]");
        Cursor.readAll();
    }
}
