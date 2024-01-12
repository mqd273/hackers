package com.tujia.treadTest;

public class TestSync2 implements   Runnable
{


    int
            b
            =

            100;


    synchronized void
    m1
            ()

            throws

            InterruptedException

    {

        b = 1000  ;


        Thread
                .
                        sleep
                                (
                                        500
                                );

//6


        System
                .
                        out
                .
                        println
                                (
                                        "b="

                                                +
                                                b
                                );


    }


    synchronized void
    m2
            ()

            throws

            InterruptedException

    {


        Thread
                .
                        sleep
                                (
                                        250
                                );

//5

        b
                =

                2000
        ;


    }


    public

    static void    main   (String []   args)

            throws

            InterruptedException

    {


        TestSync2             tt                =                new                        TestSync2     ();


        Thread t  = new Thread(tt);

//1

        long s = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        t.start();//2

        Thread.sleep(10);
        tt.m2();//3
        System.out.println(System.currentTimeMillis());
        System.out.println("main thread b="+tt.b +" ff :" + (System.currentTimeMillis() - s)  );

//4


    }


    @Override


    public void
    run
            ()

    {


        try

        {

            m1
                    ();


        } catch

                (
                InterruptedException
                        e
                )

        {

            e
                    .
                            printStackTrace
                                    ();


        }


    }


}