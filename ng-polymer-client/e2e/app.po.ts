import { browser, element, by } from 'protractor';

export class Summit2017WcMcNgClientPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('app-root h1')).getText();
  }
}
