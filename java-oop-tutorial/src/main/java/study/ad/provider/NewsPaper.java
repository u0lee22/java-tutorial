package study.ad.provider;

import study.ad.AdType;
import study.ad.PaperAd;
import study.ad.producer.Producer;

import java.util.List;

public class NewsPaper implements Provider<PaperAd>, Producer<PaperAd> {


    @Override
    public PaperAd produce(AdType adType) {
        return null;
    }

    @Override
    public void selectAd(String adName) {
    }

    @Override
    public List<String> getAdLists() {
        return null;
    }

    @Override
    public void createAd() {

    }
}
