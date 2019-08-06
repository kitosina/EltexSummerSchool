package ru.Eltex.kitosina.ClassUser;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Manager")
public class Manager {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @OneToMany(mappedBy="manager")
    @Getter @Setter private List<Sales> sales;

    @Column(name="FIO")
    @Getter @Setter private String FIO;

    @Column(name="Email")
    @Getter @Setter private String Email;

    @Column(name="Phone")
    @Getter @Setter private String Phone;
}
