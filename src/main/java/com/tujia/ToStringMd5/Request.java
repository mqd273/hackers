package com.tujia.ToStringMd5;

import java.util.List;

/**
 * Created by lidongw_1 on 2018/8/29.
 */
public class Request {

    private long id;
    private Operator operator;
    private List<OrderByModel> orderByModelList;

    private EnumModel enumModel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<OrderByModel> getOrderByModelList() {
        return orderByModelList;
    }

    public void setOrderByModelList(List<OrderByModel> orderByModelList) {
        this.orderByModelList = orderByModelList;
    }

    public EnumModel getEnumModel() {
        return enumModel;
    }

    public void setEnumModel(EnumModel enumModel) {
        this.enumModel = enumModel;
    }
}
