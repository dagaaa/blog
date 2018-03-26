package shop.services;

import shop.models.Post;

import java.util.List;

public interface PostService {
List<Post> findAll();
List<Post> findLatest5();
//List<Post> finByTitle();
Post edit(Post post);
Post findById(Long id);
Post create(Post post);
void deleteById(Long id);
}
