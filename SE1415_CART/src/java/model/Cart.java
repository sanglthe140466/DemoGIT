package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<item> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    private item getItemByID(int id) {
        for (item object : cart) {
            if (object.getPro().getId() == id) {
                return object;
            } else {
                return null;
            }
        }
        return null;
    }

    public void addItem(item t) {
        if (getItemByID(t.getPro().getId()) == null) {
            cart.add(t);
        } else {
            item m = getItemByID(t.getPro().getId());
            m.setQuantity(m.getQuantity() + m.getQuantity());
        }
    }

    public void deleteItem(int id) {
        if (getItemByID(id) != null) {
            cart.remove(getItemByID(id));
        }
    }

    public List<item> getCart() {
        return cart;
    }

    public double getTotalMoney(double sale) {
        double t = 0;
        for (item object : cart) {
            t += (object.getQuantity() * object.getPro().getPrice());
        }
        return t*(1-sale);
    }

}
