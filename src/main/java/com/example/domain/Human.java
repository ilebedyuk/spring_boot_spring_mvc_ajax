package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Игорь on 29.06.2016.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "humanid")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "rank")
    private String rank;
}
