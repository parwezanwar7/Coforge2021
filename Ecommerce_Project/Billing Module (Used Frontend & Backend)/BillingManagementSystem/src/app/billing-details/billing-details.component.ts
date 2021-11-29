import {Billing } from '../billing';
import { Component, OnInit, Input } from '@angular/core';
import { BillingService } from '../billing.service';
import { BillingListComponent } from '../billing-list/billing-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-billing-details',
  templateUrl: './billing-details.component.html',
  styleUrls: ['./billing-details.component.css']
})
export class BillingDetailsComponent implements OnInit {

  id: number;
  billing: Billing;
  

  constructor(private route: ActivatedRoute,private router: Router,
    private billingService: BillingService) { }

  ngOnInit() {
    this.billing = new Billing();

    this.id = this.route.snapshot.params['id'];
    
    this.billingService.getBilling(this.id)
      .subscribe((data: any) => {
        console.log(data)
        this.billing = data;
      }, (error: any) => console.log(error));
  }

  list(){
    this.router.navigate(['billings']);
  }
}

