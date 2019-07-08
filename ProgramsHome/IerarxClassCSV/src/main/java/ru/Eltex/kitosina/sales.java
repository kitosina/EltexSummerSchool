package ru.Eltex.kitosina;

public class sales {
    private String[] items;
    private Double cost;
    sales(String[] items, Double cost){
        setCost(cost);
        setItems(items);
    }
    private void setItems(String[] items){

        this.items=items;
    }
    public String[] getItems(){

        return items;
    }
    private void setCost(Double cost){

        this.cost=cost;
    }
    public Double getCost(){

        return cost;
    }
}
