package com.example.simsoft.repository;

import com.example.simsoft.entity.ReleaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepo extends CrudRepository<ReleaseEntity, Long> {
}
