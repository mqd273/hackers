package wang.lidong.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:lidongw_1
 * @Date 2021/12/28
 * @Description: TODO
 **/
public class listTest {

    public static void main(String[] args) {

        Integer[] ints = {2, 3, 4, 5};
        List<Integer> list = Lists.asList(1, ints);

        List<Integer> collect = list.stream().skip(10).limit(10).collect(Collectors.toList());


        System.out.println(collect);

    }
}
