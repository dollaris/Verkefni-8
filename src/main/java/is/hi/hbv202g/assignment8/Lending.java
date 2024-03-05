package is.hi.hbv202g.assignment8;

import java.time.LocalDate;

public class Lending extends LibrarySystem {
    private java.time.LocalDate dueDate;
    private Book book;
    private User user;
    public Lending(Book book, User user) {
        this.dueDate = LocalDate.now().plusDays(30);
        this.book = new Book(book.getTitle(), book.getAuthorName());
        this.user = user;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book){
        this.book = new Book(book.getTitle(), book.getAuthorName());
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
}
