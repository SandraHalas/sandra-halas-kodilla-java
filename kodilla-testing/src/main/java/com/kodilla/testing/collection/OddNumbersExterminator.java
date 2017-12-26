package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {


    public List<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> even = new ArrayList<>();
        int temporaryValue = 0;
        for (int n=0; n < numbers.size(); n++) {
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0) {
                even.add(temporaryValue);
            }
        }
        return even;
    }
}
