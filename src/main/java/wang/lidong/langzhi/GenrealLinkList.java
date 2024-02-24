package wang.lidong.langzhi;

import org.apache.poi.ss.formula.functions.T;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: TODO
 **/
public class GenrealLinkList {


    public static LinkNode<T> createLinkNodeList(int n){

        LinkNode fullTree = createFullTree(n, null);
        return fullTree;


    }

    static LinkNode<T> createFullTree(int n ,LinkNode<T> parent){

        if (n<= 0){
            return null;
        }


        LinkNode<T> node = new LinkNode();
        node.data = null;
        node.parent = parent;
        node.left = createFullTree(n-1,node);
        node.right = createFullTree(n-1,node);

        return node;

   }


    public static void main(String[] args) {

        int n = 3;
        LinkNode<T> linkNodeList = createLinkNodeList(n);
    }


}
