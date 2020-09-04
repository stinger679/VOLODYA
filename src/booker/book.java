package booker;
import java.lang.*;

public class book {
    private int stranica;
    private String name;
    private String author;

    public book (int a, String b, String c){
        stranica = a;
        name = b;
        author = c;
    }
    public void setstr(int stranica) {
        this.stranica = stranica;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setauthor(String author) {
        this.author = author;
    }
    public  int getsstr(int stranica) {
        return stranica;
    }
    public  String getname(String name) {
      return name;
    }
    public String getauthor(String author) {
       return author;
    }
    public String toString(){
        return this.name+", author "+this.author;
    }
    public void booker(){
        System.out.println(name+" colichestvo symvolov  "+stranica*532+" author "+ author);
    }
}
