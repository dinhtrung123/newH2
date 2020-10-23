import {NgModule} from "@angular/core";
import {StudentComponent} from "./student.component";
import {ReutesStudent} from "./student.route";
import {RouterModule} from "@angular/router";
import {StudentService} from "./student.service";
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {StudentAddComponent} from "./student.add";
import {StudentDetailComponent} from "./student-detail";
import {StudentUpdateComponent} from  "./student.update"
@NgModule({
  imports : [ RouterModule.forChild(ReutesStudent) ,CommonModule ,FormsModule ] ,
  declarations : [StudentComponent ,
    StudentDetailComponent ,
    StudentAddComponent ,
    StudentUpdateComponent ,
  ] ,
  providers : [StudentService]
})

export  class  StudentModule {

}

