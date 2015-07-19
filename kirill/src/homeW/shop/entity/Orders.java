package entity;

import java.time.LocalDate;

public class Orders {
    private int cod_product;
    private int cod_cheka;
    private int qty_product;
    private double price_order;
    private double income;
    private LocalDate order_date;

    public int getCod_product() {
        return cod_product;
    }

    public void setCod_product(int cod_product) {
        this.cod_product = cod_product;
    }

    public int getCod_cheka() {
        return cod_cheka;
    }

    public void setCod_cheka(int cod_cheka) {
        this.cod_cheka = cod_cheka;
    }

    public int getQty_product() {
        return qty_product;
    }

    public void setQty_product(int qty_product) {
        this.qty_product = qty_product;
    }

    public double getPrice_order() {
        return price_order;
    }

    public void setPrice_order(double price_order) {
        this.price_order = price_order;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }


}
