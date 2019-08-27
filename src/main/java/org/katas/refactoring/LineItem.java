package org.katas.refactoring;

public class LineItem {
    private String desc;
    private double p;
    private int qty;

    public LineItem(String desc, double p, int qty) {
        super();
        this.desc = desc;
        this.p = p;
        this.qty = qty;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescription() {
        return desc;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getPrice() {
        return p;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQuantity() {
        return qty;
    }


   public double totalAmount() {
        return p * qty;
    }
}