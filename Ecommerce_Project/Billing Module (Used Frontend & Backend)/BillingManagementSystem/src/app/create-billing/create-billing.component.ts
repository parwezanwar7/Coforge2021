import { BillingService } from '../billing.service';
import { Billing } from '../billing';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-billing',
  templateUrl: './create-billing.component.html',
  styleUrls: ['./create-billing.component.css']
})
export class CreateBillingComponent implements OnInit {

  billing: Billing = new Billing();
  submitted = false;

  constructor(private billingService: BillingService,
    private router: Router) { }

  ngOnInit() {
  }

  newBilling(): void {
    this.submitted = false;
    this.billing = new Billing();
  }

  save() {

  this.billingService.createBilling(this.billing).subscribe((data: any) => {
      //  this.billing = new Billing();
    //  this.gotoList();
    }, 
    (    error: any) => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    // this method is called on click submit
  }

  gotoList() {
    this.router.navigate(['/billings']);
  }
}
