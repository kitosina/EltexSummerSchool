package ru.Eltex.kitosina;

import org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator;
import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatform;

import javax.persistence.*;

@Entity
@Table(name="CostItems")
public class TableCostIems extends JtaPlatformInitiator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name="Cost")
    private String Costs;

    @Column(name="Items")
    private String Items;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCosts() {
        return Costs;
    }

    public void setCosts(String costs) {
        Costs = costs;
    }

    public String getItems() {
        return Items;
    }

    public void setItems(String items) {
        Items = items;
    }
}
