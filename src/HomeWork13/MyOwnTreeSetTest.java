package HomeWork13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class MyOwnTreeSetTest {
    private MyOwnTreeSet myOwnTreeSet;

    @Before
    public void setUp() throws Exception {
        myOwnTreeSet = new MyOwnTreeSet();
    }

    @Test
    public void size() {
        myOwnTreeSet.add(1);
        myOwnTreeSet.add(2);
        myOwnTreeSet.add(10);
        myOwnTreeSet.add(111);
        Assert.assertEquals(4, myOwnTreeSet.size());
        myOwnTreeSet.remove(2);
        Assert.assertEquals(3, myOwnTreeSet.size());
    }

    @Test
    public void sizeIsEmpty() {
        Assert.assertEquals(0, myOwnTreeSet.size());
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue(myOwnTreeSet.isEmpty());
    }

    @Test
    public void notEmpty() {
        myOwnTreeSet.add(1);
        Assert.assertFalse(myOwnTreeSet.isEmpty());
    }

    @Test
    public void contains() {
        myOwnTreeSet.add(2);
        myOwnTreeSet.add(3);
        myOwnTreeSet.add(10);
        Assert.assertFalse(myOwnTreeSet.contains(1));
        Assert.assertTrue(myOwnTreeSet.contains(3));
    }

    @Test
    public void toArray() {
        myOwnTreeSet.add(2);
        myOwnTreeSet.add(11);
        myOwnTreeSet.add(333);
        myOwnTreeSet.add(666);
        myOwnTreeSet.add(22);
        Object[] objects = myOwnTreeSet.toArray();
        Assert.assertEquals(5, objects.length);
        System.out.println(Arrays.toString(objects));
    }

    @Test
    public void add() {
        myOwnTreeSet.add(1);
        myOwnTreeSet.add(1);
        Assert.assertNotNull(myOwnTreeSet);
    }

    @Test
    public void remove() {
        myOwnTreeSet.add(10);
        myOwnTreeSet.add(3);
        myOwnTreeSet.add(1111);
        myOwnTreeSet.add(8);
        myOwnTreeSet.add(111);
        System.out.println(myOwnTreeSet);
        Assert.assertTrue(myOwnTreeSet.contains(3));
        Assert.assertFalse(myOwnTreeSet.remove(1));
        Assert.assertTrue(myOwnTreeSet.remove(10));
        System.out.println(myOwnTreeSet);
    }

    @Test
    public void addAll() {
        MyOwnTreeSet myOwnTreeSet1 = new MyOwnTreeSet();
        myOwnTreeSet1.add(2);
        myOwnTreeSet1.add(11);
        myOwnTreeSet1.add(5);
        myOwnTreeSet1.add(1);

        myOwnTreeSet.add(8);
        myOwnTreeSet.add(9);
        myOwnTreeSet.add(7);
        myOwnTreeSet.add(32);

        myOwnTreeSet.addAll(myOwnTreeSet1);
        Assert.assertEquals(8, myOwnTreeSet.size());
    }

    @Test
    public void clear() {
        myOwnTreeSet.add(8);
        myOwnTreeSet.add(9);
        myOwnTreeSet.add(33);
        myOwnTreeSet.add(32);
        Assert.assertEquals(4, myOwnTreeSet.size());
        myOwnTreeSet.clear();
        Assert.assertEquals(0, myOwnTreeSet.size());
    }

    @Test
    public void retainAll() {
        myOwnTreeSet.add(10);
        myOwnTreeSet.add(9);
        myOwnTreeSet.add(1);
        myOwnTreeSet.add(11);

        MyOwnTreeSet myOwnTreeSet1 = new MyOwnTreeSet();
        myOwnTreeSet1.add(1);
        myOwnTreeSet1.add(8);
        myOwnTreeSet1.add(7);
        myOwnTreeSet1.add(9);
        Assert.assertTrue(myOwnTreeSet.retainAll(myOwnTreeSet1));
        Assert.assertEquals(2,myOwnTreeSet.size());
    }

    @Test
    public void removeAll() {
        myOwnTreeSet.add(1);
        myOwnTreeSet.add(9);
        myOwnTreeSet.add(1101);
        myOwnTreeSet.add(11);

        MyOwnTreeSet myOwnTreeSet1 = new MyOwnTreeSet();
        myOwnTreeSet1.add(1);
        myOwnTreeSet1.add(9);
        myOwnTreeSet1.add(10);
        myOwnTreeSet1.add(11);
        Assert.assertTrue(myOwnTreeSet.removeAll(myOwnTreeSet1));
        Assert.assertEquals(1,myOwnTreeSet.size());
    }

    @Test
    public void containsAll() {
        myOwnTreeSet.add(10);
        myOwnTreeSet.add(9);
        myOwnTreeSet.add(90);
        myOwnTreeSet.add(3);

        MyOwnTreeSet myOwnTreeSet1 = new MyOwnTreeSet();
        myOwnTreeSet1.add(10);
        myOwnTreeSet1.add(9);
        myOwnTreeSet1.add(90);
        myOwnTreeSet1.add(3);
       Assert.assertTrue(myOwnTreeSet.containsAll(myOwnTreeSet1));
//       Assert.assertFalse(myOwnTreeSet.containsAll(myOwnTreeSet1));
    }
}