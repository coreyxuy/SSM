package com.itcorey.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 第三方数据类
 */
public class XyTotaldebt implements Serializable {
    private static final long serialVersionUID = 2860710545517547595L;
    private Long id;

    private Long userId;

    private String code;

    private String desc;

    private String transId;

    private String tradeNo;

    private String fee;

    private String currentOrgCount;

    private String currentOrderCount;

    private String currentOrderAmt;

    private String currentOrderLendAmt;

    private String totaldebtDate;

    private String totaldebtOrgCount;

    private String totaldebtOrderCount;

    private String totaldebtOrderAmt;

    private String newOrOld;

    private String totaldebtOrderLendAmt;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getCurrentOrgCount() {
        return currentOrgCount;
    }

    public void setCurrentOrgCount(String currentOrgCount) {
        this.currentOrgCount = currentOrgCount == null ? null : currentOrgCount.trim();
    }

    public String getCurrentOrderCount() {
        return currentOrderCount;
    }

    public void setCurrentOrderCount(String currentOrderCount) {
        this.currentOrderCount = currentOrderCount == null ? null : currentOrderCount.trim();
    }

    public String getCurrentOrderAmt() {
        return currentOrderAmt;
    }

    public void setCurrentOrderAmt(String currentOrderAmt) {
        this.currentOrderAmt = currentOrderAmt == null ? null : currentOrderAmt.trim();
    }

    public String getCurrentOrderLendAmt() {
        return currentOrderLendAmt;
    }

    public void setCurrentOrderLendAmt(String currentOrderLendAmt) {
        this.currentOrderLendAmt = currentOrderLendAmt == null ? null : currentOrderLendAmt.trim();
    }

    public String getTotaldebtDate() {
        return totaldebtDate;
    }

    public void setTotaldebtDate(String totaldebtDate) {
        this.totaldebtDate = totaldebtDate == null ? null : totaldebtDate.trim();
    }

    public String getTotaldebtOrgCount() {
        return totaldebtOrgCount;
    }

    public void setTotaldebtOrgCount(String totaldebtOrgCount) {
        this.totaldebtOrgCount = totaldebtOrgCount == null ? null : totaldebtOrgCount.trim();
    }

    public String getTotaldebtOrderCount() {
        return totaldebtOrderCount;
    }

    public void setTotaldebtOrderCount(String totaldebtOrderCount) {
        this.totaldebtOrderCount = totaldebtOrderCount == null ? null : totaldebtOrderCount.trim();
    }

    public String getTotaldebtOrderAmt() {
        return totaldebtOrderAmt;
    }

    public void setTotaldebtOrderAmt(String totaldebtOrderAmt) {
        this.totaldebtOrderAmt = totaldebtOrderAmt == null ? null : totaldebtOrderAmt.trim();
    }

    public String getNewOrOld() {
        return newOrOld;
    }

    public void setNewOrOld(String newOrOld) {
        this.newOrOld = newOrOld == null ? null : newOrOld.trim();
    }

    public String getTotaldebtOrderLendAmt() {
        return totaldebtOrderLendAmt;
    }

    public void setTotaldebtOrderLendAmt(String totaldebtOrderLendAmt) {
        this.totaldebtOrderLendAmt = totaldebtOrderLendAmt == null ? null : totaldebtOrderLendAmt.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}