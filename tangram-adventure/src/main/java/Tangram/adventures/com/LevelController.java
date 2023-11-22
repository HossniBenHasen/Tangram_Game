package Tangram.adventures.com;
import Tangram.adventures.com.dao.FormRepository;
import Tangram.adventures.com.dao.LevelRepository;
import Tangram.adventures.com.dto.ThierryRecord;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Tangram.adventures.com.dto.CreateLevelDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController

@RequestMapping(path="/Levels")
public class LevelController {

    private LevelRepository levelRepository;
    private FormRepository formRepository;


    private List<Form> forms = new ArrayList<>();



    public LevelController(LevelRepository levelRepository, FormRepository formRepository) {
        this.levelRepository = levelRepository;
        this.formRepository = formRepository;

    }







    @GetMapping(value = "/{id}")
    public ResponseEntity<Level> DisplayLevel(@PathVariable int id) {
      Level level =   levelRepository.findById(id);
      return new ResponseEntity<>(level, HttpStatus.OK) ;
    }

    @PostMapping("")
    public Level newLevel(@RequestBody CreateLevelDto createLevelDto) {

       Level tony= new Level();
       tony.setName(createLevelDto.getName());
         levelRepository.save(tony);
         return tony;


    }






@PostMapping("/creationOriginal")
public Level AddInForms(@PathVariable int Id ,@RequestBody Level level){
       return  levelRepository.save(level);
}




@PostMapping("/Forms/{id}")
    public ResponseEntity<Form> PostFormInFormsInLevel(@PathVariable(value="id") int id,@RequestBody
    ThierryRecord thierryRecord){
        Level mylevel = levelRepository.findById(id);
        Form form = thierryRecord.addIn();
       /* mylevel.addForm(form);*/
        return new ResponseEntity<>(formRepository.save(form),HttpStatus.CREATED);

}
















}
