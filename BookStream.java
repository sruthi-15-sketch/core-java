import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Book implements Comparable<Book> {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    // parameterised constructor
    Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }

    // override hashCode()
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    // override equals()
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int compareTo(Book o) {
        return this.id - o.id;
    }
}

class BookStream {
    public static void main(String[] args) {
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
        List<Book> list = new ArrayList<>(Arrays.asList(b1, b2, b3, b4));
        System.out.println("Book List:");
        list.stream().forEach(System.out::println);
        Set<Book> set = list.stream().collect(Collectors.toSet());
        System.out.println("Book Set:");
        set.stream().forEach(System.out::println);
        System.out.println("Sorted list:");
        List<Book> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("Doubled list:");
        List<Book> doubleList = sortedList.stream().map(x -> {
            x.quantity *= 2;
            return x;
        }).collect(Collectors.toList());
        doubleList.forEach(System.out::println);
        System.out.println("Filtered list:");
        list.stream().filter(x -> x.quantity > 10).collect(Collectors.toList()).forEach(System.out::println);

    }
}