package wang.lidong.leetcode;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author:lidongw_1
 * @Date 2020/8/3
 * @Description: TODO
 **/
public class PathCount {


    public static void main(String[] args) {

        List<String> l = Lists.newArrayList();

        f(l,10);

    }


   static void f(List<String> list, int floorNum){

       f2(list , floorNum,0, null ,1);

       f2(list , floorNum,0, null ,2);
       for (String s : list) {
           System.out.println(s);
       }


       System.out.println(list.size());
    }

    static void  f2(List<String> list , int floorNum, int jumpNum, String path ,int step){

         if (!Strings.isNullOrEmpty(path)){
             jumpNum += step;
             path+= "," + step;
             if (jumpNum == floorNum) {
                 list.add(path);
                 return;
             }

             if (jumpNum > floorNum )
                 return;;
         }else {
             jumpNum = step;
             path = step + "";
         }

        f2(list,floorNum,jumpNum,path,1);

        f2(list,floorNum,jumpNum,path,2);
    }
}
