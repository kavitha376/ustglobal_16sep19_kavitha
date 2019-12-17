import { Component } from '@angular/core';



@Component({
    selector: 'app-help',
    templateUrl: './help.component.html',
    styleUrls: ['./help.component.css']
})


export class helpComponent {

    isActive = false;


    constructor() {
        setInterval(() => {
         this.isActive = !this.isActive;
        }, 2000);
    }
}
