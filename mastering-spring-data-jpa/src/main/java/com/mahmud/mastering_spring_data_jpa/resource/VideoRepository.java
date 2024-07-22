package com.mahmud.mastering_spring_data_jpa.resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
