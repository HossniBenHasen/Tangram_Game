import {HttpClient, HttpHeaders} from "@angular/common/http";
import{Injectable} from "@angular/core";
import{Observable} from "rxjs";
import {LevelModel} from "../model/LevelModel";




@Injectable({
  providedIn:'root'
})

export class LevelServices{

  private apiUrl = 'http://localhost:4500/Levels';

  constructor(private httpClient : HttpClient) {}

  getForms(){
    return this.httpClient.get("apiUrl")
  }

  getFormByLevel(level_id: number){
    return this.httpClient.get("http://localhost:4500/Forms/" +level_id)
  }

  getLevelById(id: number){
    return this.httpClient.get('http://localhost:4500/Levels/'+id)
  }

  getLevels():Observable<LevelModel[]>{
    return this.httpClient.get<LevelModel[]>("http://localhost:4500/Levels")
  }

  creatLevel(level: string):Observable<LevelModel>{
    const httpOptions = {
      headers : new HttpHeaders({'Content-Type':'application/json'})
    };
    return this.httpClient.post<LevelModel>("http://localhost:4500/Levels",level, httpOptions)




  }

}
