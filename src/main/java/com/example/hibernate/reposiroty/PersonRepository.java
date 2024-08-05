package com.example.hibernate.reposiroty;

import com.example.hibernate.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
