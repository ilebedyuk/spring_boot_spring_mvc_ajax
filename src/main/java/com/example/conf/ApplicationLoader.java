package com.example.conf;

import com.example.domain.Human;
import com.example.domain.Orks;
import com.example.repository.HumanRepository;
import com.example.repository.OrksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Игорь on 29.06.2016.
 */
@Component
public class ApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private HumanRepository humanRepository;

    @Autowired
    private OrksRepository orksRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Human knight = new Human();
        knight.setName("Vanya");
        knight.setRank("knight");
        humanRepository.save(knight);

        Human footman = new Human();
        footman.setName("Petya");
        footman.setRank("footman");
        humanRepository.save(footman);

        Orks orks1 = new Orks();
        orks1.setName("Ork1");
        orks1.setRank("fighter");
        orksRepository.save(orks1);

        Orks orks2 = new Orks();
        orks2.setName("Ork2");
        orks2.setRank("monster");
        orksRepository.save(orks2);
    }
}
