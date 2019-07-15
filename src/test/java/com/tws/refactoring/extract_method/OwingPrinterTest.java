package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        //given
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("mike", new ArrayList<Order>());

        String result = "*****************************\r\n****** Customer totals ******\r\n*****************************\r\n"
                + "name: " + "mike\r\n" + "amount: " + 0.0 + "\r\n";
        assertEquals(outContent.toString(), result);
    }
}