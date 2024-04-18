import { Component } from '@angular/core';
import { PostAddComponent } from './post-add/post-add.component';
import { PostListComponent } from './post-list/post-list.component';

@Component({
  selector: 'app-posts',
  standalone: true,
  imports: [PostAddComponent, PostListComponent],
  templateUrl: './posts.component.html',
  styleUrl: './posts.component.css'
})
export class PostsComponent {

}
