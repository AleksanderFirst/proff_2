package entity;

import java.time.LocalDate;

public class Shipment {
    private int cod_shipment;
    private int cod_product;
    private int cod_supplier;
    private int qty_product;
    private double price_product;
    private LocalDate date_post;
    private double sum_shipment;

    public int getCod_shipment() {
        return cod_shipment;
    }

    public void setCod_shipment(int cod_shipment) {
        this.cod_shipment = cod_shipment;
    }

    public int getCod_product() {
        return cod_product;
    }

    public void setCod_product(int cod_product) {
        this.cod_product = cod_product;
    }

    public int getCod_supplier() {
        return cod_supplier;
    }

    public void setCod_supplier(int cod_supplier) {
        this.cod_supplier = cod_supplier;
    }

    public int getQty_product() {
        return qty_product;
    }

    public void setQty_product(int qty_product) {
        this.qty_product = qty_product;
    }

    public double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(double price_product) {
        this.price_product = price_product;
    }

    public LocalDate getDate_post() {
        return date_post;
    }

    public void setDate_post(LocalDate date_post) {
        this.date_post = date_post;
    }

    public double getSum_shipment() {
        return sum_shipment;
    }

    public void setSum_shipment(double sum_shipment) {
        this.sum_shipment = sum_shipment;
    }


}
