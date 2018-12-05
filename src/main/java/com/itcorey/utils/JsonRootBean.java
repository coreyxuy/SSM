/**
 * Copyright 2018 bejson.com
 */
package com.itcorey.utils;

import java.util.List;

/**
 * Auto-generated: 2018-12-05 17:17:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private boolean success;
    private Data data;
    private String errorCode;
    private String errorMsg;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

}

class Data {

    private String code;
    private String desc;
    private String trans_id;
    private String trade_no;
    private String fee;
    private String id_no;
    private String id_name;
    private String versions;
    private Result_detail result_detail;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_id() {
        return trans_id;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getFee() {
        return fee;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public String getId_no() {
        return id_no;
    }

    public void setId_name(String id_name) {
        this.id_name = id_name;
    }

    public String getId_name() {
        return id_name;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public String getVersions() {
        return versions;
    }

    public void setResult_detail(Result_detail result_detail) {
        this.result_detail = result_detail;
    }

    public Result_detail getResult_detail() {
        return result_detail;
    }

}


class Totaldebt_detail {

    private String totaldebt_order_count;
    private String totaldebt_date;
    private String totaldebt_order_amt;
    private String new_or_old;
    private String totaldebt_org_count;
    private String totaldebt_order_lend_amt;

    public void setTotaldebt_order_count(String totaldebt_order_count) {
        this.totaldebt_order_count = totaldebt_order_count;
    }

    public String getTotaldebt_order_count() {
        return totaldebt_order_count;
    }

    public void setTotaldebt_date(String totaldebt_date) {
        this.totaldebt_date = totaldebt_date;
    }

    public String getTotaldebt_date() {
        return totaldebt_date;
    }

    public void setTotaldebt_order_amt(String totaldebt_order_amt) {
        this.totaldebt_order_amt = totaldebt_order_amt;
    }

    public String getTotaldebt_order_amt() {
        return totaldebt_order_amt;
    }

    public void setNew_or_old(String new_or_old) {
        this.new_or_old = new_or_old;
    }

    public String getNew_or_old() {
        return new_or_old;
    }

    public void setTotaldebt_org_count(String totaldebt_org_count) {
        this.totaldebt_org_count = totaldebt_org_count;
    }

    public String getTotaldebt_org_count() {
        return totaldebt_org_count;
    }

    public void setTotaldebt_order_lend_amt(String totaldebt_order_lend_amt) {
        this.totaldebt_order_lend_amt = totaldebt_order_lend_amt;
    }

    public String getTotaldebt_order_lend_amt() {
        return totaldebt_order_lend_amt;
    }

}


class Result_detail {

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












