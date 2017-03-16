import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { PolymerElement } from '@vaadin/angular2-polymer';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
    PolymerElement('paper-input'),
    PolymerElement('paper-material'),
    PolymerElement('tc-books'),
    PolymerElement('tc-book-form'),
    PolymerElement('paper-toast'),
    PolymerElement('paper-button'),
    PolymerElement('iron-ajax')
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
