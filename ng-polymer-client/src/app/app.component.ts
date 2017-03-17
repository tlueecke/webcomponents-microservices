import { Component, ViewChild, ElementRef, Renderer } from '@angular/core';
import { BooksElement, BooksElementRef } from './books.element';
import { BookFormElement, BookFormElementRef } from './book-form.element';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  @ViewChild('books') tcBooks: BooksElementRef;
  @ViewChild('bookform') tcBookForm: BookFormElementRef;
  title = 'app works!';

  constructor(private rd: Renderer) {}

  refresh() : void {
    this.tcBooks.nativeElement.refresh();
  }

  newBook() : void {
    this.tcBookForm.nativeElement.open(0);
  }
  
  open(event:any) {
    this.tcBookForm.nativeElement.open(event.detail);
  }
}
