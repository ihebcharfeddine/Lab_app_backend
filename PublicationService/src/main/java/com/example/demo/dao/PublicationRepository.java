package com.example.demo.dao;

import com.example.demo.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    

    List<Publication> findByTitre(String titre);
    

    List<Publication> findByType(String type);
    

    List<Publication> findByLien(String lien);
    

}
