
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private List<TextComponent> contents;

    public Book(String title, String author, List<TextComponent> contents) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public int countWords() {
        int count = 0;
        for (TextComponent tc : contents) count += tc.countWords();

        return count;
    }

    public int countWordsByVisitor() {
        CountWordsVisitor concreteVisitor = new CountWordsVisitor();
        int result = 0;
        for (TextComponent tc : contents) result += tc.accept(concreteVisitor);

        return result;
    }

    public List<String> tableOfContents() {
        List<String> result = new ArrayList<>();
        TableOfContentsVisitor concreteVisitorTable = new TableOfContentsVisitor();
        int indexSection = 1;

        for (TextComponent tc : contents) {
            if (!tc.getClass().getName().equals("Section")) continue;

            concreteVisitorTable.pushInStack("" + (indexSection++));
            result.addAll(tc.accept(concreteVisitorTable));
        }

        return result;
    }

    public String toText() {
        StringBuilder sb = new StringBuilder();
        ToTextVisitor concreteVisitorToText = new ToTextVisitor();

        sb.append(title).append("\n");
        sb.append(author).append("\n");

        int indexSection = 1;
        for (TextComponent content : contents) {
            if (content.getClass().getName().equals("Section"))
                concreteVisitorToText.pushInStack("" + (indexSection++));

            sb.append(content.accept(concreteVisitorToText));
        }

        return sb.toString();
    }

}
