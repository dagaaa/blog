package shop.repositories;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shop.models.Post;

import java.util.List;

@Repository
public interface PostRepository  extends JpaRepository<Post,Long>{
@Query ("select  p from Post p left join fetch p.author order by p.date desc")
    List<Post> findLatest5Posts(Pageable pageable);


}
