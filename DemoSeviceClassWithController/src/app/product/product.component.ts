import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Demoservice } from '../demo.service';
import { Product } from '../product';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  submitted = false;
  prod: Product = new Product();

  // inject the depedency of service class here
constructor(private demoservice1: Demoservice) { }

  ngOnInit(): void {
    
  }
// declared a user defined fucntions



save(){
 console.log(' I am calling from Product controller');
 this.demoservice1.getDetails();

}


}
