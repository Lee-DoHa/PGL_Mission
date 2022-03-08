package dev.doha.mission3basic.repository;

import dev.doha.mission3basic.entity.BaseEntity;
import dev.doha.mission3basic.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity, Long> {
}
