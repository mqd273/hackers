package wang.lidong.io;

/**
 * @Author:lidongw_1
 * @Date 2022/4/24
 * @Description: TODO
 **/
public class SortDemo {

    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6, 7, 8};

        Integer[] ints = sortArray(arr1, arr2);

        System.out.println(ints.toString());
    }

    static Integer[] sortArray(Integer[] arr1, Integer[] arr2) {

        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }

        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }

        //定义两个指针
        int a1 = 0;
        int a2 = 0;
        int i =  0;

        int countNum = arr1.length + arr2.length;
        Integer[] result = new Integer[countNum];

        while (true) {
            if (a1 >= arr1.length-1  && a2 >= arr2.length-1 ){
                break;
            }
            while (a1 < arr1.length ) {
                int lastA2 = a1 >= arr2.length ? arr2.length-1 : a2;
                if(arr1[a1] > arr2[lastA2] && a2 < lastA2 ){
                    break;
                }
                result[i] = arr1[a1];
                a1++;
                i++;
            }

            while (a2 < arr2.length) {
                int lastA1 = a1 >= arr1.length ? arr1.length-1 : a1;
                if (arr2[a2] > arr1[lastA1] && a1 < lastA1){
                    break;
                }
                result[i] = arr2[a2];
                i++;
                a2++;
            }
        }
        return result;
    }

}
