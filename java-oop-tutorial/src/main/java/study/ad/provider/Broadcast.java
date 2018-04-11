package study.ad.provider;

import study.ad.AdType;
import study.ad.AnimationAd;
import study.ad.producer.Producer;

import java.util.List;

public class Broadcast implements Provider<AnimationAd>, Producer<AnimationAd> {


    @Override
    public AnimationAd produce(AdType adType) {
        return null;
    }

    @Override
    public AnimationAd selectAd(String adName) {
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
