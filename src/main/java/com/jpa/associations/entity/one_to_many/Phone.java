package com.jpa.associations.entity.one_to_many;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="phone")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String phoneNumber;

    @ManyToOne
    private Employe employe;

}
