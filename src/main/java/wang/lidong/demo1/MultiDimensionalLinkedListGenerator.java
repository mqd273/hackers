package wang.lidong.demo1;

import org.apache.poi.ss.formula.functions.T;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: 生成多维四项列表
 **/
public class MultiDimensionalLinkedListGenerator {


    public static <T> FourWayLinkedList<T> generateMultiDimensionalLinkedList(int n){

        if (n <= 0 ){
            return null;
        }


        FourWayLinkedList<T> result = new FourWayLinkedList<>();
        result.head = generateNodeHierarchy(n);

        return result;
    }

    private static <T> Node<T> generateNodeHierarchy(int n){

        if ( n<= 0){
            return null;
        }

        Node<T> node = new Node<T>(null);

        node.up = generateNodeHierarchy(n-1);
        node.down =generateNodeHierarchy(n-1);
        node.left = generateNodeHierarchy(n-1);
        node.right = generateNodeHierarchy(n-1);

        return node;
    }

    public static <T> void traverseMultiDimensionalLinkedList(Node<T> node){
        if (node == null){
            return;
        }

        System.out.println(node.data);

        traverseMultiDimensionalLinkedList(node.up);
        traverseMultiDimensionalLinkedList(node.down);
        traverseMultiDimensionalLinkedList(node.left);
        traverseMultiDimensionalLinkedList(node.right);
    }

    public static void main(String[] args) {

        int n = 3;
        FourWayLinkedList<Object> objectFourWayLinkedList = generateMultiDimensionalLinkedList(n);

        traverseMultiDimensionalLinkedList(objectFourWayLinkedList.head);

    }

}
