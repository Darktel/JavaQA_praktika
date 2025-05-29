package model;


/*
Класс Meat — для мяса. Это класс с конструктором. Конструктор принимает два входных параметра — количество и цену.

 */
public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price, false);
    }
}
