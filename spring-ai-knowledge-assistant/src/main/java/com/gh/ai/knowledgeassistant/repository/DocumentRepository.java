package com.gh.ai.knowledgeassistant.repository;

import com.gh.ai.knowledgeassistant.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {

}
