package com.example.repository;

import com.example.domain.Human;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Игорь on 29.06.2016.
 */
public interface HumanRepository extends CrudRepository<Human,Long> {
}
