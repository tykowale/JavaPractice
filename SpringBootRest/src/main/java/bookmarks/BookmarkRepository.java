package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


/**
 * Created by tylerkowalewski on 11/29/15.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
