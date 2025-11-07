package com.wesovilabs.festify.persistence.jpa.repository;

import com.wesovilabs.festify.persistence.jpa.entity.AlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumJpaRepositori extends JpaRepository<AlbumEntity,Long> {

}
