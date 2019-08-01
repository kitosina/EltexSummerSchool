package ru.Eltex.kitosina;

import org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator;

import javax.persistence.*;

@Entity
@Table(name="Developer")
public class TablesDeveloper extends JtaPlatformInitiator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "FIO")
    private String FIO;

    @Column(name="Email")
    private String Email;

    @Column(name="Phone")
    private String Phone;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
