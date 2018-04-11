package study.ad;

import java.io.File;
import java.util.List;

public abstract class Ad {
    private String adType;
    private String title;
    private String manager;
    private String content;

    public Ad() {
        setValues("", "", "", "");
    }

    public Ad(String adType, String title, String manager, String content) {
        setValues(adType, title, manager, content);
    }

    private void setValues(String adType, String title, String manager, String content) {
        setAdType(adType);
        setTitle(title);
        setManager(manager);
        setContent(content);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getAdType() {
        return adType;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public abstract String createAd();

}
