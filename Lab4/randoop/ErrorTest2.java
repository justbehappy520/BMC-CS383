import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
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
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean37 = point35.equals((java.lang.Object) true);
        boolean boolean38 = point30.equals((java.lang.Object) true);
        java.lang.Double double39 = point30.y;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.y = 0.0d;
        boolean boolean48 = point30.equals((java.lang.Object) point42);
        boolean boolean49 = point11.equals((java.lang.Object) point42);
        java.lang.Double double50 = point42.x;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 100.0d;
        point53.x = 10.0d;
        java.lang.Double double61 = point53.y;
        point53.y = 0.0d;
        java.lang.Double double64 = point53.x;
        java.lang.Double double65 = point53.x;
        java.lang.Double double66 = point53.x;
        java.lang.Double double67 = point53.y;
        Line line68 = new Line(point42, point53);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
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
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        point20.y = 0.0d;
        point20.y = (-1.0d);
        point20.y = (-1.0d);
        point20.x = 0.0d;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        point33.x = 1.0d;
        java.lang.Object obj39 = null;
        boolean boolean40 = point33.equals(obj39);
        point33.x = 1.0d;
        boolean boolean44 = point33.equals((java.lang.Object) false);
        java.lang.Double double45 = point33.x;
        java.lang.Double double46 = point33.x;
        boolean boolean47 = point20.equals((java.lang.Object) point33);
        java.lang.Double double48 = point20.x;
        Line line49 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double10 = point9.y;
        java.lang.Double double11 = point9.y;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        java.lang.Double double13 = point9.y;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point16.equals((java.lang.Object) double23);
        java.lang.Double double25 = point16.y;
        java.lang.Double double26 = point16.x;
        point16.x = 100.0d;
        point16.y = 0.0d;
        java.lang.Object obj31 = null;
        boolean boolean32 = point16.equals(obj31);
        boolean boolean33 = point9.equals((java.lang.Object) point16);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.x;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean43 = point41.equals((java.lang.Object) true);
        boolean boolean44 = point36.equals((java.lang.Object) true);
        java.lang.Double double45 = point36.y;
        java.lang.Double double46 = point36.x;
        Line line47 = new Line(point9, point36);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
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
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 100.0d;
        point22.x = 10.0d;
        java.lang.Double double30 = point22.y;
        point22.y = 0.0d;
        java.lang.Double double33 = point22.x;
        point22.y = (-1.0d);
        point22.y = 10.0d;
        point22.x = 100.0d;
        Line line40 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        java.lang.Double double42 = point39.y;
        point39.x = 100.0d;
        point39.x = 100.0d;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        point49.x = 100.0d;
        point49.y = 10.0d;
        boolean boolean58 = point49.equals((java.lang.Object) 0L);
        java.lang.Double double59 = point49.y;
        boolean boolean60 = point39.equals((java.lang.Object) double59);
        Line line61 = new Line(point5, point39);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
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
        point2.y = 100.0d;
        java.lang.Double double23 = point2.x;
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point5.equals((java.lang.Object) boolean24);
        java.lang.Double double26 = point5.x;
        point5.y = (-1.0d);
        point5.y = 100.0d;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.y;
        java.lang.Double double36 = point33.x;
        point33.x = 100.0d;
        point33.x = 1.0d;
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
        point43.x = 1.0d;
        boolean boolean65 = point33.equals((java.lang.Object) point43);
        java.lang.Double double66 = point33.y;
        Line line67 = new Line(point5, point33);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
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
        java.lang.Double double24 = point2.x;
        point2.y = 0.0d;
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        java.lang.Double double34 = point30.y;
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = point30.equals(obj35);
        point30.x = 1.0d;
        java.lang.Double double39 = point30.y;
        point30.y = 100.0d;
        point30.x = 0.0d;
        point30.x = 100.0d;
        Line line46 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        boolean boolean32 = point15.equals((java.lang.Object) point29);
        java.lang.Double double33 = point15.y;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.x;
        boolean boolean39 = point36.equals((java.lang.Object) 10.0f);
        point36.x = 100.0d;
        java.lang.Double double42 = point36.x;
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point45.x = 100.0d;
        boolean boolean48 = point36.equals((java.lang.Object) 100.0d);
        java.lang.Double double49 = point36.y;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point55.x = 1.0d;
        point55.y = 1.0d;
        boolean boolean60 = point52.equals((java.lang.Object) 1.0d);
        java.lang.Double double61 = point52.y;
        point52.x = 0.0d;
        boolean boolean64 = point36.equals((java.lang.Object) 0.0d);
        point36.y = 0.0d;
        Line line67 = new Line(point15, point36);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        point2.y = 100.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point19.x = 1.0d;
        point19.y = 1.0d;
        point19.y = (-1.0d);
        point19.y = 10.0d;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.x;
        java.lang.Double double33 = point30.x;
        point30.y = 0.0d;
        boolean boolean37 = point30.equals((java.lang.Object) '#');
        point30.x = 0.0d;
        point30.y = 100.0d;
        java.lang.Double double42 = point30.x;
        boolean boolean43 = point19.equals((java.lang.Object) double42);
        java.lang.Double double44 = point19.x;
        boolean boolean45 = point2.equals((java.lang.Object) point19);
        java.lang.Double double46 = point2.x;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.y;
        point52.y = 10.0d;
        boolean boolean56 = point49.equals((java.lang.Object) point52);
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass60 = point59.getClass();
        boolean boolean61 = point52.equals((java.lang.Object) wildcardClass60);
        Point point64 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point64.x = 1.0d;
        boolean boolean67 = point52.equals((java.lang.Object) point64);
        java.lang.Double double68 = point52.y;
        point52.y = 0.0d;
        point52.x = 0.0d;
        Line line73 = new Line(point2, point52);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        point13.y = 0.0d;
        java.lang.Double double24 = point13.x;
        java.lang.Double double25 = point13.x;
        java.lang.Double double26 = point13.x;
        java.lang.Double double27 = point13.y;
        Line line28 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
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
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        java.lang.Double double28 = point25.y;
        java.lang.Double double29 = point25.y;
        point25.y = 10.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 100.0d;
        boolean boolean46 = point34.equals((java.lang.Object) 100.0d);
        java.lang.Double double47 = point34.y;
        point34.y = 100.0d;
        boolean boolean50 = point25.equals((java.lang.Object) point34);
        Line line51 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
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
        point2.x = 0.0d;
        point2.y = 0.0d;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.y;
        point24.y = 0.0d;
        point24.x = 10.0d;
        java.lang.Double double33 = point24.y;
        Line line34 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double12 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point18.x = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.x;
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
        point27.x = 1.0d;
        boolean boolean45 = point18.equals((java.lang.Object) point27);
        Line line46 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
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
        point2.y = (-1.0d);
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 0.0d;
        point28.x = 10.0d;
        point28.y = 1.0d;
        point28.y = 0.0d;
        Line line41 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
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
        java.lang.Double double24 = point2.x;
        point2.y = 0.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.x;
        java.lang.Double double31 = point29.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        point34.y = (-1.0d);
        java.lang.Double double39 = point34.y;
        java.lang.Double double40 = point34.y;
        point34.y = 1.0d;
        java.lang.Class<?> wildcardClass43 = point34.getClass();
        boolean boolean44 = point29.equals((java.lang.Object) wildcardClass43);
        java.lang.Double double45 = point29.y;
        java.lang.Double double46 = point29.x;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.x;
        boolean boolean52 = point49.equals((java.lang.Object) 10.0f);
        point49.x = 100.0d;
        java.lang.Double double55 = point49.x;
        Point point58 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.x;
        java.lang.Double double60 = point58.y;
        point58.y = (-1.0d);
        java.lang.Double double63 = point58.y;
        java.lang.Double double64 = point58.x;
        boolean boolean65 = point49.equals((java.lang.Object) double64);
        point49.x = 100.0d;
        java.lang.Class<?> wildcardClass68 = point49.getClass();
        boolean boolean69 = point29.equals((java.lang.Object) point49);
        boolean boolean70 = point2.equals((java.lang.Object) point29);
        Point point73 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point76.x = 1.0d;
        point76.y = 1.0d;
        boolean boolean81 = point73.equals((java.lang.Object) 1.0d);
        java.lang.Double double82 = point73.y;
        java.lang.Double double83 = point73.x;
        java.lang.Double double84 = point73.x;
        Point point87 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double88 = point87.x;
        java.lang.Double double89 = point87.y;
        point87.y = (-1.0d);
        point87.y = 0.0d;
        point87.x = (-1.0d);
        boolean boolean96 = point73.equals((java.lang.Object) point87);
        Line line97 = new Line(point2, point73);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 1.0d;
        java.lang.Double double18 = point12.y;
        java.lang.Double double19 = point12.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean24 = point12.equals((java.lang.Object) point22);
        Line line25 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.x = 0.0d;
        point2.x = 10.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 100.0d;
        point11.y = 10.0d;
        point11.y = 100.0d;
        java.lang.Double double21 = point11.y;
        java.lang.Double double22 = point11.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point25.x = 1.0d;
        point25.y = 1.0d;
        java.lang.Double double30 = point25.x;
        point25.x = (-1.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 100.0d;
        point35.x = 10.0d;
        java.lang.Double double43 = point35.y;
        boolean boolean44 = point25.equals((java.lang.Object) double43);
        point25.y = 0.0d;
        boolean boolean47 = point11.equals((java.lang.Object) 0.0d);
        Line line48 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point2.y = 100.0d;
        java.lang.Object obj5 = null;
        boolean boolean6 = point2.equals(obj5);
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.x;
        boolean boolean23 = point20.equals((java.lang.Object) 10.0f);
        point20.x = 100.0d;
        boolean boolean26 = point14.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass27 = point14.getClass();
        boolean boolean28 = point11.equals((java.lang.Object) wildcardClass27);
        java.lang.Double double29 = point11.y;
        Line line30 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        point13.y = (-1.0d);
        java.lang.Double double18 = point13.y;
        java.lang.Double double19 = point13.y;
        Point point22 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        boolean boolean25 = point13.equals((java.lang.Object) point22);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        java.lang.Double double31 = point28.y;
        boolean boolean32 = point22.equals((java.lang.Object) point28);
        java.lang.Double double33 = point22.x;
        java.lang.Double double34 = point22.x;
        Line line35 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        point7.y = (-1.0d);
        point7.y = 100.0d;
        point7.x = (-1.0d);
        point7.x = (-1.0d);
        java.lang.Double double18 = point7.y;
        java.lang.Double double19 = point7.y;
        boolean boolean20 = point2.equals((java.lang.Object) point7);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point23.x = 100.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        java.lang.Double double34 = point28.y;
        java.lang.Double double35 = point28.y;
        point28.x = 10.0d;
        boolean boolean38 = point23.equals((java.lang.Object) point28);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        point41.y = 10.0d;
        point41.y = 10.0d;
        boolean boolean47 = point28.equals((java.lang.Object) point41);
        java.lang.Double double48 = point28.x;
        Point point51 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.x;
        java.lang.Double double53 = point51.y;
        java.lang.Double double54 = point51.y;
        point51.y = (-1.0d);
        boolean boolean57 = point28.equals((java.lang.Object) (-1.0d));
        Point point60 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point60.y = 1.0d;
        java.lang.Double double63 = point60.y;
        java.lang.Double double64 = point60.y;
        point60.y = 0.0d;
        point60.y = 1.0d;
        point60.y = 1.0d;
        boolean boolean71 = point28.equals((java.lang.Object) point60);
        Line line72 = new Line(point2, point60);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
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
        java.lang.Double double26 = point2.y;
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        point30.y = (-1.0d);
        java.lang.Double double35 = point30.y;
        java.lang.Double double36 = point30.y;
        point30.y = 1.0d;
        point30.y = 100.0d;
        point30.x = 1.0d;
        point30.y = (-1.0d);
        point30.y = 1.0d;
        java.lang.Double double47 = point30.y;
        Line line48 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
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
        point2.y = (-1.0d);
        java.lang.Double double26 = point2.x;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point29.y = 10.0d;
        java.lang.Double double32 = point29.x;
        java.lang.Double double33 = point29.x;
        Line line34 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        point18.y = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point18);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.x;
        boolean boolean28 = point25.equals((java.lang.Object) 10.0f);
        point25.x = 100.0d;
        java.lang.Double double31 = point25.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 100.0d;
        boolean boolean37 = point25.equals((java.lang.Object) 100.0d);
        java.lang.Double double38 = point25.y;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        boolean boolean49 = point41.equals((java.lang.Object) 1.0d);
        java.lang.Double double50 = point41.y;
        point41.x = 0.0d;
        boolean boolean53 = point25.equals((java.lang.Object) 0.0d);
        java.lang.Double double54 = point25.x;
        java.lang.Double double55 = point25.x;
        Line line56 = new Line(point18, point25);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        point7.x = 100.0d;
        point7.x = 100.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        point43.y = (-1.0d);
        java.lang.Double double48 = point43.y;
        java.lang.Double double49 = point43.x;
        point43.x = 10.0d;
        Line line52 = new Line(point7, point43);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
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
        java.lang.Double double34 = point2.x;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        point37.y = (-1.0d);
        java.lang.Double double42 = point37.x;
        point37.y = 1.0d;
        java.lang.Double double45 = point37.x;
        java.lang.Double double46 = point37.y;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        point49.x = 1.0d;
        java.lang.Object obj55 = null;
        boolean boolean56 = point49.equals(obj55);
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point59.y = 0.0d;
        java.lang.Double double62 = point59.y;
        java.lang.Double double63 = point59.x;
        point59.x = 1.0d;
        boolean boolean66 = point49.equals((java.lang.Object) 1.0d);
        boolean boolean67 = point37.equals((java.lang.Object) point49);
        Line line68 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean10 = point2.equals((java.lang.Object) 100.0d);
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point13.y = (-1.0d);
        point13.x = 100.0d;
        Line line18 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point43.y = 100.0d;
        java.lang.Double double46 = point43.x;
        java.lang.Object obj47 = null;
        boolean boolean48 = point43.equals(obj47);
        Point point51 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.x;
        java.lang.Double double54 = point51.x;
        boolean boolean55 = point43.equals((java.lang.Object) point51);
        Line line56 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
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
        java.lang.Double double70 = point46.x;
        point46.x = 100.0d;
        Line line73 = new Line(point19, point46);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        point2.x = 0.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point32.y = 0.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point37.y = (-1.0d);
        java.lang.Double double40 = point37.x;
        point37.x = (-1.0d);
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.x;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean52 = point50.equals((java.lang.Object) true);
        boolean boolean53 = point45.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass54 = point45.getClass();
        boolean boolean55 = point37.equals((java.lang.Object) wildcardClass54);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        point58.y = 1.0d;
        point58.x = 1.0d;
        java.lang.Object obj64 = null;
        boolean boolean65 = point58.equals(obj64);
        point58.x = 1.0d;
        point58.x = (-1.0d);
        java.lang.Double double70 = point58.x;
        boolean boolean71 = point37.equals((java.lang.Object) point58);
        boolean boolean72 = point32.equals((java.lang.Object) point37);
        boolean boolean73 = point2.equals((java.lang.Object) point37);
        Point point76 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point76.x = 0.0d;
        point76.y = 1.0d;
        Line line81 = new Line(point37, point76);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
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
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        point29.x = 0.0d;
        point29.x = 1.0d;
        point29.x = (-1.0d);
        boolean boolean40 = point2.equals((java.lang.Object) point29);
        Point point43 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double44 = point43.x;
        point43.x = 1.0d;
        java.lang.Double double47 = point43.x;
        point43.x = 100.0d;
        java.lang.Double double50 = point43.y;
        Line line51 = new Line(point29, point43);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        point2.x = 10.0d;
        java.lang.Double double7 = point2.y;
        point2.x = 0.0d;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.y;
        point12.y = 10.0d;
        java.lang.Double double19 = point12.y;
        point12.x = 0.0d;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.x;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        point28.y = (-1.0d);
        boolean boolean33 = point24.equals((java.lang.Object) point28);
        boolean boolean34 = point12.equals((java.lang.Object) point28);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        point37.y = (-1.0d);
        java.lang.Double double43 = point37.y;
        java.lang.Double double44 = point37.y;
        java.lang.Double double45 = point37.x;
        point37.x = 10.0d;
        java.lang.Class<?> wildcardClass48 = point37.getClass();
        boolean boolean49 = point12.equals((java.lang.Object) point37);
        java.lang.Double double50 = point12.y;
        point12.x = 0.0d;
        point12.y = 1.0d;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point57.y = 1.0d;
        point57.y = (-1.0d);
        point57.y = 100.0d;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        boolean boolean69 = point66.equals((java.lang.Object) 1L);
        point66.y = (-1.0d);
        java.lang.Double double72 = point66.y;
        java.lang.Double double73 = point66.y;
        java.lang.Double double74 = point66.x;
        boolean boolean75 = point57.equals((java.lang.Object) point66);
        Point point78 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        boolean boolean79 = point57.equals((java.lang.Object) point78);
        boolean boolean80 = point12.equals((java.lang.Object) boolean79);
        Line line81 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 100.0d;
        point10.y = 10.0d;
        point10.y = 10.0d;
        point10.x = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point10);
        point2.y = 100.0d;
        java.lang.Double double25 = point2.y;
        point2.y = 100.0d;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.x;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean37 = point30.equals((java.lang.Object) double36);
        java.lang.Object obj38 = null;
        boolean boolean39 = point30.equals(obj38);
        boolean boolean40 = point2.equals((java.lang.Object) point30);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point43.x = 1.0d;
        java.lang.Double double46 = point43.y;
        java.lang.Double double47 = point43.x;
        point43.y = 10.0d;
        point43.y = 10.0d;
        point43.y = 10.0d;
        Line line54 = new Line(point30, point43);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
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
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 1.0d;
        point50.y = (-1.0d);
        point50.y = 100.0d;
        point50.x = (-1.0d);
        point50.x = (-1.0d);
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
        boolean boolean87 = point50.equals((java.lang.Object) point79);
        point79.y = 1.0d;
        Line line90 = new Line(point29, point79);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point15.y = 0.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.x;
        Point point22 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        boolean boolean25 = point15.equals((java.lang.Object) point22);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        java.lang.Class<?> wildcardClass32 = point28.getClass();
        boolean boolean33 = point22.equals((java.lang.Object) point28);
        Line line34 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double21 = point14.x;
        java.lang.Double double22 = point14.y;
        java.lang.Double double23 = point14.x;
        java.lang.Double double24 = point14.x;
        Line line25 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 100.0d;
        point10.y = 10.0d;
        point10.y = 10.0d;
        point10.x = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point10);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 100.0d;
        point25.x = 10.0d;
        java.lang.Double double33 = point25.y;
        point25.y = 0.0d;
        java.lang.Double double36 = point25.x;
        point25.y = (-1.0d);
        point25.y = 10.0d;
        point25.x = 100.0d;
        point25.x = 1.0d;
        Line line45 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point5.y = 1.0d;
        point5.y = (-1.0d);
        point5.y = 100.0d;
        boolean boolean12 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double13 = point2.y;
        point2.x = (-1.0d);
        point2.y = 0.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        boolean boolean23 = point20.equals((java.lang.Object) 1L);
        point20.y = (-1.0d);
        java.lang.Double double26 = point20.y;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point29.x = 100.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 1.0d;
        java.lang.Double double40 = point34.y;
        java.lang.Double double41 = point34.y;
        point34.x = 10.0d;
        boolean boolean44 = point29.equals((java.lang.Object) point34);
        boolean boolean45 = point20.equals((java.lang.Object) point34);
        point34.y = 1.0d;
        java.lang.Double double48 = point34.x;
        point34.x = (-1.0d);
        Line line51 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 0.0d;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        point14.y = 0.0d;
        point14.y = (-1.0d);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        boolean boolean29 = point26.equals((java.lang.Object) 1L);
        java.lang.Double double30 = point26.y;
        boolean boolean31 = point23.equals((java.lang.Object) double30);
        point23.x = 10.0d;
        java.lang.Double double34 = point23.x;
        boolean boolean35 = point14.equals((java.lang.Object) point23);
        java.lang.Double double36 = point14.y;
        point14.y = 100.0d;
        java.lang.Double double39 = point14.x;
        Line line40 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.y;
        boolean boolean15 = point9.equals((java.lang.Object) point12);
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        boolean boolean21 = point12.equals((java.lang.Object) double20);
        java.lang.Double double22 = point12.y;
        java.lang.Double double23 = point12.x;
        Line line24 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        point2.x = (-1.0d);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.x = 10.0d;
        point28.x = 10.0d;
        Line line38 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.x = 1.0d;
        point11.y = 1.0d;
        java.lang.Double double16 = point11.x;
        java.lang.Double double17 = point11.y;
        point11.y = 1.0d;
        java.lang.Double double20 = point11.y;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point23.x = 1.0d;
        boolean boolean26 = point11.equals((java.lang.Object) 1.0d);
        boolean boolean27 = point5.equals((java.lang.Object) boolean26);
        java.lang.Double double28 = point5.y;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean36 = point34.equals((java.lang.Object) (byte) 100);
        java.lang.Double double37 = point34.x;
        point34.x = (-1.0d);
        boolean boolean40 = point31.equals((java.lang.Object) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double43 = point31.y;
        Line line44 = new Line(point5, point31);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 10.0d;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        point12.y = 0.0d;
        Line line16 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 100.0d;
        point10.y = 10.0d;
        point10.y = 10.0d;
        point10.x = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point10);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 0.0d;
        java.lang.Double double31 = point25.x;
        Line line32 = new Line(point10, point25);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.y = 0.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.y;
        boolean boolean15 = point9.equals((java.lang.Object) point12);
        point12.y = 100.0d;
        point12.y = 10.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean29 = point27.equals((java.lang.Object) true);
        boolean boolean30 = point22.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass31 = point22.getClass();
        boolean boolean32 = point12.equals((java.lang.Object) wildcardClass31);
        Line line33 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 100.0d;
        point10.y = 10.0d;
        point10.y = 10.0d;
        point10.x = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point10);
        point2.y = 100.0d;
        java.lang.Double double25 = point2.y;
        point2.y = 100.0d;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.x;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean37 = point30.equals((java.lang.Object) double36);
        java.lang.Object obj38 = null;
        boolean boolean39 = point30.equals(obj38);
        boolean boolean40 = point2.equals((java.lang.Object) point30);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        java.lang.Double double46 = point43.y;
        java.lang.Double double47 = point43.y;
        point43.y = 0.0d;
        java.lang.Double double50 = point43.x;
        java.lang.Double double51 = point43.y;
        Line line52 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
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
        point2.x = 0.0d;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        boolean boolean46 = point43.equals((java.lang.Object) 1L);
        java.lang.Double double47 = point43.y;
        boolean boolean48 = point40.equals((java.lang.Object) double47);
        java.lang.Double double49 = point40.y;
        java.lang.Double double50 = point40.x;
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        boolean boolean59 = point56.equals((java.lang.Object) 1L);
        java.lang.Double double60 = point56.y;
        boolean boolean61 = point53.equals((java.lang.Object) double60);
        java.lang.Double double62 = point53.y;
        boolean boolean63 = point40.equals((java.lang.Object) point53);
        point40.y = 100.0d;
        boolean boolean66 = point2.equals((java.lang.Object) 100.0d);
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.y;
        point69.y = 1.0d;
        point69.x = 100.0d;
        java.lang.Double double75 = point69.y;
        point69.y = 100.0d;
        point69.x = (-1.0d);
        point69.x = 100.0d;
        java.lang.Double double82 = point69.y;
        point69.y = 0.0d;
        point69.y = 10.0d;
        Line line87 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
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
        java.lang.Double double24 = point2.y;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        point27.y = (-1.0d);
        java.lang.Double double32 = point27.y;
        java.lang.Double double33 = point27.y;
        Point point36 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.y;
        boolean boolean39 = point27.equals((java.lang.Object) point36);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point42.y = 0.0d;
        java.lang.Double double45 = point42.y;
        boolean boolean46 = point36.equals((java.lang.Object) point42);
        java.lang.Double double47 = point36.x;
        java.lang.Double double48 = point36.x;
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.y;
        java.lang.Double double54 = point51.x;
        point51.y = 1.0d;
        point51.x = 1.0d;
        point51.y = (-1.0d);
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        point63.y = 1.0d;
        java.lang.Double double67 = point63.y;
        java.lang.Object obj68 = new java.lang.Object();
        boolean boolean69 = point63.equals(obj68);
        point63.x = 1.0d;
        java.lang.Class<?> wildcardClass72 = point63.getClass();
        boolean boolean73 = point51.equals((java.lang.Object) wildcardClass72);
        boolean boolean74 = point36.equals((java.lang.Object) wildcardClass72);
        Line line75 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line75.equals(line75)", line75.equals(line75));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        java.lang.Double double22 = point19.y;
        point19.x = 1.0d;
        Line line25 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        java.lang.Double double10 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean23 = point21.equals((java.lang.Object) true);
        boolean boolean24 = point16.equals((java.lang.Object) true);
        java.lang.Double double25 = point16.y;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.y = 0.0d;
        boolean boolean34 = point16.equals((java.lang.Object) point28);
        Line line35 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        java.lang.Double double16 = point12.y;
        boolean boolean17 = point9.equals((java.lang.Object) double16);
        java.lang.Double double18 = point9.y;
        point9.x = 1.0d;
        boolean boolean22 = point9.equals((java.lang.Object) 10);
        point9.y = (-1.0d);
        Line line25 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
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
        java.lang.Double double24 = point2.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean34 = point27.equals((java.lang.Object) point30);
        boolean boolean36 = point30.equals((java.lang.Object) 10.0d);
        java.lang.Double double37 = point30.x;
        point30.x = (-1.0d);
        Line line40 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.x;
        java.lang.Double double41 = point39.x;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        point44.y = (-1.0d);
        java.lang.Double double49 = point44.y;
        java.lang.Double double50 = point44.y;
        point44.y = 1.0d;
        java.lang.Class<?> wildcardClass53 = point44.getClass();
        boolean boolean54 = point39.equals((java.lang.Object) wildcardClass53);
        point39.y = 100.0d;
        java.lang.Double double57 = point39.x;
        point39.y = 1.0d;
        point39.x = 100.0d;
        Line line62 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        point23.y = 10.0d;
        boolean boolean27 = point20.equals((java.lang.Object) point23);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean33 = point30.equals((java.lang.Object) 1L);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.x;
        boolean boolean39 = point36.equals((java.lang.Object) 10.0f);
        point36.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        boolean boolean43 = point23.equals((java.lang.Object) boolean42);
        java.lang.Double double44 = point23.y;
        java.lang.Double double45 = point23.y;
        Line line46 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.x;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        java.lang.Double double37 = point33.y;
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = point33.equals(obj38);
        java.lang.Double double40 = point33.y;
        java.lang.Class<?> wildcardClass41 = point33.getClass();
        boolean boolean42 = point29.equals((java.lang.Object) point33);
        point29.x = 0.0d;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 1.0d;
        java.lang.Double double50 = point47.y;
        point47.x = 100.0d;
        point47.y = 0.0d;
        point47.y = 1.0d;
        java.lang.Class<?> wildcardClass57 = point47.getClass();
        boolean boolean58 = point29.equals((java.lang.Object) wildcardClass57);
        Line line59 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double26 = point2.x;
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean33 = point30.equals((java.lang.Object) 0.0d);
        java.lang.Double double34 = point30.y;
        point30.x = 0.0d;
        point30.y = 100.0d;
        java.lang.Double double39 = point30.x;
        Line line40 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.x = 1.0d;
        Point point7 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean8 = point2.equals((java.lang.Object) point7);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.x;
        boolean boolean23 = point20.equals((java.lang.Object) 10.0f);
        point20.x = 100.0d;
        boolean boolean26 = point14.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass27 = point14.getClass();
        boolean boolean28 = point11.equals((java.lang.Object) wildcardClass27);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        java.lang.Double double36 = point34.y;
        boolean boolean37 = point31.equals((java.lang.Object) point34);
        point31.x = 10.0d;
        boolean boolean40 = point11.equals((java.lang.Object) point31);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 0.0d;
        point43.y = (-1.0d);
        point43.y = 100.0d;
        java.lang.Double double50 = point43.x;
        boolean boolean51 = point31.equals((java.lang.Object) point43);
        boolean boolean53 = point31.equals((java.lang.Object) (-1));
        java.lang.Double double54 = point31.x;
        java.lang.Double double55 = point31.x;
        point31.y = (-1.0d);
        point31.x = 0.0d;
        Line line60 = new Line(point7, point31);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Object obj6 = null;
        boolean boolean7 = point2.equals(obj6);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.x = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        Line line18 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.y;
        java.lang.Double double17 = point14.x;
        java.lang.Double double18 = point14.y;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.x;
        point21.y = 0.0d;
        java.lang.Double double26 = point21.x;
        java.lang.Double double27 = point21.y;
        boolean boolean28 = point14.equals((java.lang.Object) point21);
        java.lang.Double double29 = point21.y;
        Line line30 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        java.lang.Double double23 = point20.y;
        java.lang.Double double24 = point20.y;
        point20.y = 10.0d;
        java.lang.Double double27 = point20.y;
        point20.x = 10.0d;
        java.lang.Double double30 = point20.x;
        Line line31 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point6.x = 1.0d;
        point6.y = 1.0d;
        point6.y = (-1.0d);
        boolean boolean13 = point2.equals((java.lang.Object) point6);
        java.lang.Double double14 = point6.x;
        point6.x = 0.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        java.lang.Double double23 = point19.y;
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = point19.equals(obj24);
        java.lang.Double double26 = point19.x;
        java.lang.Double double27 = point19.y;
        point19.x = (-1.0d);
        point19.y = 100.0d;
        point19.y = 10.0d;
        boolean boolean34 = point6.equals((java.lang.Object) 10.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        java.lang.Double double43 = point37.y;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point46.y = 0.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.x;
        boolean boolean51 = point37.equals((java.lang.Object) double50);
        point37.y = 1.0d;
        java.lang.Double double54 = point37.x;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point57.y = 0.0d;
        java.lang.Double double60 = point57.y;
        java.lang.Double double61 = point57.x;
        point57.x = 1.0d;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj67 = null;
        boolean boolean68 = point66.equals(obj67);
        java.lang.Class<?> wildcardClass69 = point66.getClass();
        boolean boolean70 = point57.equals((java.lang.Object) wildcardClass69);
        java.lang.Double double71 = point57.x;
        boolean boolean72 = point37.equals((java.lang.Object) point57);
        Line line73 = new Line(point6, point37);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.y;
        Point point42 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        point42.x = 100.0d;
        boolean boolean46 = point37.equals((java.lang.Object) point42);
        java.lang.Double double47 = point42.y;
        boolean boolean48 = point2.equals((java.lang.Object) point42);
        point2.y = 1.0d;
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        boolean boolean59 = point56.equals((java.lang.Object) 1L);
        java.lang.Double double60 = point56.y;
        boolean boolean61 = point53.equals((java.lang.Object) double60);
        java.lang.Double double62 = point53.y;
        point53.x = 1.0d;
        boolean boolean66 = point53.equals((java.lang.Object) 10);
        java.lang.Double double67 = point53.x;
        point53.y = 1.0d;
        Line line70 = new Line(point2, point53);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point51.y = 100.0d;
        point51.y = 10.0d;
        java.lang.Double double56 = point51.y;
        java.lang.Double double57 = point51.y;
        point51.x = 0.0d;
        Line line60 = new Line(point29, point51);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
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
        java.lang.Double double18 = point7.y;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.y;
        java.lang.Double double27 = point21.y;
        java.lang.Double double28 = point21.y;
        java.lang.Double double29 = point21.y;
        boolean boolean30 = point7.equals((java.lang.Object) point21);
        point7.y = 100.0d;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        point35.y = 10.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        boolean boolean47 = point44.equals((java.lang.Object) 10.0f);
        point44.x = 100.0d;
        java.lang.Double double50 = point44.x;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point53.x = 100.0d;
        boolean boolean56 = point44.equals((java.lang.Object) 100.0d);
        java.lang.Double double57 = point44.y;
        point44.y = 100.0d;
        boolean boolean60 = point35.equals((java.lang.Object) point44);
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        point63.y = 1.0d;
        point63.x = 0.0d;
        boolean boolean70 = point63.equals((java.lang.Object) "");
        boolean boolean71 = point44.equals((java.lang.Object) point63);
        Line line72 = new Line(point7, point44);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 100.0d;
        point16.x = 10.0d;
        point16.x = 10.0d;
        java.lang.Double double26 = point16.x;
        Line line27 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
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
        java.lang.Double double33 = point2.x;
        point2.y = 100.0d;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double39 = point38.y;
        boolean boolean41 = point38.equals((java.lang.Object) 0.0d);
        java.lang.Double double42 = point38.y;
        point38.x = 0.0d;
        Line line45 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point5.y = 1.0d;
        point5.y = (-1.0d);
        point5.y = 100.0d;
        boolean boolean12 = point2.equals((java.lang.Object) 100.0d);
        point2.y = 0.0d;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        java.lang.Double double19 = point17.y;
        java.lang.Double double20 = point17.x;
        java.lang.Double double21 = point17.y;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        point24.y = 0.0d;
        java.lang.Double double29 = point24.x;
        java.lang.Double double30 = point24.y;
        boolean boolean31 = point17.equals((java.lang.Object) point24);
        Line line32 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
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
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean38 = point35.equals((java.lang.Object) 1L);
        java.lang.Double double39 = point35.y;
        boolean boolean40 = point32.equals((java.lang.Object) double39);
        point32.x = 10.0d;
        java.lang.Double double43 = point32.x;
        point32.y = 0.0d;
        java.lang.Double double46 = point32.x;
        point32.x = 100.0d;
        point32.x = 1.0d;
        point32.y = 1.0d;
        Line line53 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        java.lang.Double double21 = point17.y;
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = point17.equals(obj22);
        java.lang.Double double24 = point17.y;
        point17.y = 100.0d;
        point17.y = 0.0d;
        boolean boolean29 = point2.equals((java.lang.Object) 0.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 0.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        java.lang.Double double47 = point40.x;
        java.lang.Double double48 = point40.y;
        point40.x = (-1.0d);
        boolean boolean51 = point32.equals((java.lang.Object) (-1.0d));
        Line line52 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
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
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.y;
        boolean boolean41 = point35.equals((java.lang.Object) point38);
        java.lang.Double double42 = point35.y;
        point35.y = 0.0d;
        java.lang.Double double45 = point35.y;
        java.lang.Double double46 = point35.y;
        point35.y = 1.0d;
        point35.y = (-1.0d);
        Line line51 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
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
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point18.y = (-1.0d);
        java.lang.Double double21 = point18.y;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.x;
        boolean boolean27 = point24.equals((java.lang.Object) 10.0f);
        point24.x = 100.0d;
        java.lang.Double double30 = point24.x;
        point24.y = 1.0d;
        boolean boolean33 = point18.equals((java.lang.Object) point24);
        java.lang.Double double34 = point24.x;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        java.lang.Double double41 = point37.y;
        java.lang.Double double42 = point37.y;
        boolean boolean43 = point24.equals((java.lang.Object) point37);
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point49.x = 1.0d;
        point49.y = 1.0d;
        boolean boolean54 = point46.equals((java.lang.Object) 1.0d);
        java.lang.Double double55 = point46.y;
        java.lang.Double double56 = point46.x;
        java.lang.Double double57 = point46.x;
        Point point60 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.x;
        java.lang.Double double62 = point60.y;
        point60.y = (-1.0d);
        point60.y = 0.0d;
        point60.x = (-1.0d);
        boolean boolean69 = point46.equals((java.lang.Object) point60);
        java.lang.Double double70 = point46.y;
        point46.y = 0.0d;
        java.lang.Double double73 = point46.x;
        boolean boolean74 = point24.equals((java.lang.Object) point46);
        Line line75 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line75.equals(line75)", line75.equals(line75));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
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
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point23.x = 100.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        java.lang.Double double34 = point28.y;
        java.lang.Double double35 = point28.y;
        point28.x = 10.0d;
        boolean boolean38 = point23.equals((java.lang.Object) point28);
        java.lang.Double double39 = point28.y;
        java.lang.Double double40 = point28.x;
        boolean boolean41 = point2.equals((java.lang.Object) double40);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        point44.y = (-1.0d);
        point44.y = 100.0d;
        point44.x = (-1.0d);
        point44.x = (-1.0d);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.x;
        boolean boolean60 = point57.equals((java.lang.Object) 10.0f);
        point57.x = 100.0d;
        java.lang.Double double63 = point57.x;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point66.x = 100.0d;
        boolean boolean69 = point57.equals((java.lang.Object) 100.0d);
        java.lang.Double double70 = point57.y;
        Point point73 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double74 = point73.y;
        point73.y = 1.0d;
        point73.x = 100.0d;
        java.lang.Double double79 = point73.x;
        boolean boolean80 = point57.equals((java.lang.Object) point73);
        boolean boolean81 = point44.equals((java.lang.Object) point73);
        java.lang.Double double82 = point73.x;
        point73.x = 100.0d;
        Line line85 = new Line(point2, point73);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
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
        point21.y = 0.0d;
        java.lang.Double double52 = point21.y;
        point21.y = 100.0d;
        Line line55 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        point5.y = 1.0d;
        point5.y = 0.0d;
        java.lang.Double double11 = point5.x;
        Line line12 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass13 = point12.getClass();
        boolean boolean14 = point5.equals((java.lang.Object) wildcardClass13);
        java.lang.Double double15 = point5.y;
        point5.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        Line line22 = new Line(point5, point20);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        point2.y = 10.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point9.y = (-1.0d);
        java.lang.Double double12 = point9.x;
        point9.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        java.lang.Double double19 = point17.x;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean24 = point22.equals((java.lang.Object) true);
        boolean boolean25 = point17.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass26 = point17.getClass();
        boolean boolean27 = point9.equals((java.lang.Object) wildcardClass26);
        point9.y = 10.0d;
        boolean boolean30 = point2.equals((java.lang.Object) point9);
        Point point31 = null;
        Line line32 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
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
        java.lang.Double double26 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double29 = point2.x;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        java.lang.Double double37 = point32.y;
        java.lang.Double double38 = point32.y;
        point32.y = 1.0d;
        point32.y = 100.0d;
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj46 = null;
        boolean boolean47 = point45.equals(obj46);
        boolean boolean48 = point32.equals((java.lang.Object) point45);
        point32.x = 100.0d;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        java.lang.Double double58 = point56.y;
        boolean boolean59 = point53.equals((java.lang.Object) point56);
        java.lang.Double double60 = point56.x;
        boolean boolean61 = point32.equals((java.lang.Object) point56);
        point56.y = 1.0d;
        java.lang.Double double64 = point56.y;
        point56.y = 0.0d;
        Line line67 = new Line(point2, point56);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
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
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        java.lang.Double double31 = point28.y;
        point28.y = 10.0d;
        Line line34 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        point13.y = (-1.0d);
        java.lang.Double double19 = point13.y;
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
        boolean boolean38 = point13.equals((java.lang.Object) point27);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.x = 1.0d;
        boolean boolean48 = point41.equals((java.lang.Object) 'a');
        point41.x = 10.0d;
        boolean boolean51 = point27.equals((java.lang.Object) 10.0d);
        java.lang.Double double52 = point27.y;
        java.lang.Double double53 = point27.x;
        Point point56 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double57 = point56.x;
        java.lang.Double double58 = point56.y;
        point56.y = (-1.0d);
        boolean boolean61 = point27.equals((java.lang.Object) point56);
        Line line62 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        java.lang.Double double16 = point13.x;
        java.lang.Double double17 = point13.x;
        point13.y = 0.0d;
        point13.x = 0.0d;
        java.lang.Double double22 = point13.y;
        Line line23 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.y = 1.0d;
        Point point10 = null;
        Line line11 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
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
        point2.y = 0.0d;
        java.lang.Double double26 = point2.y;
        java.lang.Double double27 = point2.y;
        java.lang.Double double28 = point2.x;
        java.lang.Double double29 = point2.y;
        point2.y = 1.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.y = 0.0d;
        java.lang.Double double40 = point34.x;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        java.lang.Double double49 = point43.x;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point52.x = 100.0d;
        boolean boolean55 = point43.equals((java.lang.Object) 100.0d);
        point43.x = 1.0d;
        java.lang.Class<?> wildcardClass58 = point43.getClass();
        boolean boolean59 = point34.equals((java.lang.Object) point43);
        Line line60 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
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
        java.lang.Double double45 = point22.x;
        point22.x = 10.0d;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point50.x = 0.0d;
        point50.y = 1.0d;
        java.lang.Double double55 = point50.x;
        point50.x = 100.0d;
        Line line58 = new Line(point22, point50);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 100.0d;
        Point point8 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double16 = point12.y;
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = point12.equals(obj17);
        java.lang.Double double19 = point12.y;
        java.lang.Class<?> wildcardClass20 = point12.getClass();
        boolean boolean21 = point8.equals((java.lang.Object) point12);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point24.y = 100.0d;
        point24.y = 0.0d;
        boolean boolean29 = point8.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass30 = point8.getClass();
        boolean boolean31 = point2.equals((java.lang.Object) wildcardClass30);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point34.y = 1.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point39.y = (-1.0d);
        java.lang.Double double42 = point39.y;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.x;
        boolean boolean48 = point45.equals((java.lang.Object) 10.0f);
        point45.x = 100.0d;
        java.lang.Double double51 = point45.x;
        point45.y = 1.0d;
        boolean boolean54 = point39.equals((java.lang.Object) point45);
        java.lang.Double double55 = point45.x;
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        boolean boolean61 = point58.equals((java.lang.Object) 1L);
        java.lang.Double double62 = point58.y;
        java.lang.Double double63 = point58.y;
        boolean boolean64 = point45.equals((java.lang.Object) point58);
        java.lang.Double double65 = point45.x;
        boolean boolean66 = point34.equals((java.lang.Object) point45);
        Line line67 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
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
        point9.x = 100.0d;
        java.lang.Double double24 = point9.x;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 0.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.y;
        java.lang.Double double32 = point27.y;
        java.lang.Double double33 = point27.x;
        point27.x = 10.0d;
        Line line36 = new Line(point9, point27);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 0.0d;
        point2.x = 1.0d;
        point2.x = 10.0d;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean21 = point19.equals((java.lang.Object) true);
        boolean boolean22 = point14.equals((java.lang.Object) true);
        java.lang.Double double23 = point14.y;
        java.lang.Double double24 = point14.y;
        point14.y = 100.0d;
        java.lang.Double double27 = point14.y;
        java.lang.Double double28 = point14.x;
        boolean boolean29 = point2.equals((java.lang.Object) point14);
        point2.y = 100.0d;
        point2.y = 10.0d;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        boolean boolean42 = point39.equals((java.lang.Object) 1L);
        java.lang.Double double43 = point39.y;
        boolean boolean44 = point36.equals((java.lang.Object) double43);
        java.lang.Double double45 = point36.y;
        java.lang.Double double46 = point36.x;
        point36.x = 100.0d;
        java.lang.Double double49 = point36.y;
        point36.y = 10.0d;
        point36.x = 1.0d;
        point36.x = 10.0d;
        Line line56 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        point2.x = 10.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point16.x = 0.0d;
        point16.y = 1.0d;
        java.lang.Double double21 = point16.x;
        java.lang.Double double22 = point16.x;
        Line line23 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double6 = point2.y;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.y;
        point11.y = 0.0d;
        java.lang.Double double18 = point11.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        point21.y = 100.0d;
        java.lang.Double double29 = point21.y;
        boolean boolean30 = point11.equals((java.lang.Object) point21);
        java.lang.Double double31 = point21.y;
        point21.y = 0.0d;
        Line line34 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        java.lang.Double double16 = point13.x;
        point13.x = 0.0d;
        java.lang.Double double19 = point13.y;
        Line line20 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        point27.x = 100.0d;
        java.lang.Double double33 = point27.y;
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point36.y = 0.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.x;
        boolean boolean41 = point27.equals((java.lang.Object) double40);
        point27.y = 1.0d;
        java.lang.Double double44 = point27.x;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.x;
        point47.x = 1.0d;
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj57 = null;
        boolean boolean58 = point56.equals(obj57);
        java.lang.Class<?> wildcardClass59 = point56.getClass();
        boolean boolean60 = point47.equals((java.lang.Object) wildcardClass59);
        java.lang.Double double61 = point47.x;
        boolean boolean62 = point27.equals((java.lang.Object) point47);
        java.lang.Double double63 = point27.x;
        java.lang.Double double64 = point27.y;
        java.lang.Double double65 = point27.y;
        Line line66 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.y;
        java.lang.Double double17 = point14.x;
        point14.y = (-1.0d);
        Line line20 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
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
        point2.y = 100.0d;
        point2.y = 1.0d;
        java.lang.Double double31 = point2.x;
        java.lang.Double double32 = point2.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point35.x = 100.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 1.0d;
        java.lang.Double double46 = point40.y;
        java.lang.Double double47 = point40.y;
        point40.x = 10.0d;
        boolean boolean50 = point35.equals((java.lang.Object) point40);
        java.lang.Double double51 = point40.y;
        java.lang.Double double52 = point40.x;
        java.lang.Double double53 = point40.x;
        Line line54 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double8 = point7.y;
        boolean boolean9 = point2.equals((java.lang.Object) double8);
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        java.lang.Double double16 = point13.x;
        point13.y = 1.0d;
        boolean boolean19 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double20 = point2.y;
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.x;
        java.lang.Double double26 = point23.x;
        boolean boolean28 = point23.equals((java.lang.Object) (byte) 0);
        Line line29 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 100.0d;
        point2.y = (-1.0d);
        point2.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        point18.x = 1.0d;
        java.lang.Double double27 = point18.x;
        boolean boolean28 = point12.equals((java.lang.Object) double27);
        java.lang.Double double29 = point12.x;
        point12.x = 10.0d;
        java.lang.Double double32 = point12.x;
        java.lang.Double double33 = point12.y;
        point12.y = (-1.0d);
        Line line36 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.y = 0.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.y;
        boolean boolean18 = point12.equals((java.lang.Object) point15);
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.y;
        boolean boolean24 = point15.equals((java.lang.Object) double23);
        point15.y = 1.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        point29.y = 100.0d;
        point29.x = 10.0d;
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        java.lang.Double double42 = point40.y;
        java.lang.Double double43 = point40.x;
        point40.x = 0.0d;
        java.lang.Double double46 = point40.y;
        boolean boolean47 = point29.equals((java.lang.Object) point40);
        boolean boolean48 = point15.equals((java.lang.Object) point29);
        Line line49 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
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
        point2.x = 10.0d;
        point2.y = 100.0d;
        Point point38 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double39 = point38.y;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point42.y = 0.0d;
        Point point47 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.x;
        java.lang.Double double49 = point47.y;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.y;
        boolean boolean52 = point42.equals((java.lang.Object) point47);
        boolean boolean53 = point38.equals((java.lang.Object) point42);
        Line line54 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.x = 10.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point18.x = 1.0d;
        point18.y = 1.0d;
        boolean boolean23 = point15.equals((java.lang.Object) 1.0d);
        java.lang.Double double24 = point15.y;
        java.lang.Double double25 = point15.x;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.x;
        boolean boolean33 = point15.equals((java.lang.Object) point28);
        java.lang.Double double34 = point28.x;
        Line line35 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
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
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 0.0d;
        point21.x = 10.0d;
        java.lang.Double double26 = point21.y;
        Line line27 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point8.y = 0.0d;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.x;
        point8.x = 1.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        java.lang.Double double21 = point17.y;
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = point17.equals(obj22);
        java.lang.Double double24 = point17.y;
        point17.x = 1.0d;
        boolean boolean27 = point8.equals((java.lang.Object) point17);
        point17.y = 100.0d;
        point17.x = 100.0d;
        Line line32 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.y = 10.0d;
        Line line17 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
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
        point16.y = 1.0d;
        java.lang.Double double30 = point16.x;
        point16.x = (-1.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 100.0d;
        point35.y = 10.0d;
        boolean boolean44 = point35.equals((java.lang.Object) 0L);
        java.lang.Double double45 = point35.x;
        java.lang.Double double46 = point35.y;
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        boolean boolean55 = point52.equals((java.lang.Object) 1L);
        java.lang.Double double56 = point52.y;
        boolean boolean57 = point49.equals((java.lang.Object) double56);
        java.lang.Double double58 = point49.y;
        java.lang.Double double59 = point49.x;
        boolean boolean60 = point35.equals((java.lang.Object) double59);
        Line line61 = new Line(point16, point35);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        point2.x = 1.0d;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        point13.y = 10.0d;
        java.lang.Double double20 = point13.y;
        point13.x = 10.0d;
        java.lang.Double double23 = point13.x;
        boolean boolean24 = point2.equals((java.lang.Object) double23);
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
        point27.y = 1.0d;
        Line line48 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
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
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        java.lang.Double double25 = point22.x;
        java.lang.Double double26 = point22.y;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        java.lang.Double double31 = point29.x;
        point29.y = 0.0d;
        java.lang.Double double34 = point29.x;
        java.lang.Double double35 = point29.y;
        boolean boolean36 = point22.equals((java.lang.Object) point29);
        point29.y = (-1.0d);
        boolean boolean39 = point2.equals((java.lang.Object) (-1.0d));
        Point point42 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 0.0d;
        Line line46 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        point2.y = 10.0d;
        point2.x = 1.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        point25.y = 10.0d;
        boolean boolean29 = point22.equals((java.lang.Object) point25);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass33 = point32.getClass();
        boolean boolean34 = point25.equals((java.lang.Object) wildcardClass33);
        java.lang.Double double35 = point25.y;
        boolean boolean36 = point2.equals((java.lang.Object) double35);
        point2.x = 10.0d;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        point41.y = (-1.0d);
        java.lang.Double double46 = point41.y;
        java.lang.Double double47 = point41.y;
        point41.y = 1.0d;
        point41.y = 100.0d;
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj55 = null;
        boolean boolean56 = point54.equals(obj55);
        boolean boolean57 = point41.equals((java.lang.Object) point54);
        point41.x = 100.0d;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        java.lang.Double double67 = point65.y;
        boolean boolean68 = point62.equals((java.lang.Object) point65);
        java.lang.Double double69 = point65.x;
        boolean boolean70 = point41.equals((java.lang.Object) point65);
        java.lang.Double double71 = point41.y;
        java.lang.Double double72 = point41.x;
        Line line73 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
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
        java.lang.Double double17 = point2.y;
        point2.y = 10.0d;
        point2.x = 10.0d;
        point2.x = 1.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 100.0d;
        point26.x = 10.0d;
        java.lang.Double double34 = point26.y;
        point26.x = 0.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        point39.x = 100.0d;
        java.lang.Double double45 = point39.y;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point48.y = 0.0d;
        java.lang.Double double51 = point48.y;
        java.lang.Double double52 = point48.x;
        boolean boolean53 = point39.equals((java.lang.Object) double52);
        boolean boolean55 = point39.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass56 = point39.getClass();
        boolean boolean57 = point26.equals((java.lang.Object) wildcardClass56);
        point26.x = 100.0d;
        java.lang.Double double60 = point26.x;
        Line line61 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
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
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 1.0d;
        boolean boolean37 = point30.equals((java.lang.Object) 'a');
        point30.x = 10.0d;
        point30.x = 0.0d;
        point30.y = 10.0d;
        java.lang.Double double44 = point30.y;
        java.lang.Double double45 = point30.y;
        java.lang.Double double46 = point30.x;
        boolean boolean47 = point2.equals((java.lang.Object) point30);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        point50.y = 10.0d;
        boolean boolean59 = point50.equals((java.lang.Object) 0L);
        java.lang.Double double60 = point50.x;
        java.lang.Double double61 = point50.y;
        Line line62 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double6 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        java.lang.Double double16 = point13.x;
        point13.x = 0.0d;
        java.lang.Double double19 = point13.y;
        boolean boolean20 = point2.equals((java.lang.Object) point13);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        point23.y = 1.0d;
        point23.y = 100.0d;
        point23.x = 1.0d;
        point23.y = (-1.0d);
        point23.y = 1.0d;
        java.lang.Double double40 = point23.y;
        point23.x = 0.0d;
        java.lang.Double double43 = point23.y;
        Line line44 = new Line(point13, point23);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double10 = point9.x;
        java.lang.Double double11 = point9.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point14.x = 1.0d;
        point14.y = 1.0d;
        boolean boolean19 = point9.equals((java.lang.Object) point14);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point22.x = 0.0d;
        point22.x = 1.0d;
        java.lang.Class<?> wildcardClass27 = point22.getClass();
        boolean boolean28 = point14.equals((java.lang.Object) point22);
        java.lang.Object obj29 = null;
        boolean boolean30 = point14.equals(obj29);
        java.lang.Double double31 = point14.x;
        boolean boolean32 = point2.equals((java.lang.Object) point14);
        point14.y = 0.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 1.0d;
        java.lang.Object obj43 = null;
        boolean boolean44 = point37.equals(obj43);
        point37.x = 1.0d;
        point37.y = 10.0d;
        java.lang.Double double49 = point37.y;
        java.lang.Double double50 = point37.y;
        Line line51 = new Line(point14, point37);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 0.0d;
        point2.x = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point13.y = 0.0d;
        java.lang.Double double16 = point13.y;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        java.lang.Double double23 = point19.y;
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = point19.equals(obj24);
        point19.x = 1.0d;
        java.lang.Double double28 = point19.x;
        boolean boolean29 = point13.equals((java.lang.Object) double28);
        boolean boolean30 = point2.equals((java.lang.Object) point13);
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        point33.x = 0.0d;
        point33.x = 10.0d;
        point33.y = 100.0d;
        Line line44 = new Line(point13, point33);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point2.y = 100.0d;
        java.lang.Object obj5 = null;
        boolean boolean6 = point2.equals(obj5);
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        java.lang.Double double14 = point11.x;
        point11.x = 0.0d;
        boolean boolean17 = point2.equals((java.lang.Object) 0.0d);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 1.0d;
        point20.y = 1.0d;
        java.lang.Double double31 = point20.y;
        point20.y = (-1.0d);
        java.lang.Double double34 = point20.x;
        Line line35 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        boolean boolean7 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        java.lang.Double double18 = point14.y;
        boolean boolean19 = point11.equals((java.lang.Object) double18);
        point11.x = 10.0d;
        java.lang.Double double22 = point11.x;
        point11.y = 0.0d;
        java.lang.Double double25 = point11.x;
        point11.x = 0.0d;
        Line line28 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        point2.x = 0.0d;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        boolean boolean16 = point2.equals((java.lang.Object) point13);
        java.lang.Double double17 = point13.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.x;
        boolean boolean23 = point20.equals((java.lang.Object) 10.0f);
        point20.x = 100.0d;
        java.lang.Double double26 = point20.x;
        point20.y = 1.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        point31.y = (-1.0d);
        java.lang.Class<?> wildcardClass37 = point31.getClass();
        boolean boolean38 = point20.equals((java.lang.Object) wildcardClass37);
        java.lang.Double double39 = point20.y;
        java.lang.Double double40 = point20.x;
        java.lang.Double double41 = point20.x;
        java.lang.Double double42 = point20.y;
        Line line43 = new Line(point13, point20);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point13.x = 0.0d;
        point13.y = 1.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        point20.x = 10.0d;
        java.lang.Double double28 = point20.y;
        point20.y = 0.0d;
        java.lang.Double double31 = point20.x;
        boolean boolean32 = point13.equals((java.lang.Object) point20);
        point20.y = 10.0d;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        point41.y = (-1.0d);
        boolean boolean46 = point37.equals((java.lang.Object) point41);
        java.lang.Double double47 = point41.y;
        boolean boolean48 = point20.equals((java.lang.Object) point41);
        Line line49 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.y = 100.0d;
        Line line14 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.x = 100.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point13.y = 0.0d;
        java.lang.Double double16 = point13.y;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.x;
        boolean boolean21 = point13.equals((java.lang.Object) double20);
        java.lang.Double double22 = point13.x;
        Line line23 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double8 = point7.y;
        boolean boolean9 = point2.equals((java.lang.Object) double8);
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.y;
        point2.x = 0.0d;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 1.0d;
        java.lang.Object obj23 = null;
        boolean boolean24 = point17.equals(obj23);
        point17.x = 1.0d;
        point17.y = 10.0d;
        point17.y = 10.0d;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.x;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean40 = point38.equals((java.lang.Object) true);
        boolean boolean41 = point33.equals((java.lang.Object) true);
        java.lang.Double double42 = point33.y;
        java.lang.Double double43 = point33.y;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.y;
        point46.y = 10.0d;
        java.lang.Double double53 = point46.y;
        point46.x = 10.0d;
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point58.x = 1.0d;
        point58.y = 1.0d;
        java.lang.Double double63 = point58.x;
        point58.x = (-1.0d);
        Point point68 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        point68.y = 1.0d;
        point68.x = 100.0d;
        point68.x = 10.0d;
        java.lang.Double double76 = point68.y;
        boolean boolean77 = point58.equals((java.lang.Object) double76);
        point58.y = (-1.0d);
        java.lang.Double double80 = point58.x;
        point58.y = 1.0d;
        boolean boolean83 = point46.equals((java.lang.Object) 1.0d);
        boolean boolean84 = point33.equals((java.lang.Object) point46);
        point33.y = 0.0d;
        boolean boolean87 = point17.equals((java.lang.Object) point33);
        Line line88 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
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
        java.lang.Double double63 = point23.x;
        point23.x = 0.0d;
        Point point68 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double69 = point68.x;
        point68.x = 1.0d;
        java.lang.Double double72 = point68.x;
        java.lang.Double double73 = point68.x;
        Line line74 = new Line(point23, point68);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.y;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.y;
        boolean boolean21 = point11.equals((java.lang.Object) point16);
        java.lang.Double double22 = point11.y;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        boolean boolean28 = point25.equals((java.lang.Object) 1L);
        point25.y = (-1.0d);
        java.lang.Double double31 = point25.y;
        boolean boolean32 = point11.equals((java.lang.Object) point25);
        java.lang.Double double33 = point25.x;
        Line line34 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        point2.x = 100.0d;
        java.lang.Double double15 = point2.x;
        java.lang.Double double16 = point2.y;
        Point point17 = null;
        Line line18 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double10 = point9.x;
        java.lang.Double double11 = point9.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point14.x = 1.0d;
        point14.y = 1.0d;
        boolean boolean19 = point9.equals((java.lang.Object) point14);
        point14.y = 100.0d;
        point14.x = 0.0d;
        Line line24 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 1.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point16.equals(obj22);
        point16.x = 1.0d;
        boolean boolean27 = point16.equals((java.lang.Object) false);
        java.lang.Double double28 = point16.x;
        point16.y = (-1.0d);
        point16.x = 1.0d;
        java.lang.Double double33 = point16.x;
        boolean boolean34 = point2.equals((java.lang.Object) point16);
        Point point37 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.x;
        java.lang.Double double40 = point37.y;
        Line line41 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.x = 10.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.y;
        java.lang.Double double18 = point15.x;
        point15.y = 1.0d;
        point15.x = 1.0d;
        java.lang.Double double23 = point15.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.x;
        boolean boolean29 = point26.equals((java.lang.Object) 10.0f);
        point26.x = 100.0d;
        java.lang.Double double32 = point26.x;
        point26.y = 1.0d;
        boolean boolean35 = point15.equals((java.lang.Object) 1.0d);
        java.lang.Object obj36 = null;
        boolean boolean37 = point15.equals(obj36);
        Line line38 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        point2.x = 100.0d;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 1.0d;
        point20.y = 100.0d;
        point20.x = 1.0d;
        point20.y = (-1.0d);
        point20.y = 1.0d;
        java.lang.Double double37 = point20.y;
        point20.y = 0.0d;
        Point point42 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.x;
        boolean boolean45 = point20.equals((java.lang.Object) double44);
        Line line46 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point16.x = 0.0d;
        point16.y = 1.0d;
        point16.y = 100.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point16);
        java.lang.Double double24 = point2.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 100.0d;
        point27.x = 10.0d;
        java.lang.Double double35 = point27.y;
        point27.y = 0.0d;
        java.lang.Object obj38 = null;
        boolean boolean39 = point27.equals(obj38);
        Line line40 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        java.lang.Double double19 = point15.y;
        boolean boolean20 = point12.equals((java.lang.Object) double19);
        java.lang.Double double21 = point12.y;
        java.lang.Double double22 = point12.x;
        point12.x = 100.0d;
        java.lang.Double double25 = point12.y;
        point12.y = 10.0d;
        point12.x = 1.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        point35.y = 10.0d;
        boolean boolean39 = point32.equals((java.lang.Object) point35);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass43 = point42.getClass();
        boolean boolean44 = point35.equals((java.lang.Object) wildcardClass43);
        java.lang.Double double45 = point35.y;
        boolean boolean46 = point12.equals((java.lang.Object) double45);
        java.lang.Double double47 = point12.x;
        point12.y = 1.0d;
        Line line50 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
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
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        java.lang.Double double40 = point36.y;
        boolean boolean41 = point33.equals((java.lang.Object) double40);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        point44.y = (-1.0d);
        point44.y = 100.0d;
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass54 = point53.getClass();
        boolean boolean55 = point44.equals((java.lang.Object) point53);
        boolean boolean56 = point33.equals((java.lang.Object) point53);
        java.lang.Double double57 = point33.y;
        java.lang.Double double58 = point33.y;
        java.lang.Double double59 = point33.y;
        Line line60 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 10.0d;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double9 = point8.x;
        java.lang.Double double10 = point8.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point13.x = 1.0d;
        point13.y = 1.0d;
        boolean boolean18 = point8.equals((java.lang.Object) point13);
        point8.x = (-1.0d);
        Line line21 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = 10.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 10.0d;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double14 = point13.x;
        java.lang.Double double15 = point13.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.y;
        java.lang.Double double23 = point18.y;
        boolean boolean24 = point13.equals((java.lang.Object) point18);
        Line line25 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        boolean boolean24 = point18.equals((java.lang.Object) 10.0d);
        boolean boolean25 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double26 = point2.x;
        point2.x = 10.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point31.y = 10.0d;
        java.lang.Double double34 = point31.x;
        java.lang.Double double35 = point31.x;
        java.lang.Double double36 = point31.x;
        boolean boolean37 = point2.equals((java.lang.Object) point31);
        Point point40 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.y;
        java.lang.Double double42 = point40.y;
        Line line43 = new Line(point31, point40);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
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
        point23.y = 100.0d;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 100.0d;
        point43.y = 10.0d;
        boolean boolean52 = point43.equals((java.lang.Object) 0L);
        java.lang.Double double53 = point43.x;
        java.lang.Double double54 = point43.y;
        Line line55 = new Line(point23, point43);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 1.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point16.equals(obj22);
        point16.x = 1.0d;
        boolean boolean27 = point16.equals((java.lang.Object) false);
        java.lang.Double double28 = point16.x;
        point16.y = (-1.0d);
        point16.x = 1.0d;
        java.lang.Double double33 = point16.x;
        boolean boolean34 = point2.equals((java.lang.Object) point16);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.y = 100.0d;
        java.lang.Double double45 = point37.y;
        point37.y = 100.0d;
        java.lang.Double double48 = point37.y;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 1.0d;
        java.lang.Object obj57 = null;
        boolean boolean58 = point51.equals(obj57);
        point51.x = 1.0d;
        boolean boolean62 = point51.equals((java.lang.Object) false);
        java.lang.Double double63 = point51.x;
        point51.y = (-1.0d);
        point51.x = 1.0d;
        java.lang.Double double68 = point51.x;
        boolean boolean69 = point37.equals((java.lang.Object) point51);
        java.lang.Double double70 = point51.x;
        Line line71 = new Line(point16, point51);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        java.lang.Double double15 = point11.y;
        boolean boolean16 = point8.equals((java.lang.Object) double15);
        java.lang.Double double17 = point8.y;
        java.lang.Double double18 = point8.x;
        point8.y = (-1.0d);
        Point point23 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 0.0d;
        java.lang.Object obj27 = null;
        boolean boolean28 = point23.equals(obj27);
        boolean boolean29 = point8.equals((java.lang.Object) boolean28);
        Line line30 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        java.lang.Double double29 = point20.x;
        point20.y = 0.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point34.x = 1.0d;
        point34.y = 1.0d;
        point34.y = (-1.0d);
        point34.y = 10.0d;
        point34.y = 1.0d;
        java.lang.Double double45 = point34.x;
        java.lang.Double double46 = point34.y;
        java.lang.Double double47 = point34.x;
        point34.y = (-1.0d);
        Line line50 = new Line(point20, point34);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.y;
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
        java.lang.Double double32 = point20.y;
        java.lang.Double double33 = point20.x;
        point20.x = (-1.0d);
        Line line36 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean23 = point21.equals((java.lang.Object) true);
        boolean boolean24 = point16.equals((java.lang.Object) true);
        java.lang.Double double25 = point16.y;
        java.lang.Double double26 = point16.y;
        point16.x = 100.0d;
        java.lang.Double double29 = point16.x;
        java.lang.Double double30 = point16.y;
        boolean boolean31 = point2.equals((java.lang.Object) point16);
        point16.x = 10.0d;
        Point point34 = null;
        Line line35 = new Line(point16, point34);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        java.lang.Double double11 = point9.y;
        java.lang.Double double12 = point9.x;
        java.lang.Double double13 = point9.y;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.x;
        point16.y = 0.0d;
        java.lang.Double double21 = point16.x;
        java.lang.Double double22 = point16.y;
        boolean boolean23 = point9.equals((java.lang.Object) point16);
        point16.y = (-1.0d);
        java.lang.Double double26 = point16.y;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point29.equals((java.lang.Object) point32);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        boolean boolean42 = point39.equals((java.lang.Object) 1L);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.x;
        boolean boolean48 = point45.equals((java.lang.Object) 10.0f);
        point45.x = 100.0d;
        boolean boolean51 = point39.equals((java.lang.Object) 100.0d);
        boolean boolean52 = point32.equals((java.lang.Object) boolean51);
        java.lang.Double double53 = point32.x;
        point32.y = (-1.0d);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        point58.y = 1.0d;
        java.lang.Double double62 = point58.y;
        java.lang.Object obj63 = new java.lang.Object();
        boolean boolean64 = point58.equals(obj63);
        java.lang.Double double65 = point58.y;
        point58.x = (-1.0d);
        point58.y = 0.0d;
        point58.x = 1.0d;
        boolean boolean72 = point32.equals((java.lang.Object) 1.0d);
        java.lang.Double double73 = point32.y;
        java.lang.Double double74 = point32.y;
        java.lang.Double double75 = point32.x;
        boolean boolean76 = point16.equals((java.lang.Object) point32);
        Line line77 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
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
        java.lang.Double double62 = point54.x;
        Line line63 = new Line(point2, point54);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point7.y = (-1.0d);
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.x;
        point7.y = (-1.0d);
        point7.y = 10.0d;
        Line line16 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
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
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point22.x = 0.0d;
        point22.y = 1.0d;
        Line line27 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
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
        point19.x = 10.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point34.x = 1.0d;
        point34.y = 1.0d;
        java.lang.Double double39 = point34.x;
        point34.x = (-1.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 100.0d;
        point44.x = 10.0d;
        java.lang.Double double52 = point44.y;
        boolean boolean53 = point34.equals((java.lang.Object) double52);
        point34.y = 0.0d;
        java.lang.Double double56 = point34.y;
        java.lang.Double double57 = point34.y;
        Point point60 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.x;
        java.lang.Double double62 = point60.y;
        java.lang.Double double63 = point60.y;
        point60.x = 100.0d;
        java.lang.Class<?> wildcardClass66 = point60.getClass();
        boolean boolean67 = point34.equals((java.lang.Object) wildcardClass66);
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point70.y = 0.0d;
        java.lang.Double double73 = point70.y;
        java.lang.Double double74 = point70.x;
        Point point77 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double78 = point77.y;
        java.lang.Double double79 = point77.y;
        boolean boolean80 = point70.equals((java.lang.Object) point77);
        boolean boolean81 = point34.equals((java.lang.Object) point70);
        java.lang.Double double82 = point70.x;
        java.lang.Double double83 = point70.y;
        Point point86 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point89 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point89.x = 1.0d;
        point89.x = 1.0d;
        boolean boolean94 = point86.equals((java.lang.Object) 1.0d);
        boolean boolean95 = point70.equals((java.lang.Object) point86);
        Line line96 = new Line(point19, point70);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = (-1.0d);
        java.lang.Double double12 = point2.x;
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
        point15.y = 0.0d;
        java.lang.Double double39 = point15.x;
        Line line40 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        java.lang.Double double35 = point2.y;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point38.y = 0.0d;
        java.lang.Double double41 = point38.y;
        java.lang.Double double42 = point38.x;
        point38.x = 1.0d;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        java.lang.Double double51 = point47.y;
        java.lang.Object obj52 = new java.lang.Object();
        boolean boolean53 = point47.equals(obj52);
        java.lang.Double double54 = point47.y;
        point47.x = 1.0d;
        boolean boolean57 = point38.equals((java.lang.Object) point47);
        Point point60 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean61 = point47.equals((java.lang.Object) point60);
        java.lang.Double double62 = point60.x;
        java.lang.Double double63 = point60.x;
        point60.y = 0.0d;
        point60.x = 1.0d;
        Line line68 = new Line(point2, point60);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
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
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        java.lang.Double double56 = point53.y;
        java.lang.Double double57 = point53.y;
        point53.x = 0.0d;
        point53.y = (-1.0d);
        point53.x = 100.0d;
        Line line64 = new Line(point16, point53);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.y = 0.0d;
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        java.lang.Double double19 = point17.y;
        boolean boolean20 = point14.equals((java.lang.Object) point17);
        java.lang.Double double21 = point17.x;
        java.lang.Double double22 = point17.x;
        point17.x = (-1.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean34 = point27.equals((java.lang.Object) point30);
        point27.y = 0.0d;
        java.lang.Double double37 = point27.x;
        boolean boolean38 = point17.equals((java.lang.Object) point27);
        Line line39 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
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
        point8.x = 10.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point8.equals(obj22);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point26.x = 0.0d;
        point26.y = 1.0d;
        point26.y = 1.0d;
        java.lang.Double double33 = point26.x;
        point26.x = 10.0d;
        Line line36 = new Line(point8, point26);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = point2.equals(obj3);
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point7.y = 100.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point12.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 1.0d;
        java.lang.Double double23 = point17.y;
        java.lang.Double double24 = point17.y;
        point17.x = 10.0d;
        boolean boolean27 = point12.equals((java.lang.Object) point17);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        point30.y = 10.0d;
        boolean boolean36 = point17.equals((java.lang.Object) point30);
        java.lang.Double double37 = point17.x;
        boolean boolean38 = point7.equals((java.lang.Object) double37);
        java.lang.Double double39 = point7.y;
        java.lang.Double double40 = point7.x;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point43.y = (-1.0d);
        java.lang.Double double46 = point43.y;
        java.lang.Double double47 = point43.x;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        point50.x = 10.0d;
        java.lang.Double double58 = point50.y;
        point50.y = 0.0d;
        Point point63 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double64 = point63.y;
        point63.y = 100.0d;
        boolean boolean67 = point50.equals((java.lang.Object) point63);
        point63.y = 1.0d;
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point72.x = 1.0d;
        point72.y = 1.0d;
        java.lang.Double double77 = point72.x;
        point72.x = (-1.0d);
        java.lang.Class<?> wildcardClass80 = point72.getClass();
        boolean boolean81 = point63.equals((java.lang.Object) wildcardClass80);
        point63.x = 0.0d;
        boolean boolean84 = point43.equals((java.lang.Object) 0.0d);
        java.lang.Double double85 = point43.x;
        java.lang.Double double86 = point43.y;
        Point point89 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double90 = point89.y;
        boolean boolean92 = point89.equals((java.lang.Object) 0.0d);
        java.lang.Double double93 = point89.x;
        boolean boolean94 = point43.equals((java.lang.Object) point89);
        java.lang.Double double95 = point89.x;
        boolean boolean96 = point7.equals((java.lang.Object) double95);
        Line line97 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
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
        java.lang.Double double27 = point8.x;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point30.x = 10.0d;
        java.lang.Double double33 = point30.x;
        java.lang.Double double34 = point30.y;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        point37.x = 0.0d;
        java.lang.Class<?> wildcardClass48 = point37.getClass();
        boolean boolean49 = point30.equals((java.lang.Object) wildcardClass48);
        Line line50 = new Line(point8, point30);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.x;
        java.lang.Double double21 = point15.x;
        point15.x = 0.0d;
        Line line24 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        boolean boolean24 = point18.equals((java.lang.Object) 10.0d);
        boolean boolean25 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double26 = point2.x;
        point2.x = 10.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point31.y = 10.0d;
        java.lang.Double double34 = point31.x;
        java.lang.Double double35 = point31.x;
        java.lang.Double double36 = point31.x;
        boolean boolean37 = point2.equals((java.lang.Object) point31);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 1.0d;
        java.lang.Object obj46 = null;
        boolean boolean47 = point40.equals(obj46);
        point40.x = 1.0d;
        boolean boolean51 = point40.equals((java.lang.Object) false);
        java.lang.Double double52 = point40.x;
        java.lang.Double double53 = point40.x;
        Line line54 = new Line(point31, point40);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
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
        point2.y = 0.0d;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point35.x = 0.0d;
        point35.y = 1.0d;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.x = 100.0d;
        point42.x = 10.0d;
        java.lang.Double double50 = point42.y;
        point42.y = 0.0d;
        java.lang.Double double53 = point42.x;
        boolean boolean54 = point35.equals((java.lang.Object) point42);
        java.lang.Double double55 = point42.x;
        point42.x = 0.0d;
        Line line58 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
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
        java.lang.Double double23 = point15.x;
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.x;
        java.lang.Double double28 = point26.y;
        point26.y = (-1.0d);
        java.lang.Class<?> wildcardClass31 = point26.getClass();
        boolean boolean32 = point15.equals((java.lang.Object) point26);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 100.0d;
        point35.x = 10.0d;
        java.lang.Double double43 = point35.x;
        point35.y = (-1.0d);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        point48.x = 100.0d;
        point48.x = 10.0d;
        java.lang.Double double56 = point48.x;
        java.lang.Double double57 = point48.x;
        java.lang.Double double58 = point48.y;
        java.lang.Class<?> wildcardClass59 = point48.getClass();
        boolean boolean60 = point35.equals((java.lang.Object) point48);
        Line line61 = new Line(point26, point35);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        point15.y = 10.0d;
        point15.y = (-1.0d);
        java.lang.Object obj21 = null;
        boolean boolean22 = point15.equals(obj21);
        point15.x = (-1.0d);
        java.lang.Object obj25 = null;
        boolean boolean26 = point15.equals(obj25);
        java.lang.Double double27 = point15.y;
        java.lang.Double double28 = point15.x;
        point15.y = 100.0d;
        point15.y = (-1.0d);
        java.lang.Double double33 = point15.x;
        Line line34 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
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
        java.lang.Double double28 = point2.y;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        Point point34 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean36 = point34.equals((java.lang.Object) (byte) 100);
        java.lang.Double double37 = point34.x;
        point34.x = (-1.0d);
        boolean boolean40 = point31.equals((java.lang.Object) (-1.0d));
        Line line41 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.x;
        point11.y = 1.0d;
        java.lang.Double double19 = point11.x;
        java.lang.Double double20 = point11.y;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 1.0d;
        java.lang.Object obj29 = null;
        boolean boolean30 = point23.equals(obj29);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point33.y = 0.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.x;
        point33.x = 1.0d;
        boolean boolean40 = point23.equals((java.lang.Object) 1.0d);
        boolean boolean41 = point11.equals((java.lang.Object) point23);
        java.lang.Double double42 = point11.x;
        java.lang.Double double43 = point11.y;
        point11.y = (-1.0d);
        Line line46 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point6.x = 1.0d;
        point6.y = 1.0d;
        point6.y = (-1.0d);
        boolean boolean13 = point2.equals((java.lang.Object) point6);
        java.lang.Double double14 = point6.x;
        point6.x = 0.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        java.lang.Double double23 = point19.y;
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = point19.equals(obj24);
        java.lang.Double double26 = point19.x;
        java.lang.Double double27 = point19.y;
        point19.x = (-1.0d);
        point19.y = 100.0d;
        point19.y = 10.0d;
        boolean boolean34 = point6.equals((java.lang.Object) 10.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.x;
        boolean boolean40 = point37.equals((java.lang.Object) 10.0f);
        point37.x = 100.0d;
        java.lang.Double double43 = point37.x;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point46.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        java.lang.Double double50 = point37.y;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 100.0d;
        java.lang.Double double59 = point53.x;
        boolean boolean60 = point37.equals((java.lang.Object) point53);
        java.lang.Double double61 = point37.x;
        point37.y = 100.0d;
        point37.y = 1.0d;
        java.lang.Double double66 = point37.x;
        java.lang.Class<?> wildcardClass67 = point37.getClass();
        boolean boolean68 = point6.equals((java.lang.Object) point37);
        Point point71 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double72 = point71.y;
        point71.y = 10.0d;
        point71.y = 10.0d;
        java.lang.Double double77 = point71.x;
        point71.y = 10.0d;
        Point point82 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point82.y = 1.0d;
        point82.y = (-1.0d);
        java.lang.Double double87 = point82.x;
        point82.y = 1.0d;
        point82.y = 0.0d;
        boolean boolean92 = point71.equals((java.lang.Object) point82);
        point82.y = 10.0d;
        Line line95 = new Line(point6, point82);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.y = (-1.0d);
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
        java.lang.Double double27 = point20.x;
        boolean boolean28 = point2.equals((java.lang.Object) double27);
        Point point29 = null;
        Line line30 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        java.lang.Double double17 = point13.y;
        point13.y = 100.0d;
        point13.x = 10.0d;
        Line line22 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
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
        point2.x = 0.0d;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean34 = point32.equals((java.lang.Object) true);
        boolean boolean35 = point27.equals((java.lang.Object) true);
        java.lang.Double double36 = point27.y;
        Line line37 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
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
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        point32.y = (-1.0d);
        java.lang.Object obj38 = null;
        boolean boolean39 = point32.equals(obj38);
        point32.x = (-1.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 100.0d;
        point44.x = 10.0d;
        java.lang.Double double52 = point44.y;
        point44.y = 0.0d;
        java.lang.Double double55 = point44.x;
        point44.y = (-1.0d);
        point44.y = 10.0d;
        java.lang.Double double60 = point44.x;
        boolean boolean61 = point32.equals((java.lang.Object) double60);
        Line line62 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
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
        point15.y = (-1.0d);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 1.0d;
        java.lang.Object obj30 = null;
        boolean boolean31 = point24.equals(obj30);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        point34.x = 1.0d;
        boolean boolean41 = point24.equals((java.lang.Object) 1.0d);
        java.lang.Double double42 = point24.y;
        java.lang.Double double43 = point24.x;
        java.lang.Double double44 = point24.x;
        point24.y = 10.0d;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        java.lang.Double double54 = point49.y;
        java.lang.Double double55 = point49.y;
        point49.y = 1.0d;
        point49.y = 1.0d;
        point49.y = 100.0d;
        Point point64 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double65 = point64.y;
        java.lang.Double double66 = point64.x;
        point64.y = 0.0d;
        point64.y = (-1.0d);
        point64.y = 100.0d;
        java.lang.Double double73 = point64.x;
        boolean boolean74 = point49.equals((java.lang.Object) point64);
        boolean boolean75 = point24.equals((java.lang.Object) boolean74);
        Line line76 = new Line(point15, point24);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
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
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point33.x = 0.0d;
        point33.x = (-1.0d);
        Line line38 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double6 = point2.x;
        java.lang.Object obj7 = null;
        boolean boolean8 = point2.equals(obj7);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 0.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.x;
        Point point18 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        boolean boolean21 = point11.equals((java.lang.Object) point18);
        java.lang.Double double22 = point18.y;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        boolean boolean31 = point28.equals((java.lang.Object) 1L);
        java.lang.Double double32 = point28.y;
        boolean boolean33 = point25.equals((java.lang.Object) double32);
        java.lang.Double double34 = point25.y;
        java.lang.Double double35 = point25.x;
        point25.x = 100.0d;
        point25.y = 0.0d;
        java.lang.Object obj40 = null;
        boolean boolean41 = point25.equals(obj40);
        boolean boolean42 = point18.equals((java.lang.Object) point25);
        Line line43 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.x;
        java.lang.Double double13 = point11.y;
        java.lang.Double double14 = point11.y;
        point11.y = 0.0d;
        java.lang.Double double17 = point11.y;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        boolean boolean26 = point23.equals((java.lang.Object) 1L);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.x;
        boolean boolean32 = point29.equals((java.lang.Object) 10.0f);
        point29.x = 100.0d;
        boolean boolean35 = point23.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass36 = point23.getClass();
        boolean boolean37 = point20.equals((java.lang.Object) wildcardClass36);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        boolean boolean46 = point40.equals((java.lang.Object) point43);
        point40.x = 10.0d;
        boolean boolean49 = point20.equals((java.lang.Object) point40);
        point20.x = 10.0d;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        java.lang.Double double58 = point54.y;
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = point54.equals(obj59);
        point54.x = 1.0d;
        java.lang.Double double63 = point54.y;
        java.lang.Double double64 = point54.x;
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.x;
        boolean boolean74 = point71.equals((java.lang.Object) 10.0f);
        point71.x = 100.0d;
        java.lang.Double double77 = point71.x;
        point71.y = 1.0d;
        point71.y = 1.0d;
        boolean boolean82 = point67.equals((java.lang.Object) point71);
        java.lang.Class<?> wildcardClass83 = point71.getClass();
        boolean boolean84 = point54.equals((java.lang.Object) point71);
        java.lang.Double double85 = point54.x;
        boolean boolean86 = point20.equals((java.lang.Object) double85);
        java.lang.Double double87 = point20.x;
        boolean boolean88 = point11.equals((java.lang.Object) double87);
        point11.y = 10.0d;
        Line line91 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line91.equals(line91)", line91.equals(line91));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
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
        point23.x = 1.0d;
        point23.y = 1.0d;
        java.lang.Double double28 = point23.x;
        point23.x = (-1.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        point33.x = 100.0d;
        point33.x = 10.0d;
        java.lang.Double double41 = point33.y;
        boolean boolean42 = point23.equals((java.lang.Object) double41);
        point23.y = 0.0d;
        boolean boolean45 = point2.equals((java.lang.Object) point23);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point48.x = 1.0d;
        point48.y = 1.0d;
        java.lang.Double double53 = point48.x;
        point48.x = (-1.0d);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        point58.y = 1.0d;
        point58.x = 100.0d;
        point58.x = 10.0d;
        java.lang.Double double66 = point58.y;
        boolean boolean67 = point48.equals((java.lang.Object) double66);
        point48.y = (-1.0d);
        java.lang.Double double70 = point48.x;
        point48.x = 1.0d;
        Point point75 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point75.y = 1.0d;
        point75.y = (-1.0d);
        point75.x = 0.0d;
        point75.x = 1.0d;
        point75.x = (-1.0d);
        boolean boolean86 = point48.equals((java.lang.Object) point75);
        Line line87 = new Line(point23, point48);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point20.x = 1.0d;
        point20.y = 1.0d;
        point20.y = (-1.0d);
        point20.y = 10.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        java.lang.Double double33 = point31.x;
        java.lang.Double double34 = point31.x;
        point31.y = 0.0d;
        boolean boolean38 = point31.equals((java.lang.Object) '#');
        point31.x = 0.0d;
        point31.y = 100.0d;
        java.lang.Double double43 = point31.x;
        boolean boolean44 = point20.equals((java.lang.Object) double43);
        java.lang.Double double45 = point20.y;
        Line line46 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
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
        point2.x = (-1.0d);
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.x;
        java.lang.Double double23 = point21.y;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        boolean boolean34 = point26.equals((java.lang.Object) double33);
        point26.x = 10.0d;
        boolean boolean37 = point21.equals((java.lang.Object) point26);
        Line line38 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
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
        java.lang.Double double32 = point16.y;
        point16.x = (-1.0d);
        Line line35 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
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
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        java.lang.Double double37 = point32.y;
        java.lang.Double double38 = point32.y;
        java.lang.Double double39 = point32.y;
        point32.y = 100.0d;
        java.lang.Double double42 = point32.x;
        Line line43 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
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
        java.lang.Double double31 = point2.y;
        java.lang.Double double32 = point2.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point35.x = 1.0d;
        point35.y = 1.0d;
        java.lang.Double double40 = point35.x;
        point35.x = (-1.0d);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        point45.y = 1.0d;
        point45.x = 100.0d;
        point45.x = 10.0d;
        java.lang.Double double53 = point45.y;
        boolean boolean54 = point35.equals((java.lang.Object) double53);
        point35.y = 0.0d;
        java.lang.Double double57 = point35.y;
        java.lang.Double double58 = point35.y;
        Point point61 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.x;
        java.lang.Double double63 = point61.y;
        java.lang.Double double64 = point61.y;
        point61.x = 100.0d;
        java.lang.Class<?> wildcardClass67 = point61.getClass();
        boolean boolean68 = point35.equals((java.lang.Object) wildcardClass67);
        Point point71 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point71.y = 0.0d;
        java.lang.Double double74 = point71.y;
        java.lang.Double double75 = point71.x;
        Point point78 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double79 = point78.y;
        java.lang.Double double80 = point78.y;
        boolean boolean81 = point71.equals((java.lang.Object) point78);
        boolean boolean82 = point35.equals((java.lang.Object) point71);
        java.lang.Double double83 = point71.y;
        point71.y = (-1.0d);
        Line line86 = new Line(point2, point71);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        java.lang.Object obj10 = null;
        boolean boolean11 = point2.equals(obj10);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        java.lang.Double double20 = point14.y;
        java.lang.Class<?> wildcardClass21 = point14.getClass();
        boolean boolean22 = point2.equals((java.lang.Object) point14);
        java.lang.Double double23 = point2.y;
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.x;
        java.lang.Double double28 = point26.y;
        java.lang.Double double29 = point26.y;
        point26.y = (-1.0d);
        java.lang.Double double32 = point26.x;
        Line line33 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point24.x = 100.0d;
        boolean boolean27 = point15.equals((java.lang.Object) 100.0d);
        java.lang.Double double28 = point15.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.x;
        boolean boolean38 = point15.equals((java.lang.Object) point31);
        boolean boolean39 = point2.equals((java.lang.Object) point31);
        java.lang.Double double40 = point31.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 0.0d;
        Point point48 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.x;
        java.lang.Double double50 = point48.y;
        java.lang.Double double51 = point48.y;
        java.lang.Double double52 = point48.y;
        boolean boolean53 = point43.equals((java.lang.Object) point48);
        java.lang.Double double54 = point43.y;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        boolean boolean60 = point57.equals((java.lang.Object) 1L);
        point57.y = (-1.0d);
        java.lang.Double double63 = point57.y;
        boolean boolean64 = point43.equals((java.lang.Object) point57);
        point43.y = 1.0d;
        java.lang.Double double67 = point43.x;
        java.lang.Double double68 = point43.y;
        Line line69 = new Line(point31, point43);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.y;
        point2.y = 100.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.x;
        java.lang.Double double22 = point19.x;
        point19.y = 0.0d;
        point19.y = 1.0d;
        Line line27 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point30.x = 100.0d;
        boolean boolean33 = point21.equals((java.lang.Object) 100.0d);
        point21.x = 10.0d;
        boolean boolean36 = point15.equals((java.lang.Object) point21);
        point21.y = (-1.0d);
        java.lang.Double double39 = point21.x;
        Line line40 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        boolean boolean16 = point10.equals((java.lang.Object) point13);
        point10.x = 1.0d;
        java.lang.Double double19 = point10.x;
        Line line20 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
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
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point23.x = 100.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        java.lang.Double double34 = point28.y;
        java.lang.Double double35 = point28.y;
        point28.x = 10.0d;
        boolean boolean38 = point23.equals((java.lang.Object) point28);
        java.lang.Double double39 = point28.y;
        java.lang.Double double40 = point28.x;
        boolean boolean41 = point2.equals((java.lang.Object) double40);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        java.lang.Double double47 = point44.y;
        java.lang.Double double48 = point44.y;
        java.lang.Double double49 = point44.x;
        java.lang.Double double50 = point44.y;
        java.lang.Double double51 = point44.y;
        java.lang.Double double52 = point44.y;
        java.lang.Double double53 = point44.y;
        java.lang.Double double54 = point44.y;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.y;
        point60.y = 10.0d;
        boolean boolean64 = point57.equals((java.lang.Object) point60);
        java.lang.Double double65 = point57.x;
        java.lang.Double double66 = point57.y;
        point57.x = 10.0d;
        Point point71 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 100.0d);
        point71.x = 100.0d;
        boolean boolean74 = point57.equals((java.lang.Object) 100.0d);
        boolean boolean75 = point44.equals((java.lang.Object) point57);
        Point point78 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point78.y = 1.0d;
        point78.y = (-1.0d);
        java.lang.Double double83 = point78.y;
        java.lang.Double double84 = point78.y;
        point78.y = 1.0d;
        point78.y = 1.0d;
        java.lang.Double double89 = point78.y;
        point78.y = (-1.0d);
        java.lang.Double double92 = point78.y;
        boolean boolean93 = point44.equals((java.lang.Object) point78);
        Line line94 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        java.lang.Double double10 = point8.y;
        java.lang.Double double11 = point8.y;
        point8.y = (-1.0d);
        Line line14 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
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
        point2.x = 100.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 1.0d;
        java.lang.Object obj37 = null;
        boolean boolean38 = point31.equals(obj37);
        point31.x = 1.0d;
        java.lang.Double double41 = point31.x;
        Line line42 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
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
        point2.y = 0.0d;
        java.lang.Double double26 = point2.y;
        java.lang.Double double27 = point2.y;
        java.lang.Double double28 = point2.x;
        java.lang.Double double29 = point2.y;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        java.lang.Double double37 = point32.y;
        java.lang.Double double38 = point32.y;
        point32.y = 1.0d;
        point32.y = 100.0d;
        point32.x = 1.0d;
        point32.y = 10.0d;
        java.lang.Double double47 = point32.y;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.y;
        java.lang.Double double52 = point50.x;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean57 = point55.equals((java.lang.Object) true);
        boolean boolean58 = point50.equals((java.lang.Object) true);
        boolean boolean59 = point32.equals((java.lang.Object) true);
        java.lang.Double double60 = point32.y;
        Line line61 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
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
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        java.lang.Double double43 = point40.y;
        java.lang.Double double44 = point40.y;
        point40.y = 0.0d;
        java.lang.Double double47 = point40.y;
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean52 = point50.equals((java.lang.Object) (byte) 100);
        java.lang.Double double53 = point50.x;
        point50.x = (-1.0d);
        point50.x = 10.0d;
        point50.y = (-1.0d);
        point50.x = 10.0d;
        boolean boolean62 = point40.equals((java.lang.Object) point50);
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point65.x = 0.0d;
        point65.y = 1.0d;
        java.lang.Double double70 = point65.x;
        java.lang.Double double71 = point65.x;
        boolean boolean72 = point40.equals((java.lang.Object) point65);
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double76 = point75.y;
        point75.y = 1.0d;
        point75.x = 100.0d;
        point75.x = 10.0d;
        point75.x = 10.0d;
        point75.x = 10.0d;
        point75.x = 10.0d;
        boolean boolean89 = point40.equals((java.lang.Object) point75);
        Line line90 = new Line(point2, point75);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
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
        java.lang.Double double32 = point14.y;
        java.lang.Double double33 = point14.x;
        java.lang.Double double34 = point14.x;
        point14.y = 10.0d;
        point14.y = 100.0d;
        point14.x = 10.0d;
        boolean boolean41 = point2.equals((java.lang.Object) 10.0d);
        Point point44 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double45 = point44.x;
        java.lang.Double double46 = point44.x;
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double50 = point49.y;
        boolean boolean51 = point44.equals((java.lang.Object) double50);
        point44.x = (-1.0d);
        java.lang.Double double54 = point44.y;
        Line line55 = new Line(point2, point44);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 1.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        java.lang.Double double23 = point17.x;
        point17.x = 0.0d;
        boolean boolean26 = point2.equals((java.lang.Object) point17);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point29.y = 100.0d;
        java.lang.Object obj32 = null;
        boolean boolean33 = point29.equals(obj32);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.x;
        java.lang.Double double39 = point36.x;
        point36.y = 0.0d;
        boolean boolean43 = point36.equals((java.lang.Object) '#');
        point36.x = 0.0d;
        point36.y = 100.0d;
        boolean boolean48 = point29.equals((java.lang.Object) point36);
        Line line49 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
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
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        boolean boolean34 = point26.equals((java.lang.Object) double33);
        point26.x = 10.0d;
        java.lang.Double double37 = point26.x;
        point26.x = 10.0d;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        boolean boolean45 = point26.equals((java.lang.Object) double44);
        java.lang.Double double46 = point26.y;
        java.lang.Double double47 = point26.x;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point53.x = 1.0d;
        point53.y = 1.0d;
        boolean boolean58 = point50.equals((java.lang.Object) 1.0d);
        java.lang.Double double59 = point50.y;
        point50.x = 0.0d;
        point50.y = (-1.0d);
        Point point66 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.y;
        boolean boolean72 = point69.equals((java.lang.Object) 1L);
        java.lang.Double double73 = point69.y;
        boolean boolean74 = point66.equals((java.lang.Object) double73);
        java.lang.Double double75 = point66.y;
        point66.x = 1.0d;
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double81 = point80.y;
        point80.y = 10.0d;
        point80.y = (-1.0d);
        java.lang.Object obj86 = null;
        boolean boolean87 = point80.equals(obj86);
        point80.x = (-1.0d);
        point80.y = (-1.0d);
        point80.y = 100.0d;
        point80.x = 0.0d;
        boolean boolean96 = point66.equals((java.lang.Object) point80);
        boolean boolean97 = point50.equals((java.lang.Object) point80);
        boolean boolean98 = point26.equals((java.lang.Object) point50);
        Line line99 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        java.lang.Class<?> wildcardClass8 = point6.getClass();
        boolean boolean9 = point2.equals((java.lang.Object) wildcardClass8);
        java.lang.Double double10 = point2.x;
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point15.x = 0.0d;
        java.lang.Double double18 = point15.x;
        java.lang.Double double19 = point15.y;
        point15.x = 100.0d;
        Line line22 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point7.x = 100.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 1.0d;
        java.lang.Double double18 = point12.y;
        java.lang.Double double19 = point12.y;
        point12.x = 10.0d;
        boolean boolean22 = point7.equals((java.lang.Object) point12);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        point25.y = 10.0d;
        point25.y = 10.0d;
        boolean boolean31 = point12.equals((java.lang.Object) point25);
        java.lang.Double double32 = point12.x;
        point12.x = (-1.0d);
        point12.y = 1.0d;
        Line line37 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.y = (-1.0d);
        Point point17 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 0.0d;
        java.lang.Object obj21 = null;
        boolean boolean22 = point17.equals(obj21);
        boolean boolean23 = point2.equals((java.lang.Object) boolean22);
        java.lang.Double double24 = point2.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        point27.y = 1.0d;
        java.lang.Double double32 = point27.x;
        point27.x = 1.0d;
        Point point37 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double38 = point37.x;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        java.lang.Class<?> wildcardClass43 = point41.getClass();
        boolean boolean44 = point37.equals((java.lang.Object) wildcardClass43);
        point37.x = 0.0d;
        point37.y = 0.0d;
        boolean boolean49 = point27.equals((java.lang.Object) 0.0d);
        java.lang.Double double50 = point27.x;
        point27.y = 100.0d;
        Line line53 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point2.y = 100.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass25 = point12.getClass();
        boolean boolean26 = point9.equals((java.lang.Object) wildcardClass25);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point29.equals((java.lang.Object) point32);
        point29.x = 10.0d;
        boolean boolean38 = point9.equals((java.lang.Object) point29);
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point41.x = 0.0d;
        point41.y = (-1.0d);
        point41.y = 100.0d;
        java.lang.Double double48 = point41.x;
        boolean boolean49 = point29.equals((java.lang.Object) point41);
        boolean boolean51 = point29.equals((java.lang.Object) (-1));
        java.lang.Double double52 = point29.x;
        point29.y = 1.0d;
        Line line55 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double17 = point16.y;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 0.0d;
        Point point25 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.x;
        java.lang.Double double27 = point25.y;
        java.lang.Double double28 = point25.y;
        java.lang.Double double29 = point25.y;
        boolean boolean30 = point20.equals((java.lang.Object) point25);
        boolean boolean31 = point16.equals((java.lang.Object) point20);
        point16.y = 1.0d;
        Line line34 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Object obj13 = null;
        boolean boolean14 = point2.equals(obj13);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        java.lang.Double double20 = point18.y;
        java.lang.Double double21 = point18.y;
        point18.y = 0.0d;
        point18.y = 0.0d;
        java.lang.Double double26 = point18.x;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point29.x = 100.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 1.0d;
        java.lang.Double double40 = point34.y;
        java.lang.Double double41 = point34.y;
        point34.x = 10.0d;
        boolean boolean44 = point29.equals((java.lang.Object) point34);
        java.lang.Double double45 = point34.y;
        Point point48 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        boolean boolean50 = point34.equals((java.lang.Object) point48);
        boolean boolean51 = point18.equals((java.lang.Object) point48);
        point18.x = (-1.0d);
        Line line54 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 0.0d;
        point12.y = 1.0d;
        java.lang.Double double17 = point12.x;
        point12.y = 0.0d;
        java.lang.Double double20 = point12.y;
        Line line21 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
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
        point2.y = 0.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point22.x = 0.0d;
        point22.y = 1.0d;
        java.lang.Double double27 = point22.x;
        point22.x = 10.0d;
        java.lang.Object obj30 = null;
        boolean boolean31 = point22.equals(obj30);
        java.lang.Double double32 = point22.y;
        Line line33 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        point2.y = 0.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        point21.y = (-1.0d);
        java.lang.Double double27 = point21.y;
        java.lang.Double double28 = point21.y;
        point21.y = 10.0d;
        java.lang.Double double31 = point21.y;
        Line line32 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point24.x = 100.0d;
        boolean boolean27 = point15.equals((java.lang.Object) 100.0d);
        java.lang.Double double28 = point15.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.x;
        boolean boolean38 = point15.equals((java.lang.Object) point31);
        boolean boolean39 = point2.equals((java.lang.Object) point31);
        java.lang.Double double40 = point2.y;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 0.0d;
        point43.y = 1.0d;
        point43.x = 1.0d;
        java.lang.Double double50 = point43.y;
        java.lang.Class<?> wildcardClass51 = point43.getClass();
        boolean boolean52 = point2.equals((java.lang.Object) point43);
        java.lang.Double double53 = point2.y;
        Point point54 = null;
        Line line55 = new Line(point2, point54);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        java.lang.Object obj25 = null;
        boolean boolean26 = point2.equals(obj25);
        point2.y = 10.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.x;
        boolean boolean34 = point31.equals((java.lang.Object) 10.0f);
        point31.x = 100.0d;
        java.lang.Double double37 = point31.x;
        point31.y = 1.0d;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        point42.y = 10.0d;
        point42.y = (-1.0d);
        java.lang.Class<?> wildcardClass48 = point42.getClass();
        boolean boolean49 = point31.equals((java.lang.Object) wildcardClass48);
        java.lang.Double double50 = point31.y;
        java.lang.Double double51 = point31.x;
        point31.y = (-1.0d);
        Point point56 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double57 = point56.x;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.y;
        java.lang.Class<?> wildcardClass62 = point60.getClass();
        boolean boolean63 = point56.equals((java.lang.Object) wildcardClass62);
        java.lang.Double double64 = point56.y;
        boolean boolean65 = point31.equals((java.lang.Object) point56);
        Point point68 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        boolean boolean74 = point71.equals((java.lang.Object) 1L);
        java.lang.Double double75 = point71.y;
        boolean boolean76 = point68.equals((java.lang.Object) double75);
        java.lang.Double double77 = point68.y;
        java.lang.Double double78 = point68.x;
        point68.y = 100.0d;
        boolean boolean81 = point31.equals((java.lang.Object) point68);
        java.lang.Double double82 = point31.x;
        point31.y = 0.0d;
        Line line85 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.y;
        java.lang.Double double18 = point15.x;
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        java.lang.Double double22 = point15.x;
        Line line23 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 10.0d;
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        java.lang.Double double21 = point15.y;
        point15.y = 1.0d;
        point15.y = 100.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        boolean boolean35 = point28.equals((java.lang.Object) point31);
        boolean boolean37 = point31.equals((java.lang.Object) 10.0d);
        boolean boolean38 = point15.equals((java.lang.Object) 10.0d);
        java.lang.Double double39 = point15.x;
        point15.x = 10.0d;
        Line line42 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 0.0d;
        point11.y = 1.0d;
        point11.y = 1.0d;
        point11.y = 100.0d;
        point11.y = 0.0d;
        java.lang.Double double22 = point11.y;
        Line line23 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        point35.y = (-1.0d);
        point35.y = 100.0d;
        point35.x = (-1.0d);
        java.lang.Double double44 = point35.x;
        boolean boolean45 = point2.equals((java.lang.Object) point35);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point52.y = 1.0d;
        point52.y = (-1.0d);
        java.lang.Double double57 = point52.y;
        java.lang.Double double58 = point52.y;
        point52.y = 1.0d;
        point52.y = 1.0d;
        java.lang.Double double63 = point52.y;
        java.lang.Double double64 = point52.x;
        Line line65 = new Line(point2, point52);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
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
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        point39.y = 100.0d;
        point39.x = (-1.0d);
        java.lang.Double double48 = point39.x;
        java.lang.Double double49 = point39.x;
        java.lang.Double double50 = point39.y;
        point39.y = 100.0d;
        Line line53 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        point2.x = 1.0d;
        point2.x = (-1.0d);
        point2.x = 10.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Double double20 = point14.y;
        point14.y = 1.0d;
        point14.y = 100.0d;
        point14.x = 1.0d;
        point14.y = (-1.0d);
        point14.y = 1.0d;
        java.lang.Double double31 = point14.y;
        point14.y = 0.0d;
        Line line34 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double11 = point2.y;
        point2.x = 1.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.y;
        point16.y = (-1.0d);
        point16.y = 0.0d;
        point16.x = 100.0d;
        point16.y = 0.0d;
        Line line27 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
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
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point21.y = 100.0d;
        java.lang.Double double24 = point21.y;
        Line line25 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
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
        point2.x = (-1.0d);
        point2.y = (-1.0d);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        java.lang.Double double31 = point29.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean36 = point34.equals((java.lang.Object) true);
        boolean boolean37 = point29.equals((java.lang.Object) true);
        java.lang.Double double38 = point29.y;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.y = 0.0d;
        boolean boolean47 = point29.equals((java.lang.Object) point41);
        java.lang.Double double48 = point29.y;
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.x;
        point51.y = 0.0d;
        boolean boolean56 = point29.equals((java.lang.Object) 0.0d);
        java.lang.Double double57 = point29.y;
        Line line58 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
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
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 1.0d;
        java.lang.Double double33 = point27.y;
        java.lang.Double double34 = point27.y;
        Line line35 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
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
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        java.lang.Double double41 = point37.y;
        java.lang.Object obj42 = new java.lang.Object();
        boolean boolean43 = point37.equals(obj42);
        point37.x = 1.0d;
        java.lang.Double double46 = point37.y;
        java.lang.Double double47 = point37.x;
        point37.y = 1.0d;
        point37.y = 100.0d;
        boolean boolean52 = point26.equals((java.lang.Object) point37);
        point26.y = 100.0d;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        point57.y = 1.0d;
        java.lang.Double double61 = point57.y;
        java.lang.Object obj62 = new java.lang.Object();
        boolean boolean63 = point57.equals(obj62);
        java.lang.Double double64 = point57.y;
        point57.y = 100.0d;
        java.lang.Double double67 = point57.y;
        java.lang.Double double68 = point57.y;
        Line line69 = new Line(point26, point57);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = 0.0d;
        java.lang.Double double11 = point2.y;
        point2.x = 0.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        point16.y = 1.0d;
        point16.y = (-1.0d);
        java.lang.Double double23 = point16.x;
        boolean boolean24 = point2.equals((java.lang.Object) point16);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        point27.y = (-1.0d);
        java.lang.Double double33 = point27.y;
        java.lang.Double double34 = point27.y;
        java.lang.Double double35 = point27.x;
        point27.x = 10.0d;
        point27.y = 1.0d;
        point27.y = (-1.0d);
        boolean boolean42 = point16.equals((java.lang.Object) point27);
        Point point45 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.x;
        java.lang.Double double47 = point45.y;
        point45.y = (-1.0d);
        point45.x = 100.0d;
        point45.y = 100.0d;
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.x;
        boolean boolean59 = point56.equals((java.lang.Object) 10.0f);
        point56.x = 100.0d;
        java.lang.Double double62 = point56.y;
        boolean boolean63 = point45.equals((java.lang.Object) point56);
        point56.y = 0.0d;
        point56.y = 0.0d;
        Line line68 = new Line(point16, point56);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
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
        boolean boolean46 = point2.equals((java.lang.Object) point27);
        point2.x = 100.0d;
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        boolean boolean57 = point54.equals((java.lang.Object) 1L);
        java.lang.Double double58 = point54.y;
        boolean boolean59 = point51.equals((java.lang.Object) double58);
        point51.x = 10.0d;
        java.lang.Double double62 = point51.x;
        point51.y = 0.0d;
        point51.x = (-1.0d);
        Point point69 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point69.y = 0.0d;
        java.lang.Double double72 = point69.y;
        point69.x = 100.0d;
        point69.x = 100.0d;
        java.lang.Double double77 = point69.y;
        java.lang.Double double78 = point69.y;
        boolean boolean79 = point51.equals((java.lang.Object) point69);
        point69.y = (-1.0d);
        Line line82 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
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
        point2.y = 100.0d;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point22.x = 0.0d;
        point22.y = 1.0d;
        java.lang.Double double27 = point22.x;
        point22.x = 0.0d;
        java.lang.Double double30 = point22.x;
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
        java.lang.Double double58 = point38.x;
        point38.x = (-1.0d);
        boolean boolean61 = point22.equals((java.lang.Object) point38);
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.x;
        boolean boolean67 = point64.equals((java.lang.Object) 10.0f);
        point64.x = 100.0d;
        java.lang.Double double70 = point64.x;
        Point point73 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point73.x = 100.0d;
        boolean boolean76 = point64.equals((java.lang.Object) 100.0d);
        point64.x = 10.0d;
        java.lang.Double double79 = point64.x;
        java.lang.Double double80 = point64.x;
        boolean boolean81 = point38.equals((java.lang.Object) point64);
        java.lang.Double double82 = point64.y;
        Line line83 = new Line(point2, point64);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
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
        point15.x = 0.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        point38.y = 1.0d;
        point38.x = 100.0d;
        point38.x = 10.0d;
        java.lang.Double double46 = point38.y;
        point38.y = 0.0d;
        java.lang.Double double49 = point38.y;
        point38.x = (-1.0d);
        point38.x = 0.0d;
        Line line54 = new Line(point15, point38);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
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
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        java.lang.Double double35 = point31.y;
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = point31.equals(obj36);
        point31.x = 1.0d;
        java.lang.Double double40 = point31.y;
        point31.y = 100.0d;
        point31.x = 0.0d;
        point31.x = (-1.0d);
        Line line47 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
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
        point39.x = 10.0d;
        point39.y = (-1.0d);
        Point point57 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double58 = point57.x;
        java.lang.Double double59 = point57.y;
        java.lang.Double double60 = point57.y;
        point57.y = (-1.0d);
        point57.x = 0.0d;
        java.lang.Double double65 = point57.y;
        point57.y = (-1.0d);
        boolean boolean68 = point39.equals((java.lang.Object) (-1.0d));
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        point71.y = 1.0d;
        point71.x = 0.0d;
        boolean boolean78 = point71.equals((java.lang.Object) "");
        java.lang.Double double79 = point71.x;
        Line line80 = new Line(point39, point71);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
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
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.x;
        java.lang.Double double28 = point26.y;
        java.lang.Double double29 = point26.y;
        point26.y = 0.0d;
        point26.x = 1.0d;
        point26.x = 1.0d;
        Line line36 = new Line(point12, point26);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
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
        point2.x = 100.0d;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point42.y = 1.0d;
        point42.y = (-1.0d);
        java.lang.Double double47 = point42.x;
        java.lang.Double double48 = point42.x;
        Line line49 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point11.x = 0.0d;
        point11.y = 1.0d;
        Line line16 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.y = 10.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.x;
        java.lang.Double double24 = point22.y;
        java.lang.Double double25 = point22.y;
        java.lang.Double double26 = point22.y;
        boolean boolean27 = point17.equals((java.lang.Object) point22);
        java.lang.Double double28 = point17.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        boolean boolean34 = point31.equals((java.lang.Object) 1L);
        point31.y = (-1.0d);
        java.lang.Double double37 = point31.y;
        boolean boolean38 = point17.equals((java.lang.Object) point31);
        point17.y = 1.0d;
        java.lang.Double double41 = point17.x;
        java.lang.Double double42 = point17.x;
        java.lang.Double double43 = point17.y;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        java.lang.Double double50 = point46.y;
        java.lang.Object obj51 = new java.lang.Object();
        boolean boolean52 = point46.equals(obj51);
        java.lang.Double double53 = point46.y;
        point46.x = 1.0d;
        java.lang.Double double56 = point46.y;
        java.lang.Double double57 = point46.y;
        boolean boolean58 = point17.equals((java.lang.Object) double57);
        point17.x = 1.0d;
        Line line61 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        java.lang.Double double16 = point14.y;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Class<?> wildcardClass20 = point14.getClass();
        boolean boolean21 = point2.equals((java.lang.Object) wildcardClass20);
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
        java.lang.Class<?> wildcardClass43 = point24.getClass();
        boolean boolean44 = point2.equals((java.lang.Object) wildcardClass43);
        java.lang.Double double45 = point2.x;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.y;
        boolean boolean54 = point48.equals((java.lang.Object) point51);
        java.lang.Double double55 = point48.y;
        Line line56 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 100.0d;
        java.lang.Double double22 = point16.y;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point25.y = 0.0d;
        java.lang.Double double28 = point25.y;
        java.lang.Double double29 = point25.x;
        boolean boolean30 = point16.equals((java.lang.Object) double29);
        java.lang.Double double31 = point16.y;
        Line line32 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
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
        point16.y = 0.0d;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        point27.y = 10.0d;
        boolean boolean32 = point27.equals((java.lang.Object) 1L);
        Point point35 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double36 = point35.x;
        point35.x = 100.0d;
        Point point41 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.x;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        point45.y = 1.0d;
        java.lang.Double double49 = point45.y;
        java.lang.Object obj50 = new java.lang.Object();
        boolean boolean51 = point45.equals(obj50);
        java.lang.Double double52 = point45.y;
        java.lang.Class<?> wildcardClass53 = point45.getClass();
        boolean boolean54 = point41.equals((java.lang.Object) point45);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point57.y = 100.0d;
        point57.y = 0.0d;
        boolean boolean62 = point41.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass63 = point41.getClass();
        boolean boolean64 = point35.equals((java.lang.Object) wildcardClass63);
        point35.x = (-1.0d);
        boolean boolean67 = point27.equals((java.lang.Object) point35);
        Line line68 = new Line(point16, point35);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 1.0d;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point8.x = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 1.0d;
        java.lang.Double double19 = point13.y;
        java.lang.Double double20 = point13.y;
        point13.x = 10.0d;
        boolean boolean23 = point8.equals((java.lang.Object) point13);
        java.lang.Double double24 = point8.x;
        java.lang.Double double25 = point8.x;
        boolean boolean26 = point2.equals((java.lang.Object) point8);
        java.lang.Double double27 = point2.x;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        java.lang.Double double34 = point30.y;
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = point30.equals(obj35);
        point30.x = 1.0d;
        java.lang.Double double39 = point30.x;
        point30.y = 0.0d;
        point30.x = 1.0d;
        java.lang.Double double44 = point30.x;
        java.lang.Double double45 = point30.x;
        Line line46 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        boolean boolean26 = point18.equals((java.lang.Object) double25);
        java.lang.Double double27 = point18.y;
        point18.x = 1.0d;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        point32.y = (-1.0d);
        java.lang.Object obj38 = null;
        boolean boolean39 = point32.equals(obj38);
        point32.x = (-1.0d);
        point32.y = (-1.0d);
        point32.y = 100.0d;
        point32.x = 0.0d;
        boolean boolean48 = point18.equals((java.lang.Object) point32);
        boolean boolean49 = point2.equals((java.lang.Object) point32);
        Point point50 = null;
        Line line51 = new Line(point32, point50);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        point2.y = 100.0d;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 0.0d;
        point19.y = (-1.0d);
        point19.y = 0.0d;
        java.lang.Double double26 = point19.y;
        point19.y = 0.0d;
        Line line29 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.y;
        point11.y = 100.0d;
        java.lang.Class<?> wildcardClass15 = point11.getClass();
        boolean boolean16 = point2.equals((java.lang.Object) point11);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        java.lang.Object obj25 = null;
        boolean boolean26 = point19.equals(obj25);
        point19.x = 1.0d;
        point19.x = (-1.0d);
        java.lang.Double double31 = point19.x;
        Line line32 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.y = 100.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        java.lang.Double double20 = point17.y;
        java.lang.Double double21 = point17.y;
        point17.y = 10.0d;
        java.lang.Double double24 = point17.y;
        point17.x = 0.0d;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        boolean boolean38 = point29.equals((java.lang.Object) point33);
        boolean boolean39 = point17.equals((java.lang.Object) point33);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        point42.y = (-1.0d);
        java.lang.Double double48 = point42.y;
        java.lang.Double double49 = point42.y;
        java.lang.Double double50 = point42.x;
        point42.x = 10.0d;
        java.lang.Class<?> wildcardClass53 = point42.getClass();
        boolean boolean54 = point17.equals((java.lang.Object) point42);
        java.lang.Double double55 = point17.y;
        Line line56 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
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
        point11.y = 0.0d;
        java.lang.Double double23 = point11.y;
        java.lang.Double double24 = point11.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point27.y = 100.0d;
        point27.x = 0.0d;
        point27.x = 10.0d;
        point27.y = 100.0d;
        Line line36 = new Line(point11, point27);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        point2.y = 1.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double16 = point12.y;
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = point12.equals(obj17);
        java.lang.Double double19 = point12.x;
        java.lang.Double double20 = point12.y;
        point12.x = (-1.0d);
        point12.y = 100.0d;
        point12.y = 10.0d;
        java.lang.Double double27 = point12.x;
        point12.x = (-1.0d);
        Line line30 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        point2.y = 0.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        java.lang.Double double19 = point16.x;
        point16.y = 1.0d;
        point16.x = 0.0d;
        boolean boolean24 = point2.equals((java.lang.Object) point16);
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
        boolean boolean41 = point16.equals((java.lang.Object) point31);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.y;
        boolean boolean50 = point44.equals((java.lang.Object) point47);
        java.lang.Double double51 = point44.y;
        point44.y = 0.0d;
        java.lang.Double double54 = point44.y;
        java.lang.Double double55 = point44.y;
        point44.y = 1.0d;
        Line line58 = new Line(point16, point44);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
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
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double66 = point65.y;
        point65.y = 1.0d;
        point65.x = 1.0d;
        java.lang.Double double71 = point65.y;
        java.lang.Double double72 = point65.x;
        Point point75 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double76 = point75.x;
        java.lang.Double double77 = point75.x;
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double81 = point80.y;
        boolean boolean82 = point75.equals((java.lang.Object) double81);
        boolean boolean83 = point65.equals((java.lang.Object) point75);
        point65.y = (-1.0d);
        point65.y = (-1.0d);
        Point point90 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point90.y = 100.0d;
        java.lang.Double double93 = point90.y;
        java.lang.Double double94 = point90.y;
        boolean boolean95 = point65.equals((java.lang.Object) double94);
        Line line96 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.x = 10.0d;
        java.lang.Double double17 = point2.x;
        point2.x = 0.0d;
        Point point20 = null;
        Line line21 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double17 = point16.x;
        point16.x = 1.0d;
        java.lang.Double double20 = point16.x;
        java.lang.Double double21 = point16.x;
        point16.x = 0.0d;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        point26.y = 100.0d;
        point26.x = (-1.0d);
        java.lang.Double double35 = point26.x;
        boolean boolean36 = point16.equals((java.lang.Object) point26);
        Point point39 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point39.x = 100.0d;
        boolean boolean42 = point26.equals((java.lang.Object) 100.0d);
        Line line43 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
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
        point15.x = (-1.0d);
        java.lang.Double double39 = point15.y;
        Line line40 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point7.y = (-1.0d);
        java.lang.Double double10 = point7.x;
        point7.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean22 = point20.equals((java.lang.Object) true);
        boolean boolean23 = point15.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass24 = point15.getClass();
        boolean boolean25 = point7.equals((java.lang.Object) wildcardClass24);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        java.lang.Object obj34 = null;
        boolean boolean35 = point28.equals(obj34);
        point28.x = 1.0d;
        point28.x = (-1.0d);
        java.lang.Double double40 = point28.x;
        boolean boolean41 = point7.equals((java.lang.Object) point28);
        boolean boolean42 = point2.equals((java.lang.Object) point7);
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point45.y = 1.0d;
        point45.y = (-1.0d);
        java.lang.Double double50 = point45.y;
        java.lang.Double double51 = point45.y;
        java.lang.Double double52 = point45.y;
        java.lang.Double double53 = point45.y;
        java.lang.Double double54 = point45.x;
        point45.x = 1.0d;
        point45.y = 1.0d;
        point45.x = 0.0d;
        point45.y = 100.0d;
        Line line63 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass25 = point12.getClass();
        boolean boolean26 = point9.equals((java.lang.Object) wildcardClass25);
        java.lang.Double double27 = point9.y;
        java.lang.Double double28 = point9.y;
        Line line29 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
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
        point2.x = 10.0d;
        java.lang.Double double26 = point2.y;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point29.y = (-1.0d);
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
        boolean boolean50 = point29.equals((java.lang.Object) boolean49);
        java.lang.Double double51 = point29.y;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point54.x = 1.0d;
        point54.y = 1.0d;
        java.lang.Double double59 = point54.x;
        point54.x = (-1.0d);
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.y;
        point64.y = 1.0d;
        point64.x = 100.0d;
        point64.x = 10.0d;
        java.lang.Double double72 = point64.y;
        boolean boolean73 = point54.equals((java.lang.Object) double72);
        point54.y = (-1.0d);
        point54.x = (-1.0d);
        java.lang.Double double78 = point54.x;
        boolean boolean79 = point29.equals((java.lang.Object) point54);
        Line line80 = new Line(point2, point54);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = 0.0d;
        java.lang.Double double14 = point2.x;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        point17.y = 1.0d;
        java.lang.Double double22 = point17.x;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        point17.y = 100.0d;
        point17.y = 10.0d;
        Line line30 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point7);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point15.y = (-1.0d);
        java.lang.Double double18 = point15.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        point21.y = 1.0d;
        boolean boolean30 = point15.equals((java.lang.Object) point21);
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        java.lang.Double double38 = point33.y;
        java.lang.Double double39 = point33.y;
        point33.y = 1.0d;
        point33.y = 100.0d;
        java.lang.Double double44 = point33.x;
        boolean boolean45 = point21.equals((java.lang.Object) double44);
        Line line46 = new Line(point7, point21);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        java.lang.Double double16 = point12.y;
        boolean boolean17 = point9.equals((java.lang.Object) double16);
        point9.x = 10.0d;
        java.lang.Double double20 = point9.x;
        point9.x = 10.0d;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.y;
        boolean boolean28 = point9.equals((java.lang.Object) double27);
        java.lang.Double double29 = point9.y;
        java.lang.Double double30 = point9.y;
        java.lang.Double double31 = point9.x;
        boolean boolean32 = point2.equals((java.lang.Object) point9);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        java.lang.Double double39 = point35.y;
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = point35.equals(obj40);
        point35.x = 1.0d;
        point35.x = 10.0d;
        point35.y = 0.0d;
        boolean boolean48 = point2.equals((java.lang.Object) point35);
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        point51.y = (-1.0d);
        java.lang.Double double56 = point51.y;
        java.lang.Double double57 = point51.y;
        point51.y = 1.0d;
        point51.y = 100.0d;
        point51.y = 0.0d;
        java.lang.Double double64 = point51.y;
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        boolean boolean73 = point70.equals((java.lang.Object) 1L);
        java.lang.Double double74 = point70.y;
        boolean boolean75 = point67.equals((java.lang.Object) double74);
        java.lang.Double double76 = point67.x;
        boolean boolean77 = point51.equals((java.lang.Object) point67);
        Point point80 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point80.x = 0.0d;
        point80.y = (-1.0d);
        point80.y = 0.0d;
        point80.y = 10.0d;
        point80.x = 1.0d;
        boolean boolean91 = point51.equals((java.lang.Object) point80);
        point51.y = 0.0d;
        point51.x = 0.0d;
        Line line96 = new Line(point35, point51);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
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
        point2.y = 0.0d;
        java.lang.Double double23 = point2.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.x;
        boolean boolean29 = point26.equals((java.lang.Object) 10.0f);
        point26.x = 100.0d;
        java.lang.Double double32 = point26.x;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point35.x = 100.0d;
        boolean boolean38 = point26.equals((java.lang.Object) 100.0d);
        java.lang.Double double39 = point26.y;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.x = 100.0d;
        java.lang.Double double48 = point42.x;
        boolean boolean49 = point26.equals((java.lang.Object) point42);
        Line line50 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
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
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.y;
        point30.y = (-1.0d);
        point30.x = 0.0d;
        point30.y = 10.0d;
        Point point42 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double43 = point42.x;
        point42.x = 100.0d;
        point42.x = (-1.0d);
        boolean boolean48 = point30.equals((java.lang.Object) (-1.0d));
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 100.0d;
        point51.y = 10.0d;
        point51.y = 100.0d;
        boolean boolean61 = point30.equals((java.lang.Object) point51);
        point30.x = (-1.0d);
        Line line64 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
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
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.y;
        boolean boolean50 = point44.equals((java.lang.Object) point47);
        point44.x = 1.0d;
        Line line53 = new Line(point26, point44);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        boolean boolean22 = point13.equals((java.lang.Object) point17);
        java.lang.Double double23 = point13.x;
        Line line24 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
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
        java.lang.Double double26 = point2.y;
        point2.y = 0.0d;
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point31.x = 100.0d;
        java.lang.Double double34 = point31.y;
        boolean boolean35 = point2.equals((java.lang.Object) point31);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point38.y = 0.0d;
        java.lang.Double double41 = point38.y;
        point38.x = 100.0d;
        point38.x = 100.0d;
        java.lang.Double double46 = point38.y;
        Line line47 = new Line(point31, point38);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
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
        java.lang.Double double62 = point2.x;
        Point point65 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double66 = point65.y;
        java.lang.Double double67 = point65.y;
        java.lang.Double double68 = point65.x;
        java.lang.Double double69 = point65.y;
        Line line70 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        java.lang.Double double10 = point5.y;
        java.lang.Double double11 = point5.y;
        point5.x = 10.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.y;
        boolean boolean22 = point16.equals((java.lang.Object) point19);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.y;
        boolean boolean28 = point19.equals((java.lang.Object) double27);
        Point point31 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double32 = point31.y;
        java.lang.Double double33 = point31.x;
        java.lang.Double double34 = point31.x;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point37.y = 0.0d;
        java.lang.Double double40 = point37.y;
        point37.x = 100.0d;
        point37.x = 100.0d;
        java.lang.Double double45 = point37.y;
        boolean boolean46 = point31.equals((java.lang.Object) point37);
        java.lang.Double double47 = point37.x;
        boolean boolean48 = point19.equals((java.lang.Object) point37);
        point19.x = 100.0d;
        Line line51 = new Line(point5, point19);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
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
        java.lang.Double double29 = point20.y;
        java.lang.Double double30 = point20.y;
        point20.y = 0.0d;
        point20.y = 100.0d;
        Line line35 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double10 = point2.x;
        point2.x = 100.0d;
        point2.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.y;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        java.lang.Double double27 = point23.y;
        java.lang.Object obj28 = new java.lang.Object();
        boolean boolean29 = point23.equals(obj28);
        point23.x = 1.0d;
        java.lang.Double double32 = point23.x;
        boolean boolean33 = point17.equals((java.lang.Object) double32);
        java.lang.Double double34 = point17.x;
        point17.x = 10.0d;
        java.lang.Double double37 = point17.x;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        point40.y = 10.0d;
        java.lang.Object obj48 = null;
        boolean boolean49 = point40.equals(obj48);
        boolean boolean50 = point17.equals((java.lang.Object) point40);
        Line line51 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
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
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.x;
        point35.x = 1.0d;
        boolean boolean39 = point8.equals((java.lang.Object) 1.0d);
        point8.x = 100.0d;
        Line line42 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point2.y = (-1.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = point2.equals(obj5);
        point2.x = 100.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 1.0d;
        java.lang.Object obj17 = null;
        boolean boolean18 = point11.equals(obj17);
        point11.x = 1.0d;
        point11.y = 10.0d;
        point11.y = 10.0d;
        point11.y = (-1.0d);
        point11.x = 1.0d;
        Line line29 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        point2.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        point23.y = 100.0d;
        boolean boolean30 = point20.equals((java.lang.Object) 100.0d);
        java.lang.Double double31 = point20.y;
        point20.x = (-1.0d);
        java.lang.Double double34 = point20.x;
        boolean boolean35 = point2.equals((java.lang.Object) point20);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        java.lang.Double double45 = point41.y;
        boolean boolean46 = point38.equals((java.lang.Object) double45);
        java.lang.Double double47 = point38.y;
        java.lang.Double double48 = point38.x;
        point38.x = 100.0d;
        java.lang.Double double51 = point38.y;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        java.lang.Double double59 = point57.y;
        boolean boolean60 = point54.equals((java.lang.Object) point57);
        java.lang.Double double61 = point57.x;
        Point point64 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        boolean boolean70 = point67.equals((java.lang.Object) 1L);
        java.lang.Double double71 = point67.y;
        boolean boolean72 = point64.equals((java.lang.Object) double71);
        point64.x = 10.0d;
        java.lang.Double double75 = point64.x;
        point64.x = 10.0d;
        java.lang.Class<?> wildcardClass78 = point64.getClass();
        boolean boolean79 = point57.equals((java.lang.Object) wildcardClass78);
        boolean boolean80 = point38.equals((java.lang.Object) point57);
        Line line81 = new Line(point2, point57);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean23 = point21.equals((java.lang.Object) true);
        boolean boolean24 = point16.equals((java.lang.Object) true);
        java.lang.Double double25 = point16.y;
        java.lang.Double double26 = point16.y;
        point16.x = 100.0d;
        java.lang.Double double29 = point16.x;
        java.lang.Double double30 = point16.y;
        boolean boolean31 = point2.equals((java.lang.Object) point16);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.y = 10.0d;
        point34.y = 10.0d;
        point34.x = 100.0d;
        Point point48 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 0.0d;
        java.lang.Double double52 = point48.x;
        java.lang.Class<?> wildcardClass53 = point48.getClass();
        boolean boolean54 = point34.equals((java.lang.Object) point48);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.y;
        point60.y = 10.0d;
        boolean boolean64 = point57.equals((java.lang.Object) point60);
        boolean boolean66 = point60.equals((java.lang.Object) 10.0d);
        Point point69 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point69.y = 1.0d;
        java.lang.Double double72 = point69.y;
        boolean boolean73 = point60.equals((java.lang.Object) point69);
        point69.y = 1.0d;
        point69.x = 100.0d;
        point69.x = 100.0d;
        boolean boolean80 = point34.equals((java.lang.Object) point69);
        Line line81 = new Line(point16, point34);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 0.0d;
        point11.y = 1.0d;
        java.lang.Double double16 = point11.x;
        java.lang.Double double17 = point11.x;
        Line line18 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
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
        point28.y = (-1.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.x;
        java.lang.Double double35 = point33.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        java.lang.Double double44 = point38.y;
        point38.y = 1.0d;
        java.lang.Class<?> wildcardClass47 = point38.getClass();
        boolean boolean48 = point33.equals((java.lang.Object) wildcardClass47);
        boolean boolean49 = point28.equals((java.lang.Object) boolean48);
        java.lang.Double double50 = point28.y;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.x;
        boolean boolean56 = point53.equals((java.lang.Object) 10.0f);
        point53.x = 100.0d;
        java.lang.Double double59 = point53.x;
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point62.x = 100.0d;
        boolean boolean65 = point53.equals((java.lang.Object) 100.0d);
        point53.x = 100.0d;
        point53.y = (-1.0d);
        boolean boolean70 = point28.equals((java.lang.Object) point53);
        Line line71 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
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
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        boolean boolean19 = point16.equals((java.lang.Object) 1L);
        point16.y = (-1.0d);
        java.lang.Double double22 = point16.y;
        java.lang.Double double23 = point16.y;
        java.lang.Double double24 = point16.x;
        point16.x = 10.0d;
        point16.y = 1.0d;
        point16.y = (-1.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        point33.x = 1.0d;
        java.lang.Object obj39 = null;
        boolean boolean40 = point33.equals(obj39);
        point33.x = 1.0d;
        boolean boolean44 = point33.equals((java.lang.Object) false);
        java.lang.Double double45 = point33.x;
        java.lang.Double double46 = point33.x;
        java.lang.Double double47 = point33.y;
        boolean boolean48 = point16.equals((java.lang.Object) point33);
        Line line49 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 1.0d;
        java.lang.Object obj15 = null;
        boolean boolean16 = point9.equals(obj15);
        java.lang.Double double17 = point9.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        boolean boolean23 = point20.equals((java.lang.Object) 1L);
        java.lang.Double double24 = point20.y;
        point20.y = 100.0d;
        point20.y = (-1.0d);
        boolean boolean29 = point9.equals((java.lang.Object) point20);
        point20.x = (-1.0d);
        point20.y = 1.0d;
        Line line34 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double7 = point2.y;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point10.x = 1.0d;
        point10.y = 1.0d;
        java.lang.Double double15 = point10.x;
        point10.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        point20.x = 10.0d;
        java.lang.Double double28 = point20.y;
        boolean boolean29 = point10.equals((java.lang.Object) double28);
        point10.y = 0.0d;
        java.lang.Double double32 = point10.y;
        java.lang.Double double33 = point10.y;
        boolean boolean34 = point2.equals((java.lang.Object) point10);
        java.lang.Double double35 = point2.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        point41.y = 1.0d;
        boolean boolean46 = point38.equals((java.lang.Object) 1.0d);
        point38.x = (-1.0d);
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        boolean boolean57 = point54.equals((java.lang.Object) 1L);
        java.lang.Double double58 = point54.y;
        boolean boolean59 = point51.equals((java.lang.Object) double58);
        point51.x = 10.0d;
        java.lang.Double double62 = point51.x;
        point51.x = 10.0d;
        java.lang.Double double65 = point51.y;
        boolean boolean66 = point38.equals((java.lang.Object) double65);
        java.lang.Double double67 = point38.x;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.x;
        boolean boolean73 = point70.equals((java.lang.Object) 10.0f);
        point70.x = 100.0d;
        java.lang.Double double76 = point70.x;
        point70.y = 1.0d;
        Point point81 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double82 = point81.y;
        point81.y = 10.0d;
        point81.y = (-1.0d);
        java.lang.Class<?> wildcardClass87 = point81.getClass();
        boolean boolean88 = point70.equals((java.lang.Object) wildcardClass87);
        java.lang.Double double89 = point70.y;
        point70.x = 1.0d;
        point70.x = 100.0d;
        point70.y = 1.0d;
        boolean boolean96 = point38.equals((java.lang.Object) point70);
        Line line97 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
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
        java.lang.Double double36 = point2.y;
        java.lang.Double double37 = point2.x;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point40.y = (-1.0d);
        point40.y = 1.0d;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean53 = point50.equals((java.lang.Object) 1L);
        java.lang.Double double54 = point50.y;
        boolean boolean55 = point47.equals((java.lang.Object) double54);
        point47.x = 10.0d;
        java.lang.Double double58 = point47.x;
        point47.x = 10.0d;
        Point point63 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double64 = point63.y;
        java.lang.Double double65 = point63.y;
        boolean boolean66 = point47.equals((java.lang.Object) double65);
        java.lang.Double double67 = point47.y;
        java.lang.Double double68 = point47.y;
        java.lang.Double double69 = point47.x;
        boolean boolean70 = point40.equals((java.lang.Object) point47);
        Point point73 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double74 = point73.y;
        point73.y = 1.0d;
        java.lang.Double double77 = point73.y;
        java.lang.Object obj78 = new java.lang.Object();
        boolean boolean79 = point73.equals(obj78);
        point73.x = 1.0d;
        point73.x = 10.0d;
        point73.y = 0.0d;
        boolean boolean86 = point40.equals((java.lang.Object) point73);
        Line line87 = new Line(point2, point73);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
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
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.y = 0.0d;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        java.lang.Double double37 = point34.x;
        boolean boolean38 = point26.equals((java.lang.Object) double37);
        point26.x = 0.0d;
        Line line41 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        point2.y = 10.0d;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point8.x = 1.0d;
        point8.y = 1.0d;
        java.lang.Double double13 = point8.x;
        point8.x = (-1.0d);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 100.0d;
        point18.x = 10.0d;
        java.lang.Double double26 = point18.y;
        boolean boolean27 = point8.equals((java.lang.Object) double26);
        point8.y = (-1.0d);
        java.lang.Double double30 = point8.x;
        point8.y = 1.0d;
        java.lang.Double double33 = point8.y;
        Point point36 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.x;
        java.lang.Double double38 = point36.y;
        java.lang.Double double39 = point36.y;
        point36.y = 0.0d;
        point36.x = 1.0d;
        boolean boolean44 = point8.equals((java.lang.Object) point36);
        Line line45 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.y;
        boolean boolean15 = point2.equals((java.lang.Object) (short) 100);
        point2.x = 1.0d;
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        java.lang.Double double26 = point21.x;
        point21.x = (-1.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        point31.x = 10.0d;
        java.lang.Double double39 = point31.y;
        boolean boolean40 = point21.equals((java.lang.Object) double39);
        point21.y = (-1.0d);
        point21.y = 0.0d;
        Line line45 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.x;
        point2.x = (-1.0d);
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double18 = point17.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        point21.y = (-1.0d);
        boolean boolean28 = point17.equals((java.lang.Object) point21);
        java.lang.Double double29 = point21.x;
        point21.x = 0.0d;
        point21.y = 0.0d;
        Line line34 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 10.0d;
        boolean boolean10 = point2.equals((java.lang.Object) true);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.y;
        point13.x = 100.0d;
        point13.x = 100.0d;
        java.lang.Double double21 = point13.x;
        java.lang.Double double22 = point13.x;
        Line line23 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.x;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        point13.y = 10.0d;
        java.lang.Double double20 = point13.y;
        point13.x = 0.0d;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.x;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        boolean boolean34 = point25.equals((java.lang.Object) point29);
        boolean boolean35 = point13.equals((java.lang.Object) point29);
        java.lang.Double double36 = point13.x;
        boolean boolean37 = point9.equals((java.lang.Object) double36);
        boolean boolean38 = point2.equals((java.lang.Object) double36);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.x = 0.0d;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        java.lang.Double double53 = point49.y;
        java.lang.Object obj54 = new java.lang.Object();
        boolean boolean55 = point49.equals(obj54);
        java.lang.Double double56 = point49.x;
        java.lang.Double double57 = point49.y;
        point49.x = (-1.0d);
        boolean boolean60 = point41.equals((java.lang.Object) (-1.0d));
        Line line61 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
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
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point33.x = 0.0d;
        point33.y = (-1.0d);
        point33.y = 0.0d;
        point33.y = 10.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        point44.y = (-1.0d);
        point44.y = 10.0d;
        point44.y = 0.0d;
        point44.y = 0.0d;
        boolean boolean57 = point33.equals((java.lang.Object) 0.0d);
        Line line58 = new Line(point20, point33);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
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
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        point23.y = 1.0d;
        point23.y = 100.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj37 = null;
        boolean boolean38 = point36.equals(obj37);
        boolean boolean39 = point23.equals((java.lang.Object) point36);
        java.lang.Double double40 = point23.y;
        point23.y = 0.0d;
        Line line43 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.x = (-1.0d);
        point2.y = 1.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        java.lang.Double double21 = point15.y;
        point15.y = 1.0d;
        point15.y = 100.0d;
        point15.y = 1.0d;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        java.lang.Double double36 = point30.x;
        point30.x = 0.0d;
        boolean boolean39 = point15.equals((java.lang.Object) point30);
        Line line40 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point10.y = 1.0d;
        java.lang.Double double13 = point10.y;
        java.lang.Double double14 = point10.y;
        point10.y = 10.0d;
        java.lang.Double double17 = point10.y;
        point10.x = 0.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        boolean boolean31 = point22.equals((java.lang.Object) point26);
        boolean boolean32 = point10.equals((java.lang.Object) point26);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point35.y = 0.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.x;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point45.x = 1.0d;
        point45.y = 1.0d;
        boolean boolean50 = point42.equals((java.lang.Object) 1.0d);
        java.lang.Double double51 = point42.y;
        java.lang.Double double52 = point42.y;
        java.lang.Double double53 = point42.x;
        java.lang.Double double54 = point42.y;
        boolean boolean55 = point35.equals((java.lang.Object) double54);
        boolean boolean56 = point10.equals((java.lang.Object) double54);
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double60 = point59.y;
        java.lang.Double double61 = point59.y;
        java.lang.Double double62 = point59.x;
        java.lang.Double double63 = point59.x;
        boolean boolean64 = point10.equals((java.lang.Object) point59);
        Line line65 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
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
        point11.y = 0.0d;
        java.lang.Double double23 = point11.x;
        Point point24 = null;
        Line line25 = new Line(point11, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        java.lang.Double double19 = point2.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        point25.y = 10.0d;
        boolean boolean29 = point22.equals((java.lang.Object) point25);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass33 = point32.getClass();
        boolean boolean34 = point25.equals((java.lang.Object) wildcardClass33);
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        point37.y = (-1.0d);
        point37.y = 0.0d;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        point46.y = (-1.0d);
        java.lang.Double double51 = point46.y;
        java.lang.Double double52 = point46.y;
        point46.y = 1.0d;
        point46.y = 100.0d;
        point46.x = 1.0d;
        point46.y = (-1.0d);
        boolean boolean61 = point37.equals((java.lang.Object) point46);
        boolean boolean62 = point25.equals((java.lang.Object) boolean61);
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point65.x = 1.0d;
        point65.y = 1.0d;
        point65.y = (-1.0d);
        point65.y = 10.0d;
        point65.y = 1.0d;
        java.lang.Double double76 = point65.x;
        java.lang.Double double77 = point65.y;
        point65.y = 0.0d;
        java.lang.Double double80 = point65.y;
        boolean boolean81 = point25.equals((java.lang.Object) point65);
        point25.x = 10.0d;
        Line line84 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        java.lang.Double double22 = point2.x;
        point2.y = (-1.0d);
        Point point27 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double28 = point27.x;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        java.lang.Class<?> wildcardClass33 = point31.getClass();
        boolean boolean34 = point27.equals((java.lang.Object) wildcardClass33);
        java.lang.Double double35 = point27.y;
        boolean boolean36 = point2.equals((java.lang.Object) point27);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.y;
        java.lang.Double double45 = point39.y;
        point39.y = 1.0d;
        point39.y = 100.0d;
        point39.x = 1.0d;
        point39.y = (-1.0d);
        point39.y = 1.0d;
        java.lang.Double double56 = point39.y;
        point39.y = 0.0d;
        Line line59 = new Line(point27, point39);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.y = 0.0d;
        point2.x = 10.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.y = (-1.0d);
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        point24.y = (-1.0d);
        java.lang.Double double29 = point24.x;
        java.lang.Double double30 = point24.x;
        point24.y = 1.0d;
        boolean boolean33 = point14.equals((java.lang.Object) point24);
        point24.y = (-1.0d);
        point24.x = (-1.0d);
        java.lang.Double double38 = point24.x;
        java.lang.Double double39 = point24.x;
        java.lang.Double double40 = point24.x;
        point24.x = 0.0d;
        Line line43 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
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
        point2.x = 100.0d;
        point2.x = 10.0d;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        java.lang.Double double37 = point32.y;
        java.lang.Double double38 = point32.y;
        Point point41 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double42 = point41.y;
        java.lang.Double double43 = point41.y;
        boolean boolean44 = point32.equals((java.lang.Object) point41);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.y;
        boolean boolean51 = point41.equals((java.lang.Object) point47);
        java.lang.Double double52 = point41.x;
        java.lang.Double double53 = point41.x;
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double57 = point56.y;
        java.lang.Double double58 = point56.y;
        java.lang.Double double59 = point56.x;
        point56.y = 1.0d;
        point56.x = 1.0d;
        point56.y = (-1.0d);
        Point point68 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        point68.y = 1.0d;
        java.lang.Double double72 = point68.y;
        java.lang.Object obj73 = new java.lang.Object();
        boolean boolean74 = point68.equals(obj73);
        point68.x = 1.0d;
        java.lang.Class<?> wildcardClass77 = point68.getClass();
        boolean boolean78 = point56.equals((java.lang.Object) wildcardClass77);
        boolean boolean79 = point41.equals((java.lang.Object) wildcardClass77);
        Line line80 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
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
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point30.x = 1.0d;
        point30.y = 1.0d;
        boolean boolean35 = point27.equals((java.lang.Object) 1.0d);
        java.lang.Double double36 = point27.y;
        point27.x = 0.0d;
        java.lang.Double double39 = point27.x;
        java.lang.Double double40 = point27.x;
        Line line41 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        point11.y = 1.0d;
        point11.y = 100.0d;
        point11.x = 1.0d;
        point11.y = (-1.0d);
        point11.y = 1.0d;
        java.lang.Double double28 = point11.y;
        point11.x = 0.0d;
        boolean boolean31 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double32 = point2.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.y;
        boolean boolean41 = point35.equals((java.lang.Object) point38);
        java.lang.Double double42 = point38.x;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        boolean boolean47 = point38.equals((java.lang.Object) double46);
        point38.x = 0.0d;
        point38.x = 10.0d;
        point38.x = 0.0d;
        java.lang.Double double54 = point38.y;
        Line line55 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 10.0d;
        point2.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        point12.x = 0.0d;
        java.lang.Double double19 = point12.x;
        point12.y = 100.0d;
        point12.y = (-1.0d);
        Line line24 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        point2.y = 10.0d;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point8.y = 0.0d;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.x;
        Point point15 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.y;
        boolean boolean18 = point8.equals((java.lang.Object) point15);
        Line line19 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
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
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double37 = point36.x;
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        point40.y = (-1.0d);
        boolean boolean45 = point36.equals((java.lang.Object) point40);
        java.lang.Double double46 = point40.y;
        boolean boolean47 = point26.equals((java.lang.Object) double46);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double54 = point53.y;
        point53.y = 10.0d;
        boolean boolean57 = point50.equals((java.lang.Object) point53);
        java.lang.Double double58 = point50.x;
        java.lang.Double double59 = point50.y;
        Line line60 = new Line(point26, point50);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point5.equals((java.lang.Object) boolean24);
        point5.x = 0.0d;
        java.lang.Double double28 = point5.x;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 1.0d;
        java.lang.Double double34 = point31.y;
        java.lang.Double double35 = point31.y;
        java.lang.Double double36 = point31.x;
        java.lang.Double double37 = point31.y;
        point31.y = (-1.0d);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        java.lang.Double double46 = point42.y;
        java.lang.Object obj47 = new java.lang.Object();
        boolean boolean48 = point42.equals(obj47);
        point42.x = 1.0d;
        java.lang.Double double51 = point42.x;
        point42.y = 0.0d;
        java.lang.Class<?> wildcardClass54 = point42.getClass();
        boolean boolean55 = point31.equals((java.lang.Object) wildcardClass54);
        java.lang.Double double56 = point31.y;
        java.lang.Double double57 = point31.y;
        Line line58 = new Line(point5, point31);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point5.y = 100.0d;
        point5.y = 10.0d;
        point5.x = 100.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.x = 10.0d;
        java.lang.Double double36 = point28.y;
        point28.y = 0.0d;
        java.lang.Double double39 = point28.x;
        java.lang.Double double40 = point28.x;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.y;
        point46.y = 10.0d;
        boolean boolean50 = point43.equals((java.lang.Object) point46);
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass54 = point53.getClass();
        boolean boolean55 = point46.equals((java.lang.Object) wildcardClass54);
        point46.y = 0.0d;
        boolean boolean58 = point28.equals((java.lang.Object) point46);
        boolean boolean59 = point17.equals((java.lang.Object) point28);
        java.lang.Double double60 = point17.y;
        Line line61 = new Line(point5, point17);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        point2.x = (-1.0d);
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
        java.lang.Double double32 = point14.y;
        java.lang.Double double33 = point14.x;
        java.lang.Double double34 = point14.x;
        point14.y = 10.0d;
        point14.y = 100.0d;
        Line line39 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
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
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double34 = point31.y;
        java.lang.Double double35 = point31.y;
        java.lang.Double double36 = point31.y;
        Line line37 = new Line(point13, point31);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
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
        Point point38 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 0.0d);
        java.lang.Double double39 = point38.y;
        java.lang.Class<?> wildcardClass40 = point38.getClass();
        boolean boolean41 = point2.equals((java.lang.Object) point38);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        java.lang.Double double48 = point44.y;
        java.lang.Object obj49 = new java.lang.Object();
        boolean boolean50 = point44.equals(obj49);
        point44.x = 1.0d;
        java.lang.Double double53 = point44.x;
        point44.y = 0.0d;
        java.lang.Double double56 = point44.y;
        Line line57 = new Line(point38, point44);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
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
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point30.x = 1.0d;
        point30.y = 1.0d;
        java.lang.Double double35 = point30.x;
        point30.x = (-1.0d);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        point40.x = 10.0d;
        java.lang.Double double48 = point40.y;
        boolean boolean49 = point30.equals((java.lang.Object) double48);
        point30.y = (-1.0d);
        java.lang.Double double52 = point30.x;
        java.lang.Double double53 = point30.x;
        point30.y = 1.0d;
        java.lang.Double double56 = point30.x;
        Line line57 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean20 = point17.equals((java.lang.Object) 1L);
        java.lang.Double double21 = point17.y;
        boolean boolean22 = point14.equals((java.lang.Object) double21);
        java.lang.Double double23 = point14.y;
        java.lang.Double double24 = point14.x;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean33 = point30.equals((java.lang.Object) 1L);
        java.lang.Double double34 = point30.y;
        boolean boolean35 = point27.equals((java.lang.Object) double34);
        java.lang.Double double36 = point27.y;
        boolean boolean37 = point14.equals((java.lang.Object) point27);
        Line line38 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        point2.x = (-1.0d);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        java.lang.Double double23 = point17.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point26.x = 100.0d;
        boolean boolean29 = point17.equals((java.lang.Object) 100.0d);
        point17.x = 10.0d;
        boolean boolean32 = point11.equals((java.lang.Object) point17);
        point11.x = 100.0d;
        Line line35 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.y = 10.0d;
        java.lang.Double double21 = point13.x;
        point13.y = 1.0d;
        Line line24 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        point11.x = 0.0d;
        java.lang.Double double18 = point11.x;
        boolean boolean19 = point2.equals((java.lang.Object) point11);
        java.lang.Double double20 = point2.x;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point23.x = 0.0d;
        point23.y = 1.0d;
        point23.y = 1.0d;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point32.y = 1.0d;
        point32.y = (-1.0d);
        point32.x = 0.0d;
        java.lang.Double double39 = point32.x;
        boolean boolean40 = point23.equals((java.lang.Object) point32);
        point23.x = 10.0d;
        Line line43 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
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
        java.lang.Double double52 = point50.x;
        java.lang.Double double53 = point50.y;
        Line line54 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        point2.x = (-1.0d);
        point2.x = 10.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        java.lang.Double double11 = point9.y;
        java.lang.Double double12 = point9.x;
        point9.y = 1.0d;
        point9.x = 1.0d;
        point9.y = (-1.0d);
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        java.lang.Double double26 = point21.y;
        point21.y = 100.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        point31.y = 10.0d;
        boolean boolean39 = point21.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass40 = point21.getClass();
        boolean boolean41 = point9.equals((java.lang.Object) wildcardClass40);
        java.lang.Double double42 = point9.y;
        Line line43 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point14.y = (-1.0d);
        java.lang.Double double17 = point14.x;
        point14.x = (-1.0d);
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean29 = point27.equals((java.lang.Object) true);
        boolean boolean30 = point22.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass31 = point22.getClass();
        boolean boolean32 = point14.equals((java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = point14.getClass();
        boolean boolean34 = point11.equals((java.lang.Object) wildcardClass33);
        point11.y = 10.0d;
        point11.x = (-1.0d);
        boolean boolean39 = point2.equals((java.lang.Object) point11);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.x;
        boolean boolean45 = point42.equals((java.lang.Object) 10.0f);
        point42.x = 100.0d;
        java.lang.Double double48 = point42.x;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point51.x = 100.0d;
        boolean boolean54 = point42.equals((java.lang.Object) 100.0d);
        java.lang.Double double55 = point42.y;
        Point point58 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point61.x = 1.0d;
        point61.y = 1.0d;
        boolean boolean66 = point58.equals((java.lang.Object) 1.0d);
        java.lang.Double double67 = point58.y;
        point58.x = 0.0d;
        boolean boolean70 = point42.equals((java.lang.Object) 0.0d);
        point42.x = 100.0d;
        java.lang.Double double73 = point42.y;
        java.lang.Double double74 = point42.x;
        java.lang.Double double75 = point42.x;
        Line line76 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
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
        point9.x = 100.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        point21.y = (-1.0d);
        java.lang.Double double27 = point21.y;
        java.lang.Double double28 = point21.y;
        java.lang.Double double29 = point21.y;
        java.lang.Double double30 = point21.x;
        java.lang.Double double31 = point21.x;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass50 = point37.getClass();
        boolean boolean51 = point34.equals((java.lang.Object) wildcardClass50);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        java.lang.Double double59 = point57.y;
        boolean boolean60 = point54.equals((java.lang.Object) point57);
        point54.x = 10.0d;
        boolean boolean63 = point34.equals((java.lang.Object) point54);
        point34.x = 10.0d;
        boolean boolean66 = point21.equals((java.lang.Object) point34);
        Line line67 = new Line(point9, point34);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 0.0d;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.y;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.y;
        boolean boolean17 = point7.equals((java.lang.Object) point12);
        java.lang.Double double18 = point7.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        point21.y = (-1.0d);
        java.lang.Double double27 = point21.y;
        boolean boolean28 = point7.equals((java.lang.Object) point21);
        point7.y = 1.0d;
        java.lang.Double double31 = point7.x;
        java.lang.Double double32 = point7.x;
        java.lang.Double double33 = point7.y;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        java.lang.Double double40 = point36.y;
        java.lang.Object obj41 = new java.lang.Object();
        boolean boolean42 = point36.equals(obj41);
        java.lang.Double double43 = point36.y;
        point36.x = 1.0d;
        java.lang.Double double46 = point36.y;
        java.lang.Double double47 = point36.y;
        boolean boolean48 = point7.equals((java.lang.Object) double47);
        Line line49 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
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
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 0.0d;
        java.lang.Double double24 = point20.y;
        boolean boolean25 = point2.equals((java.lang.Object) double24);
        java.lang.Object obj26 = null;
        boolean boolean27 = point2.equals(obj26);
        point2.x = 1.0d;
        Point point30 = null;
        Line line31 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
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
        point14.x = 100.0d;
        point14.x = 10.0d;
        java.lang.Double double22 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double25 = point14.x;
        point14.y = (-1.0d);
        point14.y = 10.0d;
        point14.x = 100.0d;
        point14.x = 1.0d;
        point14.y = 100.0d;
        point14.x = (-1.0d);
        java.lang.Double double38 = point14.x;
        Line line39 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
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
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 1.0d;
        java.lang.Object obj29 = null;
        boolean boolean30 = point23.equals(obj29);
        point23.x = 1.0d;
        point23.x = (-1.0d);
        java.lang.Double double35 = point23.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        point38.y = 100.0d;
        point38.x = (-1.0d);
        point38.x = (-1.0d);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.x;
        boolean boolean54 = point51.equals((java.lang.Object) 10.0f);
        point51.x = 100.0d;
        java.lang.Double double57 = point51.x;
        Point point60 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point60.x = 100.0d;
        boolean boolean63 = point51.equals((java.lang.Object) 100.0d);
        java.lang.Double double64 = point51.y;
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        point67.y = 1.0d;
        point67.x = 100.0d;
        java.lang.Double double73 = point67.x;
        boolean boolean74 = point51.equals((java.lang.Object) point67);
        boolean boolean75 = point38.equals((java.lang.Object) point67);
        java.lang.Double double76 = point38.y;
        java.lang.Double double77 = point38.y;
        boolean boolean78 = point23.equals((java.lang.Object) point38);
        Point point81 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point84 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double85 = point84.y;
        point84.y = 10.0d;
        boolean boolean88 = point81.equals((java.lang.Object) point84);
        point81.y = 0.0d;
        boolean boolean91 = point38.equals((java.lang.Object) point81);
        point38.y = (-1.0d);
        point38.x = 10.0d;
        Line line96 = new Line(point6, point38);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point15.x = 100.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 1.0d;
        java.lang.Double double26 = point20.y;
        java.lang.Double double27 = point20.y;
        point20.x = 10.0d;
        boolean boolean30 = point15.equals((java.lang.Object) point20);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        point33.y = 10.0d;
        point33.y = 10.0d;
        boolean boolean39 = point20.equals((java.lang.Object) point33);
        point33.y = 10.0d;
        java.lang.Double double42 = point33.x;
        Line line43 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
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
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point2.y = 100.0d;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double8 = point7.x;
        java.lang.Double double9 = point7.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point12.x = 1.0d;
        point12.y = 1.0d;
        boolean boolean17 = point7.equals((java.lang.Object) point12);
        point12.y = 100.0d;
        java.lang.Double double20 = point12.y;
        Line line21 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        java.lang.Double double18 = point14.y;
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = point14.equals(obj19);
        point14.x = 1.0d;
        java.lang.Class<?> wildcardClass23 = point14.getClass();
        boolean boolean24 = point2.equals((java.lang.Object) wildcardClass23);
        point2.y = 0.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.x;
        boolean boolean32 = point29.equals((java.lang.Object) 10.0f);
        point29.x = 100.0d;
        java.lang.Double double35 = point29.x;
        point29.y = 1.0d;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.y;
        point40.y = 10.0d;
        point40.y = (-1.0d);
        java.lang.Class<?> wildcardClass46 = point40.getClass();
        boolean boolean47 = point29.equals((java.lang.Object) wildcardClass46);
        java.lang.Double double48 = point29.y;
        point29.x = 1.0d;
        point29.x = 10.0d;
        java.lang.Double double53 = point29.y;
        point29.x = (-1.0d);
        Line line56 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
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
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        point35.y = 10.0d;
        boolean boolean39 = point32.equals((java.lang.Object) point35);
        point32.y = 0.0d;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        java.lang.Double double47 = point44.y;
        java.lang.Double double48 = point44.y;
        point44.y = 10.0d;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.x;
        boolean boolean56 = point53.equals((java.lang.Object) 10.0f);
        point53.x = 100.0d;
        java.lang.Double double59 = point53.x;
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point62.x = 100.0d;
        boolean boolean65 = point53.equals((java.lang.Object) 100.0d);
        java.lang.Double double66 = point53.y;
        point53.y = 100.0d;
        boolean boolean69 = point44.equals((java.lang.Object) point53);
        Point point72 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double73 = point72.y;
        java.lang.Double double74 = point72.x;
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean79 = point77.equals((java.lang.Object) true);
        boolean boolean80 = point72.equals((java.lang.Object) true);
        java.lang.Double double81 = point72.y;
        Point point84 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double85 = point84.y;
        point84.y = 1.0d;
        point84.y = 0.0d;
        boolean boolean90 = point72.equals((java.lang.Object) point84);
        boolean boolean91 = point53.equals((java.lang.Object) point84);
        boolean boolean92 = point32.equals((java.lang.Object) point53);
        point53.x = (-1.0d);
        Line line95 = new Line(point2, point53);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
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
        java.lang.Object obj22 = null;
        boolean boolean23 = point7.equals(obj22);
        java.lang.Double double24 = point7.x;
        point7.y = 10.0d;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.x;
        boolean boolean36 = point33.equals((java.lang.Object) 10.0f);
        point33.x = 100.0d;
        java.lang.Double double39 = point33.x;
        point33.y = 1.0d;
        point33.y = 1.0d;
        boolean boolean44 = point29.equals((java.lang.Object) point33);
        boolean boolean45 = point7.equals((java.lang.Object) point29);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.x;
        java.lang.Double double50 = point48.x;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        point53.y = (-1.0d);
        java.lang.Double double58 = point53.y;
        java.lang.Double double59 = point53.y;
        point53.y = 1.0d;
        java.lang.Class<?> wildcardClass62 = point53.getClass();
        boolean boolean63 = point48.equals((java.lang.Object) wildcardClass62);
        java.lang.Double double64 = point48.y;
        java.lang.Double double65 = point48.x;
        java.lang.Object obj66 = null;
        boolean boolean67 = point48.equals(obj66);
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double71 = point70.y;
        java.lang.Double double72 = point70.x;
        java.lang.Double double73 = point70.x;
        point70.y = 0.0d;
        boolean boolean77 = point70.equals((java.lang.Object) '#');
        point70.x = 0.0d;
        Point point82 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point82.y = 0.0d;
        java.lang.Double double85 = point82.y;
        point82.x = 100.0d;
        point82.x = 100.0d;
        boolean boolean90 = point70.equals((java.lang.Object) point82);
        boolean boolean91 = point48.equals((java.lang.Object) point82);
        java.lang.Double double92 = point48.x;
        Line line93 = new Line(point29, point48);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
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
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double26 = point19.x;
        point19.y = 100.0d;
        java.lang.Double double29 = point19.y;
        java.lang.Class<?> wildcardClass30 = point19.getClass();
        boolean boolean31 = point2.equals((java.lang.Object) wildcardClass30);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.y;
        point34.y = 0.0d;
        java.lang.Double double41 = point34.x;
        point34.y = 100.0d;
        point34.x = 0.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point48.x = 1.0d;
        point48.y = 1.0d;
        point48.y = (-1.0d);
        java.lang.Double double55 = point48.y;
        java.lang.Double double56 = point48.x;
        boolean boolean57 = point34.equals((java.lang.Object) point48);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 100.0d;
        point60.y = (-1.0d);
        java.lang.Double double68 = point60.x;
        point60.y = (-1.0d);
        java.lang.Double double71 = point60.x;
        boolean boolean72 = point48.equals((java.lang.Object) point60);
        Line line73 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.y = 0.0d;
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
        java.lang.Double double44 = point28.x;
        point28.x = 0.0d;
        Line line47 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
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
        java.lang.Double double30 = point2.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        java.lang.Double double38 = point33.y;
        java.lang.Double double39 = point33.y;
        point33.y = 1.0d;
        point33.y = 100.0d;
        point33.x = 1.0d;
        point33.y = (-1.0d);
        point33.y = 1.0d;
        java.lang.Double double50 = point33.y;
        point33.x = 0.0d;
        java.lang.Double double53 = point33.y;
        Line line54 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point9.x = 0.0d;
        boolean boolean12 = point2.equals((java.lang.Object) point9);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        java.lang.Double double21 = point15.y;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point24.y = 0.0d;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.x;
        boolean boolean29 = point15.equals((java.lang.Object) double28);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean34 = point32.equals((java.lang.Object) true);
        point32.y = 100.0d;
        point32.y = 1.0d;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        boolean boolean49 = point41.equals((java.lang.Object) 1.0d);
        java.lang.Double double50 = point41.y;
        boolean boolean51 = point32.equals((java.lang.Object) point41);
        boolean boolean52 = point15.equals((java.lang.Object) point41);
        Line line53 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        point5.x = 100.0d;
        point5.y = 0.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point21.y = 10.0d;
        java.lang.Double double24 = point21.x;
        java.lang.Double double25 = point21.y;
        java.lang.Double double26 = point21.y;
        point21.y = 100.0d;
        java.lang.Double double29 = point21.y;
        Line line30 = new Line(point5, point21);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point16.x = 0.0d;
        point16.y = 1.0d;
        point16.y = 100.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point16);
        java.lang.Double double24 = point2.x;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        point27.y = (-1.0d);
        java.lang.Double double32 = point27.y;
        java.lang.Double double33 = point27.y;
        java.lang.Double double34 = point27.y;
        java.lang.Double double35 = point27.y;
        java.lang.Double double36 = point27.x;
        Line line37 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean15 = point13.equals((java.lang.Object) (byte) 100);
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 0.0d;
        java.lang.Double double21 = point18.x;
        point18.x = (-1.0d);
        java.lang.Class<?> wildcardClass24 = point18.getClass();
        boolean boolean25 = point13.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = point2.equals((java.lang.Object) boolean25);
        point2.x = 0.0d;
        java.lang.Double double29 = point2.y;
        java.lang.Double double30 = point2.y;
        java.lang.Double double31 = point2.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point34.y = (-1.0d);
        java.lang.Double double37 = point34.y;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.x;
        boolean boolean43 = point40.equals((java.lang.Object) 10.0f);
        point40.x = 100.0d;
        java.lang.Double double46 = point40.x;
        point40.y = 1.0d;
        boolean boolean49 = point34.equals((java.lang.Object) point40);
        java.lang.Double double50 = point40.x;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        boolean boolean56 = point53.equals((java.lang.Object) 1L);
        java.lang.Double double57 = point53.y;
        java.lang.Double double58 = point53.y;
        boolean boolean59 = point40.equals((java.lang.Object) point53);
        Line line60 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        boolean boolean10 = point2.equals((java.lang.Object) 10);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 0.0d;
        java.lang.Double double18 = point14.y;
        point14.y = (-1.0d);
        point14.y = 100.0d;
        java.lang.Double double23 = point14.y;
        java.lang.Double double24 = point14.x;
        point14.x = 10.0d;
        Line line27 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        point2.x = (-1.0d);
        point2.y = 100.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point20.x = 1.0d;
        point20.y = 1.0d;
        java.lang.Double double25 = point20.x;
        point20.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 100.0d;
        point30.x = 10.0d;
        java.lang.Double double38 = point30.y;
        boolean boolean39 = point20.equals((java.lang.Object) double38);
        point20.y = (-1.0d);
        java.lang.Double double42 = point20.x;
        point20.y = 1.0d;
        java.lang.Double double45 = point20.y;
        Point point48 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.x;
        java.lang.Double double50 = point48.y;
        java.lang.Double double51 = point48.y;
        point48.y = 0.0d;
        point48.x = 1.0d;
        boolean boolean56 = point20.equals((java.lang.Object) point48);
        Line line57 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double12 = point2.y;
        point2.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        point17.y = 100.0d;
        point17.x = 0.0d;
        point17.y = (-1.0d);
        boolean boolean32 = point2.equals((java.lang.Object) point17);
        Point point35 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        java.lang.Double double43 = point39.y;
        java.lang.Object obj44 = new java.lang.Object();
        boolean boolean45 = point39.equals(obj44);
        java.lang.Double double46 = point39.y;
        java.lang.Class<?> wildcardClass47 = point39.getClass();
        boolean boolean48 = point35.equals((java.lang.Object) point39);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point51.y = 100.0d;
        point51.y = 0.0d;
        boolean boolean56 = point35.equals((java.lang.Object) 0.0d);
        java.lang.Double double57 = point35.y;
        java.lang.Double double58 = point35.x;
        Line line59 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        point2.x = 1.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point16.x = 0.0d;
        point16.y = (-1.0d);
        point16.y = 100.0d;
        point16.x = 0.0d;
        java.lang.Double double25 = point16.y;
        boolean boolean26 = point2.equals((java.lang.Object) double25);
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        point29.y = 100.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        boolean boolean41 = point38.equals((java.lang.Object) 1L);
        point38.y = (-1.0d);
        java.lang.Double double44 = point38.y;
        java.lang.Double double45 = point38.y;
        java.lang.Double double46 = point38.x;
        boolean boolean47 = point29.equals((java.lang.Object) point38);
        point29.x = (-1.0d);
        Line line50 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        java.lang.Double double19 = point15.y;
        boolean boolean20 = point12.equals((java.lang.Object) double19);
        point12.x = 10.0d;
        java.lang.Double double23 = point12.x;
        point12.y = 0.0d;
        point12.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point30.y = 0.0d;
        java.lang.Double double33 = point30.y;
        point30.x = 100.0d;
        point30.x = 100.0d;
        java.lang.Double double38 = point30.y;
        java.lang.Double double39 = point30.y;
        boolean boolean40 = point12.equals((java.lang.Object) point30);
        point30.y = (-1.0d);
        java.lang.Double double43 = point30.y;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.y;
        point46.y = 10.0d;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.x;
        boolean boolean58 = point55.equals((java.lang.Object) 10.0f);
        point55.x = 100.0d;
        java.lang.Double double61 = point55.x;
        Point point64 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point64.x = 100.0d;
        boolean boolean67 = point55.equals((java.lang.Object) 100.0d);
        java.lang.Double double68 = point55.y;
        point55.y = 100.0d;
        boolean boolean71 = point46.equals((java.lang.Object) point55);
        Point point74 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double75 = point74.y;
        java.lang.Double double76 = point74.x;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean81 = point79.equals((java.lang.Object) true);
        boolean boolean82 = point74.equals((java.lang.Object) true);
        java.lang.Double double83 = point74.y;
        Point point86 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double87 = point86.y;
        point86.y = 1.0d;
        point86.y = 0.0d;
        boolean boolean92 = point74.equals((java.lang.Object) point86);
        boolean boolean93 = point55.equals((java.lang.Object) point86);
        java.lang.Double double94 = point86.x;
        java.lang.Class<?> wildcardClass95 = point86.getClass();
        boolean boolean96 = point30.equals((java.lang.Object) point86);
        Line line97 = new Line(point2, point86);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point24.x = 100.0d;
        boolean boolean27 = point15.equals((java.lang.Object) 100.0d);
        java.lang.Double double28 = point15.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.x;
        boolean boolean38 = point15.equals((java.lang.Object) point31);
        boolean boolean39 = point2.equals((java.lang.Object) point31);
        java.lang.Double double40 = point2.y;
        java.lang.Double double41 = point2.y;
        point2.y = 10.0d;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.y;
        java.lang.Double double51 = point46.x;
        java.lang.Double double52 = point46.y;
        point46.x = 1.0d;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point57.y = 1.0d;
        java.lang.Double double60 = point57.y;
        java.lang.Double double61 = point57.y;
        point57.y = 10.0d;
        java.lang.Double double64 = point57.y;
        point57.x = 10.0d;
        java.lang.Double double67 = point57.x;
        boolean boolean68 = point46.equals((java.lang.Object) double67);
        point46.x = 100.0d;
        Line line71 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.x = 10.0d;
        point2.x = 10.0d;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
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
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        java.lang.Double double34 = point28.y;
        java.lang.Double double35 = point28.y;
        point28.x = 10.0d;
        java.lang.Double double38 = point28.x;
        java.lang.Double double39 = point28.y;
        Line line40 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
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
        java.lang.Double double31 = point2.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        point34.y = 1.0d;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.y;
        point45.y = 10.0d;
        point45.y = (-1.0d);
        java.lang.Class<?> wildcardClass51 = point45.getClass();
        boolean boolean52 = point34.equals((java.lang.Object) wildcardClass51);
        java.lang.Double double53 = point34.y;
        point34.x = 1.0d;
        point34.x = 100.0d;
        point34.y = 1.0d;
        boolean boolean60 = point2.equals((java.lang.Object) point34);
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point63.y = 1.0d;
        point63.y = (-1.0d);
        java.lang.Double double68 = point63.y;
        java.lang.Double double69 = point63.y;
        java.lang.Double double70 = point63.y;
        java.lang.Double double71 = point63.y;
        point63.y = 100.0d;
        Line line74 = new Line(point34, point63);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
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
        point5.y = 1.0d;
        java.lang.Double double22 = point5.y;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        java.lang.Double double30 = point25.y;
        java.lang.Double double31 = point25.y;
        point25.y = 1.0d;
        point25.y = 100.0d;
        point25.y = 0.0d;
        java.lang.Double double38 = point25.y;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        boolean boolean47 = point44.equals((java.lang.Object) 1L);
        java.lang.Double double48 = point44.y;
        boolean boolean49 = point41.equals((java.lang.Object) double48);
        java.lang.Double double50 = point41.x;
        boolean boolean51 = point25.equals((java.lang.Object) point41);
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point54.x = 0.0d;
        point54.y = (-1.0d);
        point54.y = 0.0d;
        point54.y = 10.0d;
        point54.x = 1.0d;
        boolean boolean65 = point25.equals((java.lang.Object) point54);
        point25.y = 0.0d;
        java.lang.Double double68 = point25.x;
        point25.x = 1.0d;
        Line line71 = new Line(point5, point25);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        point13.y = (-1.0d);
        point13.y = 100.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass23 = point22.getClass();
        boolean boolean24 = point13.equals((java.lang.Object) point22);
        boolean boolean25 = point2.equals((java.lang.Object) point22);
        Point point26 = null;
        Line line27 = new Line(point22, point26);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.y;
        point2.x = 0.0d;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point18.equals((java.lang.Object) 1.0d);
        java.lang.Double double27 = point18.y;
        java.lang.Double double28 = point18.x;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double34 = point31.y;
        java.lang.Double double35 = point31.x;
        boolean boolean36 = point18.equals((java.lang.Object) point31);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point39.x = 100.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 1.0d;
        java.lang.Double double50 = point44.y;
        java.lang.Double double51 = point44.y;
        point44.x = 10.0d;
        boolean boolean54 = point39.equals((java.lang.Object) point44);
        java.lang.Double double55 = point44.y;
        java.lang.Double double56 = point44.x;
        boolean boolean57 = point18.equals((java.lang.Object) double56);
        java.lang.Double double58 = point18.y;
        Line line59 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        point2.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point17.y = 100.0d;
        java.lang.Object obj20 = null;
        boolean boolean21 = point17.equals(obj20);
        java.lang.Double double22 = point17.y;
        Line line23 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.y = 100.0d;
        java.lang.Double double18 = point15.y;
        Line line19 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
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
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point20.y = 100.0d;
        point20.y = 10.0d;
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 10.0d;
        point20.x = 1.0d;
        Line line31 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
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
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point30.x = 100.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Double double41 = point35.y;
        java.lang.Double double42 = point35.y;
        point35.x = 10.0d;
        boolean boolean45 = point30.equals((java.lang.Object) point35);
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        point48.y = 10.0d;
        point48.y = 10.0d;
        boolean boolean54 = point35.equals((java.lang.Object) point48);
        java.lang.Double double55 = point35.x;
        Point point58 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.x;
        java.lang.Double double60 = point58.y;
        java.lang.Double double61 = point58.y;
        point58.y = (-1.0d);
        boolean boolean64 = point35.equals((java.lang.Object) (-1.0d));
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point67.y = 1.0d;
        java.lang.Double double70 = point67.y;
        java.lang.Double double71 = point67.y;
        point67.y = 0.0d;
        point67.y = 1.0d;
        point67.y = 1.0d;
        boolean boolean78 = point35.equals((java.lang.Object) point67);
        point67.x = 10.0d;
        Line line81 = new Line(point2, point67);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
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
        point7.x = 100.0d;
        point7.x = 100.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        point43.y = (-1.0d);
        point43.x = 0.0d;
        point43.x = 1.0d;
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point57.x = 1.0d;
        point57.y = 1.0d;
        boolean boolean62 = point54.equals((java.lang.Object) 1.0d);
        java.lang.Double double63 = point54.y;
        java.lang.Double double64 = point54.y;
        java.lang.Double double65 = point54.x;
        point54.x = 10.0d;
        boolean boolean68 = point43.equals((java.lang.Object) point54);
        Line line69 = new Line(point7, point54);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.x;
        boolean boolean13 = point10.equals((java.lang.Object) 10.0f);
        point10.x = 100.0d;
        java.lang.Double double16 = point10.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 100.0d;
        boolean boolean22 = point10.equals((java.lang.Object) 100.0d);
        java.lang.Double double23 = point10.y;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point29.x = 1.0d;
        point29.y = 1.0d;
        boolean boolean34 = point26.equals((java.lang.Object) 1.0d);
        java.lang.Double double35 = point26.y;
        point26.x = 0.0d;
        boolean boolean38 = point10.equals((java.lang.Object) 0.0d);
        point10.x = 100.0d;
        java.lang.Object obj41 = null;
        boolean boolean42 = point10.equals(obj41);
        Line line43 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point7.x = 0.0d;
        point7.y = 1.0d;
        java.lang.Double double12 = point7.x;
        point7.x = 10.0d;
        java.lang.Double double15 = point7.x;
        Line line16 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        point2.x = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        point14.x = 100.0d;
        point14.x = 10.0d;
        point14.y = 10.0d;
        point14.y = 10.0d;
        Line line26 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 10.0d;
        point2.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point12.y = 0.0d;
        Line line15 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.x = 10.0d;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj12 = null;
        boolean boolean13 = point11.equals(obj12);
        java.lang.Class<?> wildcardClass14 = point11.getClass();
        boolean boolean15 = point2.equals((java.lang.Object) wildcardClass14);
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean21 = point2.equals((java.lang.Object) point19);
        point2.x = 1.0d;
        point2.x = 100.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.x;
        java.lang.Double double35 = point33.y;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        boolean boolean38 = point28.equals((java.lang.Object) point33);
        java.lang.Double double39 = point28.y;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        point42.y = (-1.0d);
        java.lang.Double double48 = point42.y;
        boolean boolean49 = point28.equals((java.lang.Object) point42);
        java.lang.Double double50 = point42.x;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 1.0d;
        java.lang.Object obj59 = null;
        boolean boolean60 = point53.equals(obj59);
        point53.x = 1.0d;
        boolean boolean64 = point53.equals((java.lang.Object) false);
        java.lang.Double double65 = point53.x;
        point53.y = (-1.0d);
        point53.x = 1.0d;
        java.lang.Double double70 = point53.x;
        java.lang.Double double71 = point53.x;
        boolean boolean72 = point42.equals((java.lang.Object) double71);
        Line line73 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = 0.0d;
        point2.y = 0.0d;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.y;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.y;
        java.lang.Double double18 = point12.x;
        java.lang.Class<?> wildcardClass19 = point12.getClass();
        boolean boolean20 = point2.equals((java.lang.Object) point12);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.x;
        java.lang.Double double26 = point23.x;
        point23.y = 1.0d;
        java.lang.Double double29 = point23.x;
        java.lang.Double double30 = point23.y;
        Line line31 = new Line(point12, point23);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point13.y = 0.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.x;
        point13.x = 1.0d;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj23 = null;
        boolean boolean24 = point22.equals(obj23);
        java.lang.Class<?> wildcardClass25 = point22.getClass();
        boolean boolean26 = point13.equals((java.lang.Object) wildcardClass25);
        boolean boolean27 = point2.equals((java.lang.Object) wildcardClass25);
        java.lang.Double double28 = point2.x;
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        java.lang.Double double33 = point31.x;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        point36.y = 0.0d;
        point36.y = 1.0d;
        point36.y = 0.0d;
        point36.x = 100.0d;
        boolean boolean49 = point31.equals((java.lang.Object) point36);
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        point52.y = 1.0d;
        point52.x = 1.0d;
        java.lang.Object obj58 = null;
        boolean boolean59 = point52.equals(obj58);
        point52.x = 1.0d;
        boolean boolean63 = point52.equals((java.lang.Object) false);
        java.lang.Double double64 = point52.x;
        java.lang.Double double65 = point52.x;
        java.lang.Double double66 = point52.y;
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.x;
        boolean boolean72 = point69.equals((java.lang.Object) 10.0f);
        point69.x = 100.0d;
        java.lang.Double double75 = point69.x;
        point69.y = 1.0d;
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double81 = point80.y;
        point80.y = 10.0d;
        point80.y = (-1.0d);
        java.lang.Class<?> wildcardClass86 = point80.getClass();
        boolean boolean87 = point69.equals((java.lang.Object) wildcardClass86);
        java.lang.Double double88 = point69.y;
        point69.y = 100.0d;
        boolean boolean91 = point52.equals((java.lang.Object) point69);
        point69.x = 0.0d;
        java.lang.Double double94 = point69.x;
        java.lang.Double double95 = point69.y;
        boolean boolean96 = point31.equals((java.lang.Object) point69);
        Line line97 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
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
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        point19.y = 0.0d;
        java.lang.Double double27 = point19.y;
        Line line28 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.y = 0.0d;
        java.lang.Double double16 = point2.x;
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
        Line line39 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        point2.x = (-1.0d);
        point2.x = 10.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        point15.y = 0.0d;
        point15.y = 1.0d;
        java.lang.Double double24 = point15.y;
        point15.x = 1.0d;
        boolean boolean27 = point2.equals((java.lang.Object) point15);
        point15.y = 0.0d;
        Point point32 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point32.y = 10.0d;
        java.lang.Double double35 = point32.x;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        point38.y = 100.0d;
        point38.x = (-1.0d);
        java.lang.Double double47 = point38.y;
        java.lang.Double double48 = point38.y;
        boolean boolean49 = point32.equals((java.lang.Object) point38);
        Line line50 = new Line(point15, point32);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double11 = point2.y;
        point2.x = 1.0d;
        Point point16 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        java.lang.Double double26 = point22.y;
        boolean boolean27 = point19.equals((java.lang.Object) double26);
        point19.x = 10.0d;
        java.lang.Double double30 = point19.x;
        point19.x = 10.0d;
        boolean boolean33 = point16.equals((java.lang.Object) point19);
        java.lang.Double double34 = point16.y;
        Line line35 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.y;
        point2.y = 100.0d;
        point2.x = 0.0d;
        point2.x = (-1.0d);
        point2.y = 100.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        point22.y = 0.0d;
        point22.y = (-1.0d);
        point22.y = (-1.0d);
        point22.x = 0.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Object obj41 = null;
        boolean boolean42 = point35.equals(obj41);
        point35.x = 1.0d;
        boolean boolean46 = point35.equals((java.lang.Object) false);
        java.lang.Double double47 = point35.x;
        java.lang.Double double48 = point35.x;
        boolean boolean49 = point22.equals((java.lang.Object) point35);
        Line line50 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
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
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        boolean boolean24 = point2.equals((java.lang.Object) point23);
        java.lang.Double double25 = point23.y;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.x = 10.0d;
        point28.x = 10.0d;
        point28.x = (-1.0d);
        java.lang.Double double40 = point28.y;
        java.lang.Double double41 = point28.x;
        Line line42 = new Line(point23, point28);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        point11.y = (-1.0d);
        java.lang.Double double17 = point11.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point20.x = 100.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 1.0d;
        java.lang.Double double31 = point25.y;
        java.lang.Double double32 = point25.y;
        point25.x = 10.0d;
        boolean boolean35 = point20.equals((java.lang.Object) point25);
        boolean boolean36 = point11.equals((java.lang.Object) point25);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        point39.x = 1.0d;
        boolean boolean46 = point39.equals((java.lang.Object) 'a');
        point39.x = 10.0d;
        boolean boolean49 = point25.equals((java.lang.Object) 10.0d);
        java.lang.Double double50 = point25.y;
        java.lang.Double double51 = point25.x;
        boolean boolean52 = point2.equals((java.lang.Object) point25);
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point55.x = 1.0d;
        point55.y = 1.0d;
        point55.y = (-1.0d);
        point55.y = 10.0d;
        point55.y = 0.0d;
        java.lang.Double double66 = point55.x;
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point69.x = 1.0d;
        java.lang.Double double72 = point69.y;
        point69.x = 0.0d;
        boolean boolean75 = point55.equals((java.lang.Object) point69);
        java.lang.Double double76 = point69.x;
        Line line77 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.y;
        boolean boolean15 = point2.equals((java.lang.Object) (short) 100);
        java.lang.Double double16 = point2.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        point19.y = 0.0d;
        point19.y = 1.0d;
        java.lang.Double double28 = point19.x;
        java.lang.Double double29 = point19.x;
        point19.y = 1.0d;
        java.lang.Double double32 = point19.y;
        Line line33 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.y = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        java.lang.Double double19 = point15.y;
        boolean boolean20 = point12.equals((java.lang.Object) double19);
        java.lang.Double double21 = point12.y;
        java.lang.Double double22 = point12.x;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        boolean boolean31 = point28.equals((java.lang.Object) 1L);
        java.lang.Double double32 = point28.y;
        boolean boolean33 = point25.equals((java.lang.Object) double32);
        java.lang.Double double34 = point25.y;
        boolean boolean35 = point12.equals((java.lang.Object) point25);
        Line line36 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
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
        java.lang.Double double34 = point30.x;
        point30.y = (-1.0d);
        java.lang.Double double37 = point30.y;
        Line line38 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
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
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 1.0d;
        java.lang.Object obj56 = null;
        boolean boolean57 = point50.equals(obj56);
        point50.x = 1.0d;
        point50.y = 10.0d;
        point50.y = 10.0d;
        Point point66 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point66.y = 10.0d;
        java.lang.Double double69 = point66.x;
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double73 = point72.y;
        boolean boolean75 = point72.equals((java.lang.Object) 1L);
        java.lang.Double double76 = point72.y;
        point72.y = 100.0d;
        point72.x = 10.0d;
        java.lang.Double double81 = point72.x;
        boolean boolean82 = point66.equals((java.lang.Object) point72);
        boolean boolean83 = point50.equals((java.lang.Object) point66);
        Line line84 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.x = (-1.0d);
        point2.x = 0.0d;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = 100.0d;
        Line line23 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double16 = point15.x;
        java.lang.Double double17 = point15.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 10.0d;
        boolean boolean24 = point15.equals((java.lang.Object) point20);
        point20.x = 1.0d;
        java.lang.Double double27 = point20.y;
        Line line28 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
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
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        boolean boolean26 = point18.equals((java.lang.Object) double25);
        point18.x = 10.0d;
        java.lang.Double double29 = point18.x;
        point18.y = 0.0d;
        java.lang.Double double32 = point18.x;
        java.lang.Double double33 = point18.x;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point36.x = 1.0d;
        point36.y = 1.0d;
        java.lang.Double double41 = point36.x;
        point36.x = (-1.0d);
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        point46.x = 100.0d;
        point46.x = 10.0d;
        java.lang.Double double54 = point46.y;
        boolean boolean55 = point36.equals((java.lang.Object) double54);
        point36.y = (-1.0d);
        point36.x = (-1.0d);
        boolean boolean60 = point18.equals((java.lang.Object) (-1.0d));
        java.lang.Double double61 = point18.y;
        Line line62 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
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
        java.lang.Double double20 = point2.y;
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double24 = point23.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point27.x = 1.0d;
        point27.y = 1.0d;
        point27.y = (-1.0d);
        boolean boolean34 = point23.equals((java.lang.Object) point27);
        java.lang.Double double35 = point27.x;
        point27.x = 0.0d;
        point27.y = 0.0d;
        boolean boolean40 = point2.equals((java.lang.Object) 0.0d);
        point2.y = 0.0d;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        point45.y = 1.0d;
        point45.x = 100.0d;
        point45.y = (-1.0d);
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point55.y = 1.0d;
        point55.y = (-1.0d);
        java.lang.Double double60 = point55.x;
        java.lang.Double double61 = point55.x;
        point55.y = 1.0d;
        boolean boolean64 = point45.equals((java.lang.Object) point55);
        point55.y = (-1.0d);
        point55.x = (-1.0d);
        java.lang.Double double69 = point55.x;
        java.lang.Double double70 = point55.x;
        java.lang.Double double71 = point55.x;
        point55.x = 1.0d;
        Line line74 = new Line(point2, point55);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point24.x = 100.0d;
        boolean boolean27 = point15.equals((java.lang.Object) 100.0d);
        java.lang.Double double28 = point15.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.x;
        boolean boolean38 = point15.equals((java.lang.Object) point31);
        boolean boolean39 = point2.equals((java.lang.Object) point31);
        java.lang.Double double40 = point2.y;
        java.lang.Double double41 = point2.y;
        java.lang.Double double42 = point2.y;
        point2.x = 1.0d;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.x;
        boolean boolean50 = point47.equals((java.lang.Object) 10.0f);
        point47.x = 100.0d;
        java.lang.Double double53 = point47.x;
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point56.x = 100.0d;
        boolean boolean59 = point47.equals((java.lang.Object) 100.0d);
        point47.x = 100.0d;
        point47.y = (-1.0d);
        java.lang.Double double64 = point47.x;
        Line line65 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
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
        point15.y = (-1.0d);
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        point22.y = 10.0d;
        boolean boolean26 = point15.equals((java.lang.Object) 10.0d);
        java.lang.Double double27 = point15.y;
        java.lang.Double double28 = point15.y;
        java.lang.Double double29 = point15.x;
        point15.x = (-1.0d);
        Line line32 = new Line(point8, point15);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        point2.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        point23.y = 100.0d;
        boolean boolean30 = point20.equals((java.lang.Object) 100.0d);
        java.lang.Double double31 = point20.y;
        point20.x = (-1.0d);
        java.lang.Double double34 = point20.x;
        boolean boolean35 = point2.equals((java.lang.Object) point20);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        point38.y = 1.0d;
        java.lang.Double double42 = point38.y;
        java.lang.Object obj43 = new java.lang.Object();
        boolean boolean44 = point38.equals(obj43);
        java.lang.Double double45 = point38.y;
        point38.y = 100.0d;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point50.y = 100.0d;
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass56 = point55.getClass();
        boolean boolean57 = point50.equals((java.lang.Object) point55);
        boolean boolean58 = point38.equals((java.lang.Object) point55);
        point38.y = 100.0d;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point63.x = 1.0d;
        point63.y = 1.0d;
        java.lang.Double double68 = point63.x;
        java.lang.Double double69 = point63.y;
        point63.y = 1.0d;
        java.lang.Double double72 = point63.y;
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point75.x = 1.0d;
        boolean boolean78 = point63.equals((java.lang.Object) 1.0d);
        java.lang.Double double79 = point63.x;
        boolean boolean80 = point38.equals((java.lang.Object) point63);
        Line line81 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
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
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.x;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        point35.y = 0.0d;
        point35.y = 1.0d;
        point35.y = 0.0d;
        point35.x = 100.0d;
        boolean boolean48 = point30.equals((java.lang.Object) point35);
        point35.y = 100.0d;
        point35.x = 0.0d;
        Line line53 = new Line(point7, point35);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 1.0d;
        boolean boolean18 = point11.equals((java.lang.Object) 'a');
        java.lang.Double double19 = point11.x;
        java.lang.Double double20 = point11.x;
        Line line21 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        point12.y = (-1.0d);
        point12.y = 100.0d;
        java.lang.Double double19 = point12.x;
        java.lang.Double double20 = point12.y;
        point12.x = 100.0d;
        Line line23 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.y;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point10.x = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 1.0d;
        java.lang.Double double21 = point15.y;
        java.lang.Double double22 = point15.y;
        point15.x = 10.0d;
        boolean boolean25 = point10.equals((java.lang.Object) point15);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        point28.y = 10.0d;
        boolean boolean34 = point15.equals((java.lang.Object) point28);
        java.lang.Double double35 = point15.x;
        Point point38 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double39 = point38.x;
        java.lang.Double double40 = point38.y;
        java.lang.Double double41 = point38.y;
        point38.y = (-1.0d);
        boolean boolean44 = point15.equals((java.lang.Object) (-1.0d));
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point47.y = 1.0d;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.y;
        point47.y = 0.0d;
        point47.y = 1.0d;
        point47.y = 1.0d;
        boolean boolean58 = point15.equals((java.lang.Object) point47);
        point47.x = 10.0d;
        point47.y = (-1.0d);
        boolean boolean63 = point2.equals((java.lang.Object) (-1.0d));
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point66.y = 1.0d;
        point66.y = (-1.0d);
        java.lang.Double double71 = point66.y;
        java.lang.Double double72 = point66.y;
        point66.y = 1.0d;
        point66.y = 100.0d;
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point82 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double83 = point82.y;
        point82.y = 10.0d;
        boolean boolean86 = point79.equals((java.lang.Object) point82);
        boolean boolean88 = point82.equals((java.lang.Object) 10.0d);
        boolean boolean89 = point66.equals((java.lang.Object) 10.0d);
        java.lang.Double double90 = point66.x;
        point66.x = 10.0d;
        Line line93 = new Line(point2, point66);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 100.0d;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.y;
        point8.y = 10.0d;
        java.lang.Double double15 = point8.y;
        point8.x = 10.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point20.x = 1.0d;
        point20.y = 1.0d;
        java.lang.Double double25 = point20.x;
        point20.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 100.0d;
        point30.x = 10.0d;
        java.lang.Double double38 = point30.y;
        boolean boolean39 = point20.equals((java.lang.Object) double38);
        point20.y = (-1.0d);
        java.lang.Double double42 = point20.x;
        point20.y = 1.0d;
        boolean boolean45 = point8.equals((java.lang.Object) 1.0d);
        point8.x = 10.0d;
        point8.x = (-1.0d);
        boolean boolean50 = point2.equals((java.lang.Object) point8);
        point2.x = 10.0d;
        point2.x = 10.0d;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        boolean boolean63 = point60.equals((java.lang.Object) 1L);
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.x;
        boolean boolean69 = point66.equals((java.lang.Object) 10.0f);
        point66.x = 100.0d;
        boolean boolean72 = point60.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass73 = point60.getClass();
        boolean boolean74 = point57.equals((java.lang.Object) wildcardClass73);
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point80 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double81 = point80.y;
        java.lang.Double double82 = point80.y;
        boolean boolean83 = point77.equals((java.lang.Object) point80);
        point77.x = 10.0d;
        boolean boolean86 = point57.equals((java.lang.Object) point77);
        point77.x = 10.0d;
        Line line89 = new Line(point2, point77);
        org.junit.Assert.assertTrue("Contract failed: line89.equals(line89)", line89.equals(line89));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
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
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 1.0d;
        java.lang.Double double53 = point50.y;
        java.lang.Double double54 = point50.y;
        point50.y = 0.0d;
        java.lang.Double double57 = point50.x;
        point50.y = 0.0d;
        point50.y = 10.0d;
        Point point64 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        boolean boolean65 = point50.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj66 = null;
        boolean boolean67 = point50.equals(obj66);
        boolean boolean68 = point2.equals((java.lang.Object) boolean67);
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point74 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double75 = point74.y;
        point74.y = 10.0d;
        boolean boolean78 = point71.equals((java.lang.Object) point74);
        boolean boolean80 = point74.equals((java.lang.Object) 10.0d);
        Point point83 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point83.y = 1.0d;
        java.lang.Double double86 = point83.y;
        boolean boolean87 = point74.equals((java.lang.Object) point83);
        point83.y = 1.0d;
        point83.x = 1.0d;
        point83.x = 10.0d;
        Line line94 = new Line(point2, point83);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 100.0d;
        Point point8 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double16 = point12.y;
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = point12.equals(obj17);
        java.lang.Double double19 = point12.y;
        java.lang.Class<?> wildcardClass20 = point12.getClass();
        boolean boolean21 = point8.equals((java.lang.Object) point12);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point24.y = 100.0d;
        point24.y = 0.0d;
        boolean boolean29 = point8.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass30 = point8.getClass();
        boolean boolean31 = point2.equals((java.lang.Object) wildcardClass30);
        point2.x = (-1.0d);
        Point point34 = null;
        Line line35 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
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
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point24.y = (-1.0d);
        java.lang.Object obj27 = null;
        boolean boolean28 = point24.equals(obj27);
        boolean boolean29 = point12.equals((java.lang.Object) point24);
        point12.y = 10.0d;
        point12.y = 10.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        point36.y = (-1.0d);
        java.lang.Double double41 = point36.y;
        java.lang.Double double42 = point36.y;
        Point point45 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.y;
        boolean boolean48 = point36.equals((java.lang.Object) point45);
        Line line49 = new Line(point12, point36);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
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
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point21.x = 1.0d;
        point21.y = 1.0d;
        boolean boolean26 = point18.equals((java.lang.Object) 1.0d);
        point18.x = (-1.0d);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        boolean boolean37 = point34.equals((java.lang.Object) 1L);
        java.lang.Double double38 = point34.y;
        boolean boolean39 = point31.equals((java.lang.Object) double38);
        point31.x = 10.0d;
        java.lang.Double double42 = point31.x;
        point31.x = 10.0d;
        java.lang.Double double45 = point31.y;
        boolean boolean46 = point18.equals((java.lang.Object) double45);
        java.lang.Double double47 = point18.x;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.x;
        boolean boolean53 = point50.equals((java.lang.Object) 10.0f);
        point50.x = 100.0d;
        java.lang.Double double56 = point50.x;
        point50.y = 1.0d;
        Point point61 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.y;
        point61.y = 10.0d;
        point61.y = (-1.0d);
        java.lang.Class<?> wildcardClass67 = point61.getClass();
        boolean boolean68 = point50.equals((java.lang.Object) wildcardClass67);
        java.lang.Double double69 = point50.y;
        point50.x = 1.0d;
        point50.x = 100.0d;
        point50.y = 1.0d;
        boolean boolean76 = point18.equals((java.lang.Object) point50);
        Point point79 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        boolean boolean82 = point79.equals((java.lang.Object) 1L);
        point79.y = (-1.0d);
        java.lang.Double double85 = point79.y;
        java.lang.Double double86 = point79.y;
        java.lang.Double double87 = point79.y;
        java.lang.Double double88 = point79.y;
        java.lang.Class<?> wildcardClass89 = point79.getClass();
        boolean boolean90 = point50.equals((java.lang.Object) wildcardClass89);
        Line line91 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line91.equals(line91)", line91.equals(line91));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
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
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point54.y = 0.0d;
        java.lang.Double double57 = point54.y;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        java.lang.Double double64 = point60.y;
        java.lang.Object obj65 = new java.lang.Object();
        boolean boolean66 = point60.equals(obj65);
        point60.x = 1.0d;
        java.lang.Double double69 = point60.x;
        boolean boolean70 = point54.equals((java.lang.Object) double69);
        java.lang.Double double71 = point54.y;
        Point point74 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double75 = point74.y;
        point74.y = 1.0d;
        point74.x = 100.0d;
        point74.x = 10.0d;
        point74.x = 10.0d;
        point74.x = (-1.0d);
        boolean boolean86 = point54.equals((java.lang.Object) point74);
        point74.x = 1.0d;
        Line line89 = new Line(point2, point74);
        org.junit.Assert.assertTrue("Contract failed: line89.equals(line89)", line89.equals(line89));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        point11.y = 1.0d;
        point11.y = 100.0d;
        point11.x = 1.0d;
        point11.y = (-1.0d);
        boolean boolean26 = point2.equals((java.lang.Object) point11);
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean31 = point2.equals((java.lang.Object) double30);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.y;
        java.lang.Double double39 = point34.x;
        java.lang.Double double40 = point34.y;
        point34.y = (-1.0d);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        point45.y = 1.0d;
        java.lang.Double double49 = point45.y;
        java.lang.Object obj50 = new java.lang.Object();
        boolean boolean51 = point45.equals(obj50);
        point45.x = 1.0d;
        java.lang.Double double54 = point45.x;
        point45.y = 0.0d;
        java.lang.Class<?> wildcardClass57 = point45.getClass();
        boolean boolean58 = point34.equals((java.lang.Object) wildcardClass57);
        point34.x = 0.0d;
        java.lang.Double double61 = point34.x;
        java.lang.Double double62 = point34.y;
        Line line63 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
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
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.x;
        java.lang.Double double28 = point26.y;
        point26.y = (-1.0d);
        point26.y = 0.0d;
        java.lang.Double double33 = point26.x;
        point26.y = 100.0d;
        Line line36 = new Line(point15, point26);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 0.0d;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.y;
        boolean boolean24 = point18.equals((java.lang.Object) point21);
        point18.x = 10.0d;
        boolean boolean27 = point2.equals((java.lang.Object) 10.0d);
        point2.y = 0.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 100.0d;
        java.lang.Double double38 = point32.y;
        point32.y = 100.0d;
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        boolean boolean49 = point46.equals((java.lang.Object) 1L);
        java.lang.Double double50 = point46.y;
        boolean boolean51 = point43.equals((java.lang.Object) double50);
        java.lang.Double double52 = point43.y;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point58 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.y;
        point58.y = 10.0d;
        boolean boolean62 = point55.equals((java.lang.Object) point58);
        Point point65 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass66 = point65.getClass();
        boolean boolean67 = point58.equals((java.lang.Object) wildcardClass66);
        Point point70 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point70.x = 1.0d;
        boolean boolean73 = point58.equals((java.lang.Object) point70);
        boolean boolean74 = point43.equals((java.lang.Object) point58);
        boolean boolean75 = point32.equals((java.lang.Object) point43);
        point32.x = 100.0d;
        java.lang.Object obj78 = null;
        boolean boolean79 = point32.equals(obj78);
        Line line80 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.y = 0.0d;
        java.lang.Double double8 = point2.y;
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
        java.lang.Double double45 = point11.x;
        Line line46 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.y = 10.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point12.x = 0.0d;
        point12.y = 1.0d;
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.x;
        boolean boolean19 = point2.equals((java.lang.Object) point12);
        java.lang.Object obj20 = null;
        boolean boolean21 = point2.equals(obj20);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        point24.y = 10.0d;
        java.lang.Class<?> wildcardClass28 = point24.getClass();
        boolean boolean29 = point2.equals((java.lang.Object) wildcardClass28);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        java.lang.Double double37 = point35.y;
        boolean boolean38 = point32.equals((java.lang.Object) point35);
        java.lang.Double double39 = point35.x;
        java.lang.Double double40 = point35.y;
        java.lang.Double double41 = point35.y;
        Line line42 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point2.x = 10.0d;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        point13.y = 10.0d;
        java.lang.Double double20 = point13.y;
        point13.x = 0.0d;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.x;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        boolean boolean34 = point25.equals((java.lang.Object) point29);
        boolean boolean35 = point13.equals((java.lang.Object) point29);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point38.y = 0.0d;
        java.lang.Double double41 = point38.y;
        java.lang.Double double42 = point38.x;
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point48.x = 1.0d;
        point48.y = 1.0d;
        boolean boolean53 = point45.equals((java.lang.Object) 1.0d);
        java.lang.Double double54 = point45.y;
        java.lang.Double double55 = point45.y;
        java.lang.Double double56 = point45.x;
        java.lang.Double double57 = point45.y;
        boolean boolean58 = point38.equals((java.lang.Object) double57);
        boolean boolean59 = point13.equals((java.lang.Object) double57);
        java.lang.Double double60 = point13.x;
        point13.y = 0.0d;
        point13.y = 10.0d;
        java.lang.Double double65 = point13.x;
        Line line66 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
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
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.y;
        point18.y = 1.0d;
        point18.y = 100.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj32 = null;
        boolean boolean33 = point31.equals(obj32);
        boolean boolean34 = point18.equals((java.lang.Object) point31);
        point18.x = 100.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        boolean boolean45 = point39.equals((java.lang.Object) point42);
        java.lang.Double double46 = point42.x;
        boolean boolean47 = point18.equals((java.lang.Object) point42);
        point42.y = 1.0d;
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.x;
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point56.y = 1.0d;
        point56.y = (-1.0d);
        boolean boolean61 = point52.equals((java.lang.Object) point56);
        java.lang.Double double62 = point56.y;
        boolean boolean63 = point42.equals((java.lang.Object) double62);
        Line line64 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 0.0d;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        boolean boolean17 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point21.x = 0.0d;
        point21.y = (-1.0d);
        point21.y = 100.0d;
        point21.x = 0.0d;
        java.lang.Double double30 = point21.y;
        point21.y = 100.0d;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        java.lang.Double double40 = point35.x;
        java.lang.Double double41 = point35.y;
        point35.x = 1.0d;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.y;
        point46.y = 10.0d;
        java.lang.Double double53 = point46.y;
        point46.x = 10.0d;
        java.lang.Double double56 = point46.x;
        boolean boolean57 = point35.equals((java.lang.Object) double56);
        boolean boolean58 = point21.equals((java.lang.Object) boolean57);
        Line line59 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point2.x = 10.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        point2.y = 1.0d;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point19.y = 0.0d;
        java.lang.Double double22 = point19.x;
        java.lang.Double double23 = point19.x;
        java.lang.Double double24 = point19.x;
        java.lang.Double double25 = point19.x;
        Line line26 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
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
        point2.x = (-1.0d);
        java.lang.Double double26 = point2.y;
        java.lang.Double double27 = point2.x;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.y;
        Point point35 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        point35.x = 100.0d;
        boolean boolean39 = point30.equals((java.lang.Object) point35);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        boolean boolean48 = point45.equals((java.lang.Object) 1L);
        java.lang.Double double49 = point45.y;
        boolean boolean50 = point42.equals((java.lang.Object) double49);
        java.lang.Double double51 = point42.y;
        point42.x = 1.0d;
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double57 = point56.y;
        point56.y = 10.0d;
        point56.y = (-1.0d);
        java.lang.Object obj62 = null;
        boolean boolean63 = point56.equals(obj62);
        point56.x = (-1.0d);
        point56.y = (-1.0d);
        point56.y = 100.0d;
        point56.x = 0.0d;
        boolean boolean72 = point42.equals((java.lang.Object) point56);
        boolean boolean73 = point35.equals((java.lang.Object) point42);
        boolean boolean74 = point2.equals((java.lang.Object) point35);
        Point point77 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point80 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double81 = point80.y;
        boolean boolean83 = point80.equals((java.lang.Object) 1L);
        java.lang.Double double84 = point80.y;
        boolean boolean85 = point77.equals((java.lang.Object) double84);
        java.lang.Double double86 = point77.y;
        java.lang.Double double87 = point77.x;
        point77.y = (-1.0d);
        Point point92 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double93 = point92.y;
        point92.y = 0.0d;
        java.lang.Object obj96 = null;
        boolean boolean97 = point92.equals(obj96);
        boolean boolean98 = point77.equals((java.lang.Object) boolean97);
        Line line99 = new Line(point35, point77);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point14.y = (-1.0d);
        java.lang.Double double17 = point14.x;
        point14.x = (-1.0d);
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean29 = point27.equals((java.lang.Object) true);
        boolean boolean30 = point22.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass31 = point22.getClass();
        boolean boolean32 = point14.equals((java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = point14.getClass();
        boolean boolean34 = point11.equals((java.lang.Object) wildcardClass33);
        point11.y = 10.0d;
        point11.x = (-1.0d);
        boolean boolean39 = point2.equals((java.lang.Object) point11);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point42.x = 100.0d;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        point47.x = 1.0d;
        java.lang.Double double53 = point47.y;
        java.lang.Double double54 = point47.y;
        point47.x = 10.0d;
        boolean boolean57 = point42.equals((java.lang.Object) point47);
        java.lang.Double double58 = point47.y;
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point61.y = 1.0d;
        point61.y = (-1.0d);
        java.lang.Double double66 = point61.y;
        java.lang.Double double67 = point61.y;
        java.lang.Double double68 = point61.y;
        java.lang.Double double69 = point61.y;
        boolean boolean70 = point47.equals((java.lang.Object) point61);
        Line line71 = new Line(point11, point47);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        point13.y = (-1.0d);
        point13.y = 100.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        point22.y = (-1.0d);
        java.lang.Double double28 = point22.y;
        java.lang.Double double29 = point22.y;
        java.lang.Double double30 = point22.x;
        boolean boolean31 = point13.equals((java.lang.Object) point22);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        point34.y = (-1.0d);
        java.lang.Double double39 = point34.y;
        java.lang.Double double40 = point34.y;
        Point point43 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        boolean boolean46 = point34.equals((java.lang.Object) point43);
        boolean boolean47 = point22.equals((java.lang.Object) boolean46);
        boolean boolean48 = point2.equals((java.lang.Object) boolean47);
        point2.y = (-1.0d);
        java.lang.Double double51 = point2.y;
        java.lang.Double double52 = point2.x;
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point55.x = 0.0d;
        point55.y = 1.0d;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        point62.y = 1.0d;
        point62.x = 100.0d;
        point62.x = 10.0d;
        java.lang.Double double70 = point62.y;
        point62.y = 0.0d;
        java.lang.Double double73 = point62.x;
        boolean boolean74 = point55.equals((java.lang.Object) point62);
        point62.y = 10.0d;
        java.lang.Double double77 = point62.y;
        point62.y = 100.0d;
        Line line80 = new Line(point2, point62);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
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
        Point point24 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        point24.x = 100.0d;
        boolean boolean28 = point2.equals((java.lang.Object) 100.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 1.0d;
        java.lang.Object obj37 = null;
        boolean boolean38 = point31.equals(obj37);
        point31.x = 1.0d;
        Line line41 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
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
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point34.x = 1.0d;
        point34.y = 1.0d;
        boolean boolean39 = point31.equals((java.lang.Object) 1.0d);
        point31.x = (-1.0d);
        Point point44 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        boolean boolean50 = point47.equals((java.lang.Object) 1L);
        java.lang.Double double51 = point47.y;
        boolean boolean52 = point44.equals((java.lang.Object) double51);
        point44.x = 10.0d;
        java.lang.Double double55 = point44.x;
        point44.x = 10.0d;
        java.lang.Double double58 = point44.y;
        boolean boolean59 = point31.equals((java.lang.Object) double58);
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point62.x = 1.0d;
        point62.y = 1.0d;
        java.lang.Double double67 = point62.x;
        java.lang.Double double68 = point62.y;
        boolean boolean69 = point31.equals((java.lang.Object) point62);
        Line line70 = new Line(point2, point62);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.y = 100.0d;
        point2.x = 100.0d;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point18.y = 10.0d;
        java.lang.Double double21 = point18.x;
        boolean boolean22 = point2.equals((java.lang.Object) point18);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        java.lang.Double double29 = point25.y;
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = point25.equals(obj30);
        java.lang.Double double32 = point25.y;
        point25.y = 100.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point37.y = 100.0d;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass43 = point42.getClass();
        boolean boolean44 = point37.equals((java.lang.Object) point42);
        boolean boolean45 = point25.equals((java.lang.Object) point42);
        point25.y = 100.0d;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point50.x = 1.0d;
        point50.y = 1.0d;
        java.lang.Double double55 = point50.x;
        java.lang.Double double56 = point50.y;
        point50.y = 1.0d;
        java.lang.Double double59 = point50.y;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point62.x = 1.0d;
        boolean boolean65 = point50.equals((java.lang.Object) 1.0d);
        java.lang.Double double66 = point50.x;
        boolean boolean67 = point25.equals((java.lang.Object) point50);
        Line line68 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.y;
        point14.x = 0.0d;
        point14.y = 10.0d;
        Line line23 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        point16.y = 10.0d;
        boolean boolean20 = point13.equals((java.lang.Object) point16);
        boolean boolean22 = point16.equals((java.lang.Object) 10.0d);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        java.lang.Double double28 = point25.y;
        boolean boolean29 = point16.equals((java.lang.Object) point25);
        point25.x = 10.0d;
        point25.y = 100.0d;
        point25.y = 100.0d;
        java.lang.Double double36 = point25.y;
        Line line37 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        point11.y = 100.0d;
        point11.x = (-1.0d);
        point11.x = (-1.0d);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.x;
        boolean boolean27 = point24.equals((java.lang.Object) 10.0f);
        point24.x = 100.0d;
        java.lang.Double double30 = point24.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point33.x = 100.0d;
        boolean boolean36 = point24.equals((java.lang.Object) 100.0d);
        java.lang.Double double37 = point24.y;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        java.lang.Double double46 = point40.x;
        boolean boolean47 = point24.equals((java.lang.Object) point40);
        boolean boolean48 = point11.equals((java.lang.Object) point40);
        java.lang.Double double49 = point11.y;
        java.lang.Double double50 = point11.y;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.x;
        boolean boolean56 = point53.equals((java.lang.Object) 10.0f);
        point53.x = 100.0d;
        java.lang.Class<?> wildcardClass59 = point53.getClass();
        boolean boolean60 = point11.equals((java.lang.Object) point53);
        boolean boolean61 = point2.equals((java.lang.Object) point11);
        Point point62 = null;
        Line line63 = new Line(point2, point62);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
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
        java.lang.Double double19 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double22 = point2.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point25.y = (-1.0d);
        java.lang.Double double28 = point25.y;
        java.lang.Double double29 = point25.y;
        point25.y = 1.0d;
        Line line32 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass13 = point12.getClass();
        boolean boolean14 = point5.equals((java.lang.Object) wildcardClass13);
        Point point17 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.x;
        java.lang.Double double19 = point17.y;
        point17.y = (-1.0d);
        point17.y = 0.0d;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        java.lang.Double double31 = point26.y;
        java.lang.Double double32 = point26.y;
        point26.y = 1.0d;
        point26.y = 100.0d;
        point26.x = 1.0d;
        point26.y = (-1.0d);
        boolean boolean41 = point17.equals((java.lang.Object) point26);
        boolean boolean42 = point5.equals((java.lang.Object) boolean41);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point45.x = 1.0d;
        point45.y = 1.0d;
        point45.y = (-1.0d);
        point45.y = 10.0d;
        point45.y = 1.0d;
        java.lang.Double double56 = point45.x;
        java.lang.Double double57 = point45.y;
        point45.y = 0.0d;
        java.lang.Double double60 = point45.y;
        boolean boolean61 = point5.equals((java.lang.Object) point45);
        Point point64 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point64.x = 0.0d;
        point64.y = 1.0d;
        java.lang.Double double69 = point64.x;
        point64.x = 0.0d;
        java.lang.Double double72 = point64.x;
        Line line73 = new Line(point5, point64);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = 0.0d;
        point2.x = 1.0d;
        point2.x = 1.0d;
        point2.x = 0.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point19.x = 1.0d;
        point19.y = 1.0d;
        boolean boolean24 = point16.equals((java.lang.Object) 1.0d);
        java.lang.Double double25 = point16.y;
        java.lang.Double double26 = point16.x;
        point16.x = 10.0d;
        point16.x = (-1.0d);
        point16.x = 1.0d;
        boolean boolean33 = point2.equals((java.lang.Object) point16);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        point36.x = 100.0d;
        point36.y = (-1.0d);
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        point46.y = (-1.0d);
        java.lang.Double double51 = point46.x;
        java.lang.Double double52 = point46.x;
        point46.y = 1.0d;
        boolean boolean55 = point36.equals((java.lang.Object) point46);
        Point point58 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean60 = point58.equals((java.lang.Object) (byte) 100);
        java.lang.Double double61 = point58.x;
        point58.x = (-1.0d);
        boolean boolean64 = point46.equals((java.lang.Object) point58);
        java.lang.Double double65 = point46.x;
        Point point68 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        point68.y = 1.0d;
        point68.x = 100.0d;
        point68.x = 10.0d;
        point68.x = 10.0d;
        point68.x = 10.0d;
        point68.x = 10.0d;
        point68.y = 10.0d;
        boolean boolean84 = point46.equals((java.lang.Object) point68);
        Line line85 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
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
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        point24.y = 0.0d;
        point24.y = (-1.0d);
        point24.y = (-1.0d);
        point24.x = 0.0d;
        point24.y = 0.0d;
        java.lang.Double double37 = point24.y;
        Line line38 = new Line(point12, point24);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        boolean boolean24 = point18.equals((java.lang.Object) 10.0d);
        boolean boolean25 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double26 = point2.x;
        point2.x = 10.0d;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point31.y = 10.0d;
        java.lang.Double double34 = point31.x;
        java.lang.Double double35 = point31.x;
        java.lang.Double double36 = point31.x;
        boolean boolean37 = point2.equals((java.lang.Object) point31);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        point40.x = 1.0d;
        point40.x = 100.0d;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean55 = point53.equals((java.lang.Object) true);
        java.lang.Double double56 = point53.x;
        point53.x = 10.0d;
        boolean boolean59 = point40.equals((java.lang.Object) 10.0d);
        Line line60 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        point2.y = 0.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        point11.y = 1.0d;
        point11.y = 100.0d;
        point11.x = 1.0d;
        point11.y = (-1.0d);
        boolean boolean26 = point2.equals((java.lang.Object) point11);
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.y;
        java.lang.Double double33 = point30.x;
        java.lang.Double double34 = point30.x;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        boolean boolean43 = point40.equals((java.lang.Object) 1L);
        java.lang.Double double44 = point40.y;
        boolean boolean45 = point37.equals((java.lang.Object) double44);
        java.lang.Double double46 = point37.y;
        java.lang.Double double47 = point37.x;
        point37.x = 100.0d;
        java.lang.Double double50 = point37.y;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        java.lang.Double double58 = point56.y;
        boolean boolean59 = point53.equals((java.lang.Object) point56);
        java.lang.Double double60 = point56.x;
        Point point63 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        boolean boolean69 = point66.equals((java.lang.Object) 1L);
        java.lang.Double double70 = point66.y;
        boolean boolean71 = point63.equals((java.lang.Object) double70);
        point63.x = 10.0d;
        java.lang.Double double74 = point63.x;
        point63.x = 10.0d;
        java.lang.Class<?> wildcardClass77 = point63.getClass();
        boolean boolean78 = point56.equals((java.lang.Object) wildcardClass77);
        boolean boolean79 = point37.equals((java.lang.Object) point56);
        boolean boolean80 = point30.equals((java.lang.Object) point56);
        point56.x = 100.0d;
        Line line83 = new Line(point2, point56);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.y = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        point15.x = 10.0d;
        java.lang.Double double23 = point15.y;
        point15.y = 0.0d;
        java.lang.Double double26 = point15.x;
        point15.y = (-1.0d);
        point15.y = 10.0d;
        point15.x = 10.0d;
        Line line33 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
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
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.y;
        point25.x = (-1.0d);
        java.lang.Double double30 = point25.x;
        Line line31 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = (-1.0d);
        java.lang.Object obj12 = null;
        boolean boolean13 = point2.equals(obj12);
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        java.lang.Double double24 = point18.x;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point27.x = 100.0d;
        boolean boolean30 = point18.equals((java.lang.Object) 100.0d);
        java.lang.Double double31 = point18.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        boolean boolean41 = point18.equals((java.lang.Object) point34);
        boolean boolean42 = point2.equals((java.lang.Object) point18);
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
        java.lang.Double double63 = point45.y;
        Point point66 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double67 = point66.y;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point70.x = 1.0d;
        point70.y = 1.0d;
        point70.y = (-1.0d);
        boolean boolean77 = point66.equals((java.lang.Object) point70);
        java.lang.Double double78 = point70.x;
        point70.x = 0.0d;
        point70.y = 0.0d;
        boolean boolean83 = point45.equals((java.lang.Object) 0.0d);
        java.lang.Double double84 = point45.x;
        Line line85 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
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
        java.lang.Double double17 = point14.y;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double21 = point20.x;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.y;
        java.lang.Double double27 = point24.x;
        boolean boolean28 = point20.equals((java.lang.Object) point24);
        Line line29 = new Line(point14, point24);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        point2.x = 10.0d;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        point14.y = 100.0d;
        point14.x = (-1.0d);
        point14.x = (-1.0d);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.x;
        boolean boolean30 = point27.equals((java.lang.Object) 10.0f);
        point27.x = 100.0d;
        java.lang.Double double33 = point27.x;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point36.x = 100.0d;
        boolean boolean39 = point27.equals((java.lang.Object) 100.0d);
        java.lang.Double double40 = point27.y;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 100.0d;
        java.lang.Double double49 = point43.x;
        boolean boolean50 = point27.equals((java.lang.Object) point43);
        boolean boolean51 = point14.equals((java.lang.Object) point43);
        point43.y = 10.0d;
        Line line54 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point11.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        boolean boolean26 = point18.equals((java.lang.Object) double25);
        java.lang.Double double27 = point18.y;
        java.lang.Double double28 = point18.x;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        boolean boolean37 = point34.equals((java.lang.Object) 1L);
        java.lang.Double double38 = point34.y;
        boolean boolean39 = point31.equals((java.lang.Object) double38);
        java.lang.Double double40 = point31.y;
        boolean boolean41 = point18.equals((java.lang.Object) point31);
        java.lang.Double double42 = point31.y;
        point31.x = 1.0d;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.x;
        boolean boolean49 = point31.equals((java.lang.Object) point47);
        Line line50 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 0.0d;
        point2.x = 10.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point16.y = 0.0d;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.x;
        Point point23 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.y;
        boolean boolean26 = point16.equals((java.lang.Object) point23);
        java.lang.Double double27 = point23.y;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        boolean boolean36 = point33.equals((java.lang.Object) 1L);
        java.lang.Double double37 = point33.y;
        boolean boolean38 = point30.equals((java.lang.Object) double37);
        java.lang.Double double39 = point30.y;
        java.lang.Double double40 = point30.x;
        point30.x = 100.0d;
        point30.y = 0.0d;
        java.lang.Object obj45 = null;
        boolean boolean46 = point30.equals(obj45);
        boolean boolean47 = point23.equals((java.lang.Object) point30);
        Line line48 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
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
        point2.x = 1.0d;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point22.y = 1.0d;
        java.lang.Double double25 = point22.y;
        java.lang.Double double26 = point22.y;
        point22.y = 0.0d;
        java.lang.Double double29 = point22.x;
        point22.y = 0.0d;
        point22.y = 10.0d;
        point22.y = 10.0d;
        Line line36 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        java.lang.Double double19 = point17.x;
        point17.y = 0.0d;
        point17.y = (-1.0d);
        point17.y = 100.0d;
        java.lang.Double double26 = point17.x;
        boolean boolean27 = point2.equals((java.lang.Object) point17);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        point30.y = (-1.0d);
        java.lang.Double double36 = point30.y;
        java.lang.Double double37 = point30.y;
        java.lang.Double double38 = point30.x;
        java.lang.Double double39 = point30.x;
        java.lang.Double double40 = point30.y;
        Line line41 = new Line(point17, point30);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.x;
        point2.x = (-1.0d);
        java.lang.Double double8 = point2.x;
        point2.y = 10.0d;
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        point13.y = 100.0d;
        point13.y = (-1.0d);
        point13.y = 0.0d;
        point13.x = 1.0d;
        boolean boolean23 = point2.equals((java.lang.Object) point13);
        Point point24 = null;
        Line line25 = new Line(point13, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = 0.0d;
        point2.y = 0.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point13.x = 0.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        Line line18 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.y;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double11 = point10.x;
        java.lang.Double double12 = point10.x;
        point10.y = 100.0d;
        java.lang.Double double15 = point10.x;
        Line line16 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
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
        java.lang.Double double21 = point2.x;
        point2.x = 10.0d;
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.x;
        java.lang.Double double28 = point26.y;
        java.lang.Double double29 = point26.x;
        point26.y = 100.0d;
        java.lang.Double double32 = point26.y;
        java.lang.Double double33 = point26.y;
        Line line34 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
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
        point2.x = 0.0d;
        Point point26 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double34 = point31.y;
        java.lang.Double double35 = point31.x;
        point31.x = 1.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        java.lang.Double double47 = point40.y;
        point40.x = 1.0d;
        boolean boolean50 = point31.equals((java.lang.Object) point40);
        Point point53 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean54 = point40.equals((java.lang.Object) point53);
        java.lang.Double double55 = point40.y;
        boolean boolean56 = point26.equals((java.lang.Object) double55);
        point26.y = (-1.0d);
        Line line59 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
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
        java.lang.Double double24 = point2.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point27.x = 0.0d;
        point27.x = 1.0d;
        point27.x = (-1.0d);
        point27.y = 10.0d;
        Point point38 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        point38.y = 100.0d;
        boolean boolean42 = point27.equals((java.lang.Object) 100.0d);
        Line line43 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
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
        boolean boolean39 = point2.equals((java.lang.Object) point28);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point42.y = 100.0d;
        java.lang.Double double45 = point42.x;
        Line line46 = new Line(point28, point42);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
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
        Point point65 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double66 = point65.x;
        java.lang.Double double67 = point65.y;
        point65.y = (-1.0d);
        point65.x = 100.0d;
        point65.y = 100.0d;
        point65.y = 10.0d;
        Line line76 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.y = 1.0d;
        boolean boolean11 = point2.equals((java.lang.Object) 100L);
        point2.x = 0.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point16.x = 1.0d;
        point16.y = (-1.0d);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        point23.y = 10.0d;
        boolean boolean27 = point16.equals((java.lang.Object) 10.0d);
        java.lang.Double double28 = point16.y;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 1.0d;
        point31.y = (-1.0d);
        java.lang.Double double36 = point31.y;
        java.lang.Double double37 = point31.y;
        point31.y = 1.0d;
        point31.y = 100.0d;
        point31.y = 0.0d;
        java.lang.Double double44 = point31.y;
        java.lang.Double double45 = point31.y;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point48.y = 10.0d;
        java.lang.Double double51 = point48.x;
        java.lang.Double double52 = point48.x;
        java.lang.Double double53 = point48.x;
        java.lang.Class<?> wildcardClass54 = point48.getClass();
        boolean boolean55 = point31.equals((java.lang.Object) wildcardClass54);
        java.lang.Double double56 = point31.y;
        point31.x = 100.0d;
        boolean boolean59 = point16.equals((java.lang.Object) 100.0d);
        java.lang.Double double60 = point16.x;
        boolean boolean62 = point16.equals((java.lang.Object) 1.0f);
        Line line63 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        point2.x = 100.0d;
        point2.y = 100.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        java.lang.Double double19 = point15.y;
        point15.y = 100.0d;
        point15.x = 10.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 1.0d;
        java.lang.Object obj32 = null;
        boolean boolean33 = point26.equals(obj32);
        point26.x = 1.0d;
        point26.x = (-1.0d);
        java.lang.Double double38 = point26.x;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        point41.y = (-1.0d);
        point41.y = 100.0d;
        point41.x = (-1.0d);
        point41.x = (-1.0d);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.x;
        boolean boolean57 = point54.equals((java.lang.Object) 10.0f);
        point54.x = 100.0d;
        java.lang.Double double60 = point54.x;
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point63.x = 100.0d;
        boolean boolean66 = point54.equals((java.lang.Object) 100.0d);
        java.lang.Double double67 = point54.y;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        point70.y = 1.0d;
        point70.x = 100.0d;
        java.lang.Double double76 = point70.x;
        boolean boolean77 = point54.equals((java.lang.Object) point70);
        boolean boolean78 = point41.equals((java.lang.Object) point70);
        java.lang.Double double79 = point41.y;
        java.lang.Double double80 = point41.y;
        boolean boolean81 = point26.equals((java.lang.Object) point41);
        Point point84 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point87 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double88 = point87.y;
        point87.y = 10.0d;
        boolean boolean91 = point84.equals((java.lang.Object) point87);
        point84.y = 0.0d;
        boolean boolean94 = point41.equals((java.lang.Object) point84);
        point41.y = (-1.0d);
        java.lang.Double double97 = point41.x;
        boolean boolean98 = point15.equals((java.lang.Object) point41);
        Line line99 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        point2.x = 1.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point18.x = 1.0d;
        Line line21 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 1.0d;
        point6.y = (-1.0d);
        boolean boolean11 = point2.equals((java.lang.Object) point6);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point14.x = 100.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        java.lang.Double double25 = point19.y;
        java.lang.Double double26 = point19.y;
        point19.x = 10.0d;
        boolean boolean29 = point14.equals((java.lang.Object) point19);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        point32.y = 10.0d;
        boolean boolean38 = point19.equals((java.lang.Object) point32);
        java.lang.Double double39 = point19.x;
        Point point42 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.x;
        java.lang.Double double44 = point42.y;
        java.lang.Double double45 = point42.y;
        point42.y = (-1.0d);
        boolean boolean48 = point19.equals((java.lang.Object) (-1.0d));
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        java.lang.Double double54 = point51.y;
        java.lang.Double double55 = point51.y;
        point51.y = 0.0d;
        point51.y = 1.0d;
        point51.y = 1.0d;
        boolean boolean62 = point19.equals((java.lang.Object) point51);
        point51.x = 10.0d;
        boolean boolean65 = point2.equals((java.lang.Object) point51);
        java.lang.Double double66 = point2.y;
        Point point69 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double70 = point69.y;
        Line line71 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
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
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        java.lang.Double double25 = point22.x;
        point22.x = 100.0d;
        java.lang.Double double28 = point22.x;
        Line line29 = new Line(point9, point22);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
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
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        boolean boolean32 = point15.equals((java.lang.Object) point29);
        java.lang.Double double33 = point15.y;
        point15.x = 10.0d;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        java.lang.Double double44 = point38.y;
        point38.y = 1.0d;
        point38.y = 100.0d;
        point38.y = 0.0d;
        java.lang.Double double51 = point38.y;
        java.lang.Double double52 = point38.y;
        Point point55 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point55.y = 10.0d;
        java.lang.Double double58 = point55.x;
        java.lang.Double double59 = point55.x;
        java.lang.Double double60 = point55.x;
        java.lang.Class<?> wildcardClass61 = point55.getClass();
        boolean boolean62 = point38.equals((java.lang.Object) wildcardClass61);
        java.lang.Double double63 = point38.y;
        point38.x = 100.0d;
        Line line66 = new Line(point15, point38);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
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
        point2.x = 10.0d;
        java.lang.Double double26 = point2.y;
        point2.y = 100.0d;
        point2.x = 0.0d;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 0.0d;
        Point point38 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double39 = point38.x;
        java.lang.Double double40 = point38.y;
        java.lang.Double double41 = point38.y;
        java.lang.Double double42 = point38.y;
        boolean boolean43 = point33.equals((java.lang.Object) point38);
        java.lang.Double double44 = point33.y;
        java.lang.Double double45 = point33.x;
        java.lang.Double double46 = point33.y;
        Line line47 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass13 = point12.getClass();
        boolean boolean14 = point5.equals((java.lang.Object) wildcardClass13);
        Point point17 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        boolean boolean20 = point5.equals((java.lang.Object) point17);
        point17.x = 10.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        java.lang.Double double29 = point25.y;
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = point25.equals(obj30);
        point25.x = 1.0d;
        java.lang.Double double34 = point25.x;
        point25.y = 0.0d;
        point25.y = 1.0d;
        java.lang.Double double39 = point25.x;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point42.y = 1.0d;
        java.lang.Double double45 = point42.y;
        java.lang.Double double46 = point42.y;
        java.lang.Double double47 = point42.y;
        point42.y = (-1.0d);
        point42.y = 10.0d;
        point42.x = (-1.0d);
        boolean boolean54 = point25.equals((java.lang.Object) (-1.0d));
        Line line55 = new Line(point17, point25);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double10 = point2.x;
        point2.y = 0.0d;
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
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.x;
        boolean boolean35 = point32.equals((java.lang.Object) 10.0f);
        point32.x = 100.0d;
        java.lang.Double double38 = point32.x;
        point32.y = 1.0d;
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        point43.y = 10.0d;
        point43.y = (-1.0d);
        java.lang.Class<?> wildcardClass49 = point43.getClass();
        boolean boolean50 = point32.equals((java.lang.Object) wildcardClass49);
        java.lang.Double double51 = point32.y;
        point32.y = 100.0d;
        boolean boolean54 = point15.equals((java.lang.Object) point32);
        boolean boolean55 = point2.equals((java.lang.Object) point32);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        boolean boolean61 = point58.equals((java.lang.Object) 1L);
        java.lang.Double double62 = point58.y;
        point58.y = 100.0d;
        point58.x = 10.0d;
        java.lang.Double double67 = point58.x;
        Line line68 = new Line(point2, point58);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point5.equals((java.lang.Object) boolean24);
        java.lang.Double double26 = point5.x;
        point5.x = 10.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        java.lang.Double double35 = point31.y;
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = point31.equals(obj36);
        java.lang.Double double38 = point31.y;
        point31.x = 10.0d;
        java.lang.Double double41 = point31.y;
        point31.y = 10.0d;
        point31.y = (-1.0d);
        boolean boolean47 = point31.equals((java.lang.Object) (short) -1);
        point31.x = 1.0d;
        java.lang.Double double50 = point31.y;
        Line line51 = new Line(point5, point31);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.x;
        point2.x = 10.0d;
        point2.y = 1.0d;
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
        point17.x = 1.0d;
        java.lang.Double double34 = point17.x;
        point17.y = 0.0d;
        Line line37 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double6 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Double double20 = point14.y;
        point14.y = 1.0d;
        point14.y = 100.0d;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj28 = null;
        boolean boolean29 = point27.equals(obj28);
        boolean boolean30 = point14.equals((java.lang.Object) point27);
        boolean boolean31 = point2.equals((java.lang.Object) point27);
        point2.y = 0.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        point36.y = (-1.0d);
        java.lang.Double double41 = point36.x;
        java.lang.Double double42 = point36.x;
        java.lang.Double double43 = point36.y;
        Line line44 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double15 = point14.x;
        point14.x = 100.0d;
        point14.x = (-1.0d);
        boolean boolean20 = point2.equals((java.lang.Object) (-1.0d));
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 100.0d;
        point23.y = 10.0d;
        point23.y = 100.0d;
        boolean boolean33 = point2.equals((java.lang.Object) point23);
        point2.x = (-1.0d);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        java.lang.Double double44 = point38.x;
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point47.x = 100.0d;
        boolean boolean50 = point38.equals((java.lang.Object) 100.0d);
        java.lang.Double double51 = point38.y;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        point54.x = 100.0d;
        java.lang.Double double60 = point54.x;
        boolean boolean61 = point38.equals((java.lang.Object) point54);
        point38.y = 1.0d;
        point38.y = 0.0d;
        boolean boolean66 = point2.equals((java.lang.Object) point38);
        Point point67 = null;
        Line line68 = new Line(point2, point67);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
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
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.x;
        point23.y = 1.0d;
        java.lang.Double double31 = point23.x;
        java.lang.Double double32 = point23.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Object obj41 = null;
        boolean boolean42 = point35.equals(obj41);
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point45.y = 0.0d;
        java.lang.Double double48 = point45.y;
        java.lang.Double double49 = point45.x;
        point45.x = 1.0d;
        boolean boolean52 = point35.equals((java.lang.Object) 1.0d);
        boolean boolean53 = point23.equals((java.lang.Object) point35);
        java.lang.Double double54 = point23.x;
        java.lang.Double double55 = point23.y;
        Line line56 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
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
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        java.lang.Double double29 = point19.x;
        point19.y = 1.0d;
        point19.y = (-1.0d);
        Line line34 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 0.0d;
        point19.y = (-1.0d);
        point19.y = 0.0d;
        java.lang.Double double26 = point19.y;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        java.lang.Double double34 = point29.y;
        java.lang.Double double35 = point29.y;
        point29.y = 1.0d;
        point29.y = 100.0d;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj43 = null;
        boolean boolean44 = point42.equals(obj43);
        boolean boolean45 = point29.equals((java.lang.Object) point42);
        point29.x = 100.0d;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        java.lang.Double double55 = point53.y;
        boolean boolean56 = point50.equals((java.lang.Object) point53);
        java.lang.Double double57 = point53.x;
        boolean boolean58 = point29.equals((java.lang.Object) point53);
        point53.y = 1.0d;
        java.lang.Double double61 = point53.y;
        point53.y = 0.0d;
        boolean boolean64 = point19.equals((java.lang.Object) point53);
        Line line65 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = 100.0d;
        point2.x = 0.0d;
        point2.x = 10.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point11.x = 0.0d;
        point11.y = 1.0d;
        java.lang.Double double16 = point11.x;
        point11.x = 10.0d;
        java.lang.Double double19 = point11.x;
        java.lang.Double double20 = point11.x;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        point26.y = 10.0d;
        boolean boolean30 = point23.equals((java.lang.Object) point26);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass34 = point33.getClass();
        boolean boolean35 = point26.equals((java.lang.Object) wildcardClass34);
        Point point38 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point38.x = 1.0d;
        boolean boolean41 = point26.equals((java.lang.Object) point38);
        java.lang.Double double42 = point26.y;
        point26.y = 0.0d;
        point26.x = 0.0d;
        boolean boolean47 = point11.equals((java.lang.Object) 0.0d);
        Line line48 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point16.x = 0.0d;
        java.lang.Double double19 = point16.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        boolean boolean31 = point22.equals((java.lang.Object) point26);
        boolean boolean32 = point16.equals((java.lang.Object) boolean31);
        point16.y = 100.0d;
        Line line35 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.y = 0.0d;
        boolean boolean9 = point2.equals((java.lang.Object) '#');
        point2.x = 10.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point15.y = (-1.0d);
        java.lang.Double double18 = point15.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        point21.y = 1.0d;
        boolean boolean30 = point15.equals((java.lang.Object) point21);
        Line line31 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
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
        point7.y = (-1.0d);
        Line line25 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        point9.y = (-1.0d);
        java.lang.Double double14 = point9.y;
        java.lang.Double double15 = point9.y;
        point9.y = 1.0d;
        point9.y = 100.0d;
        point9.x = 1.0d;
        point9.y = 10.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 10.0d;
        boolean boolean33 = point26.equals((java.lang.Object) point29);
        java.lang.Double double34 = point26.x;
        boolean boolean35 = point9.equals((java.lang.Object) double34);
        java.lang.Double double36 = point9.y;
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double40 = point39.x;
        java.lang.Double double41 = point39.x;
        point39.y = 100.0d;
        java.lang.Double double44 = point39.x;
        boolean boolean45 = point9.equals((java.lang.Object) point39);
        Line line46 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
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
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        java.lang.Double double21 = point19.x;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        boolean boolean26 = point19.equals((java.lang.Object) double25);
        point19.x = (-1.0d);
        java.lang.Double double29 = point19.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.x;
        boolean boolean35 = point32.equals((java.lang.Object) 10.0f);
        point32.x = 100.0d;
        java.lang.Double double38 = point32.x;
        point32.y = 1.0d;
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        point43.y = 10.0d;
        point43.y = (-1.0d);
        java.lang.Class<?> wildcardClass49 = point43.getClass();
        boolean boolean50 = point32.equals((java.lang.Object) wildcardClass49);
        java.lang.Double double51 = point32.y;
        java.lang.Double double52 = point32.x;
        point32.y = (-1.0d);
        boolean boolean55 = point19.equals((java.lang.Object) (-1.0d));
        point19.x = (-1.0d);
        point19.y = 10.0d;
        Line line60 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.y = 0.0d;
        boolean boolean14 = point2.equals((java.lang.Object) point11);
        point11.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        java.lang.Double double24 = point19.y;
        java.lang.Double double25 = point19.y;
        point19.y = 1.0d;
        point19.y = 100.0d;
        point19.x = 1.0d;
        point19.y = 10.0d;
        java.lang.Double double34 = point19.y;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.x;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean44 = point42.equals((java.lang.Object) true);
        boolean boolean45 = point37.equals((java.lang.Object) true);
        boolean boolean46 = point19.equals((java.lang.Object) true);
        java.lang.Double double47 = point19.y;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.y;
        java.lang.Double double52 = point50.y;
        java.lang.Double double53 = point50.x;
        point50.x = 100.0d;
        java.lang.Double double56 = point50.x;
        boolean boolean57 = point19.equals((java.lang.Object) point50);
        Line line58 = new Line(point11, point19);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 1.0d;
        point6.y = (-1.0d);
        boolean boolean11 = point2.equals((java.lang.Object) point6);
        point6.y = 1.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point16.y = 0.0d;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.x;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point26.x = 1.0d;
        point26.y = 1.0d;
        boolean boolean31 = point23.equals((java.lang.Object) 1.0d);
        java.lang.Double double32 = point23.y;
        java.lang.Double double33 = point23.y;
        java.lang.Double double34 = point23.x;
        java.lang.Double double35 = point23.y;
        boolean boolean36 = point16.equals((java.lang.Object) double35);
        Line line37 = new Line(point6, point16);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
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
        java.lang.Double double20 = point2.y;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point23.y = 1.0d;
        point23.y = (-1.0d);
        java.lang.Double double28 = point23.y;
        java.lang.Double double29 = point23.y;
        point23.y = 1.0d;
        point23.y = 100.0d;
        point23.x = 1.0d;
        point23.y = 10.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        point43.y = 10.0d;
        boolean boolean47 = point40.equals((java.lang.Object) point43);
        java.lang.Double double48 = point40.x;
        boolean boolean49 = point23.equals((java.lang.Object) double48);
        java.lang.Double double50 = point23.y;
        boolean boolean51 = point2.equals((java.lang.Object) point23);
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        point57.y = 1.0d;
        point57.x = 100.0d;
        point57.x = 10.0d;
        java.lang.Double double65 = point57.y;
        java.lang.Double double66 = point57.x;
        boolean boolean67 = point54.equals((java.lang.Object) double66);
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point70.y = 0.0d;
        java.lang.Double double73 = point70.y;
        java.lang.Double double74 = point70.x;
        boolean boolean75 = point54.equals((java.lang.Object) point70);
        point70.y = 10.0d;
        Line line78 = new Line(point2, point70);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
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
        java.lang.Double double30 = point2.y;
        java.lang.Double double31 = point2.x;
        java.lang.Double double32 = point2.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point35.y = 100.0d;
        point35.y = 10.0d;
        java.lang.Double double40 = point35.y;
        java.lang.Double double41 = point35.y;
        point35.x = (-1.0d);
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.x;
        boolean boolean49 = point46.equals((java.lang.Object) 10.0f);
        point46.x = 100.0d;
        java.lang.Double double52 = point46.x;
        point46.y = 1.0d;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double58 = point57.y;
        point57.y = 10.0d;
        point57.y = (-1.0d);
        java.lang.Class<?> wildcardClass63 = point57.getClass();
        boolean boolean64 = point46.equals((java.lang.Object) wildcardClass63);
        java.lang.Double double65 = point46.y;
        java.lang.Double double66 = point46.x;
        boolean boolean67 = point35.equals((java.lang.Object) point46);
        Line line68 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        point5.x = 100.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point14.x = 100.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        java.lang.Double double25 = point19.y;
        java.lang.Double double26 = point19.y;
        point19.x = 10.0d;
        boolean boolean29 = point14.equals((java.lang.Object) point19);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        point32.y = 10.0d;
        boolean boolean38 = point19.equals((java.lang.Object) point32);
        point32.y = 10.0d;
        java.lang.Double double41 = point32.x;
        Line line42 = new Line(point5, point32);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.x = 1.0d;
        point2.x = 0.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        java.lang.Double double18 = point12.y;
        point12.y = 100.0d;
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        boolean boolean29 = point26.equals((java.lang.Object) 1L);
        java.lang.Double double30 = point26.y;
        boolean boolean31 = point23.equals((java.lang.Object) double30);
        java.lang.Double double32 = point23.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double39 = point38.y;
        point38.y = 10.0d;
        boolean boolean42 = point35.equals((java.lang.Object) point38);
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass46 = point45.getClass();
        boolean boolean47 = point38.equals((java.lang.Object) wildcardClass46);
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point50.x = 1.0d;
        boolean boolean53 = point38.equals((java.lang.Object) point50);
        boolean boolean54 = point23.equals((java.lang.Object) point38);
        boolean boolean55 = point12.equals((java.lang.Object) point23);
        point12.y = (-1.0d);
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.x;
        boolean boolean63 = point60.equals((java.lang.Object) 10.0f);
        point60.x = 100.0d;
        java.lang.Double double66 = point60.x;
        Point point69 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point69.x = 100.0d;
        boolean boolean72 = point60.equals((java.lang.Object) 100.0d);
        java.lang.Double double73 = point60.y;
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        point76.y = 1.0d;
        point76.x = 100.0d;
        java.lang.Double double82 = point76.x;
        boolean boolean83 = point60.equals((java.lang.Object) point76);
        java.lang.Double double84 = point60.x;
        java.lang.Class<?> wildcardClass85 = point60.getClass();
        boolean boolean86 = point12.equals((java.lang.Object) wildcardClass85);
        java.lang.Double double87 = point12.x;
        Line line88 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        java.lang.Double double15 = point5.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point18.x = 0.0d;
        point18.y = 1.0d;
        java.lang.Double double23 = point18.x;
        point18.x = 0.0d;
        java.lang.Double double26 = point18.y;
        java.lang.Double double27 = point18.x;
        boolean boolean28 = point5.equals((java.lang.Object) point18);
        point18.y = 0.0d;
        java.lang.Double double31 = point18.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        java.lang.Double double38 = point34.y;
        java.lang.Object obj39 = new java.lang.Object();
        boolean boolean40 = point34.equals(obj39);
        java.lang.Double double41 = point34.y;
        point34.x = 1.0d;
        java.lang.Double double44 = point34.y;
        java.lang.Double double45 = point34.y;
        point34.x = 10.0d;
        java.lang.Double double48 = point34.y;
        java.lang.Object obj49 = null;
        boolean boolean50 = point34.equals(obj49);
        Line line51 = new Line(point18, point34);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
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
        Point point21 = null;
        Line line22 = new Line(point5, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
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
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 0.0d;
        java.lang.Double double53 = point50.x;
        point50.x = (-1.0d);
        Line line56 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
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
        point2.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        Line line34 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        java.lang.Double double18 = point11.y;
        point11.y = 0.0d;
        java.lang.Double double21 = point11.x;
        java.lang.Object obj22 = null;
        boolean boolean23 = point11.equals(obj22);
        Line line24 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 1.0d;
        point6.y = (-1.0d);
        boolean boolean11 = point2.equals((java.lang.Object) point6);
        java.lang.Double double12 = point2.x;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        java.lang.Double double21 = point15.y;
        java.lang.Double double22 = point15.y;
        java.lang.Double double23 = point15.y;
        java.lang.Double double24 = point15.x;
        point15.y = 100.0d;
        Line line27 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        point2.y = 1.0d;
        point2.y = (-1.0d);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point11.y = (-1.0d);
        java.lang.Double double14 = point11.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        java.lang.Double double23 = point17.x;
        point17.y = 1.0d;
        boolean boolean26 = point11.equals((java.lang.Object) point17);
        point17.x = 1.0d;
        java.lang.Double double29 = point17.x;
        java.lang.Double double30 = point17.y;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.y;
        java.lang.Double double36 = point33.x;
        java.lang.Double double37 = point33.y;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 100.0d;
        point40.y = (-1.0d);
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 1.0d;
        point50.y = (-1.0d);
        java.lang.Double double55 = point50.x;
        java.lang.Double double56 = point50.x;
        point50.y = 1.0d;
        boolean boolean59 = point40.equals((java.lang.Object) point50);
        point50.y = (-1.0d);
        point50.x = (-1.0d);
        java.lang.Double double64 = point50.x;
        java.lang.Double double65 = point50.x;
        java.lang.Double double66 = point50.x;
        boolean boolean67 = point33.equals((java.lang.Object) double66);
        java.lang.Double double68 = point33.y;
        point33.x = 100.0d;
        Point point73 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        point73.y = 100.0d;
        boolean boolean76 = point33.equals((java.lang.Object) point73);
        boolean boolean77 = point17.equals((java.lang.Object) point73);
        Line line78 = new Line(point2, point73);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        boolean boolean13 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.y;
        java.lang.Double double21 = point17.x;
        point17.x = 1.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        java.lang.Double double30 = point26.y;
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = point26.equals(obj31);
        java.lang.Double double33 = point26.y;
        point26.x = 1.0d;
        boolean boolean36 = point17.equals((java.lang.Object) point26);
        Point point39 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean40 = point26.equals((java.lang.Object) point39);
        java.lang.Double double41 = point39.x;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point44.x = 0.0d;
        point44.y = 1.0d;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        boolean boolean52 = point44.equals((java.lang.Object) (-1.0d));
        boolean boolean53 = point39.equals((java.lang.Object) boolean52);
        java.lang.Double double54 = point39.x;
        Line line55 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        java.lang.Double double13 = point9.y;
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = point9.equals(obj14);
        java.lang.Double double16 = point9.y;
        point9.y = 100.0d;
        java.lang.Double double19 = point9.y;
        point9.y = 1.0d;
        Line line22 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
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
        Point point84 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double85 = point84.y;
        point84.y = 1.0d;
        java.lang.Double double88 = point84.y;
        java.lang.Object obj89 = new java.lang.Object();
        boolean boolean90 = point84.equals(obj89);
        point84.x = 1.0d;
        point84.y = 0.0d;
        java.lang.Double double95 = point84.y;
        point84.y = 1.0d;
        Line line98 = new Line(point20, point84);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
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
        point2.y = 0.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 0.0d;
        point28.y = 1.0d;
        point28.y = 1.0d;
        java.lang.Class<?> wildcardClass39 = point28.getClass();
        boolean boolean40 = point2.equals((java.lang.Object) point28);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point43.x = 1.0d;
        point43.y = 1.0d;
        java.lang.Double double48 = point43.x;
        point43.x = (-1.0d);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 100.0d;
        point53.x = 10.0d;
        java.lang.Double double61 = point53.y;
        boolean boolean62 = point43.equals((java.lang.Object) double61);
        point43.y = 0.0d;
        point43.y = 10.0d;
        Line line67 = new Line(point28, point43);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
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
        point11.y = 0.0d;
        java.lang.Double double23 = point11.y;
        java.lang.Double double24 = point11.y;
        java.lang.Double double25 = point11.x;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 0.0d;
        point28.y = 1.0d;
        java.lang.Double double37 = point28.y;
        point28.x = 1.0d;
        Line line40 = new Line(point11, point28);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
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
        point2.y = (-1.0d);
        java.lang.Double double20 = point2.y;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 100.0d;
        point23.y = 100.0d;
        java.lang.Double double31 = point23.y;
        point23.y = 100.0d;
        java.lang.Double double34 = point23.y;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 1.0d;
        java.lang.Object obj43 = null;
        boolean boolean44 = point37.equals(obj43);
        point37.x = 1.0d;
        boolean boolean48 = point37.equals((java.lang.Object) false);
        java.lang.Double double49 = point37.x;
        point37.y = (-1.0d);
        point37.x = 1.0d;
        java.lang.Double double54 = point37.x;
        boolean boolean55 = point23.equals((java.lang.Object) point37);
        Line line56 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
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
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.x;
        java.lang.Double double31 = point29.y;
        java.lang.Double double32 = point29.y;
        point29.y = (-1.0d);
        java.lang.Class<?> wildcardClass35 = point29.getClass();
        boolean boolean36 = point2.equals((java.lang.Object) wildcardClass35);
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        java.lang.Double double42 = point39.x;
        java.lang.Double double43 = point39.x;
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.y;
        point46.y = 10.0d;
        java.lang.Double double53 = point46.y;
        point46.x = 0.0d;
        Point point58 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.x;
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point62.y = 1.0d;
        point62.y = (-1.0d);
        boolean boolean67 = point58.equals((java.lang.Object) point62);
        boolean boolean68 = point46.equals((java.lang.Object) point62);
        Point point71 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point71.y = 0.0d;
        java.lang.Double double74 = point71.y;
        java.lang.Double double75 = point71.x;
        Point point78 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point81 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point81.x = 1.0d;
        point81.y = 1.0d;
        boolean boolean86 = point78.equals((java.lang.Object) 1.0d);
        java.lang.Double double87 = point78.y;
        java.lang.Double double88 = point78.y;
        java.lang.Double double89 = point78.x;
        java.lang.Double double90 = point78.y;
        boolean boolean91 = point71.equals((java.lang.Object) double90);
        boolean boolean92 = point46.equals((java.lang.Object) double90);
        java.lang.Double double93 = point46.x;
        point46.y = 0.0d;
        boolean boolean96 = point39.equals((java.lang.Object) 0.0d);
        java.lang.Double double97 = point39.y;
        Line line98 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        point2.x = 100.0d;
        point2.y = 10.0d;
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
        point11.y = (-1.0d);
        point11.x = (-1.0d);
        java.lang.Double double35 = point11.y;
        point11.y = (-1.0d);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        boolean boolean47 = point11.equals((java.lang.Object) boolean46);
        point11.x = 0.0d;
        Line line50 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
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
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 0.0d;
        point19.y = (-1.0d);
        point19.y = 100.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.x = 10.0d;
        java.lang.Double double36 = point28.y;
        boolean boolean37 = point19.equals((java.lang.Object) point28);
        point28.y = 1.0d;
        boolean boolean40 = point2.equals((java.lang.Object) 1.0d);
        Point point41 = null;
        Line line42 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
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
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point58.x = 1.0d;
        point58.y = 1.0d;
        point58.y = (-1.0d);
        point58.y = 10.0d;
        point58.y = 1.0d;
        java.lang.Double double69 = point58.x;
        java.lang.Double double70 = point58.y;
        java.lang.Double double71 = point58.x;
        java.lang.Double double72 = point58.x;
        java.lang.Double double73 = point58.y;
        boolean boolean74 = point15.equals((java.lang.Object) point58);
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point77.x = 0.0d;
        Line line80 = new Line(point15, point77);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean14 = point5.equals((java.lang.Object) double13);
        java.lang.Double double15 = point5.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point18.x = 0.0d;
        point18.y = 1.0d;
        java.lang.Double double23 = point18.x;
        point18.x = 0.0d;
        java.lang.Double double26 = point18.y;
        java.lang.Double double27 = point18.x;
        boolean boolean28 = point5.equals((java.lang.Object) point18);
        java.lang.Double double29 = point18.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 100.0d;
        point32.x = 10.0d;
        point32.y = 10.0d;
        java.lang.Double double42 = point32.y;
        Line line43 = new Line(point18, point32);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point5.equals((java.lang.Object) boolean24);
        java.lang.Double double26 = point5.x;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point29.equals((java.lang.Object) point32);
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass40 = point39.getClass();
        boolean boolean41 = point32.equals((java.lang.Object) wildcardClass40);
        Point point44 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        boolean boolean47 = point32.equals((java.lang.Object) point44);
        java.lang.Class<?> wildcardClass48 = point32.getClass();
        boolean boolean49 = point5.equals((java.lang.Object) wildcardClass48);
        java.lang.Double double50 = point5.y;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point53.x = 100.0d;
        Point point58 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        boolean boolean64 = point61.equals((java.lang.Object) 1L);
        java.lang.Double double65 = point61.y;
        boolean boolean66 = point58.equals((java.lang.Object) double65);
        Point point69 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point69.y = 1.0d;
        point69.y = (-1.0d);
        point69.y = 100.0d;
        Point point78 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass79 = point78.getClass();
        boolean boolean80 = point69.equals((java.lang.Object) point78);
        boolean boolean81 = point58.equals((java.lang.Object) point78);
        java.lang.Double double82 = point58.y;
        boolean boolean83 = point53.equals((java.lang.Object) point58);
        Line line84 = new Line(point5, point58);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point2.y = (-1.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = point2.equals(obj5);
        point2.x = 100.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point11.y = 10.0d;
        point11.y = 10.0d;
        point11.x = 1.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point20.x = 1.0d;
        point20.y = 1.0d;
        java.lang.Double double25 = point20.x;
        point20.x = (-1.0d);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 100.0d;
        point30.x = 10.0d;
        java.lang.Double double38 = point30.y;
        boolean boolean39 = point20.equals((java.lang.Object) double38);
        point20.y = 0.0d;
        java.lang.Double double42 = point20.y;
        java.lang.Double double43 = point20.y;
        Point point46 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.x;
        java.lang.Double double48 = point46.y;
        java.lang.Double double49 = point46.y;
        point46.x = 100.0d;
        java.lang.Class<?> wildcardClass52 = point46.getClass();
        boolean boolean53 = point20.equals((java.lang.Object) wildcardClass52);
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point56.y = 0.0d;
        java.lang.Double double59 = point56.y;
        java.lang.Double double60 = point56.x;
        Point point63 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double64 = point63.y;
        java.lang.Double double65 = point63.y;
        boolean boolean66 = point56.equals((java.lang.Object) point63);
        boolean boolean67 = point20.equals((java.lang.Object) point56);
        java.lang.Double double68 = point56.x;
        java.lang.Double double69 = point56.y;
        Point point72 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point75.x = 1.0d;
        point75.x = 1.0d;
        boolean boolean80 = point72.equals((java.lang.Object) 1.0d);
        boolean boolean81 = point56.equals((java.lang.Object) point72);
        boolean boolean82 = point11.equals((java.lang.Object) point72);
        point11.y = 100.0d;
        Line line85 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        point2.x = 1.0d;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point13.y = 10.0d;
        boolean boolean16 = point2.equals((java.lang.Object) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        java.lang.Double double25 = point19.x;
        point19.x = 1.0d;
        boolean boolean28 = point2.equals((java.lang.Object) 1.0d);
        point2.y = 1.0d;
        Point point33 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        point33.y = 100.0d;
        point33.y = (-1.0d);
        point33.x = 0.0d;
        point33.y = 0.0d;
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point45.y = 1.0d;
        point45.y = (-1.0d);
        java.lang.Double double50 = point45.y;
        java.lang.Double double51 = point45.y;
        point45.y = 1.0d;
        point45.y = 1.0d;
        point45.x = 100.0d;
        java.lang.Double double58 = point45.y;
        boolean boolean59 = point33.equals((java.lang.Object) double58);
        point33.x = (-1.0d);
        point33.x = (-1.0d);
        point33.y = 1.0d;
        Line line66 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        java.lang.Double double17 = point11.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        point11.x = 1.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.x;
        point28.x = 1.0d;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        java.lang.Double double41 = point37.y;
        java.lang.Object obj42 = new java.lang.Object();
        boolean boolean43 = point37.equals(obj42);
        java.lang.Double double44 = point37.y;
        point37.x = 1.0d;
        boolean boolean47 = point28.equals((java.lang.Object) point37);
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point50.y = 10.0d;
        point50.y = 10.0d;
        boolean boolean55 = point37.equals((java.lang.Object) point50);
        boolean boolean56 = point11.equals((java.lang.Object) boolean55);
        point11.y = 0.0d;
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point61.x = 0.0d;
        java.lang.Double double64 = point61.x;
        java.lang.Double double65 = point61.y;
        point61.x = 100.0d;
        boolean boolean68 = point11.equals((java.lang.Object) point61);
        Line line69 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double12 = point11.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point15.x = 1.0d;
        point15.y = 1.0d;
        point15.y = (-1.0d);
        boolean boolean22 = point11.equals((java.lang.Object) point15);
        java.lang.Double double23 = point15.x;
        point15.x = 0.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.x;
        java.lang.Double double36 = point28.y;
        point28.x = (-1.0d);
        point28.y = 100.0d;
        point28.y = 10.0d;
        boolean boolean43 = point15.equals((java.lang.Object) 10.0d);
        Line line44 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
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
        point2.y = 0.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 1.0d;
        point23.y = 0.0d;
        java.lang.Double double31 = point23.y;
        java.lang.Double double32 = point23.y;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point35.y = 0.0d;
        java.lang.Double double38 = point35.x;
        java.lang.Double double39 = point35.x;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point42.y = 1.0d;
        java.lang.Double double45 = point42.y;
        java.lang.Double double46 = point42.y;
        point42.y = 10.0d;
        java.lang.Double double49 = point42.y;
        point42.x = 0.0d;
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double55 = point54.x;
        Point point58 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point58.y = 1.0d;
        point58.y = (-1.0d);
        boolean boolean63 = point54.equals((java.lang.Object) point58);
        boolean boolean64 = point42.equals((java.lang.Object) point58);
        Point point67 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point67.y = 0.0d;
        java.lang.Double double70 = point67.y;
        java.lang.Double double71 = point67.x;
        Point point74 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point77.x = 1.0d;
        point77.y = 1.0d;
        boolean boolean82 = point74.equals((java.lang.Object) 1.0d);
        java.lang.Double double83 = point74.y;
        java.lang.Double double84 = point74.y;
        java.lang.Double double85 = point74.x;
        java.lang.Double double86 = point74.y;
        boolean boolean87 = point67.equals((java.lang.Object) double86);
        boolean boolean88 = point42.equals((java.lang.Object) double86);
        java.lang.Double double89 = point42.x;
        point42.y = 0.0d;
        boolean boolean92 = point35.equals((java.lang.Object) 0.0d);
        java.lang.Double double93 = point35.y;
        point35.y = (-1.0d);
        java.lang.Double double96 = point35.y;
        boolean boolean97 = point23.equals((java.lang.Object) point35);
        Line line98 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        java.lang.Class<?> wildcardClass8 = point6.getClass();
        boolean boolean9 = point2.equals((java.lang.Object) wildcardClass8);
        point2.x = 0.0d;
        java.lang.Double double12 = point2.x;
        point2.y = (-1.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 100.0d;
        java.lang.Double double23 = point17.y;
        point17.y = 100.0d;
        point17.x = (-1.0d);
        point17.x = 100.0d;
        java.lang.Double double30 = point17.y;
        point17.y = 100.0d;
        point17.y = 10.0d;
        Line line35 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Object obj6 = null;
        boolean boolean7 = point2.equals(obj6);
        Point point8 = null;
        Line line9 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        java.lang.Double double15 = point9.y;
        point9.y = 100.0d;
        point9.x = (-1.0d);
        java.lang.Double double20 = point9.x;
        boolean boolean21 = point2.equals((java.lang.Object) point9);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point24.y = (-1.0d);
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.x;
        point24.y = (-1.0d);
        java.lang.Double double31 = point24.y;
        Line line32 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double6 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.y;
        java.lang.Double double16 = point13.x;
        point13.x = 0.0d;
        java.lang.Double double19 = point13.y;
        boolean boolean20 = point2.equals((java.lang.Object) point13);
        point2.y = 10.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        java.lang.Double double29 = point25.y;
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = point25.equals(obj30);
        java.lang.Double double32 = point25.y;
        point25.x = (-1.0d);
        point25.x = (-1.0d);
        java.lang.Double double37 = point25.x;
        java.lang.Double double38 = point25.y;
        java.lang.Double double39 = point25.x;
        Line line40 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.x = 10.0d;
        point2.y = 100.0d;
        point2.y = (-1.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.y;
        boolean boolean23 = point17.equals((java.lang.Object) point20);
        java.lang.Double double24 = point20.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean29 = point20.equals((java.lang.Object) double28);
        java.lang.Double double30 = point20.x;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point33.x = 0.0d;
        point33.y = 1.0d;
        java.lang.Double double38 = point33.x;
        point33.x = 0.0d;
        java.lang.Double double41 = point33.y;
        java.lang.Double double42 = point33.x;
        boolean boolean43 = point20.equals((java.lang.Object) point33);
        point33.y = 0.0d;
        Line line46 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        point2.y = 0.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        java.lang.Double double19 = point16.x;
        point16.y = 1.0d;
        point16.x = 0.0d;
        boolean boolean24 = point2.equals((java.lang.Object) point16);
        point2.y = 100.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.x;
        boolean boolean32 = point29.equals((java.lang.Object) 10.0f);
        point29.x = 100.0d;
        java.lang.Double double35 = point29.x;
        point29.y = 1.0d;
        Point point40 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double41 = point40.y;
        point40.y = 10.0d;
        point40.y = (-1.0d);
        java.lang.Class<?> wildcardClass46 = point40.getClass();
        boolean boolean47 = point29.equals((java.lang.Object) wildcardClass46);
        java.lang.Double double48 = point29.y;
        point29.y = 100.0d;
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point53.y = 0.0d;
        java.lang.Double double56 = point53.y;
        java.lang.Double double57 = point53.x;
        point53.x = 1.0d;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        point62.y = 1.0d;
        java.lang.Double double66 = point62.y;
        java.lang.Object obj67 = new java.lang.Object();
        boolean boolean68 = point62.equals(obj67);
        java.lang.Double double69 = point62.y;
        point62.x = 1.0d;
        boolean boolean72 = point53.equals((java.lang.Object) point62);
        Point point75 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean76 = point62.equals((java.lang.Object) point75);
        java.lang.Double double77 = point75.x;
        boolean boolean78 = point29.equals((java.lang.Object) double77);
        java.lang.Double double79 = point29.x;
        boolean boolean80 = point2.equals((java.lang.Object) point29);
        Point point83 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point86 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point86.x = 1.0d;
        point86.y = 1.0d;
        boolean boolean91 = point83.equals((java.lang.Object) 1.0d);
        java.lang.Double double92 = point83.y;
        java.lang.Double double93 = point83.x;
        java.lang.Double double94 = point83.x;
        point83.x = (-1.0d);
        Line line97 = new Line(point29, point83);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.x;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        java.lang.Double double29 = point19.x;
        point19.x = 10.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point34.x = 1.0d;
        point34.y = 1.0d;
        point34.y = (-1.0d);
        point34.y = 10.0d;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.x;
        java.lang.Double double48 = point45.x;
        point45.y = 0.0d;
        boolean boolean52 = point45.equals((java.lang.Object) '#');
        point45.x = 0.0d;
        point45.y = 100.0d;
        java.lang.Double double57 = point45.x;
        boolean boolean58 = point34.equals((java.lang.Object) double57);
        java.lang.Class<?> wildcardClass59 = point34.getClass();
        boolean boolean60 = point19.equals((java.lang.Object) point34);
        Line line61 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
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
        point2.y = 100.0d;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point22.y = 1.0d;
        point22.y = (-1.0d);
        java.lang.Double double27 = point22.y;
        point22.y = 100.0d;
        java.lang.Double double30 = point22.x;
        java.lang.Double double31 = point22.y;
        java.lang.Double double32 = point22.y;
        Line line33 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        boolean boolean13 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Double double14 = point2.y;
        point2.y = 10.0d;
        Point point19 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        java.lang.Double double30 = point26.y;
        java.lang.Object obj31 = new java.lang.Object();
        boolean boolean32 = point26.equals(obj31);
        java.lang.Double double33 = point26.y;
        java.lang.Class<?> wildcardClass34 = point26.getClass();
        boolean boolean35 = point22.equals((java.lang.Object) point26);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point38.y = 100.0d;
        point38.y = 0.0d;
        boolean boolean43 = point22.equals((java.lang.Object) 0.0d);
        boolean boolean44 = point19.equals((java.lang.Object) point22);
        boolean boolean45 = point2.equals((java.lang.Object) point19);
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.x;
        java.lang.Double double51 = point48.x;
        point48.y = 0.0d;
        boolean boolean55 = point48.equals((java.lang.Object) '#');
        point48.x = 0.0d;
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point60.y = 0.0d;
        java.lang.Double double63 = point60.y;
        point60.x = 100.0d;
        point60.x = 100.0d;
        boolean boolean68 = point48.equals((java.lang.Object) point60);
        point60.y = 1.0d;
        Line line71 = new Line(point2, point60);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
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
        point15.y = 0.0d;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        point61.x = 100.0d;
        java.lang.Double double67 = point61.y;
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point70.y = 0.0d;
        java.lang.Double double73 = point70.y;
        java.lang.Double double74 = point70.x;
        boolean boolean75 = point61.equals((java.lang.Object) double74);
        point61.x = (-1.0d);
        Line line78 = new Line(point15, point61);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.x;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        java.lang.Double double13 = point9.y;
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = point9.equals(obj14);
        java.lang.Double double16 = point9.y;
        java.lang.Class<?> wildcardClass17 = point9.getClass();
        boolean boolean18 = point5.equals((java.lang.Object) point9);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point21.y = 100.0d;
        point21.y = 0.0d;
        boolean boolean26 = point5.equals((java.lang.Object) 0.0d);
        point5.y = 100.0d;
        boolean boolean29 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double30 = point2.x;
        point2.y = 10.0d;
        Point point35 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        java.lang.Double double37 = point35.y;
        java.lang.Double double38 = point35.x;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 0.0d);
        boolean boolean45 = point35.equals((java.lang.Object) point41);
        java.lang.Double double46 = point41.y;
        java.lang.Double double47 = point41.x;
        Line line48 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        point2.x = 1.0d;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point24.x = 100.0d;
        boolean boolean27 = point15.equals((java.lang.Object) 100.0d);
        java.lang.Double double28 = point15.y;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point34.x = 1.0d;
        point34.y = 1.0d;
        boolean boolean39 = point31.equals((java.lang.Object) 1.0d);
        java.lang.Double double40 = point31.y;
        point31.x = 0.0d;
        boolean boolean43 = point15.equals((java.lang.Object) 0.0d);
        point15.x = 100.0d;
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        java.lang.Double double50 = point48.y;
        java.lang.Double double51 = point48.y;
        java.lang.Double double52 = point48.y;
        boolean boolean53 = point15.equals((java.lang.Object) point48);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point56.x = 1.0d;
        point56.y = (-1.0d);
        Point point63 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double64 = point63.y;
        point63.y = 10.0d;
        boolean boolean67 = point56.equals((java.lang.Object) 10.0d);
        java.lang.Double double68 = point56.y;
        java.lang.Double double69 = point56.y;
        boolean boolean70 = point15.equals((java.lang.Object) double69);
        Line line71 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        point2.y = 0.0d;
        point2.x = (-1.0d);
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.y;
        point18.y = 1.0d;
        point18.y = 100.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj32 = null;
        boolean boolean33 = point31.equals(obj32);
        boolean boolean34 = point18.equals((java.lang.Object) point31);
        point18.x = 100.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        boolean boolean45 = point39.equals((java.lang.Object) point42);
        java.lang.Double double46 = point42.x;
        boolean boolean47 = point18.equals((java.lang.Object) point42);
        java.lang.Double double48 = point18.y;
        Line line49 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.x = (-1.0d);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        point19.x = 0.0d;
        boolean boolean22 = point2.equals((java.lang.Object) point19);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.x;
        boolean boolean28 = point25.equals((java.lang.Object) 10.0f);
        point25.x = 100.0d;
        java.lang.Double double31 = point25.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 100.0d;
        boolean boolean37 = point25.equals((java.lang.Object) 100.0d);
        java.lang.Double double38 = point25.y;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        boolean boolean49 = point41.equals((java.lang.Object) 1.0d);
        java.lang.Double double50 = point41.y;
        point41.x = 0.0d;
        boolean boolean53 = point25.equals((java.lang.Object) 0.0d);
        java.lang.Double double54 = point25.x;
        point25.y = (-1.0d);
        point25.y = 10.0d;
        Line line59 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
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
        point2.x = (-1.0d);
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point35.x = 0.0d;
        java.lang.Double double38 = point35.y;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point41.x = 100.0d;
        point41.y = 0.0d;
        point41.x = (-1.0d);
        point41.x = 1.0d;
        boolean boolean50 = point35.equals((java.lang.Object) point41);
        Line line51 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        java.lang.Double double16 = point12.y;
        boolean boolean17 = point9.equals((java.lang.Object) double16);
        point9.x = 10.0d;
        java.lang.Double double20 = point9.x;
        point9.y = 0.0d;
        point9.x = (-1.0d);
        Point point27 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.x;
        boolean boolean30 = point9.equals((java.lang.Object) double29);
        Line line31 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
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
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.x;
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point35.y = 1.0d;
        point35.y = (-1.0d);
        boolean boolean40 = point31.equals((java.lang.Object) point35);
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
        Point point71 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double72 = point71.x;
        java.lang.Double double73 = point71.y;
        java.lang.Double double74 = point71.y;
        point71.y = (-1.0d);
        boolean boolean77 = point48.equals((java.lang.Object) (-1.0d));
        Point point80 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point80.y = 1.0d;
        java.lang.Double double83 = point80.y;
        java.lang.Double double84 = point80.y;
        point80.y = 0.0d;
        point80.y = 1.0d;
        point80.y = 1.0d;
        boolean boolean91 = point48.equals((java.lang.Object) point80);
        point80.x = 10.0d;
        boolean boolean94 = point31.equals((java.lang.Object) point80);
        Line line95 = new Line(point20, point31);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
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
        point2.y = 1.0d;
        Point point45 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.x;
        java.lang.Double double47 = point45.y;
        java.lang.Double double48 = point45.y;
        point45.y = (-1.0d);
        point45.x = 0.0d;
        Line line53 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
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
        point2.x = (-1.0d);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.y;
        java.lang.Double double45 = point39.y;
        point39.y = 1.0d;
        point39.y = 100.0d;
        point39.y = 1.0d;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.x;
        boolean boolean57 = point54.equals((java.lang.Object) 10.0f);
        point54.x = 100.0d;
        java.lang.Double double60 = point54.x;
        point54.x = 0.0d;
        boolean boolean63 = point39.equals((java.lang.Object) point54);
        java.lang.Double double64 = point39.x;
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double68 = point67.y;
        point67.y = 1.0d;
        point67.x = 100.0d;
        java.lang.Double double73 = point67.y;
        point67.x = 10.0d;
        boolean boolean76 = point39.equals((java.lang.Object) point67);
        Line line77 = new Line(point2, point67);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
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
        java.lang.Double double22 = point2.x;
        point2.y = (-1.0d);
        Point point27 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double28 = point27.x;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        java.lang.Class<?> wildcardClass33 = point31.getClass();
        boolean boolean34 = point27.equals((java.lang.Object) wildcardClass33);
        java.lang.Double double35 = point27.y;
        boolean boolean36 = point2.equals((java.lang.Object) point27);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point39.x = 1.0d;
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double46 = point39.x;
        Line line47 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point8.y = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 1.0d;
        java.lang.Object obj19 = null;
        boolean boolean20 = point13.equals(obj19);
        point13.x = 1.0d;
        java.lang.Class<?> wildcardClass23 = point13.getClass();
        boolean boolean24 = point8.equals((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = point8.getClass();
        boolean boolean26 = point2.equals((java.lang.Object) point8);
        java.lang.Double double27 = point2.x;
        java.lang.Double double28 = point2.x;
        java.lang.Double double29 = point2.x;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.x;
        java.lang.Double double35 = point32.x;
        point32.y = 0.0d;
        boolean boolean39 = point32.equals((java.lang.Object) '#');
        point32.x = 10.0d;
        java.lang.Double double42 = point32.y;
        point32.x = 10.0d;
        Line line45 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
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
        java.lang.Double double51 = point16.x;
        Point point54 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point54.y = (-1.0d);
        Line line57 = new Line(point16, point54);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
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
        java.lang.Double double18 = point2.y;
        java.lang.Double double19 = point2.x;
        java.lang.Object obj20 = null;
        boolean boolean21 = point2.equals(obj20);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point24.y = (-1.0d);
        java.lang.Double double27 = point24.y;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        java.lang.Double double36 = point30.x;
        point30.y = 1.0d;
        boolean boolean39 = point24.equals((java.lang.Object) point30);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.x = 100.0d;
        point42.y = (-1.0d);
        point42.x = (-1.0d);
        boolean boolean52 = point24.equals((java.lang.Object) (-1.0d));
        Line line53 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        boolean boolean13 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double14 = point2.x;
        java.lang.Double double15 = point2.y;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        point18.y = (-1.0d);
        java.lang.Double double24 = point18.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.x;
        boolean boolean36 = point33.equals((java.lang.Object) 10.0f);
        point33.x = 100.0d;
        boolean boolean39 = point27.equals((java.lang.Object) 100.0d);
        boolean boolean40 = point18.equals((java.lang.Object) 100.0d);
        java.lang.Double double41 = point18.y;
        java.lang.Object obj42 = null;
        boolean boolean43 = point18.equals(obj42);
        Line line44 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
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
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        point25.y = 10.0d;
        point25.y = 10.0d;
        java.lang.Double double31 = point25.x;
        Line line32 = new Line(point13, point25);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
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
        Point point28 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean30 = point28.equals((java.lang.Object) (byte) 100);
        java.lang.Double double31 = point28.x;
        point28.x = (-1.0d);
        point28.x = 10.0d;
        Line line36 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        point2.x = 10.0d;
        java.lang.Double double14 = point2.y;
        point2.y = 100.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        java.lang.Object obj25 = null;
        boolean boolean26 = point19.equals(obj25);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point29.y = 0.0d;
        java.lang.Double double32 = point29.y;
        java.lang.Double double33 = point29.x;
        point29.x = 1.0d;
        boolean boolean36 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double37 = point19.y;
        java.lang.Double double38 = point19.x;
        java.lang.Double double39 = point19.x;
        point19.y = 10.0d;
        point19.y = 100.0d;
        point19.x = 10.0d;
        point19.x = 100.0d;
        Line line48 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
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
        java.lang.Double double19 = point9.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        point25.y = 10.0d;
        boolean boolean29 = point22.equals((java.lang.Object) point25);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        boolean boolean44 = point32.equals((java.lang.Object) 100.0d);
        boolean boolean45 = point25.equals((java.lang.Object) boolean44);
        java.lang.Double double46 = point25.x;
        point25.y = (-1.0d);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        java.lang.Double double55 = point51.y;
        java.lang.Object obj56 = new java.lang.Object();
        boolean boolean57 = point51.equals(obj56);
        java.lang.Double double58 = point51.y;
        point51.x = (-1.0d);
        point51.y = 0.0d;
        point51.x = 1.0d;
        boolean boolean65 = point25.equals((java.lang.Object) 1.0d);
        java.lang.Double double66 = point25.y;
        java.lang.Double double67 = point25.y;
        java.lang.Double double68 = point25.x;
        boolean boolean69 = point9.equals((java.lang.Object) point25);
        Point point72 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point72.x = 0.0d;
        point72.y = 1.0d;
        point72.y = 1.0d;
        point72.y = 100.0d;
        point72.x = (-1.0d);
        Line line83 = new Line(point9, point72);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double18 = point17.x;
        java.lang.Double double19 = point17.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 10.0d;
        boolean boolean26 = point17.equals((java.lang.Object) point22);
        point22.x = 1.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point31.x = 1.0d;
        point31.y = (-1.0d);
        java.lang.Double double36 = point31.y;
        point31.x = 10.0d;
        point31.y = 100.0d;
        java.lang.Double double41 = point31.y;
        boolean boolean42 = point22.equals((java.lang.Object) point31);
        point22.x = 100.0d;
        Line line45 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
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
        java.lang.Double double25 = point2.y;
        java.lang.Object obj26 = null;
        boolean boolean27 = point2.equals(obj26);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double31 = point30.x;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        java.lang.Double double36 = point34.y;
        java.lang.Double double37 = point34.x;
        boolean boolean38 = point30.equals((java.lang.Object) point34);
        Line line39 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
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
        java.lang.Double double18 = point2.y;
        java.lang.Double double19 = point2.x;
        point2.x = 1.0d;
        Point point24 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        point24.x = 1.0d;
        java.lang.Double double29 = point24.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point32.x = 1.0d;
        point32.y = 1.0d;
        java.lang.Double double37 = point32.x;
        point32.x = (-1.0d);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        point42.y = 1.0d;
        point42.x = 100.0d;
        point42.x = 10.0d;
        java.lang.Double double50 = point42.y;
        boolean boolean51 = point32.equals((java.lang.Object) double50);
        point32.y = 0.0d;
        java.lang.Double double54 = point32.y;
        java.lang.Double double55 = point32.y;
        boolean boolean56 = point24.equals((java.lang.Object) point32);
        java.lang.Double double57 = point24.x;
        Line line58 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point10.y = 1.0d;
        java.lang.Double double13 = point10.x;
        boolean boolean14 = point2.equals((java.lang.Object) double13);
        point2.y = 0.0d;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double26 = point19.x;
        point19.y = 0.0d;
        boolean boolean29 = point2.equals((java.lang.Object) 0.0d);
        point2.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        point34.y = (-1.0d);
        java.lang.Double double39 = point34.x;
        java.lang.Double double40 = point34.x;
        java.lang.Double double41 = point34.x;
        java.lang.Double double42 = point34.x;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        point45.y = 1.0d;
        point45.x = 1.0d;
        java.lang.Object obj51 = null;
        boolean boolean52 = point45.equals(obj51);
        Point point55 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point55.y = 0.0d;
        java.lang.Double double58 = point55.y;
        java.lang.Double double59 = point55.x;
        point55.x = 1.0d;
        boolean boolean62 = point45.equals((java.lang.Object) 1.0d);
        java.lang.Double double63 = point45.y;
        java.lang.Double double64 = point45.x;
        java.lang.Double double65 = point45.y;
        point45.y = 10.0d;
        boolean boolean68 = point34.equals((java.lang.Object) 10.0d);
        Line line69 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        java.lang.Double double25 = point21.y;
        boolean boolean26 = point18.equals((java.lang.Object) double25);
        java.lang.Double double27 = point18.y;
        point18.x = 1.0d;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        point32.y = (-1.0d);
        java.lang.Object obj38 = null;
        boolean boolean39 = point32.equals(obj38);
        point32.x = (-1.0d);
        point32.y = (-1.0d);
        point32.y = 100.0d;
        point32.x = 0.0d;
        boolean boolean48 = point18.equals((java.lang.Object) point32);
        boolean boolean49 = point2.equals((java.lang.Object) point32);
        point2.y = 1.0d;
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point57.x = 1.0d;
        point57.y = 1.0d;
        boolean boolean62 = point54.equals((java.lang.Object) 1.0d);
        java.lang.Double double63 = point54.y;
        java.lang.Double double64 = point54.x;
        point54.x = 10.0d;
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point69.x = 1.0d;
        point69.y = 1.0d;
        point69.y = (-1.0d);
        point69.y = 10.0d;
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double81 = point80.y;
        java.lang.Double double82 = point80.x;
        java.lang.Double double83 = point80.x;
        point80.y = 0.0d;
        boolean boolean87 = point80.equals((java.lang.Object) '#');
        point80.x = 0.0d;
        point80.y = 100.0d;
        java.lang.Double double92 = point80.x;
        boolean boolean93 = point69.equals((java.lang.Object) double92);
        java.lang.Class<?> wildcardClass94 = point69.getClass();
        boolean boolean95 = point54.equals((java.lang.Object) point69);
        Line line96 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
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
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.x;
        java.lang.Double double22 = point20.y;
        java.lang.Double double23 = point20.y;
        point20.y = 0.0d;
        java.lang.Double double26 = point20.y;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        boolean boolean44 = point32.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass45 = point32.getClass();
        boolean boolean46 = point29.equals((java.lang.Object) wildcardClass45);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        java.lang.Double double54 = point52.y;
        boolean boolean55 = point49.equals((java.lang.Object) point52);
        point49.x = 10.0d;
        boolean boolean58 = point29.equals((java.lang.Object) point49);
        point29.x = 10.0d;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        point63.y = 1.0d;
        java.lang.Double double67 = point63.y;
        java.lang.Object obj68 = new java.lang.Object();
        boolean boolean69 = point63.equals(obj68);
        point63.x = 1.0d;
        java.lang.Double double72 = point63.y;
        java.lang.Double double73 = point63.x;
        Point point76 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        Point point80 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double81 = point80.x;
        boolean boolean83 = point80.equals((java.lang.Object) 10.0f);
        point80.x = 100.0d;
        java.lang.Double double86 = point80.x;
        point80.y = 1.0d;
        point80.y = 1.0d;
        boolean boolean91 = point76.equals((java.lang.Object) point80);
        java.lang.Class<?> wildcardClass92 = point80.getClass();
        boolean boolean93 = point63.equals((java.lang.Object) point80);
        java.lang.Double double94 = point63.x;
        boolean boolean95 = point29.equals((java.lang.Object) double94);
        java.lang.Double double96 = point29.x;
        boolean boolean97 = point20.equals((java.lang.Object) double96);
        Line line98 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        java.lang.Double double11 = point2.x;
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
        boolean boolean40 = point2.equals((java.lang.Object) point14);
        point14.y = 100.0d;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double46 = point45.y;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point49.x = 1.0d;
        point49.y = 1.0d;
        point49.y = (-1.0d);
        boolean boolean56 = point45.equals((java.lang.Object) point49);
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double60 = point59.y;
        point59.y = 10.0d;
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point65.x = 1.0d;
        point65.y = 1.0d;
        java.lang.Double double70 = point65.x;
        point65.x = (-1.0d);
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double76 = point75.y;
        point75.y = 1.0d;
        point75.x = 100.0d;
        point75.x = 10.0d;
        java.lang.Double double83 = point75.y;
        boolean boolean84 = point65.equals((java.lang.Object) double83);
        point65.y = (-1.0d);
        java.lang.Double double87 = point65.x;
        java.lang.Double double88 = point65.x;
        java.lang.Double double89 = point65.x;
        java.lang.Class<?> wildcardClass90 = point65.getClass();
        boolean boolean91 = point59.equals((java.lang.Object) wildcardClass90);
        point59.y = 1.0d;
        boolean boolean94 = point45.equals((java.lang.Object) 1.0d);
        Line line95 = new Line(point14, point45);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Object obj5 = null;
        boolean boolean6 = point2.equals(obj5);
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point10.y = 100.0d;
        point10.y = (-1.0d);
        Line line15 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        point2.y = 0.0d;
        java.lang.Double double10 = point2.x;
        point2.x = 10.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        boolean boolean24 = point18.equals((java.lang.Object) 10.0d);
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        java.lang.Double double30 = point27.y;
        boolean boolean31 = point18.equals((java.lang.Object) point27);
        point27.y = 1.0d;
        point27.x = 100.0d;
        point27.x = 100.0d;
        Line line38 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
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
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        point53.y = (-1.0d);
        point53.y = 100.0d;
        point53.x = (-1.0d);
        java.lang.Double double62 = point53.x;
        java.lang.Double double63 = point53.x;
        point53.x = (-1.0d);
        Line line66 = new Line(point38, point53);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        point15.y = 10.0d;
        point15.y = (-1.0d);
        java.lang.Object obj21 = null;
        boolean boolean22 = point15.equals(obj21);
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        boolean boolean26 = point15.equals((java.lang.Object) 100.0d);
        java.lang.Double double27 = point15.x;
        Line line28 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        java.lang.Double double14 = point8.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point17.x = 100.0d;
        boolean boolean20 = point8.equals((java.lang.Object) 100.0d);
        java.lang.Double double21 = point8.y;
        java.lang.Double double22 = point8.y;
        java.lang.Double double23 = point8.y;
        Line line24 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
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
        point2.y = 100.0d;
        java.lang.Double double27 = point2.x;
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.y;
        point30.y = (-1.0d);
        point30.y = 0.0d;
        java.lang.Double double37 = point30.x;
        point30.y = 100.0d;
        point30.y = 10.0d;
        Line line42 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        java.lang.Double double5 = point2.x;
        point2.x = (-1.0d);
        point2.x = 10.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        java.lang.Double double14 = point2.x;
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
        boolean boolean37 = point29.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass38 = point29.getClass();
        boolean boolean39 = point18.equals((java.lang.Object) point29);
        java.lang.Double double40 = point18.x;
        Line line41 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        point2.x = 10.0d;
        point2.y = 0.0d;
        java.lang.Double double15 = point2.y;
        point2.y = 0.0d;
        point2.y = 10.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        boolean boolean28 = point25.equals((java.lang.Object) 1L);
        java.lang.Double double29 = point25.y;
        boolean boolean30 = point22.equals((java.lang.Object) double29);
        java.lang.Double double31 = point22.y;
        java.lang.Double double32 = point22.y;
        point22.x = 10.0d;
        point22.x = 1.0d;
        point22.x = (-1.0d);
        point22.x = (-1.0d);
        java.lang.Double double41 = point22.y;
        java.lang.Double double42 = point22.x;
        java.lang.Double double43 = point22.x;
        java.lang.Double double44 = point22.y;
        Line line45 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
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
        point8.x = 10.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point8.equals(obj22);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 0.0d;
        java.lang.Double double29 = point26.x;
        point26.x = 10.0d;
        point26.x = 0.0d;
        java.lang.Double double34 = point26.x;
        Line line35 = new Line(point8, point26);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        point2.x = (-1.0d);
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.y;
        java.lang.Double double17 = point14.x;
        point14.y = 1.0d;
        java.lang.Double double20 = point14.y;
        Line line21 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
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
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        boolean boolean31 = point28.equals((java.lang.Object) 1L);
        java.lang.Double double32 = point28.y;
        boolean boolean33 = point25.equals((java.lang.Object) double32);
        point25.x = 10.0d;
        java.lang.Double double36 = point25.x;
        point25.x = 10.0d;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        java.lang.Double double43 = point41.y;
        boolean boolean44 = point25.equals((java.lang.Object) double43);
        java.lang.Double double45 = point25.y;
        java.lang.Double double46 = point25.y;
        boolean boolean47 = point16.equals((java.lang.Object) double46);
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 1.0d;
        java.lang.Double double53 = point50.y;
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass57 = point56.getClass();
        boolean boolean58 = point50.equals((java.lang.Object) wildcardClass57);
        Point point61 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.y;
        boolean boolean67 = point64.equals((java.lang.Object) 1L);
        java.lang.Double double68 = point64.y;
        boolean boolean69 = point61.equals((java.lang.Object) double68);
        java.lang.Double double70 = point61.y;
        java.lang.Double double71 = point61.x;
        boolean boolean72 = point50.equals((java.lang.Object) point61);
        Line line73 = new Line(point16, point61);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }
}

