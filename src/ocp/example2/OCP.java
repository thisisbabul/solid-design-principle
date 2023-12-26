package ocp.example2;

import ocp.example2.models.FoodItem;
import ocp.example2.models.FriedFood;
import ocp.example2.models.GrilledFood;

import java.util.List;

public class OCP {
    public static void main(String[] args) {
        List<FoodItem> foodItems = List.of(
                new FriedFood("Steak"),
                new GrilledFood("Chicken")
        );
        KitchenService kitchenService = new KitchenService();
        kitchenService.prepareFoodItems(foodItems);
    }
}
