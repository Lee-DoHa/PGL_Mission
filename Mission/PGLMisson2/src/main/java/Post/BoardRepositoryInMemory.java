package Post;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardRepositoryInMemory implements BoardRepository{
    private Long lastIndex = 0L;
    private final Map<Long, BoardDto> memory = new HashMap<>();

    @Override
    public BoardDto save(BoardDto dto) {
        lastIndex++;
        dto.setId(lastIndex);
        memory.put(lastIndex, dto);
        return memory.get(lastIndex);
    }

    @Override
    public Collection<BoardDto> findAll() {
        return memory.values();
    }

    @Override
    public BoardDto findById(Long id) {
        return memory.getOrDefault(id, null);
    }

    @Override
    public boolean update(Long id, BoardDto dto) {
        if(memory.containsKey(id)){
            dto.setId(id);
            memory.put(id, dto);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if (memory.containsKey(id)){
            memory.remove(id);
            return true;
        }
        return false;
    }
}
