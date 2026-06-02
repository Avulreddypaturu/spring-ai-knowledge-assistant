package com.gh.ai.knowledgeassistant.service;

import com.gh.ai.knowledgeassistant.domain.Document;
import com.gh.ai.knowledgeassistant.domain.DocumentStatus;
import com.gh.ai.knowledgeassistant.dto.DocumentResponse;
import com.gh.ai.knowledgeassistant.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentResponse uploadDocument(MultipartFile file , String uploadedBy) {
        Document document = Document.builder()
                .title(file.getOriginalFilename())
                .fileName(file.getOriginalFilename())
                .contentType(file.getContentType())
                .fileSize(file.getSize())
                .status(DocumentStatus.UPLOADED)
                .uploadedBy(uploadedBy)
                .uploadedAt(LocalDateTime.now())
                .build();

        Document saved = documentRepository.save(document);

        return toResponse(saved);
    }

    private DocumentResponse toResponse(Document document) {
        return new DocumentResponse(
                document.getId(),
                document.getTitle(),
                document.getFileName(),
                document.getContentType(),
                document.getFileSize(),
                document.getStatus(),
                document.getUploadedBy(),
                document.getUploadedAt()
        );
    }
}
