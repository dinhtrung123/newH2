import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      // {
      //   path: 'operation',
      //   loadChildren: () => import('./student/student.module').then(m => m.StudentModule),
      // },
      {
        path: 'student',
        loadChildren: () => import('./student/student.module').then(m => m.StudentModule),
      } ,


      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),

  ],
})
export class NewH2EntityModule {}
