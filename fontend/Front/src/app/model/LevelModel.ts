import {FormModel} from "./FormModel";

export  interface LevelModel {

   Id: number
   name: string
   forms :  FormModel
   totalSurface: number
   totalPerimeter: number
   numberOfForm : number

}
