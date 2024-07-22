package com.mahmud.mastering_spring_data_jpa.resource;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @GetMapping("{id}")
    public Video getVideo(@PathVariable Integer id) {
        Optional<Video> video = videoRepository.findById(id);
        return video.orElse(null);
    }

    @PostMapping
    public Video createVideo(@RequestBody Video video){
        video.setCreatedAt(LocalDateTime.now());
        video.setCreatedAt(LocalDateTime.now());
        return videoRepository.save(video);
    }

    @PutMapping("{id}")
    public Video updateVideo(@PathVariable Integer id, @RequestBody Video videoBody) {
        Video video = this.getVideo(id);
        if (video == null) return null;
        video.setType(videoBody.getType());
        video.setDescription(videoBody.getDescription());
        video.setUpdatedAt(LocalDateTime.now());
        return videoRepository.save(video);
    }

}
