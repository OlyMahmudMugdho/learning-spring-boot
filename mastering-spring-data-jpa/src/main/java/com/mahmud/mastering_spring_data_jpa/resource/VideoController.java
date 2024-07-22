package com.mahmud.mastering_spring_data_jpa.resource;

import org.springframework.web.bind.annotation.*;

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
        return videoRepository.save(video);
    }

}
