package bigballs;
import java.lang.*;
public class ball {
    private String color;
    private int number;
    private double radius;
    public  ball(String a, int b, double c){
        color = a;
        number = b;
        radius = c;

    }
    public void setcolor(String color) {
        this.color = color;
    }
    public void setnumber(int number) {
        this.number = number;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public String getcolor(String color){
        return color;
    }
    public int getnumber() {
        return number;
    }

    public double getradius() {
        return radius;
    }

    public String toString(){
        return "color "+this.color+", number "+this.number+", radius "+this.radius;
    }
    public void ihavebigballs(){
        System.out.println("my balls have a color "+color+" number "+number+" with radius " + radius);
    }
}

