package ru.Eltex.kitosina.ClassUser;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Lang")
public class Lang {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @Column(name="Lang")
    @Getter @Setter private String Lang;
}
