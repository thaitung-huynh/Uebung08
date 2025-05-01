public interface Visitor<T> {
    T visit(Image image);
    T visit(Paragraph paragraph);
    T visit(Section section);
}
