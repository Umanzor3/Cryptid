import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginComponent } from './login/login.component';
import { LandingComponent } from './landing/landing.component';
import { NotFoundComponent } from './not-found/not-found.component';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    LoginComponent,
    LandingComponent,
    NotFoundComponent

  ]
})
export class CoreModule { }
