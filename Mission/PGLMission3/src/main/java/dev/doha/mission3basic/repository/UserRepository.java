package dev.doha.mission3basic.repository;

import dev.doha.mission3basic.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
