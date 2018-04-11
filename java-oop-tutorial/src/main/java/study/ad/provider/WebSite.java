package study.ad.provider;

import study.ad.AdType;
import study.ad.BannerAd;
import study.ad.producer.Producer;

import java.util.List;

public class WebSite implements Provider<BannerAd>, Producer<BannerAd> {

    @Override
    public BannerAd produce(AdType adType) {
        return null;
    }

    @Override
    public BannerAd selectAd(String adName) {
        return null;
    }

    @Override
    public List<String> getAdLists() {
        return null;
    }

    @Override
    public void createAd() {

    }
}
