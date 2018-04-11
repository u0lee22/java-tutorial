package study.ad;


import java.io.File;
import java.util.List;

public class PaperAd extends Ad {
    public PaperAd(String adType, String title, String manager, String content) {
        super(adType, title, manager, content);
    }

    @Override
    public String createAd() {
        return null;
    }


}
