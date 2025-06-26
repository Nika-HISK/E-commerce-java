package com.dailycodework.jigarishop.repository;

import com.dailycodework.jigarishop.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
