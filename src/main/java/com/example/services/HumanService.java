package com.example.services;

import com.example.domain.Human;
import com.example.repository.HumanRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Игорь on 29.06.2016.
 */
@Repository
@NoArgsConstructor
@Data
@Transactional
public class HumanService {
    @Autowired
    private HumanRepository humanRepository;

    public void save(Human human) {
        humanRepository.save(human);
    }

    public void delete(Human human){
        humanRepository.delete(human);
    }

    public Human findOne(long humanId) {
        return humanRepository.findOne(humanId);
    }

    public Iterable<Human> findAll(){
        return humanRepository.findAll();
    }
}
