import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BooksinventryComponent } from './booksinventry.component';

describe('BooksinventryComponent', () => {
  let component: BooksinventryComponent;
  let fixture: ComponentFixture<BooksinventryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BooksinventryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BooksinventryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
