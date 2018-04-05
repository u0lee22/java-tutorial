package study;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isContinued = true;
        System.out.println("원하시는 메뉴를 선택해 주세요");
        while (isContinued) {
            System.out.println("1.광고 제작  2.종료");
            try {
                switch (sc.nextInt()) {
                    case 1:
                        new ProducerExecutor().execute(sc);
                        break;
                    default:
                        isContinued = false;
                        break;
                }
            } catch (Exception e) {
                // scanner 버그
                sc = new Scanner(System.in);
                System.out.println("잘못 입력 하셨습니다. 원하시는 메뉴를 선택해 주세요");
            }
        }
    }
}
