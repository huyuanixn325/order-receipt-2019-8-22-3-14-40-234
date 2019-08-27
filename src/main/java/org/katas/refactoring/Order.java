package org.katas.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String nm;
    private String addr;
    private List<LineItem> li;

    public Order(String nm, String addr, List<LineItem> li) {
        this.nm = nm;
        this.addr = addr;
        this.li = li;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getCustomerName() {
        return nm;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public void addLi(List<LineItem> li) {
        this.li.addAll(li);
    }

    public List<LineItem> getLineItems() {
        ArrayList<LineItem> lineItems = (ArrayList<LineItem>) li;
        return lineItems;
    }
}
