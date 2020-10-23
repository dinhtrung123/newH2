import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {StudentService} from './student.service'

@Component({
    selector: ' jhi-detail',
    templateUrl: './student-detail.html'
  }
)

export class StudentDetailComponent implements OnInit {
  student = {
    hoTen: '',
    maGioiTinh : '' ,
    ngaySinh : '' ,
    quocTich : '' ,
    maSinhVien : ''
  };

  constructor(
    private studentService: StudentService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {

    this.getStudent(this.route.snapshot.paramMap.get('id') );

  }

  getStudent(id : any): void {
    this.studentService.getStudent(id)
      .subscribe(
        data => {
          this.student = data;

        });
  }

}
