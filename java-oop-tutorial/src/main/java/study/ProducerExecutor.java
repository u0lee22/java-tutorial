package study;

import study.ad.*;
import study.ad.producer.Producer;
import study.ad.provider.NewsPaper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProducerExecutor {

    private Map<AdType, Producer> producerMap;

    public ProducerExecutor() {
        producerMap = new HashMap<>();
        producerMap.put(AdType.PAPER, new NewsPaper());
        producerMap.put(AdType.ANIMATION, new NewsPaper());
        producerMap.put(AdType.MOVIE, new NewsPaper());
        producerMap.put(AdType.BANNER, new NewsPaper());
    }

    public void execute(Scanner sc) {
        System.out.println("광고 유형을 선택해 주세요");
        boolean isContinued = true;
        while (isContinued) {
            try {
                System.out.println("1.지면 광고 2.배너 광고 3. 애니메이션 광고 4. 영화 광고");
                producerMap.get(AdType.getBySeq(sc.nextInt())).produce();
                isContinued = false;
            } catch (Exception e) {
                e.printStackTrace();
                sc = new Scanner(System.in);
                System.out.println("잘못 선택 하셨습니다. 다시 선택해 주세요.");
            }
        }
    }
}
