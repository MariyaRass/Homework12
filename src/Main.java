public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author gogol = new Author("Николай", "Гоголь");

        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        Book theAuditor = new Book("Ревизор", 1835, gogol);

        System.out.println(warAndPeace);
        System.out.println(theAuditor);

        theAuditor.setYear(1836);
        System.out.println(theAuditor);
    }

    }




