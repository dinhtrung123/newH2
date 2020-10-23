import {Routes} from '@angular/router';
import {StudentComponent} from "./student.component";
import {StudentAddComponent} from "./student.add";
import {StudentDetailComponent} from "./student-detail";
import  {StudentUpdateComponent} from "./student.update"

export const ReutesStudent : Routes = [

  { path : '' , component : StudentComponent } ,
 { path : 'student-detail/:id' , component : StudentDetailComponent } ,
 { path : 'add' , component : StudentAddComponent } ,
  { path : 'update/:id' , component : StudentUpdateComponent } ,
  { path : 'delete/:id' , component : StudentUpdateComponent } ,
]

