
import { BillingDetailsComponent } from './../billing-details/billing-details.component';
import { Observable } from "rxjs";
import { BillingService } from "./../billing.service";
import { Billing } from "./../billing";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: "app-billing-list",
  templateUrl: "./billing-list.component.html",
  styleUrls: ["./billing-list.component.css"]
})
export class BillingListComponent implements OnInit {
  billings: Observable<Billing[]>;

  constructor(private billingService: BillingService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.billings = this.billingService.getBillingsList();
  }

  deleteBilling(id: number) {
    this.billingService.deleteBilling(id)
      .subscribe(
        (        data: any) => {
          console.log(data);
          this.reloadData();
        },
        (        error: any) => console.log(error));
  }

  billingDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updateBilling(id: number){
    this.router.navigate(['update', id]);
  }
}
