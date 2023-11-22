import { Component, OnInit } from '@angular/core';
import{LevelModel} from "../model/LevelModel";
import {LevelServices} from "../services/Level.service";

@Component({
  selector: 'app-formulaire',
  templateUrl: './formulaire.component.html',
  styleUrls: ['./formulaire.component.scss']
})
export class FormulaireComponent implements OnInit {

  constructor(
    private levelService : LevelServices
  ) { }

  ngOnInit(): void {





  }

 michel !: LevelModel ;
  postLevel(name : string){
    console.log("esprit est tu la")
   this.levelService.creatLevel(name).subscribe((res)=>{
    this.michel = res;
    console.log(this.michel)
   })
  }

}
