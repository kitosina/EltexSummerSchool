package ru.Eltex.kitosina.ClassUser;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Manager")
public class Manager {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @Column(name="FIO")
    @Getter @Setter private String FIO;

    @Column(name="Email")
    @Getter @Setter private String Email;

    @Column(name="Phone")
    @Getter @Setter private String Phone;

    @OneToMany(mappedBy="manager")
    @Getter @Setter private List<Sales> sales;

    public Manager(Integer id,String FIO, String Email, String Phone){
        this.FIO=FIO;
        this.Email=Email;
        this.Phone=Phone;
        this.id=id;
    }

}
