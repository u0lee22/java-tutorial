package study.ad.provider;

import study.ad.Ad;

public interface Provider<T extends Ad> {

    T selectAd();

    default void post() {
        System.out.println(this.selectAd().getContent());
    }
}
