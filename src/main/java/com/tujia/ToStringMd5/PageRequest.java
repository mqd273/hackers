package com.tujia.ToStringMd5;

/**
 * Created by lidongw_1 on 2018/8/29.
 */
public class PageRequest extends Request {

    private boolean queryAll;
    private int limit ;
    private int offset;

    public boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(boolean queryAll) {
        this.queryAll = queryAll;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
