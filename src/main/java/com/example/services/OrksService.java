package com.example.services;

import com.example.domain.Orks;
import com.example.repository.OrksRepository;
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
public class OrksService {
    @Autowired
    private OrksRepository orksRepository;

    public void save(Orks orks) {
        orksRepository.save(orks);
    }

    public void delete(Orks orks){
        orksRepository.delete(orks);
    }

    public Orks findOne(long orkId) {
        return orksRepository.findOne(orkId);
    }

    public Iterable<Orks> findAll(){
        return orksRepository.findAll();
    }
}
