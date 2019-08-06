package ru.Eltex.kitosina.ClassUser;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Sales")
public class Sales {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @ManyToOne()
    @JoinColumn(name="sales_id")
    @Getter @Setter private Manager manager;

    @Column(name="Sale")
    @Getter @Setter private String Sale;
}
