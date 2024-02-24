package wang.lidong.demo1;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: 四项链表Node
 **/
public class Node<T> {

    T data;
    Node<T> up;
    Node<T> down;
    Node<T> left;
    Node<T> right;

    public Node(T data){
        this.data = data;
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
    }
}
