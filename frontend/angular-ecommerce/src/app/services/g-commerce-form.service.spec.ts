import { TestBed } from '@angular/core/testing';

import { GCommerceFormService } from './g-commerce-form.service';

describe('GCommerceFormService', () => {
  let service: GCommerceFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GCommerceFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
