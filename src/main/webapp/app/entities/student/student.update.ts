import {Component, OnInit} from '@angular/core';
import {StudentService} from './student.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {ActivatedRoute, Router} from '@angular/router';


@Component({
  selector: 'jhi-update',
  templateUrl: './student.update.html',
// providers:[StudentService],
})

export class StudentUpdateComponent implements OnInit{
  student = {
    id:'' ,
    hoTen: '',
    maGioiTinh : '' ,
    ngaySinh : '' ,
    quocTich : '' ,
    maSinhVien : ''
  };

  constructor(private studentService: StudentService, protected modalService: NgbModal,
              private router: Router , private  route : ActivatedRoute
  ) {


  }

  ngOnInit(): void {
    this.getStudent( this.route.snapshot.paramMap.get('id')) ;
  }
  SaveForm(){

    this.studentService.updateStudent(this.student.id, this.student)
      .subscribe(
        response => {
        });
    window.history.back() ;

  }

  getStudent(id : any): void {

      this.studentService.getStudent(id)
        .subscribe(
          data => {
            this.student = data;
          });

  }

}
