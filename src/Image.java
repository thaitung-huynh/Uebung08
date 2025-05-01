
public class Image implements TextComponent {
    private String url;
    private String caption;

    public Image(String url, String caption) {
        this.url = url;
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int countWords() {
        return 0;
    }

}
