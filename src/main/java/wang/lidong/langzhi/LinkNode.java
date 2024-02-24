package wang.lidong.langzhi;

import org.apache.poi.ss.formula.functions.T;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: TODO
 **/

public class LinkNode<T> {

  public   LinkNode<T> parent;
  public   LinkNode<T> left;
  public   LinkNode<T> right;
  public   T data;

  //  public LinkNode(T data) {
    //      this.data = data;
    //  }


    public LinkNode<T> getParent() {
        return parent;
    }

    public void setParent(LinkNode<T> parent) {
        this.parent = parent;
    }

    public LinkNode<T> getLeft() {
        return left;
    }

    public void setLeft(LinkNode<T> left) {
        this.left = left;
    }

    public LinkNode<T> getRight() {
        return right;
    }

    public void setRight(LinkNode<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
