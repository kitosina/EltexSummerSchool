package ru.Eltex.kitosina;

import org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator;

import javax.persistence.*;

@Entity
@Table(name="Lang")
public class TableLang extends JtaPlatformInitiator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name="Langs")
    private String Langs;

}
