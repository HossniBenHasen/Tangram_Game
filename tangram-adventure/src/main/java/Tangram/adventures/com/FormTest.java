package Tangram.adventures.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FormTest {





@Test
    public void WHEN_display_displayCircle(){
    Circle cercleTest = new Circle(5,3,3);
    assertEquals("The circle surface is equal to 31.41592653589793 cm, the circle perimeter is equal to 78.53981633974483 cm", cercleTest.toString());

}
    @Test
    public void WHEN_display_displaySquare(){
        Square squareTest = new Square(5,6,3);
        assertEquals("the square surface is equal to 25.0 cm, the square perimeter is equal to 20.0 cm", squareTest.toString());

    }

    @Test
    public void WHEN_display_displayRectangle(){
        Rectangle rectangleTest = new Rectangle(10,15,2,2);
        assertEquals("the rectangle surface is a equal to 150.0 cm, the rectangle perimeter is equal to 50.0 cm",rectangleTest.toString());

    }

    @Test
    public void WHEN_display_displayTriangle(){
        Triangle triangleTest = new Triangle(2,3,3);
        assertEquals("the triangle surface is equal to 2.0 cm  the perimeter of the triangle is equal to 6.0 cm",triangleTest.toString());

    }

    @Test
    public void WHEN_getSurface_getCircleSurface(){
        Circle cercleTest = new Circle(5,3,3);
        assertEquals(31.41592653589793, cercleTest.CalculateSurface(),0.0);

    }
    @Test
    public void WHEN_getSurface_getSquareSurface(){
        Square squareTest = new Square(5,8,9);
        assertEquals(25.0, squareTest.CalculateSurface(), 0.0);


    }



    @Test
    public void WHEN_getSurface_getRectangleSurface(){
        Rectangle rectangleTest = new Rectangle(10,15,2,2);
        assertEquals(150.0, rectangleTest.CalculateSurface(), 0.0);
    }

    @Test
    public void WHEN_getSurface_getTriangleSurface(){
        Triangle triangleTest = new Triangle(2,2,2);
        assertEquals(2, triangleTest.CalculateSurface(), 0.0);
    }


    @Test
    public void WHEN_getPerimeter_getCirclePerimeter(){
        Circle cercleTest = new Circle(5,6,6);
        assertEquals(78.53981633974483, cercleTest.CalculatePerimeter(), 0.0);
    }

    @Test
    public void WHEN_getPerimeter_getSquarePerimeter(){
        Square squareTest = new Square(5,6,3);
        assertEquals(20.0, squareTest.CalculateSurface(), 0.0);
    }


    @Test
    public void WHEN_getPerimeter_getRectanglePerimeter(){
        Rectangle rectangleTest = new Rectangle(10,15,5,6);
        assertEquals(50.0, rectangleTest.CalculatePerimeter(), 0.0);
    }

    @Test
    public void WHEN_getPerimeter_getTrianglePerimeter(){
        Triangle triangleTest = new Triangle(2,9,9);
        assertEquals(6.0, triangleTest.CalculatePerimeter(), 0.0);
    }


}
