import { Component, OnInit } from '@angular/core';
import { Billing } from '../billing';
import { ActivatedRoute, Router } from '@angular/router';
import { BillingService } from '../billing.service';

@Component({
  selector: 'app-update-billing',
  templateUrl: './update-billing.component.html',
  styleUrls: ['./update-billing.component.css']
})
export class UpdateBillingComponent implements OnInit {

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

  updateBilling() {
    this.billingService.updateBilling(this.id, this.billing)
      .subscribe((data: any) => {
        console.log(data);
        this.billing = new Billing();
        this.gotoList();
      }, (error: any) => console.log(error));
  }

  onSubmit() {
    this.updateBilling();    
  }

  gotoList() {
    this.router.navigate(['/billings']);
  }
}