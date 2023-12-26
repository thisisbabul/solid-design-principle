package ocp.example2;

import ocp.example2.models.FoodItem;

import java.util.List;

public class KitchenService {
    public void prepareFoodItems(List<FoodItem> foodItems) {
        foodItems.forEach(FoodPreparer::prepare);
    }
}
