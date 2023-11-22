import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { LevelComponent } from './level/level.component';
import{LevelModule} from "./Module/Level.module";
import { MenuComponent } from './menu/menu.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import {MatInputModule} from "@angular/material/input";
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    FormulaireComponent,



  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        LevelModule,
        BrowserAnimationsModule,
        MatInputModule,

    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
