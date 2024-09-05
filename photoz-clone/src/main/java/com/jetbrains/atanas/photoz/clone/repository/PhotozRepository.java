package com.jetbrains.atanas.photoz.clone.repository;

import com.jetbrains.atanas.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
