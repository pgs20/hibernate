package com.example.hibernate.reposiroty;

import com.example.hibernate.model.Person;
import com.example.hibernate.model.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByIdAgeLessThanOrderByIdAgeAsc(Integer age);

    Optional<Person> findByIdNameAndIdSurname(String name, String surname);
}
