// Last updated: 8/4/2025, 6:53:22 PM
import java.util.*;

class MyHashMap {
    private class Node {
        int key, value;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 1000;
    private LinkedList<Node>[] map;

    public MyHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Node node : map[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        map[index].add(new Node(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        for (Node node : map[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Iterator<Node> it = map[index].iterator();
        while (it.hasNext()) {
            if (it.next().key == key) {
                it.remove();
                return;
            }
        }
    }
}
