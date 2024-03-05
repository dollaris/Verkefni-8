package is.hi.hbv202g.assignment8;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    private List<User> users;
    private List<Lending> lendings;
    private String title;
    public LibrarySystem() {
    }
    public void addBookWithTitleAndNameOfSingleAuthor(String title, String authorName) {
        this.books.add(new Book(title, authorName));
    }

    public void addBookWithTitleAndAuthorList(String title, List<Author> authors) throws EmptyAuthorListException {
        if(authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list is empty");
        }
        this.books.add(new Book(title, authors));
    }

    public void addStudentUser(String name, boolean feePaid) {

    }
    public void addFacultyMemberUser(String name, String department) {

    }
    public Book findBookByTitle(String title) throws UserOrBookDoesNotExistException {
        if(title.isEmpty()) {
            throw new UserOrBookDoesNotExistException("Book does not exist");
        }
        return null;
    }

    public User findUserByName(String name) throws UserOrBookDoesNotExistException {
        if(name.isEmpty()) {
            throw new UserOrBookDoesNotExistException("User does not exist");
        }
        return null;
    }

    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException{
        if(user.getName() == null || book.getTitle() == null) {
            throw new UserOrBookDoesNotExistException("User or book does not exist");
        }
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {

    }

    public void returnBook(User user, Book book) {

    }
}

