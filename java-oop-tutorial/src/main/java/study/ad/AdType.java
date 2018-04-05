package study.ad;

public enum AdType {
    PAPER, BANNER, ANIMATION, MOVIE;

    public static AdType getBySeq(int seq) {
        return AdType.values()[seq - 1];
    }
}
