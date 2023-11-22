package Tangram.adventures.com;

import Tangram.adventures.com.dao.FormRepository;
import Tangram.adventures.com.dto.CreateFormDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/Forms")
public class FormController {
    @Autowired
    private  FormRepository formRepository;


    @GetMapping("")
    public List<Form> formList() {
        return formRepository.findAll();
    }

/*    @GetMapping(value = "/{id}")
    public Form DisplayForm(@PathVariable long id) {
        return formRepository.findByid(id);
    }*/

    @PostMapping(value = "/")
    public Form NewForm(@RequestBody CreateFormDto createFormDto){
        switch (createFormDto.getFormType()){
            case "circle" :
                Form bernard = new Circle(createFormDto.getX(),createFormDto.getY(), createFormDto.getRadius());
                return formRepository.save(bernard);
            case "square" :
                Form carine= new Square(createFormDto.getSide(),createFormDto.getX(),createFormDto.getY());
                return formRepository.save(carine);
            case "rectangle":
                Form  rect= new Rectangle(createFormDto.getHeight(),createFormDto.getWidth(),createFormDto.getY(), createFormDto.getX());
                return formRepository.save(rect);
            case "triangle":
                new Triangle( createFormDto.getSide(), createFormDto.getY(), createFormDto.getX());
                return formRepository.save(new Triangle());
            default:  return null;
        }





}



}
