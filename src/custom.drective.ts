import { Directive, ElementRef } from "@angular/core";



@Directive ({
     selector : '[custDir]',
 })


 export  class CustomDirective {
     constructor(public e1: ElementRef) {
         this.e1.nativeElement.style.background.color = 'red';
     }

   }