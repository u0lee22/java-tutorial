package study.ad;


public abstract class Ad {

    private String title;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getContent();

}
