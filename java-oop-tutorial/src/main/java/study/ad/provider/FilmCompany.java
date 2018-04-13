package study.ad.provider;

import study.ad.AdType;
import study.ad.MovieAd;
import study.ad.producer.Producer;
import study.ad.utils.FileManager;

import java.util.List;
import java.util.Scanner;

public class FilmCompany implements Provider<MovieAd>, Producer<MovieAd> {
    Scanner sc = new Scanner(System.in);

    String adType = null;

    @Override
    public MovieAd produce(AdType adType) {
        this.adType = adType.toString();
        System.out.println("[영화 광고]");
        boolean isContinued = true;
        while (isContinued) {
            try {
                System.out.println("1.생성 2.조회");
                switch (sc.nextInt()) {
                    case 1:
                        createAd();
                        break;
                    case 2:
                        List<String> adLists = getAdLists();
                        System.out.println("조회할 광고를 선택하세요. (종료 시 0을 입력.)");
                        for (String ad : adLists) {
                            System.out.println((adLists.indexOf(ad) + 1) + ". " + ad);
                        }
                        int selectedAdName = sc.nextInt();
                        if (selectedAdName > 0 && selectedAdName < adLists.size() + 1) {
                            selectAd(adLists.get(selectedAdName));
                            break;
                        }
                        System.out.println("광고 조회를 종료합니다.");
                        break;
                    default:
                        isContinued = false;
                        break;
                }
                isContinued = false;
            } catch (Exception e) {
                e.printStackTrace();
                sc = new Scanner(System.in);
                System.out.println("잘못 선택 하셨습니다. 다시 선택해 주세요.");
            }
        }
        return null;
    }

    @Override
    public void selectAd(String adName) {
        FileManager fileManager = new FileManager();
        fileManager.getFileContent(adType,adName);
    }

    @Override
    public List<String> getAdLists() {
        FileManager fileManager = new FileManager();
        return fileManager.getFileNames(adType);
    }

    @Override
    public void createAd() {
        System.out.println("제목을 입력하세요.");
        String title = sc.nextLine();
        System.out.println("광고 담당자를 입력하세요.");
        String managerName = sc.nextLine();
        System.out.println("광고 소재를 입력하세요.");
        String content = sc.nextLine();

        MovieAd movieAd = new MovieAd(adType, title, managerName, content);
        String createAdResult = movieAd.createAd();

        if (createAdResult == null) {
            System.out.println("영화 광고 " + title + " 생성 실패\n관리자에게 문의하세요.");
        } else {
            System.out.println("영화 광고 " + title + " 생성 완료 (" + createAdResult + ")");
        }
    }
}
