//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/15/2020
//Lab5


//Book inherits from Item
public class Book extends Item {

    //private attributes for Book
    private String author;
    private String ISBN;

    //default constructor
    public Book(){
        author = "This is a placeholder author";
        ISBN = "This is a placeholder ISBN";
    }

    //overload constructor
    public Book(String tit, String auth, String num){
        super(tit);
        author = auth;
        ISBN = num;
    }

    //getters
    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    //Override getListing()
    @Override
    public String getListing(){
        return ("Book name: " + getTitle() + "\nAuthor: " + getAuthor() + "\nISBN #: " + getISBN());
    }

    //toString
    @Override
    public String toString(){
        return "This book is titled " + getTitle();
    }
}
