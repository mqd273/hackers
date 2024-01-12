package com.tujia.interfaceTest;

/**
 * Created by lidongw_1 on 2018/12/4.
 */
public interface IATest {

    public default int getNum(){
        return  1;
    }

    public default int getNum2(){
        return 2;
    }

    int getNum3();
}
