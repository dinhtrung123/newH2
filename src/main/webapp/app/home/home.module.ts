import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { NewH2SharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [NewH2SharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent],
})
export class NewH2HomeModule {}
