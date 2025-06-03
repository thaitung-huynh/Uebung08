import java.util.List;

public class BookDemo {
    private static final String TEXT0 = "Über Entwurf und Realisierung eierlegender Wollmilchsäue.";
    private static final String TEXT1 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
                                        "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. " +
                                        "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd " +
                                        "gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum " +
                                        "dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor " +
                                        "invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.";
    private static final String TEXT2 = "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie " +
                                        "consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan " +
                                        "et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis " +
                                        "dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer " +
                                        "adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore " +
                                        "magna aliquam erat volutpat.";
    private static final String TEXT3 = "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit " +
                                        "lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure " +
                                        "dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore " +
                                        "eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim " +
                                        "qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla " +
                                        "facilisi.";
    private static final String TEXT4 = "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming " +
                                        "id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, " +
                                        "consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet " +
                                        "dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud " +
                                        "exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo " +
                                        "consequat.";
    private static final String TEXT5 = "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie " +
                                        "consequat, vel illum dolore eu feugiat nulla facilisis.";
    private static final String TEXT6 = "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, " +
                                        "no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, " +
                                        "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et " +
                                        "dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo " +
                                        "duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
                                        "Lorem ipsum dolor sit amet.";
    private static final String TEXT7 = "Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore " +
                                        "et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
                                        "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata " +
                                        "sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur " +
                                        "sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore " +
                                        "magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo " +
                                        "dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
                                        "Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing " +
                                        "elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam " +
                                        "erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea " +
                                        "rebum. Stet clita kasd gubergren, no sea takimata sanctus.";
    private static final String TEXT8 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                                        "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam " +
                                        "voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet " +
                                        "clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit " +
                                        "amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam " +
                                        "nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed " +
                                        "diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet " +
                                        "clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. ";
    private static final String TEXT9 = "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie " +
                                        "consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan " +
                                        "et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis " +
                                        "dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer " +
                                        "adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore " +
                                        "magna aliquam erat volutpat.";
    private static final String TEXT10 = "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit " +
                                         "lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure " +
                                         "dolor in hendrerit in vulputate velit esse molestie consequat, vel illum " +
                                         "dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio " +
                                         "dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te " +
                                         "feugait nulla facilisi.";
    private static final String TEXT11 = "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet " +
                                         "doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, " +
                                         "consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut " +
                                         "laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, " +
                                         "quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex " +
                                         "ea commodo";
    private static final String TEXT12 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                                         "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam " +
                                         "voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet " +
                                         "clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit " +
                                         "amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam " +
                                         "nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed " +
                                         "diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet " +
                                         "clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
    private static final String TEXT13 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
                                         "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam " +
                                         "voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita " +
                                         "kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
    private static final String TEXT14 = "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, " +
                                         "no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit " +
                                         "amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut " +
                                         "labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam " +
                                         "et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata " +
                                         "sanctus est Lorem ipsum dolor sit amet.";
    private static final String TEXT15 = "Lorem ipsum dolor sit amet, consetetur sadipscing " +
                                         "elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et " +
                                         "nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd " +
                                         "magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum " +
                                         "dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed " +
                                         "diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.";

    public static void main(String[] args) {
        final Book book = makeBook();

        // Aufgabe 1
        System.out.println("Buch enthält " + book.countWords() + " Wörter");

        // Aufgabe 2
        System.out.println("Buch enthält " + book.countWordsByVisitor() + " Wörter");
        System.out.println("Inhalt: " + book.tableOfContents());
        System.out.println(book.toText());
    }

    private static Book makeBook() {
        final Section sec1 = new Section("Einführung",
                                         List.of(new Paragraph(TEXT1),
                                                 new Paragraph(TEXT2)));
        final Section sec2 = new Section("Hintergrund",
                                         List.of(new Paragraph(TEXT3),
                                                 new Section("Geschichte",
                                                             List.of(new Paragraph(TEXT4),
                                                                     new Image("https://www.bekannt.de/p1.pdf",
                                                                               "Bild 1"),
                                                                     new Paragraph(TEXT5))),
                                                 new Section("Literatur",
                                                             List.of(new Paragraph(TEXT6),
                                                                     new Image("https://www.eh-klar.de/p2.pdf",
                                                                               "Bild 2"),
                                                                     new Paragraph(TEXT7),
                                                                     new Image("https://www.jeder-weiss-es.de/p3.pdf",
                                                                               "Bild 3"),
                                                                     new Paragraph(TEXT8)))));
        final Section sec3 = new Section("Idee",
                                         List.of(new Paragraph(TEXT9)));
        final Section sec4 = new Section("Umsetzung",
                                         List.of(new Paragraph(TEXT10),
                                                 new Section("Entwurf",
                                                             List.of(new Paragraph(TEXT11),
                                                                     new Section("Grobentwurf",
                                                                                 List.of(new Paragraph(TEXT12))),
                                                                     new Section("Feinentwurf",
                                                                                 List.of(new Paragraph(TEXT13))))),
                                                 new Section("Realisierung",
                                                             List.of(new Paragraph(TEXT14)))));
        final Section sec5 = new Section("Zusammenfassung und Ausblick", List.of(new Paragraph(TEXT15)));
        return new Book("Peter Mustermann", "Die eierlegende Wollmilchsau",
                        List.of(new Paragraph(TEXT0),  sec1, sec2, sec3, sec4, sec5));
    }
}
