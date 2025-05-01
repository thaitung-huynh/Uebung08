public class Paragraph implements TextComponent {
    private String text;

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
        return text.split("[^a-zA-Z]+").length;
    }
}
