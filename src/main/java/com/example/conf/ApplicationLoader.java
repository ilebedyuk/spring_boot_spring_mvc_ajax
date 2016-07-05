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
        knight.setName("HUMAN_Vanya");
        knight.setRank("knight");
        humanRepository.save(knight);

        Human footman = new Human();
        footman.setName("HUMAN_Petya");
        footman.setRank("footman");
        humanRepository.save(footman);

        Human footman1 = new Human();
        footman1.setName("HUMAN_Petya1");
        footman1.setRank("footman");
        humanRepository.save(footman1);

        Human footman2 = new Human();
        footman2.setName("HUMAN_Petya2");
        footman2.setRank("footman");
        humanRepository.save(footman2);

        Human footman3 = new Human();
        footman3.setName("HUMAN_Petya3");
        footman3.setRank("footman");
        humanRepository.save(footman3);

        Human footman4 = new Human();
        footman4.setName("ORKS_Petya4");
        footman4.setRank("footman");
        humanRepository.save(footman4);

        Human footman5 = new Human();
        footman5.setName("ORKS_Petya5");
        footman5.setRank("footman");
        humanRepository.save(footman5);

        Human footman6 = new Human();
        footman6.setName("ORKS_Petya6");
        footman6.setRank("footman");
        humanRepository.save(footman6);

        Human footman7 = new Human();
        footman7.setName("ORKS_Petya7");
        footman7.setRank("footman");
        humanRepository.save(footman7);

        Human footman8 = new Human();
        footman8.setName("ORKS_Petya8");
        footman8.setRank("footman");
        humanRepository.save(footman8);

        Human footman9 = new Human();
        footman9.setName("ORKS_Petya9");
        footman9.setRank("footman");
        humanRepository.save(footman9);

        Human footman10 = new Human();
        footman10.setName("ORKS_Petya10");
        footman10.setRank("footman");
        humanRepository.save(footman10);

//        Orks orks1 = new Orks();
//        orks1.setName("Ork1");
//        orks1.setRank("fighter");
//        orksRepository.save(orks1);
//
//        Orks orks2 = new Orks();
//        orks2.setName("Ork2");
//        orks2.setRank("monster");
//        orksRepository.save(orks2);
    }
}
