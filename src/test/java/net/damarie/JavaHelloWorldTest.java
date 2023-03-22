package net.damarie;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void testGetHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }

}