package model.service;

/*
В нём создай класс для корзины — ShoppingCart. Добавь в него поле — массив элементов из объектов типа Food.
Понадобится конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины.
В классе ShoppingCart реализуй методы для работы с корзиной:
получить общую сумму товаров в корзине без скидки,
получить общую сумму товаров в корзине со скидкой,
получить общую сумму всех вегетарианских продуктов в корзине без скидки.
*/

import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    private Food[] food;
    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getSumWithoutDiscount() {
        double sum = 0;
            for (int i = 0; i < food.length; i++) {
                sum += food[i].getTotalPrice();
            }
        return sum;
    }

    public double getSumWithDiscount() {
        double sum = 0;
        for (Food food : this.food) {
            sum += food.getTotalPriceWithDiscount();
        }
        return sum;
    }

    public double getSumVegetarianWithoutDiscount() {
        double sum = 0;
        for (Food food : this.food) {
            if (food.isVegetarian()) {
                sum += food.getTotalPrice();
            }
        }
        return sum;
    }
}
