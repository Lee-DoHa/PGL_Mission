package Post;

import java.util.Collection;
import java.util.List;

public interface BoardRepository {
    BoardDto save(BoardDto dto);
    Collection<BoardDto> findAll();
    BoardDto findById(Long id);
    boolean update(Long id, BoardDto dto);
    boolean delete(Long id);
}
