package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) o1.readObject();
        Collections.sort(a);
        Map<String, Boolean> mp = new HashMap<>();
        for (Pair x : a) {
            if (x.getFirst() < x.getSecond()) {
                if (!mp.containsKey(x.toString())) {
                    System.out.println(x);
                    mp.put(x.toString(), true);
                }
            }
        }
    }
}
