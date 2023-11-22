import {NgModule} from "@angular/core";
import{CommonModule} from "@angular/common";
import {HttpClient} from "@angular/common/http";
import {LevelServices} from "../services/Level.service";
import{LevelComponent} from "../level/level.component";
import {MatInputModule} from "@angular/material/input";

@NgModule({
  declarations : [LevelComponent],
  imports: [CommonModule, MatInputModule],
  providers: [LevelServices],
  exports:[LevelComponent]
})

export class LevelModule{}
