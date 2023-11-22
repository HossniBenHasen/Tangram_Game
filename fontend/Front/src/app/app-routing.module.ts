import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LevelComponent} from "./level/level.component";
import {MenuComponent} from "./menu/menu.component";

const routes: Routes = [
  { path:'Levels',component :LevelComponent},
  {path: "Levels/:id",component:LevelComponent},
  {path:"menu",component:MenuComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
