import {Component, OnInit} from '@angular/core';
import {StudentService} from './student.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {Router} from '@angular/router';

@Component({
  selector: 'jhi-student',
  templateUrl: './student.component.html',
  // providers:[StudentService],
})

export class StudentComponent implements OnInit{
  students: any ;

  constructor(private studentService: StudentService, protected modalService: NgbModal,
              private router: Router) {

  }

  retrieveTutorials(): void {
    this.studentService.getAll()
      .subscribe(
        data => {
          this.students = data;

        });
  }
  ngOnInit(): void{
    this.retrieveTutorials();

  }



  delete(id : any) {


      this.studentService.delete(id)
        .subscribe(
          response => {
            this.retrieveTutorials();
          });
    }

}


