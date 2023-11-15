package com.ouardine.nassimacontrole.repositories;
import com.ouardine.nassimacontrole.entities.Article;
import com.ouardine.nassimacontrole.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer>  {
}
