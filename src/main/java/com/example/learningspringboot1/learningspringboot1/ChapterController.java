package com.example.learningspringboot1.learningspringboot1;

import com.example.learningspringboot1.learningspringboot1.Chapter;
import com.example.learningspringboot1.learningspringboot1.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository chapterRepository;

     public  ChapterController(ChapterRepository chapterRepository)
    {   this.chapterRepository =chapterRepository;
    }
    @GetMapping("/chapters")
    public Flux<Chapter> listing()
    {
        return chapterRepository.findAll();

    }
}
