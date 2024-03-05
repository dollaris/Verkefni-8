package is.hi.hbv202g.assignment8;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    public Book(String title, String authorName) {
        this.title = title;
        this.authors =  new ArrayList<>();
        authors.add(new Author(authorName));
    }
    public Book(String title, List<Author> authors) throws EmptyAuthorListException{
        this.title = title;
        if (authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list is empty");
        }
        this.authors = authors;
    }

    public String getAuthorName() {
        return null;
    }

    public void setAuthorName(String authorName) {
    }

    public List<Author> getAuthors() {
        return null;
    }

    public void setAuthors(List<Author> authors) {
    }

    public void addAuthor(Author author) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
