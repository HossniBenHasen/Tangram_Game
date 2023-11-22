import {Component, isDevMode, OnInit} from '@angular/core';
import {LevelModel} from "../model/LevelModel";
import{LevelServices} from "../services/Level.service";
import {ActivatedRoute, Router} from "@angular/router";
import Konva from 'konva';
import Stage = Konva.Stage;
import Layer = Konva.Layer;
import {forms} from "@angular/core/schematics/migrations/typed-forms/util";
import{FormModel} from "../model/FormModel";


@Component({
  selector: 'app-level',
  templateUrl: './level.component.html',
  styleUrls: ['./level.component.scss']
})
export class LevelComponent implements OnInit {
  levels: LevelModel[] = [];
  stage!:Stage;
layer ! : Layer;
tangramContainer!: any;

backgroundLayer!:Layer;
forms_Layer!:Layer;


  level !: any;

  VariableTest !: any

  id!: number ;
  constructor(private levelServices:LevelServices, private route : ActivatedRoute, private router : Router) { }

  ngOnInit(): void {

    if (this.route.snapshot.paramMap.get('id') != null){
      this.VariableTest = this.route.snapshot.paramMap.get('id');

    }
  console.log("étape1");
    this.initTangram();





  }


  initTangram(){
    this.stage = new Konva.Stage({
      container: "gameContainer",
      height: window.innerHeight,
      width:window.innerWidth,
    })
    this.backgroundLayer=new Konva.Layer();
    this.forms_Layer= new Konva.Layer();
     this.stage.add(this.backgroundLayer);
     this.stage.add(this.forms_Layer);
    console.log("étape2");
    this.getLevelById();
  }

    getLevelById(){
    this.levelServices.getLevelById(this.VariableTest).subscribe(level=>{
        this.level = level;
        console.log(this.level);
        this.addFormToContainer()
      }
    )
  }

      /* TODO Le forms dans le foreach n'est peut etre pas bon(la variable) */
      /*TODO le type de formfond est a changer */

  addFormToContainer(){
    console.log("étape3");
      this.level.forms.forEach((apiform: FormModel)=>{
       let formFond = this.switchFormType(apiform);
        if(!formFond) return;
        formFond.setDraggable(false);

        formFond.setAttr("fill","gray");
        this.backgroundLayer.add(formFond);

        let form = this.switchFormType(apiform);
         if(!form)
          return;

        /* TODO ajouter les positions de départ */

        form.setDraggable(true);
        form.setAttr("fill", "red")

        this.forms_Layer.add(form);
        console.log("étape5");

      })

    /*TODO probablement pas au bon endroit (donc erreur de undefided) */
    this.winCondition()
      }


    //get all
  /*  this.levelServices.getLevels().subscribe(levels =>{
      this.levels = levels;
      console.log(levels)
    })*/


// @ts-ignore
  switchFormType(variableFormSwitch:FormModel){
    console.log("étape6");
  switch (variableFormSwitch.type){
    case "square":
      return new Konva.Rect({
        height : variableFormSwitch.side,
        width : variableFormSwitch.side,
        x: variableFormSwitch.x,
        y:variableFormSwitch.y
      })
    case "rectangle":
      return new Konva.Rect({
        height:variableFormSwitch.height,
        width: variableFormSwitch.width,
        x:variableFormSwitch.x,
        y: variableFormSwitch.y
      })
    case "circle":
      return new Konva.Circle({
        radius : variableFormSwitch.radius,
        y: variableFormSwitch.y,
        x: variableFormSwitch.x,
      })


    default : console.log("cest dla merde");
      console.log("étape7");

  }

}



  winCondition(){
    let verifPosition = true;
    this.backgroundLayer.getChildren().forEach(variableFormSwitch => {
      let rectangle = this.forms_Layer.getChildren(item => {
        return item._id === variableFormSwitch._id + 1
      })[0]

      if (variableFormSwitch.x() != rectangle.x() || variableFormSwitch.y() != rectangle.y()){
        verifPosition = false;
        console.log("ça tourne mal")

  }

})}
}
