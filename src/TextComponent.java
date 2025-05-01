public interface TextComponent {
    int countWords();
    <T> T accept(Visitor<T> visitor);
}
