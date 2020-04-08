package ru.Alex.Vil.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Alex.Vil.models.Car;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {


    @Query(value = "SELECT * FROM a_car2 where marka = :markaAuto AND nomer=500 ", nativeQuery = true)
    List<Car> carSql(String markaAuto);


}
