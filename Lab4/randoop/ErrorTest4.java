import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 100.0d;
        Point point9 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        java.lang.Double double20 = point13.y;
        java.lang.Class<?> wildcardClass21 = point13.getClass();
        boolean boolean22 = point9.equals((java.lang.Object) point13);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point25.y = 100.0d;
        point25.y = 0.0d;
        boolean boolean30 = point9.equals((java.lang.Object) 0.0d);
        java.lang.Double double31 = point9.y;
        java.lang.Double double32 = point9.x;
        boolean boolean33 = point2.equals((java.lang.Object) point9);
        Point point34 = null;
        Line line35 = new Line(point9, point34);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        point2.x = (-1.0d);
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        java.lang.Double double20 = point16.y;
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = point16.equals(obj21);
        point16.x = 1.0d;
        java.lang.Double double25 = point16.x;
        point16.y = 0.0d;
        point16.x = 1.0d;
        Line line30 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        point5.y = 1.0d;
        java.lang.Double double9 = point5.y;
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = point5.equals(obj10);
        java.lang.Double double12 = point5.y;
        point5.x = 10.0d;
        java.lang.Double double15 = point5.y;
        point5.y = 10.0d;
        point5.y = 10.0d;
        java.lang.Double double20 = point5.y;
        Line line21 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.x;
        boolean boolean17 = point14.equals((java.lang.Object) 10.0f);
        point14.x = 100.0d;
        java.lang.Double double20 = point14.x;
        point14.y = 1.0d;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        point25.y = 10.0d;
        point25.y = (-1.0d);
        java.lang.Class<?> wildcardClass31 = point25.getClass();
        boolean boolean32 = point14.equals((java.lang.Object) wildcardClass31);
        java.lang.Double double33 = point14.y;
        java.lang.Double double34 = point14.x;
        point14.y = (-1.0d);
        boolean boolean37 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double38 = point2.x;
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point41.x = 0.0d;
        point41.y = 1.0d;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        point48.x = 100.0d;
        point48.x = 10.0d;
        java.lang.Double double56 = point48.y;
        point48.y = 0.0d;
        java.lang.Double double59 = point48.x;
        boolean boolean60 = point41.equals((java.lang.Object) point48);
        point48.x = 100.0d;
        java.lang.Double double63 = point48.y;
        point48.y = 1.0d;
        java.lang.Double double66 = point48.x;
        Line line67 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
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
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        boolean boolean47 = point44.equals((java.lang.Object) 1L);
        java.lang.Double double48 = point44.y;
        boolean boolean49 = point41.equals((java.lang.Object) double48);
        point41.x = 10.0d;
        java.lang.Double double52 = point41.x;
        point41.x = 10.0d;
        java.lang.Double double55 = point41.x;
        point41.y = 10.0d;
        point41.y = 100.0d;
        java.lang.Double double60 = point41.y;
        point41.y = 1.0d;
        Line line63 = new Line(point23, point41);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        java.lang.Double double9 = point7.y;
        point7.x = (-1.0d);
        java.lang.Double double12 = point7.x;
        java.lang.Double double13 = point7.x;
        Line line14 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        point15.y = 0.0d;
        java.lang.Double double25 = point15.x;
        Line line26 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.x;
        boolean boolean13 = point10.equals((java.lang.Object) 10.0f);
        point10.x = 100.0d;
        java.lang.Double double16 = point10.x;
        point10.y = 1.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 10.0d;
        point21.y = (-1.0d);
        java.lang.Class<?> wildcardClass27 = point21.getClass();
        boolean boolean28 = point10.equals((java.lang.Object) wildcardClass27);
        java.lang.Double double29 = point10.y;
        point10.y = 100.0d;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        point34.x = 1.0d;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        java.lang.Double double47 = point43.y;
        java.lang.Object obj48 = new java.lang.Object();
        boolean boolean49 = point43.equals(obj48);
        java.lang.Double double50 = point43.y;
        point43.x = 1.0d;
        boolean boolean53 = point34.equals((java.lang.Object) point43);
        Point point56 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean57 = point43.equals((java.lang.Object) point56);
        java.lang.Double double58 = point56.x;
        boolean boolean59 = point10.equals((java.lang.Object) double58);
        java.lang.Double double60 = point10.y;
        Line line61 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        point2.x = (-1.0d);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean20 = point17.equals((java.lang.Object) 1L);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        boolean boolean26 = point23.equals((java.lang.Object) 10.0f);
        point23.x = 100.0d;
        boolean boolean29 = point17.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass30 = point17.getClass();
        boolean boolean31 = point14.equals((java.lang.Object) wildcardClass30);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        java.lang.Double double39 = point37.y;
        boolean boolean40 = point34.equals((java.lang.Object) point37);
        point34.x = 10.0d;
        boolean boolean43 = point14.equals((java.lang.Object) point34);
        point14.x = 10.0d;
        point14.y = 100.0d;
        point14.x = (-1.0d);
        java.lang.Double double50 = point14.x;
        Line line51 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
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
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.y;
        point19.x = 0.0d;
        java.lang.Class<?> wildcardClass24 = point19.getClass();
        boolean boolean25 = point2.equals((java.lang.Object) wildcardClass24);
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
        java.lang.Double double49 = point28.x;
        java.lang.Double double50 = point28.y;
        point28.y = 1.0d;
        Line line53 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
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
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.x;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean26 = point24.equals((java.lang.Object) true);
        boolean boolean27 = point19.equals((java.lang.Object) true);
        java.lang.Double double28 = point19.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.y = 0.0d;
        boolean boolean37 = point19.equals((java.lang.Object) point31);
        point31.x = 1.0d;
        point31.y = (-1.0d);
        Line line42 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
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
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        java.lang.Double double34 = point28.y;
        java.lang.Double double35 = point28.y;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double39 = point38.y;
        boolean boolean40 = point28.equals((java.lang.Object) point38);
        point38.y = 0.0d;
        point38.y = 0.0d;
        Line line45 = new Line(point11, point38);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
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
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point42.x = 1.0d;
        point42.y = 1.0d;
        boolean boolean47 = point37.equals((java.lang.Object) point42);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point50.x = 0.0d;
        point50.x = 1.0d;
        java.lang.Class<?> wildcardClass55 = point50.getClass();
        boolean boolean56 = point42.equals((java.lang.Object) point50);
        java.lang.Object obj57 = null;
        boolean boolean58 = point42.equals(obj57);
        Line line59 = new Line(point6, point42);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
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
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean32 = point30.equals((java.lang.Object) true);
        java.lang.Double double33 = point30.x;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        point36.y = (-1.0d);
        java.lang.Double double41 = point36.y;
        java.lang.Double double42 = point36.y;
        java.lang.Double double43 = point36.y;
        point36.y = 10.0d;
        java.lang.Double double46 = point36.x;
        boolean boolean47 = point30.equals((java.lang.Object) double46);
        Line line48 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 10.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point14.x = 1.0d;
        point14.y = 1.0d;
        java.lang.Double double19 = point14.x;
        point14.x = (-1.0d);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 100.0d;
        point24.x = 10.0d;
        java.lang.Double double32 = point24.y;
        boolean boolean33 = point14.equals((java.lang.Object) double32);
        point14.y = (-1.0d);
        java.lang.Double double36 = point14.x;
        point14.y = 1.0d;
        boolean boolean39 = point2.equals((java.lang.Object) 1.0d);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        point42.y = (-1.0d);
        java.lang.Double double48 = point42.y;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point51.x = 100.0d;
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        point56.y = 1.0d;
        point56.x = 1.0d;
        java.lang.Double double62 = point56.y;
        java.lang.Double double63 = point56.y;
        point56.x = 10.0d;
        boolean boolean66 = point51.equals((java.lang.Object) point56);
        boolean boolean67 = point42.equals((java.lang.Object) point56);
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.y;
        point70.y = 1.0d;
        point70.x = 1.0d;
        boolean boolean77 = point70.equals((java.lang.Object) 'a');
        point70.x = 10.0d;
        boolean boolean80 = point56.equals((java.lang.Object) 10.0d);
        java.lang.Double double81 = point56.y;
        boolean boolean82 = point2.equals((java.lang.Object) double81);
        point2.x = 1.0d;
        java.lang.Double double85 = point2.x;
        java.lang.Double double86 = point2.x;
        Point point89 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point89.x = 0.0d;
        point89.y = 1.0d;
        point89.x = 1.0d;
        point89.x = 0.0d;
        Line line98 = new Line(point2, point89);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.x = 10.0d;
        point2.y = 10.0d;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        java.lang.Double double21 = point19.y;
        java.lang.Double double22 = point19.y;
        point19.y = (-1.0d);
        point19.x = 0.0d;
        point19.y = 10.0d;
        Point point31 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double32 = point31.x;
        point31.x = 100.0d;
        point31.x = (-1.0d);
        boolean boolean37 = point19.equals((java.lang.Object) (-1.0d));
        Line line38 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
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
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean36 = point29.equals((java.lang.Object) point32);
        point29.y = 0.0d;
        java.lang.Double double39 = point29.x;
        java.lang.Double double40 = point29.y;
        point29.y = (-1.0d);
        boolean boolean43 = point2.equals((java.lang.Object) (-1.0d));
        Point point46 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point46.y = 1.0d;
        point46.y = (-1.0d);
        point46.y = 100.0d;
        point46.x = (-1.0d);
        point46.x = (-1.0d);
        Point point59 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double60 = point59.x;
        boolean boolean62 = point59.equals((java.lang.Object) 10.0f);
        point59.x = 100.0d;
        java.lang.Double double65 = point59.x;
        Point point68 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point68.x = 100.0d;
        boolean boolean71 = point59.equals((java.lang.Object) 100.0d);
        java.lang.Double double72 = point59.y;
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double76 = point75.y;
        point75.y = 1.0d;
        point75.x = 100.0d;
        java.lang.Double double81 = point75.x;
        boolean boolean82 = point59.equals((java.lang.Object) point75);
        boolean boolean83 = point46.equals((java.lang.Object) point75);
        java.lang.Double double84 = point75.x;
        Line line85 = new Line(point2, point75);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
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
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double44 = point43.x;
        java.lang.Double double45 = point43.y;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 10.0d;
        boolean boolean52 = point43.equals((java.lang.Object) point48);
        point48.x = 1.0d;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point57.x = 1.0d;
        point57.y = (-1.0d);
        java.lang.Double double62 = point57.y;
        point57.x = 10.0d;
        point57.y = 100.0d;
        java.lang.Double double67 = point57.y;
        boolean boolean68 = point48.equals((java.lang.Object) point57);
        point48.x = (-1.0d);
        Point point73 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double74 = point73.y;
        point73.y = 1.0d;
        java.lang.Double double77 = point73.y;
        java.lang.Object obj78 = new java.lang.Object();
        boolean boolean79 = point73.equals(obj78);
        java.lang.Double double80 = point73.y;
        point73.x = 10.0d;
        java.lang.Double double83 = point73.y;
        point73.y = 10.0d;
        point73.x = (-1.0d);
        java.lang.Class<?> wildcardClass88 = point73.getClass();
        boolean boolean89 = point48.equals((java.lang.Object) wildcardClass88);
        Line line90 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.y;
        point12.y = 0.0d;
        java.lang.Double double19 = point12.y;
        Point point22 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean24 = point22.equals((java.lang.Object) (byte) 100);
        java.lang.Double double25 = point22.x;
        point22.x = (-1.0d);
        point22.x = 10.0d;
        point22.y = (-1.0d);
        point22.x = 10.0d;
        boolean boolean34 = point12.equals((java.lang.Object) point22);
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point37.x = 0.0d;
        point37.y = 1.0d;
        java.lang.Double double42 = point37.x;
        java.lang.Double double43 = point37.x;
        boolean boolean44 = point12.equals((java.lang.Object) point37);
        Line line45 = new Line(point5, point12);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.x = 10.0d;
        java.lang.Double double17 = point9.y;
        point9.y = 0.0d;
        java.lang.Double double20 = point9.y;
        java.lang.Double double21 = point9.y;
        point9.y = (-1.0d);
        java.lang.Class<?> wildcardClass24 = point9.getClass();
        boolean boolean25 = point2.equals((java.lang.Object) point9);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point28.y = 10.0d;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        java.lang.Double double40 = point36.y;
        boolean boolean41 = point33.equals((java.lang.Object) double40);
        point33.x = 10.0d;
        java.lang.Double double44 = point33.x;
        point33.y = 0.0d;
        point33.x = (-1.0d);
        Point point51 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.x;
        boolean boolean54 = point33.equals((java.lang.Object) double53);
        boolean boolean55 = point28.equals((java.lang.Object) double53);
        point28.y = 10.0d;
        Line line58 = new Line(point9, point28);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point16.equals((java.lang.Object) double23);
        point16.x = 10.0d;
        java.lang.Double double27 = point16.x;
        point16.y = (-1.0d);
        java.lang.Double double30 = point16.y;
        java.lang.Double double31 = point16.y;
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
        java.lang.Double double59 = point34.y;
        java.lang.Double double60 = point34.y;
        boolean boolean61 = point16.equals((java.lang.Object) double60);
        Line line62 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
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
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        boolean boolean46 = point40.equals((java.lang.Object) point43);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point49.x = 1.0d;
        point49.y = 1.0d;
        java.lang.Double double54 = point49.x;
        java.lang.Double double55 = point49.y;
        point49.y = 1.0d;
        java.lang.Double double58 = point49.y;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point61.x = 1.0d;
        boolean boolean64 = point49.equals((java.lang.Object) 1.0d);
        boolean boolean65 = point43.equals((java.lang.Object) boolean64);
        Line line66 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.x = 1.0d;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
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
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean31 = point29.equals((java.lang.Object) true);
        boolean boolean32 = point24.equals((java.lang.Object) true);
        java.lang.Double double33 = point24.y;
        java.lang.Double double34 = point24.y;
        boolean boolean35 = point11.equals((java.lang.Object) double34);
        java.lang.Double double36 = point11.x;
        point11.x = 1.0d;
        point11.x = 0.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        java.lang.Double double46 = point43.y;
        java.lang.Double double47 = point43.y;
        point43.y = 0.0d;
        java.lang.Double double50 = point43.x;
        point43.y = 0.0d;
        point43.y = 1.0d;
        Line line55 = new Line(point11, point43);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
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
        Point point65 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double66 = point65.y;
        java.lang.Double double67 = point65.y;
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point70.y = 0.0d;
        java.lang.Double double73 = point70.y;
        point70.x = 100.0d;
        point70.x = 0.0d;
        boolean boolean78 = point65.equals((java.lang.Object) point70);
        Line line79 = new Line(point13, point65);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
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
        point2.y = 0.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        point36.y = (-1.0d);
        point36.y = 100.0d;
        java.lang.Double double43 = point36.x;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double47 = point46.x;
        java.lang.Double double48 = point46.y;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point51.y = 1.0d;
        java.lang.Double double54 = point51.y;
        java.lang.Double double55 = point51.y;
        java.lang.Double double56 = point51.y;
        boolean boolean57 = point46.equals((java.lang.Object) point51);
        point46.y = 0.0d;
        java.lang.Double double60 = point46.y;
        boolean boolean61 = point36.equals((java.lang.Object) double60);
        point36.y = 100.0d;
        Line line64 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
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
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point21.y = 0.0d;
        java.lang.Double double24 = point21.y;
        java.lang.Double double25 = point21.x;
        point21.x = 1.0d;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        java.lang.Double double34 = point30.y;
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = point30.equals(obj35);
        java.lang.Double double37 = point30.y;
        point30.x = 1.0d;
        boolean boolean40 = point21.equals((java.lang.Object) point30);
        Point point43 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean44 = point30.equals((java.lang.Object) point43);
        java.lang.Double double45 = point43.x;
        java.lang.Double double46 = point43.x;
        point43.y = 0.0d;
        java.lang.Double double49 = point43.y;
        point43.y = 1.0d;
        Line line52 = new Line(point2, point43);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
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
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point30.x = 0.0d;
        point30.x = 1.0d;
        point30.x = (-1.0d);
        point30.y = 0.0d;
        java.lang.Double double39 = point30.y;
        Line line40 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.x = 1.0d;
        point2.x = 0.0d;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.x;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean19 = point17.equals((java.lang.Object) true);
        boolean boolean20 = point12.equals((java.lang.Object) true);
        java.lang.Double double21 = point12.y;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.y = 0.0d;
        boolean boolean30 = point12.equals((java.lang.Object) point24);
        point24.x = 1.0d;
        java.lang.Double double33 = point24.y;
        java.lang.Double double34 = point24.y;
        point24.y = (-1.0d);
        Line line37 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
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
        point12.x = 1.0d;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point34.x = 0.0d;
        point34.y = (-1.0d);
        point34.y = 100.0d;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 100.0d;
        point43.x = 10.0d;
        java.lang.Double double51 = point43.y;
        boolean boolean52 = point34.equals((java.lang.Object) point43);
        point43.y = 1.0d;
        java.lang.Double double55 = point43.y;
        point43.y = (-1.0d);
        Point point60 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.y;
        java.lang.Double double62 = point60.x;
        java.lang.Double double63 = point60.x;
        point60.y = 0.0d;
        point60.y = 1.0d;
        point60.y = 100.0d;
        boolean boolean70 = point43.equals((java.lang.Object) 100.0d);
        Line line71 = new Line(point12, point43);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
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
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        java.lang.Double double23 = point20.y;
        java.lang.Double double24 = point20.y;
        java.lang.Double double25 = point20.x;
        java.lang.Double double26 = point20.y;
        point20.y = (-1.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        java.lang.Double double35 = point31.y;
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = point31.equals(obj36);
        point31.x = 1.0d;
        java.lang.Double double40 = point31.x;
        point31.y = 0.0d;
        java.lang.Class<?> wildcardClass43 = point31.getClass();
        boolean boolean44 = point20.equals((java.lang.Object) wildcardClass43);
        java.lang.Double double45 = point20.y;
        java.lang.Double double46 = point20.y;
        boolean boolean47 = point2.equals((java.lang.Object) double46);
        Point point50 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        boolean boolean59 = point56.equals((java.lang.Object) 1L);
        java.lang.Double double60 = point56.y;
        boolean boolean61 = point53.equals((java.lang.Object) double60);
        point53.x = 10.0d;
        java.lang.Double double64 = point53.x;
        point53.x = 10.0d;
        boolean boolean67 = point50.equals((java.lang.Object) point53);
        java.lang.Double double68 = point50.y;
        java.lang.Double double69 = point50.x;
        Point point72 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point72.y = 1.0d;
        point72.y = (-1.0d);
        java.lang.Double double77 = point72.y;
        java.lang.Double double78 = point72.y;
        point72.y = 1.0d;
        point72.y = 100.0d;
        java.lang.Double double83 = point72.x;
        Point point86 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point86.x = 0.0d;
        point86.y = 1.0d;
        point86.y = 100.0d;
        boolean boolean93 = point72.equals((java.lang.Object) point86);
        java.lang.Double double94 = point72.x;
        point72.y = 0.0d;
        boolean boolean97 = point50.equals((java.lang.Object) 0.0d);
        Line line98 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 1.0d;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.x;
        java.lang.Double double17 = point15.y;
        point15.y = (-1.0d);
        point15.y = 0.0d;
        java.lang.Double double22 = point15.x;
        java.lang.Double double23 = point15.x;
        boolean boolean24 = point2.equals((java.lang.Object) double23);
        java.lang.Double double25 = point2.y;
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
        point28.y = 0.0d;
        java.lang.Double double50 = point28.y;
        point28.y = 0.0d;
        point28.y = 1.0d;
        java.lang.Double double55 = point28.y;
        Line line56 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
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
        point2.x = 1.0d;
        Point point19 = null;
        Line line20 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Object obj13 = null;
        boolean boolean14 = point2.equals(obj13);
        point2.y = 0.0d;
        point2.y = 100.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 0.0d;
        boolean boolean28 = point21.equals((java.lang.Object) "");
        java.lang.Double double29 = point21.y;
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point32.x = 0.0d;
        point32.y = 1.0d;
        point32.y = 1.0d;
        java.lang.Double double39 = point32.x;
        point32.x = (-1.0d);
        java.lang.Double double42 = point32.y;
        boolean boolean43 = point21.equals((java.lang.Object) point32);
        Line line44 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        point2.x = (-1.0d);
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 1.0d;
        boolean boolean26 = point19.equals((java.lang.Object) 'a');
        point19.x = 10.0d;
        java.lang.Double double29 = point19.x;
        point19.y = (-1.0d);
        Line line32 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
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
        java.lang.Double double31 = point12.x;
        java.lang.Double double32 = point12.y;
        point12.y = 0.0d;
        java.lang.Double double35 = point12.y;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        java.lang.Double double44 = point38.x;
        point38.y = 1.0d;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point52.x = 1.0d;
        point52.y = 1.0d;
        boolean boolean57 = point49.equals((java.lang.Object) 1.0d);
        boolean boolean58 = point38.equals((java.lang.Object) 1.0d);
        Line line59 = new Line(point12, point38);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean22 = point20.equals((java.lang.Object) true);
        boolean boolean23 = point15.equals((java.lang.Object) true);
        java.lang.Double double24 = point15.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.y = 0.0d;
        boolean boolean33 = point15.equals((java.lang.Object) point27);
        point27.x = 1.0d;
        java.lang.Double double36 = point27.y;
        java.lang.Double double37 = point27.y;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        boolean boolean46 = point40.equals((java.lang.Object) point43);
        java.lang.Double double47 = point40.y;
        point40.y = 0.0d;
        boolean boolean50 = point27.equals((java.lang.Object) 0.0d);
        point27.y = 0.0d;
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point55.y = 1.0d;
        java.lang.Double double58 = point55.y;
        java.lang.Double double59 = point55.y;
        point55.y = 0.0d;
        point55.y = 1.0d;
        point55.y = 0.0d;
        Point point68 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        point68.y = 1.0d;
        point68.x = 100.0d;
        java.lang.Double double74 = point68.y;
        boolean boolean75 = point55.equals((java.lang.Object) point68);
        java.lang.Double double76 = point68.x;
        java.lang.Double double77 = point68.x;
        point68.y = (-1.0d);
        boolean boolean80 = point27.equals((java.lang.Object) (-1.0d));
        Line line81 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
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
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point27.x = 0.0d;
        point27.y = 1.0d;
        point27.y = 1.0d;
        point27.y = 100.0d;
        point27.y = 0.0d;
        java.lang.Double double38 = point27.y;
        Line line39 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
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
        point2.x = (-1.0d);
        java.lang.Double double23 = point2.y;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        point26.x = 0.0d;
        point26.y = 1.0d;
        point26.y = 0.0d;
        Line line37 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
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
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        boolean boolean66 = point63.equals((java.lang.Object) 1L);
        point63.y = (-1.0d);
        java.lang.Double double69 = point63.y;
        java.lang.Double double70 = point63.y;
        java.lang.Double double71 = point63.y;
        java.lang.Double double72 = point63.y;
        java.lang.Class<?> wildcardClass73 = point63.getClass();
        boolean boolean74 = point34.equals((java.lang.Object) wildcardClass73);
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double78 = point77.x;
        boolean boolean80 = point77.equals((java.lang.Object) 10.0f);
        point77.x = 100.0d;
        point77.y = 10.0d;
        java.lang.Double double85 = point77.x;
        point77.x = 10.0d;
        Line line88 = new Line(point34, point77);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
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
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point18.x = 0.0d;
        point18.y = (-1.0d);
        point18.y = 100.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 100.0d;
        point27.x = 10.0d;
        java.lang.Double double35 = point27.y;
        boolean boolean36 = point18.equals((java.lang.Object) point27);
        point18.y = 0.0d;
        java.lang.Double double39 = point18.x;
        point18.x = (-1.0d);
        Line line42 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.x;
        java.lang.Double double11 = point9.x;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.x;
        boolean boolean17 = point14.equals((java.lang.Object) 10.0f);
        boolean boolean18 = point9.equals((java.lang.Object) boolean17);
        java.lang.Double double19 = point9.y;
        java.lang.Double double20 = point9.y;
        Line line21 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
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
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        boolean boolean35 = point29.equals((java.lang.Object) point32);
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.y;
        boolean boolean41 = point32.equals((java.lang.Object) double40);
        point32.x = 100.0d;
        point32.y = 100.0d;
        Line line46 = new Line(point8, point32);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
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
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.x;
        point38.y = 0.0d;
        point38.y = (-1.0d);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean53 = point50.equals((java.lang.Object) 1L);
        java.lang.Double double54 = point50.y;
        boolean boolean55 = point47.equals((java.lang.Object) double54);
        point47.x = 10.0d;
        java.lang.Double double58 = point47.x;
        boolean boolean59 = point38.equals((java.lang.Object) point47);
        java.lang.Double double60 = point38.x;
        Line line61 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 1.0d;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.y;
        java.lang.Double double17 = point11.y;
        point11.y = 1.0d;
        point11.y = 100.0d;
        point11.x = 1.0d;
        boolean boolean24 = point2.equals((java.lang.Object) point11);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point27.x = 1.0d;
        point27.x = 1.0d;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        Point point41 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double42 = point41.y;
        java.lang.Double double43 = point41.y;
        boolean boolean44 = point34.equals((java.lang.Object) point41);
        point34.y = 100.0d;
        java.lang.Double double47 = point34.y;
        point34.x = 0.0d;
        java.lang.Double double50 = point34.y;
        point34.y = 10.0d;
        java.lang.Class<?> wildcardClass53 = point34.getClass();
        boolean boolean54 = point27.equals((java.lang.Object) point34);
        Line line55 = new Line(point11, point27);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
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
        point2.x = 1.0d;
        java.lang.Double double21 = point2.y;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.x;
        boolean boolean27 = point24.equals((java.lang.Object) 10.0f);
        point24.x = 100.0d;
        java.lang.Double double30 = point24.x;
        point24.y = 1.0d;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        point35.y = 10.0d;
        point35.y = (-1.0d);
        java.lang.Class<?> wildcardClass41 = point35.getClass();
        boolean boolean42 = point24.equals((java.lang.Object) wildcardClass41);
        java.lang.Double double43 = point24.y;
        point24.x = 1.0d;
        point24.x = 10.0d;
        java.lang.Double double48 = point24.y;
        point24.x = (-1.0d);
        Point point53 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point53.y = 0.0d;
        java.lang.Double double56 = point53.y;
        point53.x = 100.0d;
        point53.x = 100.0d;
        java.lang.Double double61 = point53.y;
        point53.y = 0.0d;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point66.y = (-1.0d);
        java.lang.Double double69 = point66.y;
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double73 = point72.x;
        boolean boolean75 = point72.equals((java.lang.Object) 10.0f);
        point72.x = 100.0d;
        java.lang.Double double78 = point72.x;
        point72.y = 1.0d;
        boolean boolean81 = point66.equals((java.lang.Object) point72);
        java.lang.Class<?> wildcardClass82 = point66.getClass();
        boolean boolean83 = point53.equals((java.lang.Object) point66);
        boolean boolean84 = point24.equals((java.lang.Object) point66);
        Line line85 = new Line(point2, point66);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
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
        boolean boolean27 = point2.equals((java.lang.Object) point5);
        point2.x = 0.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.x = 100.0d;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double42 = point41.y;
        point41.y = 10.0d;
        boolean boolean45 = point38.equals((java.lang.Object) point41);
        point38.y = 0.0d;
        java.lang.Double double48 = point38.x;
        java.lang.Double double49 = point38.x;
        java.lang.Double double50 = point38.x;
        Line line51 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 100.0d;
        point12.y = 10.0d;
        point12.y = 10.0d;
        point12.x = 0.0d;
        java.lang.Double double24 = point12.x;
        java.lang.Double double25 = point12.y;
        boolean boolean26 = point2.equals((java.lang.Object) double25);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        java.lang.Double double36 = point32.y;
        boolean boolean37 = point29.equals((java.lang.Object) double36);
        java.lang.Double double38 = point29.y;
        java.lang.Double double39 = point29.x;
        point29.x = 100.0d;
        java.lang.Double double42 = point29.y;
        point29.y = 10.0d;
        point29.x = 1.0d;
        java.lang.Double double47 = point29.x;
        point29.y = 1.0d;
        Line line50 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        point2.x = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point13.x = 1.0d;
        point13.y = 1.0d;
        java.lang.Double double18 = point13.x;
        point13.x = 1.0d;
        java.lang.Double double21 = point13.x;
        Line line22 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.y;
        point2.x = 1.0d;
        point2.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        java.lang.Double double23 = point20.y;
        java.lang.Double double24 = point20.y;
        Line line25 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        boolean boolean11 = point8.equals((java.lang.Object) 10.0f);
        point8.x = 100.0d;
        boolean boolean14 = point2.equals((java.lang.Object) 100.0d);
        point2.x = (-1.0d);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        point19.y = 0.0d;
        point19.x = 10.0d;
        point19.y = 1.0d;
        point19.x = (-1.0d);
        java.lang.Class<?> wildcardClass32 = point19.getClass();
        boolean boolean33 = point2.equals((java.lang.Object) wildcardClass32);
        Point point36 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point39.x = 1.0d;
        point39.x = 1.0d;
        boolean boolean44 = point36.equals((java.lang.Object) 1.0d);
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
        point47.y = (-1.0d);
        java.lang.Double double69 = point47.x;
        java.lang.Double double70 = point47.x;
        point47.y = 1.0d;
        boolean boolean73 = point36.equals((java.lang.Object) point47);
        Line line74 = new Line(point2, point36);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        java.lang.Double double15 = point11.y;
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = point11.equals(obj16);
        point11.x = 1.0d;
        java.lang.Double double20 = point11.y;
        java.lang.Double double21 = point11.x;
        point11.y = 1.0d;
        java.lang.Double double24 = point11.y;
        java.lang.Double double25 = point11.x;
        point11.x = 100.0d;
        Line line28 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
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
        java.lang.Double double22 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double25 = point2.y;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.x;
        boolean boolean31 = point28.equals((java.lang.Object) 10.0f);
        point28.x = 100.0d;
        java.lang.Double double34 = point28.x;
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double38 = point37.x;
        java.lang.Double double39 = point37.y;
        point37.y = (-1.0d);
        java.lang.Double double42 = point37.y;
        java.lang.Double double43 = point37.x;
        boolean boolean44 = point28.equals((java.lang.Object) double43);
        Point point47 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.x;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        java.lang.Double double55 = point51.y;
        java.lang.Object obj56 = new java.lang.Object();
        boolean boolean57 = point51.equals(obj56);
        java.lang.Double double58 = point51.y;
        java.lang.Class<?> wildcardClass59 = point51.getClass();
        boolean boolean60 = point47.equals((java.lang.Object) point51);
        java.lang.Double double61 = point47.y;
        java.lang.Class<?> wildcardClass62 = point47.getClass();
        boolean boolean63 = point28.equals((java.lang.Object) wildcardClass62);
        java.lang.Double double64 = point28.y;
        java.lang.Double double65 = point28.y;
        Line line66 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
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
        java.lang.Double double69 = point45.y;
        Point point72 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point75.x = 1.0d;
        point75.y = 1.0d;
        boolean boolean80 = point72.equals((java.lang.Object) 1.0d);
        java.lang.Double double81 = point72.y;
        java.lang.Double double82 = point72.x;
        point72.y = 1.0d;
        Line line85 = new Line(point45, point72);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.x;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.y;
        java.lang.Double double23 = point18.y;
        point18.x = 100.0d;
        Line line26 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.x = 1.0d;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        java.lang.Double double18 = point13.x;
        java.lang.Double double19 = point13.y;
        java.lang.Double double20 = point13.y;
        java.lang.Double double21 = point13.y;
        java.lang.Double double22 = point13.y;
        java.lang.Double double23 = point13.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 10.0d;
        boolean boolean33 = point26.equals((java.lang.Object) point29);
        java.lang.Double double34 = point26.x;
        java.lang.Double double35 = point26.y;
        point26.x = 10.0d;
        Point point40 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 100.0d);
        point40.x = 100.0d;
        boolean boolean43 = point26.equals((java.lang.Object) 100.0d);
        boolean boolean44 = point13.equals((java.lang.Object) point26);
        Line line45 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
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
        point2.x = 0.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        boolean boolean24 = point21.equals((java.lang.Object) 1L);
        point21.y = (-1.0d);
        java.lang.Double double27 = point21.y;
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
        boolean boolean46 = point21.equals((java.lang.Object) point35);
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        point49.x = 1.0d;
        boolean boolean56 = point49.equals((java.lang.Object) 'a');
        point49.x = 10.0d;
        boolean boolean59 = point35.equals((java.lang.Object) 10.0d);
        java.lang.Double double60 = point35.y;
        java.lang.Double double61 = point35.x;
        java.lang.Double double62 = point35.y;
        Line line63 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
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
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point26.x = 0.0d;
        point26.y = 1.0d;
        point26.y = 1.0d;
        java.lang.Double double33 = point26.x;
        java.lang.Double double34 = point26.y;
        java.lang.Double double35 = point26.x;
        java.lang.Double double36 = point26.x;
        java.lang.Double double37 = point26.x;
        boolean boolean38 = point2.equals((java.lang.Object) point26);
        Point point41 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean43 = point41.equals((java.lang.Object) (byte) 100);
        java.lang.Double double44 = point41.x;
        point41.x = (-1.0d);
        point41.x = 10.0d;
        point41.y = (-1.0d);
        point41.y = 10.0d;
        java.lang.Double double53 = point41.x;
        java.lang.Double double54 = point41.y;
        Line line55 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
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
        point45.x = 1.0d;
        Point point56 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        point56.y = 1.0d;
        point56.x = 100.0d;
        point56.x = 10.0d;
        java.lang.Double double64 = point56.y;
        point56.y = 0.0d;
        Point point69 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double70 = point69.y;
        point69.y = 100.0d;
        boolean boolean73 = point56.equals((java.lang.Object) point69);
        point69.y = 1.0d;
        java.lang.Double double76 = point69.x;
        java.lang.Double double77 = point69.x;
        Point point80 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double81 = point80.x;
        java.lang.Double double82 = point80.y;
        point80.y = (-1.0d);
        java.lang.Class<?> wildcardClass85 = point80.getClass();
        boolean boolean86 = point69.equals((java.lang.Object) point80);
        point69.x = 10.0d;
        point69.y = 1.0d;
        point69.y = (-1.0d);
        Line line93 = new Line(point45, point69);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        java.lang.Double double12 = point8.y;
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = point8.equals(obj13);
        java.lang.Double double15 = point8.x;
        java.lang.Double double16 = point8.y;
        point8.x = (-1.0d);
        point8.y = 100.0d;
        point8.y = 10.0d;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point25.x = 0.0d;
        point25.y = (-1.0d);
        point25.y = 100.0d;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.x = 10.0d;
        java.lang.Double double42 = point34.y;
        boolean boolean43 = point25.equals((java.lang.Object) point34);
        point34.y = 1.0d;
        boolean boolean46 = point8.equals((java.lang.Object) 1.0d);
        point8.x = 100.0d;
        Line line49 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
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
        boolean boolean60 = point2.equals((java.lang.Object) boolean59);
        Point point63 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double64 = point63.y;
        java.lang.Double double65 = point63.x;
        java.lang.Double double66 = point63.x;
        point63.y = 0.0d;
        boolean boolean70 = point63.equals((java.lang.Object) '#');
        point63.x = 0.0d;
        Point point75 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point75.y = 0.0d;
        java.lang.Double double78 = point75.y;
        point75.x = 100.0d;
        point75.x = 100.0d;
        boolean boolean83 = point63.equals((java.lang.Object) point75);
        point63.x = 1.0d;
        Point point88 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double89 = point88.y;
        point88.y = 100.0d;
        boolean boolean92 = point63.equals((java.lang.Object) 100.0d);
        Line line93 = new Line(point2, point63);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.y = 0.0d;
        java.lang.Double double8 = point2.x;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        java.lang.Double double17 = point11.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 100.0d;
        boolean boolean23 = point11.equals((java.lang.Object) 100.0d);
        point11.x = 1.0d;
        java.lang.Class<?> wildcardClass26 = point11.getClass();
        boolean boolean27 = point2.equals((java.lang.Object) point11);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point30.y = (-1.0d);
        java.lang.Double double33 = point30.y;
        point30.y = 0.0d;
        point30.y = 0.0d;
        Line line38 = new Line(point11, point30);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.x;
        Point point17 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        boolean boolean26 = point23.equals((java.lang.Object) 1L);
        java.lang.Double double27 = point23.y;
        boolean boolean28 = point20.equals((java.lang.Object) double27);
        point20.x = 10.0d;
        java.lang.Double double31 = point20.x;
        point20.x = 10.0d;
        boolean boolean34 = point17.equals((java.lang.Object) point20);
        java.lang.Double double35 = point17.y;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        java.lang.Double double44 = point38.y;
        point38.y = 1.0d;
        point38.y = 100.0d;
        point38.x = 1.0d;
        point38.y = 10.0d;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point58 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double59 = point58.y;
        point58.y = 10.0d;
        boolean boolean62 = point55.equals((java.lang.Object) point58);
        java.lang.Double double63 = point55.x;
        boolean boolean64 = point38.equals((java.lang.Object) double63);
        java.lang.Double double65 = point38.y;
        boolean boolean66 = point17.equals((java.lang.Object) point38);
        Line line67 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
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
        point2.x = 0.0d;
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        point33.y = (-1.0d);
        java.lang.Double double38 = point33.y;
        java.lang.Double double39 = point33.y;
        point33.y = 1.0d;
        point33.y = 1.0d;
        point33.y = 100.0d;
        java.lang.Double double46 = point33.y;
        java.lang.Double double47 = point33.x;
        Line line48 = new Line(point2, point33);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
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
        java.lang.Double double44 = point19.y;
        Point point47 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        point47.y = 1.0d;
        java.lang.Double double51 = point47.y;
        java.lang.Object obj52 = new java.lang.Object();
        boolean boolean53 = point47.equals(obj52);
        boolean boolean54 = point19.equals((java.lang.Object) boolean53);
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point57.y = 100.0d;
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass63 = point62.getClass();
        boolean boolean64 = point57.equals((java.lang.Object) point62);
        boolean boolean65 = point19.equals((java.lang.Object) point57);
        Point point68 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double69 = point68.y;
        point68.y = 1.0d;
        point68.x = 1.0d;
        java.lang.Object obj74 = null;
        boolean boolean75 = point68.equals(obj74);
        point68.x = 1.0d;
        point68.y = 10.0d;
        java.lang.Double double80 = point68.y;
        java.lang.Double double81 = point68.y;
        Point point84 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double85 = point84.x;
        java.lang.Double double86 = point84.y;
        point84.y = (-1.0d);
        point84.y = 0.0d;
        java.lang.Double double91 = point84.x;
        java.lang.Double double92 = point84.x;
        boolean boolean93 = point68.equals((java.lang.Object) point84);
        java.lang.Double double94 = point84.x;
        Line line95 = new Line(point57, point84);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
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
        point2.y = 0.0d;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point22.y = 1.0d;
        point22.y = (-1.0d);
        java.lang.Double double27 = point22.y;
        java.lang.Double double28 = point22.y;
        java.lang.Double double29 = point22.y;
        point22.y = 10.0d;
        point22.y = 100.0d;
        point22.x = 0.0d;
        Line line36 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
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
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        Line line36 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
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
        java.lang.Double double20 = point9.y;
        point9.y = (-1.0d);
        java.lang.Double double23 = point9.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 100.0d;
        point26.y = (-1.0d);
        point26.x = 0.0d;
        point26.y = 100.0d;
        Line line38 = new Line(point9, point26);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
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
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.x;
        boolean boolean58 = point55.equals((java.lang.Object) 10.0f);
        point55.x = 100.0d;
        java.lang.Double double61 = point55.x;
        point55.y = 1.0d;
        point55.y = 1.0d;
        boolean boolean66 = point51.equals((java.lang.Object) point55);
        point55.y = (-1.0d);
        java.lang.Double double69 = point55.y;
        boolean boolean70 = point2.equals((java.lang.Object) point55);
        java.lang.Double double71 = point55.y;
        Point point74 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double75 = point74.y;
        boolean boolean77 = point74.equals((java.lang.Object) 0.0d);
        Point point80 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double81 = point80.y;
        point80.y = 1.0d;
        java.lang.Double double84 = point80.y;
        java.lang.Object obj85 = new java.lang.Object();
        boolean boolean86 = point80.equals(obj85);
        point80.x = 1.0d;
        java.lang.Double double89 = point80.x;
        point80.y = 0.0d;
        boolean boolean92 = point74.equals((java.lang.Object) 0.0d);
        point74.y = 1.0d;
        Line line95 = new Line(point55, point74);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.x = 10.0d;
        point2.x = (-1.0d);
        point2.x = 1.0d;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 10.0d;
        point21.y = (-1.0d);
        java.lang.Double double27 = point21.y;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean33 = point30.equals((java.lang.Object) 1L);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.x;
        boolean boolean39 = point36.equals((java.lang.Object) 10.0f);
        point36.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        boolean boolean43 = point21.equals((java.lang.Object) 100.0d);
        java.lang.Double double44 = point21.x;
        java.lang.Double double45 = point21.y;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        boolean boolean54 = point51.equals((java.lang.Object) 1L);
        java.lang.Double double55 = point51.y;
        boolean boolean56 = point48.equals((java.lang.Object) double55);
        java.lang.Double double57 = point48.y;
        point48.y = 10.0d;
        boolean boolean60 = point21.equals((java.lang.Object) point48);
        point21.y = 1.0d;
        point21.x = 0.0d;
        Line line65 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.x;
        java.lang.Object obj10 = null;
        boolean boolean11 = point2.equals(obj10);
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.x;
        java.lang.Double double17 = point15.y;
        java.lang.Double double18 = point15.y;
        point15.y = (-1.0d);
        point15.x = 0.0d;
        point15.y = 10.0d;
        Point point27 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double28 = point27.x;
        point27.x = 100.0d;
        point27.x = (-1.0d);
        boolean boolean33 = point15.equals((java.lang.Object) (-1.0d));
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        point36.y = 10.0d;
        point36.x = 0.0d;
        java.lang.Double double45 = point36.x;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        java.lang.Double double52 = point48.y;
        java.lang.Object obj53 = new java.lang.Object();
        boolean boolean54 = point48.equals(obj53);
        java.lang.Double double55 = point48.y;
        boolean boolean57 = point48.equals((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass58 = point48.getClass();
        boolean boolean59 = point36.equals((java.lang.Object) wildcardClass58);
        boolean boolean60 = point15.equals((java.lang.Object) wildcardClass58);
        boolean boolean61 = point2.equals((java.lang.Object) wildcardClass58);
        Point point64 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double65 = point64.y;
        point64.y = 100.0d;
        java.lang.Double double68 = point64.y;
        Point point71 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point71.y = 1.0d;
        java.lang.Double double74 = point71.y;
        boolean boolean75 = point64.equals((java.lang.Object) point71);
        Line line76 = new Line(point2, point71);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
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
        point17.y = 10.0d;
        point17.x = (-1.0d);
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        point28.y = (-1.0d);
        java.lang.Double double33 = point28.y;
        java.lang.Double double34 = point28.y;
        point28.y = 1.0d;
        point28.y = 100.0d;
        point28.y = 0.0d;
        point28.y = 0.0d;
        point28.x = (-1.0d);
        java.lang.Double double45 = point28.x;
        java.lang.Double double46 = point28.y;
        Line line47 = new Line(point17, point28);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = 100.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 0.0d;
        java.lang.Double double20 = point16.x;
        java.lang.Class<?> wildcardClass21 = point16.getClass();
        boolean boolean22 = point2.equals((java.lang.Object) point16);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        boolean boolean32 = point25.equals((java.lang.Object) point28);
        boolean boolean34 = point28.equals((java.lang.Object) 10.0d);
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        java.lang.Double double40 = point37.y;
        boolean boolean41 = point28.equals((java.lang.Object) point37);
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 100.0d;
        boolean boolean48 = point2.equals((java.lang.Object) point37);
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        point51.x = 100.0d;
        point51.x = 10.0d;
        java.lang.Double double59 = point51.y;
        point51.y = 0.0d;
        Point point64 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double65 = point64.y;
        point64.y = 100.0d;
        boolean boolean68 = point51.equals((java.lang.Object) point64);
        point64.y = 1.0d;
        Point point73 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point73.x = 1.0d;
        point73.y = 1.0d;
        java.lang.Double double78 = point73.x;
        point73.x = (-1.0d);
        java.lang.Class<?> wildcardClass81 = point73.getClass();
        boolean boolean82 = point64.equals((java.lang.Object) wildcardClass81);
        Point point85 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double86 = point85.y;
        boolean boolean88 = point85.equals((java.lang.Object) 1L);
        java.lang.Double double89 = point85.y;
        java.lang.Double double90 = point85.y;
        java.lang.Class<?> wildcardClass91 = point85.getClass();
        boolean boolean92 = point64.equals((java.lang.Object) point85);
        Line line93 = new Line(point37, point64);
        org.junit.Assert.assertTrue("Contract failed: line93.equals(line93)", line93.equals(line93));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        boolean boolean7 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double8 = point2.x;
        Point point9 = null;
        Line line10 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        point2.x = 10.0d;
        point2.y = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 100.0d;
        point11.x = 10.0d;
        java.lang.Double double19 = point11.y;
        point11.y = 0.0d;
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        point24.y = 100.0d;
        boolean boolean28 = point11.equals((java.lang.Object) point24);
        point24.y = 1.0d;
        java.lang.Double double31 = point24.x;
        Line line32 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
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
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        java.lang.Double double58 = point54.y;
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = point54.equals(obj59);
        point54.x = 1.0d;
        point54.x = 10.0d;
        java.lang.Double double65 = point54.y;
        boolean boolean66 = point2.equals((java.lang.Object) point54);
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.y;
        point69.y = 1.0d;
        point69.x = 100.0d;
        point69.x = 10.0d;
        java.lang.Double double77 = point69.y;
        point69.y = 0.0d;
        java.lang.Double double80 = point69.x;
        point69.y = (-1.0d);
        point69.y = 10.0d;
        java.lang.Double double85 = point69.x;
        Line line86 = new Line(point2, point69);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
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
        point2.x = (-1.0d);
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
        point23.x = 100.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.y;
        boolean boolean50 = point44.equals((java.lang.Object) point47);
        java.lang.Double double51 = point47.x;
        boolean boolean52 = point23.equals((java.lang.Object) point47);
        point47.y = 1.0d;
        java.lang.Double double55 = point47.y;
        Point point58 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point58.y = 1.0d;
        java.lang.Double double61 = point58.y;
        java.lang.Double double62 = point58.y;
        point58.y = 0.0d;
        point58.x = 0.0d;
        point58.y = 100.0d;
        boolean boolean69 = point47.equals((java.lang.Object) point58);
        point58.y = (-1.0d);
        Point point74 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point74.y = 1.0d;
        java.lang.Double double77 = point74.y;
        java.lang.Double double78 = point74.y;
        point74.y = 10.0d;
        point74.x = 0.0d;
        boolean boolean83 = point58.equals((java.lang.Object) 0.0d);
        Line line84 = new Line(point2, point58);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
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
        point2.y = (-1.0d);
        java.lang.Double double35 = point2.x;
        java.lang.Double double36 = point2.y;
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
        java.lang.Double double56 = point52.x;
        Point point59 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double60 = point59.y;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.x;
        boolean boolean66 = point63.equals((java.lang.Object) 10.0f);
        point63.x = 100.0d;
        java.lang.Double double69 = point63.x;
        point63.y = 1.0d;
        point63.y = 1.0d;
        boolean boolean74 = point59.equals((java.lang.Object) point63);
        boolean boolean75 = point52.equals((java.lang.Object) point63);
        Point point78 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double79 = point78.x;
        java.lang.Double double80 = point78.y;
        java.lang.Double double81 = point78.y;
        point78.x = 100.0d;
        java.lang.Class<?> wildcardClass84 = point78.getClass();
        boolean boolean85 = point52.equals((java.lang.Object) wildcardClass84);
        boolean boolean86 = point2.equals((java.lang.Object) point52);
        Point point89 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double90 = point89.x;
        point89.x = 100.0d;
        java.lang.Double double93 = point89.x;
        Line line94 = new Line(point52, point89);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        point2.x = 0.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point11.x = 1.0d;
        point11.y = 1.0d;
        boolean boolean16 = point2.equals((java.lang.Object) point11);
        java.lang.Object obj17 = null;
        boolean boolean18 = point11.equals(obj17);
        point11.y = (-1.0d);
        point11.x = 10.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 1.0d;
        java.lang.Object obj31 = null;
        boolean boolean32 = point25.equals(obj31);
        java.lang.Double double33 = point25.x;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        java.lang.Double double40 = point36.y;
        point36.y = 100.0d;
        point36.y = (-1.0d);
        boolean boolean45 = point25.equals((java.lang.Object) point36);
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point48.y = 1.0d;
        point48.y = (-1.0d);
        java.lang.Double double53 = point48.y;
        java.lang.Double double54 = point48.y;
        point48.y = 1.0d;
        point48.y = 100.0d;
        point48.x = 1.0d;
        point48.y = 10.0d;
        java.lang.Double double63 = point48.y;
        point48.y = 0.0d;
        boolean boolean66 = point25.equals((java.lang.Object) 0.0d);
        Line line67 = new Line(point11, point25);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
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
        java.lang.Double double29 = point2.y;
        java.lang.Double double30 = point2.x;
        point2.y = 0.0d;
        point2.y = 1.0d;
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        java.lang.Double double40 = point37.y;
        Line line41 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
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
        Point point23 = null;
        Line line24 = new Line(point9, point23);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        point2.x = 1.0d;
        point2.y = 1.0d;
        Point point10 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point10.x = 10.0d;
        java.lang.Double double13 = point10.x;
        java.lang.Double double14 = point10.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 100.0d;
        point17.x = 10.0d;
        java.lang.Double double25 = point17.y;
        point17.x = 0.0d;
        java.lang.Class<?> wildcardClass28 = point17.getClass();
        boolean boolean29 = point10.equals((java.lang.Object) wildcardClass28);
        boolean boolean30 = point2.equals((java.lang.Object) wildcardClass28);
        point2.x = 1.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 100.0d;
        point35.x = 10.0d;
        java.lang.Double double43 = point35.y;
        point35.y = 0.0d;
        java.lang.Double double46 = point35.x;
        java.lang.Double double47 = point35.x;
        java.lang.Double double48 = point35.y;
        java.lang.Double double49 = point35.y;
        Line line50 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        point7.y = 0.0d;
        point7.y = 1.0d;
        point7.y = 0.0d;
        point7.x = 100.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point7);
        point2.y = 0.0d;
        java.lang.Double double23 = point2.x;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        java.lang.Double double31 = point29.y;
        boolean boolean32 = point26.equals((java.lang.Object) point29);
        java.lang.Double double33 = point29.x;
        java.lang.Double double34 = point29.x;
        Line line35 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        boolean boolean7 = point2.equals((java.lang.Object) 1L);
        boolean boolean9 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        boolean boolean19 = point13.equals((java.lang.Object) point16);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        java.lang.Double double27 = point22.x;
        java.lang.Double double28 = point22.y;
        point22.y = 1.0d;
        java.lang.Double double31 = point22.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point34.x = 1.0d;
        boolean boolean37 = point22.equals((java.lang.Object) 1.0d);
        boolean boolean38 = point16.equals((java.lang.Object) boolean37);
        java.lang.Double double39 = point16.y;
        Line line40 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        java.lang.Class<?> wildcardClass8 = point6.getClass();
        boolean boolean9 = point2.equals((java.lang.Object) wildcardClass8);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        point12.x = 1.0d;
        java.lang.Double double18 = point12.y;
        java.lang.Double double19 = point12.y;
        point12.x = 1.0d;
        point12.y = (-1.0d);
        java.lang.Class<?> wildcardClass24 = point12.getClass();
        boolean boolean25 = point2.equals((java.lang.Object) point12);
        java.lang.Double double26 = point2.x;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point29.x = 0.0d;
        point29.y = (-1.0d);
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean37 = point29.equals((java.lang.Object) 100.0d);
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        java.lang.Double double44 = point40.y;
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = point40.equals(obj45);
        point40.x = 1.0d;
        point40.y = 0.0d;
        java.lang.Double double51 = point40.x;
        boolean boolean52 = point29.equals((java.lang.Object) point40);
        java.lang.Double double53 = point29.x;
        Line line54 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
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
        java.lang.Double double18 = point12.x;
        point12.x = (-1.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        point26.y = 10.0d;
        boolean boolean30 = point23.equals((java.lang.Object) point26);
        boolean boolean32 = point26.equals((java.lang.Object) 10.0d);
        java.lang.Double double33 = point26.x;
        Line line34 = new Line(point12, point26);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
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
        java.lang.Double double24 = point16.x;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.x;
        point27.y = 0.0d;
        point27.y = (-1.0d);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        boolean boolean42 = point39.equals((java.lang.Object) 1L);
        java.lang.Double double43 = point39.y;
        boolean boolean44 = point36.equals((java.lang.Object) double43);
        point36.x = 10.0d;
        java.lang.Double double47 = point36.x;
        boolean boolean48 = point27.equals((java.lang.Object) point36);
        point36.x = 10.0d;
        java.lang.Double double51 = point36.y;
        Line line52 = new Line(point16, point36);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        java.lang.Double double6 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        java.lang.Double double17 = point14.y;
        point14.x = 100.0d;
        boolean boolean20 = point2.equals((java.lang.Object) 100.0d);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.x;
        boolean boolean26 = point23.equals((java.lang.Object) 10.0f);
        point23.x = 100.0d;
        java.lang.Double double29 = point23.x;
        point23.y = 1.0d;
        point23.x = 0.0d;
        point23.x = (-1.0d);
        java.lang.Double double36 = point23.y;
        Line line37 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
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
        point23.x = (-1.0d);
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point67.y = 1.0d;
        java.lang.Double double70 = point67.y;
        java.lang.Double double71 = point67.y;
        point67.y = 0.0d;
        point67.y = 1.0d;
        java.lang.Double double76 = point67.y;
        point67.x = (-1.0d);
        Line line79 = new Line(point23, point67);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
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
        Point point23 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 100.0d);
        point23.x = 100.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 1.0d;
        boolean boolean35 = point28.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass36 = point28.getClass();
        boolean boolean37 = point23.equals((java.lang.Object) wildcardClass36);
        Line line38 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
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
        point9.x = 10.0d;
        point9.y = 1.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point26.x = 0.0d;
        point26.y = 1.0d;
        java.lang.Double double31 = point26.x;
        point26.x = 10.0d;
        java.lang.Double double34 = point26.y;
        java.lang.Double double35 = point26.y;
        Line line36 = new Line(point9, point26);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 1.0d;
        point6.y = (-1.0d);
        java.lang.Double double11 = point6.y;
        java.lang.Double double12 = point6.y;
        point6.y = 1.0d;
        point6.y = 100.0d;
        point6.y = 1.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        point21.x = 0.0d;
        boolean boolean30 = point6.equals((java.lang.Object) point21);
        Line line31 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
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
        java.lang.Double double29 = point5.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point32.y = (-1.0d);
        java.lang.Double double35 = point32.y;
        java.lang.Double double36 = point32.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        point39.y = 1.0d;
        point39.x = 100.0d;
        point39.x = 10.0d;
        java.lang.Double double47 = point39.y;
        point39.y = 0.0d;
        Point point52 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double53 = point52.y;
        point52.y = 100.0d;
        boolean boolean56 = point39.equals((java.lang.Object) point52);
        point52.y = 1.0d;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point61.x = 1.0d;
        point61.y = 1.0d;
        java.lang.Double double66 = point61.x;
        point61.x = (-1.0d);
        java.lang.Class<?> wildcardClass69 = point61.getClass();
        boolean boolean70 = point52.equals((java.lang.Object) wildcardClass69);
        point52.x = 0.0d;
        boolean boolean73 = point32.equals((java.lang.Object) 0.0d);
        java.lang.Double double74 = point32.x;
        java.lang.Double double75 = point32.x;
        Line line76 = new Line(point5, point32);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
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
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
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
        java.lang.Double double50 = point26.x;
        point26.x = 100.0d;
        Line line53 = new Line(point17, point26);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 0.0d;
        java.lang.Double double10 = point7.x;
        point7.x = (-1.0d);
        java.lang.Class<?> wildcardClass13 = point7.getClass();
        boolean boolean14 = point2.equals((java.lang.Object) wildcardClass13);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.x;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double10 = point2.y;
        point2.x = 100.0d;
        Point point15 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
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
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point34.y = 100.0d;
        point34.y = 0.0d;
        boolean boolean39 = point18.equals((java.lang.Object) 0.0d);
        boolean boolean40 = point15.equals((java.lang.Object) point18);
        point18.y = 10.0d;
        java.lang.Double double43 = point18.y;
        java.lang.Double double44 = point18.y;
        Line line45 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
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
        java.lang.Double double25 = point2.x;
        java.lang.Double double26 = point2.x;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point29.y = 0.0d;
        java.lang.Double double32 = point29.y;
        point29.x = 100.0d;
        point29.x = 0.0d;
        point29.x = 1.0d;
        point29.y = (-1.0d);
        point29.y = 100.0d;
        java.lang.Double double43 = point29.x;
        Line line44 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
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
        Point point24 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean25 = point11.equals((java.lang.Object) point24);
        java.lang.Double double26 = point24.x;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point29.x = 0.0d;
        point29.y = 1.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        boolean boolean37 = point29.equals((java.lang.Object) (-1.0d));
        boolean boolean38 = point24.equals((java.lang.Object) boolean37);
        java.lang.Double double39 = point24.x;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point42.x = 0.0d;
        point42.y = 1.0d;
        java.lang.Double double47 = point42.x;
        point42.x = 0.0d;
        java.lang.Double double50 = point42.y;
        point42.x = 100.0d;
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
        point55.y = 0.0d;
        Point point81 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point81.y = 1.0d;
        java.lang.Double double84 = point81.y;
        java.lang.Double double85 = point81.y;
        point81.y = 0.0d;
        point81.y = 1.0d;
        point81.y = 1.0d;
        java.lang.Class<?> wildcardClass92 = point81.getClass();
        boolean boolean93 = point55.equals((java.lang.Object) point81);
        boolean boolean94 = point42.equals((java.lang.Object) point81);
        point42.y = (-1.0d);
        point42.x = 100.0d;
        Line line99 = new Line(point24, point42);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 1.0d;
        java.lang.Double double19 = point13.y;
        java.lang.Double double20 = point13.y;
        point13.y = (-1.0d);
        java.lang.Double double23 = point13.y;
        boolean boolean24 = point2.equals((java.lang.Object) point13);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 1.0d;
        boolean boolean34 = point27.equals((java.lang.Object) 'a');
        point27.x = 10.0d;
        java.lang.Double double37 = point27.x;
        Line line38 = new Line(point13, point27);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
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
        point7.x = 10.0d;
        point7.x = 10.0d;
        Point point31 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point31.y = 1.0d;
        java.lang.Double double34 = point31.y;
        java.lang.Double double35 = point31.y;
        point31.y = 0.0d;
        java.lang.Double double38 = point31.x;
        point31.y = 100.0d;
        java.lang.Double double41 = point31.y;
        java.lang.Double double42 = point31.x;
        Line line43 = new Line(point7, point31);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        java.lang.Double double24 = point19.y;
        java.lang.Double double25 = point19.y;
        point19.y = 1.0d;
        point19.y = 100.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        point35.y = 10.0d;
        boolean boolean39 = point32.equals((java.lang.Object) point35);
        boolean boolean41 = point35.equals((java.lang.Object) 10.0d);
        boolean boolean42 = point19.equals((java.lang.Object) 10.0d);
        java.lang.Double double43 = point19.x;
        point19.x = 10.0d;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point48.y = 10.0d;
        java.lang.Double double51 = point48.x;
        java.lang.Double double52 = point48.x;
        java.lang.Double double53 = point48.x;
        boolean boolean54 = point19.equals((java.lang.Object) point48);
        Line line55 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
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
        java.lang.Double double17 = point2.x;
        point2.x = 100.0d;
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point22.y = 1.0d;
        point22.y = (-1.0d);
        java.lang.Double double27 = point22.y;
        point22.x = 1.0d;
        Line line30 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        java.lang.Double double12 = point7.y;
        boolean boolean13 = point2.equals((java.lang.Object) point7);
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point16.equals((java.lang.Object) double23);
        point16.x = 10.0d;
        java.lang.Double double27 = point16.x;
        point16.x = 10.0d;
        java.lang.Double double30 = point16.x;
        point16.y = 1.0d;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point35.y = (-1.0d);
        java.lang.Double double38 = point35.x;
        point35.x = (-1.0d);
        Point point43 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.x;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean50 = point48.equals((java.lang.Object) true);
        boolean boolean51 = point43.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass52 = point43.getClass();
        boolean boolean53 = point35.equals((java.lang.Object) wildcardClass52);
        point35.y = 10.0d;
        boolean boolean56 = point16.equals((java.lang.Object) point35);
        java.lang.Double double57 = point35.x;
        boolean boolean58 = point7.equals((java.lang.Object) point35);
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point61.y = 1.0d;
        java.lang.Double double64 = point61.y;
        java.lang.Double double65 = point61.y;
        point61.y = 10.0d;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double71 = point70.x;
        boolean boolean73 = point70.equals((java.lang.Object) 10.0f);
        point70.x = 100.0d;
        java.lang.Double double76 = point70.x;
        Point point79 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point79.x = 100.0d;
        boolean boolean82 = point70.equals((java.lang.Object) 100.0d);
        java.lang.Double double83 = point70.y;
        point70.y = 100.0d;
        boolean boolean86 = point61.equals((java.lang.Object) point70);
        point70.x = 1.0d;
        java.lang.Double double89 = point70.y;
        Line line90 = new Line(point35, point70);
        org.junit.Assert.assertTrue("Contract failed: line90.equals(line90)", line90.equals(line90));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        point2.x = 10.0d;
        Point point12 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.x;
        point12.y = 0.0d;
        Line line17 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = point2.equals(obj3);
        java.lang.Double double5 = point2.x;
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
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
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point26.y = 100.0d;
        java.lang.Object obj29 = null;
        boolean boolean30 = point26.equals(obj29);
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        java.lang.Double double35 = point33.x;
        java.lang.Double double36 = point33.x;
        point33.y = 0.0d;
        boolean boolean40 = point33.equals((java.lang.Object) '#');
        point33.x = 0.0d;
        point33.y = 100.0d;
        boolean boolean45 = point26.equals((java.lang.Object) point33);
        point33.x = 100.0d;
        java.lang.Double double48 = point33.y;
        Line line49 = new Line(point17, point33);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.y = 10.0d;
        point2.y = (-1.0d);
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        boolean boolean11 = point2.equals((java.lang.Object) 10.0d);
        java.lang.Object obj12 = null;
        boolean boolean13 = point2.equals(obj12);
        point2.y = 0.0d;
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        java.lang.Double double20 = point18.y;
        point18.y = (-1.0d);
        point18.y = 0.0d;
        java.lang.Double double25 = point18.x;
        java.lang.Double double26 = point18.x;
        boolean boolean27 = point2.equals((java.lang.Object) double26);
        java.lang.Double double28 = point2.x;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double34 = point31.x;
        java.lang.Double double35 = point31.x;
        java.lang.Double double36 = point31.x;
        Line line37 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.y = 10.0d;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point20.y = 0.0d;
        java.lang.Double double23 = point20.x;
        java.lang.Double double24 = point20.x;
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
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point52.y = 0.0d;
        java.lang.Double double55 = point52.y;
        java.lang.Double double56 = point52.x;
        Point point59 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point62.x = 1.0d;
        point62.y = 1.0d;
        boolean boolean67 = point59.equals((java.lang.Object) 1.0d);
        java.lang.Double double68 = point59.y;
        java.lang.Double double69 = point59.y;
        java.lang.Double double70 = point59.x;
        java.lang.Double double71 = point59.y;
        boolean boolean72 = point52.equals((java.lang.Object) double71);
        boolean boolean73 = point27.equals((java.lang.Object) double71);
        java.lang.Double double74 = point27.x;
        point27.y = 0.0d;
        boolean boolean77 = point20.equals((java.lang.Object) 0.0d);
        java.lang.Double double78 = point20.y;
        Line line79 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
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
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 100.0d;
        boolean boolean46 = point34.equals((java.lang.Object) 100.0d);
        point34.x = 1.0d;
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
        Point point73 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point73.y = 10.0d;
        point73.y = 10.0d;
        boolean boolean78 = point60.equals((java.lang.Object) point73);
        boolean boolean79 = point34.equals((java.lang.Object) boolean78);
        point34.y = 0.0d;
        Point point84 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point84.x = 0.0d;
        java.lang.Double double87 = point84.x;
        java.lang.Double double88 = point84.y;
        point84.x = 100.0d;
        boolean boolean91 = point34.equals((java.lang.Object) point84);
        Line line92 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line92.equals(line92)", line92.equals(line92));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double16 = point15.x;
        java.lang.Double double17 = point15.y;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        java.lang.Double double23 = point20.y;
        java.lang.Double double24 = point20.y;
        java.lang.Double double25 = point20.y;
        boolean boolean26 = point15.equals((java.lang.Object) point20);
        point15.y = 0.0d;
        java.lang.Double double29 = point15.y;
        point15.x = 1.0d;
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
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point66.x = 0.0d;
        point66.y = (-1.0d);
        point66.y = 100.0d;
        java.lang.Double double73 = point66.x;
        boolean boolean74 = point54.equals((java.lang.Object) point66);
        boolean boolean76 = point54.equals((java.lang.Object) (-1));
        java.lang.Double double77 = point54.x;
        boolean boolean78 = point15.equals((java.lang.Object) double77);
        java.lang.Double double79 = point15.x;
        Line line80 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        point16.y = (-1.0d);
        point16.y = 100.0d;
        point16.x = (-1.0d);
        java.lang.Double double25 = point16.y;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double29 = point28.x;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        java.lang.Double double34 = point32.y;
        java.lang.Double double35 = point32.x;
        boolean boolean36 = point28.equals((java.lang.Object) point32);
        point28.x = (-1.0d);
        java.lang.Double double39 = point28.x;
        boolean boolean40 = point16.equals((java.lang.Object) point28);
        Line line41 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
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
        java.lang.Double double28 = point2.x;
        java.lang.Double double29 = point2.y;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point32.y = 0.0d;
        java.lang.Double double35 = point32.y;
        point32.x = 100.0d;
        point32.y = 0.0d;
        java.lang.Double double40 = point32.x;
        point32.x = 10.0d;
        point32.x = 0.0d;
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
        point47.y = (-1.0d);
        java.lang.Double double69 = point47.x;
        java.lang.Double double70 = point47.x;
        java.lang.Double double71 = point47.y;
        java.lang.Double double72 = point47.y;
        boolean boolean73 = point32.equals((java.lang.Object) point47);
        point32.y = 100.0d;
        java.lang.Double double76 = point32.y;
        Line line77 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
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
        java.lang.Double double59 = point42.x;
        Point point62 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double63 = point62.y;
        point62.y = 10.0d;
        point62.y = (-1.0d);
        java.lang.Object obj68 = null;
        boolean boolean69 = point62.equals(obj68);
        point62.x = (-1.0d);
        Point point74 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double75 = point74.y;
        point74.y = 1.0d;
        point74.x = 100.0d;
        point74.x = 10.0d;
        java.lang.Double double82 = point74.y;
        point74.y = 0.0d;
        java.lang.Double double85 = point74.x;
        point74.y = (-1.0d);
        point74.y = 10.0d;
        java.lang.Double double90 = point74.x;
        boolean boolean91 = point62.equals((java.lang.Object) double90);
        point62.x = (-1.0d);
        point62.y = (-1.0d);
        java.lang.Double double96 = point62.y;
        Line line97 = new Line(point42, point62);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        point2.x = (-1.0d);
        java.lang.Double double14 = point2.y;
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
        Line line55 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
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
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean35 = point30.equals((java.lang.Object) 1L);
        Line line36 = new Line(point8, point30);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
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
        point2.y = 100.0d;
        point2.x = 0.0d;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double31 = point30.x;
        java.lang.Double double32 = point30.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 10.0d;
        boolean boolean39 = point30.equals((java.lang.Object) point35);
        point35.x = 1.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = (-1.0d);
        java.lang.Double double49 = point44.y;
        point44.x = 10.0d;
        point44.y = 100.0d;
        java.lang.Double double54 = point44.y;
        boolean boolean55 = point35.equals((java.lang.Object) point44);
        point35.x = (-1.0d);
        java.lang.Double double58 = point35.y;
        Line line59 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
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
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
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
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        point26.y = (-1.0d);
        java.lang.Double double31 = point26.y;
        java.lang.Double double32 = point26.y;
        point26.y = 1.0d;
        point26.y = 100.0d;
        point26.x = 1.0d;
        point26.y = (-1.0d);
        point26.y = 1.0d;
        java.lang.Double double43 = point26.y;
        point26.x = 0.0d;
        java.lang.Object obj46 = null;
        boolean boolean47 = point26.equals(obj46);
        java.lang.Double double48 = point26.y;
        java.lang.Double double49 = point26.y;
        Line line50 = new Line(point9, point26);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.y;
        point2.x = 10.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 100.0d);
        point16.x = 100.0d;
        boolean boolean19 = point2.equals((java.lang.Object) 100.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 100.0d;
        java.lang.Double double28 = point22.y;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double34 = point31.y;
        java.lang.Double double35 = point31.x;
        boolean boolean36 = point22.equals((java.lang.Object) double35);
        point22.y = 1.0d;
        java.lang.Double double39 = point22.x;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point42.y = 0.0d;
        java.lang.Double double45 = point42.y;
        java.lang.Double double46 = point42.x;
        point42.x = 1.0d;
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj52 = null;
        boolean boolean53 = point51.equals(obj52);
        java.lang.Class<?> wildcardClass54 = point51.getClass();
        boolean boolean55 = point42.equals((java.lang.Object) wildcardClass54);
        java.lang.Double double56 = point42.x;
        boolean boolean57 = point22.equals((java.lang.Object) point42);
        java.lang.Double double58 = point42.x;
        java.lang.Double double59 = point42.x;
        point42.x = 0.0d;
        Line line62 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
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
        point2.y = 10.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        boolean boolean34 = point31.equals((java.lang.Object) 1L);
        java.lang.Double double35 = point31.y;
        boolean boolean36 = point28.equals((java.lang.Object) double35);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        point39.y = 100.0d;
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass49 = point48.getClass();
        boolean boolean50 = point39.equals((java.lang.Object) point48);
        boolean boolean51 = point28.equals((java.lang.Object) point48);
        java.lang.Double double52 = point28.y;
        Line line53 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.x = 10.0d;
        point2.x = (-1.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        point16.y = (-1.0d);
        java.lang.Double double21 = point16.y;
        java.lang.Double double22 = point16.y;
        point16.y = 1.0d;
        point16.y = 1.0d;
        point16.x = 100.0d;
        java.lang.Double double29 = point16.y;
        java.lang.Double double30 = point16.y;
        java.lang.Class<?> wildcardClass31 = point16.getClass();
        boolean boolean32 = point2.equals((java.lang.Object) point16);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point35.y = 100.0d;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        Line line40 = new Line(point16, point35);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = 0.0d;
        point2.y = 0.0d;
        java.lang.Double double10 = point2.x;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.x;
        java.lang.Double double16 = point13.x;
        java.lang.Double double17 = point13.x;
        java.lang.Object obj18 = null;
        boolean boolean19 = point13.equals(obj18);
        boolean boolean20 = point2.equals(obj18);
        java.lang.Double double21 = point2.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        point24.y = (-1.0d);
        java.lang.Double double29 = point24.x;
        java.lang.Double double30 = point24.x;
        point24.x = 0.0d;
        Line line33 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        java.lang.Double double24 = point17.y;
        point17.y = 0.0d;
        java.lang.Double double27 = point17.x;
        point17.x = (-1.0d);
        java.lang.Double double30 = point17.y;
        Line line31 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point7 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        point7.x = 100.0d;
        boolean boolean11 = point2.equals((java.lang.Object) point7);
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean20 = point17.equals((java.lang.Object) 1L);
        java.lang.Double double21 = point17.y;
        boolean boolean22 = point14.equals((java.lang.Object) double21);
        java.lang.Double double23 = point14.y;
        point14.x = 1.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        point28.y = (-1.0d);
        java.lang.Object obj34 = null;
        boolean boolean35 = point28.equals(obj34);
        point28.x = (-1.0d);
        point28.y = (-1.0d);
        point28.y = 100.0d;
        point28.x = 0.0d;
        boolean boolean44 = point14.equals((java.lang.Object) point28);
        boolean boolean45 = point7.equals((java.lang.Object) point14);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point48.x = 100.0d;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        point53.y = 1.0d;
        point53.x = 1.0d;
        java.lang.Double double59 = point53.y;
        java.lang.Double double60 = point53.y;
        point53.x = 10.0d;
        boolean boolean63 = point48.equals((java.lang.Object) point53);
        Point point66 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double67 = point66.y;
        point66.y = 10.0d;
        point66.y = 10.0d;
        boolean boolean72 = point53.equals((java.lang.Object) point66);
        java.lang.Double double73 = point53.x;
        Point point76 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double77 = point76.x;
        java.lang.Double double78 = point76.y;
        java.lang.Double double79 = point76.y;
        point76.y = (-1.0d);
        boolean boolean82 = point53.equals((java.lang.Object) (-1.0d));
        Point point85 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point85.y = 1.0d;
        java.lang.Double double88 = point85.y;
        java.lang.Double double89 = point85.y;
        point85.y = 0.0d;
        point85.y = 1.0d;
        point85.y = 1.0d;
        boolean boolean96 = point53.equals((java.lang.Object) point85);
        java.lang.Double double97 = point85.x;
        java.lang.Double double98 = point85.y;
        Line line99 = new Line(point7, point85);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
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
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean38 = point35.equals((java.lang.Object) 1L);
        java.lang.Double double39 = point35.y;
        boolean boolean40 = point32.equals((java.lang.Object) double39);
        java.lang.Double double41 = point32.y;
        java.lang.Double double42 = point32.x;
        point32.y = 100.0d;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double48 = point47.x;
        java.lang.Double double49 = point47.y;
        point47.y = 1.0d;
        boolean boolean52 = point32.equals((java.lang.Object) point47);
        point47.y = (-1.0d);
        point47.x = 1.0d;
        Line line57 = new Line(point12, point47);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double7 = point2.x;
        Point point10 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point13.x = 1.0d;
        point13.y = 1.0d;
        boolean boolean18 = point10.equals((java.lang.Object) 1.0d);
        java.lang.Double double19 = point10.y;
        java.lang.Double double20 = point10.x;
        point10.y = 10.0d;
        java.lang.Double double23 = point10.y;
        point10.x = (-1.0d);
        Line line26 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        point8.y = (-1.0d);
        java.lang.Double double13 = point8.x;
        point8.y = 1.0d;
        java.lang.Double double16 = point8.x;
        java.lang.Double double17 = point8.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 1.0d;
        java.lang.Object obj26 = null;
        boolean boolean27 = point20.equals(obj26);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point30.y = 0.0d;
        java.lang.Double double33 = point30.y;
        java.lang.Double double34 = point30.x;
        point30.x = 1.0d;
        boolean boolean37 = point20.equals((java.lang.Object) 1.0d);
        boolean boolean38 = point8.equals((java.lang.Object) point20);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        point41.y = (-1.0d);
        Point point48 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double49 = point48.y;
        point48.y = 10.0d;
        boolean boolean52 = point41.equals((java.lang.Object) 10.0d);
        java.lang.Double double53 = point41.y;
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point56.y = 1.0d;
        point56.y = (-1.0d);
        java.lang.Double double61 = point56.y;
        java.lang.Double double62 = point56.y;
        point56.y = 1.0d;
        point56.y = 100.0d;
        point56.y = 0.0d;
        java.lang.Double double69 = point56.y;
        java.lang.Double double70 = point56.y;
        Point point73 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point73.y = 10.0d;
        java.lang.Double double76 = point73.x;
        java.lang.Double double77 = point73.x;
        java.lang.Double double78 = point73.x;
        java.lang.Class<?> wildcardClass79 = point73.getClass();
        boolean boolean80 = point56.equals((java.lang.Object) wildcardClass79);
        java.lang.Double double81 = point56.y;
        point56.x = 100.0d;
        boolean boolean84 = point41.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass85 = point41.getClass();
        boolean boolean86 = point20.equals((java.lang.Object) point41);
        Line line87 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
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
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 100.0d;
        point25.x = 10.0d;
        java.lang.Double double33 = point25.y;
        java.lang.Double double34 = point25.x;
        boolean boolean35 = point22.equals((java.lang.Object) double34);
        java.lang.Double double36 = point22.x;
        Line line37 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = 100.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 0.0d;
        java.lang.Double double20 = point16.x;
        java.lang.Class<?> wildcardClass21 = point16.getClass();
        boolean boolean22 = point2.equals((java.lang.Object) point16);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        boolean boolean32 = point25.equals((java.lang.Object) point28);
        boolean boolean34 = point28.equals((java.lang.Object) 10.0d);
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point37.y = 1.0d;
        java.lang.Double double40 = point37.y;
        boolean boolean41 = point28.equals((java.lang.Object) point37);
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 100.0d;
        boolean boolean48 = point2.equals((java.lang.Object) point37);
        point37.y = 10.0d;
        point37.x = 100.0d;
        Point point55 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point55.y = 10.0d;
        java.lang.Double double58 = point55.x;
        point55.y = 1.0d;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        point63.y = 1.0d;
        point63.x = 100.0d;
        point63.y = 10.0d;
        point63.y = 10.0d;
        point63.x = 0.0d;
        boolean boolean75 = point55.equals((java.lang.Object) point63);
        point55.y = 100.0d;
        java.lang.Double double78 = point55.y;
        point55.y = 100.0d;
        java.lang.Double double81 = point55.x;
        point55.y = 100.0d;
        Line line84 = new Line(point37, point55);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
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
        point2.x = 1.0d;
        java.lang.Double double19 = point2.x;
        java.lang.Double double20 = point2.y;
        java.lang.Double double21 = point2.x;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.x;
        java.lang.Double double27 = point24.x;
        point24.y = 1.0d;
        point24.y = 10.0d;
        Line line32 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
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
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        point30.y = (-1.0d);
        java.lang.Double double35 = point30.y;
        java.lang.Double double36 = point30.y;
        java.lang.Double double37 = point30.y;
        point30.y = 100.0d;
        java.lang.Double double40 = point30.x;
        java.lang.Double double41 = point30.x;
        java.lang.Double double42 = point30.y;
        point30.y = 0.0d;
        point30.y = 10.0d;
        java.lang.Double double47 = point30.x;
        Line line48 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 100.0d;
        point2.x = (-1.0d);
        Point point18 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.x;
        java.lang.Double double20 = point18.y;
        point18.y = 0.0d;
        point18.x = 100.0d;
        Line line25 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        point2.x = 100.0d;
        point2.x = 100.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 1.0d;
        java.lang.Object obj26 = null;
        boolean boolean27 = point20.equals(obj26);
        point20.x = 1.0d;
        boolean boolean31 = point20.equals((java.lang.Object) false);
        java.lang.Double double32 = point20.x;
        point20.x = 0.0d;
        point20.y = (-1.0d);
        Line line37 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
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
        java.lang.Double double26 = point2.y;
        java.lang.Double double27 = point2.y;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        java.lang.Double double36 = point30.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point39.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        point30.x = 10.0d;
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
        point47.y = (-1.0d);
        point47.x = (-1.0d);
        java.lang.Double double71 = point47.y;
        java.lang.Class<?> wildcardClass72 = point47.getClass();
        boolean boolean73 = point30.equals((java.lang.Object) wildcardClass72);
        boolean boolean74 = point2.equals((java.lang.Object) wildcardClass72);
        Point point77 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double78 = point77.y;
        java.lang.Double double79 = point77.y;
        java.lang.Double double80 = point77.y;
        Line line81 = new Line(point2, point77);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        point9.y = (-1.0d);
        java.lang.Double double14 = point9.x;
        point9.y = 1.0d;
        java.lang.Double double17 = point9.x;
        point9.y = 0.0d;
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
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.x;
        boolean boolean42 = point39.equals((java.lang.Object) 10.0f);
        point39.x = 100.0d;
        java.lang.Double double45 = point39.x;
        point39.y = 1.0d;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.y;
        point50.y = 10.0d;
        point50.y = (-1.0d);
        java.lang.Class<?> wildcardClass56 = point50.getClass();
        boolean boolean57 = point39.equals((java.lang.Object) wildcardClass56);
        java.lang.Double double58 = point39.y;
        point39.y = 100.0d;
        boolean boolean61 = point22.equals((java.lang.Object) point39);
        boolean boolean62 = point9.equals((java.lang.Object) point39);
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point65.y = 0.0d;
        java.lang.Double double68 = point65.x;
        point65.x = 10.0d;
        point65.x = 0.0d;
        java.lang.Double double73 = point65.x;
        boolean boolean74 = point39.equals((java.lang.Object) double73);
        java.lang.Object obj75 = null;
        boolean boolean76 = point39.equals(obj75);
        Line line77 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
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
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        java.lang.Double double45 = point37.y;
        point37.y = 0.0d;
        java.lang.Double double48 = point37.x;
        java.lang.Double double49 = point37.x;
        Point point52 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point52.y = 0.0d;
        java.lang.Double double55 = point52.x;
        point52.x = 10.0d;
        point52.x = 0.0d;
        java.lang.Double double60 = point52.x;
        boolean boolean61 = point37.equals((java.lang.Object) point52);
        boolean boolean62 = point2.equals((java.lang.Object) point52);
        java.lang.Double double63 = point52.x;
        Point point66 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point69.y = (-1.0d);
        java.lang.Double double72 = point69.x;
        point69.x = (-1.0d);
        Point point77 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double78 = point77.y;
        java.lang.Double double79 = point77.x;
        Point point82 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean84 = point82.equals((java.lang.Object) true);
        boolean boolean85 = point77.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass86 = point77.getClass();
        boolean boolean87 = point69.equals((java.lang.Object) wildcardClass86);
        java.lang.Class<?> wildcardClass88 = point69.getClass();
        boolean boolean89 = point66.equals((java.lang.Object) wildcardClass88);
        java.lang.Double double90 = point66.x;
        point66.x = 10.0d;
        java.lang.Double double93 = point66.x;
        Line line94 = new Line(point52, point66);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        java.lang.Double double11 = point7.y;
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = point7.equals(obj12);
        point7.x = 1.0d;
        java.lang.Double double16 = point7.y;
        point7.y = 100.0d;
        point7.x = 0.0d;
        boolean boolean21 = point2.equals((java.lang.Object) 0.0d);
        java.lang.Double double22 = point2.y;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.x;
        point25.y = 0.0d;
        point25.y = (-1.0d);
        point25.y = 100.0d;
        java.lang.Double double34 = point25.x;
        java.lang.Double double35 = point25.x;
        point25.x = 1.0d;
        java.lang.Double double38 = point25.x;
        java.lang.Double double39 = point25.x;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.x;
        java.lang.Double double45 = point42.x;
        point42.y = 0.0d;
        boolean boolean49 = point42.equals((java.lang.Object) '#');
        point42.y = 100.0d;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double55 = point54.y;
        point54.y = 1.0d;
        point54.x = 100.0d;
        java.lang.Double double60 = point54.y;
        point54.y = 100.0d;
        point54.x = (-1.0d);
        java.lang.Double double65 = point54.x;
        point54.y = 0.0d;
        boolean boolean68 = point42.equals((java.lang.Object) 0.0d);
        boolean boolean69 = point25.equals((java.lang.Object) point42);
        Line line70 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
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
        java.lang.Double double26 = point12.x;
        java.lang.Double double27 = point12.x;
        java.lang.Double double28 = point12.x;
        java.lang.Double double29 = point12.y;
        point12.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 100.0d;
        boolean boolean46 = point34.equals((java.lang.Object) 100.0d);
        java.lang.Double double47 = point34.y;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point53.x = 1.0d;
        point53.y = 1.0d;
        boolean boolean58 = point50.equals((java.lang.Object) 1.0d);
        java.lang.Double double59 = point50.y;
        point50.x = 0.0d;
        boolean boolean62 = point34.equals((java.lang.Object) 0.0d);
        point34.x = 100.0d;
        java.lang.Double double65 = point34.y;
        java.lang.Double double66 = point34.x;
        java.lang.Double double67 = point34.x;
        java.lang.Double double68 = point34.x;
        Point point71 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double72 = point71.y;
        point71.y = 10.0d;
        point71.y = (-1.0d);
        java.lang.Object obj77 = null;
        boolean boolean78 = point71.equals(obj77);
        boolean boolean80 = point71.equals((java.lang.Object) 10.0d);
        java.lang.Object obj81 = null;
        boolean boolean82 = point71.equals(obj81);
        point71.y = 0.0d;
        point71.y = 1.0d;
        Point point89 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point89.y = (-1.0d);
        point89.x = 1.0d;
        boolean boolean94 = point71.equals((java.lang.Object) point89);
        point71.y = 1.0d;
        java.lang.Double double97 = point71.x;
        boolean boolean98 = point34.equals((java.lang.Object) double97);
        Line line99 = new Line(point12, point34);
        org.junit.Assert.assertTrue("Contract failed: line99.equals(line99)", line99.equals(line99));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
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
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        point25.y = 1.0d;
        point25.x = 100.0d;
        java.lang.Double double31 = point25.y;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point34.y = 0.0d;
        java.lang.Double double37 = point34.y;
        java.lang.Double double38 = point34.x;
        boolean boolean39 = point25.equals((java.lang.Object) double38);
        boolean boolean41 = point25.equals((java.lang.Object) false);
        point25.y = 1.0d;
        java.lang.Double double44 = point25.x;
        java.lang.Double double45 = point25.x;
        Line line46 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
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
        point37.y = (-1.0d);
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        java.lang.Double double56 = point53.y;
        java.lang.Double double57 = point53.y;
        point53.y = 10.0d;
        point53.x = 0.0d;
        boolean boolean62 = point37.equals((java.lang.Object) 0.0d);
        point37.y = 0.0d;
        Point point67 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point67.y = 1.0d;
        point67.y = (-1.0d);
        java.lang.Double double72 = point67.y;
        java.lang.Double double73 = point67.y;
        point67.y = 1.0d;
        point67.y = 100.0d;
        Point point80 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point83 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double84 = point83.y;
        point83.y = 10.0d;
        boolean boolean87 = point80.equals((java.lang.Object) point83);
        boolean boolean89 = point83.equals((java.lang.Object) 10.0d);
        boolean boolean90 = point67.equals((java.lang.Object) 10.0d);
        point67.y = 10.0d;
        point67.y = 0.0d;
        Line line95 = new Line(point37, point67);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
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
        Point point85 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double86 = point85.x;
        boolean boolean88 = point85.equals((java.lang.Object) 10.0f);
        point85.x = 100.0d;
        java.lang.Double double91 = point85.x;
        point85.x = 0.0d;
        point85.x = (-1.0d);
        java.lang.Double double96 = point85.x;
        Line line97 = new Line(point55, point85);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        point2.y = 0.0d;
        point2.x = (-1.0d);
        java.lang.Double double19 = point2.y;
        point2.y = 0.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        java.lang.Double double28 = point24.y;
        java.lang.Object obj29 = new java.lang.Object();
        boolean boolean30 = point24.equals(obj29);
        java.lang.Double double31 = point24.y;
        point24.x = 1.0d;
        java.lang.Double double34 = point24.y;
        point24.y = 0.0d;
        point24.x = 0.0d;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point41.y = 0.0d;
        java.lang.Double double44 = point41.y;
        java.lang.Double double45 = point41.x;
        point41.x = 1.0d;
        point41.x = 100.0d;
        java.lang.Double double50 = point41.x;
        boolean boolean51 = point24.equals((java.lang.Object) double50);
        Line line52 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
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
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 1.0d;
        java.lang.Object obj56 = null;
        boolean boolean57 = point50.equals(obj56);
        point50.x = 1.0d;
        point50.x = (-1.0d);
        java.lang.Double double62 = point50.y;
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point65.y = 1.0d;
        point65.y = (-1.0d);
        java.lang.Double double70 = point65.y;
        point65.y = 100.0d;
        point65.x = 100.0d;
        java.lang.Double double75 = point65.y;
        java.lang.Double double76 = point65.x;
        java.lang.Double double77 = point65.y;
        boolean boolean78 = point50.equals((java.lang.Object) point65);
        point50.x = 0.0d;
        Point point83 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point83.y = 1.0d;
        java.lang.Double double86 = point83.y;
        java.lang.Double double87 = point83.y;
        point83.y = 0.0d;
        point83.x = 0.0d;
        java.lang.Double double92 = point83.y;
        point83.x = 100.0d;
        boolean boolean95 = point50.equals((java.lang.Object) point83);
        Line line96 = new Line(point29, point83);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
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
        point2.x = 10.0d;
        Point point78 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double79 = point78.y;
        point78.y = 10.0d;
        point78.y = (-1.0d);
        java.lang.Double double84 = point78.y;
        java.lang.Double double85 = point78.y;
        java.lang.Double double86 = point78.x;
        Line line87 = new Line(point2, point78);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
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
        point2.x = 100.0d;
        point2.x = 1.0d;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point23.y = 100.0d;
        java.lang.Double double26 = point23.y;
        java.lang.Double double27 = point23.y;
        point23.y = (-1.0d);
        point23.x = 0.0d;
        Line line32 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.y = 0.0d;
        point2.x = (-1.0d);
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        point11.y = (-1.0d);
        java.lang.Double double16 = point11.x;
        java.lang.Double double17 = point11.x;
        java.lang.Double double18 = point11.x;
        point11.x = (-1.0d);
        boolean boolean21 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double22 = point2.x;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.x;
        point25.y = 0.0d;
        point25.y = (-1.0d);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        java.lang.Double double41 = point37.y;
        boolean boolean42 = point34.equals((java.lang.Object) double41);
        point34.x = 10.0d;
        java.lang.Double double45 = point34.x;
        boolean boolean46 = point25.equals((java.lang.Object) point34);
        point34.x = 10.0d;
        Point point51 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double52 = point51.y;
        point51.y = 1.0d;
        java.lang.Double double55 = point51.y;
        java.lang.Object obj56 = new java.lang.Object();
        boolean boolean57 = point51.equals(obj56);
        point51.x = 100.0d;
        java.lang.Double double60 = point51.y;
        boolean boolean61 = point34.equals((java.lang.Object) point51);
        Line line62 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
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
        java.lang.Double double24 = point11.x;
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
        Point point59 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double60 = point59.y;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point63.x = 1.0d;
        point63.y = 1.0d;
        point63.y = (-1.0d);
        boolean boolean70 = point59.equals((java.lang.Object) point63);
        java.lang.Double double71 = point63.x;
        boolean boolean72 = point27.equals((java.lang.Object) point63);
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point75.y = 100.0d;
        point75.x = 0.0d;
        point75.x = 10.0d;
        point75.x = (-1.0d);
        boolean boolean84 = point27.equals((java.lang.Object) point75);
        Line line85 = new Line(point11, point75);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.y = 0.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        java.lang.Double double21 = point17.y;
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = point17.equals(obj22);
        point17.x = 1.0d;
        java.lang.Double double26 = point17.y;
        point17.y = 100.0d;
        point17.x = 100.0d;
        point17.x = 0.0d;
        Line line33 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.x;
        java.lang.Double double10 = point8.x;
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        point13.y = (-1.0d);
        java.lang.Double double18 = point13.y;
        java.lang.Double double19 = point13.y;
        point13.y = 1.0d;
        java.lang.Class<?> wildcardClass22 = point13.getClass();
        boolean boolean23 = point8.equals((java.lang.Object) wildcardClass22);
        java.lang.Double double24 = point8.y;
        point8.x = (-1.0d);
        java.lang.Class<?> wildcardClass27 = point8.getClass();
        boolean boolean28 = point2.equals((java.lang.Object) wildcardClass27);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        java.lang.Double double33 = point31.x;
        java.lang.Double double34 = point31.x;
        point31.y = 0.0d;
        point31.y = 1.0d;
        point31.y = 100.0d;
        java.lang.Double double41 = point31.x;
        point31.x = 100.0d;
        Line line44 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.y;
        boolean boolean14 = point2.equals((java.lang.Object) point11);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        point17.y = 10.0d;
        java.lang.Double double25 = point17.x;
        java.lang.Double double26 = point17.y;
        point17.y = 10.0d;
        boolean boolean30 = point17.equals((java.lang.Object) 10L);
        Point point33 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point33.y = 1.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.y;
        point33.x = 0.0d;
        point33.y = (-1.0d);
        point33.x = 100.0d;
        point33.y = 0.0d;
        boolean boolean46 = point17.equals((java.lang.Object) 0.0d);
        Line line47 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
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
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        java.lang.Double double33 = point29.y;
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = point29.equals(obj34);
        java.lang.Double double36 = point29.y;
        point29.x = (-1.0d);
        point29.x = (-1.0d);
        java.lang.Double double41 = point29.y;
        java.lang.Class<?> wildcardClass42 = point29.getClass();
        boolean boolean43 = point2.equals((java.lang.Object) wildcardClass42);
        java.lang.Double double44 = point2.x;
        java.lang.Double double45 = point2.x;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        boolean boolean51 = point48.equals((java.lang.Object) 1L);
        point48.y = (-1.0d);
        java.lang.Double double54 = point48.y;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point57.x = 100.0d;
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        point62.y = 1.0d;
        point62.x = 1.0d;
        java.lang.Double double68 = point62.y;
        java.lang.Double double69 = point62.y;
        point62.x = 10.0d;
        boolean boolean72 = point57.equals((java.lang.Object) point62);
        boolean boolean73 = point48.equals((java.lang.Object) point62);
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        point76.y = 1.0d;
        point76.x = 1.0d;
        boolean boolean83 = point76.equals((java.lang.Object) 'a');
        point76.x = 10.0d;
        boolean boolean86 = point62.equals((java.lang.Object) 10.0d);
        java.lang.Double double87 = point62.y;
        java.lang.Double double88 = point62.x;
        Point point91 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double92 = point91.x;
        java.lang.Double double93 = point91.y;
        point91.y = (-1.0d);
        boolean boolean96 = point62.equals((java.lang.Object) point91);
        java.lang.Double double97 = point91.x;
        Line line98 = new Line(point2, point91);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        Point point17 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.x;
        java.lang.Double double19 = point17.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean24 = point17.equals((java.lang.Object) double23);
        java.lang.Double double25 = point17.y;
        point17.y = 0.0d;
        point17.x = 1.0d;
        Line line30 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
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
        java.lang.Double double68 = point38.y;
        java.lang.Double double69 = point38.x;
        point38.x = 10.0d;
        Line line72 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
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
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        point30.y = 1.0d;
        point30.x = 1.0d;
        java.lang.Object obj36 = null;
        boolean boolean37 = point30.equals(obj36);
        java.lang.Double double38 = point30.x;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        java.lang.Double double45 = point41.y;
        point41.y = 100.0d;
        point41.y = (-1.0d);
        boolean boolean50 = point30.equals((java.lang.Object) point41);
        point30.x = 0.0d;
        Line line53 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 0.0d);
        Point point5 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double6 = point5.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        java.lang.Class<?> wildcardClass11 = point9.getClass();
        boolean boolean12 = point5.equals((java.lang.Object) wildcardClass11);
        point5.x = 0.0d;
        point5.y = 0.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        point19.x = 10.0d;
        java.lang.Double double27 = point19.y;
        point19.y = 0.0d;
        java.lang.Double double30 = point19.x;
        point19.y = (-1.0d);
        boolean boolean33 = point5.equals((java.lang.Object) point19);
        java.lang.Object obj34 = null;
        boolean boolean35 = point19.equals(obj34);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        point38.y = 1.0d;
        point38.x = 1.0d;
        java.lang.Double double44 = point38.x;
        boolean boolean45 = point19.equals((java.lang.Object) double44);
        boolean boolean46 = point2.equals((java.lang.Object) point19);
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point49.y = 1.0d;
        point49.y = (-1.0d);
        point49.y = 100.0d;
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        boolean boolean61 = point58.equals((java.lang.Object) 1L);
        point58.y = (-1.0d);
        java.lang.Double double64 = point58.y;
        java.lang.Double double65 = point58.y;
        java.lang.Double double66 = point58.x;
        boolean boolean67 = point49.equals((java.lang.Object) point58);
        point58.y = 0.0d;
        Point point72 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point72.x = 1.0d;
        point72.y = 1.0d;
        java.lang.Double double77 = point72.x;
        point72.x = (-1.0d);
        boolean boolean80 = point58.equals((java.lang.Object) point72);
        java.lang.Double double81 = point58.x;
        point58.y = (-1.0d);
        Line line84 = new Line(point19, point58);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
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
        Point point37 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point37.y = 0.0d;
        java.lang.Double double40 = point37.y;
        point37.x = 100.0d;
        point37.y = 0.0d;
        java.lang.Double double45 = point37.x;
        point37.x = 10.0d;
        point37.x = 0.0d;
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double53 = point52.x;
        boolean boolean54 = point37.equals((java.lang.Object) double53);
        Line line55 = new Line(point19, point37);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        boolean boolean8 = point5.equals((java.lang.Object) 1L);
        java.lang.Double double9 = point5.y;
        boolean boolean10 = point2.equals((java.lang.Object) double9);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.x = 10.0d;
        point2.x = 1.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        java.lang.Double double21 = point2.y;
        java.lang.Double double22 = point2.x;
        java.lang.Double double23 = point2.x;
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point26.y = 1.0d;
        java.lang.Double double29 = point26.y;
        java.lang.Double double30 = point26.y;
        point26.x = 0.0d;
        point26.y = (-1.0d);
        point26.x = 10.0d;
        point26.y = 0.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        point41.y = 1.0d;
        point41.x = 1.0d;
        java.lang.Double double47 = point41.y;
        java.lang.Double double48 = point41.y;
        point41.y = (-1.0d);
        point41.x = 0.0d;
        boolean boolean53 = point26.equals((java.lang.Object) point41);
        Line line54 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
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
        point2.x = 0.0d;
        Point point50 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        boolean boolean56 = point53.equals((java.lang.Object) 1L);
        java.lang.Double double57 = point53.y;
        boolean boolean58 = point50.equals((java.lang.Object) double57);
        java.lang.Double double59 = point50.y;
        java.lang.Double double60 = point50.x;
        point50.x = 100.0d;
        java.lang.Double double63 = point50.y;
        point50.y = 10.0d;
        point50.x = 1.0d;
        Point point70 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point73 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double74 = point73.y;
        point73.y = 10.0d;
        boolean boolean77 = point70.equals((java.lang.Object) point73);
        Point point80 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass81 = point80.getClass();
        boolean boolean82 = point73.equals((java.lang.Object) wildcardClass81);
        java.lang.Double double83 = point73.y;
        boolean boolean84 = point50.equals((java.lang.Object) double83);
        point50.x = 10.0d;
        java.lang.Double double87 = point50.y;
        java.lang.Double double88 = point50.x;
        Line line89 = new Line(point2, point50);
        org.junit.Assert.assertTrue("Contract failed: line89.equals(line89)", line89.equals(line89));
    }
}

