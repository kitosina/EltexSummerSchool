package ru.Eltex.kitosina;

import java.util.ArrayList;

public class sales {
    private ArrayList<String> items=new ArrayList<>();
    private ArrayList<Double> cost=new ArrayList<>();
    sales(ArrayList items, ArrayList cost){
        setCost(cost);
        setItems(items);
    }
    private void setItems(ArrayList items){
        this.items=items;
    }
    public ArrayList getItems(){
        return items;
    }
    private void setCost(ArrayList cost){
        this.cost=cost;
    }
    public ArrayList getCost(){
        return cost;
    }
}
