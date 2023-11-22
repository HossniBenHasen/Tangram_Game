package Tangram.adventures.com;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Rectangle extends Form {
    private static long incrementTracker = 0;
    private double x ;
    private double y ;
    private double width;
    private double height;

    public Rectangle(double w,double h, double x, double y){
        super("rectangle");
        this.x= x;
        this.y = y;
        this.height = h;
        this.width = w;

    }

    public Rectangle() {
        super("rectangle");

    }


    public double getHeight()
    {
        return this.height;


    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth(){
        return  this.width;
    }

    public String toStringSize(){
        return "the rectangle height is equal to " + this.getHeight() + " the rectangle width is equal to " + this.getWidth();
    }
    public void displaySize(){
        System.out.println(this.toStringSize());

    }


    public void setSize(double newHeight, double newWidth){
        this.height = newHeight;
        this.width = newWidth;
    }





    @Override
    public double CalculateSurface() {
        return this.height * this.width;
    }

    @Override
    public double CalculatePerimeter(){
        return 2*(this.width+this.height);
    }




    @Override
    public String toString() {
        return "the rectangle surface is a equal to "+ this.CalculateSurface() + " cm, the rectangle perimeter is equal to " + this.CalculatePerimeter() + " cm";

    }


}