//package shop.services;
//
//import org.springframework.stereotype.Service;
//import shop.models.Post;
//import shop.models.User;
//
//import javax.xml.crypto.Data;
//import java.time.LocalDate;
//import java.util.*;
//import java.util.stream.Collectors;
//@Service
//public class PostServiceStubImpl implements PostService {
//
//    private User user= new User(10L,"Dagmara G", "dagaaa");
//    private User user1= new User(11L,"Aga D", "agaaa");
//    private List<Post> posts = new LinkedList<Post>(){{
//        add(new Post(1L, "First Post", "<p>Line #1.</p><p>Line #2</p>", user1, LocalDate.now()));
//        add(new Post(2L, "Second Post",
//                "<p>Second post content:<ul><li>line 1</li><li>line 2</li></ul></p>",
//                null,(LocalDate.of(2017,4,12))));
//        add(new Post(3L, "Post #3", "<p>The post number 3 nice</p>",
//                user1,LocalDate.of(2017,4,13)));
//        add(new Post(4L, "Forth Post", "<p>Not interesting post</p>", user1,LocalDate.now()));
//        add(new Post(5L, "Post Number 5", "<p>Just posting nanan\naaa\naaa\nnnnnnnnnnnnnnnnnnnnnnn" +
//                "nnnnnnnnn\nnnnnnnnnnnnnnnnnnn\nnnnnnnnnnnnnnnnnnnn" +
//                "nnnnnnnnnn\nnnnnnnnnnnnnnn\nnnnnnnnnnnnnnnnnnn" +
//                "nnnnnnnnnnnnnnnnn\nnnnnnnnnnnnnnnnnnn</p>", user, LocalDate.of(2015,5,12)));
//        add(new Post(6L, "Sixth Post", "<p>Another interesting post</p>", null,LocalDate.of(2017,3,17)));
//    }};
//
//
//    private Calendar changeCalendar(Calendar cal, int year, int month, int day){
//       cal.set(year,month,day);
//       return cal;
//    }
//    @Override
//    public List<Post> findAll() {
//        return posts;
//    }
//
//    @Override
//    public List<Post> findLatest5() {
//      return  posts.stream()
//              .sorted(Comparator.comparing(Post::getDate))
//              .limit(5).collect(Collectors.toList());
//    }
//
//    @Override
//    public Post edit(Post post) {
//       int index= posts.indexOf(findById(post.getId()));
//       if(index!=-1) {
//           posts.set(index, post);
//           return post;
//       }
//       throw new RuntimeException("Post not found "+ post.getId());
//
//    }
//
//    @Override
//    public Post findById(Long id) {
//        return posts.stream()
//                .filter(x->x.getId().equals(id))
//                .findFirst().orElse(null);
//    }
//
//    @Override
//    public Post create(Post post) {
//        posts.add(post);
//        return post;
//    }
//
//    @Override
//    public void deleteById(Long id) {
//       int index= posts.indexOf(findById(id));
//       if(index!=-1)
//        posts.remove(index);
//       else
//           throw new RuntimeException("Post not found " +id);
//
//    }
//}
