import java.util.List;

public class CountWordsVisitor implements Visitor<Integer> {
    public Integer visit(Image image) {
        return 0;
    }

    public Integer visit(Paragraph paragraph) {
        String text = paragraph.getText();
        return text.split("[^a-zA-Z]+").length;
    }

    public Integer visit(Section section) {
        List<TextComponent> contents = section.getContents();
        int cntWords = 0;
        for (TextComponent textComponent : contents)
            cntWords += textComponent.accept(this);
        return cntWords;
    }
}
