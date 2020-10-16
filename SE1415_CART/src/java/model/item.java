package model;

public class item {

    private product pro;
    private int quantity;

    public item() {
    }

    public item(product pro, int quantity) {
        this.pro = pro;
        this.quantity = quantity;
    }

    public product getPro() {
        return pro;
    }

    public void setPro(product pro) {
        this.pro = pro;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
