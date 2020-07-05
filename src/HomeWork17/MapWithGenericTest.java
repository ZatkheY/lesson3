package HomeWork17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapWithGenericTest {
    private MapWithGeneric<Integer, String> map;

    @Before
    public void setUp() throws Exception {
        map = new MapWithGeneric<>();
    }

    @Test
    public void size() {
        Assert.assertEquals(0, map.size());
        map.put(1, "Hello");
        map.put(2, "Buy");
        map.put(3, "Hello");
        map.put(4, "Buy");
        map.put(5, "Hello");
        map.put(6, "Buy");
        map.put(7, "Hello");
        map.put(8, "Buy");
        map.put(9, "Hello");
        map.put(10, "Buy");
        map.put(11, "Hello");
        map.put(12, "Buy");
        map.put(13, "Hello");
        map.put(14, "Buy");
        map.put(15, "Hello");
        map.put(16, "Buy");
        map.put(17, "Hello");
        map.put(18, "Buy");
        Assert.assertEquals(18, map.size());
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue(map.isEmpty());
        map.put(1, "Hello");
        map.put(2, "Buy");
        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void containsKey() {
        map.put(1, "Hello");
        map.put(2, "Bill");
        map.put(3, "Buy");
        Assert.assertFalse(map.containsKey(4));
        Assert.assertTrue(map.containsKey(1));
    }

    @Test
    public void containsValue() {
        map.put(1, "Hello");
        map.put(2, "Buy");
        Assert.assertTrue(map.containsValue("Hello"));
        Assert.assertFalse(map.containsValue("gggg"));
    }

    @Test
    public void get() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        Assert.assertNotNull(map.get(2));
        Assert.assertSame("Bill", map.get(1));
    }

    @Test
    public void put() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        Assert.assertTrue(map.containsValue("Tramp"));
        Assert.assertTrue(map.containsKey(2));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void remove() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        Assert.assertTrue(map.containsValue("Tramp"));
        Assert.assertTrue(map.containsKey(2));
        Assert.assertSame("Tramp", map.remove(2));
        Assert.assertEquals(2, map.size());
        Assert.assertFalse(map.containsKey(2));
        Assert.assertFalse(map.containsValue("Tramp"));
    }

    @Test
    public void putAll() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");

        MapWithGeneric<Integer, String> map1 = new MapWithGeneric<>();

        map1.put(4, "ggg");
        map1.put(5, "haha");
        map1.put(6, "gigig");
        map.putAll(map1);
        Assert.assertEquals(6, map.size());
        Assert.assertTrue(map.containsValue("ggg"));
        Assert.assertTrue(map.containsKey(5));
    }

    @Test
    public void clear() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        Assert.assertTrue(map.containsKey(2));
        map.clear();
        Assert.assertFalse(map.containsValue("Tramp"));
    }

    @Test
    public void keySet() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        Set keys = map.keySet();
        Assert.assertTrue(keys.contains(2));
    }

    @Test
    public void values() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        Collection collection = map.values();
        Assert.assertTrue(collection.contains("Tramp"));
    }

    @Test
    public void entrySet() {
        map.put(1, "Bill");
        map.put(2, "Tramp");
        map.put(3, "Bush");
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}