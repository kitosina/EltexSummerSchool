package ru.Eltex.kitosina.ClassUser;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    public Developer(String FIO, String Email, String Phone, List<Lang> lang){
        this.FIO=FIO;
        this.Email=Email;
        this.Phone=Phone;
        this.lang=lang;
    }

}
