package com.gh.ai.knowledgeassistant.dto;

import com.gh.ai.knowledgeassistant.domain.DocumentStatus;

import java.time.LocalDateTime;

public record DocumentResponse(
        Long id,
        String title,
        String fileName,
        String contentType,
        Long fileSize,
        DocumentStatus status,
        String uploadedBy,
        LocalDateTime uploadedAt
) {
}