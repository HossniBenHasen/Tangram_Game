package Tangram.adventures.com;


import jakarta.persistence.*;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter

@NoArgsConstructor

public class Circle extends Form {


    private double radius;

    private double x;

    private double y;




    public Circle(double r, double x , double y ){

        super("circle");
        this.radius=r;
        this.x = x;
        this.y=y;
    }


    public double getRadius(){

        return radius;
    }

    @Override
    public double CalculateSurface(){
        return 2 * Math.PI* this.radius;
    }

    @Override
    public double CalculatePerimeter(){
        return (this.radius*this.radius)*Math.PI;
    }

    @Override
    public String toString (){
        return "The circle surface is equal to " + this.CalculateSurface() + " cm, the circle perimeter is equal to " + this.CalculatePerimeter() + " cm";
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}


