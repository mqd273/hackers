package com.tujia.ccs.provider.table;

/**
 * @Author:lidongw_1
 * @Date 2020/5/7
 * @Description: TODO
 **/
public class CalculateHotelMapTableNum {

    public static void main(String[] args) {

        Long conversationId = Long.valueOf("645116466962346048");
        int j = conversationId.hashCode();
        System.out.println("select * from conversation_hotel_map_" + (Math.abs(j)%256 + 1) + " where conversation_id = " + conversationId + ";");

    }
}
