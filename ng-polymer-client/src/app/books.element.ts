import {ElementRef, Injectable} from '@angular/core';

// Typing for the tc-books element exposing the methods to the outside
export interface BooksElementRef extends ElementRef {

    nativeElement: BooksElement;

}

export interface BooksElement {

    refresh() : void;

}