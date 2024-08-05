package com.example.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="persons")
public class Person {
    @EmbeddedId
    private PersonId id;
    @Column(length = 12)
    private String phoneNumber;
    private String cityOfLiving;

    @Override
    public String toString() {
        return "{Person: name = " + getId().getName()
                + ", surname = " + getId().getSurname()
                + ", age = " + getId().getAge()
                + ", phoneNumber = " + phoneNumber
                + ", city = " + cityOfLiving + "}";
    }
}
