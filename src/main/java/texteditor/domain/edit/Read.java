package texteditor.domain.edit;

import texteditor.domain.Cursor;
import texteditor.utils.Parser;

public class Read implements Selection {

    @Override
    public void edit(String answer) {
        Object[] parsedAnswer = Parser.parse(answer);
        int answerSize = (parsedAnswer).length;

        String line = null;
        switch(answerSize) {
            case 1:
                line = Cursor.read((int)parsedAnswer[0]);
                break;
            case 2:
                line = Cursor.read((int)parsedAnswer[0], (int)parsedAnswer[1]);
                break;
            case 3:
                line = Cursor.read((int)parsedAnswer[0], (int)parsedAnswer[1], (int)parsedAnswer[2]);
                break;
        }
        System.out.println(line);
    }
}
