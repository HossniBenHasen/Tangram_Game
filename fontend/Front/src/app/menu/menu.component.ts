import { Component, OnInit } from '@angular/core';
import {LevelServices} from "../services/Level.service";
import {ActivatedRoute, Router} from "@angular/router";
import {LevelModel} from "../model/LevelModel";


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  levels !: any;
  display : boolean = false;


  constructor(private levelServices:LevelServices, private route : ActivatedRoute, private router : Router) { }

  ngOnInit(): void {
this.levelServices.getLevels().subscribe(levels =>{
  this.levels = levels
})

  }


  DisplayFormulaire(){
    if (this.display===false){
      this.display=true;
    }else{
      this.display = false;
    }
  }


}
