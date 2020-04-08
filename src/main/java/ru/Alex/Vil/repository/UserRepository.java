package ru.Alex.Vil.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Alex.Vil.models.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM a_user INNER JOIN user_car ON a_user.id = user_car.user_id", nativeQuery = true)
    List<User> prmSql();


    @Modifying
    @Query(value = "INSERT INTO a_user ( name, pass) VALUES ( 'vaska', 77)", nativeQuery = true)
    void sqlUpdata();
}

