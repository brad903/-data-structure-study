package texteditor;

import texteditor.domain.Controller;
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
                    Controller.extraWork(selection);
                }
            } catch(Exception e) {
                System.out.println("오류가 발생하였습니다. 다시 시작합니다!!");
                main(args);
            }
        }
    }
}
