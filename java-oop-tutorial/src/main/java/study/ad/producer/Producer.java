package study.ad.producer;

import study.ad.Ad;
import study.ad.AdType;

public interface Producer<T extends Ad> {

    T produce(AdType adType);
}
