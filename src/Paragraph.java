public class Paragraph implements TextComponent {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }


    @Override
    public int countWords() {
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
}
