package com.gh.ai.knowledgeassistant.controller;

import com.gh.ai.knowledgeassistant.domain.Document;
import com.gh.ai.knowledgeassistant.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {
    private final DocumentRepository documentRepository;

    @PostMapping("/test")
    public Document test(){
        Document document = Document.builder()
                .title("Test Document")
                .fileName("test.pdf")
                .contentType("application/pdf")
                .uploadedAt(LocalDateTime.now())
                .build();

        documentRepository.save(document);

        return document;
    }


}
