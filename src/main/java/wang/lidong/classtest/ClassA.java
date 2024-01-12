package wang.lidong.classtest;

/**
 * @Author:lidongw_1
 * @Date 2021/8/11
 * @Description: TODO
 **/
public class ClassA {


    private B abc;

    public B getAbc() {
        return abc;
    }

    public void setAbc(B abc) {
        this.abc = abc;
    }


    public static class  B{

        private  int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
