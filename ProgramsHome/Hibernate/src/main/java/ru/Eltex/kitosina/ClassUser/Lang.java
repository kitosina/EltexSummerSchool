package ru.Eltex.kitosina.ClassUser;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Lang")
public class Lang {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @Column(name="Lang")
    @Getter @Setter private String Lang;

    public Lang(String Lang){
        this.Lang=Lang;
    }
}
