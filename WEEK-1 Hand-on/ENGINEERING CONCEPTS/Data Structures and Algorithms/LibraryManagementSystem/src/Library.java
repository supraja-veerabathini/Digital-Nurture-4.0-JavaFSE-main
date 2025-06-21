import java.util.Arrays;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
            System.out.println("Book added.");
        } else {
            System.out.println("Library is full.");
        }
    }

    // Linear Search
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search (requires sorting first)
    public Book binarySearchByTitle(String title) {
        Book[] sortedBooks = Arrays.copyOf(books, size);
        Arrays.sort(sortedBooks); // Uses compareTo()

        int low = 0, high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = sortedBooks[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return sortedBooks[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public void displayAllBooks() {
        if (size == 0) {
            System.out.println("Library is empty.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
