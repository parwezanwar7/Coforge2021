import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateBillingComponent } from './create-billing/create-billing.component';
import { BillingDetailsComponent } from './billing-details/billing-details.component';
import { BillingListComponent } from './billing-list/billing-list.component';
import { UpdateBillingComponent } from './update-billing/update-billing.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CreateBillingComponent,
    BillingDetailsComponent,
    BillingListComponent,
    UpdateBillingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
