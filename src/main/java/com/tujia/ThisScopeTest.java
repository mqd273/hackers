package com.tujia;

/**
 * Created by lidongw_1 on 2018/8/7.
 */
public class ThisScopeTest {


    static Class<? extends ThisScopeTest> s;

    {
        System.out.println(this.getClass());
    }

    ThisScopeTest() {
        //s = this.getClass();
        System.out.println(this.getClass());
    }

    public static void main(String[] arg) {

        ThisScopeTest thisScopeTest = new ThisScopeTest();


        new childClass(){
            @Override
            public void a() {
                System.out.println("aa    " + this.getClass());
            }
        }.process();

        childClass2 childClass2 = new childClass2();
        childClass2.process();

        // System.out.println(s.toString());

    }

    private abstract static class childClass{
        Class<? extends childClass> aClass = this.getClass();

        public abstract void a();

        public void process(){
            a();
            System.out.println("childClass 内部调用  "   + aClass);
        }
    }




    private static class childClass2{

          Class<? extends childClass2> aClass = this.getClass();
        public void process(){
            System.out.println("childClass2 内部调用  "   + aClass);
        }
    }
}

