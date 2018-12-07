package texteditor;

import texteditor.domain.Cursor;
import texteditor.view.InputView;

public class Main {
    public static void main(String[] args) {
        while(true) {
            InputView.showMenu();
            try {
                int selection = InputView.getSelection();
                if(selection <= 4) {
                    String userAnswer = InputView.showGuide(selection);
                    Controller controller = new Controller(selection, userAnswer);
                    controller.basicWork();
                } else {
                    if(selection == 5) Cursor.readAll();
                    else if(selection == 6) break;
                }
            } catch(Exception e) {
                System.out.println("오류가 발생하였습니다. 다시 시작합니다!!");
            }
        }
    }
}
