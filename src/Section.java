import java.util.List;

public class Section implements TextComponent {
    private final String header;
    private final List<TextComponent> contents;


    public Section(String header, List<TextComponent> contents) {
        this.header = header;
        this.contents = contents;
    }

    public String getHeader() {
        return header;
    }

    public void addContent(TextComponent content) {
        contents.add(content);
    }

    public void removeContent(TextComponent content) {
        contents.remove(content);
    }

    public List<TextComponent> getContents() {
        return contents;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int countWords() {
        int result = 0;
        for (TextComponent tc : contents)
            result += tc.countWords();
        return result;
    }
}
