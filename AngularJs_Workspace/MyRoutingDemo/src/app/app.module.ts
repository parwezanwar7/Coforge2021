import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { OrderComponent } from './order/order.component';
import { BillingComponent } from './billing/billing.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    OrderComponent,
    BillingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
