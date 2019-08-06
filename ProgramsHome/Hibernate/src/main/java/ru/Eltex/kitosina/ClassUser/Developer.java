package ru.Eltex.kitosina.ClassUser;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Developer")
public class Developer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @ManyToMany(cascade = { CascadeType.ALL })
    @Getter @Setter private List<Lang> lang;

    @Column(name="FIO")
    @Getter @Setter private String FIO;

    @Column(name="Email")
    @Getter @Setter private String Email;

    @Column(name="Phone")
    @Getter @Setter private String Phone;

}
