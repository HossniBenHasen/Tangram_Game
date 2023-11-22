package Tangram.adventures.com;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class Triangle extends Form {
    private double x;
    private double y ;

    private double side;

    public Triangle(double s, double x , double y){
        super("triangle");

        this.x=x;
        this.y = y;
        this.side = s;
    }

    public Triangle() {
    super("triangle");
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSide(){
        return side;
    }

    public String toStringSide(){
        return "the side of the equilateral triangle is equal to  " + this.getSide() +" cm" ;
    }

    public void displaySide(){
        System.out.println(this.toStringSide());
    }


    public void setSide(double newSide){

        this.side= newSide;
    }


    @Override
    public double CalculateSurface(){
        return (this.side * this.side ) /2;
    }
    @Override
    public double CalculatePerimeter(){
        return 3*this.side;
    }


    @Override
    public  String toString(){
        return "the triangle surface is equal to " + this.CalculateSurface()+ " cm  the perimeter of the triangle is equal to " + this.CalculatePerimeter() + " cm";
    }
}
