package com.ouardine.nassimacontrole.repositories;

import com.ouardine.nassimacontrole.entities.Article;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
