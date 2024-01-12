package wang.lidong.array;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:lidongw_1
 * @Date 2021/1/17
 * @Description: TODO
 **/
public class ArrayTest {

    public static void main(String[] args) {


        int a =1, b=2;

      //  if (b > 1) continue;

        while (2>1){

            break;
        }

        int[] ints = {1,3,4};
        Arrays.fill(ints,2);
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(Arrays.toString(ints));


        ArrayList al =new ArrayList<Integer>();

        for (int i = 0 ; i < 200 ; i++){
            al.add(i);
        }


        Object[] objects = al.stream().sorted(Comparator.reverseOrder()).limit(100).toArray();
        String join = Joiner.on(",").join(objects);

        System.out.println(join);

    }
}
