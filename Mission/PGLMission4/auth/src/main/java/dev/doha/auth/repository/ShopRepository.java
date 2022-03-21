package dev.doha.auth.repository;

import dev.doha.auth.entity.ShopEntity;
import org.springframework.data.repository.CrudRepository;

public interface ShopRepository extends CrudRepository<ShopEntity, Long> {
}