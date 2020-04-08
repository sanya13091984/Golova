package ru.Alex.Vil.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "a_car2")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "marka")
    private String marka;

    @Column(name = "nomer")
    private Integer nomer;


    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "cars")                    //cars ссылка на модель User в лист.
    private List<User> users = new ArrayList<>();

}

