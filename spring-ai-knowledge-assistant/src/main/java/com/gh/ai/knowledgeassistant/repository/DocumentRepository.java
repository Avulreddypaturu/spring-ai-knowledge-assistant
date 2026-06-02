package com.gh.ai.knowledgeassistant.repository;

import com.gh.ai.knowledgeassistant.domain.Document;
import com.gh.ai.knowledgeassistant.domain.DocumentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {
       List<Document> findByStatus(DocumentStatus documentStatus);
       List<Document> findByUploadedBy(String uploadedBy);
}
