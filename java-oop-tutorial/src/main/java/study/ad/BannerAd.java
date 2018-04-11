package study.ad;

import java.io.File;
import java.util.List;

public class BannerAd extends Ad {

    public BannerAd(String adType, String title, String manager, String content) {
        super(adType, title, manager, content);
    }

    @Override
    public String createAd() {
        return null;
    }


}
