package texteditor.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputView {
    public static final String newLine = System.lineSeparator();
    private static Scanner scan = new Scanner(System.in);
    private static Map<Integer, String> guide = new HashMap<>();

    static {
        guide.put(1, "한줄씩 입력해주세요!");
        guide.put(2, "형식 : 읽을_줄번호 (시작col) (끝col)");
        guide.put(3, "형식 : 수정할_줄번호 (시작col) (끝col) 바꾸고_싶은_값");
        guide.put(4, "형식 : 삭제할_줄번호 (시작col) (끝col)");
    }

    public static void showMenu() {
        System.out.println("---------------------");
        System.out.println("1. 입력");
        System.out.println("2. 읽기");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 전체 읽기");
        System.out.println("6. 종료");
        System.out.println("---------------------");
    }


    public static int getSelection() {
        System.out.println("메뉴 중 하나를 선택해주세요!");
        return Integer.parseInt(scan.nextLine());
    }

    public static String showGuide(int selection) {
        System.out.println("-- 다음과 가이드에 맞춰입력해주세요 --");
        System.out.println(guide.get(selection));
        return scan.nextLine();
    }
}
