package study.ad.producer;

import study.ad.Ad;

public interface Producer<T extends Ad> {

    T produce();
}
