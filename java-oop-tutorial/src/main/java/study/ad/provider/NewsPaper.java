package study.ad.provider;

import study.ad.PaperAd;
import study.ad.producer.Producer;

public class NewsPaper implements Provider<PaperAd>, Producer<PaperAd> {

    @Override
    public PaperAd selectAd() {
        return null;
    }

    @Override
    public PaperAd produce() {
        return null;
    }
}
