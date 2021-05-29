package day47_constructors;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
    private List<String> items;
    private int total = 70;


    public Shopping( int total) {
        this.items = new ArrayList<>();
        this.total = total;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "items=" + items +
                ", total=" + total +
                '}';
    }
}

