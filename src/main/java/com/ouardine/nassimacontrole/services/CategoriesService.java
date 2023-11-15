package com.ouardine.nassimacontrole.services;

import com.ouardine.nassimacontrole.dao.IDao;
import com.ouardine.nassimacontrole.entities.Article;
import com.ouardine.nassimacontrole.entities.Categorie;
import com.ouardine.nassimacontrole.repositories.ArticleRepository;
import com.ouardine.nassimacontrole.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService implements IDao<Categorie> {
    @Autowired
    private CategorieRepository repository;

    @Override
    public Categorie create(Categorie o) {
        return repository.save(o);
    }

    @Override
    public boolean delete(Categorie o) {
        try {
            repository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Categorie update(Categorie o) {
        return repository.save(o);
    }

    @Override
    public Categorie findById(long id) {
        return repository.findById(Math.toIntExact(id)).orElse(null);
    }

    @Override
    public List<Categorie> findAll() {
        return repository.findAll();
    }
}
