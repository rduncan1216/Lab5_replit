//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/15/2020
//Lab5

//abstract class Item
public abstract class Item {

    //private attribute
    private String title;

    //default constructor
    public Item(){
        title = "This is a placeholder title.";
    }

    //overload constructor
    public Item(String name){
        title = name;
    }

    //abstract method getListing()
    public abstract String getListing();

    //getTitle
    public String getTitle(){
        return title;
    }

    //setTitle
    public void setTitle(String name){
        title = name;
    }

    //Override toString()
    @Override
    public String toString(){
        return ("This item's title is: " + title);
    }
}
