import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TableOfContentsVisitor implements Visitor<List<String>> {

    private final Stack<String> stack = new Stack<>();

    public void pushInStack(String text) {
        stack.push(text);
    }

    public List<String> visit(Image image) {
        return new ArrayList<>();
    }

    public List<String> visit(Paragraph paragraph) {
        return new ArrayList<>();
    }

    public List<String> visit(Section section) {
        List<String> result = new ArrayList<String>();
        List<TextComponent> contents = section.getContents();

        String indexSection = stack.peek();
        result.add(indexSection + " " + section.getHeader());
        int tmpSection = 1;

        for (TextComponent content : contents) {
            if (!content.getClass().getName().equals("Section")) continue;
            stack.push(indexSection + "." + (tmpSection++));
            List<String> tmp = content.accept(this);
            result.addAll(tmp);

        }

        stack.pop();
        return result;
    }
}
