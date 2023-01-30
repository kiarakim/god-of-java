package collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {

    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
    }


    public void getRandomNumberStatistics() {
        Random random = new Random();
        int runCount = DATA_BOUNDARY * 100;

        for (int i = 0; i < runCount; i++) {
            int temp = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(temp);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        } else {
            hashtable.put(tempNumber, 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keyset = hashtable.keySet();

        for (int key : keyset) {
            int count = hashtable.get(key);
            System.out.print(key + "=" + count + "\t");
            if (key % 10 == 1) {
                System.out.println();
            }
        }
    }
}
