package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CollectionTestSuite {
        @Before
        public void before(){
            System.out.println("Test Case: begin");
        }
        @After
        public void after(){
            System.out.println("\nTest Case: end");
        }
        @BeforeClass
        public static void beforeClass() {
            System.out.println("Test Suite: begin");
        }
        @AfterClass
        public static void afterClass() {
            System.out.println("Test Suite: end");
        }
        @Test
        public void testOddNumbersExterminatorEmptyList (){
            //Given
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            //When
            System.out.print("Testing:  ");
            for (int n=0; n < numbers.size(); n++) {
                System.out.print(numbers.get(n) + " ");
            }
            OddNumbersExterminator checkingOddNumbers = new OddNumbersExterminator();
            //Then
            assertEquals(Arrays.asList(), checkingOddNumbers.exterminate(numbers));
        }
    @Test
    public void testOddNumbersExterminatorNormalList  (){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,3,4,5,6,8));
        //When
        System.out.print("Testing:  ");
        for (int n=0; n < numbers.size(); n++) {
            System.out.print(numbers.get(n) + " ");
        }
        OddNumbersExterminator checkingOddNumbers = new OddNumbersExterminator();
        //Then
        assertEquals(Arrays.asList(4,6,8), checkingOddNumbers.exterminate(numbers));
    }
}
