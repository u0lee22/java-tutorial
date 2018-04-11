package study.ad.provider;

import study.ad.Ad;

import java.util.List;

public interface Provider<T extends Ad> {

    T selectAd(String adName);

    List<String> getAdLists();

    void createAd();

    default void post() {}
}
