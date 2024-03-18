public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author gogol = new Author("Николай", "Гоголь");

        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        Book theAuditor = new Book("Ревизор", 1835, gogol);

        print(warAndPeace);
        print(theAuditor);

        theAuditor.setYear(1836);
        print(theAuditor);
    }

    private static void print(Book book) {
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() +
                ", название: " + book.getTitle() + ", год издания: " + book.getYear());
    }
}



