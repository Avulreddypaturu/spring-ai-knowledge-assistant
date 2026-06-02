package com.gh.ai.knowledgeassistant.controller;

import com.gh.ai.knowledgeassistant.dto.DocumentResponse;
import com.gh.ai.knowledgeassistant.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {
  private final DocumentService documentService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public DocumentResponse uploadDocument(
            @RequestParam("file") MultipartFile file,
            @RequestParam(value = "uploadedBy", defaultValue = "system") String uploadedBy
    ) {
        return documentService.uploadDocument(file, uploadedBy);
    }
}
