package Tangram.adventures.com;

import Tangram.adventures.com.dto.CreateFormDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Level {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int Id;

public String name;


    @OneToMany(cascade = CascadeType.ALL)/*(mappedBy = "level")*/
    private List<Form> forms = new ArrayList<>();

    public Level(){

    }


/*
    public List<Form> getLevel(){
        return this.forms;
    }*/

    public int getNumberOfForm(){
        return this.forms.size();
    }

/*
    public void addForm(Form form){
        this.forms.add(form);
}*/


/*    public List<Form> getForms() {
        return forms;
    }*/

    public double getTotalPerimeter(){
        double totalPerimiter = 0;
        for (Form form : this.getForms()) {
           totalPerimiter += form.CalculatePerimeter();
        }
        return totalPerimiter;
    }

    public double getTotalSurface(){
        double totalSurface= 0;
        for (Form form : this.getForms()){
            totalSurface += form.CalculateSurface();
        }
        return totalSurface;
    }

    public String toString(){
        return " The total surface of the forms is equal to " + this.getTotalSurface() + " the total perimeter of the forms is equal to  " + this.getTotalPerimeter();
    }

    public void display(){
        System.out.println(this);
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }}

    /*public List<Form> addIn(@PathVariable Long Id , @RequestBody CreateFormDto createFormDto){
        List<Form> forms= new ArrayList<>();
        switch (createFormDto.getFormType()){
            case "circle" :
                forms.add(new Circle());
                return forms;
            case "square" :
                Form carine= new Square(createFormDto.getSide(),createFormDto.getY(),createFormDto.getX());
                forms.add(carine);

                return forms;
            case "rectangle":
                Form  rect= new Rectangle(createFormDto.getHeight(),createFormDto.getWidth(),createFormDto.getX(), createFormDto.getY());
                forms.add(rect);
                return forms;
            case "triangle":
                Form tritri =   new Triangle( createFormDto.getSide(), createFormDto.getX(), createFormDto.getY());
                forms.add( tritri);

                return forms;
            default:  return null;
        }*/


