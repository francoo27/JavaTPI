import { Injectable, EventEmitter } from '@angular/core';
import { IUser } from './user.model';

@Injectable()
export class LogStateService {
  public logStateEvent = new EventEmitter<IUser>();
}