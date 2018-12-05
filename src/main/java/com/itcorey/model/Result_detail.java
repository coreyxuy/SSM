package com.itcorey.model;

import java.util.List;

public class Result_detail {

    private String current_order_count;
    private String current_org_count;
    private String current_order_amt;
    private String current_order_lend_amt;
    private List<Totaldebt_detail> totaldebt_detail;

    public void setCurrent_order_count(String current_order_count) {
        this.current_order_count = current_order_count;
    }

    public String getCurrent_order_count() {
        return current_order_count;
    }

    public void setCurrent_org_count(String current_org_count) {
        this.current_org_count = current_org_count;
    }

    public String getCurrent_org_count() {
        return current_org_count;
    }

    public void setCurrent_order_amt(String current_order_amt) {
        this.current_order_amt = current_order_amt;
    }

    public String getCurrent_order_amt() {
        return current_order_amt;
    }

    public void setCurrent_order_lend_amt(String current_order_lend_amt) {
        this.current_order_lend_amt = current_order_lend_amt;
    }

    public String getCurrent_order_lend_amt() {
        return current_order_lend_amt;
    }

    public void setTotaldebt_detail(List<Totaldebt_detail> totaldebt_detail) {
        this.totaldebt_detail = totaldebt_detail;
    }

    public List<Totaldebt_detail> getTotaldebt_detail() {
        return totaldebt_detail;
    }

}
