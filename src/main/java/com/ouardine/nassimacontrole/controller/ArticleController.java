package com.ouardine.nassimacontrole.controller;

import com.ouardine.nassimacontrole.entities.Article;
import com.ouardine.nassimacontrole.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    @Autowired
    private ArticleService service;

    @GetMapping
    public List<Article> findAllArticles() {
        return service.findAll();
    }

    @PostMapping
    public Article createArticle(@RequestBody Article article) {
        article.setId(0);
        return service.create(article);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Article article = service.findById(id);
        if (article == null) {
            return new ResponseEntity<Object>("article avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            return ResponseEntity.ok(article);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFiliere(@PathVariable long id, @RequestBody Article newArticle) {
        Article oldArticle = service.findById((int) id);
        if (oldArticle == null) {
            return new ResponseEntity<Object>("Article avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            newArticle.setId(id);
            return ResponseEntity.ok(service.update(newArticle));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFiliere(@PathVariable long id) {
        Article article = service.findById(id);
        if (article == null) {
            return new ResponseEntity<Object>("article avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            service.delete(article);
            return ResponseEntity.ok("article supprimée");
        }
    }
}
