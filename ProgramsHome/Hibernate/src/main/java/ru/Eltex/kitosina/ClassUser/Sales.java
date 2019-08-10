package ru.Eltex.kitosina.ClassUser;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Sales")
public class Sales {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter @Setter private Integer id;

    @Column(name="Sale")
    @Getter @Setter private String Sale;

    @ManyToOne()
    @JoinColumn(name="sales_id")
    @Getter @Setter private Manager manager;

    public Sales(String Sale,Manager manager){
        this.Sale=Sale;
        this.manager=manager;
    }

}
