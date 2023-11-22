package Tangram.adventures.com;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity


public class Square extends Form {


    private double x;
    private double y ;
    private double side;

    public Square(double s, double x , double y){
        super("square");

        this.x= x;
        this.y=y;
        this.side=s;
    }

    public Square() {
    super("square");
    }

    public double getSide(){

        return side;
    }

    public String toStringSide(){
        return "the side of the square is equal to " + this.getSide() + " cm";
    }
    public void displaySide(){
        System.out.println(this.toStringSide());
    }

    public void setSide(double newSide) {
        this.side = newSide;

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



    @Override
    public double CalculateSurface(){
        return this.side * this.side;
    }

    @Override
    public double CalculatePerimeter(){
        return 4*(this.side);
    }




    @Override
    public  String toString (){
        return "the square surface is equal to " + this.CalculateSurface() + " cm, the square perimeter is equal to " + this.CalculatePerimeter() + " cm";

    }





}


