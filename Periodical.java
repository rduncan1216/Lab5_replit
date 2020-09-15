//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/15/2020
//Lab5

//Periodical inherits Item
public class Periodical extends Item{

    //private attribute
    private int issueNum;

    //default constructor
    public Periodical(){
        super();
        issueNum = 0;
    }

    //overloaded constructor
    public Periodical(String tit, int issue){
        super(tit);
        issueNum = issue;
    }

    //getter and setter for issueNum
    public void setIssueNum(int issue){
        issueNum = issue;
    }

    public int getIssueNum(){
        return issueNum;
    }

    //override getListing
    @Override
    public String getListing(){
        return ("Periodical Title: " + getTitle() + "\nIssue #: " + getIssueNum());
    }

    //override toString()
    public String toString(){
        return ("This periodical is titled " + getTitle());
    }
}
