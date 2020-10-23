import {Component} from '@angular/core';
import {StudentService} from './student.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'jhi-add',
  templateUrl: './student.add.html',
// providers:[StudentService],
})

export class StudentAddComponent  {
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
    SaveForm(){
      this.studentService.addStudent( this.student)
        .subscribe(
          response => {
          });
      window.history.back() ;

    }
}
