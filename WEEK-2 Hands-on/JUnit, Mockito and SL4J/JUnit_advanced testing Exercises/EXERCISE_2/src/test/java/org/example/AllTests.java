package org.example;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@SelectClasses({
        TestClassOne.class,
        TestClassTwo.class
})
public class AllTests {
}
