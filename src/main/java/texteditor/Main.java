package texteditor;

import texteditor.domain.Controller;
import texteditor.view.InputView;

public class Main {
    public static void main(String[] args) {
        while(true) {
            InputView.showMenu();
            try {
                int selection = InputView.getSelection();
                String userAnswer = InputView.showGuide(selection);
                Controller controller = new Controller(selection, userAnswer);
                controller.work();
            } catch(Exception e) {
                System.out.println("오류가 발생하였습니다. 다시 시작합니다!!");
                main(args);
            }

        }
    }
}
