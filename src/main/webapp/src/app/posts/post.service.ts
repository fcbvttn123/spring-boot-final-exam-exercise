import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Post } from './post';
import { EventEmitter } from "@angular/core";

const restUrl = '/api/v1/posts';

@Injectable({
  providedIn: 'root'
})

export class PostService {

  	constructor(private http: HttpClient) { }
  
  	getAll(): Observable<Post[]> {
		return this.http.get<Post[]>(restUrl);
	}
	
	create(data: any): Observable<any> {
		return this.http.post(restUrl, data);
	}
	
	onPostAdded = new EventEmitter<Post>();
  
}
