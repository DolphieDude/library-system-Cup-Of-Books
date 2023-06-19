package ua.cupofbooks;


import lombok.*;

import java.time.LocalDate;

@Getter
public class Book {

    private final int bookID;
    private String title;
    private Author author;
    private String genre;
    @Setter(AccessLevel.PROTECTED) private String description;
    private final LocalDate releaseDate;
    @Setter(AccessLevel.PROTECTED) private int shelf;
    @Setter(AccessLevel.PROTECTED) private int row;


    public Book(int bookID, @NonNull String title, @NonNull Author author, @NonNull String genre,
                String description, @NonNull LocalDate releaseDate, int shelf, int row) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.releaseDate = releaseDate;
        this.shelf = shelf;
        this.row = row;
    }
}
