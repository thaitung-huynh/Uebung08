import java.util.List;

public class CountWordsVisitor implements Visitor<Integer> {
    public Integer visit(Image image) {
        return 0;
    }

    public Integer visit(Paragraph paragraph) {
        String text = paragraph.getText();
        boolean isWord = false;
        int result = 0;
        for (int i = 0; i < text.length(); ++i) {
            if (('a' <= text.charAt(i) && text.charAt(i) <= 'z') || ('A' <= text.charAt(i) &&  text.charAt(i) <= 'Z')) isWord = true;
            else {
                if (isWord) result++;
                isWord = false;
            }
        }
        if (isWord) result++;
        return result;
    }

    public Integer visit(Section section) {
        List<TextComponent> contents = section.getContents();
        int cntWords = 0;
        for (TextComponent textComponent : contents)
            cntWords += textComponent.accept(this);
        return cntWords;
    }
}
