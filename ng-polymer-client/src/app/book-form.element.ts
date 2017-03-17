import {ElementRef, Injectable} from '@angular/core';

// Typing for the tc-book-form element exposing the methods to the outside
export interface BookFormElementRef extends ElementRef {

    nativeElement: BookFormElement;

}

export interface BookFormElement {

    open(id:Number) : void;

}