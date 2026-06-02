package com.gh.ai.knowledgeassistant.domain;
import jakarta.persistence.*;

import lombok.*;
import java.time.LocalDateTime;



@Entity
@Table(name = "documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String contentType;

    private Long fileSize;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DocumentStatus status;

    private String uploadedBy;

    @Column(nullable = false)
    private LocalDateTime uploadedAt;

    private LocalDateTime processedAt;
}

