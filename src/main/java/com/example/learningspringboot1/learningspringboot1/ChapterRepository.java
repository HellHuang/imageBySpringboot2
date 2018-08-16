package com.example.learningspringboot1.learningspringboot1;

import com.example.learningspringboot1.learningspringboot1.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
