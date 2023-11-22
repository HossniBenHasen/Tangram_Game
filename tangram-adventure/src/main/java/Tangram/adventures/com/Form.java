package Tangram.adventures.com;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@DiscriminatorColumn(name = "form_type", discriminatorType = DiscriminatorType.STRING)


public abstract class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public int id;

    public Form(String type) {

    }
    public abstract String toString ();
    public void display(){
        System.out.println(this);
    }


    public abstract double CalculateSurface();
    public abstract double CalculatePerimeter();



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
