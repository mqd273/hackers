package wang.lidong.demo1;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: Integer 四维数组
 **/
public class MultiDimensionalLinkedListGeneratorInt<T extends Integer> {


    public  FourWayLinkedList<Integer> generatorFourWayLinkList(int n){

        if(n <= 0 ){
            return null;
        }

        FourWayLinkedList<Integer> result = new FourWayLinkedList<>();
        result.head = generatorFourWayNode(n);

        return result;
    }

    public  void generateNodeHierarchy(Node<Integer> node){

        if (node == null){
            return;
        }
        System.out.println(node.data);

        generateNodeHierarchy(node.up);
        generateNodeHierarchy(node.down);
        generateNodeHierarchy(node.left);
        generateNodeHierarchy(node.right);
    }

    private Node<Integer> generatorFourWayNode(int n){

        if (n <= 0){
            return null;
        }

        Node<Integer> node = new Node<>(Integer.valueOf(n));

        node.up = generatorFourWayNode(n-1);
        node.down = generatorFourWayNode(n-1);
        node.left = generatorFourWayNode(n-1);
        node.right = generatorFourWayNode(n-1);

        return node;
    }
}
