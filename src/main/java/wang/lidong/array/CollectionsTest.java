package wang.lidong.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: TODO
 **/
public class CollectionsTest {

    public static void main(String[] args) {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>(15);

        Map<Integer, Integer> integerIntegerMap = Collections.synchronizedMap(integerIntegerHashMap);
    }
}
