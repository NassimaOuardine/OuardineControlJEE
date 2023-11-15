package com.ouardine.nassimacontrole.controller;

import com.ouardine.nassimacontrole.entities.Categorie;
import com.ouardine.nassimacontrole.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorie")
public class CategorieController {
    @Autowired
    private CategoriesService service;

    @GetMapping
    public List<Categorie> findAllArticles() {
        return service.findAll();
    }

    @PostMapping
    public Categorie createArticle(@RequestBody Categorie categorie) {
        categorie.setId(0);
        return service.create(categorie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable int id) {
        Categorie categorie = service.findById(id);
        if (categorie == null) {
            return new ResponseEntity<Object>("categorie avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            return ResponseEntity.ok(categorie);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFiliere(@PathVariable int id, @RequestBody Categorie newCategorie) {
        Categorie oldcategorie = service.findById(id);
        if (oldcategorie == null) {
            return new ResponseEntity<Object>("Categorie avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            newCategorie.setId(id);
            return ResponseEntity.ok(service.update(newCategorie));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFiliere(@PathVariable int id) {
        Categorie categorie = service.findById(id);
        if (categorie == null) {
            return new ResponseEntity<Object>("categorie avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            service.delete(categorie);
            return ResponseEntity.ok("categorie supprimée");
        }
    }
}
