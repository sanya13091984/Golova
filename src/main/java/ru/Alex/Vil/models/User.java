package ru.Alex.Vil.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "a_user")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private Integer pass;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_car",                                //Подключаем табличку user_car(несущность).Она является посредником между таблицой a_user и a_car
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),        //user_id имеет foreng_key, ссылается на таблицу a_user в колонку id
            inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id")    //car_id имеет foreng_key, ссылается на таблицу a_car в колонку id
    )
    private List<Car> cars = new ArrayList<>();
}



