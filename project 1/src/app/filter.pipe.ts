import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(books: any[], search: string): any {
   if(search === undefined){
    return books;

   }
   else{
     return books.filter(data=>{
       return data.bookName.toLowerCase().includes(search.toLowerCase());
     });
   }
  }

}
