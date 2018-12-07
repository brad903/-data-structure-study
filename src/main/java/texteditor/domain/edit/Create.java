package texteditor.domain.edit;

import texteditor.domain.Cursor;

public class Create implements Selection {

    @Override
    public void edit(String parsedAnswer) {
        Cursor.create(parsedAnswer);
        System.out.println("[저장 되었습니다]");
        Cursor.readAll();
    }
}
