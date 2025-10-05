import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.x;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean19 = point12.equals((java.lang.Object) double18);
        boolean boolean20 = point2.equals((java.lang.Object) point12);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        java.lang.Double double25 = point23.x;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        point28.y = (-1.0d);
        java.lang.Double double33 = point28.y;
        java.lang.Double double34 = point28.y;
        point28.y = 1.0d;
        java.lang.Class<?> wildcardClass37 = point28.getClass();
        boolean boolean38 = point23.equals((java.lang.Object) wildcardClass37);
        point23.y = 100.0d;
        java.lang.Double double41 = point23.x;
        Line line42 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.y;
        point14.y = 10.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        boolean boolean26 = point23.equals((java.lang.Object) 10.0f);
        point23.x = 100.0d;
        java.lang.Double double29 = point23.x;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point32.x = 100.0d;
        boolean boolean35 = point23.equals((java.lang.Object) 100.0d);
        java.lang.Double double36 = point23.y;
        point23.y = 100.0d;
        boolean boolean39 = point14.equals((java.lang.Object) point23);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.x;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean49 = point47.equals((java.lang.Object) true);
        boolean boolean50 = point42.equals((java.lang.Object) true);
        java.lang.Double double51 = point42.y;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        point54.y = 0.0d;
        boolean boolean60 = point42.equals((java.lang.Object) point54);
        boolean boolean61 = point23.equals((java.lang.Object) point54);
        boolean boolean62 = point2.equals((java.lang.Object) point23);
        point23.y = 100.0d;
        java.lang.Double double65 = point23.x;
        Point point68 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double69 = point68.y;
        java.lang.Double double70 = point68.x;
        java.lang.Double double71 = point68.x;
        point68.y = 0.0d;
        boolean boolean75 = point68.equals((java.lang.Object) '#');
        point68.x = 0.0d;
        point68.y = 100.0d;
        point68.x = 10.0d;
        Line line82 = new Line(point23, point68);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        point2.x = (-1.0d);
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        java.lang.Double double24 = point17.y;
        point17.y = 100.0d;
        java.lang.Double double27 = point17.x;
        java.lang.Double double28 = point17.x;
        java.lang.Double double29 = point17.y;
        point17.y = 0.0d;
        point17.y = 10.0d;
        java.lang.Double double34 = point17.x;
        Line line35 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 1.0d;
        java.lang.Object obj18 = null;
        boolean boolean19 = point12.equals(obj18);
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point22.y = 0.0d;
        java.lang.Double double25 = point22.y;
        java.lang.Double double26 = point22.x;
        point22.x = 1.0d;
        boolean boolean29 = point12.equals((java.lang.Object) 1.0d);
        java.lang.Double double30 = point12.y;
        java.lang.Double double31 = point12.x;
        point12.y = 1.0d;
        point12.x = 10.0d;
        Line line36 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = (-1.0d);
        java.lang.Double double24 = point2.x;
        point2.y = 1.0d;
        point2.x = (-1.0d);
        java.lang.Double double29 = point2.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 100.0d;
        point32.x = 10.0d;
        point32.x = 10.0d;
        point32.x = 10.0d;
        java.lang.Double double44 = point32.x;
        Line line45 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        java.lang.Double double16 = point12.y;
        boolean boolean17 = point9.equals((java.lang.Object) double16);
        java.lang.Double double18 = point9.y;
        java.lang.Double double19 = point9.x;
        point9.x = 100.0d;
        java.lang.Double double22 = point9.y;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        java.lang.Double double30 = point28.y;
        boolean boolean31 = point25.equals((java.lang.Object) point28);
        java.lang.Double double32 = point28.x;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        boolean boolean41 = point38.equals((java.lang.Object) 1L);
        java.lang.Double double42 = point38.y;
        boolean boolean43 = point35.equals((java.lang.Object) double42);
        point35.x = 10.0d;
        java.lang.Double double46 = point35.x;
        point35.x = 10.0d;
        java.lang.Class<?> wildcardClass49 = point35.getClass();
        boolean boolean50 = point28.equals((java.lang.Object) wildcardClass49);
        boolean boolean51 = point9.equals((java.lang.Object) point28);
        boolean boolean52 = point2.equals((java.lang.Object) point28);
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 1.0d;
        point55.x = 100.0d;
        point55.x = 10.0d;
        point55.x = 10.0d;
        point55.x = 10.0d;
        boolean boolean67 = point2.equals((java.lang.Object) point55);
        Point point70 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point70.y = 1.0d;
        point70.y = (-1.0d);
        java.lang.Double double75 = point70.y;
        java.lang.Double double76 = point70.y;
        Line line77 = new Line(point2, point70);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        point2.y = 0.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        point17.y = (-1.0d);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        point24.y = 10.0d;
        boolean boolean28 = point17.equals((java.lang.Object) 10.0d);
        java.lang.Double double29 = point17.y;
        java.lang.Double double30 = point17.y;
        java.lang.Double double31 = point17.x;
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 0.0d;
        java.lang.Double double38 = point34.y;
        point34.y = (-1.0d);
        point34.y = 100.0d;
        java.lang.Double double43 = point34.y;
        boolean boolean44 = point17.equals((java.lang.Object) point34);
        point17.y = 0.0d;
        java.lang.Double double47 = point17.x;
        Line line48 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        boolean boolean23 = point14.equals((java.lang.Object) point18);
        boolean boolean24 = point2.equals((java.lang.Object) point18);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point37.x = 1.0d;
        point37.y = 1.0d;
        boolean boolean42 = point34.equals((java.lang.Object) 1.0d);
        java.lang.Double double43 = point34.y;
        java.lang.Double double44 = point34.y;
        java.lang.Double double45 = point34.x;
        java.lang.Double double46 = point34.y;
        boolean boolean47 = point27.equals((java.lang.Object) double46);
        boolean boolean48 = point2.equals((java.lang.Object) double46);
        java.lang.Double double49 = point2.x;
        point2.y = 0.0d;
        point2.y = 10.0d;
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point60 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point60.y = (-1.0d);
        java.lang.Double double63 = point60.y;
        java.lang.Double double64 = point60.y;
        java.lang.Double double65 = point60.x;
        Line line66 = new Line(point2, point60);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 1.0d;
        java.lang.Object obj16 = null;
        boolean boolean17 = point10.equals(obj16);
        point10.x = 1.0d;
        boolean boolean21 = point10.equals((java.lang.Object) false);
        java.lang.Double double22 = point10.x;
        java.lang.Double double23 = point10.x;
        point10.y = (-1.0d);
        java.lang.Double double26 = point10.y;
        Line line27 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point8.y = 10.0d;
        java.lang.Double double11 = point8.x;
        java.lang.Double double12 = point8.x;
        java.lang.Double double13 = point8.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        java.lang.Double double20 = point16.y;
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = point16.equals(obj21);
        java.lang.Double double23 = point16.y;
        java.lang.Class<?> wildcardClass24 = point16.getClass();
        boolean boolean25 = point8.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = point2.equals((java.lang.Object) point8);
        point2.y = 10.0d;
        java.lang.Double double29 = point2.y;
        java.lang.Double double30 = point2.y;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        java.lang.Double double38 = point33.x;
        java.lang.Double double39 = point33.y;
        point33.y = (-1.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        java.lang.Double double48 = point44.y;
        java.lang.Object obj49 = new java.lang.Object();
        boolean boolean50 = point44.equals(obj49);
        point44.x = 1.0d;
        java.lang.Double double53 = point44.x;
        point44.y = 0.0d;
        java.lang.Class<?> wildcardClass56 = point44.getClass();
        boolean boolean57 = point33.equals((java.lang.Object) wildcardClass56);
        java.lang.Double double58 = point33.y;
        point33.x = 0.0d;
        Line line61 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double11 = point10.x;
        java.lang.Double double12 = point10.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 10.0d;
        boolean boolean19 = point10.equals((java.lang.Object) point15);
        java.lang.Class<?> wildcardClass20 = point10.getClass();
        boolean boolean21 = point2.equals((java.lang.Object) wildcardClass20);
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.x;
        java.lang.Double double26 = point24.y;
        point24.y = (-1.0d);
        java.lang.Double double29 = point24.y;
        java.lang.Double double30 = point24.x;
        java.lang.Double double31 = point24.y;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.y;
        java.lang.Double double39 = point34.x;
        java.lang.Double double40 = point34.x;
        boolean boolean41 = point24.equals((java.lang.Object) point34);
        point34.x = 0.0d;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point46.y = (-1.0d);
        java.lang.Object obj49 = null;
        boolean boolean50 = point46.equals(obj49);
        boolean boolean51 = point34.equals((java.lang.Object) point46);
        point34.y = 10.0d;
        point34.y = 1.0d;
        Line line56 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.y = 100.0d;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double18 = point17.x;
        java.lang.Double double19 = point17.y;
        point17.y = 1.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point17);
        java.lang.Double double23 = point2.x;
        java.lang.Double double24 = point2.y;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.y;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        java.lang.Double double37 = point33.y;
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = point33.equals(obj38);
        point33.x = 1.0d;
        java.lang.Double double42 = point33.x;
        boolean boolean43 = point27.equals((java.lang.Object) double42);
        java.lang.Double double44 = point27.x;
        point27.x = 10.0d;
        java.lang.Double double47 = point27.x;
        point27.x = 0.0d;
        Point point52 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.x;
        java.lang.Double double54 = point52.y;
        point52.y = (-1.0d);
        point52.y = 0.0d;
        java.lang.Double double59 = point52.x;
        boolean boolean60 = point27.equals((java.lang.Object) point52);
        java.lang.Double double61 = point52.y;
        Line line62 = new Line(point2, point52);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 1.0d;
        java.lang.Double double15 = point9.y;
        java.lang.Double double16 = point9.x;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        java.lang.Double double21 = point19.x;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        boolean boolean26 = point19.equals((java.lang.Object) double25);
        boolean boolean27 = point9.equals((java.lang.Object) point19);
        boolean boolean28 = point2.equals((java.lang.Object) boolean27);
        java.lang.Double double29 = point2.y;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point32.x = 100.0d;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        boolean boolean43 = point40.equals((java.lang.Object) 1L);
        java.lang.Double double44 = point40.y;
        boolean boolean45 = point37.equals((java.lang.Object) double44);
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point48.y = 1.0d;
        point48.y = (-1.0d);
        point48.y = 100.0d;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass58 = point57.getClass();
        boolean boolean59 = point48.equals((java.lang.Object) point57);
        boolean boolean60 = point37.equals((java.lang.Object) point57);
        java.lang.Double double61 = point37.y;
        boolean boolean62 = point32.equals((java.lang.Object) point37);
        Line line63 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 100.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 0.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        point15.x = 0.0d;
        java.lang.Double double24 = point15.x;
        java.lang.Double double25 = point15.x;
        Line line26 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 1.0d;
        java.lang.Object obj20 = null;
        boolean boolean21 = point14.equals(obj20);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point24.y = 0.0d;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.x;
        point24.x = 1.0d;
        boolean boolean31 = point14.equals((java.lang.Object) 1.0d);
        boolean boolean32 = point2.equals((java.lang.Object) point14);
        point2.x = 0.0d;
        point2.y = 100.0d;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.y;
        point39.y = 10.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.x;
        boolean boolean51 = point48.equals((java.lang.Object) 10.0f);
        point48.x = 100.0d;
        java.lang.Double double54 = point48.x;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point57.x = 100.0d;
        boolean boolean60 = point48.equals((java.lang.Object) 100.0d);
        java.lang.Double double61 = point48.y;
        point48.y = 100.0d;
        boolean boolean64 = point39.equals((java.lang.Object) point48);
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double68 = point67.y;
        java.lang.Double double69 = point67.x;
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean74 = point72.equals((java.lang.Object) true);
        boolean boolean75 = point67.equals((java.lang.Object) true);
        java.lang.Double double76 = point67.y;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        point79.y = 1.0d;
        point79.y = 0.0d;
        boolean boolean85 = point67.equals((java.lang.Object) point79);
        boolean boolean86 = point48.equals((java.lang.Object) point79);
        java.lang.Double double87 = point79.x;
        java.lang.Double double88 = point79.x;
        point79.x = 10.0d;
        point79.x = (-1.0d);
        point79.y = 10.0d;
        Line line95 = new Line(point2, point79);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        java.lang.Double double11 = point9.x;
        point9.y = 0.0d;
        java.lang.Double double14 = point9.x;
        java.lang.Double double15 = point9.y;
        boolean boolean16 = point2.equals((java.lang.Object) point9);
        point9.y = (-1.0d);
        Point point21 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.x;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        java.lang.Class<?> wildcardClass36 = point28.getClass();
        boolean boolean37 = point24.equals((java.lang.Object) point28);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point40.y = 100.0d;
        point40.y = 0.0d;
        boolean boolean45 = point24.equals((java.lang.Object) 0.0d);
        point24.y = 100.0d;
        boolean boolean48 = point21.equals((java.lang.Object) 100.0d);
        java.lang.Double double49 = point21.x;
        point21.y = 10.0d;
        Line line52 = new Line(point9, point21);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        point2.x = 1.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point22.y = 0.0d;
        java.lang.Double double25 = point22.y;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.x;
        boolean boolean30 = point22.equals((java.lang.Object) double29);
        java.lang.Double double31 = point22.x;
        point22.y = 100.0d;
        java.lang.Double double34 = point22.y;
        Line line35 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.y = 0.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point14);
        java.lang.Double double21 = point2.y;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double26 = point2.x;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 100.0d;
        java.lang.Double double33 = point29.y;
        java.lang.Object obj34 = null;
        boolean boolean35 = point29.equals(obj34);
        point29.x = (-1.0d);
        Line line38 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.x;
        point2.x = 10.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        java.lang.Object obj25 = null;
        boolean boolean26 = point19.equals(obj25);
        point19.x = 1.0d;
        boolean boolean30 = point19.equals((java.lang.Object) false);
        java.lang.Double double31 = point19.x;
        java.lang.Double double32 = point19.x;
        java.lang.Double double33 = point19.y;
        boolean boolean34 = point2.equals((java.lang.Object) point19);
        java.lang.Double double35 = point19.x;
        Point point36 = null;
        Line line37 = new Line(point19, point36);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point8.x = 1.0d;
        point8.y = 1.0d;
        boolean boolean13 = point5.equals((java.lang.Object) 1.0d);
        java.lang.Double double14 = point5.y;
        point5.x = 0.0d;
        point5.y = (-1.0d);
        point5.y = 100.0d;
        java.lang.Double double21 = point5.y;
        Line line22 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj3 = null;
        boolean boolean4 = point2.equals(obj3);
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 100.0d;
        point7.x = 10.0d;
        java.lang.Double double15 = point7.y;
        point7.y = 0.0d;
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 100.0d;
        boolean boolean24 = point7.equals((java.lang.Object) point20);
        point20.y = 1.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        point29.y = 1.0d;
        java.lang.Double double34 = point29.x;
        point29.x = (-1.0d);
        java.lang.Class<?> wildcardClass37 = point29.getClass();
        boolean boolean38 = point20.equals((java.lang.Object) wildcardClass37);
        boolean boolean39 = point2.equals((java.lang.Object) wildcardClass37);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point42.y = 0.0d;
        java.lang.Double double45 = point42.y;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        java.lang.Double double52 = point48.y;
        java.lang.Object obj53 = new java.lang.Object();
        boolean boolean54 = point48.equals(obj53);
        point48.x = 1.0d;
        java.lang.Double double57 = point48.x;
        boolean boolean58 = point42.equals((java.lang.Object) double57);
        java.lang.Double double59 = point42.x;
        point42.x = 10.0d;
        java.lang.Double double62 = point42.x;
        java.lang.Double double63 = point42.y;
        point42.y = 1.0d;
        Line line66 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double13 = point12.y;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        point16.y = 1.0d;
        point16.y = (-1.0d);
        boolean boolean23 = point12.equals((java.lang.Object) point16);
        java.lang.Double double24 = point16.x;
        point16.x = 0.0d;
        boolean boolean27 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double28 = point2.x;
        Point point31 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.x;
        Line line33 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        point7.x = 10.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point7);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        point20.y = 10.0d;
        boolean boolean26 = point7.equals((java.lang.Object) point20);
        java.lang.Double double27 = point7.x;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.y;
        point30.y = (-1.0d);
        boolean boolean36 = point7.equals((java.lang.Object) (-1.0d));
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.y;
        point39.y = 0.0d;
        point39.y = 1.0d;
        point39.y = 1.0d;
        boolean boolean50 = point7.equals((java.lang.Object) point39);
        java.lang.Double double51 = point39.x;
        java.lang.Double double52 = point39.y;
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point55.y = 1.0d;
        Point point60 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point60.y = 1.0d;
        java.lang.Double double63 = point60.y;
        java.lang.Double double64 = point60.y;
        point60.y = 0.0d;
        point60.x = 10.0d;
        point60.y = 1.0d;
        boolean boolean71 = point55.equals((java.lang.Object) 1.0d);
        java.lang.Double double72 = point55.y;
        point55.x = 100.0d;
        point55.x = 100.0d;
        Line line77 = new Line(point39, point55);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.x;
        boolean boolean9 = point6.equals((java.lang.Object) 10.0f);
        point6.x = 100.0d;
        java.lang.Double double12 = point6.x;
        point6.y = 1.0d;
        point6.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        point6.x = (-1.0d);
        point6.y = (-1.0d);
        Point point24 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.x;
        java.lang.Double double35 = point33.y;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        boolean boolean38 = point28.equals((java.lang.Object) point33);
        boolean boolean39 = point24.equals((java.lang.Object) point28);
        point24.y = 1.0d;
        boolean boolean42 = point6.equals((java.lang.Object) point24);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        boolean boolean48 = point45.equals((java.lang.Object) 1L);
        point45.y = (-1.0d);
        java.lang.Double double51 = point45.y;
        java.lang.Double double52 = point45.y;
        point45.y = 10.0d;
        point45.y = 0.0d;
        point45.y = 0.0d;
        java.lang.Double double59 = point45.y;
        java.lang.Double double60 = point45.x;
        Line line61 = new Line(point6, point45);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.x = 10.0d;
        java.lang.Double double22 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double25 = point14.x;
        point14.y = (-1.0d);
        point14.y = 10.0d;
        point14.x = 10.0d;
        Line line32 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        java.lang.Double double5 = point2.x;
        point2.x = (-1.0d);
        Point point10 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point10.y = 1.0d;
        point10.y = (-1.0d);
        point10.y = 100.0d;
        point10.x = (-1.0d);
        point10.x = (-1.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        boolean boolean26 = point23.equals((java.lang.Object) 10.0f);
        point23.x = 100.0d;
        java.lang.Double double29 = point23.x;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point32.x = 100.0d;
        boolean boolean35 = point23.equals((java.lang.Object) 100.0d);
        java.lang.Double double36 = point23.y;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        point39.x = 100.0d;
        java.lang.Double double45 = point39.x;
        boolean boolean46 = point23.equals((java.lang.Object) point39);
        boolean boolean47 = point10.equals((java.lang.Object) point39);
        java.lang.Double double48 = point10.y;
        boolean boolean49 = point2.equals((java.lang.Object) double48);
        java.lang.Double double50 = point2.x;
        Point point53 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double54 = point53.y;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point57.y = 0.0d;
        Point point62 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double63 = point62.x;
        java.lang.Double double64 = point62.y;
        java.lang.Double double65 = point62.y;
        java.lang.Double double66 = point62.y;
        boolean boolean67 = point57.equals((java.lang.Object) point62);
        boolean boolean68 = point53.equals((java.lang.Object) point57);
        point57.x = 100.0d;
        java.lang.Double double71 = point57.y;
        java.lang.Double double72 = point57.y;
        java.lang.Double double73 = point57.x;
        Line line74 = new Line(point2, point57);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point15.equals((java.lang.Object) double22);
        point15.x = 10.0d;
        java.lang.Double double26 = point15.x;
        point15.y = (-1.0d);
        java.lang.Double double29 = point15.y;
        java.lang.Double double30 = point15.y;
        java.lang.Double double31 = point15.y;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.y;
        java.lang.Double double39 = point34.x;
        java.lang.Double double40 = point34.y;
        java.lang.Double double41 = point34.y;
        point34.x = 100.0d;
        java.lang.Double double44 = point34.x;
        java.lang.Double double45 = point34.x;
        boolean boolean46 = point15.equals((java.lang.Object) double45);
        Line line47 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Double double20 = point14.y;
        Point point23 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.y;
        boolean boolean26 = point14.equals((java.lang.Object) point23);
        Line line27 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point2.equals((java.lang.Object) point11);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.y;
        boolean boolean21 = point11.equals((java.lang.Object) point17);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 1.0d;
        java.lang.Object obj30 = null;
        boolean boolean31 = point24.equals(obj30);
        point24.x = 1.0d;
        point24.x = (-1.0d);
        point24.y = (-1.0d);
        point24.y = 0.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point42.x = 1.0d;
        point42.y = 1.0d;
        point42.y = (-1.0d);
        point42.y = 10.0d;
        point42.y = 1.0d;
        java.lang.Double double53 = point42.x;
        java.lang.Double double54 = point42.y;
        java.lang.Double double55 = point42.x;
        java.lang.Class<?> wildcardClass56 = point42.getClass();
        boolean boolean57 = point24.equals((java.lang.Object) wildcardClass56);
        boolean boolean58 = point11.equals((java.lang.Object) point24);
        java.lang.Double double59 = point24.x;
        point24.x = 1.0d;
        Point point64 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point64.y = 0.0d;
        java.lang.Double double67 = point64.x;
        point64.x = 0.0d;
        point64.x = 100.0d;
        Line line72 = new Line(point24, point64);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.x;
        point2.x = 10.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        java.lang.Object obj25 = null;
        boolean boolean26 = point19.equals(obj25);
        point19.x = 1.0d;
        boolean boolean30 = point19.equals((java.lang.Object) false);
        java.lang.Double double31 = point19.x;
        java.lang.Double double32 = point19.x;
        java.lang.Double double33 = point19.y;
        boolean boolean34 = point2.equals((java.lang.Object) point19);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 1.0d;
        java.lang.Object obj43 = null;
        boolean boolean44 = point37.equals(obj43);
        point37.x = 1.0d;
        boolean boolean48 = point37.equals((java.lang.Object) false);
        java.lang.Double double49 = point37.x;
        java.lang.Double double50 = point37.x;
        boolean boolean51 = point2.equals((java.lang.Object) point37);
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        boolean boolean60 = point57.equals((java.lang.Object) 1L);
        java.lang.Double double61 = point57.y;
        boolean boolean62 = point54.equals((java.lang.Object) double61);
        java.lang.Double double63 = point54.y;
        java.lang.Double double64 = point54.x;
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        boolean boolean73 = point70.equals((java.lang.Object) 1L);
        java.lang.Double double74 = point70.y;
        boolean boolean75 = point67.equals((java.lang.Object) double74);
        java.lang.Double double76 = point67.y;
        boolean boolean77 = point54.equals((java.lang.Object) point67);
        point67.y = 10.0d;
        java.lang.Double double80 = point67.y;
        Line line81 = new Line(point37, point67);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.x = 100.0d;
        point2.x = 1.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        java.lang.Double double28 = point24.y;
        boolean boolean29 = point2.equals((java.lang.Object) double28);
        Point point32 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point35.x = 1.0d;
        point35.x = 1.0d;
        boolean boolean40 = point32.equals((java.lang.Object) 1.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point43.x = 100.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        point48.x = 1.0d;
        java.lang.Double double54 = point48.y;
        java.lang.Double double55 = point48.y;
        point48.x = 10.0d;
        boolean boolean58 = point43.equals((java.lang.Object) point48);
        Point point61 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.y;
        point61.y = 10.0d;
        point61.y = 10.0d;
        boolean boolean67 = point48.equals((java.lang.Object) point61);
        java.lang.Double double68 = point48.x;
        point48.x = (-1.0d);
        boolean boolean71 = point32.equals((java.lang.Object) (-1.0d));
        java.lang.Double double72 = point32.y;
        Line line73 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        Point point17 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double18 = point17.y;
        java.lang.Double double19 = point17.x;
        java.lang.Double double20 = point17.x;
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point23.y = 0.0d;
        java.lang.Double double26 = point23.y;
        point23.x = 100.0d;
        point23.x = 100.0d;
        java.lang.Double double31 = point23.y;
        boolean boolean32 = point17.equals((java.lang.Object) point23);
        java.lang.Double double33 = point23.x;
        boolean boolean34 = point5.equals((java.lang.Object) point23);
        point5.y = 0.0d;
        point5.y = 10.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        java.lang.Double double45 = point41.y;
        java.lang.Double double46 = point41.y;
        point41.y = 0.0d;
        boolean boolean49 = point5.equals((java.lang.Object) point41);
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.y;
        java.lang.Double double54 = point52.x;
        point52.y = 0.0d;
        point52.y = (-1.0d);
        Point point61 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.y;
        boolean boolean67 = point64.equals((java.lang.Object) 1L);
        java.lang.Double double68 = point64.y;
        boolean boolean69 = point61.equals((java.lang.Object) double68);
        point61.x = 10.0d;
        java.lang.Double double72 = point61.x;
        boolean boolean73 = point52.equals((java.lang.Object) point61);
        Line line74 = new Line(point41, point61);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point12.x = 1.0d;
        point12.y = 1.0d;
        java.lang.Double double17 = point12.x;
        point12.x = (-1.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 100.0d;
        point22.x = 10.0d;
        java.lang.Double double30 = point22.y;
        boolean boolean31 = point12.equals((java.lang.Object) double30);
        point12.y = (-1.0d);
        java.lang.Double double34 = point12.x;
        boolean boolean35 = point2.equals((java.lang.Object) point12);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.x;
        point38.y = 0.0d;
        java.lang.Double double43 = point38.x;
        java.lang.Double double44 = point38.y;
        point38.y = 0.0d;
        point38.y = 0.0d;
        Point point51 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.x;
        point51.x = 0.0d;
        java.lang.Double double56 = point51.y;
        point51.y = 0.0d;
        boolean boolean59 = point38.equals((java.lang.Object) 0.0d);
        Line line60 = new Line(point12, point38);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        java.lang.Double double9 = point7.y;
        java.lang.Double double10 = point7.x;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 0.0d);
        boolean boolean17 = point7.equals((java.lang.Object) point13);
        java.lang.Double double18 = point13.y;
        java.lang.Double double19 = point13.x;
        Line line20 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        point2.x = (-1.0d);
        point2.y = (-1.0d);
        point2.y = 0.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point20.x = 1.0d;
        point20.y = 1.0d;
        point20.y = (-1.0d);
        point20.y = 10.0d;
        point20.y = 1.0d;
        java.lang.Double double31 = point20.x;
        java.lang.Double double32 = point20.y;
        java.lang.Double double33 = point20.x;
        java.lang.Class<?> wildcardClass34 = point20.getClass();
        boolean boolean35 = point2.equals((java.lang.Object) wildcardClass34);
        point2.x = 0.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.x;
        boolean boolean43 = point40.equals((java.lang.Object) 10.0f);
        point40.x = 100.0d;
        java.lang.Double double46 = point40.x;
        point40.y = 1.0d;
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        point51.y = 10.0d;
        point51.y = (-1.0d);
        java.lang.Class<?> wildcardClass57 = point51.getClass();
        boolean boolean58 = point40.equals((java.lang.Object) wildcardClass57);
        Line line59 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double21 = point14.y;
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean26 = point24.equals((java.lang.Object) (byte) 100);
        java.lang.Double double27 = point24.x;
        point24.x = (-1.0d);
        point24.x = 10.0d;
        point24.y = (-1.0d);
        point24.x = 10.0d;
        boolean boolean36 = point14.equals((java.lang.Object) point24);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        java.lang.Double double42 = point39.x;
        point39.x = 0.0d;
        boolean boolean45 = point24.equals((java.lang.Object) 0.0d);
        Line line46 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 0.0d;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        java.lang.Double double26 = point22.y;
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = point22.equals(obj27);
        java.lang.Double double29 = point22.y;
        java.lang.Class<?> wildcardClass30 = point22.getClass();
        boolean boolean31 = point18.equals((java.lang.Object) point22);
        java.lang.Double double32 = point18.y;
        java.lang.Double double33 = point18.y;
        boolean boolean34 = point2.equals((java.lang.Object) double33);
        java.lang.Double double35 = point2.y;
        Point point38 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        point38.y = 0.0d;
        java.lang.Double double42 = point38.x;
        java.lang.Object obj43 = null;
        boolean boolean44 = point38.equals(obj43);
        point38.y = 0.0d;
        Line line47 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        java.lang.Double double10 = point6.y;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = point6.equals(obj11);
        java.lang.Double double13 = point6.y;
        java.lang.Class<?> wildcardClass14 = point6.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) point6);
        java.lang.Double double16 = point2.x;
        java.lang.Object obj17 = null;
        boolean boolean18 = point2.equals(obj17);
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 100.0d;
        point21.y = (-1.0d);
        point21.x = 1.0d;
        point21.x = 0.0d;
        Line line31 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 10.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        java.lang.Double double12 = point9.y;
        java.lang.Double double13 = point9.y;
        point9.y = 0.0d;
        java.lang.Double double16 = point9.y;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean21 = point19.equals((java.lang.Object) (byte) 100);
        java.lang.Double double22 = point19.x;
        point19.x = (-1.0d);
        point19.x = 10.0d;
        point19.y = (-1.0d);
        point19.x = 10.0d;
        boolean boolean31 = point9.equals((java.lang.Object) point19);
        Line line32 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point7);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point15.x = 0.0d;
        point15.x = 1.0d;
        java.lang.Class<?> wildcardClass20 = point15.getClass();
        boolean boolean21 = point7.equals((java.lang.Object) point15);
        java.lang.Double double22 = point7.x;
        point7.x = 10.0d;
        point7.y = (-1.0d);
        point7.y = 1.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.y;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point40.y = 0.0d;
        java.lang.Double double43 = point40.y;
        java.lang.Double double44 = point40.x;
        boolean boolean45 = point31.equals((java.lang.Object) double44);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean50 = point48.equals((java.lang.Object) true);
        point48.y = 100.0d;
        point48.y = 1.0d;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point60.x = 1.0d;
        point60.y = 1.0d;
        boolean boolean65 = point57.equals((java.lang.Object) 1.0d);
        java.lang.Double double66 = point57.y;
        boolean boolean67 = point48.equals((java.lang.Object) point57);
        boolean boolean68 = point31.equals((java.lang.Object) point57);
        point31.y = 100.0d;
        Line line71 = new Line(point7, point31);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double18 = point2.y;
        java.lang.Double double19 = point2.y;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point22.x = 0.0d;
        point22.y = 1.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        point29.x = 100.0d;
        point29.x = 10.0d;
        java.lang.Double double37 = point29.y;
        point29.y = 0.0d;
        java.lang.Double double40 = point29.x;
        boolean boolean41 = point22.equals((java.lang.Object) point29);
        point29.y = 10.0d;
        java.lang.Double double44 = point29.y;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        point47.x = 100.0d;
        point47.x = 10.0d;
        java.lang.Double double55 = point47.y;
        point47.y = 0.0d;
        java.lang.Double double58 = point47.x;
        java.lang.Double double59 = point47.x;
        java.lang.Double double60 = point47.y;
        java.lang.Class<?> wildcardClass61 = point47.getClass();
        boolean boolean62 = point29.equals((java.lang.Object) point47);
        Line line63 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = 0.0d;
        java.lang.Double double24 = point2.y;
        java.lang.Double double25 = point2.y;
        Point point28 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.x;
        java.lang.Double double30 = point28.y;
        java.lang.Double double31 = point28.y;
        point28.x = 100.0d;
        java.lang.Class<?> wildcardClass34 = point28.getClass();
        boolean boolean35 = point2.equals((java.lang.Object) wildcardClass34);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point38.y = 0.0d;
        java.lang.Double double41 = point38.y;
        java.lang.Double double42 = point38.x;
        Point point45 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.y;
        boolean boolean48 = point38.equals((java.lang.Object) point45);
        boolean boolean49 = point2.equals((java.lang.Object) point38);
        java.lang.Double double50 = point38.x;
        java.lang.Double double51 = point38.y;
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point54.y = 0.0d;
        java.lang.Double double57 = point54.y;
        java.lang.Double double58 = point54.x;
        point54.x = 10.0d;
        boolean boolean62 = point54.equals((java.lang.Object) true);
        Line line63 = new Line(point38, point54);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.x = 1.0d;
        point11.y = 1.0d;
        java.lang.Double double16 = point11.x;
        point11.x = (-1.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        point21.x = 10.0d;
        java.lang.Double double29 = point21.y;
        boolean boolean30 = point11.equals((java.lang.Object) double29);
        point11.y = 0.0d;
        java.lang.Double double33 = point11.y;
        java.lang.Double double34 = point11.y;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        java.lang.Double double40 = point37.y;
        point37.x = 100.0d;
        java.lang.Class<?> wildcardClass43 = point37.getClass();
        boolean boolean44 = point11.equals((java.lang.Object) wildcardClass43);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.x;
        Point point54 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double55 = point54.y;
        java.lang.Double double56 = point54.y;
        boolean boolean57 = point47.equals((java.lang.Object) point54);
        boolean boolean58 = point11.equals((java.lang.Object) point47);
        java.lang.Double double59 = point47.x;
        java.lang.Double double60 = point47.y;
        Point point63 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point66.x = 1.0d;
        point66.x = 1.0d;
        boolean boolean71 = point63.equals((java.lang.Object) 1.0d);
        boolean boolean72 = point47.equals((java.lang.Object) point63);
        boolean boolean73 = point2.equals((java.lang.Object) point63);
        Point point76 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point76.x = 100.0d;
        point76.x = 10.0d;
        java.lang.Double double81 = point76.x;
        Line line82 = new Line(point63, point76);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 10.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 10.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.x;
        boolean boolean27 = point24.equals((java.lang.Object) 10.0f);
        point24.x = 100.0d;
        java.lang.Double double30 = point24.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point33.x = 100.0d;
        boolean boolean36 = point24.equals((java.lang.Object) 100.0d);
        java.lang.Double double37 = point24.y;
        point24.y = 100.0d;
        boolean boolean40 = point15.equals((java.lang.Object) point24);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 0.0d;
        boolean boolean50 = point43.equals((java.lang.Object) "");
        boolean boolean51 = point24.equals((java.lang.Object) point43);
        boolean boolean52 = point2.equals((java.lang.Object) point43);
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point55.x = 0.0d;
        point55.y = (-1.0d);
        point55.y = 100.0d;
        point55.x = 0.0d;
        java.lang.Double double64 = point55.y;
        point55.y = 100.0d;
        java.lang.Double double67 = point55.x;
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point73 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double74 = point73.y;
        boolean boolean76 = point73.equals((java.lang.Object) 1L);
        java.lang.Double double77 = point73.y;
        boolean boolean78 = point70.equals((java.lang.Object) double77);
        point70.x = 10.0d;
        java.lang.Double double81 = point70.x;
        point70.x = 10.0d;
        Point point86 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double87 = point86.y;
        java.lang.Double double88 = point86.y;
        boolean boolean89 = point70.equals((java.lang.Object) double88);
        boolean boolean90 = point55.equals((java.lang.Object) point70);
        point55.x = 100.0d;
        Line line93 = new Line(point43, point55);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 1.0d;
        java.lang.Object obj23 = null;
        boolean boolean24 = point17.equals(obj23);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.x;
        point27.x = 1.0d;
        boolean boolean34 = point17.equals((java.lang.Object) 1.0d);
        java.lang.Double double35 = point17.y;
        java.lang.Double double36 = point17.x;
        java.lang.Double double37 = point17.x;
        point17.y = 10.0d;
        Line line40 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double9 = point8.y;
        boolean boolean11 = point8.equals((java.lang.Object) 0.0d);
        boolean boolean12 = point2.equals((java.lang.Object) point8);
        point2.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        point17.y = 100.0d;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj31 = null;
        boolean boolean32 = point30.equals(obj31);
        boolean boolean33 = point17.equals((java.lang.Object) point30);
        point17.x = 100.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        java.lang.Double double43 = point41.y;
        boolean boolean44 = point38.equals((java.lang.Object) point41);
        java.lang.Double double45 = point41.x;
        boolean boolean46 = point17.equals((java.lang.Object) point41);
        point41.y = 1.0d;
        java.lang.Double double49 = point41.y;
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        point52.y = 1.0d;
        java.lang.Double double56 = point52.y;
        java.lang.Object obj57 = new java.lang.Object();
        boolean boolean58 = point52.equals(obj57);
        point52.x = 1.0d;
        java.lang.Double double61 = point52.y;
        java.lang.Double double62 = point52.x;
        point52.y = 1.0d;
        point52.y = 100.0d;
        boolean boolean67 = point41.equals((java.lang.Object) point52);
        point41.y = 100.0d;
        boolean boolean70 = point2.equals((java.lang.Object) point41);
        Point point73 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point73.y = 1.0d;
        java.lang.Double double76 = point73.y;
        java.lang.Double double77 = point73.y;
        point73.x = 0.0d;
        point73.y = (-1.0d);
        point73.x = 100.0d;
        Line line84 = new Line(point2, point73);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 1.0d;
        point6.y = (-1.0d);
        boolean boolean11 = point2.equals((java.lang.Object) point6);
        java.lang.Double double12 = point2.x;
        point2.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        point17.y = 1.0d;
        java.lang.Double double22 = point17.x;
        point17.x = (-1.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 100.0d;
        point27.x = 10.0d;
        java.lang.Double double35 = point27.y;
        boolean boolean36 = point17.equals((java.lang.Object) double35);
        point17.y = 0.0d;
        java.lang.Double double39 = point17.y;
        java.lang.Double double40 = point17.y;
        Point point43 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.x;
        java.lang.Double double45 = point43.y;
        java.lang.Double double46 = point43.y;
        point43.x = 100.0d;
        java.lang.Class<?> wildcardClass49 = point43.getClass();
        boolean boolean50 = point17.equals((java.lang.Object) wildcardClass49);
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point53.y = 0.0d;
        java.lang.Double double56 = point53.y;
        java.lang.Double double57 = point53.x;
        Point point60 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double61 = point60.y;
        java.lang.Double double62 = point60.y;
        boolean boolean63 = point53.equals((java.lang.Object) point60);
        boolean boolean64 = point17.equals((java.lang.Object) point53);
        java.lang.Double double65 = point53.x;
        java.lang.Double double66 = point53.y;
        Point point69 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point72.x = 1.0d;
        point72.x = 1.0d;
        boolean boolean77 = point69.equals((java.lang.Object) 1.0d);
        boolean boolean78 = point53.equals((java.lang.Object) point69);
        point69.x = 1.0d;
        point69.y = 10.0d;
        Line line83 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point15.equals((java.lang.Object) double22);
        java.lang.Double double24 = point15.y;
        boolean boolean25 = point2.equals((java.lang.Object) point15);
        java.lang.Double double26 = point15.y;
        point15.x = 1.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        boolean boolean36 = point31.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass37 = point31.getClass();
        boolean boolean38 = point15.equals((java.lang.Object) wildcardClass37);
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point41.x = 0.0d;
        point41.y = (-1.0d);
        point41.y = 100.0d;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        point50.x = 10.0d;
        java.lang.Double double58 = point50.y;
        boolean boolean59 = point41.equals((java.lang.Object) point50);
        point41.y = 0.0d;
        boolean boolean62 = point15.equals((java.lang.Object) 0.0d);
        java.lang.Double double63 = point15.x;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        point66.y = 1.0d;
        java.lang.Double double70 = point66.y;
        java.lang.Object obj71 = new java.lang.Object();
        boolean boolean72 = point66.equals(obj71);
        point66.x = 1.0d;
        point66.y = 0.0d;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.x;
        boolean boolean82 = point79.equals((java.lang.Object) 10.0f);
        point79.x = 100.0d;
        java.lang.Double double85 = point79.x;
        point79.y = 1.0d;
        point79.x = 0.0d;
        java.lang.Double double90 = point79.x;
        point79.y = 10.0d;
        boolean boolean93 = point66.equals((java.lang.Object) point79);
        Line line94 = new Line(point15, point79);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        java.lang.Double double17 = point2.y;
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        point21.x = 10.0d;
        java.lang.Double double29 = point21.y;
        point21.y = 0.0d;
        java.lang.Double double32 = point21.x;
        point21.y = (-1.0d);
        point21.y = 10.0d;
        point21.x = 100.0d;
        point21.x = 1.0d;
        point21.x = 0.0d;
        java.lang.Double double43 = point21.x;
        Line line44 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        java.lang.Double double14 = point8.x;
        point8.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point8);
        point8.x = 1.0d;
        java.lang.Double double20 = point8.y;
        point8.y = 1.0d;
        java.lang.Double double23 = point8.x;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        boolean boolean34 = point26.equals((java.lang.Object) double33);
        java.lang.Double double35 = point26.y;
        point26.y = (-1.0d);
        java.lang.Double double38 = point26.y;
        java.lang.Double double39 = point26.x;
        point26.x = 100.0d;
        point26.y = 100.0d;
        Line line44 = new Line(point8, point26);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        boolean boolean19 = point13.equals((java.lang.Object) point16);
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        boolean boolean25 = point16.equals((java.lang.Object) double24);
        Point point28 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double29 = point28.y;
        java.lang.Double double30 = point28.x;
        java.lang.Double double31 = point28.x;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        point34.x = 100.0d;
        point34.x = 100.0d;
        java.lang.Double double42 = point34.y;
        boolean boolean43 = point28.equals((java.lang.Object) point34);
        java.lang.Double double44 = point34.x;
        boolean boolean45 = point16.equals((java.lang.Object) point34);
        point16.x = 100.0d;
        boolean boolean48 = point2.equals((java.lang.Object) 100.0d);
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point51.x = 0.0d;
        point51.y = (-1.0d);
        point51.y = 100.0d;
        java.lang.Double double58 = point51.x;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point61.x = 1.0d;
        java.lang.Double double64 = point61.y;
        point61.x = 100.0d;
        java.lang.Double double67 = point61.x;
        java.lang.Double double68 = point61.x;
        boolean boolean69 = point51.equals((java.lang.Object) double68);
        point51.x = 1.0d;
        boolean boolean72 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double73 = point2.x;
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        point76.y = 1.0d;
        java.lang.Double double80 = point76.y;
        java.lang.Object obj81 = new java.lang.Object();
        boolean boolean82 = point76.equals(obj81);
        java.lang.Double double83 = point76.y;
        point76.x = (-1.0d);
        point76.y = 0.0d;
        point76.x = 1.0d;
        Line line90 = new Line(point2, point76);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        point7.x = 100.0d;
        boolean boolean11 = point2.equals((java.lang.Object) point7);
        point2.x = 0.0d;
        point2.x = 0.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 1.0d;
        java.lang.Object obj24 = null;
        boolean boolean25 = point18.equals(obj24);
        point18.x = 1.0d;
        point18.x = (-1.0d);
        java.lang.Double double30 = point18.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        point33.y = 100.0d;
        point33.x = (-1.0d);
        point33.x = (-1.0d);
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.x;
        boolean boolean49 = point46.equals((java.lang.Object) 10.0f);
        point46.x = 100.0d;
        java.lang.Double double52 = point46.x;
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point55.x = 100.0d;
        boolean boolean58 = point46.equals((java.lang.Object) 100.0d);
        java.lang.Double double59 = point46.y;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        point62.y = 1.0d;
        point62.x = 100.0d;
        java.lang.Double double68 = point62.x;
        boolean boolean69 = point46.equals((java.lang.Object) point62);
        boolean boolean70 = point33.equals((java.lang.Object) point62);
        java.lang.Double double71 = point33.y;
        java.lang.Double double72 = point33.y;
        boolean boolean73 = point18.equals((java.lang.Object) point33);
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point79 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double80 = point79.y;
        point79.y = 10.0d;
        boolean boolean83 = point76.equals((java.lang.Object) point79);
        point76.y = 0.0d;
        boolean boolean86 = point33.equals((java.lang.Object) point76);
        java.lang.Double double87 = point33.x;
        Line line88 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.x = (-1.0d);
        point2.y = 100.0d;
        point2.y = 10.0d;
        Point point19 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.y;
        java.lang.Double double22 = point19.x;
        point19.x = (-1.0d);
        Line line25 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 1.0d;
        java.lang.Object obj17 = null;
        boolean boolean18 = point11.equals(obj17);
        point11.x = 1.0d;
        point11.x = (-1.0d);
        point11.y = (-1.0d);
        point11.y = 0.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        point29.y = 1.0d;
        point29.y = (-1.0d);
        point29.y = 10.0d;
        point29.y = 1.0d;
        java.lang.Double double40 = point29.x;
        java.lang.Double double41 = point29.y;
        java.lang.Double double42 = point29.x;
        java.lang.Class<?> wildcardClass43 = point29.getClass();
        boolean boolean44 = point11.equals((java.lang.Object) wildcardClass43);
        java.lang.Double double45 = point11.y;
        Line line46 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 10.0d;
        java.lang.Double double22 = point15.y;
        point15.x = 10.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        point27.y = 1.0d;
        java.lang.Double double32 = point27.x;
        point27.x = (-1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        boolean boolean46 = point27.equals((java.lang.Object) double45);
        point27.y = (-1.0d);
        java.lang.Double double49 = point27.x;
        point27.y = 1.0d;
        boolean boolean52 = point15.equals((java.lang.Object) 1.0d);
        boolean boolean53 = point2.equals((java.lang.Object) point15);
        point15.x = 1.0d;
        Point point58 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point58.x = 0.0d;
        point58.y = (-1.0d);
        Line line63 = new Line(point15, point58);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = 0.0d;
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 1.0d;
        java.lang.Object obj21 = null;
        boolean boolean22 = point15.equals(obj21);
        point15.x = 1.0d;
        boolean boolean26 = point15.equals((java.lang.Object) false);
        java.lang.Double double27 = point15.x;
        java.lang.Double double28 = point15.x;
        java.lang.Double double29 = point15.y;
        point15.y = 0.0d;
        Line line32 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        point2.y = 1.0d;
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point22.y = 0.0d;
        java.lang.Double double25 = point22.y;
        java.lang.Double double26 = point22.x;
        point22.x = 1.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj32 = null;
        boolean boolean33 = point31.equals(obj32);
        java.lang.Class<?> wildcardClass34 = point31.getClass();
        boolean boolean35 = point22.equals((java.lang.Object) wildcardClass34);
        java.lang.Double double36 = point22.x;
        boolean boolean37 = point2.equals((java.lang.Object) point22);
        java.lang.Double double38 = point22.x;
        java.lang.Double double39 = point22.x;
        point22.x = 0.0d;
        point22.y = 100.0d;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point46.x = 1.0d;
        point46.y = 1.0d;
        java.lang.Double double51 = point46.x;
        point46.x = (-1.0d);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        point56.y = 1.0d;
        point56.x = 100.0d;
        point56.x = 10.0d;
        java.lang.Double double64 = point56.y;
        boolean boolean65 = point46.equals((java.lang.Object) double64);
        point46.y = (-1.0d);
        java.lang.Double double68 = point46.x;
        point46.x = 1.0d;
        Point point73 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point73.y = 1.0d;
        point73.y = (-1.0d);
        point73.x = 0.0d;
        point73.x = 1.0d;
        point73.x = (-1.0d);
        boolean boolean84 = point46.equals((java.lang.Object) point73);
        java.lang.Double double85 = point73.y;
        Line line86 = new Line(point22, point73);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean14 = point2.equals((java.lang.Object) point12);
        point12.y = 0.0d;
        java.lang.Double double17 = point12.x;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        point20.y = 0.0d;
        point20.y = (-1.0d);
        point20.y = 100.0d;
        java.lang.Double double29 = point20.x;
        java.lang.Double double30 = point20.x;
        point20.x = 1.0d;
        java.lang.Double double33 = point20.x;
        java.lang.Double double34 = point20.x;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.x;
        java.lang.Double double40 = point37.x;
        point37.y = 0.0d;
        boolean boolean44 = point37.equals((java.lang.Object) '#');
        point37.y = 100.0d;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        point49.x = 100.0d;
        java.lang.Double double55 = point49.y;
        point49.y = 100.0d;
        point49.x = (-1.0d);
        java.lang.Double double60 = point49.x;
        point49.y = 0.0d;
        boolean boolean63 = point37.equals((java.lang.Object) 0.0d);
        boolean boolean64 = point20.equals((java.lang.Object) point37);
        Line line65 = new Line(point12, point20);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        point15.y = 100.0d;
        boolean boolean19 = point2.equals((java.lang.Object) point15);
        point15.y = 1.0d;
        java.lang.Double double22 = point15.x;
        java.lang.Double double23 = point15.y;
        point15.y = 0.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.x;
        point28.x = 1.0d;
        point28.x = 0.0d;
        java.lang.Double double37 = point28.y;
        point28.y = 0.0d;
        Line line40 = new Line(point15, point28);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.y = 100.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.y = 10.0d;
        boolean boolean20 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double21 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double24 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.x;
        Line line34 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point9.x = 0.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        point2.x = 0.0d;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.y;
        java.lang.Double double23 = point20.x;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point26.y = 10.0d;
        java.lang.Double double29 = point26.x;
        java.lang.Double double30 = point26.x;
        java.lang.Double double31 = point26.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        java.lang.Double double38 = point34.y;
        java.lang.Object obj39 = new java.lang.Object();
        boolean boolean40 = point34.equals(obj39);
        java.lang.Double double41 = point34.y;
        java.lang.Class<?> wildcardClass42 = point34.getClass();
        boolean boolean43 = point26.equals((java.lang.Object) wildcardClass42);
        boolean boolean44 = point20.equals((java.lang.Object) point26);
        java.lang.Double double45 = point26.x;
        java.lang.Double double46 = point26.x;
        Line line47 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.y = 1.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        java.lang.Double double21 = point17.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        point24.y = (-1.0d);
        java.lang.Double double29 = point24.y;
        java.lang.Double double30 = point24.y;
        java.lang.Double double31 = point24.y;
        java.lang.Double double32 = point24.y;
        java.lang.Double double33 = point24.x;
        point24.x = 1.0d;
        point24.y = 1.0d;
        java.lang.Double double38 = point24.x;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        point41.y = 1.0d;
        point41.y = (-1.0d);
        point41.y = 10.0d;
        point41.y = 0.0d;
        java.lang.Double double52 = point41.x;
        Point point55 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double56 = point55.x;
        java.lang.Double double57 = point55.x;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double61 = point60.y;
        boolean boolean62 = point55.equals((java.lang.Object) double61);
        boolean boolean63 = point41.equals((java.lang.Object) double61);
        boolean boolean64 = point24.equals((java.lang.Object) boolean63);
        boolean boolean65 = point17.equals((java.lang.Object) point24);
        Line line66 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point5.x = 1.0d;
        point5.x = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point13.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 1.0d;
        java.lang.Double double24 = point18.y;
        java.lang.Double double25 = point18.y;
        point18.x = 10.0d;
        boolean boolean28 = point13.equals((java.lang.Object) point18);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        point31.y = 10.0d;
        boolean boolean37 = point18.equals((java.lang.Object) point31);
        java.lang.Double double38 = point18.x;
        point18.x = (-1.0d);
        boolean boolean41 = point2.equals((java.lang.Object) (-1.0d));
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.y;
        boolean boolean50 = point44.equals((java.lang.Object) point47);
        java.lang.Double double51 = point47.x;
        java.lang.Double double52 = point47.y;
        java.lang.Double double53 = point47.y;
        java.lang.Object obj54 = null;
        boolean boolean55 = point47.equals(obj54);
        Line line56 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point5.y = 1.0d;
        point5.y = (-1.0d);
        java.lang.Double double10 = point5.y;
        point5.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass16 = point15.getClass();
        boolean boolean17 = point5.equals((java.lang.Object) point15);
        boolean boolean18 = point2.equals((java.lang.Object) point5);
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 100.0d;
        java.lang.Double double25 = point21.y;
        Line line26 = new Line(point5, point21);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        java.lang.Double double12 = point8.y;
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = point8.equals(obj13);
        point8.x = 1.0d;
        java.lang.Double double17 = point8.x;
        boolean boolean18 = point2.equals((java.lang.Object) double17);
        java.lang.Double double19 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double22 = point2.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point25.x = 1.0d;
        point25.y = (-1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point25.equals((java.lang.Object) 10.0d);
        java.lang.Double double37 = point25.y;
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        point40.y = (-1.0d);
        java.lang.Double double45 = point40.y;
        java.lang.Double double46 = point40.y;
        point40.y = 1.0d;
        point40.y = 100.0d;
        point40.y = 0.0d;
        java.lang.Double double53 = point40.y;
        java.lang.Double double54 = point40.y;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point57.y = 10.0d;
        java.lang.Double double60 = point57.x;
        java.lang.Double double61 = point57.x;
        java.lang.Double double62 = point57.x;
        java.lang.Class<?> wildcardClass63 = point57.getClass();
        boolean boolean64 = point40.equals((java.lang.Object) wildcardClass63);
        java.lang.Double double65 = point40.y;
        point40.x = 100.0d;
        boolean boolean68 = point25.equals((java.lang.Object) 100.0d);
        java.lang.Double double69 = point25.x;
        boolean boolean71 = point25.equals((java.lang.Object) 1.0f);
        Line line72 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.y = 0.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point14);
        java.lang.Double double21 = point2.y;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        point24.y = 0.0d;
        boolean boolean29 = point2.equals((java.lang.Object) 0.0d);
        point2.y = 10.0d;
        point2.y = 0.0d;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.x;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean43 = point41.equals((java.lang.Object) true);
        boolean boolean44 = point36.equals((java.lang.Object) true);
        java.lang.Double double45 = point36.y;
        java.lang.Double double46 = point36.y;
        point36.y = 100.0d;
        java.lang.Double double49 = point36.y;
        java.lang.Double double50 = point36.x;
        Line line51 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        point15.y = (-1.0d);
        java.lang.Double double21 = point15.y;
        java.lang.Double double22 = point15.y;
        java.lang.Double double23 = point15.x;
        point15.x = (-1.0d);
        java.lang.Double double26 = point15.x;
        java.lang.Double double27 = point15.x;
        Line line28 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = 1.0d;
        point2.y = 10.0d;
        point2.x = 1.0d;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.x;
        point21.y = 1.0d;
        java.lang.Double double29 = point21.x;
        point21.y = 0.0d;
        Line line32 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point6.x = 1.0d;
        point6.x = 0.0d;
        point6.x = 0.0d;
        java.lang.Double double13 = point6.x;
        boolean boolean14 = point2.equals((java.lang.Object) double13);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point17.y = 100.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point22.x = 100.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 1.0d;
        java.lang.Double double33 = point27.y;
        java.lang.Double double34 = point27.y;
        point27.x = 10.0d;
        boolean boolean37 = point22.equals((java.lang.Object) point27);
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.y;
        point40.y = 10.0d;
        point40.y = 10.0d;
        boolean boolean46 = point27.equals((java.lang.Object) point40);
        java.lang.Double double47 = point27.x;
        boolean boolean48 = point17.equals((java.lang.Object) double47);
        Line line49 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        java.lang.Double double12 = point7.x;
        java.lang.Double double13 = point7.y;
        point7.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        point18.x = 1.0d;
        java.lang.Double double27 = point18.x;
        point18.y = 0.0d;
        java.lang.Class<?> wildcardClass30 = point18.getClass();
        boolean boolean31 = point7.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = point2.equals((java.lang.Object) point7);
        point7.x = 0.0d;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        java.lang.Double double45 = point41.y;
        java.lang.Object obj46 = new java.lang.Object();
        boolean boolean47 = point41.equals(obj46);
        java.lang.Double double48 = point41.y;
        java.lang.Class<?> wildcardClass49 = point41.getClass();
        boolean boolean50 = point37.equals((java.lang.Object) point41);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point53.y = 100.0d;
        point53.y = 0.0d;
        boolean boolean58 = point37.equals((java.lang.Object) 0.0d);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point61.x = 0.0d;
        point61.x = 1.0d;
        point61.x = (-1.0d);
        boolean boolean68 = point37.equals((java.lang.Object) (-1.0d));
        java.lang.Double double69 = point37.y;
        java.lang.Double double70 = point37.y;
        Line line71 = new Line(point7, point37);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        java.lang.Double double14 = point8.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point17.x = 100.0d;
        boolean boolean20 = point8.equals((java.lang.Object) 100.0d);
        point8.x = 10.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point8);
        point2.x = 10.0d;
        java.lang.Double double26 = point2.y;
        point2.x = (-1.0d);
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 1.0d;
        point31.y = (-1.0d);
        java.lang.Double double36 = point31.y;
        java.lang.Double double37 = point31.y;
        java.lang.Double double38 = point31.y;
        point31.y = 100.0d;
        java.lang.Double double41 = point31.x;
        java.lang.Double double42 = point31.y;
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point45.y = 1.0d;
        point45.y = (-1.0d);
        java.lang.Double double50 = point45.y;
        java.lang.Double double51 = point45.y;
        point45.y = 1.0d;
        point45.y = 100.0d;
        point45.x = 1.0d;
        point45.y = (-1.0d);
        point45.y = 1.0d;
        java.lang.Double double62 = point45.y;
        point45.x = 0.0d;
        boolean boolean65 = point31.equals((java.lang.Object) 0.0d);
        Line line66 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = (-1.0d);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        point14.y = 10.0d;
        boolean boolean18 = point7.equals((java.lang.Object) 10.0d);
        java.lang.Double double19 = point7.y;
        java.lang.Double double20 = point7.y;
        java.lang.Double double21 = point7.x;
        point7.x = (-1.0d);
        Line line24 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point18.y = 10.0d;
        java.lang.Double double21 = point18.x;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        boolean boolean27 = point24.equals((java.lang.Object) 1L);
        java.lang.Double double28 = point24.y;
        point24.y = 100.0d;
        point24.x = 10.0d;
        java.lang.Double double33 = point24.x;
        boolean boolean34 = point18.equals((java.lang.Object) point24);
        boolean boolean35 = point2.equals((java.lang.Object) point18);
        point2.y = 10.0d;
        java.lang.Double double38 = point2.y;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        java.lang.Double double45 = point41.y;
        java.lang.Object obj46 = new java.lang.Object();
        boolean boolean47 = point41.equals(obj46);
        java.lang.Double double48 = point41.y;
        point41.x = 10.0d;
        java.lang.Double double51 = point41.y;
        point41.y = 10.0d;
        point41.x = (-1.0d);
        Line line56 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.x;
        java.lang.Double double11 = point9.y;
        point9.y = (-1.0d);
        java.lang.Double double14 = point9.y;
        java.lang.Double double15 = point9.x;
        java.lang.Double double16 = point9.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        java.lang.Double double24 = point19.x;
        java.lang.Double double25 = point19.x;
        boolean boolean26 = point9.equals((java.lang.Object) point19);
        point19.x = 0.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point31.y = (-1.0d);
        java.lang.Object obj34 = null;
        boolean boolean35 = point31.equals(obj34);
        boolean boolean36 = point19.equals((java.lang.Object) point31);
        point31.y = 0.0d;
        java.lang.Double double39 = point31.y;
        boolean boolean40 = point2.equals((java.lang.Object) point31);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        point43.x = 100.0d;
        point43.x = (-1.0d);
        Line line50 = new Line(point31, point43);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 0.0d;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.x;
        java.lang.Double double13 = point11.y;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.y;
        boolean boolean16 = point6.equals((java.lang.Object) point11);
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        point2.y = 1.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.x;
        boolean boolean31 = point28.equals((java.lang.Object) 10.0f);
        point28.x = 100.0d;
        java.lang.Double double34 = point28.x;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point37.x = 100.0d;
        boolean boolean40 = point28.equals((java.lang.Object) 100.0d);
        point28.x = 10.0d;
        boolean boolean43 = point22.equals((java.lang.Object) point28);
        point28.y = (-1.0d);
        java.lang.Double double46 = point28.x;
        java.lang.Double double47 = point28.x;
        Line line48 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        boolean boolean7 = point2.equals((java.lang.Object) 1L);
        Point point10 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double11 = point10.x;
        point10.x = 100.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double24 = point20.y;
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = point20.equals(obj25);
        java.lang.Double double27 = point20.y;
        java.lang.Class<?> wildcardClass28 = point20.getClass();
        boolean boolean29 = point16.equals((java.lang.Object) point20);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point32.y = 100.0d;
        point32.y = 0.0d;
        boolean boolean37 = point16.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass38 = point16.getClass();
        boolean boolean39 = point10.equals((java.lang.Object) wildcardClass38);
        point10.x = (-1.0d);
        boolean boolean42 = point2.equals((java.lang.Object) point10);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.y;
        boolean boolean51 = point45.equals((java.lang.Object) point48);
        point45.y = 0.0d;
        point45.x = (-1.0d);
        Line line56 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        point20.y = 100.0d;
        java.lang.Double double28 = point20.y;
        point20.y = 100.0d;
        java.lang.Double double31 = point20.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 1.0d;
        java.lang.Object obj40 = null;
        boolean boolean41 = point34.equals(obj40);
        point34.x = 1.0d;
        boolean boolean45 = point34.equals((java.lang.Object) false);
        java.lang.Double double46 = point34.x;
        point34.y = (-1.0d);
        point34.x = 1.0d;
        java.lang.Double double51 = point34.x;
        boolean boolean52 = point20.equals((java.lang.Object) point34);
        java.lang.Double double53 = point34.x;
        point34.y = 100.0d;
        Line line56 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        boolean boolean17 = point5.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = point5.getClass();
        boolean boolean19 = point2.equals((java.lang.Object) wildcardClass18);
        point2.y = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double24 = point2.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        java.lang.Double double31 = point27.y;
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = point27.equals(obj32);
        point27.x = 1.0d;
        java.lang.Double double36 = point27.y;
        java.lang.Double double37 = point27.x;
        point27.y = 1.0d;
        point27.y = 100.0d;
        point27.x = 100.0d;
        Line line44 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 1.0d;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 0.0d;
        java.lang.Double double22 = point15.x;
        point15.y = 0.0d;
        point15.y = 10.0d;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        boolean boolean30 = point15.equals((java.lang.Object) (-1.0d));
        java.lang.Double double31 = point15.y;
        Line line32 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 10.0d;
        boolean boolean11 = point2.equals((java.lang.Object) point7);
        point7.x = 1.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        point16.y = (-1.0d);
        java.lang.Double double21 = point16.y;
        point16.x = 10.0d;
        point16.y = 100.0d;
        java.lang.Double double26 = point16.y;
        boolean boolean27 = point7.equals((java.lang.Object) point16);
        point7.x = (-1.0d);
        Point point30 = null;
        Line line31 = new Line(point7, point30);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double24 = point20.y;
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = point20.equals(obj25);
        java.lang.Double double27 = point20.y;
        point20.y = 100.0d;
        java.lang.Double double30 = point20.y;
        boolean boolean31 = point2.equals((java.lang.Object) double30);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        point37.y = 10.0d;
        boolean boolean41 = point34.equals((java.lang.Object) point37);
        point34.y = 0.0d;
        point34.x = 10.0d;
        java.lang.Double double46 = point34.y;
        point34.y = 100.0d;
        Line line49 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 100.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double24 = point20.y;
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = point20.equals(obj25);
        point20.x = 1.0d;
        point20.y = 0.0d;
        java.lang.Double double31 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double34 = point20.y;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.x;
        boolean boolean40 = point37.equals((java.lang.Object) 10.0f);
        point37.x = 100.0d;
        java.lang.Double double43 = point37.x;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point46.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        java.lang.Double double50 = point37.y;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point56.x = 1.0d;
        point56.y = 1.0d;
        boolean boolean61 = point53.equals((java.lang.Object) 1.0d);
        java.lang.Double double62 = point53.y;
        point53.x = 0.0d;
        boolean boolean65 = point37.equals((java.lang.Object) 0.0d);
        java.lang.Double double66 = point37.x;
        boolean boolean67 = point20.equals((java.lang.Object) double66);
        Line line68 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        boolean boolean11 = point2.equals((java.lang.Object) 0L);
        java.lang.Double double12 = point2.x;
        point2.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        point17.y = 100.0d;
        point17.x = (-1.0d);
        point17.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        java.lang.Double double36 = point30.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point39.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        java.lang.Double double43 = point30.y;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        point46.x = 100.0d;
        java.lang.Double double52 = point46.x;
        boolean boolean53 = point30.equals((java.lang.Object) point46);
        boolean boolean54 = point17.equals((java.lang.Object) point46);
        java.lang.Double double55 = point17.y;
        java.lang.Double double56 = point17.y;
        point17.y = 10.0d;
        Line line59 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj16 = null;
        boolean boolean17 = point15.equals(obj16);
        boolean boolean18 = point2.equals((java.lang.Object) point15);
        point2.x = 100.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        point26.y = 10.0d;
        boolean boolean30 = point23.equals((java.lang.Object) point26);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        boolean boolean36 = point33.equals((java.lang.Object) 1L);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.x;
        boolean boolean42 = point39.equals((java.lang.Object) 10.0f);
        point39.x = 100.0d;
        boolean boolean45 = point33.equals((java.lang.Object) 100.0d);
        boolean boolean46 = point26.equals((java.lang.Object) boolean45);
        java.lang.Double double47 = point26.x;
        point26.y = (-1.0d);
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        point52.y = 1.0d;
        java.lang.Double double56 = point52.y;
        java.lang.Object obj57 = new java.lang.Object();
        boolean boolean58 = point52.equals(obj57);
        java.lang.Double double59 = point52.y;
        point52.x = (-1.0d);
        point52.y = 0.0d;
        point52.x = 1.0d;
        boolean boolean66 = point26.equals((java.lang.Object) 1.0d);
        java.lang.Double double67 = point26.y;
        Line line68 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.x;
        point2.x = 10.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.x;
        boolean boolean13 = point10.equals((java.lang.Object) 10.0f);
        point10.x = 100.0d;
        java.lang.Double double16 = point10.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 100.0d;
        boolean boolean22 = point10.equals((java.lang.Object) 100.0d);
        java.lang.Double double23 = point10.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 100.0d;
        java.lang.Double double32 = point26.x;
        boolean boolean33 = point10.equals((java.lang.Object) point26);
        java.lang.Double double34 = point10.x;
        point10.x = 10.0d;
        Line line37 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.x;
        java.lang.Double double21 = point18.x;
        point18.y = 0.0d;
        point18.y = 1.0d;
        point18.y = 100.0d;
        java.lang.Double double28 = point18.y;
        Line line29 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Class<?> wildcardClass18 = point16.getClass();
        boolean boolean19 = point2.equals((java.lang.Object) wildcardClass18);
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        java.lang.Double double25 = point22.x;
        java.lang.Class<?> wildcardClass26 = point22.getClass();
        boolean boolean27 = point2.equals((java.lang.Object) point22);
        point2.y = 10.0d;
        point2.x = 100.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        boolean boolean37 = point34.equals((java.lang.Object) 1L);
        point34.y = (-1.0d);
        java.lang.Double double40 = point34.y;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point43.x = 100.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        point48.x = 1.0d;
        java.lang.Double double54 = point48.y;
        java.lang.Double double55 = point48.y;
        point48.x = 10.0d;
        boolean boolean58 = point43.equals((java.lang.Object) point48);
        boolean boolean59 = point34.equals((java.lang.Object) point48);
        point48.y = 100.0d;
        point48.y = 0.0d;
        java.lang.Double double64 = point48.y;
        Line line65 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.y;
        java.lang.Double double18 = point12.y;
        point12.y = 1.0d;
        point12.y = 100.0d;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj26 = null;
        boolean boolean27 = point25.equals(obj26);
        boolean boolean28 = point12.equals((java.lang.Object) point25);
        point12.x = 100.0d;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.y;
        boolean boolean39 = point33.equals((java.lang.Object) point36);
        java.lang.Double double40 = point36.x;
        boolean boolean41 = point12.equals((java.lang.Object) point36);
        point36.y = 1.0d;
        java.lang.Double double44 = point36.y;
        point36.y = 0.0d;
        boolean boolean47 = point2.equals((java.lang.Object) point36);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.x;
        boolean boolean53 = point50.equals((java.lang.Object) 10.0f);
        point50.x = 100.0d;
        point50.y = 10.0d;
        java.lang.Double double58 = point50.x;
        java.lang.Double double59 = point50.y;
        point50.y = 0.0d;
        java.lang.Double double62 = point50.x;
        java.lang.Double double63 = point50.y;
        Line line64 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        java.lang.Double double24 = point19.x;
        java.lang.Double double25 = point19.x;
        point19.y = 1.0d;
        boolean boolean28 = point9.equals((java.lang.Object) point19);
        point19.y = (-1.0d);
        point19.x = (-1.0d);
        java.lang.Double double33 = point19.x;
        java.lang.Double double34 = point19.x;
        java.lang.Double double35 = point19.x;
        boolean boolean36 = point2.equals((java.lang.Object) double35);
        java.lang.Double double37 = point2.y;
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        java.lang.Double double43 = point40.y;
        java.lang.Double double44 = point40.y;
        point40.y = 0.0d;
        point40.y = 1.0d;
        point40.y = 0.0d;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 100.0d;
        java.lang.Double double59 = point53.y;
        boolean boolean60 = point40.equals((java.lang.Object) point53);
        point40.y = 0.0d;
        Line line63 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.x = 10.0d;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        java.lang.Double double15 = point11.y;
        boolean boolean16 = point8.equals((java.lang.Object) double15);
        java.lang.Double double17 = point8.y;
        java.lang.Double double18 = point8.x;
        point8.y = (-1.0d);
        java.lang.Double double21 = point8.y;
        Line line22 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 100.0d;
        Point point8 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point8.y = 100.0d;
        java.lang.Object obj11 = null;
        boolean boolean12 = point8.equals(obj11);
        boolean boolean13 = point2.equals(obj11);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.y;
        java.lang.Double double21 = point16.y;
        point16.y = (-1.0d);
        java.lang.Double double24 = point16.x;
        point16.x = 10.0d;
        java.lang.Double double27 = point16.y;
        Line line28 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 100.0d;
        java.lang.Double double24 = point18.x;
        boolean boolean25 = point2.equals((java.lang.Object) point18);
        point2.y = 1.0d;
        point2.x = 100.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        point32.y = (-1.0d);
        java.lang.Double double38 = point32.y;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point41.x = 100.0d;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        point46.x = 1.0d;
        java.lang.Double double52 = point46.y;
        java.lang.Double double53 = point46.y;
        point46.x = 10.0d;
        boolean boolean56 = point41.equals((java.lang.Object) point46);
        boolean boolean57 = point32.equals((java.lang.Object) point46);
        java.lang.Double double58 = point46.y;
        Line line59 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        point14.y = 0.0d;
        java.lang.Double double19 = point14.x;
        point14.y = 10.0d;
        Line line22 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point11.x = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 1.0d;
        java.lang.Double double22 = point16.y;
        java.lang.Double double23 = point16.y;
        point16.x = 10.0d;
        boolean boolean26 = point11.equals((java.lang.Object) point16);
        boolean boolean27 = point2.equals((java.lang.Object) point16);
        point16.x = 100.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        java.lang.Double double36 = point32.y;
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = point32.equals(obj37);
        point32.x = 1.0d;
        java.lang.Double double41 = point32.y;
        java.lang.Double double42 = point32.x;
        point32.y = 1.0d;
        java.lang.Double double45 = point32.y;
        point32.x = 0.0d;
        java.lang.Double double48 = point32.y;
        java.lang.Object obj49 = null;
        boolean boolean50 = point32.equals(obj49);
        Line line51 = new Line(point16, point32);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        point2.y = 0.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        point16.y = 10.0d;
        boolean boolean20 = point13.equals((java.lang.Object) point16);
        point13.y = 0.0d;
        java.lang.Double double23 = point13.x;
        java.lang.Double double24 = point13.y;
        java.lang.Double double25 = point13.y;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point28.x = 0.0d;
        point28.y = (-1.0d);
        point28.y = 0.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        java.lang.Double double41 = point37.y;
        java.lang.Object obj42 = new java.lang.Object();
        boolean boolean43 = point37.equals(obj42);
        point37.x = 1.0d;
        boolean boolean46 = point28.equals((java.lang.Object) point37);
        boolean boolean47 = point13.equals((java.lang.Object) boolean46);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point50.x = 1.0d;
        point50.y = 1.0d;
        java.lang.Double double55 = point50.x;
        point50.x = (-1.0d);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 100.0d;
        point60.x = 10.0d;
        java.lang.Double double68 = point60.y;
        boolean boolean69 = point50.equals((java.lang.Object) double68);
        point50.y = (-1.0d);
        java.lang.Double double72 = point50.x;
        point50.y = 1.0d;
        java.lang.Double double75 = point50.y;
        point50.x = 10.0d;
        point50.x = 0.0d;
        boolean boolean80 = point13.equals((java.lang.Object) point50);
        java.lang.Double double81 = point13.y;
        Line line82 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = 1.0d;
        point2.y = 10.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        point19.x = 10.0d;
        java.lang.Double double27 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double30 = point19.x;
        java.lang.Double double31 = point19.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        point37.y = 10.0d;
        boolean boolean41 = point34.equals((java.lang.Object) point37);
        Point point44 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass45 = point44.getClass();
        boolean boolean46 = point37.equals((java.lang.Object) wildcardClass45);
        point37.y = 0.0d;
        boolean boolean49 = point19.equals((java.lang.Object) point37);
        Line line50 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        point17.y = 1.0d;
        boolean boolean22 = point14.equals((java.lang.Object) 1.0d);
        point14.x = (-1.0d);
        boolean boolean25 = point2.equals((java.lang.Object) point14);
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        point28.y = (-1.0d);
        java.lang.Double double33 = point28.y;
        java.lang.Double double34 = point28.y;
        point28.y = 1.0d;
        point28.y = 100.0d;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj42 = null;
        boolean boolean43 = point41.equals(obj42);
        boolean boolean44 = point28.equals((java.lang.Object) point41);
        point28.x = 100.0d;
        java.lang.Double double47 = point28.y;
        Line line48 = new Line(point14, point28);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point18.y = 0.0d;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.x;
        point18.x = 1.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        java.lang.Double double31 = point27.y;
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = point27.equals(obj32);
        java.lang.Double double34 = point27.y;
        point27.x = 1.0d;
        boolean boolean37 = point18.equals((java.lang.Object) point27);
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean41 = point27.equals((java.lang.Object) point40);
        java.lang.Object obj42 = null;
        boolean boolean43 = point40.equals(obj42);
        point40.x = 10.0d;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.y;
        java.lang.Double double51 = point48.x;
        point48.y = 1.0d;
        point48.x = 0.0d;
        java.lang.Double double56 = point48.y;
        point48.y = 1.0d;
        boolean boolean59 = point40.equals((java.lang.Object) 1.0d);
        Line line60 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        point2.y = 100.0d;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 0.0d;
        point20.y = (-1.0d);
        point20.y = 100.0d;
        point20.x = 100.0d;
        java.lang.Double double29 = point20.y;
        Line line30 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        java.lang.Double double21 = point15.y;
        boolean boolean22 = point2.equals((java.lang.Object) point15);
        java.lang.Double double23 = point15.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        java.lang.Double double29 = point26.y;
        java.lang.Double double30 = point26.y;
        point26.y = 0.0d;
        point26.x = 10.0d;
        point26.y = 1.0d;
        point26.y = 0.0d;
        boolean boolean39 = point15.equals((java.lang.Object) 0.0d);
        java.lang.Double double40 = point15.x;
        Point point41 = null;
        Line line42 = new Line(point15, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass11 = point10.getClass();
        boolean boolean12 = point2.equals((java.lang.Object) point10);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 0.0d;
        boolean boolean22 = point15.equals((java.lang.Object) "");
        point15.y = (-1.0d);
        Line line25 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point7.y = 100.0d;
        point7.y = 10.0d;
        java.lang.Double double12 = point7.y;
        java.lang.Double double13 = point7.y;
        point7.y = 10.0d;
        boolean boolean16 = point2.equals((java.lang.Object) point7);
        point2.x = 0.0d;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point24.x = 1.0d;
        point24.y = 1.0d;
        boolean boolean29 = point21.equals((java.lang.Object) 1.0d);
        java.lang.Double double30 = point21.y;
        java.lang.Double double31 = point21.x;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        boolean boolean39 = point21.equals((java.lang.Object) point34);
        point21.y = 100.0d;
        Line line42 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double12 = point2.y;
        point2.y = 10.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        java.lang.Double double25 = point21.y;
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = point21.equals(obj26);
        java.lang.Double double28 = point21.y;
        java.lang.Object obj29 = null;
        boolean boolean30 = point21.equals(obj29);
        Line line31 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        Line line21 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double9 = point8.y;
        boolean boolean11 = point8.equals((java.lang.Object) 0.0d);
        boolean boolean12 = point2.equals((java.lang.Object) point8);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.x = 1.0d;
        point15.y = 1.0d;
        java.lang.Double double20 = point15.x;
        java.lang.Double double21 = point15.y;
        point15.y = 1.0d;
        java.lang.Double double24 = point15.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        boolean boolean30 = point15.equals((java.lang.Object) 1.0d);
        java.lang.Double double31 = point15.x;
        java.lang.Double double32 = point15.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        java.lang.Double double39 = point35.y;
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = point35.equals(obj40);
        java.lang.Double double42 = point35.y;
        point35.x = 10.0d;
        java.lang.Double double45 = point35.y;
        point35.y = 0.0d;
        java.lang.Double double48 = point35.y;
        point35.x = 100.0d;
        boolean boolean51 = point15.equals((java.lang.Object) point35);
        Line line52 = new Line(point8, point15);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.x;
        point2.x = 10.0d;
        java.lang.Object obj12 = null;
        boolean boolean13 = point2.equals(obj12);
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        point16.y = 100.0d;
        point16.x = 0.0d;
        point16.y = 100.0d;
        Line line24 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        point2.x = 1.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        point16.y = 1.0d;
        java.lang.Double double21 = point16.x;
        point16.x = (-1.0d);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 100.0d;
        point26.x = 10.0d;
        java.lang.Double double34 = point26.y;
        boolean boolean35 = point16.equals((java.lang.Object) double34);
        point16.y = (-1.0d);
        java.lang.Double double38 = point16.x;
        point16.y = 1.0d;
        java.lang.Double double41 = point16.y;
        point16.x = 10.0d;
        point16.x = 0.0d;
        java.lang.Double double46 = point16.y;
        Line line47 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj16 = null;
        boolean boolean17 = point15.equals(obj16);
        boolean boolean18 = point2.equals((java.lang.Object) point15);
        point2.x = 100.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        boolean boolean29 = point23.equals((java.lang.Object) point26);
        java.lang.Double double30 = point26.x;
        boolean boolean31 = point2.equals((java.lang.Object) point26);
        point26.y = 1.0d;
        java.lang.Double double34 = point26.y;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        java.lang.Double double40 = point37.y;
        java.lang.Double double41 = point37.y;
        point37.y = 0.0d;
        point37.x = 0.0d;
        point37.y = 100.0d;
        boolean boolean48 = point26.equals((java.lang.Object) point37);
        java.lang.Double double49 = point26.y;
        Point point52 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.x;
        java.lang.Double double54 = point52.y;
        java.lang.Double double55 = point52.y;
        point52.y = 0.0d;
        point52.x = 1.0d;
        point52.x = 1.0d;
        point52.x = 0.0d;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point69.x = 1.0d;
        point69.y = 1.0d;
        boolean boolean74 = point66.equals((java.lang.Object) 1.0d);
        java.lang.Double double75 = point66.y;
        java.lang.Double double76 = point66.x;
        point66.x = 10.0d;
        point66.x = (-1.0d);
        point66.x = 1.0d;
        boolean boolean83 = point52.equals((java.lang.Object) point66);
        point52.y = 1.0d;
        point52.y = 0.0d;
        Line line88 = new Line(point26, point52);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double16 = point2.x;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double25 = point2.y;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.y = 10.0d;
        boolean boolean37 = point28.equals((java.lang.Object) 0L);
        java.lang.Double double38 = point28.y;
        Line line39 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.x;
        boolean boolean9 = point6.equals((java.lang.Object) 10.0f);
        point6.x = 100.0d;
        java.lang.Double double12 = point6.x;
        point6.y = 1.0d;
        point6.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        point6.x = (-1.0d);
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.y;
        point27.y = 0.0d;
        point27.y = 1.0d;
        point27.y = 0.0d;
        point27.x = 100.0d;
        boolean boolean40 = point22.equals((java.lang.Object) point27);
        java.lang.Double double41 = point27.x;
        point27.x = 10.0d;
        boolean boolean44 = point6.equals((java.lang.Object) point27);
        java.lang.Double double45 = point6.x;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        java.lang.Double double52 = point48.y;
        java.lang.Object obj53 = new java.lang.Object();
        boolean boolean54 = point48.equals(obj53);
        java.lang.Double double55 = point48.y;
        point48.y = 100.0d;
        java.lang.Double double58 = point48.y;
        point48.y = 1.0d;
        Line line61 = new Line(point6, point48);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        boolean boolean9 = point2.equals((java.lang.Object) 'a');
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.y = 0.0d;
        java.lang.Double double18 = point12.y;
        boolean boolean19 = point2.equals((java.lang.Object) double18);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        point22.y = (-1.0d);
        java.lang.Double double28 = point22.y;
        java.lang.Double double29 = point22.y;
        java.lang.Double double30 = point22.x;
        point22.x = (-1.0d);
        java.lang.Double double33 = point22.x;
        java.lang.Double double34 = point22.x;
        java.lang.Double double35 = point22.x;
        java.lang.Double double36 = point22.x;
        Line line37 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.x = 1.0d;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        point11.y = 100.0d;
        point11.x = 100.0d;
        java.lang.Double double21 = point11.x;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        java.lang.Double double27 = point24.x;
        point24.y = 0.0d;
        point24.y = 1.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        java.lang.Double double40 = point34.y;
        point34.y = 100.0d;
        point34.x = (-1.0d);
        java.lang.Double double45 = point34.x;
        boolean boolean46 = point24.equals((java.lang.Object) double45);
        Point point49 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 10.0d;
        point49.y = 0.0d;
        boolean boolean55 = point24.equals((java.lang.Object) point49);
        boolean boolean56 = point11.equals((java.lang.Object) boolean55);
        Line line57 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point18.equals((java.lang.Object) 1.0d);
        java.lang.Double double27 = point18.y;
        point18.x = 0.0d;
        boolean boolean30 = point2.equals((java.lang.Object) 0.0d);
        point2.y = (-1.0d);
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        point35.y = 0.0d;
        point35.y = 1.0d;
        point35.y = 1.0d;
        java.lang.Double double46 = point35.y;
        boolean boolean47 = point2.equals((java.lang.Object) point35);
        Point point48 = null;
        Line line49 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.x;
        point2.x = 1.0d;
        point2.x = 100.0d;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        java.lang.Double double24 = point19.y;
        java.lang.Double double25 = point19.y;
        java.lang.Double double26 = point19.y;
        point19.y = 10.0d;
        Line line29 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.x;
        java.lang.Double double9 = point7.y;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        boolean boolean12 = point2.equals((java.lang.Object) point7);
        java.lang.Double double13 = point2.y;
        point2.y = 100.0d;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.x;
        point18.y = 1.0d;
        java.lang.Double double26 = point18.x;
        boolean boolean27 = point2.equals((java.lang.Object) point18);
        point18.x = 10.0d;
        point18.x = 10.0d;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        point34.y = (-1.0d);
        java.lang.Double double39 = point34.y;
        java.lang.Double double40 = point34.y;
        java.lang.Double double41 = point34.y;
        java.lang.Double double42 = point34.y;
        java.lang.Double double43 = point34.x;
        point34.x = 1.0d;
        java.lang.Double double46 = point34.x;
        Line line47 = new Line(point18, point34);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 0.0d;
        point2.x = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        java.lang.Double double17 = point15.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 1.0d;
        java.lang.Class<?> wildcardClass29 = point20.getClass();
        boolean boolean30 = point15.equals((java.lang.Object) wildcardClass29);
        java.lang.Double double31 = point15.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.y = 10.0d;
        boolean boolean43 = point34.equals((java.lang.Object) 0L);
        java.lang.Double double44 = point34.x;
        java.lang.Double double45 = point34.y;
        point34.x = (-1.0d);
        boolean boolean48 = point15.equals((java.lang.Object) (-1.0d));
        Line line49 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 10.0d;
        java.lang.Double double22 = point15.y;
        point15.x = 10.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        point27.y = 1.0d;
        java.lang.Double double32 = point27.x;
        point27.x = (-1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        boolean boolean46 = point27.equals((java.lang.Object) double45);
        point27.y = (-1.0d);
        java.lang.Double double49 = point27.x;
        point27.y = 1.0d;
        boolean boolean52 = point15.equals((java.lang.Object) 1.0d);
        boolean boolean53 = point2.equals((java.lang.Object) point15);
        point15.x = 1.0d;
        Point point58 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point58.x = 0.0d;
        point58.y = (-1.0d);
        point58.y = 0.0d;
        point58.y = 10.0d;
        point58.x = 1.0d;
        Line line69 = new Line(point15, point58);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point7);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point15.x = 0.0d;
        point15.x = 1.0d;
        java.lang.Class<?> wildcardClass20 = point15.getClass();
        boolean boolean21 = point7.equals((java.lang.Object) point15);
        java.lang.Double double22 = point7.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point25.x = 1.0d;
        point25.y = 1.0d;
        java.lang.Double double30 = point25.x;
        point25.x = 1.0d;
        Point point35 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double36 = point35.x;
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double40 = point39.y;
        java.lang.Class<?> wildcardClass41 = point39.getClass();
        boolean boolean42 = point35.equals((java.lang.Object) wildcardClass41);
        point35.x = 0.0d;
        point35.y = 0.0d;
        boolean boolean47 = point25.equals((java.lang.Object) 0.0d);
        java.lang.Double double48 = point25.x;
        point25.y = 100.0d;
        point25.y = (-1.0d);
        Line line53 = new Line(point7, point25);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.x;
        point2.x = (-1.0d);
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        java.lang.Double double12 = point10.x;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean17 = point15.equals((java.lang.Object) true);
        boolean boolean18 = point10.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass19 = point10.getClass();
        boolean boolean20 = point2.equals((java.lang.Object) wildcardClass19);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 1.0d;
        java.lang.Object obj29 = null;
        boolean boolean30 = point23.equals(obj29);
        point23.x = 1.0d;
        point23.x = (-1.0d);
        java.lang.Double double35 = point23.x;
        boolean boolean36 = point2.equals((java.lang.Object) point23);
        point23.y = 10.0d;
        java.lang.Double double39 = point23.x;
        Point point42 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        point42.y = 1.0d;
        Line line47 = new Line(point23, point42);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 1.0d;
        java.lang.Object obj21 = null;
        boolean boolean22 = point15.equals(obj21);
        java.lang.Double double23 = point15.x;
        point15.x = 0.0d;
        Line line26 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point12.x = 1.0d;
        point12.y = 1.0d;
        java.lang.Double double17 = point12.x;
        point12.x = (-1.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 100.0d;
        point22.x = 10.0d;
        java.lang.Double double30 = point22.y;
        boolean boolean31 = point12.equals((java.lang.Object) double30);
        point12.y = (-1.0d);
        java.lang.Double double34 = point12.x;
        boolean boolean35 = point2.equals((java.lang.Object) point12);
        point2.y = 1.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 1.0d;
        java.lang.Object obj46 = null;
        boolean boolean47 = point40.equals(obj46);
        point40.x = 1.0d;
        point40.x = (-1.0d);
        point40.y = (-1.0d);
        point40.y = 100.0d;
        point40.x = 0.0d;
        Line line58 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean10 = point2.equals((java.lang.Object) 100.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        boolean boolean25 = point2.equals((java.lang.Object) point13);
        point13.x = 1.0d;
        java.lang.Double double28 = point13.y;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        java.lang.Double double33 = point31.y;
        java.lang.Double double34 = point31.x;
        point31.x = 100.0d;
        point31.x = 1.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.x;
        boolean boolean44 = point41.equals((java.lang.Object) 10.0f);
        point41.x = 100.0d;
        java.lang.Double double47 = point41.x;
        point41.y = 1.0d;
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.y;
        point52.y = 10.0d;
        point52.y = (-1.0d);
        java.lang.Class<?> wildcardClass58 = point52.getClass();
        boolean boolean59 = point41.equals((java.lang.Object) wildcardClass58);
        java.lang.Double double60 = point41.y;
        point41.x = 1.0d;
        boolean boolean63 = point31.equals((java.lang.Object) point41);
        point41.y = 100.0d;
        point41.y = 0.0d;
        Line line68 = new Line(point13, point41);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        point2.y = (-1.0d);
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point16.equals((java.lang.Object) point21);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point29.x = 0.0d;
        point29.x = 1.0d;
        java.lang.Class<?> wildcardClass34 = point29.getClass();
        boolean boolean35 = point21.equals((java.lang.Object) point29);
        java.lang.Object obj36 = null;
        boolean boolean37 = point21.equals(obj36);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point40.x = 1.0d;
        point40.y = 1.0d;
        boolean boolean45 = point21.equals((java.lang.Object) 1.0d);
        java.lang.Double double46 = point21.x;
        java.lang.Double double47 = point21.x;
        point21.x = 1.0d;
        Line line50 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        point7.x = 10.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point7);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        point20.y = 10.0d;
        boolean boolean26 = point7.equals((java.lang.Object) point20);
        point20.x = 100.0d;
        point20.y = (-1.0d);
        java.lang.Double double31 = point20.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        point34.y = (-1.0d);
        java.lang.Double double39 = point34.y;
        point34.y = 10.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point44.x = 0.0d;
        point44.y = 1.0d;
        java.lang.Double double49 = point44.x;
        java.lang.Double double50 = point44.x;
        boolean boolean51 = point34.equals((java.lang.Object) point44);
        java.lang.Object obj52 = null;
        boolean boolean53 = point34.equals(obj52);
        Line line54 = new Line(point20, point34);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        java.lang.Double double12 = point8.y;
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = point8.equals(obj13);
        point8.x = 1.0d;
        java.lang.Double double17 = point8.x;
        boolean boolean18 = point2.equals((java.lang.Object) double17);
        java.lang.Double double19 = point2.x;
        point2.y = 100.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point24.x = 1.0d;
        point24.y = 1.0d;
        java.lang.Double double29 = point24.x;
        point24.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.x = 10.0d;
        java.lang.Double double42 = point34.y;
        boolean boolean43 = point24.equals((java.lang.Object) double42);
        point24.y = (-1.0d);
        java.lang.Double double46 = point24.x;
        point24.x = 1.0d;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        point51.y = (-1.0d);
        point51.x = 0.0d;
        point51.x = 1.0d;
        point51.x = (-1.0d);
        boolean boolean62 = point24.equals((java.lang.Object) point51);
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        boolean boolean68 = point65.equals((java.lang.Object) 1L);
        point65.y = (-1.0d);
        java.lang.Double double71 = point65.y;
        Point point74 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point74.x = 100.0d;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        point79.y = 1.0d;
        point79.x = 1.0d;
        java.lang.Double double85 = point79.y;
        java.lang.Double double86 = point79.y;
        point79.x = 10.0d;
        boolean boolean89 = point74.equals((java.lang.Object) point79);
        boolean boolean90 = point65.equals((java.lang.Object) point79);
        java.lang.Class<?> wildcardClass91 = point79.getClass();
        boolean boolean92 = point51.equals((java.lang.Object) point79);
        Line line93 = new Line(point2, point51);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.x = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.x;
        boolean boolean20 = point2.equals((java.lang.Object) point15);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.x;
        point23.y = 0.0d;
        point23.y = (-1.0d);
        point23.y = 100.0d;
        java.lang.Double double32 = point23.x;
        point23.y = 10.0d;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.x;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean44 = point42.equals((java.lang.Object) true);
        boolean boolean45 = point37.equals((java.lang.Object) true);
        java.lang.Double double46 = point37.y;
        java.lang.Double double47 = point37.y;
        point37.x = 100.0d;
        java.lang.Double double50 = point37.x;
        java.lang.Double double51 = point37.y;
        boolean boolean52 = point23.equals((java.lang.Object) point37);
        Line line53 = new Line(point15, point37);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.x;
        boolean boolean12 = point9.equals((java.lang.Object) 10.0f);
        point9.x = 100.0d;
        java.lang.Double double15 = point9.x;
        point9.y = 1.0d;
        point9.x = 0.0d;
        point9.x = (-1.0d);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        java.lang.Double double31 = point27.y;
        boolean boolean32 = point24.equals((java.lang.Object) double31);
        java.lang.Double double33 = point24.y;
        java.lang.Double double34 = point24.x;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        point37.y = (-1.0d);
        point37.y = 0.0d;
        java.lang.Double double44 = point37.x;
        java.lang.Double double45 = point37.x;
        boolean boolean46 = point24.equals((java.lang.Object) point37);
        point37.y = 0.0d;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point51.x = 0.0d;
        point51.y = 1.0d;
        point51.y = 100.0d;
        boolean boolean58 = point37.equals((java.lang.Object) 100.0d);
        boolean boolean59 = point9.equals((java.lang.Object) 100.0d);
        java.lang.Double double60 = point9.x;
        java.lang.Double double61 = point9.x;
        Line line62 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double12 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        boolean boolean18 = point2.equals((java.lang.Object) (short) -1);
        java.lang.Double double19 = point2.y;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        java.lang.Double double25 = point22.x;
        point22.y = 0.0d;
        boolean boolean29 = point22.equals((java.lang.Object) '#');
        point22.y = 100.0d;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        point40.x = 1.0d;
        java.lang.Double double49 = point40.x;
        boolean boolean50 = point34.equals((java.lang.Object) double49);
        java.lang.Double double51 = point34.x;
        point34.x = 10.0d;
        java.lang.Double double54 = point34.x;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        point57.y = 1.0d;
        point57.x = 100.0d;
        point57.y = 10.0d;
        java.lang.Object obj65 = null;
        boolean boolean66 = point57.equals(obj65);
        boolean boolean67 = point34.equals((java.lang.Object) point57);
        boolean boolean68 = point22.equals((java.lang.Object) point34);
        Line line69 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point5.x = 0.0d;
        point5.y = 1.0d;
        java.lang.Double double10 = point5.x;
        point5.x = 0.0d;
        java.lang.Double double13 = point5.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point16.x = 100.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 1.0d;
        java.lang.Double double27 = point21.y;
        java.lang.Double double28 = point21.y;
        point21.x = 10.0d;
        boolean boolean31 = point16.equals((java.lang.Object) point21);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.y = 10.0d;
        point34.y = 10.0d;
        boolean boolean40 = point21.equals((java.lang.Object) point34);
        java.lang.Double double41 = point21.x;
        point21.x = (-1.0d);
        boolean boolean44 = point5.equals((java.lang.Object) point21);
        Line line45 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        java.lang.Double double15 = point11.y;
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = point11.equals(obj16);
        java.lang.Double double18 = point11.y;
        point11.x = 1.0d;
        boolean boolean21 = point2.equals((java.lang.Object) point11);
        point11.x = 1.0d;
        java.lang.Double double24 = point11.y;
        Point point25 = null;
        Line line26 = new Line(point11, point25);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double6 = point2.y;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.x;
        java.lang.Double double16 = point13.x;
        point13.y = 0.0d;
        boolean boolean20 = point13.equals((java.lang.Object) '#');
        point13.x = 0.0d;
        point13.y = 100.0d;
        point13.x = 10.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point29.equals((java.lang.Object) point32);
        point29.x = 10.0d;
        boolean boolean38 = point13.equals((java.lang.Object) 10.0d);
        point13.y = 0.0d;
        Line line41 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.x = 10.0d;
        java.lang.Double double17 = point9.y;
        point9.y = 0.0d;
        java.lang.Double double20 = point9.x;
        boolean boolean21 = point2.equals((java.lang.Object) point9);
        point9.y = 10.0d;
        point9.x = 0.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.x;
        boolean boolean31 = point28.equals((java.lang.Object) 10.0f);
        point28.x = 100.0d;
        java.lang.Double double34 = point28.x;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point37.x = 100.0d;
        boolean boolean40 = point28.equals((java.lang.Object) 100.0d);
        java.lang.Double double41 = point28.y;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point47.x = 1.0d;
        point47.y = 1.0d;
        boolean boolean52 = point44.equals((java.lang.Object) 1.0d);
        java.lang.Double double53 = point44.y;
        point44.x = 0.0d;
        boolean boolean56 = point28.equals((java.lang.Object) 0.0d);
        java.lang.Double double57 = point28.x;
        point28.y = (-1.0d);
        Point point62 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point62.y = 100.0d;
        java.lang.Object obj65 = null;
        boolean boolean66 = point62.equals(obj65);
        boolean boolean67 = point28.equals((java.lang.Object) boolean66);
        java.lang.Double double68 = point28.y;
        Line line69 = new Line(point9, point28);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        point2.x = 1.0d;
        boolean boolean15 = point2.equals((java.lang.Object) 10);
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean21 = point19.equals((java.lang.Object) true);
        point19.y = 100.0d;
        point19.y = 1.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point31.x = 1.0d;
        point31.y = 1.0d;
        boolean boolean36 = point28.equals((java.lang.Object) 1.0d);
        java.lang.Double double37 = point28.y;
        boolean boolean38 = point19.equals((java.lang.Object) point28);
        java.lang.Double double39 = point28.y;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 100.0d;
        boolean boolean46 = point28.equals((java.lang.Object) point42);
        Line line47 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.x = 10.0d;
        point2.x = 1.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        java.lang.Double double23 = point17.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point26.x = 100.0d;
        boolean boolean29 = point17.equals((java.lang.Object) 100.0d);
        java.lang.Double double30 = point17.y;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point36.x = 1.0d;
        point36.y = 1.0d;
        boolean boolean41 = point33.equals((java.lang.Object) 1.0d);
        java.lang.Double double42 = point33.y;
        point33.x = 0.0d;
        boolean boolean45 = point17.equals((java.lang.Object) 0.0d);
        point17.y = 0.0d;
        point17.x = 1.0d;
        Line line50 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        java.lang.Double double25 = point13.x;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        boolean boolean35 = point28.equals((java.lang.Object) point31);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass39 = point38.getClass();
        boolean boolean40 = point31.equals((java.lang.Object) wildcardClass39);
        point31.y = 0.0d;
        boolean boolean43 = point13.equals((java.lang.Object) point31);
        boolean boolean44 = point2.equals((java.lang.Object) point13);
        java.lang.Double double45 = point2.y;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        point48.x = 100.0d;
        point48.x = 10.0d;
        java.lang.Double double56 = point48.y;
        point48.y = 0.0d;
        java.lang.Double double59 = point48.x;
        point48.y = 100.0d;
        java.lang.Double double62 = point48.y;
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        point65.y = 1.0d;
        point65.x = 100.0d;
        point65.x = 10.0d;
        java.lang.Double double73 = point65.y;
        point65.y = 0.0d;
        point65.x = 10.0d;
        Point point80 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        boolean boolean81 = point65.equals((java.lang.Object) 1.0d);
        boolean boolean82 = point48.equals((java.lang.Object) boolean81);
        Line line83 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        boolean boolean13 = point10.equals((java.lang.Object) 1L);
        java.lang.Double double14 = point10.y;
        boolean boolean15 = point7.equals((java.lang.Object) double14);
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        point18.y = 100.0d;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass28 = point27.getClass();
        boolean boolean29 = point18.equals((java.lang.Object) point27);
        boolean boolean30 = point7.equals((java.lang.Object) point27);
        java.lang.Double double31 = point7.y;
        boolean boolean32 = point2.equals((java.lang.Object) point7);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double36 = point35.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        java.lang.Double double42 = point39.x;
        boolean boolean43 = point35.equals((java.lang.Object) point39);
        point35.x = (-1.0d);
        boolean boolean46 = point2.equals((java.lang.Object) (-1.0d));
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        point49.x = 0.0d;
        point49.x = 1.0d;
        Point point60 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point63.x = 1.0d;
        point63.y = 1.0d;
        boolean boolean68 = point60.equals((java.lang.Object) 1.0d);
        java.lang.Double double69 = point60.y;
        java.lang.Double double70 = point60.y;
        java.lang.Double double71 = point60.x;
        point60.x = 10.0d;
        boolean boolean74 = point49.equals((java.lang.Object) point60);
        Line line75 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line75.equals(line75)", line75.equals(line75));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        point11.y = (-1.0d);
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        java.lang.Double double19 = point11.x;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        point2.x = (-1.0d);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        java.lang.Double double30 = point25.y;
        java.lang.Double double31 = point25.y;
        Point point34 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double35 = point34.y;
        java.lang.Double double36 = point34.y;
        boolean boolean37 = point25.equals((java.lang.Object) point34);
        point25.x = 1.0d;
        Line line40 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        point2.x = (-1.0d);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean21 = point19.equals((java.lang.Object) true);
        boolean boolean22 = point14.equals((java.lang.Object) true);
        java.lang.Double double23 = point14.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.y = 0.0d;
        boolean boolean32 = point14.equals((java.lang.Object) point26);
        boolean boolean33 = point2.equals((java.lang.Object) point14);
        java.lang.Double double34 = point2.x;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point37.x = 0.0d;
        point37.y = (-1.0d);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean45 = point37.equals((java.lang.Object) 100.0d);
        Line line46 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        point11.y = (-1.0d);
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        java.lang.Double double19 = point11.x;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        Point point32 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point23.equals((java.lang.Object) point32);
        boolean boolean36 = point11.equals((java.lang.Object) boolean35);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.x;
        java.lang.Class<?> wildcardClass45 = point39.getClass();
        boolean boolean46 = point11.equals((java.lang.Object) point39);
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point49.x = 0.0d;
        point49.y = 1.0d;
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        point56.y = 1.0d;
        point56.x = 100.0d;
        point56.x = 10.0d;
        java.lang.Double double64 = point56.y;
        point56.y = 0.0d;
        java.lang.Double double67 = point56.x;
        boolean boolean68 = point49.equals((java.lang.Object) point56);
        point56.y = 10.0d;
        point56.x = 0.0d;
        java.lang.Double double73 = point56.x;
        point56.x = 100.0d;
        Line line76 = new Line(point11, point56);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        point2.x = (-1.0d);
        java.lang.Double double14 = point2.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        point17.y = 100.0d;
        point17.x = (-1.0d);
        point17.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        java.lang.Double double36 = point30.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point39.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        java.lang.Double double43 = point30.y;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        point46.x = 100.0d;
        java.lang.Double double52 = point46.x;
        boolean boolean53 = point30.equals((java.lang.Object) point46);
        boolean boolean54 = point17.equals((java.lang.Object) point46);
        java.lang.Double double55 = point17.y;
        java.lang.Double double56 = point17.y;
        boolean boolean57 = point2.equals((java.lang.Object) point17);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point63 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double64 = point63.y;
        point63.y = 10.0d;
        boolean boolean67 = point60.equals((java.lang.Object) point63);
        point60.y = 0.0d;
        boolean boolean70 = point17.equals((java.lang.Object) point60);
        point17.y = (-1.0d);
        point17.y = 10.0d;
        point17.y = 0.0d;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        point79.y = 1.0d;
        point79.x = 100.0d;
        point79.x = 10.0d;
        java.lang.Double double87 = point79.y;
        point79.y = 0.0d;
        java.lang.Double double90 = point79.y;
        Line line91 = new Line(point17, point79);
        org.junit.Assert.assertTrue("Contract failed: line91.equals(line91)", line91.equals(line91));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point13.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 1.0d;
        java.lang.Double double24 = point18.y;
        java.lang.Double double25 = point18.y;
        point18.x = 10.0d;
        boolean boolean28 = point13.equals((java.lang.Object) point18);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        point31.y = 10.0d;
        boolean boolean37 = point18.equals((java.lang.Object) point31);
        java.lang.Double double38 = point18.x;
        point18.x = (-1.0d);
        boolean boolean41 = point2.equals((java.lang.Object) point18);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        boolean boolean47 = point44.equals((java.lang.Object) 10.0f);
        point44.x = 100.0d;
        java.lang.Double double50 = point44.x;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point53.x = 100.0d;
        boolean boolean56 = point44.equals((java.lang.Object) 100.0d);
        point44.x = 10.0d;
        java.lang.Double double59 = point44.x;
        java.lang.Double double60 = point44.x;
        boolean boolean61 = point18.equals((java.lang.Object) point44);
        java.lang.Double double62 = point18.y;
        java.lang.Double double63 = point18.x;
        Point point66 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double67 = point66.y;
        java.lang.Double double68 = point66.x;
        point66.y = 0.0d;
        java.lang.Double double71 = point66.x;
        java.lang.Double double72 = point66.y;
        java.lang.Double double73 = point66.x;
        point66.x = (-1.0d);
        point66.y = 0.0d;
        Line line78 = new Line(point18, point66);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 100.0d;
        java.lang.Class<?> wildcardClass16 = point12.getClass();
        boolean boolean17 = point2.equals((java.lang.Object) point12);
        point2.y = 10.0d;
        point2.x = (-1.0d);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        java.lang.Double double31 = point27.y;
        boolean boolean32 = point24.equals((java.lang.Object) double31);
        java.lang.Double double33 = point24.y;
        java.lang.Double double34 = point24.x;
        point24.x = 100.0d;
        java.lang.Double double37 = point24.y;
        point24.x = 100.0d;
        java.lang.Double double40 = point24.y;
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point43.y = 0.0d;
        java.lang.Double double46 = point43.y;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        java.lang.Double double53 = point49.y;
        java.lang.Object obj54 = new java.lang.Object();
        boolean boolean55 = point49.equals(obj54);
        point49.x = 1.0d;
        java.lang.Double double58 = point49.x;
        boolean boolean59 = point43.equals((java.lang.Object) double58);
        java.lang.Double double60 = point43.x;
        point43.x = 10.0d;
        boolean boolean63 = point24.equals((java.lang.Object) point43);
        Line line64 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        point11.y = 1.0d;
        point11.y = 100.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        point27.y = 10.0d;
        boolean boolean31 = point24.equals((java.lang.Object) point27);
        boolean boolean33 = point27.equals((java.lang.Object) 10.0d);
        boolean boolean34 = point11.equals((java.lang.Object) 10.0d);
        java.lang.Double double35 = point11.x;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        point41.y = 10.0d;
        boolean boolean45 = point38.equals((java.lang.Object) point41);
        point38.y = 0.0d;
        java.lang.Double double48 = point38.x;
        java.lang.Double double49 = point38.y;
        point38.y = (-1.0d);
        boolean boolean52 = point11.equals((java.lang.Object) (-1.0d));
        Line line53 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.y;
        point2.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point19.y = 10.0d;
        point19.y = 10.0d;
        Line line24 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        point8.x = 100.0d;
        java.lang.Double double14 = point8.y;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.y;
        java.lang.Double double21 = point17.x;
        boolean boolean22 = point8.equals((java.lang.Object) double21);
        boolean boolean24 = point8.equals((java.lang.Object) false);
        point8.y = 1.0d;
        java.lang.Double double27 = point8.x;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 100.0d;
        point30.x = 10.0d;
        java.lang.Double double38 = point30.y;
        point30.y = 0.0d;
        Point point43 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        point43.y = 100.0d;
        boolean boolean47 = point30.equals((java.lang.Object) point43);
        java.lang.Double double48 = point43.x;
        boolean boolean49 = point8.equals((java.lang.Object) point43);
        Line line50 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj16 = null;
        boolean boolean17 = point15.equals(obj16);
        boolean boolean18 = point2.equals((java.lang.Object) point15);
        java.lang.Double double19 = point15.x;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.x;
        boolean boolean29 = point26.equals((java.lang.Object) 10.0f);
        point26.x = 100.0d;
        java.lang.Double double32 = point26.x;
        point26.y = 1.0d;
        point26.y = 1.0d;
        boolean boolean37 = point22.equals((java.lang.Object) point26);
        boolean boolean38 = point15.equals((java.lang.Object) point26);
        Point point41 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        point41.y = 100.0d;
        point41.y = (-1.0d);
        point41.x = 0.0d;
        point41.y = 0.0d;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        point53.y = (-1.0d);
        java.lang.Double double58 = point53.y;
        java.lang.Double double59 = point53.y;
        point53.y = 1.0d;
        point53.y = 1.0d;
        point53.x = 100.0d;
        java.lang.Double double66 = point53.y;
        boolean boolean67 = point41.equals((java.lang.Object) double66);
        Line line68 = new Line(point15, point41);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 1.0d;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.y;
        point2.x = 10.0d;
        point2.y = 0.0d;
        java.lang.Double double18 = point2.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 1.0d;
        java.lang.Object obj27 = null;
        boolean boolean28 = point21.equals(obj27);
        point21.x = 1.0d;
        point21.x = (-1.0d);
        java.lang.Double double33 = point21.y;
        java.lang.Double double34 = point21.x;
        Line line35 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        java.lang.Double double17 = point13.y;
        point13.y = 100.0d;
        point13.y = (-1.0d);
        boolean boolean22 = point2.equals((java.lang.Object) point13);
        point13.x = (-1.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        java.lang.Double double31 = point27.y;
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = point27.equals(obj32);
        point27.x = 1.0d;
        java.lang.Double double36 = point27.x;
        point27.y = 0.0d;
        point27.x = 1.0d;
        java.lang.Double double41 = point27.x;
        point27.x = 10.0d;
        point27.x = 10.0d;
        point27.y = (-1.0d);
        point27.x = 10.0d;
        Line line50 = new Line(point13, point27);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = (-1.0d);
        Point point13 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double14 = point13.x;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        java.lang.Class<?> wildcardClass19 = point17.getClass();
        boolean boolean20 = point13.equals((java.lang.Object) wildcardClass19);
        point13.x = 0.0d;
        point13.x = (-1.0d);
        Line line25 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        boolean boolean18 = point2.equals((java.lang.Object) false);
        point2.y = 100.0d;
        java.lang.Double double21 = point2.x;
        point2.y = 100.0d;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.x;
        point26.y = 100.0d;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.x;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        java.lang.Double double41 = point37.y;
        java.lang.Object obj42 = new java.lang.Object();
        boolean boolean43 = point37.equals(obj42);
        java.lang.Double double44 = point37.y;
        java.lang.Class<?> wildcardClass45 = point37.getClass();
        boolean boolean46 = point33.equals((java.lang.Object) point37);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point49.y = 100.0d;
        point49.y = 0.0d;
        boolean boolean54 = point33.equals((java.lang.Object) 0.0d);
        java.lang.Double double55 = point33.y;
        java.lang.Double double56 = point33.x;
        boolean boolean57 = point26.equals((java.lang.Object) point33);
        Line line58 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        java.lang.Double double21 = point18.x;
        point18.y = 1.0d;
        point18.x = 0.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point28.x = 1.0d;
        point28.y = 1.0d;
        java.lang.Double double33 = point28.x;
        point28.x = (-1.0d);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        point38.y = 1.0d;
        point38.x = 100.0d;
        point38.x = 10.0d;
        java.lang.Double double46 = point38.y;
        boolean boolean47 = point28.equals((java.lang.Object) double46);
        point28.y = (-1.0d);
        java.lang.Double double50 = point28.x;
        boolean boolean51 = point18.equals((java.lang.Object) point28);
        point28.y = (-1.0d);
        java.lang.Double double54 = point28.x;
        Line line55 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.y = 100.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        point17.y = 100.0d;
        point17.y = 1.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.x;
        boolean boolean35 = point32.equals((java.lang.Object) 10.0f);
        point32.x = 100.0d;
        java.lang.Double double38 = point32.x;
        point32.x = 0.0d;
        boolean boolean41 = point17.equals((java.lang.Object) point32);
        java.lang.Double double42 = point17.x;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        point45.y = 1.0d;
        point45.x = 100.0d;
        java.lang.Double double51 = point45.y;
        point45.x = 10.0d;
        boolean boolean54 = point17.equals((java.lang.Object) point45);
        Line line55 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point19.y = 100.0d;
        java.lang.Double double22 = point19.y;
        point19.x = 0.0d;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean34 = point32.equals((java.lang.Object) true);
        boolean boolean35 = point27.equals((java.lang.Object) true);
        java.lang.Double double36 = point27.x;
        point27.y = 0.0d;
        boolean boolean39 = point19.equals((java.lang.Object) point27);
        point27.x = 100.0d;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.x;
        boolean boolean51 = point48.equals((java.lang.Object) 10.0f);
        point48.x = 100.0d;
        java.lang.Double double54 = point48.x;
        point48.y = 1.0d;
        point48.y = 1.0d;
        boolean boolean59 = point44.equals((java.lang.Object) point48);
        point48.x = (-1.0d);
        point48.y = (-1.0d);
        Point point66 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double67 = point66.y;
        Point point70 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point70.y = 0.0d;
        Point point75 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double76 = point75.x;
        java.lang.Double double77 = point75.y;
        java.lang.Double double78 = point75.y;
        java.lang.Double double79 = point75.y;
        boolean boolean80 = point70.equals((java.lang.Object) point75);
        boolean boolean81 = point66.equals((java.lang.Object) point70);
        point66.y = 1.0d;
        boolean boolean84 = point48.equals((java.lang.Object) point66);
        boolean boolean85 = point27.equals((java.lang.Object) point66);
        Line line86 = new Line(point2, point66);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        boolean boolean13 = point10.equals((java.lang.Object) 1L);
        java.lang.Double double14 = point10.y;
        boolean boolean15 = point7.equals((java.lang.Object) double14);
        point7.x = 10.0d;
        boolean boolean18 = point2.equals((java.lang.Object) point7);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point30.x = 100.0d;
        boolean boolean33 = point21.equals((java.lang.Object) 100.0d);
        java.lang.Double double34 = point21.y;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point40.x = 1.0d;
        point40.y = 1.0d;
        boolean boolean45 = point37.equals((java.lang.Object) 1.0d);
        java.lang.Double double46 = point37.y;
        point37.x = 0.0d;
        boolean boolean49 = point21.equals((java.lang.Object) 0.0d);
        point21.y = (-1.0d);
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point54.y = 1.0d;
        java.lang.Double double57 = point54.y;
        java.lang.Double double58 = point54.y;
        point54.y = 0.0d;
        point54.y = 1.0d;
        point54.y = 1.0d;
        java.lang.Double double65 = point54.y;
        boolean boolean66 = point21.equals((java.lang.Object) point54);
        Point point69 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double73 = point72.y;
        boolean boolean75 = point72.equals((java.lang.Object) 1L);
        java.lang.Double double76 = point72.y;
        boolean boolean77 = point69.equals((java.lang.Object) double76);
        java.lang.Double double78 = point69.y;
        java.lang.Double double79 = point69.x;
        Point point82 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point85 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double86 = point85.y;
        boolean boolean88 = point85.equals((java.lang.Object) 1L);
        java.lang.Double double89 = point85.y;
        boolean boolean90 = point82.equals((java.lang.Object) double89);
        java.lang.Double double91 = point82.y;
        boolean boolean92 = point69.equals((java.lang.Object) point82);
        point69.x = 100.0d;
        boolean boolean95 = point21.equals((java.lang.Object) point69);
        Line line96 = new Line(point7, point21);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.x;
        java.lang.Double double13 = point11.y;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.x;
        boolean boolean18 = point2.equals((java.lang.Object) double17);
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        java.lang.Double double29 = point25.y;
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = point25.equals(obj30);
        java.lang.Double double32 = point25.y;
        java.lang.Class<?> wildcardClass33 = point25.getClass();
        boolean boolean34 = point21.equals((java.lang.Object) point25);
        java.lang.Double double35 = point21.y;
        java.lang.Class<?> wildcardClass36 = point21.getClass();
        boolean boolean37 = point2.equals((java.lang.Object) wildcardClass36);
        java.lang.Double double38 = point2.x;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        java.lang.Double double44 = point41.y;
        java.lang.Double double45 = point41.y;
        point41.y = 10.0d;
        java.lang.Double double48 = point41.y;
        point41.x = 0.0d;
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double54 = point53.x;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point57.y = 1.0d;
        point57.y = (-1.0d);
        boolean boolean62 = point53.equals((java.lang.Object) point57);
        boolean boolean63 = point41.equals((java.lang.Object) point57);
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        boolean boolean69 = point66.equals((java.lang.Object) 1L);
        point66.y = (-1.0d);
        java.lang.Double double72 = point66.y;
        java.lang.Double double73 = point66.y;
        java.lang.Double double74 = point66.x;
        point66.x = 10.0d;
        java.lang.Class<?> wildcardClass77 = point66.getClass();
        boolean boolean78 = point41.equals((java.lang.Object) point66);
        java.lang.Double double79 = point41.y;
        point41.x = 0.0d;
        Line line82 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        point17.y = 10.0d;
        boolean boolean21 = point14.equals((java.lang.Object) point17);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass25 = point24.getClass();
        boolean boolean26 = point17.equals((java.lang.Object) wildcardClass25);
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        boolean boolean32 = point17.equals((java.lang.Object) point29);
        boolean boolean33 = point2.equals((java.lang.Object) point17);
        java.lang.Double double34 = point17.x;
        java.lang.Double double35 = point17.y;
        java.lang.Double double36 = point17.y;
        java.lang.Double double37 = point17.x;
        java.lang.Double double38 = point17.y;
        java.lang.Double double39 = point17.y;
        Point point42 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.x;
        java.lang.Double double44 = point42.y;
        point42.y = (-1.0d);
        point42.x = 100.0d;
        point42.y = 100.0d;
        java.lang.Double double51 = point42.y;
        Line line52 = new Line(point17, point42);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point8.y = 10.0d;
        java.lang.Double double11 = point8.x;
        java.lang.Double double12 = point8.x;
        java.lang.Double double13 = point8.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        java.lang.Double double20 = point16.y;
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = point16.equals(obj21);
        java.lang.Double double23 = point16.y;
        java.lang.Class<?> wildcardClass24 = point16.getClass();
        boolean boolean25 = point8.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = point2.equals((java.lang.Object) point8);
        point8.x = 1.0d;
        point8.y = 0.0d;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        point33.x = 1.0d;
        java.lang.Object obj39 = null;
        boolean boolean40 = point33.equals(obj39);
        point33.x = 1.0d;
        java.lang.Double double43 = point33.x;
        point33.y = 1.0d;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.y;
        java.lang.Double double51 = point48.x;
        point48.y = 1.0d;
        point48.x = 1.0d;
        boolean boolean56 = point33.equals((java.lang.Object) 1.0d);
        Point point59 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double60 = point59.y;
        point59.y = 1.0d;
        point59.x = 1.0d;
        java.lang.Object obj65 = null;
        boolean boolean66 = point59.equals(obj65);
        point59.x = 1.0d;
        boolean boolean70 = point59.equals((java.lang.Object) false);
        java.lang.Double double71 = point59.x;
        point59.y = (-1.0d);
        point59.x = 1.0d;
        java.lang.Double double76 = point59.x;
        java.lang.Double double77 = point59.x;
        java.lang.Class<?> wildcardClass78 = point59.getClass();
        boolean boolean79 = point33.equals((java.lang.Object) point59);
        Line line80 = new Line(point8, point33);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.x = 0.0d;
        point2.x = 0.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        java.lang.Double double17 = point11.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        java.lang.Double double24 = point11.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 100.0d;
        java.lang.Double double33 = point27.x;
        boolean boolean34 = point11.equals((java.lang.Object) point27);
        java.lang.Double double35 = point27.x;
        Line line36 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point15.y = 0.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.x;
        boolean boolean20 = point2.equals((java.lang.Object) point15);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point23.y = 100.0d;
        java.lang.Double double26 = point23.y;
        Line line27 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        point7.y = (-1.0d);
        java.lang.Double double12 = point7.x;
        point7.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        boolean boolean23 = point20.equals((java.lang.Object) 1L);
        java.lang.Double double24 = point20.y;
        boolean boolean25 = point17.equals((java.lang.Object) double24);
        java.lang.Double double26 = point17.y;
        java.lang.Double double27 = point17.x;
        point17.x = 100.0d;
        java.lang.Double double30 = point17.y;
        point17.y = 10.0d;
        point17.x = 1.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.y;
        point40.y = 10.0d;
        boolean boolean44 = point37.equals((java.lang.Object) point40);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass48 = point47.getClass();
        boolean boolean49 = point40.equals((java.lang.Object) wildcardClass48);
        java.lang.Double double50 = point40.y;
        boolean boolean51 = point17.equals((java.lang.Object) double50);
        java.lang.Double double52 = point17.x;
        boolean boolean53 = point7.equals((java.lang.Object) point17);
        boolean boolean54 = point2.equals((java.lang.Object) point7);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        point57.y = 1.0d;
        point57.x = 1.0d;
        java.lang.Object obj63 = null;
        boolean boolean64 = point57.equals(obj63);
        point57.x = 1.0d;
        point57.x = (-1.0d);
        java.lang.Double double69 = point57.y;
        java.lang.Double double70 = point57.x;
        point57.x = 0.0d;
        Line line73 = new Line(point7, point57);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.x = 1.0d;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        point8.x = 100.0d;
        java.lang.Double double14 = point8.y;
        point8.y = 100.0d;
        point8.x = (-1.0d);
        point8.x = 100.0d;
        java.lang.Double double21 = point8.y;
        point8.y = 100.0d;
        java.lang.Double double24 = point8.y;
        Point point27 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.x;
        java.lang.Double double29 = point27.y;
        point27.y = (-1.0d);
        java.lang.Double double32 = point27.y;
        java.lang.Double double33 = point27.x;
        java.lang.Double double34 = point27.x;
        boolean boolean35 = point8.equals((java.lang.Object) point27);
        Line line36 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        point8.x = 100.0d;
        point8.y = 100.0d;
        boolean boolean16 = point2.equals((java.lang.Object) 100.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point19.x = 1.0d;
        point19.y = 1.0d;
        java.lang.Double double24 = point19.x;
        point19.x = (-1.0d);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        point29.x = 100.0d;
        point29.x = 10.0d;
        java.lang.Double double37 = point29.y;
        boolean boolean38 = point19.equals((java.lang.Object) double37);
        point19.y = (-1.0d);
        java.lang.Double double41 = point19.x;
        java.lang.Double double42 = point19.x;
        java.lang.Double double43 = point19.x;
        java.lang.Double double44 = point19.y;
        Line line45 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        boolean boolean17 = point5.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = point5.getClass();
        boolean boolean19 = point2.equals((java.lang.Object) wildcardClass18);
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point22.y = 1.0d;
        point22.y = (-1.0d);
        java.lang.Double double27 = point22.y;
        java.lang.Double double28 = point22.y;
        point22.y = 1.0d;
        point22.y = 100.0d;
        point22.y = 0.0d;
        java.lang.Double double35 = point22.y;
        java.lang.Double double36 = point22.y;
        Line line37 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double16 = point2.y;
        point2.x = 100.0d;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        java.lang.Double double24 = point21.y;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass28 = point27.getClass();
        boolean boolean29 = point21.equals((java.lang.Object) wildcardClass28);
        java.lang.Double double30 = point21.x;
        point21.y = 10.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        java.lang.Double double39 = point35.y;
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = point35.equals(obj40);
        point35.x = 1.0d;
        java.lang.Double double44 = point35.x;
        point35.y = 0.0d;
        point35.x = 1.0d;
        java.lang.Double double49 = point35.x;
        point35.x = 10.0d;
        point35.x = 10.0d;
        boolean boolean54 = point21.equals((java.lang.Object) 10.0d);
        Line line55 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        boolean boolean7 = point2.equals((java.lang.Object) 1L);
        Point point10 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double11 = point10.x;
        point10.x = 100.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double24 = point20.y;
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = point20.equals(obj25);
        java.lang.Double double27 = point20.y;
        java.lang.Class<?> wildcardClass28 = point20.getClass();
        boolean boolean29 = point16.equals((java.lang.Object) point20);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point32.y = 100.0d;
        point32.y = 0.0d;
        boolean boolean37 = point16.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass38 = point16.getClass();
        boolean boolean39 = point10.equals((java.lang.Object) wildcardClass38);
        point10.x = (-1.0d);
        boolean boolean42 = point2.equals((java.lang.Object) point10);
        Point point43 = null;
        Line line44 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double8 = point7.y;
        boolean boolean9 = point2.equals((java.lang.Object) double8);
        point2.x = (-1.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.y = 100.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point14);
        point14.y = 0.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean34 = point27.equals((java.lang.Object) point30);
        boolean boolean36 = point30.equals((java.lang.Object) 10.0d);
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        boolean boolean43 = point30.equals((java.lang.Object) point39);
        point39.x = 10.0d;
        Line line46 = new Line(point14, point39);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        boolean boolean23 = point14.equals((java.lang.Object) point18);
        boolean boolean24 = point2.equals((java.lang.Object) point18);
        point2.x = 0.0d;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.x;
        java.lang.Double double31 = point29.y;
        point29.y = (-1.0d);
        point29.y = 0.0d;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        java.lang.Double double44 = point38.y;
        point38.y = 1.0d;
        point38.y = 100.0d;
        point38.x = 1.0d;
        point38.y = (-1.0d);
        boolean boolean53 = point29.equals((java.lang.Object) point38);
        Line line54 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.y = 0.0d;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.x;
        boolean boolean22 = point19.equals((java.lang.Object) 10.0f);
        point19.x = 100.0d;
        boolean boolean25 = point13.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass26 = point13.getClass();
        boolean boolean27 = point10.equals((java.lang.Object) wildcardClass26);
        point10.y = 100.0d;
        Line line30 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.y = 100.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) point12);
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.x;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        java.lang.Class<?> wildcardClass36 = point28.getClass();
        boolean boolean37 = point24.equals((java.lang.Object) point28);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point40.y = 100.0d;
        point40.y = 0.0d;
        boolean boolean45 = point24.equals((java.lang.Object) 0.0d);
        java.lang.Double double46 = point24.x;
        point24.y = (-1.0d);
        boolean boolean49 = point12.equals((java.lang.Object) (-1.0d));
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point52.y = 1.0d;
        java.lang.Double double55 = point52.y;
        java.lang.Double double56 = point52.y;
        point52.y = 0.0d;
        point52.y = 1.0d;
        point52.y = 0.0d;
        java.lang.Double double63 = point52.x;
        boolean boolean64 = point12.equals((java.lang.Object) point52);
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point67.y = (-1.0d);
        java.lang.Double double70 = point67.x;
        point67.x = (-1.0d);
        point67.x = 10.0d;
        boolean boolean75 = point52.equals((java.lang.Object) point67);
        Point point78 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double79 = point78.y;
        point78.y = 1.0d;
        java.lang.Double double82 = point78.y;
        java.lang.Object obj83 = new java.lang.Object();
        boolean boolean84 = point78.equals(obj83);
        Point point87 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double88 = point87.x;
        boolean boolean90 = point87.equals((java.lang.Object) 10.0f);
        point87.x = 0.0d;
        java.lang.Class<?> wildcardClass93 = point87.getClass();
        boolean boolean94 = point78.equals((java.lang.Object) wildcardClass93);
        Line line95 = new Line(point52, point78);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        java.lang.Double double12 = point7.x;
        java.lang.Double double13 = point7.y;
        point7.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        point18.x = 1.0d;
        java.lang.Double double27 = point18.x;
        point18.y = 0.0d;
        java.lang.Class<?> wildcardClass30 = point18.getClass();
        boolean boolean31 = point7.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = point2.equals((java.lang.Object) point7);
        point7.x = 0.0d;
        point7.y = 10.0d;
        java.lang.Double double37 = point7.x;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 1.0d;
        java.lang.Double double46 = point40.y;
        java.lang.Double double47 = point40.y;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean52 = point40.equals((java.lang.Object) point50);
        Line line53 = new Line(point7, point50);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.x;
        point15.y = 0.0d;
        point15.y = (-1.0d);
        point15.y = (-1.0d);
        point15.x = 0.0d;
        Line line26 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point14.x = 1.0d;
        point14.y = 1.0d;
        boolean boolean19 = point11.equals((java.lang.Object) 1.0d);
        java.lang.Double double20 = point11.y;
        boolean boolean21 = point2.equals((java.lang.Object) point11);
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        point24.y = (-1.0d);
        java.lang.Double double29 = point24.y;
        point24.y = 100.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.y = 10.0d;
        boolean boolean42 = point24.equals((java.lang.Object) 10.0d);
        java.lang.Double double43 = point24.y;
        point24.y = 1.0d;
        java.lang.Class<?> wildcardClass46 = point24.getClass();
        boolean boolean47 = point11.equals((java.lang.Object) point24);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 1.0d;
        point50.y = 0.0d;
        point50.y = 0.0d;
        java.lang.Double double60 = point50.x;
        Line line61 = new Line(point24, point50);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        boolean boolean18 = point2.equals((java.lang.Object) false);
        point2.y = 1.0d;
        java.lang.Double double21 = point2.x;
        java.lang.Double double22 = point2.x;
        point2.x = 100.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean29 = point27.equals((java.lang.Object) true);
        point27.y = 100.0d;
        point27.y = 1.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point39.x = 1.0d;
        point39.y = 1.0d;
        boolean boolean44 = point36.equals((java.lang.Object) 1.0d);
        java.lang.Double double45 = point36.y;
        boolean boolean46 = point27.equals((java.lang.Object) point36);
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        java.lang.Double double54 = point49.y;
        point49.y = 100.0d;
        Point point59 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double60 = point59.y;
        point59.y = 1.0d;
        point59.x = 100.0d;
        point59.y = 10.0d;
        boolean boolean67 = point49.equals((java.lang.Object) 10.0d);
        java.lang.Double double68 = point49.y;
        point49.y = 1.0d;
        java.lang.Class<?> wildcardClass71 = point49.getClass();
        boolean boolean72 = point36.equals((java.lang.Object) point49);
        boolean boolean73 = point2.equals((java.lang.Object) point36);
        point2.y = 1.0d;
        Point point78 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point78.y = 1.0d;
        java.lang.Double double81 = point78.y;
        java.lang.Double double82 = point78.y;
        java.lang.Double double83 = point78.x;
        java.lang.Double double84 = point78.y;
        java.lang.Double double85 = point78.y;
        java.lang.Double double86 = point78.y;
        java.lang.Double double87 = point78.y;
        point78.y = 1.0d;
        Line line90 = new Line(point2, point78);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        point12.y = 1.0d;
        boolean boolean21 = point2.equals((java.lang.Object) point12);
        point12.y = (-1.0d);
        point12.x = (-1.0d);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.x;
        java.lang.Double double30 = point28.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        java.lang.Double double38 = point33.y;
        java.lang.Double double39 = point33.y;
        point33.y = 1.0d;
        java.lang.Class<?> wildcardClass42 = point33.getClass();
        boolean boolean43 = point28.equals((java.lang.Object) wildcardClass42);
        point28.y = 100.0d;
        java.lang.Double double46 = point28.x;
        point28.y = 1.0d;
        Line line49 = new Line(point12, point28);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point15.equals((java.lang.Object) double22);
        java.lang.Double double24 = point15.y;
        boolean boolean25 = point2.equals((java.lang.Object) point15);
        java.lang.Double double26 = point15.y;
        point15.x = 1.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.x;
        boolean boolean33 = point15.equals((java.lang.Object) point31);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point36.y = 0.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.x;
        point36.x = 1.0d;
        point36.x = 0.0d;
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.y;
        boolean boolean50 = point36.equals((java.lang.Object) point47);
        java.lang.Double double51 = point47.x;
        point47.y = 0.0d;
        Line line54 = new Line(point15, point47);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean10 = point2.equals((java.lang.Object) 100.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        boolean boolean25 = point2.equals((java.lang.Object) point13);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        Point point32 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 0.0d;
        point32.x = 1.0d;
        point32.x = (-1.0d);
        boolean boolean40 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double41 = point2.y;
        java.lang.Double double42 = point2.x;
        java.lang.Double double43 = point2.y;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        boolean boolean52 = point49.equals((java.lang.Object) 1L);
        java.lang.Double double53 = point49.y;
        boolean boolean54 = point46.equals((java.lang.Object) double53);
        java.lang.Double double55 = point46.y;
        point46.y = (-1.0d);
        java.lang.Double double58 = point46.y;
        java.lang.Double double59 = point46.x;
        point46.x = 100.0d;
        java.lang.Double double62 = point46.x;
        Line line63 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        boolean boolean26 = point18.equals((java.lang.Object) double25);
        java.lang.Double double27 = point18.x;
        boolean boolean28 = point2.equals((java.lang.Object) point18);
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point31.x = 0.0d;
        point31.y = (-1.0d);
        point31.y = 0.0d;
        point31.y = 10.0d;
        point31.x = 1.0d;
        boolean boolean42 = point2.equals((java.lang.Object) point31);
        point2.y = 0.0d;
        point2.x = 100.0d;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point49.x = 1.0d;
        java.lang.Double double52 = point49.y;
        java.lang.Double double53 = point49.x;
        point49.y = 10.0d;
        point49.y = 10.0d;
        point49.x = 10.0d;
        Line line60 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point9.x = 0.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.x = 1.0d;
        point15.y = 1.0d;
        java.lang.Double double20 = point15.x;
        point15.x = (-1.0d);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 100.0d;
        point25.x = 10.0d;
        java.lang.Double double33 = point25.y;
        boolean boolean34 = point15.equals((java.lang.Object) double33);
        point15.y = (-1.0d);
        java.lang.Double double37 = point15.x;
        point15.y = 1.0d;
        java.lang.Double double40 = point15.y;
        Point point43 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.x;
        java.lang.Double double45 = point43.y;
        java.lang.Double double46 = point43.y;
        point43.y = 0.0d;
        point43.x = 1.0d;
        boolean boolean51 = point15.equals((java.lang.Object) point43);
        java.lang.Double double52 = point43.y;
        Point point55 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double56 = point55.x;
        java.lang.Double double57 = point55.y;
        java.lang.Double double58 = point55.y;
        point55.y = (-1.0d);
        point55.x = 0.0d;
        point55.y = 10.0d;
        Point point67 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double68 = point67.x;
        point67.x = 100.0d;
        point67.x = (-1.0d);
        boolean boolean73 = point55.equals((java.lang.Object) (-1.0d));
        boolean boolean74 = point43.equals((java.lang.Object) point55);
        boolean boolean75 = point9.equals((java.lang.Object) point43);
        Point point78 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point78.x = 100.0d;
        Point point83 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double84 = point83.y;
        point83.y = 1.0d;
        point83.x = 1.0d;
        java.lang.Double double89 = point83.y;
        java.lang.Double double90 = point83.y;
        point83.x = 10.0d;
        boolean boolean93 = point78.equals((java.lang.Object) point83);
        java.lang.Double double94 = point83.y;
        java.lang.Double double95 = point83.x;
        point83.x = 100.0d;
        Line line98 = new Line(point9, point83);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.y;
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        boolean boolean19 = point2.equals((java.lang.Object) point12);
        point12.x = 0.0d;
        point12.x = 0.0d;
        java.lang.Double double24 = point12.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 100.0d;
        point27.x = 10.0d;
        java.lang.Double double35 = point27.y;
        point27.y = 0.0d;
        java.lang.Double double38 = point27.x;
        point27.y = (-1.0d);
        point27.y = 10.0d;
        point27.x = 100.0d;
        point27.x = 1.0d;
        point27.y = 100.0d;
        boolean boolean49 = point12.equals((java.lang.Object) point27);
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point52.x = 0.0d;
        point52.y = (-1.0d);
        point52.y = 0.0d;
        point52.y = 10.0d;
        java.lang.Double double61 = point52.x;
        Point point64 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point64.y = 1.0d;
        point64.y = (-1.0d);
        java.lang.Double double69 = point64.x;
        java.lang.Double double70 = point64.x;
        point64.x = 0.0d;
        java.lang.Double double73 = point64.y;
        point64.x = 1.0d;
        boolean boolean76 = point52.equals((java.lang.Object) point64);
        Line line77 = new Line(point27, point52);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        boolean boolean23 = point14.equals((java.lang.Object) point18);
        boolean boolean24 = point2.equals((java.lang.Object) point18);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point37.x = 1.0d;
        point37.y = 1.0d;
        boolean boolean42 = point34.equals((java.lang.Object) 1.0d);
        java.lang.Double double43 = point34.y;
        java.lang.Double double44 = point34.y;
        java.lang.Double double45 = point34.x;
        java.lang.Double double46 = point34.y;
        boolean boolean47 = point27.equals((java.lang.Object) double46);
        boolean boolean48 = point2.equals((java.lang.Object) double46);
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.x;
        point51.y = 0.0d;
        java.lang.Double double56 = point51.x;
        point51.x = 1.0d;
        Line line59 = new Line(point2, point51);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point12.x = 1.0d;
        java.lang.Double double15 = point12.y;
        point12.x = 100.0d;
        java.lang.Double double18 = point12.x;
        java.lang.Double double19 = point12.x;
        boolean boolean20 = point2.equals((java.lang.Object) double19);
        point2.y = 0.0d;
        Point point23 = null;
        Line line24 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.y = 0.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point14);
        point2.y = 1.0d;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        java.lang.Double double30 = point25.y;
        java.lang.Double double31 = point25.y;
        point25.y = 1.0d;
        point25.y = 100.0d;
        java.lang.Double double36 = point25.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point39.x = 0.0d;
        point39.y = 1.0d;
        point39.y = 100.0d;
        boolean boolean46 = point25.equals((java.lang.Object) point39);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point49.y = 100.0d;
        point49.y = 0.0d;
        point49.x = 0.0d;
        java.lang.Double double56 = point49.x;
        java.lang.Double double57 = point49.y;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point60.y = 0.0d;
        java.lang.Double double63 = point60.y;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        point66.y = 1.0d;
        java.lang.Double double70 = point66.y;
        java.lang.Object obj71 = new java.lang.Object();
        boolean boolean72 = point66.equals(obj71);
        point66.x = 1.0d;
        java.lang.Double double75 = point66.x;
        boolean boolean76 = point60.equals((java.lang.Object) double75);
        boolean boolean77 = point49.equals((java.lang.Object) point60);
        boolean boolean78 = point25.equals((java.lang.Object) point60);
        Line line79 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 100.0d;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.y;
        point18.y = 1.0d;
        point18.y = 100.0d;
        point18.x = 1.0d;
        point18.y = (-1.0d);
        point18.y = 10.0d;
        java.lang.Double double35 = point18.x;
        point18.x = 10.0d;
        Line line38 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        point2.x = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.x;
        java.lang.Double double15 = point13.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.y;
        point18.y = 1.0d;
        java.lang.Class<?> wildcardClass27 = point18.getClass();
        boolean boolean28 = point13.equals((java.lang.Object) wildcardClass27);
        point13.y = 100.0d;
        boolean boolean31 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double32 = point2.y;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        java.lang.Double double37 = point35.y;
        java.lang.Double double38 = point35.x;
        point35.x = 100.0d;
        point35.x = 1.0d;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.x;
        boolean boolean48 = point45.equals((java.lang.Object) 10.0f);
        point45.x = 100.0d;
        java.lang.Double double51 = point45.x;
        point45.y = 1.0d;
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double57 = point56.y;
        point56.y = 10.0d;
        point56.y = (-1.0d);
        java.lang.Class<?> wildcardClass62 = point56.getClass();
        boolean boolean63 = point45.equals((java.lang.Object) wildcardClass62);
        java.lang.Double double64 = point45.y;
        point45.x = 1.0d;
        boolean boolean67 = point35.equals((java.lang.Object) point45);
        java.lang.Double double68 = point45.x;
        java.lang.Double double69 = point45.x;
        Line line70 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point14.x = 100.0d;
        point14.x = 10.0d;
        point14.x = 10.0d;
        Line line21 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = (-1.0d);
        java.lang.Double double24 = point2.x;
        point2.x = 1.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point29.y = 100.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 1.0d;
        java.lang.Object obj40 = null;
        boolean boolean41 = point34.equals(obj40);
        point34.x = 1.0d;
        java.lang.Class<?> wildcardClass44 = point34.getClass();
        boolean boolean45 = point29.equals((java.lang.Object) wildcardClass44);
        java.lang.Double double46 = point29.x;
        boolean boolean47 = point2.equals((java.lang.Object) point29);
        java.lang.Double double48 = point29.x;
        Point point51 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean53 = point51.equals((java.lang.Object) (byte) 100);
        java.lang.Double double54 = point51.x;
        java.lang.Double double55 = point51.x;
        point51.y = 100.0d;
        point51.x = 0.0d;
        Line line60 = new Line(point29, point51);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean10 = point2.equals((java.lang.Object) 100.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        boolean boolean25 = point2.equals((java.lang.Object) point13);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        Point point32 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 0.0d;
        point32.x = 1.0d;
        point32.x = (-1.0d);
        boolean boolean40 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double41 = point2.y;
        point2.x = 0.0d;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point46.x = 100.0d;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 1.0d;
        java.lang.Double double57 = point51.y;
        java.lang.Double double58 = point51.y;
        point51.x = 10.0d;
        boolean boolean61 = point46.equals((java.lang.Object) point51);
        Point point64 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double65 = point64.y;
        point64.y = 10.0d;
        point64.y = 10.0d;
        boolean boolean70 = point51.equals((java.lang.Object) point64);
        point64.y = 10.0d;
        java.lang.Double double73 = point64.x;
        Line line74 = new Line(point2, point64);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = (-1.0d);
        java.lang.Double double24 = point2.x;
        java.lang.Double double25 = point2.x;
        java.lang.Double double26 = point2.x;
        java.lang.Double double27 = point2.y;
        java.lang.Double double28 = point2.y;
        java.lang.Double double29 = point2.x;
        java.lang.Double double30 = point2.y;
        Point point33 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.x;
        point33.x = 0.0d;
        java.lang.Double double38 = point33.y;
        Line line39 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point2.y;
        point2.y = 0.0d;
        point2.x = 0.0d;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        point17.y = 100.0d;
        point17.y = 0.0d;
        java.lang.Double double30 = point17.y;
        java.lang.Double double31 = point17.y;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        java.lang.Double double36 = point34.y;
        point34.x = 0.0d;
        java.lang.Class<?> wildcardClass39 = point34.getClass();
        boolean boolean40 = point17.equals((java.lang.Object) wildcardClass39);
        point17.x = (-1.0d);
        java.lang.Double double43 = point17.x;
        Line line44 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 100.0d;
        point2.y = 10.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point22.x = 100.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        java.lang.Double double31 = point27.y;
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = point27.equals(obj32);
        point27.x = 1.0d;
        java.lang.Double double36 = point27.y;
        point27.y = 100.0d;
        point27.x = 0.0d;
        boolean boolean41 = point22.equals((java.lang.Object) 0.0d);
        Line line42 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.x;
        point12.x = 1.0d;
        boolean boolean19 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double20 = point2.y;
        java.lang.Double double21 = point2.x;
        point2.y = 1.0d;
        point2.x = 10.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        Line line36 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        java.lang.Double double12 = point7.x;
        java.lang.Double double13 = point7.y;
        point7.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        point18.x = 1.0d;
        java.lang.Double double27 = point18.x;
        point18.y = 0.0d;
        java.lang.Class<?> wildcardClass30 = point18.getClass();
        boolean boolean31 = point7.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = point2.equals((java.lang.Object) point7);
        java.lang.Double double33 = point7.x;
        point7.y = 100.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        java.lang.Double double44 = point38.x;
        point38.y = 1.0d;
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double50 = point49.y;
        point49.y = 10.0d;
        point49.y = (-1.0d);
        java.lang.Class<?> wildcardClass55 = point49.getClass();
        boolean boolean56 = point38.equals((java.lang.Object) wildcardClass55);
        java.lang.Double double57 = point38.y;
        java.lang.Double double58 = point38.x;
        point38.y = (-1.0d);
        Point point63 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double64 = point63.x;
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double68 = point67.y;
        java.lang.Class<?> wildcardClass69 = point67.getClass();
        boolean boolean70 = point63.equals((java.lang.Object) wildcardClass69);
        java.lang.Double double71 = point63.y;
        boolean boolean72 = point38.equals((java.lang.Object) point63);
        Line line73 = new Line(point7, point63);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.x;
        java.lang.Double double9 = point7.y;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        boolean boolean12 = point2.equals((java.lang.Object) point7);
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        boolean boolean19 = point16.equals((java.lang.Object) 1L);
        point16.y = (-1.0d);
        java.lang.Double double22 = point16.y;
        boolean boolean23 = point2.equals((java.lang.Object) point16);
        point2.y = 1.0d;
        java.lang.Double double26 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double29 = point2.x;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        java.lang.Double double35 = point32.y;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass39 = point38.getClass();
        boolean boolean40 = point32.equals((java.lang.Object) wildcardClass39);
        java.lang.Double double41 = point32.x;
        point32.y = 10.0d;
        Line line44 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 0.0d;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.x;
        java.lang.Double double13 = point11.y;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.y;
        boolean boolean16 = point6.equals((java.lang.Object) point11);
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        point6.x = 100.0d;
        java.lang.Double double20 = point6.y;
        java.lang.Double double21 = point6.y;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.x;
        boolean boolean27 = point24.equals((java.lang.Object) 10.0f);
        point24.x = 100.0d;
        java.lang.Double double30 = point24.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point33.x = 100.0d;
        boolean boolean36 = point24.equals((java.lang.Object) 100.0d);
        java.lang.Double double37 = point24.y;
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point43.x = 1.0d;
        point43.y = 1.0d;
        boolean boolean48 = point40.equals((java.lang.Object) 1.0d);
        java.lang.Double double49 = point40.y;
        point40.x = 0.0d;
        boolean boolean52 = point24.equals((java.lang.Object) 0.0d);
        java.lang.Double double53 = point24.x;
        point24.y = (-1.0d);
        Point point58 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point58.y = 100.0d;
        java.lang.Object obj61 = null;
        boolean boolean62 = point58.equals(obj61);
        boolean boolean63 = point24.equals((java.lang.Object) boolean62);
        Line line64 = new Line(point6, point24);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point13.y = 10.0d;
        point13.y = 10.0d;
        point13.x = 1.0d;
        java.lang.Double double20 = point13.x;
        java.lang.Double double21 = point13.y;
        Line line22 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        point7.x = 10.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point7);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        point20.y = 10.0d;
        boolean boolean26 = point7.equals((java.lang.Object) point20);
        java.lang.Double double27 = point7.x;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.y;
        point30.y = (-1.0d);
        boolean boolean36 = point7.equals((java.lang.Object) (-1.0d));
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.y;
        point39.y = 0.0d;
        point39.y = 1.0d;
        point39.y = 1.0d;
        boolean boolean50 = point7.equals((java.lang.Object) point39);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        java.lang.Double double58 = point56.y;
        boolean boolean59 = point53.equals((java.lang.Object) point56);
        Point point62 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double63 = point62.x;
        java.lang.Double double64 = point62.y;
        point62.y = (-1.0d);
        point62.y = 0.0d;
        Point point71 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point71.y = 1.0d;
        point71.y = (-1.0d);
        java.lang.Double double76 = point71.y;
        java.lang.Double double77 = point71.y;
        point71.y = 1.0d;
        point71.y = 100.0d;
        point71.x = 1.0d;
        point71.y = (-1.0d);
        boolean boolean86 = point62.equals((java.lang.Object) point71);
        boolean boolean87 = point53.equals((java.lang.Object) point71);
        Line line88 = new Line(point39, point53);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = (-1.0d);
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.y;
        point8.y = 10.0d;
        point8.y = (-1.0d);
        java.lang.Double double14 = point8.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean20 = point17.equals((java.lang.Object) 1L);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        boolean boolean26 = point23.equals((java.lang.Object) 10.0f);
        point23.x = 100.0d;
        boolean boolean29 = point17.equals((java.lang.Object) 100.0d);
        boolean boolean30 = point8.equals((java.lang.Object) 100.0d);
        java.lang.Double double31 = point8.x;
        java.lang.Double double32 = point8.y;
        boolean boolean33 = point2.equals((java.lang.Object) double32);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        point36.x = 1.0d;
        java.lang.Object obj42 = null;
        boolean boolean43 = point36.equals(obj42);
        point36.x = 1.0d;
        point36.x = (-1.0d);
        java.lang.Double double48 = point36.y;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        point51.y = (-1.0d);
        java.lang.Double double56 = point51.y;
        point51.y = 100.0d;
        point51.x = 100.0d;
        java.lang.Double double61 = point51.y;
        java.lang.Double double62 = point51.x;
        java.lang.Double double63 = point51.y;
        boolean boolean64 = point36.equals((java.lang.Object) point51);
        Line line65 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 0.0d;
        point2.y = 100.0d;
        point2.y = 10.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        java.lang.Double double26 = point22.y;
        boolean boolean27 = point19.equals((java.lang.Object) double26);
        java.lang.Double double28 = point19.y;
        java.lang.Double double29 = point19.y;
        java.lang.Double double30 = point19.y;
        java.lang.Double double31 = point19.y;
        java.lang.Double double32 = point19.x;
        boolean boolean33 = point2.equals((java.lang.Object) point19);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double40 = point39.y;
        point39.y = 10.0d;
        boolean boolean43 = point36.equals((java.lang.Object) point39);
        boolean boolean45 = point39.equals((java.lang.Object) 10.0d);
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point48.y = 1.0d;
        point48.y = (-1.0d);
        java.lang.Double double53 = point48.x;
        java.lang.Double double54 = point48.x;
        point48.y = 1.0d;
        boolean boolean57 = point39.equals((java.lang.Object) point48);
        java.lang.Double double58 = point48.y;
        point48.y = 10.0d;
        boolean boolean61 = point19.equals((java.lang.Object) 10.0d);
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.y;
        point64.y = 1.0d;
        point64.x = 100.0d;
        point64.x = 10.0d;
        point64.x = 10.0d;
        java.lang.Double double74 = point64.x;
        point64.x = 10.0d;
        java.lang.Double double77 = point64.y;
        Line line78 = new Line(point19, point64);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        point2.x = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        point13.y = 0.0d;
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        point26.y = 100.0d;
        boolean boolean30 = point13.equals((java.lang.Object) point26);
        point13.x = 0.0d;
        point13.y = (-1.0d);
        java.lang.Double double35 = point13.y;
        Line line36 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.x;
        boolean boolean22 = point19.equals((java.lang.Object) 10.0f);
        point19.x = 100.0d;
        java.lang.Double double25 = point19.x;
        point19.y = 1.0d;
        point19.y = 1.0d;
        boolean boolean30 = point15.equals((java.lang.Object) point19);
        java.lang.Class<?> wildcardClass31 = point19.getClass();
        boolean boolean32 = point2.equals((java.lang.Object) point19);
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point35.x = 0.0d;
        point35.y = 1.0d;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        boolean boolean43 = point35.equals((java.lang.Object) (-1.0d));
        boolean boolean44 = point2.equals((java.lang.Object) (-1.0d));
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point47.x = 1.0d;
        point47.y = 1.0d;
        java.lang.Double double52 = point47.x;
        point47.x = (-1.0d);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        point57.y = 1.0d;
        point57.x = 100.0d;
        point57.x = 10.0d;
        java.lang.Double double65 = point57.y;
        boolean boolean66 = point47.equals((java.lang.Object) double65);
        point47.y = 0.0d;
        java.lang.Double double69 = point47.y;
        point47.y = 0.0d;
        point47.y = 1.0d;
        java.lang.Double double74 = point47.y;
        Line line75 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line75.equals(line75)", line75.equals(line75));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.x = 100.0d;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        point14.x = 0.0d;
        point14.x = 1.0d;
        point14.x = (-1.0d);
        Line line25 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        boolean boolean11 = point5.equals((java.lang.Object) 10.0d);
        java.lang.Double double12 = point5.x;
        point5.x = (-1.0d);
        point5.y = 10.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        java.lang.Double double23 = point19.y;
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = point19.equals(obj24);
        point19.x = 1.0d;
        java.lang.Double double28 = point19.y;
        point19.y = 100.0d;
        java.lang.Double double31 = point19.y;
        Line line32 = new Line(point5, point19);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        boolean boolean24 = point2.equals((java.lang.Object) 100.0d);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point27.x = 0.0d;
        java.lang.Double double30 = point27.x;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.x;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        point37.y = (-1.0d);
        boolean boolean42 = point33.equals((java.lang.Object) point37);
        boolean boolean43 = point27.equals((java.lang.Object) boolean42);
        Line line44 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point9.x = 0.0d;
        point9.y = 1.0d;
        java.lang.Double double14 = point9.x;
        point9.x = 0.0d;
        point9.x = 0.0d;
        boolean boolean19 = point2.equals((java.lang.Object) point9);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.x;
        boolean boolean25 = point22.equals((java.lang.Object) 10.0f);
        point22.x = 100.0d;
        java.lang.Double double28 = point22.x;
        point22.y = 1.0d;
        java.lang.Double double31 = point22.y;
        Line line32 = new Line(point9, point22);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        point15.y = 100.0d;
        boolean boolean19 = point2.equals((java.lang.Object) point15);
        point15.y = 1.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point24.x = 1.0d;
        point24.y = 1.0d;
        java.lang.Double double29 = point24.x;
        point24.x = (-1.0d);
        java.lang.Class<?> wildcardClass32 = point24.getClass();
        boolean boolean33 = point15.equals((java.lang.Object) wildcardClass32);
        java.lang.Double double34 = point15.x;
        java.lang.Double double35 = point15.x;
        java.lang.Object obj36 = null;
        boolean boolean37 = point15.equals(obj36);
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 0.0d;
        java.lang.Double double44 = point40.y;
        point40.y = (-1.0d);
        point40.y = 100.0d;
        java.lang.Double double49 = point40.y;
        java.lang.Double double50 = point40.x;
        point40.y = 1.0d;
        Line line53 = new Line(point15, point40);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        point2.y = 0.0d;
        point2.y = 10.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 100.0d;
        point24.x = 10.0d;
        java.lang.Double double32 = point24.y;
        java.lang.Double double33 = point24.x;
        boolean boolean34 = point21.equals((java.lang.Object) double33);
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point37.y = 0.0d;
        java.lang.Double double40 = point37.y;
        java.lang.Double double41 = point37.x;
        boolean boolean42 = point21.equals((java.lang.Object) point37);
        point37.y = 10.0d;
        Line line45 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point14.x = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double18 = point2.x;
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        java.lang.Double double26 = point22.y;
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = point22.equals(obj27);
        java.lang.Double double29 = point22.y;
        point22.x = 10.0d;
        java.lang.Double double32 = point22.y;
        point22.y = 0.0d;
        java.lang.Double double35 = point22.y;
        point22.x = 100.0d;
        boolean boolean38 = point2.equals((java.lang.Object) point22);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.x = 100.0d;
        point41.y = 10.0d;
        point41.y = 10.0d;
        point41.x = 100.0d;
        Point point55 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 0.0d;
        java.lang.Double double59 = point55.x;
        java.lang.Class<?> wildcardClass60 = point55.getClass();
        boolean boolean61 = point41.equals((java.lang.Object) point55);
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double68 = point67.y;
        point67.y = 10.0d;
        boolean boolean71 = point64.equals((java.lang.Object) point67);
        boolean boolean73 = point67.equals((java.lang.Object) 10.0d);
        Point point76 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point76.y = 1.0d;
        java.lang.Double double79 = point76.y;
        boolean boolean80 = point67.equals((java.lang.Object) point76);
        point76.y = 1.0d;
        point76.x = 100.0d;
        point76.x = 100.0d;
        boolean boolean87 = point41.equals((java.lang.Object) point76);
        point41.x = 10.0d;
        point41.x = (-1.0d);
        Line line92 = new Line(point22, point41);
        org.junit.Assert.assertTrue("Contract failed: line92.equals(line92)", line92.equals(line92));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        point2.y = 1.0d;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point7.y = 0.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.x;
        point7.x = 1.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj17 = null;
        boolean boolean18 = point16.equals(obj17);
        java.lang.Class<?> wildcardClass19 = point16.getClass();
        boolean boolean20 = point7.equals((java.lang.Object) wildcardClass19);
        point7.x = 0.0d;
        Line line23 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        boolean boolean10 = point2.equals((java.lang.Object) 10);
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        point13.y = 0.0d;
        point13.y = 1.0d;
        point13.y = 0.0d;
        point13.x = 100.0d;
        java.lang.Double double26 = point13.x;
        boolean boolean27 = point2.equals((java.lang.Object) double26);
        point2.y = 0.0d;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        java.lang.Double double37 = point32.y;
        java.lang.Double double38 = point32.y;
        java.lang.Double double39 = point32.y;
        point32.y = 0.0d;
        java.lang.Double double42 = point32.x;
        java.lang.Object obj43 = null;
        boolean boolean44 = point32.equals(obj43);
        Line line45 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        point12.y = 1.0d;
        boolean boolean21 = point2.equals((java.lang.Object) point12);
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean26 = point24.equals((java.lang.Object) (byte) 100);
        java.lang.Double double27 = point24.x;
        point24.x = (-1.0d);
        boolean boolean30 = point12.equals((java.lang.Object) point24);
        point24.x = 0.0d;
        point24.x = 10.0d;
        java.lang.Double double35 = point24.x;
        point24.y = 1.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point40.y = 100.0d;
        point40.y = 10.0d;
        java.lang.Double double45 = point40.y;
        Line line46 = new Line(point24, point40);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        java.lang.Double double7 = point2.x;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.y = 10.0d;
        boolean boolean23 = point14.equals((java.lang.Object) 0L);
        java.lang.Double double24 = point14.x;
        java.lang.Double double25 = point14.y;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        boolean boolean34 = point31.equals((java.lang.Object) 1L);
        java.lang.Double double35 = point31.y;
        boolean boolean36 = point28.equals((java.lang.Object) double35);
        java.lang.Double double37 = point28.y;
        java.lang.Double double38 = point28.x;
        boolean boolean39 = point14.equals((java.lang.Object) double38);
        Line line40 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = point8.getClass();
        boolean boolean10 = point2.equals((java.lang.Object) wildcardClass9);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        boolean boolean19 = point16.equals((java.lang.Object) 1L);
        java.lang.Double double20 = point16.y;
        boolean boolean21 = point13.equals((java.lang.Object) double20);
        java.lang.Double double22 = point13.y;
        java.lang.Double double23 = point13.x;
        boolean boolean24 = point2.equals((java.lang.Object) point13);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 1.0d;
        java.lang.Double double33 = point27.y;
        java.lang.Double double34 = point27.y;
        point27.y = (-1.0d);
        java.lang.Double double37 = point27.y;
        point27.x = (-1.0d);
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point42.y = 1.0d;
        point42.y = (-1.0d);
        java.lang.Double double47 = point42.y;
        java.lang.Double double48 = point42.y;
        point42.y = 1.0d;
        point42.y = 100.0d;
        point42.x = 0.0d;
        point42.y = (-1.0d);
        boolean boolean57 = point27.equals((java.lang.Object) point42);
        boolean boolean58 = point2.equals((java.lang.Object) point42);
        Point point61 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.x;
        java.lang.Double double63 = point61.y;
        point61.y = (-1.0d);
        point61.y = 0.0d;
        java.lang.Double double68 = point61.y;
        Line line69 = new Line(point42, point61);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point18.y = 10.0d;
        point18.y = 1.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point18);
        java.lang.Double double24 = point18.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        java.lang.Double double31 = point27.y;
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = point27.equals(obj32);
        point27.x = 1.0d;
        java.lang.Double double36 = point27.x;
        point27.y = 0.0d;
        point27.y = 1.0d;
        point27.x = (-1.0d);
        point27.x = 0.0d;
        point27.y = 0.0d;
        Line line47 = new Line(point18, point27);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        point12.y = 1.0d;
        boolean boolean21 = point2.equals((java.lang.Object) point12);
        point12.y = (-1.0d);
        java.lang.Double double24 = point12.x;
        java.lang.Double double25 = point12.y;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        boolean boolean34 = point31.equals((java.lang.Object) 1L);
        java.lang.Double double35 = point31.y;
        boolean boolean36 = point28.equals((java.lang.Object) double35);
        point28.x = 10.0d;
        java.lang.Double double39 = point28.x;
        point28.x = 10.0d;
        java.lang.Double double42 = point28.y;
        java.lang.Double double43 = point28.y;
        java.lang.Double double44 = point28.y;
        point28.x = 1.0d;
        java.lang.Class<?> wildcardClass47 = point28.getClass();
        boolean boolean48 = point12.equals((java.lang.Object) wildcardClass47);
        Point point49 = null;
        Line line50 = new Line(point12, point49);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        java.lang.Double double27 = point23.y;
        java.lang.Object obj28 = new java.lang.Object();
        boolean boolean29 = point23.equals(obj28);
        java.lang.Double double30 = point23.y;
        java.lang.Class<?> wildcardClass31 = point23.getClass();
        boolean boolean32 = point19.equals((java.lang.Object) point23);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point35.y = 100.0d;
        point35.y = 0.0d;
        boolean boolean40 = point19.equals((java.lang.Object) 0.0d);
        boolean boolean41 = point16.equals((java.lang.Object) point19);
        point16.x = 0.0d;
        Line line44 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point19.x = 1.0d;
        point19.y = 1.0d;
        point19.y = (-1.0d);
        point19.y = 10.0d;
        point19.y = 0.0d;
        java.lang.Double double30 = point19.x;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.x;
        java.lang.Double double35 = point33.x;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double39 = point38.y;
        boolean boolean40 = point33.equals((java.lang.Object) double39);
        boolean boolean41 = point19.equals((java.lang.Object) double39);
        boolean boolean42 = point2.equals((java.lang.Object) boolean41);
        java.lang.Double double43 = point2.y;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.y;
        java.lang.Double double48 = point46.y;
        java.lang.Double double49 = point46.x;
        point46.y = 1.0d;
        point46.x = 1.0d;
        point46.y = (-1.0d);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        point58.y = 1.0d;
        java.lang.Double double62 = point58.y;
        java.lang.Object obj63 = new java.lang.Object();
        boolean boolean64 = point58.equals(obj63);
        point58.x = 1.0d;
        java.lang.Class<?> wildcardClass67 = point58.getClass();
        boolean boolean68 = point46.equals((java.lang.Object) wildcardClass67);
        point46.y = 0.0d;
        point46.x = 10.0d;
        Line line73 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.y = 10.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        point15.x = 10.0d;
        java.lang.Double double23 = point15.y;
        point15.y = 0.0d;
        java.lang.Double double26 = point15.y;
        boolean boolean28 = point15.equals((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass29 = point15.getClass();
        boolean boolean30 = point2.equals((java.lang.Object) wildcardClass29);
        java.lang.Double double31 = point2.x;
        java.lang.Double double32 = point2.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Double double41 = point35.y;
        java.lang.Double double42 = point35.x;
        Point point45 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.x;
        java.lang.Double double47 = point45.x;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean52 = point45.equals((java.lang.Object) double51);
        boolean boolean53 = point35.equals((java.lang.Object) point45);
        java.lang.Double double54 = point45.y;
        Line line55 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        boolean boolean26 = point18.equals((java.lang.Object) double25);
        java.lang.Double double27 = point18.x;
        boolean boolean28 = point2.equals((java.lang.Object) point18);
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point31.x = 0.0d;
        point31.y = (-1.0d);
        point31.y = 0.0d;
        point31.y = 10.0d;
        point31.x = 1.0d;
        boolean boolean42 = point2.equals((java.lang.Object) point31);
        point2.y = 0.0d;
        point2.x = 100.0d;
        java.lang.Double double47 = point2.y;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        boolean boolean56 = point53.equals((java.lang.Object) 1L);
        java.lang.Double double57 = point53.y;
        boolean boolean58 = point50.equals((java.lang.Object) double57);
        java.lang.Double double59 = point50.y;
        java.lang.Double double60 = point50.x;
        point50.y = 100.0d;
        Point point65 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double66 = point65.x;
        java.lang.Double double67 = point65.y;
        point65.y = 1.0d;
        boolean boolean70 = point50.equals((java.lang.Object) point65);
        point65.y = (-1.0d);
        Line line73 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.x = 10.0d;
        java.lang.Double double17 = point9.y;
        point9.y = 0.0d;
        java.lang.Double double20 = point9.x;
        boolean boolean21 = point2.equals((java.lang.Object) point9);
        point9.y = 10.0d;
        java.lang.Double double24 = point9.y;
        point9.y = 100.0d;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        java.lang.Double double31 = point29.y;
        Point point34 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.x = 100.0d;
        boolean boolean38 = point29.equals((java.lang.Object) point34);
        point34.y = 0.0d;
        Line line41 = new Line(point9, point34);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        boolean boolean11 = point8.equals((java.lang.Object) 1L);
        java.lang.Double double12 = point8.y;
        boolean boolean13 = point5.equals((java.lang.Object) double12);
        point5.x = 10.0d;
        java.lang.Double double16 = point5.x;
        point5.x = 10.0d;
        boolean boolean19 = point2.equals((java.lang.Object) point5);
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point22.y = 1.0d;
        java.lang.Double double25 = point22.y;
        Line line26 = new Line(point5, point22);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.x = 0.0d;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 0.0d;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        java.lang.Double double20 = point18.y;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point13.equals((java.lang.Object) point18);
        java.lang.Double double24 = point13.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        point27.y = (-1.0d);
        java.lang.Double double33 = point27.y;
        boolean boolean34 = point13.equals((java.lang.Object) point27);
        point13.y = 1.0d;
        java.lang.Double double37 = point13.x;
        java.lang.Double double38 = point13.x;
        java.lang.Double double39 = point13.y;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        java.lang.Double double46 = point42.y;
        java.lang.Object obj47 = new java.lang.Object();
        boolean boolean48 = point42.equals(obj47);
        java.lang.Double double49 = point42.y;
        point42.x = 1.0d;
        java.lang.Double double52 = point42.y;
        java.lang.Double double53 = point42.y;
        boolean boolean54 = point13.equals((java.lang.Object) double53);
        Line line55 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean10 = point2.equals((java.lang.Object) 100.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        boolean boolean25 = point2.equals((java.lang.Object) point13);
        point2.y = 1.0d;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 100.0d;
        point30.y = 10.0d;
        boolean boolean39 = point30.equals((java.lang.Object) 0L);
        java.lang.Double double40 = point30.x;
        point30.x = 1.0d;
        java.lang.Double double43 = point30.y;
        Line line44 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        boolean boolean24 = point2.equals((java.lang.Object) 100.0d);
        point2.x = 10.0d;
        java.lang.Double double27 = point2.x;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        java.lang.Double double33 = point30.y;
        java.lang.Double double34 = point30.y;
        point30.y = 0.0d;
        java.lang.Double double37 = point30.y;
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean42 = point40.equals((java.lang.Object) (byte) 100);
        java.lang.Double double43 = point40.x;
        point40.x = (-1.0d);
        point40.x = 10.0d;
        point40.y = (-1.0d);
        point40.x = 10.0d;
        boolean boolean52 = point30.equals((java.lang.Object) point40);
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point55.x = 0.0d;
        point55.y = 1.0d;
        java.lang.Double double60 = point55.x;
        java.lang.Double double61 = point55.x;
        boolean boolean62 = point30.equals((java.lang.Object) point55);
        Point point65 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point68 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point68.y = 1.0d;
        point68.y = (-1.0d);
        point68.y = 100.0d;
        boolean boolean75 = point65.equals((java.lang.Object) 100.0d);
        boolean boolean76 = point30.equals((java.lang.Object) boolean75);
        point30.y = 0.0d;
        Line line79 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        java.lang.Double double12 = point9.y;
        java.lang.Double double13 = point9.y;
        point9.y = 10.0d;
        java.lang.Double double16 = point9.y;
        point9.x = 0.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.x;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        boolean boolean30 = point21.equals((java.lang.Object) point25);
        boolean boolean31 = point9.equals((java.lang.Object) point25);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        boolean boolean49 = point41.equals((java.lang.Object) 1.0d);
        java.lang.Double double50 = point41.y;
        java.lang.Double double51 = point41.y;
        java.lang.Double double52 = point41.x;
        java.lang.Double double53 = point41.y;
        boolean boolean54 = point34.equals((java.lang.Object) double53);
        boolean boolean55 = point9.equals((java.lang.Object) double53);
        java.lang.Double double56 = point9.x;
        point9.y = 0.0d;
        boolean boolean59 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double60 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double63 = point2.y;
        Point point64 = null;
        Line line65 = new Line(point2, point64);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        point2.x = 1.0d;
        Point point18 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double19 = point18.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Class<?> wildcardClass24 = point22.getClass();
        boolean boolean25 = point18.equals((java.lang.Object) wildcardClass24);
        point18.x = 0.0d;
        java.lang.Double double28 = point18.x;
        boolean boolean29 = point2.equals((java.lang.Object) point18);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.y = 0.0d;
        java.lang.Double double38 = point32.y;
        Line line39 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        java.lang.Double double10 = point6.y;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = point6.equals(obj11);
        java.lang.Double double13 = point6.y;
        java.lang.Class<?> wildcardClass14 = point6.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) point6);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point18.y = 100.0d;
        point18.y = 0.0d;
        boolean boolean23 = point2.equals((java.lang.Object) 0.0d);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point26.x = 0.0d;
        point26.x = 1.0d;
        point26.x = (-1.0d);
        boolean boolean33 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double34 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double37 = point2.x;
        java.lang.Double double38 = point2.x;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.x = 100.0d;
        point41.x = 10.0d;
        java.lang.Double double49 = point41.y;
        point41.y = 0.0d;
        java.lang.Double double52 = point41.x;
        point41.y = 100.0d;
        Line line55 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        boolean boolean11 = point5.equals((java.lang.Object) 10.0d);
        java.lang.Double double12 = point5.x;
        java.lang.Double double13 = point5.x;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        point16.y = (-1.0d);
        java.lang.Double double21 = point16.y;
        java.lang.Double double22 = point16.y;
        point16.y = 1.0d;
        point16.y = 100.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point29.equals((java.lang.Object) point32);
        boolean boolean38 = point32.equals((java.lang.Object) 10.0d);
        boolean boolean39 = point16.equals((java.lang.Object) 10.0d);
        java.lang.Double double40 = point16.x;
        java.lang.Double double41 = point16.y;
        boolean boolean42 = point5.equals((java.lang.Object) double41);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point45.x = 1.0d;
        point45.y = 1.0d;
        java.lang.Double double50 = point45.x;
        point45.x = (-1.0d);
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 1.0d;
        point55.x = 100.0d;
        point55.x = 10.0d;
        java.lang.Double double63 = point55.y;
        boolean boolean64 = point45.equals((java.lang.Object) double63);
        point45.y = 0.0d;
        point45.y = 10.0d;
        boolean boolean69 = point5.equals((java.lang.Object) point45);
        Point point72 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point72.x = 0.0d;
        point72.y = 1.0d;
        point72.y = 1.0d;
        Point point81 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point81.y = 1.0d;
        point81.y = (-1.0d);
        point81.x = 0.0d;
        java.lang.Double double88 = point81.x;
        boolean boolean89 = point72.equals((java.lang.Object) point81);
        java.lang.Double double90 = point72.x;
        boolean boolean91 = point45.equals((java.lang.Object) point72);
        Point point92 = null;
        Line line93 = new Line(point72, point92);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        java.lang.Double double11 = point2.x;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        point14.y = 0.0d;
        java.lang.Double double19 = point14.x;
        java.lang.Double double20 = point14.y;
        point14.x = 10.0d;
        point14.x = 0.0d;
        Line line25 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        point13.y = 10.0d;
        point13.y = (-1.0d);
        java.lang.Class<?> wildcardClass19 = point13.getClass();
        boolean boolean20 = point2.equals((java.lang.Object) wildcardClass19);
        java.lang.Double double21 = point2.y;
        point2.y = 100.0d;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point26.y = 0.0d;
        java.lang.Double double29 = point26.y;
        java.lang.Double double30 = point26.x;
        point26.x = 1.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        java.lang.Double double39 = point35.y;
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = point35.equals(obj40);
        java.lang.Double double42 = point35.y;
        point35.x = 1.0d;
        boolean boolean45 = point26.equals((java.lang.Object) point35);
        Point point48 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean49 = point35.equals((java.lang.Object) point48);
        java.lang.Double double50 = point48.x;
        boolean boolean51 = point2.equals((java.lang.Object) double50);
        java.lang.Double double52 = point2.x;
        point2.y = 10.0d;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point57.y = 1.0d;
        java.lang.Class<?> wildcardClass60 = point57.getClass();
        boolean boolean61 = point2.equals((java.lang.Object) wildcardClass60);
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point68 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        boolean boolean74 = point71.equals((java.lang.Object) 1L);
        java.lang.Double double75 = point71.y;
        boolean boolean76 = point68.equals((java.lang.Object) double75);
        java.lang.Double double77 = point68.y;
        point68.x = 1.0d;
        boolean boolean81 = point68.equals((java.lang.Object) 10);
        java.lang.Double double82 = point68.x;
        point68.y = 1.0d;
        java.lang.Double double85 = point68.y;
        Line line86 = new Line(point2, point68);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point16.y = (-1.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        point21.x = 10.0d;
        java.lang.Double double29 = point21.y;
        point21.y = 0.0d;
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.y = 100.0d;
        boolean boolean38 = point21.equals((java.lang.Object) point34);
        point34.y = 1.0d;
        java.lang.Double double41 = point34.x;
        boolean boolean42 = point16.equals((java.lang.Object) double41);
        point16.x = 0.0d;
        boolean boolean45 = point2.equals((java.lang.Object) point16);
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.x;
        point48.y = 0.0d;
        java.lang.Double double53 = point48.x;
        java.lang.Double double54 = point48.y;
        point48.y = 0.0d;
        point48.y = 0.0d;
        Line line59 = new Line(point16, point48);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean16 = point2.equals((java.lang.Object) point14);
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        java.lang.Double double23 = point20.y;
        java.lang.Double double24 = point20.y;
        point20.y = 0.0d;
        point20.y = 1.0d;
        point20.y = 1.0d;
        Line line31 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        java.lang.Double double22 = point2.y;
        java.lang.Double double23 = point2.y;
        java.lang.Double double24 = point2.x;
        Point point27 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.x;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        java.lang.Double double35 = point31.y;
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = point31.equals(obj36);
        java.lang.Double double38 = point31.y;
        java.lang.Class<?> wildcardClass39 = point31.getClass();
        boolean boolean40 = point27.equals((java.lang.Object) point31);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point43.y = 100.0d;
        point43.y = 0.0d;
        boolean boolean48 = point27.equals((java.lang.Object) 0.0d);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point51.x = 0.0d;
        point51.x = 1.0d;
        point51.x = (-1.0d);
        boolean boolean58 = point27.equals((java.lang.Object) (-1.0d));
        java.lang.Double double59 = point27.y;
        Line line60 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        java.lang.Double double14 = point8.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point17.x = 100.0d;
        boolean boolean20 = point8.equals((java.lang.Object) 100.0d);
        point8.x = 10.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point8);
        point2.x = 10.0d;
        java.lang.Double double26 = point2.y;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point29.y = 100.0d;
        point29.y = 0.0d;
        point29.x = 0.0d;
        java.lang.Double double36 = point29.x;
        java.lang.Double double37 = point29.y;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point40.y = 0.0d;
        java.lang.Double double43 = point40.y;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        java.lang.Double double50 = point46.y;
        java.lang.Object obj51 = new java.lang.Object();
        boolean boolean52 = point46.equals(obj51);
        point46.x = 1.0d;
        java.lang.Double double55 = point46.x;
        boolean boolean56 = point40.equals((java.lang.Object) double55);
        boolean boolean57 = point29.equals((java.lang.Object) point40);
        Line line58 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        point2.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point18.x = 1.0d;
        point18.y = 1.0d;
        java.lang.Double double23 = point18.x;
        point18.x = (-1.0d);
        point18.y = 100.0d;
        Line line28 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        boolean boolean23 = point14.equals((java.lang.Object) point18);
        boolean boolean24 = point2.equals((java.lang.Object) point18);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean34 = point32.equals((java.lang.Object) true);
        boolean boolean35 = point27.equals((java.lang.Object) true);
        java.lang.Double double36 = point27.y;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        point39.y = 0.0d;
        boolean boolean45 = point27.equals((java.lang.Object) point39);
        java.lang.Double double46 = point27.y;
        point27.x = 1.0d;
        Point point51 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.x;
        java.lang.Double double53 = point51.y;
        point51.y = (-1.0d);
        point51.y = 0.0d;
        point51.x = 100.0d;
        boolean boolean60 = point27.equals((java.lang.Object) point51);
        java.lang.Object obj61 = null;
        boolean boolean62 = point51.equals(obj61);
        point51.x = 0.0d;
        Line line65 = new Line(point2, point51);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.x = 100.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.y = 10.0d;
        boolean boolean21 = point12.equals((java.lang.Object) 0L);
        java.lang.Double double22 = point12.y;
        boolean boolean23 = point2.equals((java.lang.Object) double22);
        java.lang.Double double24 = point2.y;
        point2.y = (-1.0d);
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        java.lang.Double double34 = point29.y;
        java.lang.Double double35 = point29.y;
        point29.y = 1.0d;
        point29.y = 100.0d;
        point29.y = 1.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        boolean boolean47 = point44.equals((java.lang.Object) 10.0f);
        point44.x = 100.0d;
        java.lang.Double double50 = point44.x;
        point44.x = 0.0d;
        boolean boolean53 = point29.equals((java.lang.Object) point44);
        point44.y = 10.0d;
        Line line56 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.y = 0.0d;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.x = 10.0d;
        java.lang.Double double22 = point14.y;
        java.lang.Double double23 = point14.x;
        boolean boolean24 = point11.equals((java.lang.Object) double23);
        java.lang.Double double25 = point11.y;
        java.lang.Double double26 = point11.x;
        point11.x = 10.0d;
        Line line29 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        point2.y = 1.0d;
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point22.y = 0.0d;
        java.lang.Double double25 = point22.y;
        java.lang.Double double26 = point22.x;
        point22.x = 1.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj32 = null;
        boolean boolean33 = point31.equals(obj32);
        java.lang.Class<?> wildcardClass34 = point31.getClass();
        boolean boolean35 = point22.equals((java.lang.Object) wildcardClass34);
        java.lang.Double double36 = point22.x;
        boolean boolean37 = point2.equals((java.lang.Object) point22);
        java.lang.Double double38 = point2.x;
        java.lang.Double double39 = point2.y;
        Point point42 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass43 = point42.getClass();
        boolean boolean44 = point2.equals((java.lang.Object) wildcardClass43);
        point2.x = 10.0d;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        java.lang.Double double54 = point49.y;
        java.lang.Double double55 = point49.y;
        java.lang.Double double56 = point49.y;
        point49.y = 100.0d;
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point61.y = 1.0d;
        point61.y = (-1.0d);
        point61.y = 100.0d;
        point61.x = (-1.0d);
        java.lang.Double double70 = point61.x;
        boolean boolean71 = point49.equals((java.lang.Object) double70);
        point49.x = 100.0d;
        Line line74 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.x;
        boolean boolean9 = point6.equals((java.lang.Object) 10.0f);
        point6.x = 100.0d;
        java.lang.Double double12 = point6.x;
        point6.y = 1.0d;
        point6.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        point6.x = (-1.0d);
        point6.y = (-1.0d);
        Point point24 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.x;
        java.lang.Double double35 = point33.y;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        boolean boolean38 = point28.equals((java.lang.Object) point33);
        boolean boolean39 = point24.equals((java.lang.Object) point28);
        point24.y = 1.0d;
        boolean boolean42 = point6.equals((java.lang.Object) point24);
        java.lang.Double double43 = point24.y;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        point46.y = (-1.0d);
        point46.y = 100.0d;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        boolean boolean58 = point55.equals((java.lang.Object) 1L);
        point55.y = (-1.0d);
        java.lang.Double double61 = point55.y;
        java.lang.Double double62 = point55.y;
        java.lang.Double double63 = point55.x;
        boolean boolean64 = point46.equals((java.lang.Object) point55);
        point55.y = 0.0d;
        java.lang.Double double67 = point55.y;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        point70.y = 1.0d;
        java.lang.Double double74 = point70.y;
        java.lang.Object obj75 = new java.lang.Object();
        boolean boolean76 = point70.equals(obj75);
        point70.x = 1.0d;
        point70.y = 0.0d;
        boolean boolean81 = point55.equals((java.lang.Object) 0.0d);
        Line line82 = new Line(point24, point55);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        java.lang.Double double17 = point13.y;
        point13.y = 100.0d;
        point13.y = (-1.0d);
        boolean boolean22 = point2.equals((java.lang.Object) point13);
        point13.x = (-1.0d);
        point13.y = 100.0d;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        java.lang.Double double31 = point29.y;
        java.lang.Double double32 = point29.x;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean38 = point35.equals((java.lang.Object) 0.0d);
        boolean boolean39 = point29.equals((java.lang.Object) point35);
        point29.x = 0.0d;
        java.lang.Double double42 = point29.y;
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point45.y = 1.0d;
        point45.y = (-1.0d);
        java.lang.Double double50 = point45.y;
        java.lang.Double double51 = point45.y;
        point45.y = 0.0d;
        java.lang.Double double54 = point45.y;
        boolean boolean55 = point29.equals((java.lang.Object) point45);
        point45.x = 0.0d;
        Line line58 = new Line(point13, point45);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 10.0d;
        java.lang.Double double12 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 100.0d;
        point18.y = (-1.0d);
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        point28.y = (-1.0d);
        java.lang.Double double33 = point28.x;
        java.lang.Double double34 = point28.x;
        point28.y = 1.0d;
        boolean boolean37 = point18.equals((java.lang.Object) point28);
        point28.y = (-1.0d);
        point28.x = (-1.0d);
        java.lang.Double double42 = point28.x;
        java.lang.Double double43 = point28.x;
        java.lang.Double double44 = point28.y;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        java.lang.Double double51 = point47.y;
        java.lang.Object obj52 = new java.lang.Object();
        boolean boolean53 = point47.equals(obj52);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.x;
        boolean boolean59 = point56.equals((java.lang.Object) 10.0f);
        point56.x = 0.0d;
        java.lang.Class<?> wildcardClass62 = point56.getClass();
        boolean boolean63 = point47.equals((java.lang.Object) wildcardClass62);
        boolean boolean64 = point28.equals((java.lang.Object) boolean63);
        Line line65 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        java.lang.Double double17 = point2.x;
        point2.y = (-1.0d);
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        java.lang.Double double25 = point22.x;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double29 = point28.y;
        boolean boolean31 = point28.equals((java.lang.Object) 0.0d);
        boolean boolean32 = point22.equals((java.lang.Object) point28);
        java.lang.Double double33 = point28.y;
        java.lang.Double double34 = point28.x;
        Line line35 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        point2.x = 1.0d;
        point2.x = (-1.0d);
        point2.x = 10.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        java.lang.Double double20 = point14.y;
        point14.y = 100.0d;
        point14.x = (-1.0d);
        point14.x = 100.0d;
        java.lang.Double double27 = point14.y;
        point14.y = 100.0d;
        point14.y = 10.0d;
        Line line32 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.x = 10.0d;
        java.lang.Double double17 = point9.y;
        point9.y = 0.0d;
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        point22.y = 100.0d;
        boolean boolean26 = point9.equals((java.lang.Object) point22);
        point22.y = 1.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point31.x = 1.0d;
        point31.y = 1.0d;
        java.lang.Double double36 = point31.x;
        point31.x = (-1.0d);
        java.lang.Class<?> wildcardClass39 = point31.getClass();
        boolean boolean40 = point22.equals((java.lang.Object) wildcardClass39);
        point22.x = 0.0d;
        boolean boolean43 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double44 = point2.x;
        java.lang.Double double45 = point2.y;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double49 = point48.y;
        boolean boolean51 = point48.equals((java.lang.Object) 0.0d);
        java.lang.Double double52 = point48.x;
        boolean boolean53 = point2.equals((java.lang.Object) point48);
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point56.y = 1.0d;
        point56.y = (-1.0d);
        java.lang.Double double61 = point56.x;
        java.lang.Double double62 = point56.x;
        point56.y = 10.0d;
        point56.x = 0.0d;
        Line line67 = new Line(point48, point56);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 10.0d;
        boolean boolean11 = point2.equals((java.lang.Object) point7);
        point7.x = 1.0d;
        java.lang.Double double14 = point7.y;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double18 = point17.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.y;
        java.lang.Double double24 = point21.x;
        boolean boolean25 = point17.equals((java.lang.Object) point21);
        point17.x = (-1.0d);
        java.lang.Double double28 = point17.x;
        boolean boolean29 = point7.equals((java.lang.Object) double28);
        point7.y = 10.0d;
        point7.y = 100.0d;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        boolean boolean42 = point39.equals((java.lang.Object) 1L);
        java.lang.Double double43 = point39.y;
        boolean boolean44 = point36.equals((java.lang.Object) double43);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point47.y = 1.0d;
        point47.y = (-1.0d);
        point47.y = 100.0d;
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass57 = point56.getClass();
        boolean boolean58 = point47.equals((java.lang.Object) point56);
        boolean boolean59 = point36.equals((java.lang.Object) point56);
        java.lang.Double double60 = point36.y;
        Line line61 = new Line(point7, point36);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        point12.y = 1.0d;
        boolean boolean21 = point2.equals((java.lang.Object) point12);
        point12.y = (-1.0d);
        java.lang.Double double24 = point12.x;
        point12.y = 0.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        point29.y = (-1.0d);
        java.lang.Double double35 = point29.y;
        java.lang.Double double36 = point29.y;
        java.lang.Double double37 = point29.x;
        point29.x = 10.0d;
        point29.y = 1.0d;
        point29.y = 1.0d;
        point29.y = 0.0d;
        Line line46 = new Line(point12, point29);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 0.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        java.lang.Double double14 = point10.y;
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = point10.equals(obj15);
        java.lang.Double double17 = point10.x;
        java.lang.Double double18 = point10.y;
        point10.x = (-1.0d);
        boolean boolean21 = point2.equals((java.lang.Object) (-1.0d));
        point2.y = 10.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 1.0d;
        java.lang.Object obj32 = null;
        boolean boolean33 = point26.equals(obj32);
        point26.x = 100.0d;
        Line line36 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = point2.equals(obj3);
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        java.lang.Double double12 = point8.y;
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = point8.equals(obj13);
        point8.x = 1.0d;
        java.lang.Double double17 = point8.y;
        java.lang.Double double18 = point8.x;
        point8.y = 1.0d;
        java.lang.Double double21 = point8.y;
        point8.x = 0.0d;
        java.lang.Double double24 = point8.y;
        Line line25 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = point8.getClass();
        boolean boolean10 = point2.equals((java.lang.Object) wildcardClass9);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        boolean boolean19 = point16.equals((java.lang.Object) 1L);
        java.lang.Double double20 = point16.y;
        boolean boolean21 = point13.equals((java.lang.Object) double20);
        java.lang.Double double22 = point13.y;
        java.lang.Double double23 = point13.x;
        boolean boolean24 = point2.equals((java.lang.Object) point13);
        point2.x = 100.0d;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        point32.y = 100.0d;
        boolean boolean39 = point29.equals((java.lang.Object) 100.0d);
        java.lang.Double double40 = point29.y;
        point29.x = (-1.0d);
        point29.y = 0.0d;
        point29.x = 100.0d;
        Line line47 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Object obj6 = null;
        boolean boolean7 = point2.equals(obj6);
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.x;
        point11.y = 0.0d;
        point11.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        boolean boolean26 = point23.equals((java.lang.Object) 1L);
        java.lang.Double double27 = point23.y;
        boolean boolean28 = point20.equals((java.lang.Object) double27);
        point20.x = 10.0d;
        java.lang.Double double31 = point20.x;
        boolean boolean32 = point11.equals((java.lang.Object) point20);
        java.lang.Double double33 = point11.y;
        point11.x = 10.0d;
        Line line36 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double15 = point2.x;
        point2.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.x;
        point20.y = 1.0d;
        java.lang.Double double28 = point20.x;
        point20.y = 0.0d;
        Line line31 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 10.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point13.x = 1.0d;
        point13.y = 1.0d;
        java.lang.Double double18 = point13.x;
        point13.x = (-1.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 100.0d;
        point23.x = 10.0d;
        java.lang.Double double31 = point23.y;
        boolean boolean32 = point13.equals((java.lang.Object) double31);
        point13.y = 0.0d;
        java.lang.Double double35 = point13.y;
        Line line36 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = 0.0d;
        java.lang.Double double11 = point2.y;
        point2.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.y;
        java.lang.Double double21 = point16.x;
        java.lang.Double double22 = point16.y;
        point16.x = 1.0d;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.y;
        point27.y = 10.0d;
        java.lang.Double double34 = point27.y;
        point27.x = 10.0d;
        java.lang.Double double37 = point27.x;
        boolean boolean38 = point16.equals((java.lang.Object) double37);
        boolean boolean39 = point2.equals((java.lang.Object) boolean38);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.x = 100.0d;
        java.lang.Double double48 = point42.y;
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point51.y = 0.0d;
        java.lang.Double double54 = point51.y;
        java.lang.Double double55 = point51.x;
        boolean boolean56 = point42.equals((java.lang.Object) double55);
        boolean boolean58 = point42.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass59 = point42.getClass();
        boolean boolean60 = point2.equals((java.lang.Object) point42);
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point66.x = 1.0d;
        point66.y = 1.0d;
        boolean boolean71 = point63.equals((java.lang.Object) 1.0d);
        java.lang.Double double72 = point63.y;
        java.lang.Double double73 = point63.x;
        java.lang.Double double74 = point63.x;
        Point point77 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double78 = point77.x;
        java.lang.Double double79 = point77.y;
        point77.y = (-1.0d);
        point77.y = 0.0d;
        point77.x = (-1.0d);
        boolean boolean86 = point63.equals((java.lang.Object) point77);
        java.lang.Double double87 = point63.x;
        Line line88 = new Line(point2, point63);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.x;
        boolean boolean9 = point6.equals((java.lang.Object) 10.0f);
        point6.x = 100.0d;
        java.lang.Double double12 = point6.x;
        point6.y = 1.0d;
        point6.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass21 = point20.getClass();
        boolean boolean22 = point6.equals((java.lang.Object) point20);
        point6.y = 100.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.y;
        point27.x = 100.0d;
        java.lang.Double double32 = point27.x;
        Line line33 = new Line(point6, point27);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        point2.y = 1.0d;
        java.lang.Double double19 = point2.y;
        point2.x = 0.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point2.equals(obj22);
        java.lang.Double double24 = point2.y;
        java.lang.Double double25 = point2.y;
        java.lang.Double double26 = point2.y;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        java.lang.Double double34 = point29.y;
        java.lang.Double double35 = point29.y;
        point29.y = 1.0d;
        point29.y = 1.0d;
        java.lang.Double double40 = point29.y;
        point29.y = (-1.0d);
        point29.y = 1.0d;
        point29.y = 10.0d;
        boolean boolean47 = point2.equals((java.lang.Object) point29);
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.y;
        java.lang.Double double52 = point50.x;
        point50.y = 0.0d;
        point50.y = (-1.0d);
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        boolean boolean65 = point62.equals((java.lang.Object) 1L);
        java.lang.Double double66 = point62.y;
        boolean boolean67 = point59.equals((java.lang.Object) double66);
        point59.x = 10.0d;
        java.lang.Double double70 = point59.x;
        boolean boolean71 = point50.equals((java.lang.Object) point59);
        java.lang.Double double72 = point50.y;
        point50.y = 100.0d;
        point50.x = 10.0d;
        Line line77 = new Line(point29, point50);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.x = 1.0d;
        point15.y = 1.0d;
        java.lang.Double double20 = point15.x;
        point15.x = (-1.0d);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 100.0d;
        point25.x = 10.0d;
        java.lang.Double double33 = point25.y;
        boolean boolean34 = point15.equals((java.lang.Object) double33);
        point15.y = (-1.0d);
        java.lang.Double double37 = point15.x;
        point15.x = 1.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point42.y = 100.0d;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        point47.x = 1.0d;
        java.lang.Object obj53 = null;
        boolean boolean54 = point47.equals(obj53);
        point47.x = 1.0d;
        java.lang.Class<?> wildcardClass57 = point47.getClass();
        boolean boolean58 = point42.equals((java.lang.Object) wildcardClass57);
        java.lang.Double double59 = point42.x;
        boolean boolean60 = point15.equals((java.lang.Object) point42);
        Point point63 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        boolean boolean69 = point66.equals((java.lang.Object) 1L);
        java.lang.Double double70 = point66.y;
        boolean boolean71 = point63.equals((java.lang.Object) double70);
        java.lang.Double double72 = point63.y;
        java.lang.Double double73 = point63.x;
        point63.x = 0.0d;
        boolean boolean76 = point15.equals((java.lang.Object) 0.0d);
        Line line77 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = point8.getClass();
        boolean boolean10 = point2.equals((java.lang.Object) wildcardClass9);
        java.lang.Double double11 = point2.x;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point16.y = 1.0d;
        point16.y = 100.0d;
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        point23.y = 10.0d;
        point23.y = (-1.0d);
        java.lang.Double double29 = point23.y;
        java.lang.Double double30 = point23.y;
        java.lang.Double double31 = point23.x;
        java.lang.Double double32 = point23.x;
        boolean boolean33 = point16.equals((java.lang.Object) point23);
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        point36.y = 0.0d;
        point36.x = 10.0d;
        java.lang.Object obj45 = null;
        boolean boolean46 = point36.equals(obj45);
        boolean boolean47 = point23.equals((java.lang.Object) boolean46);
        boolean boolean48 = point2.equals((java.lang.Object) point23);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 1.0d;
        java.lang.Double double57 = point51.y;
        java.lang.Double double58 = point51.x;
        Point point61 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.x;
        java.lang.Double double63 = point61.x;
        Point point66 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double67 = point66.y;
        boolean boolean68 = point61.equals((java.lang.Object) double67);
        boolean boolean69 = point51.equals((java.lang.Object) point61);
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double73 = point72.y;
        boolean boolean75 = point72.equals((java.lang.Object) 1L);
        Point point78 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double79 = point78.x;
        boolean boolean81 = point78.equals((java.lang.Object) 10.0f);
        point78.x = 100.0d;
        java.lang.Double double84 = point78.x;
        Point point87 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point87.x = 100.0d;
        boolean boolean90 = point78.equals((java.lang.Object) 100.0d);
        point78.x = 10.0d;
        boolean boolean93 = point72.equals((java.lang.Object) point78);
        point72.x = 10.0d;
        java.lang.Double double96 = point72.y;
        boolean boolean97 = point61.equals((java.lang.Object) point72);
        Line line98 = new Line(point23, point61);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double16 = point2.x;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.y;
        point27.y = 10.0d;
        java.lang.Double double34 = point27.y;
        point27.x = 0.0d;
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double40 = point39.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        point43.y = (-1.0d);
        boolean boolean48 = point39.equals((java.lang.Object) point43);
        boolean boolean49 = point27.equals((java.lang.Object) point43);
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        boolean boolean55 = point52.equals((java.lang.Object) 1L);
        point52.y = (-1.0d);
        java.lang.Double double58 = point52.y;
        java.lang.Double double59 = point52.y;
        java.lang.Double double60 = point52.x;
        point52.x = 10.0d;
        java.lang.Class<?> wildcardClass63 = point52.getClass();
        boolean boolean64 = point27.equals((java.lang.Object) point52);
        java.lang.Double double65 = point27.y;
        Line line66 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double6 = point2.x;
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.y;
        point11.y = 10.0d;
        java.lang.Double double18 = point11.y;
        point11.x = 0.0d;
        java.lang.Double double21 = point11.x;
        Line line22 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        java.lang.Double double8 = point6.y;
        java.lang.Double double9 = point6.x;
        boolean boolean10 = point2.equals((java.lang.Object) point6);
        point2.x = (-1.0d);
        java.lang.Double double13 = point2.x;
        point2.y = 10.0d;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 0.0d;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.y;
        Line line23 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        point19.x = 10.0d;
        point19.x = 10.0d;
        point19.x = 10.0d;
        boolean boolean31 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double32 = point2.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Object obj41 = null;
        boolean boolean42 = point35.equals(obj41);
        point35.x = 1.0d;
        boolean boolean46 = point35.equals((java.lang.Object) false);
        java.lang.Double double47 = point35.x;
        point35.y = (-1.0d);
        Line line50 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        point7.x = 10.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point7);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        point20.y = 10.0d;
        boolean boolean26 = point7.equals((java.lang.Object) point20);
        point20.y = 10.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.y = 10.0d;
        boolean boolean38 = point31.equals((java.lang.Object) point34);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.x;
        boolean boolean50 = point47.equals((java.lang.Object) 10.0f);
        point47.x = 100.0d;
        boolean boolean53 = point41.equals((java.lang.Object) 100.0d);
        boolean boolean54 = point34.equals((java.lang.Object) boolean53);
        java.lang.Double double55 = point34.x;
        point34.y = (-1.0d);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        java.lang.Double double64 = point60.y;
        java.lang.Object obj65 = new java.lang.Object();
        boolean boolean66 = point60.equals(obj65);
        java.lang.Double double67 = point60.y;
        point60.x = (-1.0d);
        point60.y = 0.0d;
        point60.x = 1.0d;
        boolean boolean74 = point34.equals((java.lang.Object) 1.0d);
        java.lang.Double double75 = point34.y;
        java.lang.Double double76 = point34.y;
        java.lang.Double double77 = point34.x;
        boolean boolean78 = point20.equals((java.lang.Object) point34);
        point20.x = 0.0d;
        java.lang.Double double81 = point20.y;
        point20.x = (-1.0d);
        point20.y = (-1.0d);
        Point point88 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point88.x = 1.0d;
        Line line91 = new Line(point20, point88);
        org.junit.Assert.assertTrue("Contract failed: line91.equals(line91)", line91.equals(line91));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        point14.y = 100.0d;
        java.lang.Double double22 = point14.x;
        point14.y = 100.0d;
        point14.x = 100.0d;
        point14.y = 100.0d;
        boolean boolean29 = point2.equals((java.lang.Object) point14);
        java.lang.Double double30 = point14.y;
        java.lang.Double double31 = point14.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.x = 10.0d;
        java.lang.Double double42 = point34.y;
        point34.y = 0.0d;
        java.lang.Double double45 = point34.x;
        point34.y = (-1.0d);
        point34.y = 10.0d;
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.x;
        boolean boolean55 = point52.equals((java.lang.Object) 10.0f);
        point52.x = 100.0d;
        java.lang.Double double58 = point52.x;
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point61.x = 100.0d;
        boolean boolean64 = point52.equals((java.lang.Object) 100.0d);
        java.lang.Double double65 = point52.y;
        point52.y = 100.0d;
        boolean boolean68 = point34.equals((java.lang.Object) 100.0d);
        point34.y = 10.0d;
        Line line71 = new Line(point14, point34);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point15.equals((java.lang.Object) double22);
        point15.x = 10.0d;
        java.lang.Double double26 = point15.x;
        point15.x = 10.0d;
        java.lang.Double double29 = point15.y;
        boolean boolean30 = point2.equals((java.lang.Object) double29);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point33.x = 1.0d;
        point33.y = 1.0d;
        java.lang.Double double38 = point33.x;
        java.lang.Double double39 = point33.y;
        boolean boolean40 = point2.equals((java.lang.Object) point33);
        java.lang.Double double41 = point33.y;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 1.0d;
        java.lang.Object obj50 = null;
        boolean boolean51 = point44.equals(obj50);
        java.lang.Double double52 = point44.x;
        point44.x = 0.0d;
        point44.y = 0.0d;
        point44.x = 10.0d;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point61.x = 100.0d;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        point66.y = 1.0d;
        point66.x = 1.0d;
        java.lang.Double double72 = point66.y;
        java.lang.Double double73 = point66.y;
        point66.x = 10.0d;
        boolean boolean76 = point61.equals((java.lang.Object) point66);
        java.lang.Double double77 = point61.x;
        boolean boolean78 = point44.equals((java.lang.Object) double77);
        Line line79 = new Line(point33, point44);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 0.0d;
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.x;
        java.lang.Double double15 = point13.y;
        java.lang.Double double16 = point13.y;
        point13.y = (-1.0d);
        point13.x = 0.0d;
        point13.y = 10.0d;
        Point point25 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double26 = point25.x;
        point25.x = 100.0d;
        point25.x = (-1.0d);
        boolean boolean31 = point13.equals((java.lang.Object) (-1.0d));
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.y = 10.0d;
        point34.y = 100.0d;
        boolean boolean44 = point13.equals((java.lang.Object) point34);
        java.lang.Double double45 = point34.y;
        Line line46 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 1.0d;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.y;
        point2.y = 100.0d;
        Point point18 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        point18.y = 0.0d;
        Line line21 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        point7.x = 100.0d;
        boolean boolean11 = point2.equals((java.lang.Object) point7);
        point2.x = 0.0d;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        java.lang.Double double17 = point11.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        java.lang.Double double24 = point11.y;
        point11.y = 100.0d;
        boolean boolean27 = point2.equals((java.lang.Object) point11);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 0.0d;
        boolean boolean37 = point30.equals((java.lang.Object) "");
        boolean boolean38 = point11.equals((java.lang.Object) point30);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        point41.y = 1.0d;
        point41.y = (-1.0d);
        point41.y = 10.0d;
        point41.y = 1.0d;
        java.lang.Double double52 = point41.x;
        java.lang.Double double53 = point41.y;
        java.lang.Double double54 = point41.x;
        point41.y = (-1.0d);
        java.lang.Double double57 = point41.y;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point60.x = 1.0d;
        point60.y = 1.0d;
        java.lang.Double double65 = point60.x;
        point60.x = (-1.0d);
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        point70.y = 1.0d;
        point70.x = 100.0d;
        point70.x = 10.0d;
        java.lang.Double double78 = point70.y;
        boolean boolean79 = point60.equals((java.lang.Object) double78);
        point60.y = (-1.0d);
        java.lang.Double double82 = point60.x;
        java.lang.Class<?> wildcardClass83 = point60.getClass();
        boolean boolean84 = point41.equals((java.lang.Object) wildcardClass83);
        Line line85 = new Line(point11, point41);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        point2.x = (-1.0d);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean21 = point19.equals((java.lang.Object) true);
        boolean boolean22 = point14.equals((java.lang.Object) true);
        java.lang.Double double23 = point14.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.y = 0.0d;
        boolean boolean32 = point14.equals((java.lang.Object) point26);
        boolean boolean33 = point2.equals((java.lang.Object) point14);
        java.lang.Double double34 = point2.x;
        point2.x = (-1.0d);
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.x;
        boolean boolean51 = point48.equals((java.lang.Object) 10.0f);
        point48.x = 100.0d;
        boolean boolean54 = point42.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass55 = point42.getClass();
        boolean boolean56 = point39.equals((java.lang.Object) wildcardClass55);
        Point point59 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        java.lang.Double double64 = point62.y;
        boolean boolean65 = point59.equals((java.lang.Object) point62);
        point59.x = 10.0d;
        boolean boolean68 = point39.equals((java.lang.Object) point59);
        point39.x = 10.0d;
        point39.y = 100.0d;
        java.lang.Double double73 = point39.y;
        Line line74 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        boolean boolean18 = point2.equals((java.lang.Object) false);
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.y;
        point21.y = 100.0d;
        java.lang.Double double29 = point21.x;
        java.lang.Double double30 = point21.y;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        java.lang.Double double38 = point33.y;
        point33.y = 100.0d;
        java.lang.Double double41 = point33.x;
        point33.y = 100.0d;
        point33.x = 100.0d;
        point33.y = 100.0d;
        boolean boolean48 = point21.equals((java.lang.Object) point33);
        java.lang.Double double49 = point33.y;
        Line line50 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.y;
        point2.y = 10.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point30.x = 100.0d;
        boolean boolean33 = point21.equals((java.lang.Object) 100.0d);
        point21.x = 10.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point38.x = 1.0d;
        point38.y = 1.0d;
        java.lang.Double double43 = point38.x;
        point38.x = (-1.0d);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        point48.x = 100.0d;
        point48.x = 10.0d;
        java.lang.Double double56 = point48.y;
        boolean boolean57 = point38.equals((java.lang.Object) double56);
        point38.y = (-1.0d);
        point38.x = (-1.0d);
        java.lang.Double double62 = point38.y;
        java.lang.Class<?> wildcardClass63 = point38.getClass();
        boolean boolean64 = point21.equals((java.lang.Object) wildcardClass63);
        boolean boolean65 = point2.equals((java.lang.Object) point21);
        Point point66 = null;
        Line line67 = new Line(point21, point66);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj18 = null;
        boolean boolean19 = point17.equals(obj18);
        point17.y = 0.0d;
        java.lang.Double double22 = point17.x;
        boolean boolean23 = point5.equals((java.lang.Object) point17);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 1.0d;
        java.lang.Object obj32 = null;
        boolean boolean33 = point26.equals(obj32);
        point26.x = 1.0d;
        boolean boolean37 = point26.equals((java.lang.Object) false);
        java.lang.Double double38 = point26.x;
        java.lang.Double double39 = point26.x;
        java.lang.Double double40 = point26.y;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        java.lang.Double double49 = point43.x;
        point43.y = 1.0d;
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double55 = point54.y;
        point54.y = 10.0d;
        point54.y = (-1.0d);
        java.lang.Class<?> wildcardClass60 = point54.getClass();
        boolean boolean61 = point43.equals((java.lang.Object) wildcardClass60);
        java.lang.Double double62 = point43.y;
        point43.y = 100.0d;
        boolean boolean65 = point26.equals((java.lang.Object) point43);
        java.lang.Double double66 = point26.y;
        Line line67 = new Line(point17, point26);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        java.lang.Double double18 = point14.y;
        boolean boolean19 = point11.equals((java.lang.Object) double18);
        point11.x = 10.0d;
        java.lang.Double double22 = point11.x;
        boolean boolean23 = point2.equals((java.lang.Object) point11);
        java.lang.Double double24 = point2.y;
        point2.x = 10.0d;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point29.x = 0.0d;
        point29.y = 1.0d;
        point29.x = 1.0d;
        java.lang.Double double36 = point29.y;
        Line line37 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double19 = point18.x;
        point18.x = 1.0d;
        java.lang.Double double22 = point18.x;
        point18.x = 100.0d;
        Line line25 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        java.lang.Double double17 = point13.y;
        point13.y = 100.0d;
        point13.y = (-1.0d);
        boolean boolean22 = point2.equals((java.lang.Object) point13);
        point13.x = (-1.0d);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.x;
        boolean boolean34 = point31.equals((java.lang.Object) 10.0f);
        point31.x = 100.0d;
        java.lang.Double double37 = point31.x;
        point31.y = 1.0d;
        point31.y = 1.0d;
        boolean boolean42 = point27.equals((java.lang.Object) point31);
        point31.x = (-1.0d);
        java.lang.Double double45 = point31.x;
        Line line46 = new Line(point13, point31);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 100.0d;
        point7.y = 100.0d;
        java.lang.Double double15 = point7.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.y;
        boolean boolean24 = point18.equals((java.lang.Object) point21);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.y;
        boolean boolean30 = point21.equals((java.lang.Object) double29);
        Point point33 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.x;
        java.lang.Double double36 = point33.x;
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        java.lang.Double double42 = point39.y;
        point39.x = 100.0d;
        point39.x = 100.0d;
        java.lang.Double double47 = point39.y;
        boolean boolean48 = point33.equals((java.lang.Object) point39);
        java.lang.Double double49 = point39.x;
        boolean boolean50 = point21.equals((java.lang.Object) point39);
        point21.x = 100.0d;
        boolean boolean53 = point7.equals((java.lang.Object) 100.0d);
        point7.y = 1.0d;
        Line line56 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        point18.y = (-1.0d);
        java.lang.Double double24 = point18.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point27.x = 100.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 1.0d;
        java.lang.Double double38 = point32.y;
        java.lang.Double double39 = point32.y;
        point32.x = 10.0d;
        boolean boolean42 = point27.equals((java.lang.Object) point32);
        boolean boolean43 = point18.equals((java.lang.Object) point32);
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        point46.x = 1.0d;
        boolean boolean53 = point46.equals((java.lang.Object) 'a');
        point46.x = 10.0d;
        boolean boolean56 = point32.equals((java.lang.Object) 10.0d);
        java.lang.Double double57 = point32.y;
        java.lang.Double double58 = point32.x;
        Point point61 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.x;
        java.lang.Double double63 = point61.y;
        point61.y = (-1.0d);
        boolean boolean66 = point32.equals((java.lang.Object) point61);
        java.lang.Double double67 = point61.y;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        point70.y = 1.0d;
        java.lang.Double double74 = point70.y;
        java.lang.Object obj75 = new java.lang.Object();
        boolean boolean76 = point70.equals(obj75);
        java.lang.Double double77 = point70.y;
        point70.y = 100.0d;
        point70.y = 0.0d;
        boolean boolean82 = point61.equals((java.lang.Object) 0.0d);
        point61.x = 10.0d;
        Line line85 = new Line(point2, point61);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        java.lang.Double double21 = point15.y;
        point15.y = 1.0d;
        point15.y = 100.0d;
        point15.y = 0.0d;
        point15.y = 0.0d;
        point15.y = 10.0d;
        Line line32 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.x = 0.0d;
        point2.x = 10.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 1.0d;
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean23 = point11.equals((java.lang.Object) point21);
        point21.y = (-1.0d);
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        point28.y = (-1.0d);
        point28.y = 100.0d;
        point28.x = (-1.0d);
        java.lang.Double double37 = point28.y;
        java.lang.Double double38 = point28.x;
        boolean boolean39 = point21.equals((java.lang.Object) double38);
        java.lang.Double double40 = point21.y;
        Line line41 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        boolean boolean13 = point10.equals((java.lang.Object) 1L);
        java.lang.Double double14 = point10.y;
        boolean boolean15 = point7.equals((java.lang.Object) double14);
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        point18.y = 100.0d;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass28 = point27.getClass();
        boolean boolean29 = point18.equals((java.lang.Object) point27);
        boolean boolean30 = point7.equals((java.lang.Object) point27);
        java.lang.Double double31 = point7.y;
        boolean boolean32 = point2.equals((java.lang.Object) point7);
        java.lang.Double double33 = point7.x;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point36.x = 0.0d;
        point36.y = 1.0d;
        point36.y = 100.0d;
        java.lang.Double double43 = point36.x;
        java.lang.Double double44 = point36.x;
        Line line45 = new Line(point7, point36);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        point2.x = 0.0d;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 1.0d;
        point20.y = 100.0d;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj34 = null;
        boolean boolean35 = point33.equals(obj34);
        boolean boolean36 = point20.equals((java.lang.Object) point33);
        point20.x = 100.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        java.lang.Double double46 = point44.y;
        boolean boolean47 = point41.equals((java.lang.Object) point44);
        java.lang.Double double48 = point44.x;
        boolean boolean49 = point20.equals((java.lang.Object) point44);
        java.lang.Double double50 = point20.y;
        boolean boolean51 = point2.equals((java.lang.Object) double50);
        java.lang.Double double52 = point2.x;
        Point point55 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double56 = point55.x;
        java.lang.Double double57 = point55.x;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double61 = point60.y;
        boolean boolean62 = point55.equals((java.lang.Object) double61);
        point55.x = (-1.0d);
        Line line65 = new Line(point2, point55);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        point2.x = 10.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 1.0d;
        java.lang.Double double18 = point12.y;
        point12.x = 0.0d;
        Line line21 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        point5.y = 0.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.x;
        java.lang.Double double22 = point19.x;
        point19.y = 0.0d;
        boolean boolean26 = point19.equals((java.lang.Object) '#');
        point19.x = 0.0d;
        point19.y = 100.0d;
        Line line31 = new Line(point5, point19);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = 1.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.x;
        point2.x = 10.0d;
        point2.x = 0.0d;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point17.y = 10.0d;
        point17.x = (-1.0d);
        Line line22 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.x;
        boolean boolean9 = point6.equals((java.lang.Object) 10.0f);
        point6.x = 100.0d;
        java.lang.Double double12 = point6.x;
        point6.y = 1.0d;
        point6.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point6);
        point6.y = (-1.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 100.0d;
        point22.y = 10.0d;
        point22.y = 100.0d;
        java.lang.Double double32 = point22.x;
        boolean boolean33 = point6.equals((java.lang.Object) double32);
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        point36.y = (-1.0d);
        java.lang.Double double41 = point36.y;
        java.lang.Double double42 = point36.y;
        point36.y = 1.0d;
        point36.y = 100.0d;
        point36.x = 1.0d;
        point36.y = (-1.0d);
        point36.y = 1.0d;
        java.lang.Double double53 = point36.y;
        point36.x = 0.0d;
        Point point58 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.y;
        point58.y = 10.0d;
        point58.y = (-1.0d);
        java.lang.Class<?> wildcardClass64 = point58.getClass();
        boolean boolean65 = point36.equals((java.lang.Object) point58);
        Line line66 = new Line(point6, point36);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        java.lang.Double double26 = point22.y;
        boolean boolean27 = point19.equals((java.lang.Object) double26);
        point19.x = 10.0d;
        java.lang.Double double30 = point19.x;
        point19.x = 10.0d;
        java.lang.Class<?> wildcardClass33 = point19.getClass();
        boolean boolean34 = point2.equals((java.lang.Object) wildcardClass33);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.x;
        boolean boolean40 = point37.equals((java.lang.Object) 10.0f);
        point37.x = 100.0d;
        java.lang.Double double43 = point37.x;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point46.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        point37.x = 1.0d;
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point54.y = 0.0d;
        java.lang.Double double57 = point54.y;
        java.lang.Double double58 = point54.x;
        point54.x = 1.0d;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        point63.y = 1.0d;
        java.lang.Double double67 = point63.y;
        java.lang.Object obj68 = new java.lang.Object();
        boolean boolean69 = point63.equals(obj68);
        java.lang.Double double70 = point63.y;
        point63.x = 1.0d;
        boolean boolean73 = point54.equals((java.lang.Object) point63);
        Point point76 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point76.y = 10.0d;
        point76.y = 10.0d;
        boolean boolean81 = point63.equals((java.lang.Object) point76);
        boolean boolean82 = point37.equals((java.lang.Object) boolean81);
        point37.y = 0.0d;
        Point point87 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point87.x = 0.0d;
        java.lang.Double double90 = point87.x;
        java.lang.Double double91 = point87.y;
        point87.x = 100.0d;
        boolean boolean94 = point37.equals((java.lang.Object) point87);
        point87.x = 0.0d;
        Line line97 = new Line(point2, point87);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.y = 0.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point14);
        point14.y = 1.0d;
        java.lang.Double double23 = point14.x;
        point14.x = 1.0d;
        point14.x = 10.0d;
        point14.x = 0.0d;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point32.y = 10.0d;
        java.lang.Double double35 = point32.x;
        point32.y = 1.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        point40.y = 10.0d;
        point40.y = 10.0d;
        point40.x = 0.0d;
        boolean boolean52 = point32.equals((java.lang.Object) point40);
        java.lang.Double double53 = point32.y;
        Line line54 = new Line(point14, point32);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        java.lang.Double double12 = point9.y;
        java.lang.Double double13 = point9.y;
        point9.y = 0.0d;
        java.lang.Double double16 = point9.y;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean21 = point19.equals((java.lang.Object) (byte) 100);
        java.lang.Double double22 = point19.x;
        point19.x = (-1.0d);
        point19.x = 10.0d;
        point19.y = (-1.0d);
        point19.x = 10.0d;
        boolean boolean31 = point9.equals((java.lang.Object) point19);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 0.0d;
        point34.y = 1.0d;
        java.lang.Double double39 = point34.x;
        java.lang.Double double40 = point34.x;
        boolean boolean41 = point9.equals((java.lang.Object) point34);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 100.0d;
        point44.x = 10.0d;
        point44.x = 10.0d;
        point44.x = 10.0d;
        point44.x = 10.0d;
        boolean boolean58 = point9.equals((java.lang.Object) point44);
        Line line59 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.x;
        java.lang.Double double23 = point21.y;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.y;
        java.lang.Double double27 = point21.x;
        java.lang.Double double28 = point21.x;
        boolean boolean29 = point2.equals((java.lang.Object) point21);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean38 = point35.equals((java.lang.Object) 1L);
        java.lang.Double double39 = point35.y;
        boolean boolean40 = point32.equals((java.lang.Object) double39);
        point32.x = 10.0d;
        java.lang.Double double43 = point32.x;
        point32.x = 10.0d;
        Line line46 = new Line(point21, point32);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        boolean boolean11 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Object obj12 = null;
        boolean boolean13 = point2.equals(obj12);
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point17.x = 0.0d;
        point17.y = 1.0d;
        java.lang.Double double22 = point17.x;
        boolean boolean23 = point2.equals((java.lang.Object) point17);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        point29.y = 1.0d;
        boolean boolean34 = point26.equals((java.lang.Object) 1.0d);
        java.lang.Double double35 = point26.y;
        point26.x = 0.0d;
        java.lang.Double double38 = point26.x;
        Line line39 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        java.lang.Double double14 = point8.x;
        point8.y = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point8);
        java.lang.Double double18 = point8.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        java.lang.Double double26 = point21.y;
        boolean boolean27 = point8.equals((java.lang.Object) point21);
        java.lang.Double double28 = point21.y;
        java.lang.Double double29 = point21.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point32.y = 100.0d;
        point32.y = 0.0d;
        point32.x = 0.0d;
        point32.y = 100.0d;
        Line line41 = new Line(point21, point32);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.x = (-1.0d);
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 100.0d;
        java.lang.Double double17 = point11.y;
        point11.y = 100.0d;
        point11.x = (-1.0d);
        point11.x = 100.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        java.lang.Double double30 = point26.y;
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = point26.equals(obj31);
        java.lang.Double double33 = point26.y;
        point26.y = 100.0d;
        point26.y = 0.0d;
        boolean boolean38 = point11.equals((java.lang.Object) 0.0d);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        point41.y = 1.0d;
        java.lang.Double double46 = point41.x;
        point41.x = (-1.0d);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 100.0d;
        point51.x = 10.0d;
        java.lang.Double double59 = point51.y;
        boolean boolean60 = point41.equals((java.lang.Object) double59);
        point41.y = (-1.0d);
        java.lang.Double double63 = point41.x;
        java.lang.Double double64 = point41.x;
        java.lang.Double double65 = point41.y;
        Point point68 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double69 = point68.x;
        java.lang.Double double70 = point68.y;
        point68.y = (-1.0d);
        java.lang.Class<?> wildcardClass73 = point68.getClass();
        boolean boolean74 = point41.equals((java.lang.Object) wildcardClass73);
        boolean boolean75 = point11.equals((java.lang.Object) point41);
        point41.x = 0.0d;
        java.lang.Double double78 = point41.x;
        point41.y = 1.0d;
        Line line81 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        java.lang.Class<?> wildcardClass8 = point6.getClass();
        boolean boolean9 = point2.equals((java.lang.Object) wildcardClass8);
        point2.x = 0.0d;
        point2.y = 0.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 100.0d;
        point16.x = 10.0d;
        java.lang.Double double24 = point16.y;
        point16.y = 0.0d;
        java.lang.Double double27 = point16.x;
        point16.y = (-1.0d);
        boolean boolean30 = point2.equals((java.lang.Object) point16);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double34 = point33.x;
        java.lang.Double double35 = point33.y;
        point33.y = 1.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        java.lang.Double double46 = point40.y;
        point40.y = 100.0d;
        point40.x = (-1.0d);
        java.lang.Double double51 = point40.x;
        boolean boolean52 = point33.equals((java.lang.Object) point40);
        point33.y = (-1.0d);
        Line line55 = new Line(point16, point33);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.y;
        point2.y = 10.0d;
        point2.x = 10.0d;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.y;
        point24.y = 0.0d;
        point24.y = 1.0d;
        point24.y = 0.0d;
        point24.x = 100.0d;
        point24.x = (-1.0d);
        java.lang.Double double39 = point24.y;
        Line line40 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        point5.y = 1.0d;
        point5.x = 100.0d;
        point5.x = 10.0d;
        java.lang.Double double13 = point5.y;
        java.lang.Double double14 = point5.x;
        boolean boolean15 = point2.equals((java.lang.Object) double14);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        java.lang.Double double21 = point18.x;
        point18.y = 1.0d;
        java.lang.Double double24 = point18.y;
        java.lang.Double double25 = point18.x;
        java.lang.Double double26 = point18.y;
        point18.x = 10.0d;
        point18.x = 100.0d;
        boolean boolean31 = point2.equals((java.lang.Object) point18);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.y = 10.0d;
        point34.y = (-1.0d);
        java.lang.Object obj40 = null;
        boolean boolean41 = point34.equals(obj40);
        boolean boolean43 = point34.equals((java.lang.Object) 10.0d);
        java.lang.Object obj44 = null;
        boolean boolean45 = point34.equals(obj44);
        java.lang.Double double46 = point34.y;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point49.x = 0.0d;
        point49.y = 1.0d;
        java.lang.Double double54 = point49.x;
        boolean boolean55 = point34.equals((java.lang.Object) point49);
        Line line56 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        point17.y = 10.0d;
        boolean boolean21 = point14.equals((java.lang.Object) point17);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass25 = point24.getClass();
        boolean boolean26 = point17.equals((java.lang.Object) wildcardClass25);
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        boolean boolean32 = point17.equals((java.lang.Object) point29);
        boolean boolean33 = point2.equals((java.lang.Object) point17);
        java.lang.Double double34 = point2.x;
        java.lang.Double double35 = point2.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        point38.y = 10.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point48.x = 0.0d;
        point48.y = 1.0d;
        java.lang.Double double53 = point48.x;
        java.lang.Double double54 = point48.x;
        boolean boolean55 = point38.equals((java.lang.Object) point48);
        boolean boolean56 = point2.equals((java.lang.Object) point48);
        java.lang.Double double57 = point2.x;
        java.lang.Double double58 = point2.y;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        point61.x = 100.0d;
        point61.x = 10.0d;
        java.lang.Double double69 = point61.x;
        Line line70 = new Line(point2, point61);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        java.lang.Double double18 = point14.y;
        boolean boolean19 = point11.equals((java.lang.Object) double18);
        point11.x = 10.0d;
        java.lang.Double double22 = point11.x;
        boolean boolean23 = point2.equals((java.lang.Object) point11);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        java.lang.Double double31 = point26.y;
        java.lang.Double double32 = point26.y;
        point26.y = 1.0d;
        point26.y = 100.0d;
        point26.y = 1.0d;
        Line line39 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        java.lang.Double double19 = point16.x;
        point16.y = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point16);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        java.lang.Double double30 = point25.x;
        java.lang.Double double31 = point25.x;
        point25.y = 1.0d;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point36.x = 100.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.x = 1.0d;
        java.lang.Double double47 = point41.y;
        java.lang.Double double48 = point41.y;
        point41.x = 10.0d;
        boolean boolean51 = point36.equals((java.lang.Object) point41);
        java.lang.Double double52 = point41.x;
        boolean boolean54 = point41.equals((java.lang.Object) 1);
        java.lang.Double double55 = point41.y;
        boolean boolean56 = point25.equals((java.lang.Object) point41);
        java.lang.Double double57 = point25.y;
        Line line58 = new Line(point16, point25);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double15 = point2.x;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        point19.x = 0.0d;
        point19.y = 1.0d;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        point30.y = (-1.0d);
        point30.y = 100.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        boolean boolean42 = point39.equals((java.lang.Object) 1L);
        point39.y = (-1.0d);
        java.lang.Double double45 = point39.y;
        java.lang.Double double46 = point39.y;
        java.lang.Double double47 = point39.x;
        boolean boolean48 = point30.equals((java.lang.Object) point39);
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        point51.y = (-1.0d);
        java.lang.Double double56 = point51.y;
        java.lang.Double double57 = point51.y;
        Point point60 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double61 = point60.y;
        java.lang.Double double62 = point60.y;
        boolean boolean63 = point51.equals((java.lang.Object) point60);
        boolean boolean64 = point39.equals((java.lang.Object) boolean63);
        boolean boolean65 = point19.equals((java.lang.Object) boolean64);
        point19.y = (-1.0d);
        point19.y = 0.0d;
        Line line70 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        java.lang.Class<?> wildcardClass8 = point6.getClass();
        boolean boolean9 = point2.equals((java.lang.Object) wildcardClass8);
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.y;
        point2.y = (-1.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point16.x = 0.0d;
        java.lang.Double double19 = point16.x;
        point16.y = (-1.0d);
        Line line22 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.y;
        point8.y = 10.0d;
        boolean boolean12 = point5.equals((java.lang.Object) point8);
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass16 = point15.getClass();
        boolean boolean17 = point8.equals((java.lang.Object) wildcardClass16);
        java.lang.Double double18 = point8.y;
        point8.x = (-1.0d);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        point23.y = 100.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        point32.y = (-1.0d);
        java.lang.Double double38 = point32.y;
        java.lang.Double double39 = point32.y;
        java.lang.Double double40 = point32.x;
        boolean boolean41 = point23.equals((java.lang.Object) point32);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        point44.y = (-1.0d);
        java.lang.Double double49 = point44.y;
        java.lang.Double double50 = point44.y;
        Point point53 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double54 = point53.y;
        java.lang.Double double55 = point53.y;
        boolean boolean56 = point44.equals((java.lang.Object) point53);
        boolean boolean57 = point32.equals((java.lang.Object) boolean56);
        java.lang.Double double58 = point32.y;
        boolean boolean59 = point8.equals((java.lang.Object) point32);
        point8.y = (-1.0d);
        point8.y = (-1.0d);
        Line line64 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = (-1.0d);
        java.lang.Double double24 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double27 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.x;
        java.lang.Double double36 = point34.y;
        java.lang.Double double37 = point34.x;
        point34.y = 100.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean44 = point42.equals((java.lang.Object) true);
        boolean boolean45 = point34.equals((java.lang.Object) true);
        java.lang.Double double46 = point34.y;
        point34.y = 1.0d;
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point51.y = 0.0d;
        java.lang.Double double54 = point51.y;
        java.lang.Double double55 = point51.x;
        point51.x = 1.0d;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        java.lang.Double double64 = point60.y;
        java.lang.Object obj65 = new java.lang.Object();
        boolean boolean66 = point60.equals(obj65);
        java.lang.Double double67 = point60.y;
        point60.x = 1.0d;
        boolean boolean70 = point51.equals((java.lang.Object) point60);
        Point point73 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean74 = point60.equals((java.lang.Object) point73);
        java.lang.Double double75 = point73.x;
        boolean boolean76 = point34.equals((java.lang.Object) point73);
        point73.x = 0.0d;
        boolean boolean79 = point2.equals((java.lang.Object) 0.0d);
        Point point82 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double83 = point82.y;
        point82.y = 1.0d;
        point82.x = 100.0d;
        point82.y = (-1.0d);
        java.lang.Double double90 = point82.x;
        point82.x = 10.0d;
        point82.x = 10.0d;
        Line line95 = new Line(point2, point82);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj16 = null;
        boolean boolean17 = point15.equals(obj16);
        boolean boolean18 = point2.equals((java.lang.Object) point15);
        point2.x = 100.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        boolean boolean29 = point23.equals((java.lang.Object) point26);
        java.lang.Double double30 = point26.x;
        boolean boolean31 = point2.equals((java.lang.Object) point26);
        point26.y = 1.0d;
        java.lang.Double double34 = point26.y;
        java.lang.Double double35 = point26.x;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point38.x = 100.0d;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 1.0d;
        java.lang.Double double49 = point43.y;
        java.lang.Double double50 = point43.y;
        point43.x = 10.0d;
        boolean boolean53 = point38.equals((java.lang.Object) point43);
        java.lang.Double double54 = point43.x;
        java.lang.Double double55 = point43.x;
        point43.y = (-1.0d);
        java.lang.Class<?> wildcardClass58 = point43.getClass();
        boolean boolean59 = point26.equals((java.lang.Object) point43);
        Point point62 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double63 = point62.y;
        point62.y = 100.0d;
        point62.y = (-1.0d);
        point62.x = 0.0d;
        point62.y = 0.0d;
        Line line72 = new Line(point26, point62);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        point9.y = (-1.0d);
        java.lang.Double double15 = point9.y;
        java.lang.Double double16 = point9.y;
        java.lang.Double double17 = point9.x;
        java.lang.Double double18 = point9.x;
        boolean boolean19 = point2.equals((java.lang.Object) point9);
        point9.x = 10.0d;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.x;
        boolean boolean36 = point33.equals((java.lang.Object) 10.0f);
        point33.x = 100.0d;
        boolean boolean39 = point27.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass40 = point27.getClass();
        boolean boolean41 = point24.equals((java.lang.Object) wildcardClass40);
        java.lang.Double double42 = point24.y;
        point24.y = 0.0d;
        Line line45 = new Line(point9, point24);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        point2.y = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        java.lang.Double double22 = point13.x;
        point13.y = 0.0d;
        point13.x = 1.0d;
        java.lang.Double double27 = point13.x;
        java.lang.Double double28 = point13.x;
        point13.x = 10.0d;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        java.lang.Double double40 = point36.y;
        boolean boolean41 = point33.equals((java.lang.Object) double40);
        java.lang.Double double42 = point33.y;
        java.lang.Double double43 = point33.x;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        boolean boolean52 = point49.equals((java.lang.Object) 1L);
        java.lang.Double double53 = point49.y;
        boolean boolean54 = point46.equals((java.lang.Object) double53);
        java.lang.Double double55 = point46.y;
        boolean boolean56 = point33.equals((java.lang.Object) point46);
        point33.x = 100.0d;
        point33.x = 10.0d;
        boolean boolean61 = point13.equals((java.lang.Object) 10.0d);
        boolean boolean62 = point2.equals((java.lang.Object) point13);
        Point point63 = null;
        Line line64 = new Line(point13, point63);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        java.lang.Double double17 = point2.x;
        point2.y = 0.0d;
        point2.y = 0.0d;
        java.lang.Double double22 = point2.x;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        java.lang.Double double28 = point25.y;
        java.lang.Double double29 = point25.y;
        point25.y = 10.0d;
        java.lang.Double double32 = point25.y;
        java.lang.Double double33 = point25.y;
        boolean boolean34 = point2.equals((java.lang.Object) double33);
        Point point37 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double38 = point37.x;
        point37.x = 100.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        java.lang.Double double46 = point43.y;
        java.lang.Double double47 = point43.y;
        point43.y = 10.0d;
        java.lang.Double double50 = point43.y;
        point43.x = 10.0d;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point55.x = 1.0d;
        point55.y = 1.0d;
        java.lang.Double double60 = point55.x;
        point55.x = (-1.0d);
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        point65.y = 1.0d;
        point65.x = 100.0d;
        point65.x = 10.0d;
        java.lang.Double double73 = point65.y;
        boolean boolean74 = point55.equals((java.lang.Object) double73);
        point55.y = (-1.0d);
        java.lang.Double double77 = point55.x;
        point55.y = 1.0d;
        boolean boolean80 = point43.equals((java.lang.Object) 1.0d);
        point43.x = 10.0d;
        point43.x = (-1.0d);
        boolean boolean85 = point37.equals((java.lang.Object) point43);
        point37.x = 10.0d;
        point37.x = 1.0d;
        Line line90 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 100.0d;
        point18.y = 100.0d;
        java.lang.Double double26 = point18.y;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point29.equals((java.lang.Object) point32);
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.y;
        boolean boolean41 = point32.equals((java.lang.Object) double40);
        Point point44 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double45 = point44.y;
        java.lang.Double double46 = point44.x;
        java.lang.Double double47 = point44.x;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point50.y = 0.0d;
        java.lang.Double double53 = point50.y;
        point50.x = 100.0d;
        point50.x = 100.0d;
        java.lang.Double double58 = point50.y;
        boolean boolean59 = point44.equals((java.lang.Object) point50);
        java.lang.Double double60 = point50.x;
        boolean boolean61 = point32.equals((java.lang.Object) point50);
        point32.x = 100.0d;
        boolean boolean64 = point18.equals((java.lang.Object) 100.0d);
        point18.x = 0.0d;
        point18.y = 100.0d;
        Line line69 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point2.y = 10.0d;
        point2.y = 10.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.x = 1.0d;
        point15.y = 1.0d;
        java.lang.Double double20 = point15.x;
        point15.x = (-1.0d);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 100.0d;
        point25.x = 10.0d;
        java.lang.Double double33 = point25.y;
        boolean boolean34 = point15.equals((java.lang.Object) double33);
        point15.y = (-1.0d);
        java.lang.Double double37 = point15.x;
        java.lang.Double double38 = point15.x;
        java.lang.Double double39 = point15.x;
        java.lang.Class<?> wildcardClass40 = point15.getClass();
        boolean boolean41 = point9.equals((java.lang.Object) wildcardClass40);
        boolean boolean42 = point2.equals((java.lang.Object) wildcardClass40);
        Point point45 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double46 = point45.x;
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double50 = point49.y;
        java.lang.Class<?> wildcardClass51 = point49.getClass();
        boolean boolean52 = point45.equals((java.lang.Object) wildcardClass51);
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 1.0d;
        point55.x = 1.0d;
        java.lang.Double double61 = point55.y;
        java.lang.Double double62 = point55.y;
        point55.x = 1.0d;
        point55.y = (-1.0d);
        java.lang.Class<?> wildcardClass67 = point55.getClass();
        boolean boolean68 = point45.equals((java.lang.Object) point55);
        java.lang.Double double69 = point45.x;
        Line line70 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.x;
        boolean boolean23 = point20.equals((java.lang.Object) 10.0f);
        point20.x = 100.0d;
        java.lang.Double double26 = point20.x;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point29.x = 100.0d;
        boolean boolean32 = point20.equals((java.lang.Object) 100.0d);
        java.lang.Double double33 = point20.y;
        point20.y = 100.0d;
        boolean boolean36 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double37 = point2.y;
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        java.lang.Double double43 = point40.y;
        java.lang.Double double44 = point40.y;
        point40.y = 10.0d;
        java.lang.Double double47 = point40.y;
        point40.x = 10.0d;
        point40.x = 0.0d;
        point40.x = 1.0d;
        Point point56 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double57 = point56.x;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.y;
        java.lang.Class<?> wildcardClass62 = point60.getClass();
        boolean boolean63 = point56.equals((java.lang.Object) wildcardClass62);
        point56.x = 0.0d;
        java.lang.Double double66 = point56.x;
        boolean boolean67 = point40.equals((java.lang.Object) point56);
        java.lang.Double double68 = point56.y;
        Point point71 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point71.y = 10.0d;
        java.lang.Double double74 = point71.x;
        point71.y = 1.0d;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        point79.y = 1.0d;
        point79.x = 100.0d;
        point79.y = 10.0d;
        point79.y = 10.0d;
        point79.x = 0.0d;
        boolean boolean91 = point71.equals((java.lang.Object) point79);
        boolean boolean92 = point56.equals((java.lang.Object) boolean91);
        Line line93 = new Line(point2, point56);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        java.lang.Double double16 = point12.y;
        boolean boolean17 = point9.equals((java.lang.Object) double16);
        point9.x = 10.0d;
        java.lang.Double double20 = point9.x;
        point9.x = 10.0d;
        java.lang.Double double23 = point9.x;
        point9.y = 10.0d;
        Line line26 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        point7.y = (-1.0d);
        java.lang.Double double12 = point7.y;
        java.lang.Double double13 = point7.y;
        point7.y = 1.0d;
        java.lang.Class<?> wildcardClass16 = point7.getClass();
        boolean boolean17 = point2.equals((java.lang.Object) wildcardClass16);
        point2.y = 100.0d;
        java.lang.Double double20 = point2.x;
        java.lang.Double double21 = point2.y;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point24.x = 1.0d;
        point24.y = 1.0d;
        java.lang.Double double29 = point24.x;
        point24.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.x = 10.0d;
        java.lang.Double double42 = point34.y;
        boolean boolean43 = point24.equals((java.lang.Object) double42);
        point24.y = (-1.0d);
        java.lang.Double double46 = point24.x;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point49.y = (-1.0d);
        java.lang.Double double52 = point49.x;
        point49.x = (-1.0d);
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double58 = point57.y;
        java.lang.Double double59 = point57.x;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean64 = point62.equals((java.lang.Object) true);
        boolean boolean65 = point57.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass66 = point57.getClass();
        boolean boolean67 = point49.equals((java.lang.Object) wildcardClass66);
        boolean boolean68 = point24.equals((java.lang.Object) point49);
        point49.x = 0.0d;
        Line line71 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.x;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean19 = point12.equals((java.lang.Object) double18);
        boolean boolean20 = point2.equals((java.lang.Object) point12);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        boolean boolean26 = point23.equals((java.lang.Object) 1L);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.x;
        boolean boolean32 = point29.equals((java.lang.Object) 10.0f);
        point29.x = 100.0d;
        java.lang.Double double35 = point29.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point38.x = 100.0d;
        boolean boolean41 = point29.equals((java.lang.Object) 100.0d);
        point29.x = 10.0d;
        boolean boolean44 = point23.equals((java.lang.Object) point29);
        point23.x = 10.0d;
        java.lang.Double double47 = point23.y;
        boolean boolean48 = point12.equals((java.lang.Object) point23);
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        boolean boolean57 = point54.equals((java.lang.Object) 1L);
        java.lang.Double double58 = point54.y;
        boolean boolean59 = point51.equals((java.lang.Object) double58);
        java.lang.Double double60 = point51.y;
        java.lang.Double double61 = point51.x;
        Point point64 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        boolean boolean70 = point67.equals((java.lang.Object) 1L);
        java.lang.Double double71 = point67.y;
        boolean boolean72 = point64.equals((java.lang.Object) double71);
        java.lang.Double double73 = point64.y;
        boolean boolean74 = point51.equals((java.lang.Object) point64);
        point64.y = 100.0d;
        Line line77 = new Line(point12, point64);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point15.equals((java.lang.Object) double22);
        java.lang.Double double24 = point15.y;
        boolean boolean25 = point2.equals((java.lang.Object) point15);
        java.lang.Object obj26 = null;
        boolean boolean27 = point2.equals(obj26);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean37 = point35.equals((java.lang.Object) true);
        boolean boolean38 = point30.equals((java.lang.Object) true);
        java.lang.Double double39 = point30.y;
        point30.x = 10.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        boolean boolean47 = point44.equals((java.lang.Object) 10.0f);
        point44.x = 100.0d;
        java.lang.Double double50 = point44.x;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point53.x = 100.0d;
        boolean boolean56 = point44.equals((java.lang.Object) 100.0d);
        java.lang.Double double57 = point44.y;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 100.0d;
        java.lang.Double double66 = point60.x;
        boolean boolean67 = point44.equals((java.lang.Object) point60);
        java.lang.Double double68 = point44.x;
        point44.y = 100.0d;
        point44.y = 1.0d;
        boolean boolean73 = point30.equals((java.lang.Object) 1.0d);
        point30.x = 0.0d;
        java.lang.Double double76 = point30.x;
        Point point79 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point82 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double83 = point82.y;
        boolean boolean85 = point82.equals((java.lang.Object) 1L);
        java.lang.Double double86 = point82.y;
        boolean boolean87 = point79.equals((java.lang.Object) double86);
        java.lang.Double double88 = point79.y;
        java.lang.Double double89 = point79.x;
        point79.x = 100.0d;
        java.lang.Double double92 = point79.y;
        java.lang.Double double93 = point79.x;
        boolean boolean94 = point30.equals((java.lang.Object) double93);
        Line line95 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        point14.y = 100.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        boolean boolean26 = point23.equals((java.lang.Object) 1L);
        point23.y = (-1.0d);
        java.lang.Double double29 = point23.y;
        java.lang.Double double30 = point23.y;
        java.lang.Double double31 = point23.x;
        boolean boolean32 = point14.equals((java.lang.Object) point23);
        point14.x = (-1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        point37.y = 0.0d;
        java.lang.Double double48 = point37.y;
        point37.x = (-1.0d);
        boolean boolean51 = point14.equals((java.lang.Object) point37);
        Line line52 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        java.lang.Double double21 = point15.y;
        boolean boolean22 = point2.equals((java.lang.Object) point15);
        point2.y = 0.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.y;
        point27.x = 100.0d;
        java.lang.Double double32 = point27.x;
        point27.x = 0.0d;
        java.lang.Double double35 = point27.x;
        Line line36 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.y = 100.0d;
        java.lang.Double double20 = point12.y;
        point12.y = 100.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.x;
        boolean boolean28 = point25.equals((java.lang.Object) 10.0f);
        point25.x = 100.0d;
        java.lang.Double double31 = point25.x;
        point25.y = 1.0d;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.y;
        point36.y = 10.0d;
        point36.y = (-1.0d);
        java.lang.Class<?> wildcardClass42 = point36.getClass();
        boolean boolean43 = point25.equals((java.lang.Object) wildcardClass42);
        java.lang.Double double44 = point25.y;
        point25.x = 1.0d;
        point25.x = 10.0d;
        java.lang.Double double49 = point25.y;
        boolean boolean50 = point12.equals((java.lang.Object) double49);
        point12.x = 100.0d;
        Line line53 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point5.y = 1.0d;
        point5.y = (-1.0d);
        java.lang.Double double10 = point5.y;
        point5.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass16 = point15.getClass();
        boolean boolean17 = point5.equals((java.lang.Object) point15);
        boolean boolean18 = point2.equals((java.lang.Object) point5);
        point5.y = 1.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point23.x = 0.0d;
        point23.y = 1.0d;
        java.lang.Double double28 = point23.x;
        point23.x = 10.0d;
        java.lang.Double double31 = point23.x;
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean36 = point34.equals((java.lang.Object) (byte) 100);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        java.lang.Double double42 = point39.x;
        point39.x = (-1.0d);
        java.lang.Class<?> wildcardClass45 = point39.getClass();
        boolean boolean46 = point34.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = point23.equals((java.lang.Object) boolean46);
        point23.x = 0.0d;
        java.lang.Double double50 = point23.y;
        point23.y = 0.0d;
        Line line53 = new Line(point5, point23);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass12 = point11.getClass();
        boolean boolean13 = point2.equals((java.lang.Object) point11);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 100.0d;
        point16.x = 10.0d;
        java.lang.Double double24 = point16.y;
        point16.y = 0.0d;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 100.0d;
        boolean boolean33 = point16.equals((java.lang.Object) point29);
        point29.y = 1.0d;
        java.lang.Double double36 = point29.x;
        java.lang.Double double37 = point29.x;
        point29.y = 0.0d;
        java.lang.Class<?> wildcardClass40 = point29.getClass();
        boolean boolean41 = point2.equals((java.lang.Object) wildcardClass40);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 100.0d;
        java.lang.Double double50 = point44.y;
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point53.y = 0.0d;
        java.lang.Double double56 = point53.y;
        java.lang.Double double57 = point53.x;
        boolean boolean58 = point44.equals((java.lang.Object) double57);
        boolean boolean60 = point44.equals((java.lang.Object) false);
        point44.y = 100.0d;
        Line line63 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean10 = point2.equals((java.lang.Object) 100.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        boolean boolean25 = point2.equals((java.lang.Object) point13);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 1.0d;
        java.lang.Object obj38 = null;
        boolean boolean39 = point32.equals(obj38);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point42.y = 0.0d;
        java.lang.Double double45 = point42.y;
        java.lang.Double double46 = point42.x;
        point42.x = 1.0d;
        boolean boolean49 = point32.equals((java.lang.Object) 1.0d);
        java.lang.Double double50 = point32.y;
        java.lang.Double double51 = point32.x;
        java.lang.Double double52 = point32.x;
        point32.y = 10.0d;
        point32.y = 0.0d;
        Line line57 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        boolean boolean13 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double23 = point19.y;
        point19.y = (-1.0d);
        point19.y = 100.0d;
        java.lang.Double double28 = point19.y;
        boolean boolean29 = point2.equals((java.lang.Object) point19);
        Point point30 = null;
        Line line31 = new Line(point19, point30);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        java.lang.Double double17 = point11.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        java.lang.Double double24 = point11.y;
        point11.y = 100.0d;
        boolean boolean27 = point2.equals((java.lang.Object) point11);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 0.0d;
        boolean boolean37 = point30.equals((java.lang.Object) "");
        boolean boolean38 = point11.equals((java.lang.Object) point30);
        java.lang.Double double39 = point11.x;
        point11.x = 100.0d;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        point44.y = (-1.0d);
        point44.y = 100.0d;
        point44.x = (-1.0d);
        java.lang.Double double53 = point44.x;
        Line line54 = new Line(point11, point44);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        point5.y = 1.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        point19.y = 100.0d;
        point19.x = 10.0d;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.x;
        point30.x = 0.0d;
        java.lang.Double double36 = point30.y;
        boolean boolean37 = point19.equals((java.lang.Object) point30);
        boolean boolean38 = point5.equals((java.lang.Object) point19);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point41.y = 0.0d;
        java.lang.Double double44 = point41.y;
        java.lang.Double double45 = point41.x;
        Point point48 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.y;
        boolean boolean51 = point41.equals((java.lang.Object) point48);
        point41.y = 100.0d;
        java.lang.Double double54 = point41.y;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point57.x = 0.0d;
        point57.x = 1.0d;
        java.lang.Class<?> wildcardClass62 = point57.getClass();
        boolean boolean63 = point41.equals((java.lang.Object) point57);
        boolean boolean64 = point19.equals((java.lang.Object) point41);
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        boolean boolean70 = point67.equals((java.lang.Object) 1L);
        java.lang.Double double71 = point67.y;
        java.lang.Double double72 = point67.x;
        Line line73 = new Line(point19, point67);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Double double20 = point14.y;
        Point point23 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.y;
        boolean boolean26 = point14.equals((java.lang.Object) point23);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point29.y = 0.0d;
        java.lang.Double double32 = point29.y;
        boolean boolean33 = point23.equals((java.lang.Object) point29);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        point36.x = 1.0d;
        java.lang.Object obj42 = null;
        boolean boolean43 = point36.equals(obj42);
        point36.x = 1.0d;
        point36.x = (-1.0d);
        point36.y = (-1.0d);
        point36.y = 0.0d;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point54.x = 1.0d;
        point54.y = 1.0d;
        point54.y = (-1.0d);
        point54.y = 10.0d;
        point54.y = 1.0d;
        java.lang.Double double65 = point54.x;
        java.lang.Double double66 = point54.y;
        java.lang.Double double67 = point54.x;
        java.lang.Class<?> wildcardClass68 = point54.getClass();
        boolean boolean69 = point36.equals((java.lang.Object) wildcardClass68);
        boolean boolean70 = point23.equals((java.lang.Object) point36);
        java.lang.Double double71 = point36.x;
        Line line72 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        point2.x = 0.0d;
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        point11.y = (-1.0d);
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        java.lang.Double double19 = point11.x;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        Point point32 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point23.equals((java.lang.Object) point32);
        boolean boolean36 = point11.equals((java.lang.Object) boolean35);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.x;
        java.lang.Class<?> wildcardClass45 = point39.getClass();
        boolean boolean46 = point11.equals((java.lang.Object) point39);
        java.lang.Double double47 = point11.x;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        java.lang.Double double56 = point50.y;
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point59.y = 0.0d;
        java.lang.Double double62 = point59.y;
        java.lang.Double double63 = point59.x;
        boolean boolean64 = point50.equals((java.lang.Object) double63);
        boolean boolean66 = point50.equals((java.lang.Object) false);
        point50.y = (-1.0d);
        Line line69 = new Line(point11, point50);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        point2.x = 10.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.x = 10.0d;
        java.lang.Double double22 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double25 = point14.x;
        point14.y = (-1.0d);
        point14.y = 10.0d;
        point14.x = 100.0d;
        point14.x = 1.0d;
        java.lang.Double double34 = point14.x;
        java.lang.Double double35 = point14.y;
        Line line36 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        boolean boolean10 = point2.equals((java.lang.Object) 10);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        java.lang.Double double20 = point14.y;
        point14.y = 100.0d;
        point14.x = (-1.0d);
        point14.x = 100.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        java.lang.Double double33 = point29.y;
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = point29.equals(obj34);
        java.lang.Double double36 = point29.y;
        point29.y = 100.0d;
        point29.y = 0.0d;
        boolean boolean41 = point14.equals((java.lang.Object) 0.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        java.lang.Double double49 = point44.x;
        point44.x = (-1.0d);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        point54.x = 100.0d;
        point54.x = 10.0d;
        java.lang.Double double62 = point54.y;
        boolean boolean63 = point44.equals((java.lang.Object) double62);
        point44.y = (-1.0d);
        java.lang.Double double66 = point44.x;
        java.lang.Double double67 = point44.x;
        java.lang.Double double68 = point44.y;
        Point point71 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double72 = point71.x;
        java.lang.Double double73 = point71.y;
        point71.y = (-1.0d);
        java.lang.Class<?> wildcardClass76 = point71.getClass();
        boolean boolean77 = point44.equals((java.lang.Object) wildcardClass76);
        boolean boolean78 = point14.equals((java.lang.Object) point44);
        point44.x = 0.0d;
        java.lang.Double double81 = point44.x;
        point44.y = 1.0d;
        Line line84 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point13.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 1.0d;
        java.lang.Double double24 = point18.y;
        java.lang.Double double25 = point18.y;
        point18.x = 10.0d;
        boolean boolean28 = point13.equals((java.lang.Object) point18);
        java.lang.Double double29 = point18.x;
        boolean boolean31 = point18.equals((java.lang.Object) 1);
        java.lang.Double double32 = point18.y;
        boolean boolean33 = point2.equals((java.lang.Object) point18);
        java.lang.Double double34 = point2.x;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.y;
        java.lang.Double double40 = point37.x;
        java.lang.Double double41 = point37.y;
        point37.y = 0.0d;
        Line line44 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        point7.x = 10.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point7);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        point20.y = 10.0d;
        boolean boolean26 = point7.equals((java.lang.Object) point20);
        java.lang.Double double27 = point7.x;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.y;
        point30.y = (-1.0d);
        boolean boolean36 = point7.equals((java.lang.Object) (-1.0d));
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.y;
        point39.y = 0.0d;
        point39.y = 1.0d;
        point39.y = 1.0d;
        boolean boolean50 = point7.equals((java.lang.Object) point39);
        java.lang.Double double51 = point39.x;
        Point point54 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double55 = point54.y;
        java.lang.Double double56 = point54.y;
        java.lang.Double double57 = point54.x;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point60.y = 10.0d;
        java.lang.Double double63 = point60.x;
        java.lang.Double double64 = point60.x;
        java.lang.Double double65 = point60.x;
        Point point68 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        point68.y = 1.0d;
        java.lang.Double double72 = point68.y;
        java.lang.Object obj73 = new java.lang.Object();
        boolean boolean74 = point68.equals(obj73);
        java.lang.Double double75 = point68.y;
        java.lang.Class<?> wildcardClass76 = point68.getClass();
        boolean boolean77 = point60.equals((java.lang.Object) wildcardClass76);
        boolean boolean78 = point54.equals((java.lang.Object) point60);
        point54.y = 10.0d;
        java.lang.Double double81 = point54.y;
        java.lang.Double double82 = point54.y;
        point54.x = 100.0d;
        Line line85 = new Line(point39, point54);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.x = 1.0d;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        point11.y = 0.0d;
        java.lang.Double double21 = point11.x;
        point11.x = (-1.0d);
        Line line24 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double10 = point9.y;
        java.lang.Double double11 = point9.y;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        point2.y = 100.0d;
        java.lang.Double double15 = point2.y;
        point2.x = 0.0d;
        java.lang.Double double18 = point2.y;
        java.lang.Double double19 = point2.y;
        java.lang.Double double20 = point2.x;
        Point point23 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double24 = point23.x;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        java.lang.Class<?> wildcardClass29 = point27.getClass();
        boolean boolean30 = point23.equals((java.lang.Object) wildcardClass29);
        point23.x = 0.0d;
        point23.y = 0.0d;
        java.lang.Double double35 = point23.y;
        Line line36 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        point9.y = (-1.0d);
        point9.y = 100.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass19 = point18.getClass();
        boolean boolean20 = point9.equals((java.lang.Object) point18);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 100.0d;
        point23.x = 10.0d;
        java.lang.Double double31 = point23.y;
        point23.y = 0.0d;
        Point point36 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.y;
        point36.y = 100.0d;
        boolean boolean40 = point23.equals((java.lang.Object) point36);
        point36.y = 1.0d;
        java.lang.Double double43 = point36.x;
        java.lang.Double double44 = point36.x;
        point36.y = 0.0d;
        java.lang.Class<?> wildcardClass47 = point36.getClass();
        boolean boolean48 = point9.equals((java.lang.Object) wildcardClass47);
        point9.x = 100.0d;
        Line line51 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.x = 1.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.x;
        point19.x = 1.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        point28.x = 1.0d;
        boolean boolean38 = point19.equals((java.lang.Object) point28);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point41.y = 10.0d;
        point41.y = 10.0d;
        boolean boolean46 = point28.equals((java.lang.Object) point41);
        boolean boolean47 = point2.equals((java.lang.Object) boolean46);
        point2.y = 0.0d;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point52.x = 0.0d;
        java.lang.Double double55 = point52.x;
        java.lang.Double double56 = point52.y;
        point52.x = 100.0d;
        boolean boolean59 = point2.equals((java.lang.Object) point52);
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point62.y = (-1.0d);
        java.lang.Double double65 = point62.x;
        point62.x = (-1.0d);
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double71 = point70.y;
        java.lang.Double double72 = point70.x;
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean77 = point75.equals((java.lang.Object) true);
        boolean boolean78 = point70.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass79 = point70.getClass();
        boolean boolean80 = point62.equals((java.lang.Object) wildcardClass79);
        Point point83 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double84 = point83.y;
        point83.y = 1.0d;
        point83.x = 1.0d;
        java.lang.Object obj89 = null;
        boolean boolean90 = point83.equals(obj89);
        point83.x = 1.0d;
        point83.x = (-1.0d);
        java.lang.Double double95 = point83.x;
        boolean boolean96 = point62.equals((java.lang.Object) point83);
        Line line97 = new Line(point2, point83);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = 100.0d;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        java.lang.Double double21 = point19.y;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point14.equals((java.lang.Object) point19);
        java.lang.Double double25 = point14.y;
        point14.y = 100.0d;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        point30.y = (-1.0d);
        java.lang.Double double35 = point30.x;
        point30.y = 1.0d;
        java.lang.Double double38 = point30.x;
        boolean boolean39 = point14.equals((java.lang.Object) point30);
        java.lang.Double double40 = point14.y;
        boolean boolean41 = point2.equals((java.lang.Object) point14);
        point2.x = 10.0d;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.x;
        boolean boolean53 = point50.equals((java.lang.Object) 10.0f);
        point50.x = 100.0d;
        java.lang.Double double56 = point50.x;
        point50.y = 1.0d;
        point50.y = 1.0d;
        boolean boolean61 = point46.equals((java.lang.Object) point50);
        point50.y = 10.0d;
        Point point66 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double67 = point66.y;
        java.lang.Double double68 = point66.x;
        java.lang.Double double69 = point66.x;
        point66.y = 0.0d;
        boolean boolean73 = point66.equals((java.lang.Object) '#');
        boolean boolean74 = point50.equals((java.lang.Object) point66);
        Point point77 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point80 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double81 = point80.y;
        boolean boolean83 = point80.equals((java.lang.Object) 1L);
        java.lang.Double double84 = point80.y;
        boolean boolean85 = point77.equals((java.lang.Object) double84);
        java.lang.Double double86 = point77.y;
        java.lang.Double double87 = point77.x;
        point77.x = 100.0d;
        point77.y = 0.0d;
        boolean boolean92 = point66.equals((java.lang.Object) 0.0d);
        Line line93 = new Line(point2, point66);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        point2.x = 100.0d;
        point2.y = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.x;
        boolean boolean16 = point13.equals((java.lang.Object) 10.0f);
        point13.x = 100.0d;
        java.lang.Double double19 = point13.y;
        boolean boolean20 = point2.equals((java.lang.Object) point13);
        point2.y = 100.0d;
        java.lang.Double double23 = point2.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point26.x = 1.0d;
        point26.y = 1.0d;
        java.lang.Double double31 = point26.x;
        point26.x = (-1.0d);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        point36.x = 100.0d;
        point36.x = 10.0d;
        java.lang.Double double44 = point36.y;
        boolean boolean45 = point26.equals((java.lang.Object) double44);
        point26.y = (-1.0d);
        java.lang.Double double48 = point26.x;
        java.lang.Double double49 = point26.x;
        point26.x = 0.0d;
        Line line52 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.y = 10.0d;
        java.lang.Double double15 = point2.y;
        point2.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point20.y = 10.0d;
        java.lang.Double double23 = point20.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        boolean boolean29 = point26.equals((java.lang.Object) 1L);
        java.lang.Double double30 = point26.y;
        point26.y = 100.0d;
        point26.x = 10.0d;
        java.lang.Double double35 = point26.x;
        boolean boolean36 = point20.equals((java.lang.Object) point26);
        java.lang.Double double37 = point20.y;
        point20.y = 0.0d;
        Line line40 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.y;
        boolean boolean15 = point9.equals((java.lang.Object) point12);
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        boolean boolean21 = point12.equals((java.lang.Object) double20);
        Point point24 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        java.lang.Double double27 = point24.x;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point30.y = 0.0d;
        java.lang.Double double33 = point30.y;
        point30.x = 100.0d;
        point30.x = 100.0d;
        java.lang.Double double38 = point30.y;
        boolean boolean39 = point24.equals((java.lang.Object) point30);
        java.lang.Double double40 = point30.x;
        boolean boolean41 = point12.equals((java.lang.Object) point30);
        point12.y = 0.0d;
        point12.y = 10.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        boolean boolean51 = point48.equals((java.lang.Object) 1L);
        java.lang.Double double52 = point48.y;
        java.lang.Double double53 = point48.y;
        point48.y = 0.0d;
        boolean boolean56 = point12.equals((java.lang.Object) point48);
        point48.y = (-1.0d);
        java.lang.Double double59 = point48.x;
        Line line60 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.x = 0.0d;
        point2.x = 100.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.x;
        Point point21 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.y;
        boolean boolean24 = point14.equals((java.lang.Object) point21);
        point14.y = 100.0d;
        java.lang.Double double27 = point14.y;
        point14.x = 0.0d;
        java.lang.Double double30 = point14.y;
        java.lang.Double double31 = point14.y;
        Line line32 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        point17.y = 10.0d;
        boolean boolean21 = point14.equals((java.lang.Object) point17);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass25 = point24.getClass();
        boolean boolean26 = point17.equals((java.lang.Object) wildcardClass25);
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        boolean boolean32 = point17.equals((java.lang.Object) point29);
        boolean boolean33 = point2.equals((java.lang.Object) point17);
        java.lang.Double double34 = point2.x;
        java.lang.Double double35 = point2.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        point38.y = 10.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point48.x = 0.0d;
        point48.y = 1.0d;
        java.lang.Double double53 = point48.x;
        java.lang.Double double54 = point48.x;
        boolean boolean55 = point38.equals((java.lang.Object) point48);
        boolean boolean56 = point2.equals((java.lang.Object) point48);
        point2.x = (-1.0d);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        java.lang.Double double65 = point61.y;
        java.lang.Object obj66 = new java.lang.Object();
        boolean boolean67 = point61.equals(obj66);
        java.lang.Double double68 = point61.y;
        point61.x = 1.0d;
        java.lang.Double double71 = point61.y;
        point61.y = 0.0d;
        point61.x = 0.0d;
        point61.y = (-1.0d);
        Line line78 = new Line(point2, point61);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point9.x = 0.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        java.lang.Double double13 = point9.y;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        java.lang.Double double19 = point16.x;
        point16.x = 0.0d;
        point16.y = 100.0d;
        java.lang.Double double24 = point16.y;
        point16.y = 100.0d;
        Line line27 = new Line(point9, point16);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj16 = null;
        boolean boolean17 = point15.equals(obj16);
        boolean boolean18 = point2.equals((java.lang.Object) point15);
        point2.x = 100.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        boolean boolean29 = point23.equals((java.lang.Object) point26);
        java.lang.Double double30 = point26.x;
        boolean boolean31 = point2.equals((java.lang.Object) point26);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        java.lang.Double double41 = point37.y;
        boolean boolean42 = point34.equals((java.lang.Object) double41);
        point34.x = 10.0d;
        java.lang.Double double45 = point34.x;
        point34.y = 0.0d;
        java.lang.Double double48 = point34.x;
        point34.x = 100.0d;
        point34.y = 0.0d;
        point34.y = (-1.0d);
        Line line55 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.y = 0.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point14);
        point14.x = 1.0d;
        java.lang.Double double23 = point14.y;
        java.lang.Double double24 = point14.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.y;
        boolean boolean33 = point27.equals((java.lang.Object) point30);
        java.lang.Double double34 = point27.y;
        point27.y = 0.0d;
        boolean boolean37 = point14.equals((java.lang.Object) 0.0d);
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point40.x = 0.0d;
        point40.y = 1.0d;
        java.lang.Double double45 = point40.x;
        point40.x = 0.0d;
        Line line48 = new Line(point14, point40);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point18.equals((java.lang.Object) 1.0d);
        java.lang.Double double27 = point18.y;
        point18.x = 0.0d;
        boolean boolean30 = point2.equals((java.lang.Object) 0.0d);
        point2.x = 100.0d;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        point35.y = 10.0d;
        java.lang.Double double42 = point35.y;
        point35.x = 0.0d;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.x;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        point51.y = (-1.0d);
        boolean boolean56 = point47.equals((java.lang.Object) point51);
        boolean boolean57 = point35.equals((java.lang.Object) point51);
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point60.y = 0.0d;
        java.lang.Double double63 = point60.y;
        java.lang.Double double64 = point60.x;
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point70.x = 1.0d;
        point70.y = 1.0d;
        boolean boolean75 = point67.equals((java.lang.Object) 1.0d);
        java.lang.Double double76 = point67.y;
        java.lang.Double double77 = point67.y;
        java.lang.Double double78 = point67.x;
        java.lang.Double double79 = point67.y;
        boolean boolean80 = point60.equals((java.lang.Object) double79);
        boolean boolean81 = point35.equals((java.lang.Object) double79);
        java.lang.Double double82 = point35.x;
        point35.y = 0.0d;
        java.lang.Object obj85 = null;
        boolean boolean86 = point35.equals(obj85);
        Line line87 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.x;
        java.lang.Double double17 = point15.y;
        java.lang.Double double18 = point15.y;
        point15.y = (-1.0d);
        point15.x = 0.0d;
        point15.y = 10.0d;
        java.lang.Double double25 = point15.y;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 10.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.x;
        boolean boolean40 = point37.equals((java.lang.Object) 10.0f);
        point37.x = 100.0d;
        java.lang.Double double43 = point37.x;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point46.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        java.lang.Double double50 = point37.y;
        point37.y = 100.0d;
        boolean boolean53 = point28.equals((java.lang.Object) point37);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        point56.y = 1.0d;
        point56.x = 0.0d;
        boolean boolean63 = point56.equals((java.lang.Object) "");
        boolean boolean64 = point37.equals((java.lang.Object) point56);
        boolean boolean65 = point15.equals((java.lang.Object) point56);
        Point point68 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point68.y = 1.0d;
        point68.y = (-1.0d);
        point68.x = 0.0d;
        point68.x = 1.0d;
        boolean boolean77 = point15.equals((java.lang.Object) 1.0d);
        Line line78 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        boolean boolean19 = point16.equals((java.lang.Object) 1L);
        java.lang.Double double20 = point16.y;
        boolean boolean21 = point13.equals((java.lang.Object) double20);
        java.lang.Double double22 = point13.y;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        boolean boolean32 = point25.equals((java.lang.Object) point28);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass36 = point35.getClass();
        boolean boolean37 = point28.equals((java.lang.Object) wildcardClass36);
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point40.x = 1.0d;
        boolean boolean43 = point28.equals((java.lang.Object) point40);
        boolean boolean44 = point13.equals((java.lang.Object) point28);
        boolean boolean45 = point2.equals((java.lang.Object) point13);
        java.lang.Double double46 = point13.x;
        java.lang.Double double47 = point13.y;
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.x;
        java.lang.Double double52 = point50.y;
        point50.y = (-1.0d);
        java.lang.Double double55 = point50.y;
        Line line56 = new Line(point13, point50);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point13.y = 100.0d;
        java.lang.Object obj16 = null;
        boolean boolean17 = point13.equals(obj16);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        java.lang.Double double23 = point20.x;
        point20.y = 0.0d;
        boolean boolean27 = point20.equals((java.lang.Object) '#');
        point20.x = 0.0d;
        point20.y = 100.0d;
        boolean boolean32 = point13.equals((java.lang.Object) point20);
        point20.x = 100.0d;
        point20.y = 1.0d;
        Line line37 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        java.lang.Double double17 = point13.y;
        point13.y = 100.0d;
        point13.y = (-1.0d);
        boolean boolean22 = point2.equals((java.lang.Object) point13);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        java.lang.Double double30 = point25.y;
        java.lang.Double double31 = point25.y;
        point25.y = 1.0d;
        point25.y = 100.0d;
        point25.x = 1.0d;
        point25.y = 10.0d;
        java.lang.Double double40 = point25.y;
        point25.y = 0.0d;
        boolean boolean43 = point2.equals((java.lang.Object) 0.0d);
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        point46.y = (-1.0d);
        java.lang.Double double51 = point46.y;
        java.lang.Double double52 = point46.y;
        point46.y = 1.0d;
        point46.y = 100.0d;
        Point point59 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj60 = null;
        boolean boolean61 = point59.equals(obj60);
        boolean boolean62 = point46.equals((java.lang.Object) point59);
        point46.x = 100.0d;
        java.lang.Double double65 = point46.y;
        boolean boolean66 = point2.equals((java.lang.Object) double65);
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.y;
        point69.y = 1.0d;
        point69.x = 100.0d;
        point69.y = 10.0d;
        point69.y = 10.0d;
        point69.x = 0.0d;
        java.lang.Double double81 = point69.x;
        Line line82 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        point2.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 1.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point16.equals(obj22);
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point26.y = 0.0d;
        java.lang.Double double29 = point26.y;
        java.lang.Double double30 = point26.x;
        point26.x = 1.0d;
        boolean boolean33 = point16.equals((java.lang.Object) 1.0d);
        java.lang.Double double34 = point16.y;
        java.lang.Double double35 = point16.x;
        java.lang.Double double36 = point16.x;
        point16.y = 10.0d;
        point16.y = 100.0d;
        point16.x = 10.0d;
        point16.x = 100.0d;
        point16.y = 0.0d;
        point16.y = (-1.0d);
        Line line49 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        boolean boolean13 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double23 = point19.y;
        point19.y = (-1.0d);
        point19.y = 100.0d;
        java.lang.Double double28 = point19.y;
        boolean boolean29 = point2.equals((java.lang.Object) point19);
        point2.y = 0.0d;
        java.lang.Double double32 = point2.x;
        point2.x = 10.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point37.y = 100.0d;
        point37.y = 10.0d;
        Line line42 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.y;
        point2.x = 100.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double22 = point21.x;
        java.lang.Double double23 = point21.y;
        point21.y = 1.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        java.lang.Double double33 = point28.y;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 0.0d);
        java.lang.Double double40 = point36.y;
        point36.x = 0.0d;
        boolean boolean43 = point28.equals((java.lang.Object) point36);
        java.lang.Double double44 = point28.x;
        boolean boolean45 = point21.equals((java.lang.Object) double44);
        Line line46 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        java.lang.Double double18 = point14.y;
        boolean boolean19 = point11.equals((java.lang.Object) double18);
        point11.x = 10.0d;
        java.lang.Double double22 = point11.x;
        boolean boolean23 = point2.equals((java.lang.Object) point11);
        point11.x = 10.0d;
        java.lang.Double double26 = point11.y;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 100.0d;
        point29.y = (-1.0d);
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        java.lang.Double double40 = point37.y;
        java.lang.Double double41 = point37.y;
        point37.y = 10.0d;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.x;
        boolean boolean49 = point46.equals((java.lang.Object) 10.0f);
        point46.x = 100.0d;
        java.lang.Double double52 = point46.x;
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point55.x = 100.0d;
        boolean boolean58 = point46.equals((java.lang.Object) 100.0d);
        java.lang.Double double59 = point46.y;
        point46.y = 100.0d;
        boolean boolean62 = point37.equals((java.lang.Object) point46);
        boolean boolean63 = point29.equals((java.lang.Object) boolean62);
        java.lang.Double double64 = point29.y;
        Line line65 = new Line(point11, point29);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double9 = point8.y;
        boolean boolean11 = point8.equals((java.lang.Object) 0.0d);
        boolean boolean12 = point2.equals((java.lang.Object) point8);
        point2.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point17.x = 100.0d;
        point17.x = 10.0d;
        point17.y = 10.0d;
        Line line24 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        point11.y = (-1.0d);
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        java.lang.Double double19 = point11.x;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        Point point32 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point23.equals((java.lang.Object) point32);
        boolean boolean36 = point11.equals((java.lang.Object) boolean35);
        point11.y = 100.0d;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        boolean boolean47 = point44.equals((java.lang.Object) 1L);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.x;
        boolean boolean53 = point50.equals((java.lang.Object) 10.0f);
        point50.x = 100.0d;
        boolean boolean56 = point44.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass57 = point44.getClass();
        boolean boolean58 = point41.equals((java.lang.Object) wildcardClass57);
        java.lang.Double double59 = point41.y;
        Line line60 = new Line(point11, point41);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 10.0d;
        java.lang.Double double22 = point15.y;
        point15.x = 10.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        point27.y = 1.0d;
        java.lang.Double double32 = point27.x;
        point27.x = (-1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        boolean boolean46 = point27.equals((java.lang.Object) double45);
        point27.y = (-1.0d);
        java.lang.Double double49 = point27.x;
        point27.y = 1.0d;
        boolean boolean52 = point15.equals((java.lang.Object) 1.0d);
        boolean boolean53 = point2.equals((java.lang.Object) point15);
        point2.y = 0.0d;
        Point point58 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double59 = point58.x;
        java.lang.Double double60 = point58.y;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point63.x = 1.0d;
        point63.y = 1.0d;
        boolean boolean68 = point58.equals((java.lang.Object) point63);
        point63.y = 100.0d;
        point63.x = 0.0d;
        point63.y = 0.0d;
        java.lang.Double double75 = point63.x;
        Line line76 = new Line(point2, point63);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        java.lang.Double double22 = point2.y;
        java.lang.Double double23 = point2.x;
        java.lang.Double double24 = point2.y;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.y;
        point27.x = 100.0d;
        point27.x = 0.0d;
        point27.x = 1.0d;
        java.lang.Double double37 = point27.y;
        java.lang.Double double38 = point27.y;
        Line line39 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        point13.y = 10.0d;
        point13.y = (-1.0d);
        java.lang.Class<?> wildcardClass19 = point13.getClass();
        boolean boolean20 = point2.equals((java.lang.Object) wildcardClass19);
        java.lang.Double double21 = point2.y;
        point2.x = 1.0d;
        point2.x = 100.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 10.0d;
        java.lang.Double double35 = point28.y;
        point28.x = 10.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point40.x = 1.0d;
        point40.y = 1.0d;
        java.lang.Double double45 = point40.x;
        point40.x = (-1.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        point50.x = 10.0d;
        java.lang.Double double58 = point50.y;
        boolean boolean59 = point40.equals((java.lang.Object) double58);
        point40.y = (-1.0d);
        java.lang.Double double62 = point40.x;
        point40.y = 1.0d;
        boolean boolean65 = point28.equals((java.lang.Object) 1.0d);
        point28.x = 10.0d;
        point28.y = (-1.0d);
        boolean boolean70 = point2.equals((java.lang.Object) (-1.0d));
        Point point73 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        boolean boolean79 = point76.equals((java.lang.Object) 1L);
        java.lang.Double double80 = point76.y;
        boolean boolean81 = point73.equals((java.lang.Object) double80);
        java.lang.Double double82 = point73.y;
        java.lang.Double double83 = point73.x;
        Point point86 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point89 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double90 = point89.y;
        boolean boolean92 = point89.equals((java.lang.Object) 1L);
        java.lang.Double double93 = point89.y;
        boolean boolean94 = point86.equals((java.lang.Object) double93);
        java.lang.Double double95 = point86.y;
        boolean boolean96 = point73.equals((java.lang.Object) point86);
        java.lang.Double double97 = point86.y;
        java.lang.Double double98 = point86.x;
        Line line99 = new Line(point2, point86);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point7.x = 0.0d;
        point7.y = 1.0d;
        java.lang.Double double12 = point7.x;
        point7.x = 0.0d;
        java.lang.Double double15 = point7.y;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        point19.y = 10.0d;
        point19.y = (-1.0d);
        java.lang.Double double25 = point19.y;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        boolean boolean31 = point28.equals((java.lang.Object) 1L);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        boolean boolean40 = point28.equals((java.lang.Object) 100.0d);
        boolean boolean41 = point19.equals((java.lang.Object) 100.0d);
        java.lang.Double double42 = point19.x;
        java.lang.Double double43 = point19.y;
        java.lang.Double double44 = point19.y;
        Line line45 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.x = 1.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.x;
        point19.x = 1.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        point28.x = 1.0d;
        boolean boolean38 = point19.equals((java.lang.Object) point28);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point41.y = 10.0d;
        point41.y = 10.0d;
        boolean boolean46 = point28.equals((java.lang.Object) point41);
        boolean boolean47 = point2.equals((java.lang.Object) boolean46);
        point2.y = 0.0d;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point52.x = 0.0d;
        java.lang.Double double55 = point52.x;
        java.lang.Double double56 = point52.y;
        point52.x = 100.0d;
        boolean boolean59 = point2.equals((java.lang.Object) point52);
        point52.x = 0.0d;
        Point point64 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double65 = point64.x;
        Point point68 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double69 = point68.y;
        java.lang.Class<?> wildcardClass70 = point68.getClass();
        boolean boolean71 = point64.equals((java.lang.Object) wildcardClass70);
        java.lang.Double double72 = point64.x;
        java.lang.Double double73 = point64.y;
        Line line74 = new Line(point52, point64);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 100.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Double double20 = point14.y;
        point14.y = 1.0d;
        point14.y = 1.0d;
        point14.x = 100.0d;
        java.lang.Double double27 = point14.y;
        boolean boolean28 = point2.equals((java.lang.Object) double27);
        point2.x = (-1.0d);
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point36.x = 1.0d;
        point36.y = 1.0d;
        boolean boolean41 = point33.equals((java.lang.Object) 1.0d);
        java.lang.Double double42 = point33.y;
        java.lang.Double double43 = point33.x;
        point33.x = 10.0d;
        java.lang.Double double46 = point33.y;
        point33.y = 10.0d;
        boolean boolean49 = point2.equals((java.lang.Object) point33);
        Point point50 = null;
        Line line51 = new Line(point33, point50);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.y;
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        boolean boolean19 = point2.equals((java.lang.Object) point12);
        java.lang.Double double20 = point2.y;
        java.lang.Double double21 = point2.y;
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point27.y = (-1.0d);
        java.lang.Double double30 = point27.x;
        point27.x = (-1.0d);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        java.lang.Double double37 = point35.x;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean42 = point40.equals((java.lang.Object) true);
        boolean boolean43 = point35.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass44 = point35.getClass();
        boolean boolean45 = point27.equals((java.lang.Object) wildcardClass44);
        java.lang.Class<?> wildcardClass46 = point27.getClass();
        boolean boolean47 = point24.equals((java.lang.Object) wildcardClass46);
        Line line48 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.y;
        point16.y = (-1.0d);
        point16.y = 0.0d;
        point16.x = (-1.0d);
        boolean boolean25 = point2.equals((java.lang.Object) point16);
        point2.x = 10.0d;
        java.lang.Double double28 = point2.y;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 1.0d;
        point31.y = (-1.0d);
        java.lang.Double double36 = point31.y;
        java.lang.Double double37 = point31.y;
        point31.y = 1.0d;
        point31.y = 100.0d;
        point31.x = 1.0d;
        point31.y = 10.0d;
        Line line46 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double12 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.x;
        java.lang.Double double22 = point19.x;
        point19.y = 0.0d;
        boolean boolean26 = point19.equals((java.lang.Object) '#');
        point19.x = 0.0d;
        point19.y = 100.0d;
        point19.x = 10.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.y;
        boolean boolean41 = point35.equals((java.lang.Object) point38);
        point35.x = 10.0d;
        boolean boolean44 = point19.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass45 = point19.getClass();
        boolean boolean46 = point2.equals((java.lang.Object) wildcardClass45);
        point2.x = 100.0d;
        Point point51 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.y;
        java.lang.Double double54 = point51.x;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point57.y = 10.0d;
        java.lang.Double double60 = point57.x;
        java.lang.Double double61 = point57.x;
        java.lang.Double double62 = point57.x;
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        point65.y = 1.0d;
        java.lang.Double double69 = point65.y;
        java.lang.Object obj70 = new java.lang.Object();
        boolean boolean71 = point65.equals(obj70);
        java.lang.Double double72 = point65.y;
        java.lang.Class<?> wildcardClass73 = point65.getClass();
        boolean boolean74 = point57.equals((java.lang.Object) wildcardClass73);
        boolean boolean75 = point51.equals((java.lang.Object) point57);
        point51.y = 10.0d;
        java.lang.Double double78 = point51.y;
        java.lang.Double double79 = point51.y;
        point51.x = 100.0d;
        Line line82 = new Line(point2, point51);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = 1.0d;
        point2.y = 10.0d;
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean27 = point25.equals((java.lang.Object) true);
        boolean boolean28 = point20.equals((java.lang.Object) true);
        boolean boolean29 = point2.equals((java.lang.Object) true);
        java.lang.Double double30 = point2.y;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        java.lang.Double double40 = point36.y;
        boolean boolean41 = point33.equals((java.lang.Object) double40);
        point33.x = 10.0d;
        java.lang.Double double44 = point33.x;
        point33.y = (-1.0d);
        java.lang.Double double47 = point33.y;
        java.lang.Double double48 = point33.y;
        Line line49 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        boolean boolean13 = point2.equals((java.lang.Object) false);
        java.lang.Double double14 = point2.x;
        java.lang.Double double15 = point2.x;
        java.lang.Double double16 = point2.y;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.x;
        boolean boolean22 = point19.equals((java.lang.Object) 10.0f);
        point19.x = 100.0d;
        java.lang.Double double25 = point19.x;
        point19.y = 1.0d;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        point30.y = (-1.0d);
        java.lang.Class<?> wildcardClass36 = point30.getClass();
        boolean boolean37 = point19.equals((java.lang.Object) wildcardClass36);
        java.lang.Double double38 = point19.y;
        point19.y = 100.0d;
        boolean boolean41 = point2.equals((java.lang.Object) point19);
        point19.x = 0.0d;
        java.lang.Double double44 = point19.x;
        java.lang.Double double45 = point19.y;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.x;
        java.lang.Double double51 = point48.x;
        point48.y = 0.0d;
        boolean boolean55 = point48.equals((java.lang.Object) '#');
        point48.y = 100.0d;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 100.0d;
        java.lang.Double double66 = point60.y;
        point60.y = 100.0d;
        point60.x = (-1.0d);
        java.lang.Double double71 = point60.x;
        point60.y = 0.0d;
        boolean boolean74 = point48.equals((java.lang.Object) 0.0d);
        point48.y = (-1.0d);
        Line line77 = new Line(point19, point48);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.x = (-1.0d);
        java.lang.Double double18 = point2.x;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.x = 1.0d;
        Line line24 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        point7.x = 10.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point7);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        point20.y = 10.0d;
        boolean boolean26 = point7.equals((java.lang.Object) point20);
        point20.y = 10.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.y = 10.0d;
        boolean boolean38 = point31.equals((java.lang.Object) point34);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.x;
        boolean boolean50 = point47.equals((java.lang.Object) 10.0f);
        point47.x = 100.0d;
        boolean boolean53 = point41.equals((java.lang.Object) 100.0d);
        boolean boolean54 = point34.equals((java.lang.Object) boolean53);
        java.lang.Double double55 = point34.x;
        point34.y = (-1.0d);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        java.lang.Double double64 = point60.y;
        java.lang.Object obj65 = new java.lang.Object();
        boolean boolean66 = point60.equals(obj65);
        java.lang.Double double67 = point60.y;
        point60.x = (-1.0d);
        point60.y = 0.0d;
        point60.x = 1.0d;
        boolean boolean74 = point34.equals((java.lang.Object) 1.0d);
        java.lang.Double double75 = point34.y;
        java.lang.Double double76 = point34.y;
        java.lang.Double double77 = point34.x;
        boolean boolean78 = point20.equals((java.lang.Object) point34);
        java.lang.Double double79 = point34.y;
        java.lang.Double double80 = point34.y;
        Point point83 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double84 = point83.y;
        point83.y = 1.0d;
        point83.x = 100.0d;
        point83.y = 10.0d;
        point83.y = 10.0d;
        Line line93 = new Line(point34, point83);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = (-1.0d);
        point2.y = 10.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        java.lang.Double double30 = point28.x;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean35 = point33.equals((java.lang.Object) true);
        boolean boolean36 = point28.equals((java.lang.Object) true);
        java.lang.Double double37 = point28.y;
        java.lang.Double double38 = point28.y;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        java.lang.Double double44 = point41.y;
        java.lang.Double double45 = point41.y;
        point41.y = 10.0d;
        java.lang.Double double48 = point41.y;
        point41.x = 10.0d;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point53.x = 1.0d;
        point53.y = 1.0d;
        java.lang.Double double58 = point53.x;
        point53.x = (-1.0d);
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        point63.y = 1.0d;
        point63.x = 100.0d;
        point63.x = 10.0d;
        java.lang.Double double71 = point63.y;
        boolean boolean72 = point53.equals((java.lang.Object) double71);
        point53.y = (-1.0d);
        java.lang.Double double75 = point53.x;
        point53.y = 1.0d;
        boolean boolean78 = point41.equals((java.lang.Object) 1.0d);
        boolean boolean79 = point28.equals((java.lang.Object) point41);
        Line line80 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        boolean boolean17 = point5.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = point5.getClass();
        boolean boolean19 = point2.equals((java.lang.Object) wildcardClass18);
        point2.y = 100.0d;
        java.lang.Double double22 = point2.y;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point28.x = 1.0d;
        point28.y = 1.0d;
        boolean boolean33 = point25.equals((java.lang.Object) 1.0d);
        java.lang.Double double34 = point25.y;
        java.lang.Double double35 = point25.x;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point38.y = 0.0d;
        java.lang.Double double41 = point38.y;
        java.lang.Double double42 = point38.x;
        boolean boolean43 = point25.equals((java.lang.Object) point38);
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point46.x = 100.0d;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 1.0d;
        java.lang.Double double57 = point51.y;
        java.lang.Double double58 = point51.y;
        point51.x = 10.0d;
        boolean boolean61 = point46.equals((java.lang.Object) point51);
        java.lang.Double double62 = point51.y;
        java.lang.Double double63 = point51.x;
        boolean boolean64 = point25.equals((java.lang.Object) double63);
        java.lang.Double double65 = point25.y;
        Line line66 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.y = 100.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        point9.y = (-1.0d);
        java.lang.Double double14 = point9.y;
        java.lang.Double double15 = point9.y;
        point9.y = 1.0d;
        point9.y = 100.0d;
        Line line20 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        point11.y = (-1.0d);
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        java.lang.Double double19 = point11.x;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        Point point32 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point23.equals((java.lang.Object) point32);
        boolean boolean36 = point11.equals((java.lang.Object) boolean35);
        java.lang.Double double37 = point11.y;
        java.lang.Double double38 = point11.x;
        Point point41 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.x;
        java.lang.Double double43 = point41.y;
        point41.y = (-1.0d);
        point41.y = 0.0d;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 1.0d;
        point50.y = (-1.0d);
        java.lang.Double double55 = point50.y;
        java.lang.Double double56 = point50.y;
        point50.y = 1.0d;
        point50.y = 100.0d;
        point50.x = 1.0d;
        point50.y = (-1.0d);
        boolean boolean65 = point41.equals((java.lang.Object) point50);
        point50.y = 100.0d;
        Line line68 = new Line(point11, point50);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.y;
        java.lang.Double double15 = point12.x;
        point12.y = 100.0d;
        java.lang.Double double18 = point12.x;
        java.lang.Double double19 = point12.x;
        Line line20 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        java.lang.Double double10 = point6.y;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = point6.equals(obj11);
        java.lang.Double double13 = point6.y;
        java.lang.Class<?> wildcardClass14 = point6.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) point6);
        java.lang.Double double16 = point2.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.x;
        java.lang.Double double26 = point24.y;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.y;
        boolean boolean29 = point19.equals((java.lang.Object) point24);
        java.lang.Class<?> wildcardClass30 = point24.getClass();
        boolean boolean31 = point2.equals((java.lang.Object) point24);
        java.lang.Double double32 = point2.x;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        point35.y = (-1.0d);
        java.lang.Double double40 = point35.y;
        java.lang.Double double41 = point35.y;
        Point point44 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double45 = point44.y;
        java.lang.Double double46 = point44.y;
        boolean boolean47 = point35.equals((java.lang.Object) point44);
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point50.y = 0.0d;
        java.lang.Double double53 = point50.y;
        boolean boolean54 = point44.equals((java.lang.Object) point50);
        java.lang.Double double55 = point44.x;
        java.lang.Double double56 = point44.x;
        java.lang.Double double57 = point44.x;
        Line line58 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double16 = point2.x;
        point2.y = 1.0d;
        point2.x = 1.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point23.x = 1.0d;
        point23.y = 1.0d;
        java.lang.Double double28 = point23.x;
        java.lang.Double double29 = point23.y;
        point23.y = 1.0d;
        point23.y = 100.0d;
        point23.y = 10.0d;
        point23.x = 100.0d;
        Line line38 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        boolean boolean13 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double23 = point19.y;
        point19.y = (-1.0d);
        point19.y = 100.0d;
        java.lang.Double double28 = point19.y;
        boolean boolean29 = point2.equals((java.lang.Object) point19);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point32.y = 100.0d;
        point32.y = 10.0d;
        java.lang.Double double37 = point32.y;
        java.lang.Double double38 = point32.y;
        point32.x = (-1.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        java.lang.Double double49 = point43.x;
        point43.y = 1.0d;
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double55 = point54.y;
        point54.y = 10.0d;
        point54.y = (-1.0d);
        java.lang.Class<?> wildcardClass60 = point54.getClass();
        boolean boolean61 = point43.equals((java.lang.Object) wildcardClass60);
        java.lang.Double double62 = point43.y;
        java.lang.Double double63 = point43.x;
        boolean boolean64 = point32.equals((java.lang.Object) point43);
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point67.x = 1.0d;
        point67.y = 1.0d;
        point67.y = (-1.0d);
        point67.y = 10.0d;
        point67.y = 1.0d;
        java.lang.Double double78 = point67.x;
        java.lang.Double double79 = point67.x;
        java.lang.Class<?> wildcardClass80 = point67.getClass();
        boolean boolean81 = point43.equals((java.lang.Object) point67);
        java.lang.Double double82 = point43.x;
        Point point85 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point85.y = 1.0d;
        point85.y = (-1.0d);
        point85.x = 0.0d;
        java.lang.Double double92 = point85.x;
        boolean boolean93 = point43.equals((java.lang.Object) double92);
        Line line94 = new Line(point19, point43);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        java.lang.Double double15 = point11.y;
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = point11.equals(obj16);
        point11.x = 1.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point23.y = 1.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point28.y = (-1.0d);
        java.lang.Double double31 = point28.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        point34.y = 1.0d;
        boolean boolean43 = point28.equals((java.lang.Object) point34);
        java.lang.Double double44 = point34.x;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        boolean boolean50 = point47.equals((java.lang.Object) 1L);
        java.lang.Double double51 = point47.y;
        java.lang.Double double52 = point47.y;
        boolean boolean53 = point34.equals((java.lang.Object) point47);
        java.lang.Double double54 = point34.x;
        boolean boolean55 = point23.equals((java.lang.Object) point34);
        Line line56 = new Line(point11, point34);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        point7.y = (-1.0d);
        java.lang.Double double12 = point7.y;
        java.lang.Double double13 = point7.y;
        point7.y = 1.0d;
        java.lang.Class<?> wildcardClass16 = point7.getClass();
        boolean boolean17 = point2.equals((java.lang.Object) wildcardClass16);
        java.lang.Double double18 = point2.x;
        point2.x = (-1.0d);
        java.lang.Double double21 = point2.y;
        point2.x = 0.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        java.lang.Double double30 = point26.y;
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = point26.equals(obj31);
        point26.x = 1.0d;
        java.lang.Double double35 = point26.y;
        java.lang.Double double36 = point26.x;
        java.lang.Double double37 = point26.x;
        point26.x = 1.0d;
        boolean boolean40 = point2.equals((java.lang.Object) 1.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 100.0d;
        point43.y = (-1.0d);
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        point53.y = (-1.0d);
        java.lang.Double double58 = point53.x;
        java.lang.Double double59 = point53.x;
        point53.y = 1.0d;
        boolean boolean62 = point43.equals((java.lang.Object) point53);
        point53.y = (-1.0d);
        point53.x = (-1.0d);
        java.lang.Double double67 = point53.x;
        java.lang.Double double68 = point53.x;
        Line line69 = new Line(point2, point53);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        point2.x = (-1.0d);
        point2.x = 1.0d;
        Point point17 = null;
        Line line18 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point15.x = 0.0d;
        point15.y = 1.0d;
        java.lang.Double double20 = point15.x;
        point15.x = 0.0d;
        point15.x = 0.0d;
        java.lang.Double double25 = point15.x;
        point15.x = (-1.0d);
        Line line28 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        java.lang.Double double12 = point9.y;
        java.lang.Double double13 = point9.y;
        point9.y = 10.0d;
        java.lang.Double double16 = point9.y;
        point9.x = 0.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.x;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        boolean boolean30 = point21.equals((java.lang.Object) point25);
        boolean boolean31 = point9.equals((java.lang.Object) point25);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        boolean boolean49 = point41.equals((java.lang.Object) 1.0d);
        java.lang.Double double50 = point41.y;
        java.lang.Double double51 = point41.y;
        java.lang.Double double52 = point41.x;
        java.lang.Double double53 = point41.y;
        boolean boolean54 = point34.equals((java.lang.Object) double53);
        boolean boolean55 = point9.equals((java.lang.Object) double53);
        java.lang.Double double56 = point9.x;
        point9.y = 0.0d;
        boolean boolean59 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double60 = point2.y;
        java.lang.Double double61 = point2.y;
        java.lang.Double double62 = point2.y;
        point2.x = 0.0d;
        Point point65 = null;
        Line line66 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point2.y = 100.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point9.y = 10.0d;
        java.lang.Double double12 = point9.x;
        point9.y = 1.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 100.0d;
        point17.y = 10.0d;
        point17.y = 10.0d;
        point17.x = 0.0d;
        boolean boolean29 = point9.equals((java.lang.Object) point17);
        point17.y = (-1.0d);
        point17.x = 1.0d;
        Line line34 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        point2.x = (-1.0d);
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        point17.y = 100.0d;
        point17.x = 100.0d;
        java.lang.Double double27 = point17.y;
        java.lang.Double double28 = point17.x;
        java.lang.Double double29 = point17.y;
        boolean boolean30 = point2.equals((java.lang.Object) point17);
        Point point31 = null;
        Line line32 = new Line(point17, point31);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        point15.y = 1.0d;
        point15.x = 0.0d;
        java.lang.Double double26 = point15.x;
        point15.y = 10.0d;
        boolean boolean29 = point2.equals((java.lang.Object) point15);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        java.lang.Double double37 = point32.y;
        point32.y = 10.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point42.x = 0.0d;
        point42.y = 1.0d;
        java.lang.Double double47 = point42.x;
        java.lang.Double double48 = point42.x;
        boolean boolean49 = point32.equals((java.lang.Object) point42);
        java.lang.Object obj50 = null;
        boolean boolean51 = point32.equals(obj50);
        Line line52 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point11.x = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 1.0d;
        java.lang.Double double22 = point16.y;
        java.lang.Double double23 = point16.y;
        point16.x = 10.0d;
        boolean boolean26 = point11.equals((java.lang.Object) point16);
        boolean boolean27 = point2.equals((java.lang.Object) point16);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 1.0d;
        boolean boolean37 = point30.equals((java.lang.Object) 'a');
        point30.x = 10.0d;
        boolean boolean40 = point16.equals((java.lang.Object) 10.0d);
        java.lang.Double double41 = point16.y;
        java.lang.Double double42 = point16.x;
        Point point45 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.x;
        java.lang.Double double47 = point45.y;
        point45.y = (-1.0d);
        boolean boolean50 = point16.equals((java.lang.Object) point45);
        java.lang.Double double51 = point45.y;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        java.lang.Double double58 = point54.y;
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = point54.equals(obj59);
        java.lang.Double double61 = point54.y;
        point54.y = 100.0d;
        point54.y = 0.0d;
        boolean boolean66 = point45.equals((java.lang.Object) 0.0d);
        point45.x = 10.0d;
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        point71.y = 1.0d;
        point71.x = 100.0d;
        java.lang.Double double77 = point71.y;
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point80.y = 0.0d;
        java.lang.Double double83 = point80.y;
        java.lang.Double double84 = point80.x;
        boolean boolean85 = point71.equals((java.lang.Object) double84);
        java.lang.Double double86 = point71.y;
        Line line87 = new Line(point45, point71);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point13.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 1.0d;
        java.lang.Double double24 = point18.y;
        java.lang.Double double25 = point18.y;
        point18.x = 10.0d;
        boolean boolean28 = point13.equals((java.lang.Object) point18);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        point31.y = 10.0d;
        boolean boolean37 = point18.equals((java.lang.Object) point31);
        java.lang.Double double38 = point18.x;
        point18.x = (-1.0d);
        boolean boolean41 = point2.equals((java.lang.Object) point18);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        boolean boolean47 = point44.equals((java.lang.Object) 10.0f);
        point44.x = 100.0d;
        java.lang.Double double50 = point44.x;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point53.x = 100.0d;
        boolean boolean56 = point44.equals((java.lang.Object) 100.0d);
        point44.x = 10.0d;
        java.lang.Double double59 = point44.x;
        java.lang.Double double60 = point44.x;
        boolean boolean61 = point18.equals((java.lang.Object) point44);
        java.lang.Double double62 = point18.y;
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point65.y = 1.0d;
        point65.y = (-1.0d);
        java.lang.Double double70 = point65.x;
        java.lang.Double double71 = point65.x;
        point65.x = 0.0d;
        boolean boolean74 = point18.equals((java.lang.Object) point65);
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point77.x = 1.0d;
        point77.y = (-1.0d);
        java.lang.Double double82 = point77.y;
        java.lang.Double double83 = point77.x;
        point77.x = 0.0d;
        Line line86 = new Line(point18, point77);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        point15.y = 100.0d;
        boolean boolean19 = point2.equals((java.lang.Object) point15);
        java.lang.Double double20 = point15.y;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        java.lang.Double double31 = point26.y;
        point26.y = 100.0d;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass37 = point36.getClass();
        boolean boolean38 = point26.equals((java.lang.Object) point36);
        boolean boolean39 = point23.equals((java.lang.Object) point26);
        java.lang.Double double40 = point26.x;
        boolean boolean41 = point15.equals((java.lang.Object) point26);
        point26.x = 100.0d;
        java.lang.Double double44 = point26.y;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean53 = point50.equals((java.lang.Object) 1L);
        java.lang.Double double54 = point50.y;
        boolean boolean55 = point47.equals((java.lang.Object) double54);
        java.lang.Double double56 = point47.y;
        java.lang.Double double57 = point47.x;
        point47.y = 100.0d;
        Point point62 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double63 = point62.x;
        java.lang.Double double64 = point62.y;
        java.lang.Double double65 = point62.y;
        boolean boolean66 = point47.equals((java.lang.Object) double65);
        Line line67 = new Line(point26, point47);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.x;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean19 = point12.equals((java.lang.Object) double18);
        boolean boolean20 = point2.equals((java.lang.Object) point12);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        boolean boolean26 = point23.equals((java.lang.Object) 1L);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.x;
        boolean boolean32 = point29.equals((java.lang.Object) 10.0f);
        point29.x = 100.0d;
        java.lang.Double double35 = point29.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point38.x = 100.0d;
        boolean boolean41 = point29.equals((java.lang.Object) 100.0d);
        point29.x = 10.0d;
        boolean boolean44 = point23.equals((java.lang.Object) point29);
        point23.x = 10.0d;
        java.lang.Double double47 = point23.y;
        boolean boolean48 = point12.equals((java.lang.Object) point23);
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point51.y = 10.0d;
        java.lang.Double double54 = point51.x;
        point51.y = 1.0d;
        Point point59 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double60 = point59.y;
        point59.y = 1.0d;
        point59.x = 100.0d;
        point59.y = 10.0d;
        point59.y = 10.0d;
        point59.x = 0.0d;
        boolean boolean71 = point51.equals((java.lang.Object) point59);
        point51.y = 100.0d;
        java.lang.Double double74 = point51.y;
        point51.y = 100.0d;
        Point point79 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double80 = point79.x;
        java.lang.Double double81 = point79.x;
        Point point84 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double85 = point84.y;
        boolean boolean86 = point79.equals((java.lang.Object) double85);
        java.lang.Object obj87 = null;
        boolean boolean88 = point79.equals(obj87);
        boolean boolean89 = point51.equals((java.lang.Object) point79);
        Line line90 = new Line(point23, point79);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        boolean boolean24 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double25 = point2.x;
        java.lang.Double double26 = point2.y;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        java.lang.Double double36 = point32.y;
        boolean boolean37 = point29.equals((java.lang.Object) double36);
        java.lang.Double double38 = point29.y;
        point29.y = 10.0d;
        boolean boolean41 = point2.equals((java.lang.Object) point29);
        java.lang.Double double42 = point2.y;
        java.lang.Double double43 = point2.x;
        Point point44 = null;
        Line line45 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double16 = point12.y;
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = point12.equals(obj17);
        java.lang.Double double19 = point12.y;
        point12.x = 1.0d;
        java.lang.Double double22 = point12.y;
        point12.x = 100.0d;
        Line line25 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = 10.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        java.lang.Object obj15 = null;
        boolean boolean16 = point2.equals(obj15);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        java.lang.Double double24 = point19.x;
        java.lang.Double double25 = point19.x;
        Line line26 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        java.lang.Double double12 = point8.y;
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = point8.equals(obj13);
        point8.x = 1.0d;
        java.lang.Double double17 = point8.x;
        boolean boolean18 = point2.equals((java.lang.Object) double17);
        java.lang.Double double19 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double22 = point2.x;
        java.lang.Double double23 = point2.y;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        java.lang.Double double28 = point2.x;
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.x;
        java.lang.Double double33 = point31.y;
        java.lang.Double double34 = point31.y;
        point31.y = (-1.0d);
        point31.x = 0.0d;
        point31.y = 10.0d;
        java.lang.Double double41 = point31.y;
        java.lang.Double double42 = point31.x;
        Line line43 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.y;
        point18.y = 0.0d;
        point18.x = 0.0d;
        java.lang.Double double27 = point18.y;
        point18.x = 0.0d;
        java.lang.Class<?> wildcardClass30 = point18.getClass();
        boolean boolean31 = point2.equals((java.lang.Object) point18);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.y;
        boolean boolean40 = point34.equals((java.lang.Object) point37);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        boolean boolean46 = point37.equals((java.lang.Object) double45);
        point37.x = 100.0d;
        java.lang.Double double49 = point37.y;
        boolean boolean50 = point18.equals((java.lang.Object) point37);
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double54 = point53.y;
        java.lang.Double double55 = point53.x;
        point53.y = 0.0d;
        point53.y = (-1.0d);
        point53.y = (-1.0d);
        point53.x = 0.0d;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        point66.y = 1.0d;
        point66.x = 1.0d;
        java.lang.Object obj72 = null;
        boolean boolean73 = point66.equals(obj72);
        point66.x = 1.0d;
        boolean boolean77 = point66.equals((java.lang.Object) false);
        java.lang.Double double78 = point66.x;
        java.lang.Double double79 = point66.x;
        boolean boolean80 = point53.equals((java.lang.Object) point66);
        java.lang.Double double81 = point53.x;
        java.lang.Double double82 = point53.x;
        Line line83 = new Line(point37, point53);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        point2.x = 0.0d;
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point24.x = 1.0d;
        point24.y = 1.0d;
        boolean boolean29 = point21.equals((java.lang.Object) 1.0d);
        java.lang.Double double30 = point21.y;
        java.lang.Double double31 = point21.x;
        point21.y = 10.0d;
        java.lang.Double double34 = point21.y;
        point21.x = (-1.0d);
        boolean boolean37 = point2.equals((java.lang.Object) (-1.0d));
        point2.y = 10.0d;
        Point point42 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.x;
        java.lang.Double double44 = point42.y;
        java.lang.Double double45 = point42.y;
        point42.y = (-1.0d);
        point42.x = 0.0d;
        point42.y = 10.0d;
        Point point54 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double55 = point54.x;
        point54.x = 100.0d;
        point54.x = (-1.0d);
        boolean boolean60 = point42.equals((java.lang.Object) (-1.0d));
        Line line61 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 0.0d;
        point12.y = 1.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        point19.x = 10.0d;
        java.lang.Double double27 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double30 = point19.x;
        boolean boolean31 = point12.equals((java.lang.Object) point19);
        java.lang.Double double32 = point19.x;
        point19.x = 0.0d;
        Line line35 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        point2.y = 1.0d;
        point2.y = 10.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point9.x = 100.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 1.0d;
        java.lang.Double double20 = point14.y;
        java.lang.Double double21 = point14.y;
        point14.x = 10.0d;
        boolean boolean24 = point9.equals((java.lang.Object) point14);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        point27.y = 10.0d;
        point27.y = 10.0d;
        boolean boolean33 = point14.equals((java.lang.Object) point27);
        point27.y = 10.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        point41.y = 10.0d;
        boolean boolean45 = point38.equals((java.lang.Object) point41);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        boolean boolean51 = point48.equals((java.lang.Object) 1L);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.x;
        boolean boolean57 = point54.equals((java.lang.Object) 10.0f);
        point54.x = 100.0d;
        boolean boolean60 = point48.equals((java.lang.Object) 100.0d);
        boolean boolean61 = point41.equals((java.lang.Object) boolean60);
        java.lang.Double double62 = point41.x;
        point41.y = (-1.0d);
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        point67.y = 1.0d;
        java.lang.Double double71 = point67.y;
        java.lang.Object obj72 = new java.lang.Object();
        boolean boolean73 = point67.equals(obj72);
        java.lang.Double double74 = point67.y;
        point67.x = (-1.0d);
        point67.y = 0.0d;
        point67.x = 1.0d;
        boolean boolean81 = point41.equals((java.lang.Object) 1.0d);
        java.lang.Double double82 = point41.y;
        java.lang.Double double83 = point41.y;
        java.lang.Double double84 = point41.x;
        boolean boolean85 = point27.equals((java.lang.Object) point41);
        point41.x = 1.0d;
        Line line88 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point15.y = 0.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.x;
        point15.x = 1.0d;
        point15.x = 0.0d;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        boolean boolean29 = point15.equals((java.lang.Object) point26);
        java.lang.Double double30 = point15.x;
        Line line31 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.x;
        boolean boolean30 = point27.equals((java.lang.Object) 10.0f);
        point27.x = 100.0d;
        boolean boolean33 = point21.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass34 = point21.getClass();
        boolean boolean35 = point18.equals((java.lang.Object) wildcardClass34);
        java.lang.Double double36 = point18.y;
        Point point39 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point39.y = (-1.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        java.lang.Double double46 = point44.x;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        java.lang.Double double54 = point49.y;
        java.lang.Double double55 = point49.y;
        point49.y = 1.0d;
        java.lang.Class<?> wildcardClass58 = point49.getClass();
        boolean boolean59 = point44.equals((java.lang.Object) wildcardClass58);
        boolean boolean60 = point39.equals((java.lang.Object) boolean59);
        java.lang.Double double61 = point39.y;
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.x;
        boolean boolean67 = point64.equals((java.lang.Object) 10.0f);
        point64.x = 100.0d;
        java.lang.Double double70 = point64.x;
        Point point73 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point73.x = 100.0d;
        boolean boolean76 = point64.equals((java.lang.Object) 100.0d);
        point64.x = 100.0d;
        point64.y = (-1.0d);
        boolean boolean81 = point39.equals((java.lang.Object) point64);
        java.lang.Double double82 = point39.y;
        point39.x = 0.0d;
        boolean boolean85 = point18.equals((java.lang.Object) point39);
        point18.x = 100.0d;
        Line line88 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double6 = point2.x;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        point14.y = 10.0d;
        boolean boolean18 = point11.equals((java.lang.Object) point14);
        boolean boolean20 = point14.equals((java.lang.Object) 10.0d);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.x;
        java.lang.Double double29 = point23.x;
        point23.y = 1.0d;
        boolean boolean32 = point14.equals((java.lang.Object) point23);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        java.lang.Double double37 = point35.x;
        point35.y = 0.0d;
        point35.x = 1.0d;
        boolean boolean42 = point14.equals((java.lang.Object) 1.0d);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point45.x = 1.0d;
        point45.y = 1.0d;
        java.lang.Double double50 = point45.x;
        point45.x = (-1.0d);
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 1.0d;
        point55.x = 100.0d;
        point55.x = 10.0d;
        java.lang.Double double63 = point55.y;
        boolean boolean64 = point45.equals((java.lang.Object) double63);
        point45.y = (-1.0d);
        point45.x = (-1.0d);
        java.lang.Double double69 = point45.y;
        java.lang.Class<?> wildcardClass70 = point45.getClass();
        boolean boolean71 = point14.equals((java.lang.Object) point45);
        Line line72 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 1.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double16 = point15.x;
        point15.x = 1.0d;
        java.lang.Double double19 = point15.x;
        point15.x = 100.0d;
        java.lang.Double double22 = point15.y;
        boolean boolean23 = point2.equals((java.lang.Object) double22);
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        boolean boolean34 = point26.equals((java.lang.Object) double33);
        java.lang.Double double35 = point26.y;
        java.lang.Double double36 = point26.x;
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        java.lang.Double double46 = point42.y;
        boolean boolean47 = point39.equals((java.lang.Object) double46);
        java.lang.Double double48 = point39.y;
        boolean boolean49 = point26.equals((java.lang.Object) point39);
        point39.y = 100.0d;
        Line line52 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.y = 1.0d;
        Line line14 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        point9.y = (-1.0d);
        java.lang.Double double14 = point9.y;
        java.lang.Double double15 = point9.y;
        java.lang.Double double16 = point9.y;
        java.lang.Double double17 = point9.y;
        java.lang.Double double18 = point9.x;
        point9.x = 1.0d;
        point9.y = 1.0d;
        java.lang.Double double23 = point9.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point26.x = 1.0d;
        point26.y = 1.0d;
        point26.y = (-1.0d);
        point26.y = 10.0d;
        point26.y = 0.0d;
        java.lang.Double double37 = point26.x;
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.x;
        java.lang.Double double42 = point40.x;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double46 = point45.y;
        boolean boolean47 = point40.equals((java.lang.Object) double46);
        boolean boolean48 = point26.equals((java.lang.Object) double46);
        boolean boolean49 = point9.equals((java.lang.Object) boolean48);
        boolean boolean50 = point2.equals((java.lang.Object) point9);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 100.0d;
        point53.x = 10.0d;
        java.lang.Double double61 = point53.y;
        point53.y = 0.0d;
        java.lang.Double double64 = point53.y;
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point67.y = (-1.0d);
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double73 = point72.y;
        point72.y = 1.0d;
        point72.x = 100.0d;
        point72.x = 10.0d;
        java.lang.Double double80 = point72.y;
        point72.y = 0.0d;
        Point point85 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double86 = point85.y;
        point85.y = 100.0d;
        boolean boolean89 = point72.equals((java.lang.Object) point85);
        point85.y = 1.0d;
        java.lang.Double double92 = point85.x;
        boolean boolean93 = point67.equals((java.lang.Object) double92);
        point67.x = 0.0d;
        boolean boolean96 = point53.equals((java.lang.Object) point67);
        Line line97 = new Line(point2, point67);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 0.0d);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        java.lang.Double double20 = point17.y;
        java.lang.Double double21 = point17.y;
        point17.y = 0.0d;
        java.lang.Double double24 = point17.x;
        java.lang.Double double25 = point17.y;
        point17.x = 100.0d;
        java.lang.Double double28 = point17.y;
        boolean boolean29 = point11.equals((java.lang.Object) point17);
        java.lang.Double double30 = point17.x;
        Line line31 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        boolean boolean21 = point18.equals((java.lang.Object) 1L);
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point15.equals((java.lang.Object) double22);
        java.lang.Double double24 = point15.y;
        boolean boolean25 = point2.equals((java.lang.Object) point15);
        java.lang.Double double26 = point15.y;
        point15.x = 1.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.x;
        boolean boolean33 = point15.equals((java.lang.Object) point31);
        Point point36 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.x;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        java.lang.Double double47 = point40.y;
        java.lang.Class<?> wildcardClass48 = point40.getClass();
        boolean boolean49 = point36.equals((java.lang.Object) point40);
        boolean boolean50 = point15.equals((java.lang.Object) boolean49);
        point15.x = 100.0d;
        Point point53 = null;
        Line line54 = new Line(point15, point53);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.x;
        java.lang.Double double13 = point11.y;
        point11.y = (-1.0d);
        point11.y = 0.0d;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 1.0d;
        point20.y = 100.0d;
        point20.x = 1.0d;
        point20.y = (-1.0d);
        boolean boolean35 = point11.equals((java.lang.Object) point20);
        boolean boolean36 = point2.equals((java.lang.Object) point20);
        Point point39 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point39.y = (-1.0d);
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.x;
        Line line44 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 0.0d;
        java.lang.Class<?> wildcardClass17 = point11.getClass();
        boolean boolean18 = point2.equals((java.lang.Object) wildcardClass17);
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.x;
        java.lang.Double double23 = point21.y;
        java.lang.Double double24 = point21.y;
        java.lang.Double double25 = point21.y;
        point21.y = 1.0d;
        point21.x = 10.0d;
        Line line30 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        point17.y = 10.0d;
        boolean boolean21 = point14.equals((java.lang.Object) point17);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass25 = point24.getClass();
        boolean boolean26 = point17.equals((java.lang.Object) wildcardClass25);
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        boolean boolean32 = point17.equals((java.lang.Object) point29);
        boolean boolean33 = point2.equals((java.lang.Object) point17);
        java.lang.Double double34 = point2.x;
        java.lang.Double double35 = point2.x;
        point2.x = 10.0d;
        point2.x = 10.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.x = 100.0d;
        point42.x = 10.0d;
        java.lang.Double double50 = point42.y;
        point42.y = 0.0d;
        Point point55 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double56 = point55.y;
        point55.y = 100.0d;
        boolean boolean59 = point42.equals((java.lang.Object) point55);
        java.lang.Double double60 = point55.y;
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point66.y = 1.0d;
        point66.y = (-1.0d);
        java.lang.Double double71 = point66.y;
        point66.y = 100.0d;
        Point point76 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass77 = point76.getClass();
        boolean boolean78 = point66.equals((java.lang.Object) point76);
        boolean boolean79 = point63.equals((java.lang.Object) point66);
        java.lang.Double double80 = point66.x;
        boolean boolean81 = point55.equals((java.lang.Object) point66);
        boolean boolean82 = point2.equals((java.lang.Object) point55);
        Point point83 = null;
        Line line84 = new Line(point55, point83);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        java.lang.Double double10 = point6.y;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = point6.equals(obj11);
        java.lang.Double double13 = point6.y;
        java.lang.Class<?> wildcardClass14 = point6.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) point6);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point18.y = 100.0d;
        point18.y = 0.0d;
        boolean boolean23 = point2.equals((java.lang.Object) 0.0d);
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point26.y = 10.0d;
        java.lang.Double double29 = point26.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        java.lang.Double double36 = point32.y;
        point32.y = 100.0d;
        point32.x = 10.0d;
        java.lang.Double double41 = point32.x;
        boolean boolean42 = point26.equals((java.lang.Object) point32);
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        boolean boolean51 = point48.equals((java.lang.Object) 1L);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.x;
        boolean boolean57 = point54.equals((java.lang.Object) 10.0f);
        point54.x = 100.0d;
        boolean boolean60 = point48.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass61 = point48.getClass();
        boolean boolean62 = point45.equals((java.lang.Object) wildcardClass61);
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point68 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        java.lang.Double double70 = point68.y;
        boolean boolean71 = point65.equals((java.lang.Object) point68);
        point65.x = 10.0d;
        boolean boolean74 = point45.equals((java.lang.Object) point65);
        Point point77 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point77.x = 0.0d;
        point77.y = (-1.0d);
        point77.y = 100.0d;
        java.lang.Double double84 = point77.x;
        boolean boolean85 = point65.equals((java.lang.Object) point77);
        boolean boolean87 = point65.equals((java.lang.Object) (-1));
        java.lang.Double double88 = point65.y;
        java.lang.Class<?> wildcardClass89 = point65.getClass();
        boolean boolean90 = point32.equals((java.lang.Object) wildcardClass89);
        Line line91 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line91.equals(line91)", line91.equals(line91));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        java.lang.Double double14 = point2.x;
        point2.x = 10.0d;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        java.lang.Double double24 = point19.y;
        java.lang.Double double25 = point19.y;
        java.lang.Double double26 = point19.y;
        point19.y = 100.0d;
        java.lang.Double double29 = point19.x;
        java.lang.Double double30 = point19.y;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        java.lang.Class<?> wildcardClass35 = point33.getClass();
        boolean boolean36 = point19.equals((java.lang.Object) wildcardClass35);
        Point point39 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        java.lang.Double double42 = point39.x;
        java.lang.Class<?> wildcardClass43 = point39.getClass();
        boolean boolean44 = point19.equals((java.lang.Object) point39);
        java.lang.Double double45 = point19.y;
        java.lang.Double double46 = point19.y;
        Line line47 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.x = (-1.0d);
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point15.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        point20.x = 10.0d;
        java.lang.Double double28 = point20.y;
        point20.y = 0.0d;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        point33.y = 100.0d;
        boolean boolean37 = point20.equals((java.lang.Object) point33);
        point33.y = 1.0d;
        java.lang.Double double40 = point33.x;
        boolean boolean41 = point15.equals((java.lang.Object) double40);
        java.lang.Double double42 = point15.x;
        Line line43 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double16 = point2.y;
        point2.x = 100.0d;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.y;
        java.lang.Double double27 = point21.y;
        point21.y = 1.0d;
        point21.y = 100.0d;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj35 = null;
        boolean boolean36 = point34.equals(obj35);
        boolean boolean37 = point21.equals((java.lang.Object) point34);
        point21.x = 100.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.y;
        boolean boolean48 = point42.equals((java.lang.Object) point45);
        java.lang.Double double49 = point45.x;
        boolean boolean50 = point21.equals((java.lang.Object) point45);
        java.lang.Double double51 = point45.x;
        Line line52 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.x;
        java.lang.Double double19 = point17.y;
        java.lang.Double double20 = point17.y;
        point17.y = (-1.0d);
        point17.x = 0.0d;
        point17.y = 10.0d;
        java.lang.Double double27 = point17.y;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        java.lang.Double double33 = point30.y;
        java.lang.Double double34 = point30.y;
        point30.y = 10.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.x;
        boolean boolean42 = point39.equals((java.lang.Object) 10.0f);
        point39.x = 100.0d;
        java.lang.Double double45 = point39.x;
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point48.x = 100.0d;
        boolean boolean51 = point39.equals((java.lang.Object) 100.0d);
        java.lang.Double double52 = point39.y;
        point39.y = 100.0d;
        boolean boolean55 = point30.equals((java.lang.Object) point39);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        point58.y = 1.0d;
        point58.x = 0.0d;
        boolean boolean65 = point58.equals((java.lang.Object) "");
        boolean boolean66 = point39.equals((java.lang.Object) point58);
        boolean boolean67 = point17.equals((java.lang.Object) point58);
        Point point70 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point70.y = 1.0d;
        point70.y = (-1.0d);
        point70.x = 0.0d;
        point70.x = 1.0d;
        boolean boolean79 = point17.equals((java.lang.Object) 1.0d);
        java.lang.Double double80 = point17.x;
        point17.y = 1.0d;
        Line line83 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        point16.y = 1.0d;
        point16.y = (-1.0d);
        Line line23 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        java.lang.Double double9 = point2.y;
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        java.lang.Double double17 = point14.y;
        point14.x = 100.0d;
        point14.y = 0.0d;
        java.lang.Double double22 = point14.x;
        point14.x = 10.0d;
        point14.x = 0.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        point29.y = 1.0d;
        java.lang.Double double34 = point29.x;
        point29.x = (-1.0d);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        point39.x = 100.0d;
        point39.x = 10.0d;
        java.lang.Double double47 = point39.y;
        boolean boolean48 = point29.equals((java.lang.Object) double47);
        point29.y = (-1.0d);
        java.lang.Double double51 = point29.x;
        java.lang.Double double52 = point29.x;
        java.lang.Double double53 = point29.y;
        java.lang.Double double54 = point29.y;
        boolean boolean55 = point14.equals((java.lang.Object) point29);
        point14.y = 100.0d;
        Line line58 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        point14.y = 100.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 100.0d;
        point24.y = 10.0d;
        boolean boolean32 = point14.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass33 = point14.getClass();
        boolean boolean34 = point2.equals((java.lang.Object) wildcardClass33);
        java.lang.Double double35 = point2.y;
        java.lang.Double double36 = point2.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        boolean boolean45 = point39.equals((java.lang.Object) point42);
        point39.y = 0.0d;
        point39.x = (-1.0d);
        java.lang.Double double50 = point39.x;
        Line line51 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        boolean boolean13 = point10.equals((java.lang.Object) 1L);
        java.lang.Double double14 = point10.y;
        boolean boolean15 = point7.equals((java.lang.Object) double14);
        point7.x = 10.0d;
        boolean boolean18 = point2.equals((java.lang.Object) point7);
        java.lang.Double double19 = point7.x;
        point7.x = 1.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 100.0d;
        point24.x = 10.0d;
        java.lang.Double double32 = point24.y;
        point24.y = 0.0d;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        point37.y = 100.0d;
        boolean boolean41 = point24.equals((java.lang.Object) point37);
        point37.y = 1.0d;
        java.lang.Double double44 = point37.x;
        java.lang.Double double45 = point37.y;
        Line line46 = new Line(point7, point37);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.x = 1.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.x;
        point19.x = 1.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        point28.x = 1.0d;
        boolean boolean38 = point19.equals((java.lang.Object) point28);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point41.y = 10.0d;
        point41.y = 10.0d;
        boolean boolean46 = point28.equals((java.lang.Object) point41);
        boolean boolean47 = point2.equals((java.lang.Object) boolean46);
        point2.y = 0.0d;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point52.x = 0.0d;
        java.lang.Double double55 = point52.x;
        java.lang.Double double56 = point52.y;
        point52.x = 100.0d;
        boolean boolean59 = point2.equals((java.lang.Object) point52);
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point62.y = 0.0d;
        Point point67 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double68 = point67.x;
        java.lang.Double double69 = point67.y;
        java.lang.Double double70 = point67.y;
        java.lang.Double double71 = point67.y;
        boolean boolean72 = point62.equals((java.lang.Object) point67);
        java.lang.Double double73 = point62.y;
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        boolean boolean79 = point76.equals((java.lang.Object) 1L);
        point76.y = (-1.0d);
        java.lang.Double double82 = point76.y;
        boolean boolean83 = point62.equals((java.lang.Object) point76);
        point62.y = 1.0d;
        java.lang.Double double86 = point62.x;
        point62.x = 0.0d;
        java.lang.Double double89 = point62.x;
        Line line90 = new Line(point52, point62);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.y;
        java.lang.Double double18 = point12.y;
        point12.y = 1.0d;
        point12.y = 100.0d;
        point12.x = 1.0d;
        point12.y = 10.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point29.equals((java.lang.Object) point32);
        java.lang.Double double37 = point29.x;
        boolean boolean38 = point12.equals((java.lang.Object) double37);
        java.lang.Double double39 = point12.y;
        java.lang.Object obj40 = null;
        boolean boolean41 = point12.equals(obj40);
        Line line42 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        java.lang.Double double19 = point17.y;
        boolean boolean20 = point14.equals((java.lang.Object) point17);
        java.lang.Double double21 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double24 = point14.y;
        java.lang.Double double25 = point14.y;
        boolean boolean26 = point2.equals((java.lang.Object) point14);
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        java.lang.Double double34 = point30.y;
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = point30.equals(obj35);
        point30.x = 1.0d;
        java.lang.Double double39 = point30.x;
        point30.y = 0.0d;
        point30.y = 1.0d;
        point30.x = (-1.0d);
        point30.x = 0.0d;
        point30.x = 10.0d;
        point30.y = 1.0d;
        java.lang.Double double52 = point30.x;
        Line line53 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        point5.x = 0.0d;
        point5.x = 10.0d;
        point5.y = (-1.0d);
        point5.x = 10.0d;
        java.lang.Double double23 = point5.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        java.lang.Double double31 = point26.y;
        java.lang.Double double32 = point26.y;
        point26.y = 1.0d;
        point26.y = 100.0d;
        point26.y = 0.0d;
        java.lang.Double double39 = point26.y;
        point26.y = 1.0d;
        point26.x = (-1.0d);
        Line line44 = new Line(point5, point26);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        boolean boolean19 = point13.equals((java.lang.Object) point16);
        boolean boolean21 = point13.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass22 = point13.getClass();
        boolean boolean23 = point2.equals((java.lang.Object) point13);
        java.lang.Double double24 = point2.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean34 = point27.equals((java.lang.Object) point30);
        point27.y = 0.0d;
        java.lang.Double double37 = point27.x;
        java.lang.Double double38 = point27.x;
        point27.x = (-1.0d);
        boolean boolean41 = point2.equals((java.lang.Object) point27);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point47.x = 1.0d;
        point47.y = 1.0d;
        boolean boolean52 = point44.equals((java.lang.Object) 1.0d);
        java.lang.Double double53 = point44.y;
        java.lang.Double double54 = point44.x;
        java.lang.Double double55 = point44.x;
        Point point58 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.x;
        java.lang.Double double60 = point58.y;
        point58.y = (-1.0d);
        point58.y = 0.0d;
        point58.x = (-1.0d);
        boolean boolean67 = point44.equals((java.lang.Object) point58);
        point44.x = 10.0d;
        java.lang.Double double70 = point44.y;
        Line line71 = new Line(point27, point44);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 1.0d;
        point2.x = 0.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        java.lang.Double double21 = point17.y;
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = point17.equals(obj22);
        point17.x = 1.0d;
        java.lang.Double double26 = point17.x;
        point17.y = 0.0d;
        point17.y = 1.0d;
        java.lang.Double double31 = point17.y;
        point17.y = 0.0d;
        Line line34 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 1.0d;
        point2.x = 10.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.y = 10.0d;
        point13.y = 10.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point25.y = 100.0d;
        point25.y = 10.0d;
        java.lang.Double double30 = point25.y;
        boolean boolean31 = point13.equals((java.lang.Object) double30);
        Line line32 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.x;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean23 = point16.equals((java.lang.Object) double22);
        boolean boolean24 = point2.equals((java.lang.Object) double22);
        java.lang.Double double25 = point2.y;
        java.lang.Double double26 = point2.y;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point29.equals((java.lang.Object) point32);
        java.lang.Double double37 = point29.x;
        point29.x = 100.0d;
        Line line40 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        point2.x = (-1.0d);
        java.lang.Double double15 = point2.x;
        point2.y = 0.0d;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        point20.y = 100.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        point29.y = (-1.0d);
        java.lang.Double double35 = point29.y;
        java.lang.Double double36 = point29.y;
        java.lang.Double double37 = point29.x;
        boolean boolean38 = point20.equals((java.lang.Object) point29);
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        point41.y = (-1.0d);
        java.lang.Double double46 = point41.y;
        java.lang.Double double47 = point41.y;
        Point point50 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double51 = point50.y;
        java.lang.Double double52 = point50.y;
        boolean boolean53 = point41.equals((java.lang.Object) point50);
        boolean boolean54 = point29.equals((java.lang.Object) boolean53);
        java.lang.Double double55 = point29.y;
        java.lang.Double double56 = point29.x;
        Point point59 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point59.y = 100.0d;
        point59.x = (-1.0d);
        point59.x = 1.0d;
        boolean boolean66 = point29.equals((java.lang.Object) point59);
        Line line67 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        java.lang.Object obj10 = null;
        boolean boolean11 = point2.equals(obj10);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        java.lang.Double double17 = point14.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double24 = point20.y;
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = point20.equals(obj25);
        point20.x = 1.0d;
        java.lang.Double double29 = point20.x;
        boolean boolean30 = point14.equals((java.lang.Object) double29);
        java.lang.Double double31 = point14.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.x = 10.0d;
        point34.x = 10.0d;
        point34.x = (-1.0d);
        boolean boolean46 = point14.equals((java.lang.Object) point34);
        Line line47 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 100.0d;
        point11.x = 10.0d;
        java.lang.Double double19 = point11.y;
        boolean boolean20 = point2.equals((java.lang.Object) point11);
        point11.y = 1.0d;
        java.lang.Double double23 = point11.y;
        point11.y = (-1.0d);
        Point point28 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.x;
        java.lang.Double double30 = point28.y;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 1.0d;
        Line line35 = new Line(point11, point28);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 100.0d;
        java.lang.Class<?> wildcardClass16 = point12.getClass();
        boolean boolean17 = point2.equals((java.lang.Object) point12);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point23.x = 1.0d;
        point23.y = 1.0d;
        boolean boolean28 = point20.equals((java.lang.Object) 1.0d);
        point20.x = (-1.0d);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        java.lang.Double double40 = point36.y;
        boolean boolean41 = point33.equals((java.lang.Object) double40);
        point33.x = 10.0d;
        java.lang.Double double44 = point33.x;
        point33.x = 10.0d;
        java.lang.Double double47 = point33.y;
        boolean boolean48 = point20.equals((java.lang.Object) double47);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point51.x = 1.0d;
        point51.y = 1.0d;
        java.lang.Double double56 = point51.x;
        java.lang.Double double57 = point51.y;
        boolean boolean58 = point20.equals((java.lang.Object) point51);
        point20.x = 0.0d;
        java.lang.Double double61 = point20.y;
        java.lang.Double double62 = point20.x;
        Line line63 = new Line(point12, point20);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        point13.y = 10.0d;
        point13.y = (-1.0d);
        java.lang.Class<?> wildcardClass19 = point13.getClass();
        boolean boolean20 = point2.equals((java.lang.Object) wildcardClass19);
        java.lang.Double double21 = point2.y;
        point2.x = 1.0d;
        point2.x = 100.0d;
        point2.y = 0.0d;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 0.0d;
        boolean boolean37 = point30.equals((java.lang.Object) "");
        java.lang.Double double38 = point30.y;
        Line line39 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 100.0d;
        point7.y = 100.0d;
        java.lang.Double double15 = point7.y;
        point7.y = 100.0d;
        java.lang.Double double18 = point7.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 1.0d;
        java.lang.Object obj27 = null;
        boolean boolean28 = point21.equals(obj27);
        point21.x = 1.0d;
        boolean boolean32 = point21.equals((java.lang.Object) false);
        java.lang.Double double33 = point21.x;
        point21.y = (-1.0d);
        point21.x = 1.0d;
        java.lang.Double double38 = point21.x;
        boolean boolean39 = point7.equals((java.lang.Object) point21);
        boolean boolean40 = point2.equals((java.lang.Object) point7);
        java.lang.Double double41 = point2.y;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        java.lang.Double double47 = point44.y;
        java.lang.Double double48 = point44.y;
        point44.y = 10.0d;
        java.lang.Double double51 = point44.y;
        point44.x = 0.0d;
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double57 = point56.x;
        Point point60 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point60.y = 1.0d;
        point60.y = (-1.0d);
        boolean boolean65 = point56.equals((java.lang.Object) point60);
        boolean boolean66 = point44.equals((java.lang.Object) point60);
        Point point69 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point69.y = 0.0d;
        java.lang.Double double72 = point69.y;
        java.lang.Double double73 = point69.x;
        Point point76 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point79.x = 1.0d;
        point79.y = 1.0d;
        boolean boolean84 = point76.equals((java.lang.Object) 1.0d);
        java.lang.Double double85 = point76.y;
        java.lang.Double double86 = point76.y;
        java.lang.Double double87 = point76.x;
        java.lang.Double double88 = point76.y;
        boolean boolean89 = point69.equals((java.lang.Object) double88);
        boolean boolean90 = point44.equals((java.lang.Object) double88);
        java.lang.Double double91 = point44.x;
        Line line92 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line92.equals(line92)", line92.equals(line92));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double18 = point2.y;
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double23 = point22.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        java.lang.Double double29 = point26.x;
        boolean boolean30 = point22.equals((java.lang.Object) point26);
        point22.x = (-1.0d);
        java.lang.Double double33 = point22.x;
        point22.y = 10.0d;
        Line line36 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        java.lang.Double double10 = point6.y;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = point6.equals(obj11);
        java.lang.Double double13 = point6.y;
        java.lang.Class<?> wildcardClass14 = point6.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) point6);
        java.lang.Double double16 = point2.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.x;
        java.lang.Double double26 = point24.y;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.y;
        boolean boolean29 = point19.equals((java.lang.Object) point24);
        java.lang.Class<?> wildcardClass30 = point24.getClass();
        boolean boolean31 = point2.equals((java.lang.Object) point24);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        java.lang.Double double36 = point34.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.y;
        java.lang.Double double45 = point39.y;
        point39.y = 1.0d;
        java.lang.Class<?> wildcardClass48 = point39.getClass();
        boolean boolean49 = point34.equals((java.lang.Object) wildcardClass48);
        java.lang.Double double50 = point34.y;
        java.lang.Double double51 = point34.x;
        point34.x = 1.0d;
        java.lang.Object obj54 = null;
        boolean boolean55 = point34.equals(obj54);
        Line line56 = new Line(point24, point34);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        boolean boolean17 = point5.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = point5.getClass();
        boolean boolean19 = point2.equals((java.lang.Object) wildcardClass18);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.y;
        boolean boolean28 = point22.equals((java.lang.Object) point25);
        point22.x = 10.0d;
        boolean boolean31 = point2.equals((java.lang.Object) point22);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 0.0d;
        point34.y = (-1.0d);
        point34.y = 100.0d;
        java.lang.Double double41 = point34.x;
        boolean boolean42 = point22.equals((java.lang.Object) point34);
        point34.y = (-1.0d);
        point34.y = 0.0d;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        point49.y = 100.0d;
        point49.x = (-1.0d);
        java.lang.Double double58 = point49.x;
        java.lang.Double double59 = point49.x;
        java.lang.Double double60 = point49.y;
        point49.x = 1.0d;
        point49.x = (-1.0d);
        java.lang.Double double65 = point49.y;
        Line line66 = new Line(point34, point49);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        point5.y = 1.0d;
        java.lang.Double double9 = point5.y;
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = point5.equals(obj10);
        java.lang.Double double12 = point5.y;
        point5.y = 100.0d;
        boolean boolean15 = point2.equals((java.lang.Object) point5);
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point19.x = 0.0d;
        point19.x = 1.0d;
        point19.x = (-1.0d);
        point19.y = 10.0d;
        Line line28 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.x;
        java.lang.Double double9 = point7.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.y;
        java.lang.Double double18 = point12.y;
        point12.y = 1.0d;
        java.lang.Class<?> wildcardClass21 = point12.getClass();
        boolean boolean22 = point7.equals((java.lang.Object) wildcardClass21);
        boolean boolean23 = point2.equals((java.lang.Object) boolean22);
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.x;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean33 = point31.equals((java.lang.Object) true);
        boolean boolean34 = point26.equals((java.lang.Object) true);
        java.lang.Double double35 = point26.y;
        java.lang.Double double36 = point26.y;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.y;
        point39.y = 10.0d;
        java.lang.Double double46 = point39.y;
        point39.x = 10.0d;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point51.x = 1.0d;
        point51.y = 1.0d;
        java.lang.Double double56 = point51.x;
        point51.x = (-1.0d);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        point61.x = 100.0d;
        point61.x = 10.0d;
        java.lang.Double double69 = point61.y;
        boolean boolean70 = point51.equals((java.lang.Object) double69);
        point51.y = (-1.0d);
        java.lang.Double double73 = point51.x;
        point51.y = 1.0d;
        boolean boolean76 = point39.equals((java.lang.Object) 1.0d);
        boolean boolean77 = point26.equals((java.lang.Object) point39);
        point39.x = 1.0d;
        Line line80 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        java.lang.Double double24 = point19.x;
        java.lang.Double double25 = point19.x;
        point19.y = 1.0d;
        boolean boolean28 = point9.equals((java.lang.Object) point19);
        point19.y = (-1.0d);
        point19.x = (-1.0d);
        java.lang.Double double33 = point19.x;
        java.lang.Double double34 = point19.x;
        java.lang.Double double35 = point19.x;
        boolean boolean36 = point2.equals((java.lang.Object) double35);
        point2.y = 100.0d;
        java.lang.Double double39 = point2.x;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        boolean boolean48 = point45.equals((java.lang.Object) 1L);
        java.lang.Double double49 = point45.y;
        boolean boolean50 = point42.equals((java.lang.Object) double49);
        point42.x = 10.0d;
        java.lang.Double double53 = point42.x;
        point42.y = (-1.0d);
        Line line56 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 1.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.y;
        java.lang.Double double21 = point16.y;
        point16.y = (-1.0d);
        java.lang.Double double24 = point16.x;
        point16.x = 10.0d;
        Line line27 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        boolean boolean23 = point14.equals((java.lang.Object) point18);
        boolean boolean24 = point2.equals((java.lang.Object) point18);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        point27.y = (-1.0d);
        java.lang.Double double33 = point27.y;
        java.lang.Double double34 = point27.y;
        java.lang.Double double35 = point27.x;
        point27.x = 10.0d;
        java.lang.Class<?> wildcardClass38 = point27.getClass();
        boolean boolean39 = point2.equals((java.lang.Object) point27);
        java.lang.Double double40 = point2.y;
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = (-1.0d);
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        java.lang.Double double54 = point51.y;
        java.lang.Double double55 = point51.y;
        point51.x = 0.0d;
        point51.x = 10.0d;
        Line line60 = new Line(point2, point51);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.x;
        point12.x = 1.0d;
        boolean boolean19 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double20 = point2.y;
        java.lang.Double double21 = point2.x;
        java.lang.Double double22 = point2.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        java.lang.Double double29 = point25.y;
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = point25.equals(obj30);
        point25.x = 1.0d;
        point25.y = 0.0d;
        java.lang.Double double36 = point25.y;
        point25.y = 1.0d;
        java.lang.Double double39 = point25.y;
        java.lang.Double double40 = point25.y;
        Line line41 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point13.x = 1.0d;
        point13.y = 1.0d;
        point13.y = (-1.0d);
        point13.y = 10.0d;
        point13.y = 1.0d;
        java.lang.Double double24 = point13.x;
        java.lang.Double double25 = point13.y;
        java.lang.Double double26 = point13.x;
        java.lang.Double double27 = point13.x;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        java.lang.Double double33 = point30.y;
        point30.x = 100.0d;
        point30.x = 100.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        point40.y = 10.0d;
        boolean boolean49 = point40.equals((java.lang.Object) 0L);
        java.lang.Double double50 = point40.y;
        boolean boolean51 = point30.equals((java.lang.Object) double50);
        point30.y = 0.0d;
        java.lang.Double double54 = point30.y;
        boolean boolean55 = point13.equals((java.lang.Object) double54);
        java.lang.Double double56 = point13.y;
        Point point59 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point59.y = 1.0d;
        java.lang.Double double62 = point59.y;
        java.lang.Double double63 = point59.y;
        point59.y = 0.0d;
        java.lang.Double double66 = point59.y;
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.y;
        point69.y = 1.0d;
        point69.x = 100.0d;
        point69.y = 100.0d;
        java.lang.Double double77 = point69.y;
        boolean boolean78 = point59.equals((java.lang.Object) point69);
        boolean boolean79 = point13.equals((java.lang.Object) point69);
        Line line80 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.y;
        point12.y = 10.0d;
        point12.y = (-1.0d);
        java.lang.Double double18 = point12.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.x;
        boolean boolean30 = point27.equals((java.lang.Object) 10.0f);
        point27.x = 100.0d;
        boolean boolean33 = point21.equals((java.lang.Object) 100.0d);
        boolean boolean34 = point12.equals((java.lang.Object) 100.0d);
        java.lang.Double double35 = point12.x;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        java.lang.Double double44 = point38.x;
        point38.y = 1.0d;
        java.lang.Class<?> wildcardClass47 = point38.getClass();
        boolean boolean48 = point12.equals((java.lang.Object) wildcardClass47);
        point12.x = 10.0d;
        boolean boolean51 = point2.equals((java.lang.Object) point12);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        point54.x = 100.0d;
        point54.y = (-1.0d);
        point54.x = (-1.0d);
        java.lang.Double double64 = point54.y;
        point54.y = 0.0d;
        Line line67 = new Line(point2, point54);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = 1.0d;
        point2.y = 10.0d;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        java.lang.Double double20 = point18.y;
        point18.y = (-1.0d);
        point18.y = 0.0d;
        java.lang.Double double25 = point18.x;
        java.lang.Double double26 = point18.x;
        boolean boolean27 = point2.equals((java.lang.Object) point18);
        java.lang.Double double28 = point18.x;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point31.x = 0.0d;
        point31.y = 1.0d;
        java.lang.Double double36 = point31.x;
        point31.x = 10.0d;
        java.lang.Double double39 = point31.x;
        Point point42 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean44 = point42.equals((java.lang.Object) (byte) 100);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.x;
        point47.x = (-1.0d);
        java.lang.Class<?> wildcardClass53 = point47.getClass();
        boolean boolean54 = point42.equals((java.lang.Object) wildcardClass53);
        boolean boolean55 = point31.equals((java.lang.Object) boolean54);
        point31.x = 0.0d;
        Line line58 = new Line(point18, point31);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        java.lang.Double double14 = point8.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point17.x = 100.0d;
        boolean boolean20 = point8.equals((java.lang.Object) 100.0d);
        point8.x = 10.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point8);
        point2.x = 10.0d;
        point2.x = 1.0d;
        java.lang.Double double28 = point2.x;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        point31.y = 10.0d;
        point31.y = 100.0d;
        java.lang.Double double41 = point31.x;
        point31.x = 1.0d;
        Line line44 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        boolean boolean19 = point13.equals((java.lang.Object) point16);
        java.lang.Double double20 = point16.x;
        java.lang.Double double21 = point16.x;
        point16.x = (-1.0d);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 10.0d;
        boolean boolean33 = point26.equals((java.lang.Object) point29);
        point26.y = 0.0d;
        java.lang.Double double36 = point26.x;
        boolean boolean37 = point16.equals((java.lang.Object) point26);
        Line line38 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        boolean boolean17 = point5.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = point5.getClass();
        boolean boolean19 = point2.equals((java.lang.Object) wildcardClass18);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.y;
        boolean boolean28 = point22.equals((java.lang.Object) point25);
        point22.x = 10.0d;
        boolean boolean31 = point2.equals((java.lang.Object) point22);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 0.0d;
        point34.y = (-1.0d);
        point34.y = 100.0d;
        java.lang.Double double41 = point34.x;
        boolean boolean42 = point22.equals((java.lang.Object) point34);
        boolean boolean44 = point22.equals((java.lang.Object) (-1));
        point22.x = 100.0d;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        java.lang.Double double52 = point49.y;
        java.lang.Double double53 = point49.y;
        java.lang.Double double54 = point49.x;
        java.lang.Double double55 = point49.y;
        java.lang.Double double56 = point49.y;
        java.lang.Double double57 = point49.y;
        java.lang.Double double58 = point49.y;
        point49.y = 1.0d;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.x;
        boolean boolean66 = point63.equals((java.lang.Object) 10.0f);
        point63.x = 100.0d;
        java.lang.Double double69 = point63.x;
        Point point72 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point72.x = 100.0d;
        boolean boolean75 = point63.equals((java.lang.Object) 100.0d);
        java.lang.Double double76 = point63.y;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        point79.y = 1.0d;
        point79.x = 100.0d;
        java.lang.Double double85 = point79.x;
        boolean boolean86 = point63.equals((java.lang.Object) point79);
        java.lang.Double double87 = point63.x;
        point63.y = 100.0d;
        java.lang.Class<?> wildcardClass90 = point63.getClass();
        boolean boolean91 = point49.equals((java.lang.Object) point63);
        Line line92 = new Line(point22, point63);
        org.junit.Assert.assertTrue("Contract failed: line92.equals(line92)", line92.equals(line92));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.x;
        boolean boolean17 = point14.equals((java.lang.Object) 10.0f);
        point14.x = 100.0d;
        java.lang.Double double20 = point14.x;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point23.x = 100.0d;
        boolean boolean26 = point14.equals((java.lang.Object) 100.0d);
        java.lang.Double double27 = point14.y;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point33.x = 1.0d;
        point33.y = 1.0d;
        boolean boolean38 = point30.equals((java.lang.Object) 1.0d);
        java.lang.Double double39 = point30.y;
        point30.x = 0.0d;
        boolean boolean42 = point14.equals((java.lang.Object) 0.0d);
        java.lang.Double double43 = point14.y;
        java.lang.Double double44 = point14.y;
        Line line45 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 100.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean12 = point10.equals((java.lang.Object) true);
        boolean boolean13 = point2.equals((java.lang.Object) true);
        java.lang.Double double14 = point2.y;
        point2.y = 1.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.x;
        point19.x = 1.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        point28.x = 1.0d;
        boolean boolean38 = point19.equals((java.lang.Object) point28);
        Point point41 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean42 = point28.equals((java.lang.Object) point41);
        java.lang.Double double43 = point41.x;
        boolean boolean44 = point2.equals((java.lang.Object) point41);
        point2.y = 1.0d;
        Point point49 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double50 = point49.x;
        java.lang.Double double51 = point49.x;
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double55 = point54.y;
        boolean boolean56 = point49.equals((java.lang.Object) double55);
        java.lang.Object obj57 = null;
        boolean boolean58 = point49.equals(obj57);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point64 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double65 = point64.y;
        point64.y = 10.0d;
        boolean boolean68 = point61.equals((java.lang.Object) point64);
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        boolean boolean74 = point71.equals((java.lang.Object) 1L);
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double78 = point77.x;
        boolean boolean80 = point77.equals((java.lang.Object) 10.0f);
        point77.x = 100.0d;
        boolean boolean83 = point71.equals((java.lang.Object) 100.0d);
        boolean boolean84 = point64.equals((java.lang.Object) boolean83);
        java.lang.Double double85 = point64.x;
        point64.y = (-1.0d);
        boolean boolean88 = point49.equals((java.lang.Object) (-1.0d));
        Line line89 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line89.equals(line89)", line89.equals(line89));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        java.lang.Double double5 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 0.0d;
        point11.y = (-1.0d);
        point11.y = 100.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        point20.x = 10.0d;
        java.lang.Double double28 = point20.y;
        boolean boolean29 = point11.equals((java.lang.Object) point20);
        point20.y = 1.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        java.lang.Double double38 = point34.y;
        java.lang.Object obj39 = new java.lang.Object();
        boolean boolean40 = point34.equals(obj39);
        point34.x = 1.0d;
        java.lang.Double double43 = point34.x;
        boolean boolean44 = point20.equals((java.lang.Object) point34);
        point20.x = (-1.0d);
        Line line47 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        Point point14 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point14.y = 10.0d;
        java.lang.Double double17 = point14.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        boolean boolean23 = point20.equals((java.lang.Object) 1L);
        java.lang.Double double24 = point20.y;
        point20.y = 100.0d;
        point20.x = 10.0d;
        java.lang.Double double29 = point20.x;
        boolean boolean30 = point14.equals((java.lang.Object) point20);
        java.lang.Double double31 = point14.x;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        point34.y = 10.0d;
        point34.y = (-1.0d);
        java.lang.Object obj40 = null;
        boolean boolean41 = point34.equals(obj40);
        boolean boolean43 = point34.equals((java.lang.Object) 10.0d);
        java.lang.Object obj44 = null;
        boolean boolean45 = point34.equals(obj44);
        java.lang.Double double46 = point34.y;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point49.x = 0.0d;
        point49.y = 1.0d;
        java.lang.Double double54 = point49.x;
        boolean boolean55 = point34.equals((java.lang.Object) point49);
        boolean boolean56 = point14.equals((java.lang.Object) point49);
        java.lang.Double double57 = point49.x;
        boolean boolean58 = point2.equals((java.lang.Object) point49);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point61.x = 1.0d;
        Line line64 = new Line(point49, point61);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 0.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        java.lang.Double double26 = point20.y;
        point20.y = 100.0d;
        point20.x = (-1.0d);
        point20.x = 100.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        java.lang.Double double39 = point35.y;
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = point35.equals(obj40);
        java.lang.Double double42 = point35.y;
        point35.y = 100.0d;
        point35.y = 0.0d;
        boolean boolean47 = point20.equals((java.lang.Object) 0.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point50.x = 1.0d;
        point50.y = 1.0d;
        java.lang.Double double55 = point50.x;
        point50.x = (-1.0d);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 100.0d;
        point60.x = 10.0d;
        java.lang.Double double68 = point60.y;
        boolean boolean69 = point50.equals((java.lang.Object) double68);
        point50.y = (-1.0d);
        java.lang.Double double72 = point50.x;
        java.lang.Double double73 = point50.x;
        java.lang.Double double74 = point50.y;
        Point point77 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double78 = point77.x;
        java.lang.Double double79 = point77.y;
        point77.y = (-1.0d);
        java.lang.Class<?> wildcardClass82 = point77.getClass();
        boolean boolean83 = point50.equals((java.lang.Object) wildcardClass82);
        boolean boolean84 = point20.equals((java.lang.Object) point50);
        point50.x = (-1.0d);
        point50.x = 100.0d;
        Line line89 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line89.equals(line89)", line89.equals(line89));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point18.equals((java.lang.Object) 1.0d);
        java.lang.Double double27 = point18.y;
        point18.x = 0.0d;
        boolean boolean30 = point2.equals((java.lang.Object) 0.0d);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.y;
        java.lang.Double double36 = point33.x;
        java.lang.Double double37 = point33.y;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.y;
        java.lang.Double double42 = point40.x;
        point40.y = 0.0d;
        java.lang.Double double45 = point40.x;
        java.lang.Double double46 = point40.y;
        boolean boolean47 = point33.equals((java.lang.Object) point40);
        point40.y = (-1.0d);
        java.lang.Double double50 = point40.y;
        java.lang.Double double51 = point40.y;
        boolean boolean52 = point2.equals((java.lang.Object) point40);
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 1.0d;
        point55.x = 100.0d;
        point55.y = (-1.0d);
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        point65.y = 100.0d;
        java.lang.Class<?> wildcardClass69 = point65.getClass();
        boolean boolean70 = point55.equals((java.lang.Object) point65);
        point55.y = 10.0d;
        point55.x = (-1.0d);
        Line line75 = new Line(point2, point55);
        org.junit.Assert.assertTrue("Contract failed: line75.equals(line75)", line75.equals(line75));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 100.0d;
        java.lang.Double double24 = point18.x;
        boolean boolean25 = point2.equals((java.lang.Object) point18);
        java.lang.Double double26 = point2.x;
        point2.x = 10.0d;
        point2.x = 10.0d;
        java.lang.Object obj31 = null;
        boolean boolean32 = point2.equals(obj31);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double36 = point35.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        java.lang.Double double42 = point39.x;
        boolean boolean43 = point35.equals((java.lang.Object) point39);
        Line line44 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point14.x = 0.0d;
        point14.y = (-1.0d);
        point14.y = 100.0d;
        point14.x = 0.0d;
        java.lang.Double double23 = point14.y;
        point14.y = 100.0d;
        java.lang.Double double26 = point14.x;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        java.lang.Double double36 = point32.y;
        boolean boolean37 = point29.equals((java.lang.Object) double36);
        point29.x = 10.0d;
        java.lang.Double double40 = point29.x;
        point29.x = 10.0d;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.y;
        boolean boolean48 = point29.equals((java.lang.Object) double47);
        boolean boolean49 = point14.equals((java.lang.Object) point29);
        Line line50 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.y = 100.0d;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        point19.y = 0.0d;
        point19.x = 0.0d;
        point19.y = 100.0d;
        Line line30 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        boolean boolean13 = point10.equals((java.lang.Object) 1L);
        java.lang.Double double14 = point10.y;
        boolean boolean15 = point7.equals((java.lang.Object) double14);
        point7.x = 10.0d;
        java.lang.Double double18 = point7.x;
        point7.y = 0.0d;
        point7.x = (-1.0d);
        Point point25 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.x;
        boolean boolean28 = point7.equals((java.lang.Object) double27);
        boolean boolean29 = point2.equals((java.lang.Object) double27);
        java.lang.Double double30 = point2.y;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point33.x = 100.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        point38.y = 1.0d;
        point38.x = 1.0d;
        java.lang.Double double44 = point38.y;
        java.lang.Double double45 = point38.y;
        point38.x = 10.0d;
        boolean boolean48 = point33.equals((java.lang.Object) point38);
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        point51.y = 10.0d;
        point51.y = 10.0d;
        boolean boolean57 = point38.equals((java.lang.Object) point51);
        point51.x = 100.0d;
        java.lang.Double double60 = point51.y;
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point63.x = 0.0d;
        point63.y = 1.0d;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        point70.y = 1.0d;
        point70.x = 100.0d;
        point70.x = 10.0d;
        java.lang.Double double78 = point70.y;
        point70.y = 0.0d;
        java.lang.Double double81 = point70.x;
        boolean boolean82 = point63.equals((java.lang.Object) point70);
        java.lang.Double double83 = point70.x;
        point70.x = 1.0d;
        java.lang.Double double86 = point70.x;
        boolean boolean87 = point51.equals((java.lang.Object) double86);
        Line line88 = new Line(point2, point51);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        java.lang.Double double21 = point15.y;
        java.lang.Double double22 = point15.y;
        point15.y = 0.0d;
        java.lang.Double double25 = point15.x;
        point15.x = (-1.0d);
        boolean boolean28 = point2.equals((java.lang.Object) point15);
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 100.0d);
        java.lang.Double double32 = point31.x;
        point31.x = (-1.0d);
        java.lang.Double double35 = point31.y;
        Line line36 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        boolean boolean10 = point2.equals((java.lang.Object) 10);
        point2.x = 0.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.y;
        point15.x = 10.0d;
        point15.x = 0.0d;
        java.lang.Double double22 = point15.x;
        java.lang.Class<?> wildcardClass23 = point15.getClass();
        boolean boolean24 = point2.equals((java.lang.Object) wildcardClass23);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.x;
        point27.x = 0.0d;
        Line line33 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.x;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        boolean boolean24 = point17.equals((java.lang.Object) point20);
        point17.y = 0.0d;
        java.lang.Double double27 = point17.x;
        java.lang.Double double28 = point17.x;
        point17.x = (-1.0d);
        boolean boolean31 = point2.equals((java.lang.Object) point17);
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.x;
        java.lang.Double double36 = point34.y;
        point34.y = (-1.0d);
        point34.y = 0.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        point43.y = (-1.0d);
        java.lang.Double double48 = point43.y;
        java.lang.Double double49 = point43.y;
        point43.y = 1.0d;
        point43.y = 100.0d;
        point43.x = 1.0d;
        point43.y = (-1.0d);
        boolean boolean58 = point34.equals((java.lang.Object) point43);
        java.lang.Double double59 = point34.y;
        Point point62 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double63 = point62.x;
        java.lang.Double double64 = point62.x;
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double68 = point67.y;
        boolean boolean69 = point62.equals((java.lang.Object) double68);
        point62.x = (-1.0d);
        point62.x = (-1.0d);
        boolean boolean74 = point34.equals((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass75 = point34.getClass();
        boolean boolean76 = point2.equals((java.lang.Object) wildcardClass75);
        Point point79 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point79.y = 1.0d;
        point79.y = (-1.0d);
        java.lang.Double double84 = point79.y;
        java.lang.Double double85 = point79.y;
        point79.y = 1.0d;
        point79.y = 100.0d;
        point79.x = 1.0d;
        point79.y = (-1.0d);
        point79.y = 1.0d;
        java.lang.Double double96 = point79.y;
        point79.y = 0.0d;
        Line line99 = new Line(point2, point79);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double17 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double20 = point2.x;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.x;
        point23.y = 1.0d;
        java.lang.Double double31 = point23.x;
        point23.x = 100.0d;
        point23.x = (-1.0d);
        Line line36 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        point2.y = 1.0d;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        java.lang.Double double23 = point17.x;
        point17.x = 0.0d;
        point17.x = (-1.0d);
        Line line28 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 100.0d;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 100.0d;
        point18.x = 10.0d;
        java.lang.Double double26 = point18.y;
        point18.x = 0.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.y;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point40.y = 0.0d;
        java.lang.Double double43 = point40.y;
        java.lang.Double double44 = point40.x;
        boolean boolean45 = point31.equals((java.lang.Object) double44);
        boolean boolean47 = point31.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass48 = point31.getClass();
        boolean boolean49 = point18.equals((java.lang.Object) wildcardClass48);
        Line line50 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        point7.y = (-1.0d);
        java.lang.Double double12 = point7.y;
        java.lang.Double double13 = point7.y;
        point7.y = 1.0d;
        java.lang.Class<?> wildcardClass16 = point7.getClass();
        boolean boolean17 = point2.equals((java.lang.Object) wildcardClass16);
        point2.y = 100.0d;
        java.lang.Double double20 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double23 = point2.x;
        java.lang.Double double24 = point2.y;
        java.lang.Double double25 = point2.x;
        point2.y = 10.0d;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        point30.y = (-1.0d);
        java.lang.Double double35 = point30.y;
        java.lang.Double double36 = point30.y;
        Point point39 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        boolean boolean42 = point30.equals((java.lang.Object) point39);
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point45.y = 0.0d;
        java.lang.Double double48 = point45.y;
        boolean boolean49 = point39.equals((java.lang.Object) point45);
        point45.y = 10.0d;
        point45.y = 0.0d;
        Line line54 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.y = 1.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point7.y = (-1.0d);
        java.lang.Double double10 = point7.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.x;
        boolean boolean16 = point13.equals((java.lang.Object) 10.0f);
        point13.x = 100.0d;
        java.lang.Double double19 = point13.x;
        point13.y = 1.0d;
        boolean boolean22 = point7.equals((java.lang.Object) point13);
        java.lang.Double double23 = point13.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        boolean boolean29 = point26.equals((java.lang.Object) 1L);
        java.lang.Double double30 = point26.y;
        java.lang.Double double31 = point26.y;
        boolean boolean32 = point13.equals((java.lang.Object) point26);
        java.lang.Double double33 = point13.x;
        boolean boolean34 = point2.equals((java.lang.Object) point13);
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        java.lang.Double double40 = point37.y;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass44 = point43.getClass();
        boolean boolean45 = point37.equals((java.lang.Object) wildcardClass44);
        point37.y = 1.0d;
        Line line48 = new Line(point13, point37);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 100.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        point12.x = 100.0d;
        point12.x = 100.0d;
        java.lang.Double double20 = point12.y;
        point12.y = 0.0d;
        Line line23 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point2.y = 100.0d;
        java.lang.Object obj5 = null;
        boolean boolean6 = point2.equals(obj5);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        java.lang.Double double11 = point9.x;
        java.lang.Double double12 = point9.x;
        point9.y = 0.0d;
        boolean boolean16 = point9.equals((java.lang.Object) '#');
        point9.x = 0.0d;
        point9.y = 100.0d;
        boolean boolean21 = point2.equals((java.lang.Object) point9);
        point9.x = 100.0d;
        point9.y = 1.0d;
        java.lang.Double double26 = point9.y;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        java.lang.Double double31 = point29.y;
        java.lang.Double double32 = point29.x;
        point29.y = 1.0d;
        point29.x = 1.0d;
        Line line37 = new Line(point9, point29);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double13 = point2.x;
        point2.y = 1.0d;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point18.equals((java.lang.Object) 1.0d);
        java.lang.Double double27 = point18.y;
        java.lang.Double double28 = point18.x;
        java.lang.Double double29 = point18.x;
        Point point32 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.x;
        java.lang.Double double34 = point32.y;
        point32.y = (-1.0d);
        point32.y = 0.0d;
        point32.x = (-1.0d);
        boolean boolean41 = point18.equals((java.lang.Object) point32);
        point18.x = 10.0d;
        java.lang.Double double44 = point18.y;
        Line line45 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = (-1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.x = 10.0d;
        java.lang.Double double20 = point12.y;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = 0.0d;
        point2.y = (-1.0d);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        java.lang.Double double30 = point28.y;
        java.lang.Double double31 = point28.x;
        point28.y = 1.0d;
        point28.x = 1.0d;
        point28.y = (-1.0d);
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        point40.y = (-1.0d);
        java.lang.Double double45 = point40.y;
        point40.y = 100.0d;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        point50.y = 10.0d;
        boolean boolean58 = point40.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass59 = point40.getClass();
        boolean boolean60 = point28.equals((java.lang.Object) wildcardClass59);
        boolean boolean61 = point2.equals((java.lang.Object) boolean60);
        java.lang.Double double62 = point2.y;
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        point65.y = 1.0d;
        point65.x = 100.0d;
        java.lang.Double double71 = point65.y;
        point65.y = 100.0d;
        point65.x = (-1.0d);
        point65.x = 100.0d;
        java.lang.Double double78 = point65.y;
        point65.y = 100.0d;
        java.lang.Double double81 = point65.y;
        java.lang.Double double82 = point65.y;
        point65.x = 1.0d;
        Line line85 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point9.x = 0.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        Point point15 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double16 = point15.x;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        java.lang.Class<?> wildcardClass21 = point19.getClass();
        boolean boolean22 = point15.equals((java.lang.Object) wildcardClass21);
        point15.y = 1.0d;
        boolean boolean25 = point9.equals((java.lang.Object) point15);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        boolean boolean34 = point31.equals((java.lang.Object) 1L);
        java.lang.Double double35 = point31.y;
        boolean boolean36 = point28.equals((java.lang.Object) double35);
        point28.x = 10.0d;
        java.lang.Double double39 = point28.x;
        point28.y = 0.0d;
        java.lang.Double double42 = point28.x;
        java.lang.Double double43 = point28.x;
        Line line44 = new Line(point15, point28);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point9.x = 1.0d;
        point9.y = 1.0d;
        java.lang.Double double14 = point9.x;
        point9.x = (-1.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        point19.x = 10.0d;
        java.lang.Double double27 = point19.y;
        boolean boolean28 = point9.equals((java.lang.Object) double27);
        point9.y = (-1.0d);
        java.lang.Double double31 = point9.x;
        point9.y = 1.0d;
        java.lang.Double double34 = point9.y;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        java.lang.Double double40 = point37.y;
        point37.y = 0.0d;
        point37.x = 1.0d;
        boolean boolean45 = point9.equals((java.lang.Object) point37);
        boolean boolean46 = point2.equals((java.lang.Object) boolean45);
        java.lang.Double double47 = point2.x;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.y;
        java.lang.Double double52 = point50.y;
        java.lang.Double double53 = point50.x;
        point50.y = 1.0d;
        java.lang.Double double56 = point50.y;
        java.lang.Double double57 = point50.x;
        Line line58 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        point2.x = 100.0d;
        point2.x = (-1.0d);
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        java.lang.Double double21 = point19.y;
        java.lang.Double double22 = point19.y;
        point19.y = (-1.0d);
        point19.x = 0.0d;
        point19.y = 10.0d;
        java.lang.Double double29 = point19.y;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        java.lang.Double double35 = point32.y;
        java.lang.Double double36 = point32.y;
        point32.y = 10.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.x;
        boolean boolean44 = point41.equals((java.lang.Object) 10.0f);
        point41.x = 100.0d;
        java.lang.Double double47 = point41.x;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point50.x = 100.0d;
        boolean boolean53 = point41.equals((java.lang.Object) 100.0d);
        java.lang.Double double54 = point41.y;
        point41.y = 100.0d;
        boolean boolean57 = point32.equals((java.lang.Object) point41);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 0.0d;
        boolean boolean67 = point60.equals((java.lang.Object) "");
        boolean boolean68 = point41.equals((java.lang.Object) point60);
        boolean boolean69 = point19.equals((java.lang.Object) point60);
        Line line70 = new Line(point2, point60);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        boolean boolean9 = point2.equals((java.lang.Object) 'a');
        point2.x = 10.0d;
        point2.x = 0.0d;
        java.lang.Double double14 = point2.y;
        point2.y = 1.0d;
        point2.x = 10.0d;
        java.lang.Double double19 = point2.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.x;
        boolean boolean25 = point22.equals((java.lang.Object) 10.0f);
        point22.x = 100.0d;
        java.lang.Double double28 = point22.x;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point31.x = 100.0d;
        boolean boolean34 = point22.equals((java.lang.Object) 100.0d);
        point22.x = 10.0d;
        java.lang.Double double37 = point22.x;
        point22.x = 0.0d;
        Line line40 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        boolean boolean11 = point2.equals((java.lang.Object) 0L);
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point16.equals((java.lang.Object) double23);
        java.lang.Double double25 = point16.y;
        java.lang.Double double26 = point16.x;
        boolean boolean27 = point2.equals((java.lang.Object) double26);
        java.lang.Double double28 = point2.x;
        point2.y = (-1.0d);
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        point33.y = 0.0d;
        point33.x = 0.0d;
        point33.y = 100.0d;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point46.y = 0.0d;
        java.lang.Double double49 = point46.x;
        point46.x = 0.0d;
        boolean boolean52 = point33.equals((java.lang.Object) 0.0d);
        point33.x = 0.0d;
        Line line55 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        java.lang.Double double10 = point6.y;
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = point6.equals(obj11);
        java.lang.Double double13 = point6.y;
        java.lang.Class<?> wildcardClass14 = point6.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) point6);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point18.y = 100.0d;
        point18.y = 0.0d;
        boolean boolean23 = point2.equals((java.lang.Object) 0.0d);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point26.x = 0.0d;
        point26.x = 1.0d;
        point26.x = (-1.0d);
        boolean boolean33 = point2.equals((java.lang.Object) (-1.0d));
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.y;
        java.lang.Double double39 = point36.x;
        java.lang.Double double40 = point36.y;
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.x;
        point43.y = 0.0d;
        java.lang.Double double48 = point43.x;
        java.lang.Double double49 = point43.y;
        boolean boolean50 = point36.equals((java.lang.Object) point43);
        point43.y = (-1.0d);
        java.lang.Double double53 = point43.y;
        java.lang.Double double54 = point43.y;
        point43.y = (-1.0d);
        point43.y = 100.0d;
        Line line59 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double6 = point2.y;
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj12 = null;
        boolean boolean13 = point11.equals(obj12);
        point11.y = 0.0d;
        Line line16 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.y = 10.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point18.x = 1.0d;
        point18.y = 1.0d;
        point18.y = (-1.0d);
        point18.y = 10.0d;
        point18.y = 1.0d;
        java.lang.Double double29 = point18.x;
        java.lang.Double double30 = point18.y;
        java.lang.Double double31 = point18.x;
        point18.y = (-1.0d);
        Point point36 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        point39.y = 100.0d;
        boolean boolean46 = point36.equals((java.lang.Object) 100.0d);
        java.lang.Double double47 = point36.y;
        point36.x = (-1.0d);
        java.lang.Double double50 = point36.x;
        boolean boolean51 = point18.equals((java.lang.Object) point36);
        Line line52 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        point21.x = 10.0d;
        java.lang.Double double29 = point21.y;
        point21.y = 0.0d;
        java.lang.Double double32 = point21.y;
        java.lang.Double double33 = point21.y;
        java.lang.Double double34 = point21.y;
        point21.x = 0.0d;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.y;
        java.lang.Double double45 = point39.y;
        point39.y = 1.0d;
        point39.y = 100.0d;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj53 = null;
        boolean boolean54 = point52.equals(obj53);
        boolean boolean55 = point39.equals((java.lang.Object) point52);
        point39.x = 100.0d;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        java.lang.Double double65 = point63.y;
        boolean boolean66 = point60.equals((java.lang.Object) point63);
        java.lang.Double double67 = point63.x;
        boolean boolean68 = point39.equals((java.lang.Object) point63);
        java.lang.Double double69 = point39.y;
        boolean boolean70 = point21.equals((java.lang.Object) double69);
        java.lang.Double double71 = point21.x;
        Line line72 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.y = 0.0d;
        point2.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point20.y = 0.0d;
        java.lang.Double double23 = point20.y;
        point20.x = 100.0d;
        point20.x = 100.0d;
        java.lang.Double double28 = point20.y;
        java.lang.Double double29 = point20.y;
        boolean boolean30 = point2.equals((java.lang.Object) point20);
        java.lang.Double double31 = point20.y;
        point20.y = 10.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        point36.y = 10.0d;
        java.lang.Double double43 = point36.y;
        point36.x = 10.0d;
        point36.x = 0.0d;
        point36.x = 1.0d;
        java.lang.Double double50 = point36.x;
        Line line51 = new Line(point20, point36);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.x = (-1.0d);
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point11.y = (-1.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.x;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.y;
        java.lang.Double double27 = point21.y;
        point21.y = 1.0d;
        java.lang.Class<?> wildcardClass30 = point21.getClass();
        boolean boolean31 = point16.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = point11.equals((java.lang.Object) boolean31);
        java.lang.Double double33 = point11.y;
        Line line34 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = point8.getClass();
        boolean boolean10 = point2.equals((java.lang.Object) wildcardClass9);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        boolean boolean19 = point16.equals((java.lang.Object) 1L);
        java.lang.Double double20 = point16.y;
        boolean boolean21 = point13.equals((java.lang.Object) double20);
        java.lang.Double double22 = point13.y;
        java.lang.Double double23 = point13.x;
        boolean boolean24 = point2.equals((java.lang.Object) point13);
        point2.x = 100.0d;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point29.x = 100.0d;
        point29.x = 10.0d;
        point29.x = 10.0d;
        Line line36 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.y;
        point16.y = (-1.0d);
        point16.y = 0.0d;
        point16.x = (-1.0d);
        boolean boolean25 = point2.equals((java.lang.Object) point16);
        java.lang.Double double26 = point16.y;
        java.lang.Double double27 = point16.y;
        point16.x = 100.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 1.0d;
        java.lang.Object obj38 = null;
        boolean boolean39 = point32.equals(obj38);
        point32.x = 1.0d;
        point32.y = 10.0d;
        point32.y = 10.0d;
        point32.y = (-1.0d);
        point32.x = 1.0d;
        Line line50 = new Line(point16, point32);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 10.0d;
        java.lang.Double double22 = point15.y;
        point15.x = 10.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        point27.y = 1.0d;
        java.lang.Double double32 = point27.x;
        point27.x = (-1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        boolean boolean46 = point27.equals((java.lang.Object) double45);
        point27.y = (-1.0d);
        java.lang.Double double49 = point27.x;
        point27.y = 1.0d;
        boolean boolean52 = point15.equals((java.lang.Object) 1.0d);
        boolean boolean53 = point2.equals((java.lang.Object) point15);
        point15.x = 1.0d;
        java.lang.Double double56 = point15.y;
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point59.y = 1.0d;
        java.lang.Double double62 = point59.y;
        java.lang.Double double63 = point59.y;
        point59.x = 0.0d;
        point59.y = 10.0d;
        java.lang.Double double68 = point59.x;
        Line line69 = new Line(point15, point59);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 0.0d;
        point2.y = 100.0d;
        point2.y = 10.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        java.lang.Double double26 = point22.y;
        boolean boolean27 = point19.equals((java.lang.Object) double26);
        java.lang.Double double28 = point19.y;
        java.lang.Double double29 = point19.y;
        java.lang.Double double30 = point19.y;
        java.lang.Double double31 = point19.y;
        java.lang.Double double32 = point19.x;
        boolean boolean33 = point2.equals((java.lang.Object) point19);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point36.y = 0.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        java.lang.Double double41 = point36.y;
        java.lang.Double double42 = point36.x;
        Line line43 = new Line(point19, point36);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        java.lang.Double double17 = point14.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        java.lang.Double double24 = point20.y;
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = point20.equals(obj25);
        point20.x = 1.0d;
        java.lang.Double double29 = point20.x;
        boolean boolean30 = point14.equals((java.lang.Object) double29);
        java.lang.Double double31 = point14.x;
        point14.x = 10.0d;
        java.lang.Double double34 = point14.x;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.y = 10.0d;
        java.lang.Object obj45 = null;
        boolean boolean46 = point37.equals(obj45);
        boolean boolean47 = point14.equals((java.lang.Object) point37);
        boolean boolean48 = point2.equals((java.lang.Object) point14);
        Point point51 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 0.0d;
        java.lang.Double double55 = point51.y;
        point51.y = (-1.0d);
        point51.y = 100.0d;
        java.lang.Double double60 = point51.y;
        point51.y = 100.0d;
        Line line63 = new Line(point14, point51);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.x = 100.0d;
        point2.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.x;
        boolean boolean15 = point12.equals((java.lang.Object) 10.0f);
        point12.x = 100.0d;
        java.lang.Double double18 = point12.x;
        point12.y = 1.0d;
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        point23.y = 10.0d;
        point23.y = (-1.0d);
        java.lang.Class<?> wildcardClass29 = point23.getClass();
        boolean boolean30 = point12.equals((java.lang.Object) wildcardClass29);
        java.lang.Double double31 = point12.y;
        point12.x = 1.0d;
        boolean boolean34 = point2.equals((java.lang.Object) point12);
        java.lang.Double double35 = point2.y;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point38.y = 0.0d;
        java.lang.Double double41 = point38.y;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        java.lang.Double double48 = point44.y;
        java.lang.Object obj49 = new java.lang.Object();
        boolean boolean50 = point44.equals(obj49);
        point44.x = 1.0d;
        java.lang.Double double53 = point44.x;
        boolean boolean54 = point38.equals((java.lang.Object) double53);
        java.lang.Double double55 = point38.x;
        point38.x = 10.0d;
        java.lang.Double double58 = point38.x;
        java.lang.Double double59 = point38.y;
        point38.y = (-1.0d);
        Line line62 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        point2.x = 100.0d;
        java.lang.Double double18 = point2.x;
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 1.0d;
        java.lang.Object obj28 = null;
        boolean boolean29 = point22.equals(obj28);
        point22.x = 1.0d;
        boolean boolean33 = point22.equals((java.lang.Object) false);
        java.lang.Double double34 = point22.x;
        java.lang.Double double35 = point22.x;
        java.lang.Double double36 = point22.y;
        Line line37 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double16 = point15.x;
        point15.x = 1.0d;
        java.lang.Double double19 = point15.x;
        Line line20 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double16 = point2.x;
        point2.x = 10.0d;
        point2.x = 10.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        boolean boolean26 = point23.equals((java.lang.Object) 10.0f);
        point23.x = 100.0d;
        java.lang.Double double29 = point23.x;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point32.x = 100.0d;
        boolean boolean35 = point23.equals((java.lang.Object) 100.0d);
        java.lang.Double double36 = point23.y;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point42.x = 1.0d;
        point42.y = 1.0d;
        boolean boolean47 = point39.equals((java.lang.Object) 1.0d);
        java.lang.Double double48 = point39.y;
        point39.x = 0.0d;
        boolean boolean51 = point23.equals((java.lang.Object) 0.0d);
        point23.x = 100.0d;
        java.lang.Object obj54 = null;
        boolean boolean55 = point23.equals(obj54);
        point23.x = 0.0d;
        Line line58 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        point14.y = 100.0d;
        point14.x = (-1.0d);
        java.lang.Double double23 = point14.x;
        boolean boolean24 = point2.equals((java.lang.Object) double23);
        point2.y = (-1.0d);
        java.lang.Double double27 = point2.x;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 1.0d;
        boolean boolean37 = point30.equals((java.lang.Object) 'a');
        point30.x = 10.0d;
        point30.x = 0.0d;
        java.lang.Double double42 = point30.y;
        point30.y = 1.0d;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        point47.x = 100.0d;
        point47.y = 100.0d;
        java.lang.Double double55 = point47.y;
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        java.lang.Double double63 = point61.y;
        boolean boolean64 = point58.equals((java.lang.Object) point61);
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        java.lang.Double double69 = point67.y;
        boolean boolean70 = point61.equals((java.lang.Object) double69);
        Point point73 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double74 = point73.y;
        java.lang.Double double75 = point73.x;
        java.lang.Double double76 = point73.x;
        Point point79 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point79.y = 0.0d;
        java.lang.Double double82 = point79.y;
        point79.x = 100.0d;
        point79.x = 100.0d;
        java.lang.Double double87 = point79.y;
        boolean boolean88 = point73.equals((java.lang.Object) point79);
        java.lang.Double double89 = point79.x;
        boolean boolean90 = point61.equals((java.lang.Object) point79);
        point61.x = 100.0d;
        boolean boolean93 = point47.equals((java.lang.Object) 100.0d);
        point47.y = 1.0d;
        boolean boolean96 = point30.equals((java.lang.Object) point47);
        Line line97 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double13 = point12.x;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Class<?> wildcardClass18 = point16.getClass();
        boolean boolean19 = point12.equals((java.lang.Object) wildcardClass18);
        point12.x = 0.0d;
        point12.y = 0.0d;
        boolean boolean24 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double25 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double28 = point2.y;
        Point point31 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point34.x = 1.0d;
        point34.x = 1.0d;
        boolean boolean39 = point31.equals((java.lang.Object) 1.0d);
        point31.y = (-1.0d);
        point31.y = 1.0d;
        Point point46 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.y;
        point46.y = 100.0d;
        java.lang.Double double50 = point46.y;
        boolean boolean51 = point31.equals((java.lang.Object) double50);
        Line line52 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        boolean boolean16 = point2.equals((java.lang.Object) double15);
        boolean boolean18 = point2.equals((java.lang.Object) false);
        point2.y = (-1.0d);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point23.y = 10.0d;
        java.lang.Double double26 = point23.x;
        point23.y = 1.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        point31.y = 10.0d;
        point31.y = 10.0d;
        point31.x = 0.0d;
        boolean boolean43 = point23.equals((java.lang.Object) point31);
        point31.y = (-1.0d);
        point31.x = 1.0d;
        Line line48 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        point2.y = 1.0d;
        java.lang.Double double19 = point2.y;
        point2.x = 0.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point2.equals(obj22);
        java.lang.Double double24 = point2.y;
        java.lang.Double double25 = point2.y;
        java.lang.Double double26 = point2.y;
        point2.y = 100.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 1.0d;
        point31.y = (-1.0d);
        java.lang.Double double36 = point31.y;
        java.lang.Double double37 = point31.y;
        point31.y = 1.0d;
        point31.y = 100.0d;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj45 = null;
        boolean boolean46 = point44.equals(obj45);
        boolean boolean47 = point31.equals((java.lang.Object) point44);
        point31.x = 100.0d;
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        java.lang.Double double57 = point55.y;
        boolean boolean58 = point52.equals((java.lang.Object) point55);
        java.lang.Double double59 = point55.x;
        boolean boolean60 = point31.equals((java.lang.Object) point55);
        point55.y = 1.0d;
        java.lang.Double double63 = point55.y;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point66.y = 1.0d;
        java.lang.Double double69 = point66.y;
        java.lang.Double double70 = point66.y;
        point66.y = 0.0d;
        point66.x = 0.0d;
        point66.y = 100.0d;
        boolean boolean77 = point55.equals((java.lang.Object) point66);
        java.lang.Double double78 = point55.y;
        point55.y = 10.0d;
        java.lang.Double double81 = point55.y;
        point55.y = 100.0d;
        Line line84 = new Line(point2, point55);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.x = 1.0d;
        point11.y = 1.0d;
        java.lang.Double double16 = point11.x;
        point11.x = (-1.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        point21.x = 10.0d;
        java.lang.Double double29 = point21.y;
        boolean boolean30 = point11.equals((java.lang.Object) double29);
        point11.y = 0.0d;
        java.lang.Double double33 = point11.y;
        java.lang.Double double34 = point11.y;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        java.lang.Double double40 = point37.y;
        point37.x = 100.0d;
        java.lang.Class<?> wildcardClass43 = point37.getClass();
        boolean boolean44 = point11.equals((java.lang.Object) wildcardClass43);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.x;
        Point point54 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double55 = point54.y;
        java.lang.Double double56 = point54.y;
        boolean boolean57 = point47.equals((java.lang.Object) point54);
        boolean boolean58 = point11.equals((java.lang.Object) point47);
        java.lang.Double double59 = point47.x;
        java.lang.Double double60 = point47.y;
        Point point63 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point66.x = 1.0d;
        point66.x = 1.0d;
        boolean boolean71 = point63.equals((java.lang.Object) 1.0d);
        boolean boolean72 = point47.equals((java.lang.Object) point63);
        boolean boolean73 = point2.equals((java.lang.Object) point63);
        point2.y = 100.0d;
        Point point78 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point78.x = 100.0d;
        point78.x = 0.0d;
        Line line83 = new Line(point2, point78);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.x = 10.0d;
        java.lang.Double double17 = point9.y;
        point9.y = 0.0d;
        java.lang.Double double20 = point9.x;
        boolean boolean21 = point2.equals((java.lang.Object) point9);
        java.lang.Double double22 = point9.x;
        point9.y = (-1.0d);
        Point point27 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.y;
        java.lang.Double double30 = point27.x;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double34 = point33.y;
        boolean boolean36 = point33.equals((java.lang.Object) 0.0d);
        boolean boolean37 = point27.equals((java.lang.Object) point33);
        point27.x = 1.0d;
        Line line40 = new Line(point9, point27);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        point8.y = (-1.0d);
        point8.y = 100.0d;
        point8.x = (-1.0d);
        java.lang.Double double17 = point8.y;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double21 = point20.x;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.y;
        java.lang.Double double27 = point24.x;
        boolean boolean28 = point20.equals((java.lang.Object) point24);
        point20.x = (-1.0d);
        java.lang.Double double31 = point20.x;
        boolean boolean32 = point8.equals((java.lang.Object) point20);
        boolean boolean33 = point2.equals((java.lang.Object) point8);
        java.lang.Double double34 = point2.x;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point37.x = 0.0d;
        point37.y = 1.0d;
        point37.y = 1.0d;
        java.lang.Double double44 = point37.x;
        point37.x = (-1.0d);
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double50 = point49.y;
        java.lang.Double double51 = point49.x;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean56 = point54.equals((java.lang.Object) true);
        boolean boolean57 = point49.equals((java.lang.Object) true);
        java.lang.Double double58 = point49.y;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        point61.y = 0.0d;
        boolean boolean67 = point49.equals((java.lang.Object) point61);
        boolean boolean68 = point37.equals((java.lang.Object) point49);
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        point71.y = 1.0d;
        point71.x = 100.0d;
        java.lang.Double double77 = point71.y;
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point80.y = 0.0d;
        java.lang.Double double83 = point80.y;
        java.lang.Double double84 = point80.x;
        boolean boolean85 = point71.equals((java.lang.Object) double84);
        java.lang.Double double86 = point71.x;
        boolean boolean87 = point49.equals((java.lang.Object) point71);
        Line line88 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        java.lang.Double double19 = point16.y;
        point16.x = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point16);
        Point point25 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double26 = point25.x;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        java.lang.Class<?> wildcardClass31 = point29.getClass();
        boolean boolean32 = point25.equals((java.lang.Object) wildcardClass31);
        point25.x = 0.0d;
        point25.y = 1.0d;
        Line line37 = new Line(point16, point25);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 0.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        java.lang.Double double14 = point10.y;
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = point10.equals(obj15);
        java.lang.Double double17 = point10.x;
        java.lang.Double double18 = point10.y;
        point10.x = (-1.0d);
        boolean boolean21 = point2.equals((java.lang.Object) (-1.0d));
        point2.y = 10.0d;
        java.lang.Double double24 = point2.x;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean33 = point30.equals((java.lang.Object) 1L);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.x;
        boolean boolean39 = point36.equals((java.lang.Object) 10.0f);
        point36.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass43 = point30.getClass();
        boolean boolean44 = point27.equals((java.lang.Object) wildcardClass43);
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        java.lang.Double double52 = point50.y;
        boolean boolean53 = point47.equals((java.lang.Object) point50);
        point47.x = 10.0d;
        boolean boolean56 = point27.equals((java.lang.Object) point47);
        point47.x = 10.0d;
        Line line59 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        point5.y = 1.0d;
        point5.y = 0.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.x;
        boolean boolean17 = point5.equals((java.lang.Object) double16);
        point5.y = 0.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point5);
        point5.x = (-1.0d);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.x;
        boolean boolean28 = point25.equals((java.lang.Object) 10.0f);
        point25.x = 100.0d;
        java.lang.Double double31 = point25.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 100.0d;
        boolean boolean37 = point25.equals((java.lang.Object) 100.0d);
        point25.x = 10.0d;
        java.lang.Double double40 = point25.x;
        java.lang.Double double41 = point25.x;
        Line line42 = new Line(point5, point25);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.y;
        Point point10 = null;
        Line line11 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }
}

