package Tangram.adventures.com.dao;

import Tangram.adventures.com.Form;
import Tangram.adventures.com.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LevelRepository extends JpaRepository<Level, Integer> {

    Level findById(int id);



}