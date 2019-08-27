package org.katas.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String CustomerName;
    private String CustomerAddress;
    private List<LineItem> lineItems;

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public void addLineItems(List<LineItem> lineItems) {
        this.lineItems.addAll(lineItems);
    }

    public List<LineItem> getLineItems() {
        ArrayList<LineItem> itemsList = (ArrayList<LineItem>) lineItems;
        return lineItems;
    }
}
