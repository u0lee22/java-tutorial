package study.ad.provider;

import study.ad.Ad;

import java.util.List;

public interface Provider<T extends Ad> {

    default void selectAd(String adName){}

    List<String> getAdLists();

    void createAd();
}
