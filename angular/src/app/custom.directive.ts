import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';




@Directive({
    // tslint:disable-next-line: directive-selector
    selector : '[custDir]'
})




export class CustomDirective {
        constructor(public e1: ElementRef) {

            this.e1.nativeElement.style.backgroundColor = 'red';

        }

        @HostBinding('style.backgroundColor') backgroundColor = 'yellow';
        @HostListener('mouseenter')mouseEnterEvent(){
            this.e1.nativeElement.style.backgroundColor = 'green';

        }
        @HostListener('mouseleave') m() {
            this.e1.nativeElement.style.backgroundColor = 'blue';


        }
 }
 