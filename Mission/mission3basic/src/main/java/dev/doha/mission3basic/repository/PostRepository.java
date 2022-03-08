package dev.doha.mission3basic.repository;

import dev.doha.mission3basic.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}
