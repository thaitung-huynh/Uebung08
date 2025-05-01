import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ToTextVisitor implements Visitor<String> {

    private String indexImage = "";
    private Stack<String> stack = new Stack<>();

    public String visit(Image image) {
        return "<image " + image.getUrl() + ">\n" + "Fig. " + indexImage + ": " + image.getCaption() + "\n";
    }

    public String visit(Paragraph paragraph) {
        return paragraph.getText() + "\n";
    }

    public void pushInStack(String text) {
        stack.push(text);
    }


    public String visit(Section section) {
        StringBuilder sb = new StringBuilder();
        List<TextComponent> contents = section.getContents();

        String indexSection = stack.peek();
        sb.append(indexSection + " " + section.getHeader() + "\n");

        int tmpSection = 1;
        int tmpImage = 1;


        for (TextComponent tc : contents) {
            if (tc.getClass().getName().equals("Section"))
                stack.push(indexSection + "." + (tmpSection++));

            if (tc.getClass().getName().equals("Image"))
                indexImage = indexSection + "." + (tmpImage++);

            sb.append(tc.accept(this));

        }
        stack.pop();

        return sb.toString();
    }

}
