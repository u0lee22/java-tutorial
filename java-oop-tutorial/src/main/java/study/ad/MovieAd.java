package study.ad;

import study.ad.utils.FileManager;

import java.io.File;
import java.util.List;

public class MovieAd extends Ad {

    public MovieAd() {
        super();
    }

    public MovieAd(String adType, String title, String manager, String content) {
        super(adType, title, manager, content);
    }

    @Override
    public String createAd() {
        FileManager fileManager = new FileManager();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("광고 분류 : " + getAdType() + "\n");
        stringBuffer.append("광고 제목 : " + getTitle() + "\n");
        stringBuffer.append("광고 담당자 : " + getManager() + "\n");
        stringBuffer.append("광고 소재 : " + getContent() + "\n");
        return fileManager.saveFile(getAdType(), getTitle(), stringBuffer);
    }

//    @Override
//    public List<File> getAd(String directory) {
//        FileManager fileManager = new FileManager();
//        for (File file : fileManager.getFile(directory)) {
//            System.out.println(file.getName().toString());
//        }
//        return fileManager.getFile(directory);
//    }
}
