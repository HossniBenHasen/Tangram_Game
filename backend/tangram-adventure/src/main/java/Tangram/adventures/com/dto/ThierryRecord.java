package Tangram.adventures.com.dto;

import Tangram.adventures.com.*;

public record ThierryRecord(String form_type,double x, double y , double height , double width, double side, double radius) {



        public Form addIn(){
            switch (form_type){
                case "circle" :

                    return new Circle(this.radius,this.x,this.y);

                case "square" :

                    return  new Square(this.side,this.x,this.y);

                case "triangle":

                    return new Triangle(this.side,this.x,this.y);
                case "rectangle":

                    return new Rectangle(this.height,this.width,this.x,this.y);
                default:  return null;
            }
        }}

