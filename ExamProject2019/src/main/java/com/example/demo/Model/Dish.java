package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dish {
    @Id
    private int dish_id;
    private String dish_name;
    private double dish_weight;

    public Dish(){
    }

    public Dish(int dish_id, String dish_name, double dish_weight){
        this.dish_id = dish_id;
        this.dish_name = dish_name;
        this.dish_weight = dish_weight;
    }

    public int getDish_id() { return dish_id; }

    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public double getDish_weight() {
        return dish_weight;
    }

    public void setDish_weight(double dish_weight) { this.dish_weight = dish_weight; }
}
