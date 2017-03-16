import { Component, ViewChild, ElementRef. Renderer } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  @ViewChild('books') tcBooks: ElementRef;
  title = 'app works!';

  constructor(private rd: Renderer) {}

  refresh() : void {
    console.log('ok, we can listen to events, but how to propagate?');
    this.rd.invokeElementMethod(this.tcBooks.nativeElement, 'refresh');
  }

}
