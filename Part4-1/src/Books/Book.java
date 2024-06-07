package Books;

import java.time.Year;

public class Book {

    private String title;
    private int pages;
    private int PublicationYear;

    public Book(String title, int pages , int PublicationYear){
        this.title = title;
        this.pages = pages;
        this.PublicationYear = PublicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }


    public String toString(){
      return  this.title + ", " + this.pages+ ", " + this.PublicationYear;
    }

}
