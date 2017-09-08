package io.joel.dao;

import io.joel.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by taddeimania on 9/8/17.
 */
@Repository
public interface AnimalDao extends JpaRepository<Animal, Long> {
}
