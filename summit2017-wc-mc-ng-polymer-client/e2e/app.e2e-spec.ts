import { Summit2017WcMcNgClientPage } from './app.po';

describe('summit2017-wc-mc-ng-client App', function() {
  let page: Summit2017WcMcNgClientPage;

  beforeEach(() => {
    page = new Summit2017WcMcNgClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
