package wang.lidong.demo1;

/**
 * @Author:lidongw_1
 * @Date 2024/1/12
 * @Description: main
 **/
public class ApplicationMain {

    public static void main(String[] args) {

        MultiDimensionalLinkedListGeneratorInt mg = new MultiDimensionalLinkedListGeneratorInt();
        FourWayLinkedList fourWayLinkedList = mg.generatorFourWayLinkList(3);

        mg.generateNodeHierarchy(fourWayLinkedList.head);

    }
}
