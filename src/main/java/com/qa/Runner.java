package com.qa;


import com.qa.maintests.GoogleTest;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runners.model.InitializationError;

public class Runner {

    public static void main(String[] args) throws InitializationError {

        //Junit Apporach
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(GoogleTest.class);


        //TestNG Approach
        /*TestNG test = new TestNG();
        test.setTestClasses(new Class[]{GoogleTest.class});
        test.run();
        System.exit(0);*/

        System.exit(0);
    }
}
