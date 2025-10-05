import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point7 = null;
        Line line8 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double4 = point3.x;
        Line line5 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line5.equals(line5)", line5.equals(line5));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean9 = point7.equals((java.lang.Object) true);
        boolean boolean10 = point2.equals((java.lang.Object) true);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        point2.y = 100.0d;
        Point point15 = null;
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        java.lang.Double double10 = point2.x;
        java.lang.Double double11 = point2.y;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        Point point22 = null;
        Line line23 = new Line(point11, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        java.lang.Double double7 = point3.y;
        Line line8 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.x;
        boolean boolean17 = point3.equals((java.lang.Object) double16);
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = (-1.0d);
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        point13.y = (-1.0d);
        java.lang.Double double18 = point13.x;
        java.lang.Double double19 = point13.x;
        point13.y = 1.0d;
        boolean boolean22 = point3.equals((java.lang.Object) point13);
        Line line23 = new Line(point0, point13);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.x;
        point3.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double16 = point12.y;
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = point12.equals(obj17);
        java.lang.Double double19 = point12.y;
        point12.x = 1.0d;
        boolean boolean22 = point3.equals((java.lang.Object) point12);
        Point point25 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean26 = point12.equals((java.lang.Object) point25);
        Line line27 = new Line(point0, point12);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.x;
        boolean boolean17 = point3.equals((java.lang.Object) double16);
        point3.y = 1.0d;
        point3.y = 1.0d;
        Line line22 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        boolean boolean11 = point2.equals((java.lang.Object) 0L);
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.y;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = 10.0d;
        point3.y = 10.0d;
        Line line13 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        Point point28 = null;
        Line line29 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 10.0d;
        java.lang.Double double10 = point3.y;
        point3.x = 10.0d;
        java.lang.Double double13 = point3.x;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        Point point27 = null;
        Line line28 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        point3.x = 1.0d;
        point3.y = (-1.0d);
        point3.y = 1.0d;
        java.lang.Double double20 = point3.y;
        point3.y = 0.0d;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        Point point22 = null;
        Line line23 = new Line(point8, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        point3.x = 100.0d;
        point3.x = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.x;
        boolean boolean16 = point13.equals((java.lang.Object) 10.0f);
        point13.x = 100.0d;
        java.lang.Double double19 = point13.x;
        point13.y = 1.0d;
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double25 = point24.y;
        point24.y = 10.0d;
        point24.y = (-1.0d);
        java.lang.Class<?> wildcardClass30 = point24.getClass();
        boolean boolean31 = point13.equals((java.lang.Object) wildcardClass30);
        java.lang.Double double32 = point13.y;
        point13.x = 1.0d;
        boolean boolean35 = point3.equals((java.lang.Object) point13);
        Line line36 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        Point point31 = null;
        Line line32 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.x = 1.0d;
        point2.x = 0.0d;
        point2.y = 100.0d;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        java.lang.Double double31 = point2.x;
        point2.y = (-1.0d);
        Point point34 = null;
        Line line35 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        java.lang.Class<?> wildcardClass9 = point7.getClass();
        boolean boolean10 = point3.equals((java.lang.Object) wildcardClass9);
        java.lang.Double double11 = point3.x;
        point3.x = 1.0d;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        Point point15 = null;
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        Point point23 = null;
        Line line24 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        point3.x = 10.0d;
        Line line9 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 10.0d;
        point2.x = 0.0d;
        Point point9 = null;
        Line line10 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point2.y = 100.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Object obj13 = null;
        boolean boolean14 = point7.equals(obj13);
        point7.x = 1.0d;
        java.lang.Class<?> wildcardClass17 = point7.getClass();
        boolean boolean18 = point2.equals((java.lang.Object) wildcardClass17);
        point2.y = 10.0d;
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.x;
        boolean boolean12 = point9.equals((java.lang.Object) 10.0f);
        point9.x = 100.0d;
        java.lang.Double double15 = point9.x;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point18.x = 100.0d;
        boolean boolean21 = point9.equals((java.lang.Object) 100.0d);
        point9.x = 10.0d;
        boolean boolean24 = point3.equals((java.lang.Object) point9);
        point9.y = (-1.0d);
        java.lang.Double double27 = point9.x;
        java.lang.Double double28 = point9.x;
        Line line29 = new Line(point0, point9);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point3 = null;
        Line line4 = new Line(point2, point3);
        org.junit.Assert.assertTrue("Contract failed: line4.equals(line4)", line4.equals(line4));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        Point point0 = null;
        Point point1 = null;
        Line line2 = new Line(point0, point1);
        org.junit.Assert.assertTrue("Contract failed: line2.equals(line2)", line2.equals(line2));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        point3.y = 0.0d;
        Line line8 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        point3.y = 0.0d;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 100.0d;
        java.lang.Double double19 = point15.y;
        java.lang.Object obj20 = null;
        boolean boolean21 = point15.equals(obj20);
        boolean boolean22 = point3.equals(obj20);
        java.lang.Double double23 = point3.x;
        Line line24 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point3.x = 100.0d;
        point3.y = 0.0d;
        point3.y = 10.0d;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.x = 10.0d;
        java.lang.Double double11 = point3.y;
        point3.y = 0.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        point16.y = 100.0d;
        boolean boolean20 = point3.equals((java.lang.Object) point16);
        point16.y = 1.0d;
        java.lang.Double double23 = point16.x;
        Line line24 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        point3.y = 1.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        point14.y = 10.0d;
        point14.y = (-1.0d);
        java.lang.Class<?> wildcardClass20 = point14.getClass();
        boolean boolean21 = point3.equals((java.lang.Object) wildcardClass20);
        java.lang.Double double22 = point3.y;
        point3.x = 1.0d;
        point3.x = 10.0d;
        Line line27 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.y;
        Line line11 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        java.lang.Double double53 = point51.y;
        java.lang.Double double54 = point51.x;
        java.lang.Double double55 = point51.x;
        boolean boolean56 = point2.equals((java.lang.Object) point51);
        Point point57 = null;
        Line line58 = new Line(point2, point57);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.x = 0.0d;
        point3.y = 1.0d;
        point3.y = 1.0d;
        point3.y = 100.0d;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        point2.y = (-1.0d);
        Point point29 = null;
        Line line30 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        Point point8 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.x;
        java.lang.Double double10 = point8.y;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.y;
        boolean boolean13 = point3.equals((java.lang.Object) point8);
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        Line line6 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        point32.y = (-1.0d);
        java.lang.Double double54 = point32.x;
        java.lang.Double double55 = point32.x;
        java.lang.Double double56 = point32.y;
        Point point59 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double60 = point59.x;
        java.lang.Double double61 = point59.y;
        point59.y = (-1.0d);
        java.lang.Class<?> wildcardClass64 = point59.getClass();
        boolean boolean65 = point32.equals((java.lang.Object) wildcardClass64);
        boolean boolean66 = point2.equals((java.lang.Object) point32);
        Point point67 = null;
        Line line68 = new Line(point2, point67);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean4 = point2.equals((java.lang.Object) (byte) 100);
        java.lang.Double double5 = point2.x;
        point2.x = (-1.0d);
        point2.x = 10.0d;
        point2.y = (-1.0d);
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        java.lang.Double double26 = point9.x;
        Point point27 = null;
        Line line28 = new Line(point9, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.y;
        Line line9 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.y = 1.0d;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.y;
        java.lang.Object obj8 = null;
        boolean boolean9 = point2.equals(obj8);
        Point point10 = null;
        Line line11 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        point3.y = (-1.0d);
        java.lang.Double double9 = point3.y;
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
        boolean boolean28 = point3.equals((java.lang.Object) point17);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 1.0d;
        boolean boolean38 = point31.equals((java.lang.Object) 'a');
        point31.x = 10.0d;
        boolean boolean41 = point17.equals((java.lang.Object) 10.0d);
        java.lang.Double double42 = point17.y;
        java.lang.Double double43 = point17.x;
        Point point46 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.x;
        java.lang.Double double48 = point46.y;
        point46.y = (-1.0d);
        boolean boolean51 = point17.equals((java.lang.Object) point46);
        Line line52 = new Line(point0, point46);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double7 = point2.y;
        Point point8 = null;
        Line line9 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = 0.0d;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point15.y = 0.0d;
        java.lang.Double double18 = point15.x;
        point15.x = 0.0d;
        boolean boolean21 = point2.equals((java.lang.Object) 0.0d);
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.y;
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        Point point43 = null;
        Line line44 = new Line(point5, point43);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        Point point36 = null;
        Line line37 = new Line(point26, point36);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point3.y = 1.0d;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point8.y = (-1.0d);
        java.lang.Double double11 = point8.y;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.x;
        boolean boolean17 = point14.equals((java.lang.Object) 10.0f);
        point14.x = 100.0d;
        java.lang.Double double20 = point14.x;
        point14.y = 1.0d;
        boolean boolean23 = point8.equals((java.lang.Object) point14);
        java.lang.Double double24 = point14.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        boolean boolean30 = point27.equals((java.lang.Object) 1L);
        java.lang.Double double31 = point27.y;
        java.lang.Double double32 = point27.y;
        boolean boolean33 = point14.equals((java.lang.Object) point27);
        java.lang.Double double34 = point14.x;
        boolean boolean35 = point3.equals((java.lang.Object) point14);
        Line line36 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        point14.y = 10.0d;
        point14.y = (-1.0d);
        java.lang.Object obj20 = null;
        boolean boolean21 = point14.equals(obj20);
        point14.x = (-1.0d);
        point14.y = (-1.0d);
        java.lang.Class<?> wildcardClass26 = point14.getClass();
        boolean boolean27 = point2.equals((java.lang.Object) wildcardClass26);
        Point point28 = null;
        Line line29 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        point3.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean20 = point17.equals((java.lang.Object) 1L);
        java.lang.Double double21 = point17.y;
        boolean boolean22 = point14.equals((java.lang.Object) double21);
        java.lang.Double double23 = point14.y;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 10.0d;
        boolean boolean33 = point26.equals((java.lang.Object) point29);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass37 = point36.getClass();
        boolean boolean38 = point29.equals((java.lang.Object) wildcardClass37);
        Point point41 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        boolean boolean44 = point29.equals((java.lang.Object) point41);
        boolean boolean45 = point14.equals((java.lang.Object) point29);
        boolean boolean46 = point3.equals((java.lang.Object) point14);
        point3.y = (-1.0d);
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
        java.lang.Double double75 = point51.x;
        java.lang.Class<?> wildcardClass76 = point51.getClass();
        boolean boolean77 = point3.equals((java.lang.Object) wildcardClass76);
        Line line78 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        Point point33 = null;
        Line line34 = new Line(point16, point33);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point7 = null;
        Line line8 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        point2.x = (-1.0d);
        Point point8 = null;
        Line line9 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        point2.y = 100.0d;
        point2.x = 100.0d;
        point2.y = 0.0d;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean14 = point2.equals((java.lang.Object) point12);
        Point point17 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean19 = point17.equals((java.lang.Object) (byte) 100);
        java.lang.Double double20 = point17.x;
        point17.x = (-1.0d);
        point17.x = 10.0d;
        point17.y = (-1.0d);
        point17.x = 10.0d;
        boolean boolean29 = point12.equals((java.lang.Object) point17);
        Point point30 = null;
        Line line31 = new Line(point12, point30);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        point39.y = 0.0d;
        Point point53 = null;
        Line line54 = new Line(point39, point53);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point3.y = 1.0d;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.y;
        point8.y = 0.0d;
        point8.x = 10.0d;
        point8.y = 1.0d;
        boolean boolean19 = point3.equals((java.lang.Object) 1.0d);
        point3.x = 1.0d;
        java.lang.Double double22 = point3.y;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.x = (-1.0d);
        point2.x = 100.0d;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        point2.x = 10.0d;
        java.lang.Double double14 = point2.y;
        Point point15 = null;
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        point7.y = (-1.0d);
        boolean boolean14 = point3.equals((java.lang.Object) point7);
        point3.x = 1.0d;
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
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
        boolean boolean34 = point2.equals((java.lang.Object) point14);
        Point point35 = null;
        Line line36 = new Line(point14, point35);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.y = 10.0d;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        point19.y = 10.0d;
        boolean boolean23 = point16.equals((java.lang.Object) point19);
        boolean boolean25 = point19.equals((java.lang.Object) 10.0d);
        boolean boolean26 = point3.equals((java.lang.Object) 10.0d);
        point3.y = 10.0d;
        point3.y = 1.0d;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point2.y = (-1.0d);
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
        point8.y = 100.0d;
        boolean boolean24 = point2.equals((java.lang.Object) point8);
        Point point25 = null;
        Line line26 = new Line(point8, point25);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        point3.y = 1.0d;
        java.lang.Double double12 = point3.x;
        Line line13 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double15 = point2.x;
        java.lang.Double double16 = point2.y;
        Point point17 = null;
        Line line18 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point10 = null;
        Line line11 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        point3.y = 100.0d;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double19 = point18.x;
        java.lang.Double double20 = point18.y;
        point18.y = 1.0d;
        boolean boolean23 = point3.equals((java.lang.Object) point18);
        java.lang.Double double24 = point3.x;
        Line line25 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 100.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.x = 0.0d;
        point3.y = (-1.0d);
        point3.y = 0.0d;
        point3.x = (-1.0d);
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        java.lang.Double double6 = point3.y;
        Line line7 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        Line line5 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line5.equals(line5)", line5.equals(line5));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.x;
        point3.x = 1.0d;
        java.lang.Double double7 = point3.x;
        java.lang.Double double8 = point3.x;
        java.lang.Double double9 = point3.y;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.y;
        boolean boolean15 = point3.equals((java.lang.Object) point12);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point18.y = 0.0d;
        java.lang.Double double21 = point18.y;
        boolean boolean22 = point12.equals((java.lang.Object) point18);
        java.lang.Double double23 = point18.x;
        Line line24 = new Line(point0, point18);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        point19.x = 0.0d;
        boolean boolean31 = point3.equals((java.lang.Object) 0.0d);
        point3.y = (-1.0d);
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        point36.y = 0.0d;
        point36.y = 1.0d;
        point36.y = 1.0d;
        java.lang.Double double47 = point36.y;
        boolean boolean48 = point3.equals((java.lang.Object) point36);
        point3.y = (-1.0d);
        Line line51 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        java.lang.Double double51 = point42.x;
        point42.x = 10.0d;
        Point point54 = null;
        Line line55 = new Line(point42, point54);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.x;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.lang.Double double34 = point16.x;
        java.lang.Double double35 = point16.x;
        Point point36 = null;
        Line line37 = new Line(point16, point36);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        point19.y = 0.0d;
        boolean boolean23 = point3.equals((java.lang.Object) point19);
        java.lang.Double double24 = point19.y;
        Line line25 = new Line(point0, point19);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double10 = point9.y;
        point9.y = 10.0d;
        boolean boolean13 = point2.equals((java.lang.Object) 10.0d);
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
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point34.y = 10.0d;
        java.lang.Double double37 = point34.x;
        java.lang.Double double38 = point34.x;
        java.lang.Double double39 = point34.x;
        java.lang.Class<?> wildcardClass40 = point34.getClass();
        boolean boolean41 = point17.equals((java.lang.Object) wildcardClass40);
        java.lang.Double double42 = point17.y;
        point17.x = 100.0d;
        boolean boolean45 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double46 = point2.x;
        boolean boolean48 = point2.equals((java.lang.Object) 1.0f);
        Point point49 = null;
        Line line50 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        boolean boolean12 = point9.equals((java.lang.Object) 1L);
        java.lang.Double double13 = point9.y;
        boolean boolean14 = point6.equals((java.lang.Object) double13);
        point6.x = 10.0d;
        java.lang.Double double17 = point6.x;
        point6.x = 10.0d;
        boolean boolean20 = point3.equals((java.lang.Object) point6);
        Line line21 = new Line(point0, point6);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        point3.y = 0.0d;
        Line line7 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        java.lang.Double double10 = point3.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point13.y = 100.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        boolean boolean18 = point3.equals((java.lang.Object) double17);
        Line line19 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = (-1.0d);
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        point10.y = 10.0d;
        boolean boolean14 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Double double15 = point3.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.y;
        point18.y = 1.0d;
        point18.y = 100.0d;
        point18.y = 0.0d;
        java.lang.Double double31 = point18.y;
        java.lang.Double double32 = point18.y;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point35.y = 10.0d;
        java.lang.Double double38 = point35.x;
        java.lang.Double double39 = point35.x;
        java.lang.Double double40 = point35.x;
        java.lang.Class<?> wildcardClass41 = point35.getClass();
        boolean boolean42 = point18.equals((java.lang.Object) wildcardClass41);
        java.lang.Double double43 = point18.y;
        point18.x = 100.0d;
        boolean boolean46 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double47 = point3.x;
        Line line48 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point6.x = 1.0d;
        point6.y = 1.0d;
        boolean boolean11 = point3.equals((java.lang.Object) 1.0d);
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.x;
        java.lang.Double double14 = point3.x;
        java.lang.Double double15 = point3.x;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.x;
        boolean boolean17 = point3.equals((java.lang.Object) double16);
        java.lang.Double double18 = point3.y;
        Line line19 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        java.lang.Double double8 = point6.y;
        boolean boolean9 = point3.equals((java.lang.Object) point6);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.y;
        boolean boolean15 = point6.equals((java.lang.Object) double14);
        point6.y = 1.0d;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        boolean boolean23 = point20.equals((java.lang.Object) 1L);
        java.lang.Double double24 = point20.y;
        point20.y = 100.0d;
        point20.x = 10.0d;
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        java.lang.Double double33 = point31.y;
        java.lang.Double double34 = point31.x;
        point31.x = 0.0d;
        java.lang.Double double37 = point31.y;
        boolean boolean38 = point20.equals((java.lang.Object) point31);
        boolean boolean39 = point6.equals((java.lang.Object) point20);
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point42.y = 0.0d;
        java.lang.Double double45 = point42.y;
        java.lang.Double double46 = point42.x;
        Point point49 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double50 = point49.y;
        java.lang.Double double51 = point49.y;
        boolean boolean52 = point42.equals((java.lang.Object) point49);
        point42.y = 100.0d;
        java.lang.Double double55 = point42.y;
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point58.x = 0.0d;
        point58.x = 1.0d;
        java.lang.Class<?> wildcardClass63 = point58.getClass();
        boolean boolean64 = point42.equals((java.lang.Object) point58);
        boolean boolean65 = point20.equals((java.lang.Object) point42);
        Line line66 = new Line(point0, point42);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        boolean boolean10 = point3.equals((java.lang.Object) 'a');
        point3.x = 10.0d;
        point3.x = 0.0d;
        java.lang.Double double15 = point3.y;
        point3.y = 1.0d;
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean10 = point8.equals((java.lang.Object) true);
        boolean boolean11 = point3.equals((java.lang.Object) true);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.y;
        point3.x = 100.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.y = (-1.0d);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        point8.x = 100.0d;
        point8.x = 10.0d;
        java.lang.Double double16 = point8.y;
        point8.y = 0.0d;
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 100.0d;
        boolean boolean25 = point8.equals((java.lang.Object) point21);
        point21.y = 1.0d;
        java.lang.Double double28 = point21.x;
        boolean boolean29 = point3.equals((java.lang.Object) double28);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point32.x = 0.0d;
        point32.x = 1.0d;
        point32.x = (-1.0d);
        boolean boolean39 = point3.equals((java.lang.Object) (-1.0d));
        Line line40 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean10 = point8.equals((java.lang.Object) true);
        boolean boolean11 = point3.equals((java.lang.Object) true);
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean17 = point3.equals((java.lang.Object) double16);
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point3.y = (-1.0d);
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.y;
        point3.x = 10.0d;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 10.0d;
        boolean boolean12 = point3.equals((java.lang.Object) point8);
        point8.x = 1.0d;
        point8.x = 0.0d;
        Line line17 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point16.equals((java.lang.Object) double23);
        java.lang.Double double25 = point16.y;
        boolean boolean26 = point3.equals((java.lang.Object) point16);
        java.lang.Double double27 = point16.y;
        point16.x = 1.0d;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double33 = point32.y;
        point32.y = 10.0d;
        boolean boolean37 = point32.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass38 = point32.getClass();
        boolean boolean39 = point16.equals((java.lang.Object) wildcardClass38);
        java.lang.Double double40 = point16.x;
        Line line41 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.x;
        boolean boolean10 = point7.equals((java.lang.Object) 10.0f);
        point7.x = 100.0d;
        java.lang.Double double13 = point7.x;
        point7.y = 1.0d;
        point7.y = 1.0d;
        boolean boolean18 = point3.equals((java.lang.Object) point7);
        point7.y = (-1.0d);
        point7.y = 1.0d;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point25.y = 1.0d;
        point25.y = (-1.0d);
        java.lang.Double double30 = point25.y;
        java.lang.Double double31 = point25.y;
        java.lang.Double double32 = point25.y;
        point25.y = 100.0d;
        java.lang.Double double35 = point25.x;
        boolean boolean36 = point7.equals((java.lang.Object) point25);
        Line line37 = new Line(point0, point25);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        point7.y = (-1.0d);
        boolean boolean14 = point3.equals((java.lang.Object) point7);
        java.lang.Double double15 = point7.x;
        java.lang.Double double16 = point7.x;
        Line line17 = new Line(point0, point7);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        point3.y = 0.0d;
        java.lang.Double double25 = point3.y;
        java.lang.Double double26 = point3.y;
        Point point29 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.x;
        java.lang.Double double31 = point29.y;
        java.lang.Double double32 = point29.y;
        point29.x = 100.0d;
        java.lang.Class<?> wildcardClass35 = point29.getClass();
        boolean boolean36 = point3.equals((java.lang.Object) wildcardClass35);
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        java.lang.Double double42 = point39.y;
        java.lang.Double double43 = point39.x;
        Point point46 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double47 = point46.y;
        java.lang.Double double48 = point46.y;
        boolean boolean49 = point39.equals((java.lang.Object) point46);
        boolean boolean50 = point3.equals((java.lang.Object) point39);
        java.lang.Double double51 = point39.x;
        java.lang.Double double52 = point39.y;
        Point point55 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point58.x = 1.0d;
        point58.x = 1.0d;
        boolean boolean63 = point55.equals((java.lang.Object) 1.0d);
        boolean boolean64 = point39.equals((java.lang.Object) point55);
        Line line65 = new Line(point0, point39);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        java.lang.Double double6 = point3.x;
        point3.y = 0.0d;
        boolean boolean10 = point3.equals((java.lang.Object) '#');
        point3.x = 0.0d;
        point3.y = 100.0d;
        point3.x = 10.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        boolean boolean25 = point19.equals((java.lang.Object) point22);
        point19.x = 10.0d;
        boolean boolean28 = point3.equals((java.lang.Object) 10.0d);
        point3.y = 0.0d;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        point6.y = 10.0d;
        boolean boolean10 = point3.equals((java.lang.Object) point6);
        point3.y = 0.0d;
        java.lang.Double double13 = point3.x;
        java.lang.Double double14 = point3.x;
        java.lang.Double double15 = point3.x;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Object obj9 = null;
        boolean boolean10 = point3.equals(obj9);
        java.lang.Double double11 = point3.x;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        boolean boolean17 = point14.equals((java.lang.Object) 1L);
        java.lang.Double double18 = point14.y;
        point14.y = 100.0d;
        point14.y = (-1.0d);
        boolean boolean23 = point3.equals((java.lang.Object) point14);
        point14.x = (-1.0d);
        java.lang.Double double26 = point14.y;
        point14.x = 1.0d;
        Line line29 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 10.0d;
        java.lang.Double double10 = point3.y;
        point3.x = 10.0d;
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
        boolean boolean40 = point3.equals((java.lang.Object) 1.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        boolean boolean46 = point43.equals((java.lang.Object) 1L);
        point43.y = (-1.0d);
        java.lang.Double double49 = point43.y;
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point52.x = 100.0d;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.y;
        point57.y = 1.0d;
        point57.x = 1.0d;
        java.lang.Double double63 = point57.y;
        java.lang.Double double64 = point57.y;
        point57.x = 10.0d;
        boolean boolean67 = point52.equals((java.lang.Object) point57);
        boolean boolean68 = point43.equals((java.lang.Object) point57);
        Point point71 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        point71.y = 1.0d;
        point71.x = 1.0d;
        boolean boolean78 = point71.equals((java.lang.Object) 'a');
        point71.x = 10.0d;
        boolean boolean81 = point57.equals((java.lang.Object) 10.0d);
        java.lang.Double double82 = point57.y;
        boolean boolean83 = point3.equals((java.lang.Object) double82);
        point3.x = 1.0d;
        java.lang.Double double86 = point3.x;
        Line line87 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line87.equals(line87)", line87.equals(line87));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        point3.x = 1.0d;
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        point3.y = 0.0d;
        point3.x = (-1.0d);
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        point3.x = 100.0d;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 100.0d;
        point3.x = (-1.0d);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.y;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj17 = null;
        boolean boolean18 = point16.equals(obj17);
        boolean boolean19 = point3.equals((java.lang.Object) point16);
        java.lang.Double double20 = point16.x;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.x;
        boolean boolean30 = point27.equals((java.lang.Object) 10.0f);
        point27.x = 100.0d;
        java.lang.Double double33 = point27.x;
        point27.y = 1.0d;
        point27.y = 1.0d;
        boolean boolean38 = point23.equals((java.lang.Object) point27);
        boolean boolean39 = point16.equals((java.lang.Object) point27);
        Line line40 = new Line(point0, point27);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double26 = point3.x;
        java.lang.Double double27 = point3.y;
        java.lang.Double double28 = point3.y;
        Line line29 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point8.y = 10.0d;
        java.lang.Double double11 = point8.x;
        point8.y = 1.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 100.0d;
        point16.y = 10.0d;
        point16.y = 10.0d;
        point16.x = 0.0d;
        boolean boolean28 = point8.equals((java.lang.Object) point16);
        java.lang.Double double29 = point8.y;
        java.lang.Double double30 = point8.y;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point33.y = 0.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.x;
        point33.x = 10.0d;
        boolean boolean40 = point8.equals((java.lang.Object) point33);
        boolean boolean41 = point3.equals((java.lang.Object) boolean40);
        point3.x = 10.0d;
        java.lang.Double double44 = point3.y;
        Line line45 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.y;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        point7.y = (-1.0d);
        boolean boolean14 = point3.equals((java.lang.Object) point7);
        java.lang.Double double15 = point7.x;
        point7.x = 0.0d;
        java.lang.Double double18 = point7.x;
        Line line19 = new Line(point0, point7);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        java.lang.Double double8 = point6.y;
        boolean boolean9 = point3.equals((java.lang.Object) point6);
        java.lang.Double double10 = point6.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean15 = point6.equals((java.lang.Object) double14);
        java.lang.Double double16 = point6.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 0.0d;
        point19.y = 1.0d;
        java.lang.Double double24 = point19.x;
        point19.x = 0.0d;
        java.lang.Double double27 = point19.y;
        java.lang.Double double28 = point19.x;
        boolean boolean29 = point6.equals((java.lang.Object) point19);
        Line line30 = new Line(point0, point6);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point3.y = 10.0d;
        Line line6 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.y = 0.0d;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        java.lang.Double double14 = point11.x;
        boolean boolean15 = point3.equals((java.lang.Object) double14);
        point3.x = (-1.0d);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 0.0d;
        point20.y = (-1.0d);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 10.0d);
        boolean boolean28 = point20.equals((java.lang.Object) 100.0d);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        java.lang.Double double35 = point31.y;
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = point31.equals(obj36);
        point31.x = 1.0d;
        point31.y = 0.0d;
        java.lang.Double double42 = point31.x;
        boolean boolean43 = point20.equals((java.lang.Object) point31);
        point20.y = 100.0d;
        point20.x = (-1.0d);
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 0.0d;
        point50.x = 1.0d;
        point50.x = (-1.0d);
        boolean boolean58 = point20.equals((java.lang.Object) (-1.0d));
        java.lang.Double double59 = point20.y;
        boolean boolean60 = point3.equals((java.lang.Object) point20);
        Line line61 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point3.y = 10.0d;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
        java.lang.Double double8 = point3.x;
        point3.y = (-1.0d);
        Line line11 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 10.0d;
        java.lang.Double double10 = point3.y;
        point3.x = 10.0d;
        point3.x = 0.0d;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.y;
        java.lang.Double double23 = point17.y;
        point17.y = 1.0d;
        point17.y = 1.0d;
        point17.y = 100.0d;
        java.lang.Double double30 = point17.y;
        java.lang.Double double31 = point17.x;
        java.lang.Double double32 = point17.x;
        boolean boolean33 = point3.equals((java.lang.Object) point17);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        point36.x = 100.0d;
        java.lang.Double double42 = point36.y;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point45.y = 0.0d;
        java.lang.Double double48 = point45.y;
        java.lang.Double double49 = point45.x;
        boolean boolean50 = point36.equals((java.lang.Object) double49);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean55 = point53.equals((java.lang.Object) true);
        point53.y = 100.0d;
        point53.y = 1.0d;
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point65.x = 1.0d;
        point65.y = 1.0d;
        boolean boolean70 = point62.equals((java.lang.Object) 1.0d);
        java.lang.Double double71 = point62.y;
        boolean boolean72 = point53.equals((java.lang.Object) point62);
        boolean boolean73 = point36.equals((java.lang.Object) point62);
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point79 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double80 = point79.y;
        java.lang.Double double81 = point79.y;
        boolean boolean82 = point76.equals((java.lang.Object) point79);
        Point point85 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double86 = point85.y;
        java.lang.Double double87 = point85.y;
        boolean boolean88 = point79.equals((java.lang.Object) double87);
        java.lang.Double double89 = point79.x;
        boolean boolean90 = point36.equals((java.lang.Object) double89);
        boolean boolean91 = point3.equals((java.lang.Object) point36);
        Line line92 = new Line(point0, point36);
        org.junit.Assert.assertTrue("Contract failed: line92.equals(line92)", line92.equals(line92));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.y;
        point19.y = 10.0d;
        boolean boolean23 = point16.equals((java.lang.Object) point19);
        point16.y = 1.0d;
        boolean boolean26 = point3.equals((java.lang.Object) point16);
        Line line27 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        point3.y = 100.0d;
        point3.x = 100.0d;
        point3.y = 0.0d;
        point3.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point19.y = 10.0d;
        java.lang.Double double22 = point19.x;
        boolean boolean23 = point3.equals((java.lang.Object) point19);
        Line line24 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Double double11 = point3.x;
        point3.y = 0.0d;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        Point point8 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.y;
        point8.x = 100.0d;
        boolean boolean12 = point3.equals((java.lang.Object) point8);
        point8.y = 100.0d;
        java.lang.Double double15 = point8.x;
        java.lang.Double double16 = point8.y;
        Line line17 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double16 = point3.y;
        java.lang.Double double17 = point3.y;
        java.lang.Double double18 = point3.x;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean23 = point21.equals((java.lang.Object) true);
        point21.y = 100.0d;
        point21.y = 1.0d;
        java.lang.Double double28 = point21.x;
        java.lang.Double double29 = point21.y;
        point21.x = 1.0d;
        point21.y = (-1.0d);
        boolean boolean34 = point3.equals((java.lang.Object) point21);
        point3.y = 100.0d;
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 1.0d;
        point3.y = 100.0d;
        java.lang.Double double16 = point3.y;
        java.lang.Double double17 = point3.x;
        java.lang.Double double18 = point3.x;
        point3.y = (-1.0d);
        point3.x = 100.0d;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        point3.x = 1.0d;
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        java.lang.Double double14 = point3.x;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.x;
        boolean boolean20 = point17.equals((java.lang.Object) 10.0f);
        point17.x = 100.0d;
        java.lang.Double double23 = point17.x;
        point17.y = 1.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        point28.y = (-1.0d);
        java.lang.Class<?> wildcardClass34 = point28.getClass();
        boolean boolean35 = point17.equals((java.lang.Object) wildcardClass34);
        boolean boolean36 = point3.equals((java.lang.Object) boolean35);
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        point19.x = 0.0d;
        boolean boolean31 = point3.equals((java.lang.Object) 0.0d);
        point3.x = 100.0d;
        point3.x = 1.0d;
        Line line36 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double13 = point12.x;
        java.lang.Double double14 = point12.y;
        point12.y = (-1.0d);
        java.lang.Double double17 = point12.y;
        java.lang.Double double18 = point12.x;
        boolean boolean19 = point3.equals((java.lang.Object) double18);
        point3.y = 1.0d;
        point3.y = 0.0d;
        point3.x = 1.0d;
        Line line26 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        point3.y = 0.0d;
        point3.x = 0.0d;
        point3.y = 100.0d;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        point3.y = 100.0d;
        java.lang.Double double13 = point3.y;
        point3.x = 0.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = (-1.0d);
        java.lang.Double double6 = point3.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.x;
        boolean boolean12 = point9.equals((java.lang.Object) 10.0f);
        point9.x = 100.0d;
        java.lang.Double double15 = point9.x;
        point9.y = 1.0d;
        boolean boolean18 = point3.equals((java.lang.Object) point9);
        point9.x = 1.0d;
        point9.x = 10.0d;
        java.lang.Object obj23 = null;
        boolean boolean24 = point9.equals(obj23);
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        java.lang.Double double32 = point30.y;
        boolean boolean33 = point27.equals((java.lang.Object) point30);
        java.lang.Double double34 = point30.x;
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean39 = point30.equals((java.lang.Object) double38);
        java.lang.Double double40 = point30.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 0.0d;
        point43.y = 1.0d;
        java.lang.Double double48 = point43.x;
        point43.x = 0.0d;
        java.lang.Double double51 = point43.y;
        java.lang.Double double52 = point43.x;
        boolean boolean53 = point30.equals((java.lang.Object) point43);
        boolean boolean54 = point9.equals((java.lang.Object) point43);
        Line line55 = new Line(point0, point9);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.y;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        java.lang.Double double12 = point10.x;
        point10.y = 0.0d;
        java.lang.Double double15 = point10.x;
        java.lang.Double double16 = point10.y;
        boolean boolean17 = point3.equals((java.lang.Object) point10);
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        point3.x = 100.0d;
        point3.x = 0.0d;
        java.lang.Double double11 = point3.y;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        point3.x = 0.0d;
        point3.x = 10.0d;
        point3.y = 10.0d;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.x;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean18 = point16.equals((java.lang.Object) true);
        boolean boolean19 = point11.equals((java.lang.Object) true);
        java.lang.Double double20 = point11.y;
        java.lang.Double double21 = point11.y;
        point11.y = 100.0d;
        point11.y = 100.0d;
        java.lang.Double double26 = point11.x;
        boolean boolean27 = point3.equals((java.lang.Object) double26);
        Line line28 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.x = 10.0d;
        java.lang.Double double11 = point3.y;
        point3.y = 0.0d;
        point3.x = 10.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        point3.x = 10.0d;
        java.lang.Double double14 = point3.x;
        point3.x = 10.0d;
        java.lang.Double double17 = point3.x;
        point3.y = 1.0d;
        java.lang.Double double20 = point3.y;
        point3.x = 100.0d;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.x;
        java.lang.Double double12 = point3.x;
        point3.x = (-1.0d);
        java.lang.Double double15 = point3.y;
        java.lang.Double double16 = point3.x;
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        point3.y = 0.0d;
        point3.y = 10.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        java.lang.Double double34 = point29.y;
        point29.y = 0.0d;
        boolean boolean37 = point3.equals((java.lang.Object) point29);
        Line line38 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        point3.y = (-1.0d);
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.x;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.y;
        point3.x = 100.0d;
        java.lang.Double double14 = point3.y;
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.y;
        point17.x = 100.0d;
        point17.y = 0.0d;
        java.lang.Double double25 = point17.x;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.y = (-1.0d);
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.x;
        java.lang.Double double44 = point38.x;
        point38.y = 1.0d;
        boolean boolean47 = point28.equals((java.lang.Object) point38);
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean52 = point50.equals((java.lang.Object) (byte) 100);
        java.lang.Double double53 = point50.x;
        point50.x = (-1.0d);
        boolean boolean56 = point38.equals((java.lang.Object) point50);
        java.lang.Double double57 = point38.x;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double61 = point60.y;
        point60.y = 1.0d;
        point60.x = 100.0d;
        point60.x = 10.0d;
        point60.x = 10.0d;
        point60.x = 10.0d;
        point60.x = 10.0d;
        point60.y = 10.0d;
        boolean boolean76 = point38.equals((java.lang.Object) point60);
        java.lang.Double double77 = point60.x;
        boolean boolean78 = point17.equals((java.lang.Object) point60);
        boolean boolean79 = point3.equals((java.lang.Object) point60);
        Line line80 = new Line(point0, point60);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.x = 1.0d;
        Line line6 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        point3.y = 0.0d;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.y;
        point8.y = 10.0d;
        java.lang.Double double15 = point8.y;
        point8.x = 0.0d;
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.x;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        point24.y = (-1.0d);
        boolean boolean29 = point20.equals((java.lang.Object) point24);
        boolean boolean30 = point8.equals((java.lang.Object) point24);
        point8.x = 0.0d;
        boolean boolean33 = point3.equals((java.lang.Object) point8);
        Line line34 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.x;
        java.lang.Double double17 = point14.x;
        point14.y = 0.0d;
        boolean boolean21 = point14.equals((java.lang.Object) '#');
        point14.x = 0.0d;
        point14.y = 100.0d;
        java.lang.Double double26 = point14.x;
        boolean boolean27 = point3.equals((java.lang.Object) double26);
        java.lang.Double double28 = point3.x;
        Line line29 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass26 = point25.getClass();
        boolean boolean27 = point18.equals((java.lang.Object) wildcardClass26);
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point30.x = 1.0d;
        boolean boolean33 = point18.equals((java.lang.Object) point30);
        boolean boolean34 = point3.equals((java.lang.Object) point18);
        java.lang.Double double35 = point3.x;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double39 = point38.y;
        java.lang.Double double40 = point38.y;
        Point point43 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double44 = point43.y;
        point43.x = 100.0d;
        boolean boolean47 = point38.equals((java.lang.Object) point43);
        java.lang.Double double48 = point43.y;
        boolean boolean49 = point3.equals((java.lang.Object) point43);
        point3.y = 1.0d;
        point3.x = 0.0d;
        Line line54 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        point3.y = 100.0d;
        point3.x = (-1.0d);
        point3.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        java.lang.Double double25 = point18.y;
        point18.y = 100.0d;
        point18.y = 0.0d;
        boolean boolean30 = point3.equals((java.lang.Object) 0.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point33.x = 1.0d;
        point33.y = 1.0d;
        java.lang.Double double38 = point33.x;
        point33.x = (-1.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 100.0d;
        point43.x = 10.0d;
        java.lang.Double double51 = point43.y;
        boolean boolean52 = point33.equals((java.lang.Object) double51);
        point33.y = (-1.0d);
        java.lang.Double double55 = point33.x;
        java.lang.Double double56 = point33.x;
        java.lang.Double double57 = point33.y;
        Point point60 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.x;
        java.lang.Double double62 = point60.y;
        point60.y = (-1.0d);
        java.lang.Class<?> wildcardClass65 = point60.getClass();
        boolean boolean66 = point33.equals((java.lang.Object) wildcardClass65);
        boolean boolean67 = point3.equals((java.lang.Object) point33);
        Line line68 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point2.x = 1.0d;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass26 = point25.getClass();
        boolean boolean27 = point18.equals((java.lang.Object) wildcardClass26);
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point30.x = 1.0d;
        boolean boolean33 = point18.equals((java.lang.Object) point30);
        boolean boolean34 = point3.equals((java.lang.Object) point18);
        java.lang.Double double35 = point3.x;
        java.lang.Double double36 = point3.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.y;
        point39.y = 10.0d;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point49.x = 0.0d;
        point49.y = 1.0d;
        java.lang.Double double54 = point49.x;
        java.lang.Double double55 = point49.x;
        boolean boolean56 = point39.equals((java.lang.Object) point49);
        boolean boolean57 = point3.equals((java.lang.Object) point49);
        point3.x = (-1.0d);
        java.lang.Double double60 = point3.x;
        Point point63 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point63.y = 1.0d;
        java.lang.Double double66 = point63.y;
        java.lang.Double double67 = point63.y;
        point63.y = 0.0d;
        java.lang.Double double70 = point63.x;
        java.lang.Double double71 = point63.y;
        point63.y = 100.0d;
        boolean boolean74 = point3.equals((java.lang.Object) point63);
        Line line75 = new Line(point0, point63);
        org.junit.Assert.assertTrue("Contract failed: line75.equals(line75)", line75.equals(line75));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = (-1.0d);
        java.lang.Double double6 = point3.x;
        point3.x = (-1.0d);
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean18 = point16.equals((java.lang.Object) true);
        boolean boolean19 = point11.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass20 = point11.getClass();
        boolean boolean21 = point3.equals((java.lang.Object) wildcardClass20);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        point24.x = 1.0d;
        java.lang.Object obj30 = null;
        boolean boolean31 = point24.equals(obj30);
        point24.x = 1.0d;
        point24.x = (-1.0d);
        java.lang.Double double36 = point24.x;
        boolean boolean37 = point3.equals((java.lang.Object) point24);
        point24.y = 10.0d;
        java.lang.Double double40 = point24.x;
        java.lang.Double double41 = point24.y;
        Line line42 = new Line(point0, point24);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 100.0d;
        point3.x = (-1.0d);
        point3.x = (-1.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.x;
        boolean boolean19 = point16.equals((java.lang.Object) 10.0f);
        point16.x = 100.0d;
        java.lang.Double double22 = point16.x;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point25.x = 100.0d;
        boolean boolean28 = point16.equals((java.lang.Object) 100.0d);
        java.lang.Double double29 = point16.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 100.0d;
        java.lang.Double double38 = point32.x;
        boolean boolean39 = point16.equals((java.lang.Object) point32);
        boolean boolean40 = point3.equals((java.lang.Object) point32);
        java.lang.Double double41 = point3.y;
        java.lang.Double double42 = point3.y;
        java.lang.Double double43 = point3.y;
        java.lang.Double double44 = point3.x;
        point3.y = 1.0d;
        Line line47 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.y;
        Line line9 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        java.lang.Double double6 = point3.x;
        point3.y = 0.0d;
        boolean boolean10 = point3.equals((java.lang.Object) '#');
        point3.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        java.lang.Double double21 = point15.y;
        point15.y = 100.0d;
        point15.x = (-1.0d);
        java.lang.Double double26 = point15.x;
        point15.y = 0.0d;
        boolean boolean29 = point3.equals((java.lang.Object) 0.0d);
        Line line30 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 0.0d;
        java.lang.Double double15 = point12.y;
        java.lang.Double double16 = point12.x;
        boolean boolean17 = point3.equals((java.lang.Object) double16);
        point3.y = 1.0d;
        java.lang.Double double20 = point3.x;
        point3.y = (-1.0d);
        point3.x = (-1.0d);
        Line line25 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        point3.y = (-1.0d);
        java.lang.Double double25 = point3.x;
        java.lang.Double double26 = point3.x;
        java.lang.Double double27 = point3.x;
        java.lang.Double double28 = point3.y;
        java.lang.Double double29 = point3.y;
        java.lang.Double double30 = point3.x;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Object obj3 = null;
        boolean boolean4 = point2.equals(obj3);
        java.lang.Double double5 = point2.x;
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point11.x = 0.0d;
        point11.x = 1.0d;
        boolean boolean16 = point3.equals((java.lang.Object) point11);
        java.lang.Double double17 = point11.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point20.x = 0.0d;
        point20.x = 1.0d;
        point20.x = (-1.0d);
        point20.y = 10.0d;
        boolean boolean29 = point11.equals((java.lang.Object) 10.0d);
        point11.x = 100.0d;
        Line line32 = new Line(point0, point11);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.x;
        point3.y = 1.0d;
        java.lang.Double double11 = point3.x;
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 1.0d;
        java.lang.Object obj21 = null;
        boolean boolean22 = point15.equals(obj21);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point25.y = 0.0d;
        java.lang.Double double28 = point25.y;
        java.lang.Double double29 = point25.x;
        point25.x = 1.0d;
        boolean boolean32 = point15.equals((java.lang.Object) 1.0d);
        boolean boolean33 = point3.equals((java.lang.Object) point15);
        point3.x = (-1.0d);
        java.lang.Double double36 = point3.x;
        point3.x = 100.0d;
        Line line39 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        point3.y = 0.0d;
        point3.y = 0.0d;
        point3.x = (-1.0d);
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        boolean boolean28 = point25.equals((java.lang.Object) 1L);
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.x;
        boolean boolean34 = point31.equals((java.lang.Object) 10.0f);
        point31.x = 100.0d;
        boolean boolean37 = point25.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass38 = point25.getClass();
        boolean boolean39 = point22.equals((java.lang.Object) wildcardClass38);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point45 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.y;
        java.lang.Double double47 = point45.y;
        boolean boolean48 = point42.equals((java.lang.Object) point45);
        point42.x = 10.0d;
        boolean boolean51 = point22.equals((java.lang.Object) point42);
        point22.x = 10.0d;
        point22.y = 100.0d;
        point22.x = (-1.0d);
        java.lang.Double double58 = point22.x;
        java.lang.Double double59 = point22.y;
        java.lang.Class<?> wildcardClass60 = point22.getClass();
        boolean boolean61 = point3.equals((java.lang.Object) wildcardClass60);
        Line line62 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean5 = point3.equals((java.lang.Object) (byte) 100);
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.y;
        java.lang.Double double13 = point8.x;
        java.lang.Double double14 = point8.y;
        point8.y = (-1.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        java.lang.Double double23 = point19.y;
        java.lang.Object obj24 = new java.lang.Object();
        boolean boolean25 = point19.equals(obj24);
        point19.x = 1.0d;
        java.lang.Double double28 = point19.x;
        point19.y = 0.0d;
        java.lang.Class<?> wildcardClass31 = point19.getClass();
        boolean boolean32 = point8.equals((java.lang.Object) wildcardClass31);
        boolean boolean33 = point3.equals((java.lang.Object) point8);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = point3.equals(obj34);
        java.lang.Double double37 = point3.y;
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        java.lang.Double double42 = point40.x;
        boolean boolean43 = point3.equals((java.lang.Object) double42);
        Line line44 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point6.y = 1.0d;
        point6.y = (-1.0d);
        java.lang.Double double11 = point6.y;
        point6.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass17 = point16.getClass();
        boolean boolean18 = point6.equals((java.lang.Object) point16);
        boolean boolean19 = point3.equals((java.lang.Object) point6);
        point3.y = (-1.0d);
        java.lang.Double double22 = point3.y;
        point3.y = (-1.0d);
        java.lang.Double double25 = point3.x;
        point3.x = 0.0d;
        java.lang.Double double28 = point3.x;
        Line line29 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 10.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.x;
        boolean boolean15 = point12.equals((java.lang.Object) 10.0f);
        point12.x = 100.0d;
        java.lang.Double double18 = point12.x;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point21.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        java.lang.Double double25 = point12.y;
        point12.y = 100.0d;
        boolean boolean28 = point3.equals((java.lang.Object) point12);
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
        boolean boolean79 = point12.equals((java.lang.Object) point55);
        point12.x = 1.0d;
        Line line82 = new Line(point0, point12);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point3 = null;
        Line line4 = new Line(point2, point3);
        org.junit.Assert.assertTrue("Contract failed: line4.equals(line4)", line4.equals(line4));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        point6.y = 10.0d;
        boolean boolean10 = point3.equals((java.lang.Object) point6);
        point3.y = 0.0d;
        java.lang.Double double13 = point3.x;
        java.lang.Double double14 = point3.y;
        point3.y = (-1.0d);
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        point36.x = 100.0d;
        java.lang.Double double42 = point36.y;
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point45.y = 0.0d;
        java.lang.Double double48 = point45.y;
        java.lang.Double double49 = point45.x;
        boolean boolean50 = point36.equals((java.lang.Object) double49);
        java.lang.Double double51 = point36.x;
        boolean boolean52 = point14.equals((java.lang.Object) point36);
        Point point53 = null;
        Line line54 = new Line(point14, point53);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point9.y = 10.0d;
        java.lang.Double double12 = point9.x;
        java.lang.Double double13 = point9.x;
        java.lang.Double double14 = point9.x;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        java.lang.Double double21 = point17.y;
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = point17.equals(obj22);
        java.lang.Double double24 = point17.y;
        java.lang.Class<?> wildcardClass25 = point17.getClass();
        boolean boolean26 = point9.equals((java.lang.Object) wildcardClass25);
        boolean boolean27 = point3.equals((java.lang.Object) point9);
        point3.y = 10.0d;
        java.lang.Double double30 = point3.y;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.y;
        Point point15 = null;
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point3.x = 100.0d;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        point8.x = 1.0d;
        java.lang.Double double14 = point8.y;
        java.lang.Double double15 = point8.y;
        point8.x = 10.0d;
        boolean boolean18 = point3.equals((java.lang.Object) point8);
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 10.0d;
        point21.y = 10.0d;
        boolean boolean27 = point8.equals((java.lang.Object) point21);
        java.lang.Double double28 = point8.x;
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.x;
        java.lang.Double double33 = point31.y;
        java.lang.Double double34 = point31.y;
        point31.y = (-1.0d);
        boolean boolean37 = point8.equals((java.lang.Object) (-1.0d));
        point8.x = 100.0d;
        point8.x = 100.0d;
        Line line42 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        Point point23 = null;
        Line line24 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        Point point27 = null;
        Line line28 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.y;
        java.lang.Double double26 = point20.y;
        point20.y = 1.0d;
        point20.y = 100.0d;
        java.lang.Double double31 = point20.x;
        boolean boolean32 = point8.equals((java.lang.Object) double31);
        Point point33 = null;
        Line line34 = new Line(point8, point33);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.x = 100.0d;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.y;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        java.lang.Double double20 = point2.y;
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        java.lang.Double double17 = point2.y;
        point2.y = 1.0d;
        Point point20 = null;
        Line line21 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        point3.y = 0.0d;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        java.lang.Double double12 = point10.x;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean17 = point15.equals((java.lang.Object) true);
        boolean boolean18 = point10.equals((java.lang.Object) true);
        java.lang.Double double19 = point10.y;
        java.lang.Double double20 = point10.y;
        boolean boolean21 = point3.equals((java.lang.Object) double20);
        java.lang.Double double22 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double25 = point3.x;
        point3.x = 0.0d;
        Line line28 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.y;
        point3.x = 1.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.x;
        point3.x = 1.0d;
        point3.x = 0.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        java.lang.Double double16 = point14.y;
        boolean boolean17 = point3.equals((java.lang.Object) point14);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point20.x = 0.0d;
        point20.y = 1.0d;
        point20.y = 1.0d;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point29.y = 1.0d;
        point29.y = (-1.0d);
        point29.x = 0.0d;
        java.lang.Double double36 = point29.x;
        boolean boolean37 = point20.equals((java.lang.Object) point29);
        point29.y = 1.0d;
        boolean boolean40 = point14.equals((java.lang.Object) 1.0d);
        Line line41 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        boolean boolean5 = point2.equals((java.lang.Object) 10.0f);
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
        point2.y = 1.0d;
        point2.x = 0.0d;
        point2.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.x;
        boolean boolean21 = point2.equals((java.lang.Object) point17);
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 100.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = null;
        boolean boolean9 = point3.equals(obj8);
        point3.x = (-1.0d);
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        point3.x = 0.0d;
        java.lang.Double double12 = point3.y;
        point3.x = 0.0d;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        point17.y = 1.0d;
        point17.y = (-1.0d);
        java.lang.Double double24 = point17.x;
        boolean boolean25 = point3.equals((java.lang.Object) point17);
        point17.y = 0.0d;
        Line line28 = new Line(point0, point17);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 10.0d;
        java.lang.Double double9 = point2.y;
        point2.x = 0.0d;
        java.lang.Double double12 = point2.y;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double13 = point2.y;
        point2.y = (-1.0d);
        java.lang.Double double16 = point2.x;
        java.lang.Double double17 = point2.x;
        Point point18 = null;
        Line line19 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        java.lang.Double double43 = point2.x;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point48 = null;
        Line line49 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        boolean boolean22 = point19.equals((java.lang.Object) 1L);
        java.lang.Double double23 = point19.y;
        boolean boolean24 = point16.equals((java.lang.Object) double23);
        java.lang.Double double25 = point16.y;
        boolean boolean26 = point3.equals((java.lang.Object) point16);
        point3.x = 100.0d;
        point3.x = 10.0d;
        java.lang.Double double31 = point3.y;
        Line line32 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.x = 0.0d;
        point3.x = 1.0d;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.y;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point16.y = 0.0d;
        java.lang.Double double19 = point16.y;
        java.lang.Double double20 = point16.x;
        Point point23 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.y;
        boolean boolean26 = point16.equals((java.lang.Object) point23);
        point16.y = 100.0d;
        java.lang.Double double29 = point16.y;
        point16.x = 0.0d;
        java.lang.Double double32 = point16.y;
        point16.y = 10.0d;
        boolean boolean35 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Double double36 = point3.x;
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        point2.x = (-1.0d);
        Point point19 = null;
        Line line20 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        java.lang.Double double18 = point16.y;
        point16.y = (-1.0d);
        point16.y = 0.0d;
        java.lang.Double double23 = point16.x;
        java.lang.Double double24 = point16.x;
        boolean boolean25 = point3.equals((java.lang.Object) point16);
        Line line26 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        java.lang.Object obj17 = null;
        boolean boolean18 = point3.equals(obj17);
        point3.x = (-1.0d);
        java.lang.Double double21 = point3.x;
        Line line22 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        Point point27 = null;
        Line line28 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        java.lang.Double double26 = point2.x;
        Point point27 = null;
        Line line28 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.y = 100.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.x;
        boolean boolean18 = point15.equals((java.lang.Object) 10.0f);
        point15.x = 100.0d;
        java.lang.Double double21 = point15.x;
        point15.y = 1.0d;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        point26.y = 10.0d;
        point26.y = (-1.0d);
        java.lang.Class<?> wildcardClass32 = point26.getClass();
        boolean boolean33 = point15.equals((java.lang.Object) wildcardClass32);
        java.lang.Double double34 = point15.y;
        point15.x = 1.0d;
        point15.x = 10.0d;
        java.lang.Double double39 = point15.y;
        boolean boolean40 = point2.equals((java.lang.Object) double39);
        point2.y = 1.0d;
        point2.y = 10.0d;
        java.lang.Double double45 = point2.y;
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.x;
        boolean boolean51 = point48.equals((java.lang.Object) 10.0f);
        point48.x = 100.0d;
        java.lang.Double double54 = point48.x;
        Point point57 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point57.x = 100.0d;
        boolean boolean60 = point48.equals((java.lang.Object) 100.0d);
        java.lang.Double double61 = point48.y;
        Point point64 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double65 = point64.x;
        point64.y = 0.0d;
        boolean boolean68 = point48.equals((java.lang.Object) point64);
        boolean boolean69 = point2.equals((java.lang.Object) boolean68);
        Point point70 = null;
        Line line71 = new Line(point2, point70);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        point3.x = 1.0d;
        java.lang.Double double12 = point3.x;
        point3.y = 0.0d;
        point3.y = 1.0d;
        point3.x = (-1.0d);
        point3.y = 100.0d;
        Line line21 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        java.lang.Double double22 = point2.x;
        Point point23 = null;
        Line line24 = new Line(point2, point23);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        point3.y = 0.0d;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        java.lang.Double double12 = point10.x;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean17 = point15.equals((java.lang.Object) true);
        boolean boolean18 = point10.equals((java.lang.Object) true);
        java.lang.Double double19 = point10.y;
        java.lang.Double double20 = point10.y;
        boolean boolean21 = point3.equals((java.lang.Object) double20);
        java.lang.Double double22 = point3.y;
        point3.y = 0.0d;
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point27.y = 1.0d;
        java.lang.Double double30 = point27.y;
        java.lang.Double double31 = point27.y;
        point27.y = 0.0d;
        java.lang.Double double34 = point27.x;
        point27.y = 100.0d;
        point27.x = 0.0d;
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point41.x = 1.0d;
        point41.y = 1.0d;
        point41.y = (-1.0d);
        java.lang.Double double48 = point41.y;
        java.lang.Double double49 = point41.x;
        boolean boolean50 = point27.equals((java.lang.Object) point41);
        boolean boolean51 = point3.equals((java.lang.Object) point27);
        Line line52 = new Line(point0, point27);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        java.lang.Double double7 = point2.x;
        point2.y = 100.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.x;
        boolean boolean15 = point12.equals((java.lang.Object) 10.0f);
        point12.x = 100.0d;
        point12.y = 10.0d;
        java.lang.Double double20 = point12.x;
        boolean boolean21 = point2.equals((java.lang.Object) double20);
        point2.y = 0.0d;
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        java.lang.Double double7 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        java.lang.Double double18 = point16.y;
        boolean boolean19 = point13.equals((java.lang.Object) point16);
        boolean boolean20 = point2.equals((java.lang.Object) boolean19);
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        point19.x = 0.0d;
        boolean boolean31 = point3.equals((java.lang.Object) 0.0d);
        point3.x = 100.0d;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        java.lang.Double double38 = point36.y;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        boolean boolean41 = point3.equals((java.lang.Object) point36);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = (-1.0d);
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        point51.y = 10.0d;
        boolean boolean55 = point44.equals((java.lang.Object) 10.0d);
        java.lang.Double double56 = point44.y;
        java.lang.Double double57 = point44.y;
        boolean boolean58 = point3.equals((java.lang.Object) double57);
        point3.x = 1.0d;
        java.lang.Double double61 = point3.x;
        Line line62 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.x;
        point2.y = 10.0d;
        Point point20 = null;
        Line line21 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        point2.y = 0.0d;
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.x;
        Point point15 = null;
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        Point point71 = null;
        Line line72 = new Line(point2, point71);
        org.junit.Assert.assertTrue("Contract failed: line72.equals(line72)", line72.equals(line72));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.y = 0.0d;
        java.lang.Double double22 = point16.y;
        boolean boolean23 = point2.equals((java.lang.Object) double22);
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 100.0d;
        java.lang.Double double32 = point26.y;
        point26.y = 100.0d;
        java.lang.Double double35 = point26.x;
        java.lang.Double double36 = point26.y;
        point26.x = 1.0d;
        boolean boolean39 = point2.equals((java.lang.Object) 1.0d);
        Point point40 = null;
        Line line41 = new Line(point2, point40);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.y;
        point2.x = 10.0d;
        point2.x = (-1.0d);
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        point19.x = 0.0d;
        boolean boolean31 = point3.equals((java.lang.Object) 0.0d);
        point3.y = (-1.0d);
        point3.y = (-1.0d);
        point3.x = 1.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point40.y = 100.0d;
        boolean boolean43 = point3.equals((java.lang.Object) point40);
        point3.y = 1.0d;
        Line line46 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        java.lang.Double double17 = point2.x;
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
        point20.x = (-1.0d);
        boolean boolean44 = point2.equals((java.lang.Object) (-1.0d));
        java.lang.Double double45 = point2.y;
        Point point46 = null;
        Line line47 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        point3.x = 1.0d;
        java.lang.Double double12 = point3.x;
        point3.y = 0.0d;
        point3.x = 1.0d;
        java.lang.Double double17 = point3.x;
        point3.x = 10.0d;
        point3.x = 10.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.y;
        boolean boolean30 = point24.equals((java.lang.Object) point27);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point33.x = 1.0d;
        point33.y = 1.0d;
        java.lang.Double double38 = point33.x;
        java.lang.Double double39 = point33.y;
        point33.y = 1.0d;
        java.lang.Double double42 = point33.y;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point45.x = 1.0d;
        boolean boolean48 = point33.equals((java.lang.Object) 1.0d);
        boolean boolean49 = point27.equals((java.lang.Object) boolean48);
        java.lang.Double double50 = point27.y;
        boolean boolean51 = point3.equals((java.lang.Object) point27);
        Line line52 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point3.y = 10.0d;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
        java.lang.Double double8 = point3.x;
        point3.y = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.x;
        boolean boolean16 = point13.equals((java.lang.Object) 10.0f);
        point13.x = 100.0d;
        point13.y = 10.0d;
        java.lang.Double double21 = point13.x;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point25.y = 0.0d;
        java.lang.Double double28 = point25.y;
        point25.x = 100.0d;
        point25.x = 0.0d;
        point25.x = 10.0d;
        boolean boolean35 = point3.equals((java.lang.Object) point25);
        java.lang.Double double36 = point25.y;
        Line line37 = new Line(point0, point25);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        java.lang.Double double9 = point2.x;
        point2.x = (-1.0d);
        java.lang.Double double12 = point2.y;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        point14.y = (-1.0d);
        Point point28 = null;
        Line line29 = new Line(point14, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        java.lang.Double double29 = point2.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.x;
        boolean boolean35 = point32.equals((java.lang.Object) 10.0f);
        point32.x = 100.0d;
        java.lang.Double double38 = point32.x;
        point32.y = 1.0d;
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        java.lang.Double double49 = point43.x;
        point43.y = 1.0d;
        java.lang.Class<?> wildcardClass52 = point43.getClass();
        boolean boolean53 = point32.equals((java.lang.Object) point43);
        point32.x = 10.0d;
        point32.x = (-1.0d);
        boolean boolean58 = point2.equals((java.lang.Object) (-1.0d));
        point2.x = (-1.0d);
        Point point61 = null;
        Line line62 = new Line(point2, point61);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point8.x = 1.0d;
        point8.y = 1.0d;
        boolean boolean13 = point3.equals((java.lang.Object) point8);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point16.x = 0.0d;
        point16.x = 1.0d;
        java.lang.Class<?> wildcardClass21 = point16.getClass();
        boolean boolean22 = point8.equals((java.lang.Object) point16);
        Line line23 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point2.y = 10.0d;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        point2.y = 0.0d;
        java.lang.Double double10 = point2.y;
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.y;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 100.0d;
        point10.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.x;
        java.lang.Double double26 = point20.x;
        point20.y = 1.0d;
        boolean boolean29 = point10.equals((java.lang.Object) point20);
        point20.y = (-1.0d);
        point20.x = (-1.0d);
        java.lang.Double double34 = point20.x;
        java.lang.Double double35 = point20.x;
        java.lang.Double double36 = point20.x;
        boolean boolean37 = point3.equals((java.lang.Object) double36);
        java.lang.Double double38 = point3.y;
        point3.x = 100.0d;
        java.lang.Double double41 = point3.y;
        Line line42 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.y = (-1.0d);
        point3.x = 100.0d;
        point3.y = 0.0d;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        point3.y = 1.0d;
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.y;
        point3.x = 10.0d;
        java.lang.Double double14 = point3.x;
        Line line15 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        point7.y = (-1.0d);
        boolean boolean14 = point3.equals((java.lang.Object) point7);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        point17.y = 10.0d;
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
        point23.y = (-1.0d);
        java.lang.Double double45 = point23.x;
        java.lang.Double double46 = point23.x;
        java.lang.Double double47 = point23.x;
        java.lang.Class<?> wildcardClass48 = point23.getClass();
        boolean boolean49 = point17.equals((java.lang.Object) wildcardClass48);
        point17.y = 1.0d;
        boolean boolean52 = point3.equals((java.lang.Object) 1.0d);
        Point point55 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        boolean boolean61 = point58.equals((java.lang.Object) 1L);
        java.lang.Double double62 = point58.y;
        boolean boolean63 = point55.equals((java.lang.Object) double62);
        java.lang.Double double64 = point55.y;
        Point point67 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point70 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double71 = point70.y;
        point70.y = 10.0d;
        boolean boolean74 = point67.equals((java.lang.Object) point70);
        Point point77 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass78 = point77.getClass();
        boolean boolean79 = point70.equals((java.lang.Object) wildcardClass78);
        Point point82 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point82.x = 1.0d;
        boolean boolean85 = point70.equals((java.lang.Object) point82);
        boolean boolean86 = point55.equals((java.lang.Object) point70);
        java.lang.Double double87 = point55.x;
        java.lang.Double double88 = point55.x;
        point55.x = 10.0d;
        point55.x = 10.0d;
        point55.y = 100.0d;
        boolean boolean95 = point3.equals((java.lang.Object) point55);
        Line line96 = new Line(point0, point55);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = (-1.0d);
        Point point13 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point13.y = 1.0d;
        point13.y = (-1.0d);
        java.lang.Double double18 = point13.x;
        java.lang.Double double19 = point13.x;
        point13.y = 1.0d;
        boolean boolean22 = point3.equals((java.lang.Object) point13);
        point13.y = (-1.0d);
        point13.x = (-1.0d);
        java.lang.Double double27 = point13.x;
        java.lang.Double double28 = point13.x;
        Line line29 = new Line(point0, point13);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        java.lang.Double double6 = point3.y;
        point3.x = 0.0d;
        Point point11 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double12 = point11.y;
        java.lang.Double double13 = point11.x;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean18 = point16.equals((java.lang.Object) true);
        boolean boolean19 = point11.equals((java.lang.Object) true);
        java.lang.Double double20 = point11.x;
        point11.y = 0.0d;
        boolean boolean23 = point3.equals((java.lang.Object) point11);
        point3.x = 10.0d;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double32 = point31.y;
        point31.y = 10.0d;
        boolean boolean35 = point28.equals((java.lang.Object) point31);
        boolean boolean37 = point31.equals((java.lang.Object) 10.0d);
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        point40.y = (-1.0d);
        java.lang.Double double45 = point40.x;
        java.lang.Double double46 = point40.x;
        point40.y = 1.0d;
        boolean boolean49 = point31.equals((java.lang.Object) point40);
        java.lang.Double double50 = point31.x;
        boolean boolean51 = point3.equals((java.lang.Object) point31);
        point3.y = 0.0d;
        Line line54 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        point3.y = (-1.0d);
        point3.x = 100.0d;
        java.lang.Double double10 = point3.y;
        java.lang.Double double11 = point3.y;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        java.lang.Double double6 = point3.x;
        point3.y = 0.0d;
        boolean boolean10 = point3.equals((java.lang.Object) '#');
        point3.x = 0.0d;
        point3.y = 100.0d;
        point3.x = 10.0d;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point22 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        boolean boolean25 = point19.equals((java.lang.Object) point22);
        point19.x = 10.0d;
        boolean boolean28 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Double double29 = point3.x;
        Line line30 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        java.lang.Double double22 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point27 = null;
        Line line28 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean5 = point3.equals((java.lang.Object) (byte) 100);
        java.lang.Double double6 = point3.x;
        point3.x = (-1.0d);
        Line line9 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        point12.x = 10.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 10.0d);
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point2.x = 10.0d;
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 0.0d;
        point2.x = 0.0d;
        java.lang.Double double12 = point2.x;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.x;
        boolean boolean15 = point12.equals((java.lang.Object) 10.0f);
        point12.x = 100.0d;
        boolean boolean18 = point6.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass19 = point6.getClass();
        boolean boolean20 = point3.equals((java.lang.Object) wildcardClass19);
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point26 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        boolean boolean29 = point23.equals((java.lang.Object) point26);
        point23.x = 10.0d;
        boolean boolean32 = point3.equals((java.lang.Object) point23);
        point3.x = 10.0d;
        point3.y = 100.0d;
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.x = 10.0d;
        java.lang.Double double11 = point3.y;
        point3.y = 0.0d;
        Point point16 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.y;
        point16.y = 100.0d;
        boolean boolean20 = point3.equals((java.lang.Object) point16);
        point16.y = 1.0d;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point25.x = 1.0d;
        point25.y = 1.0d;
        java.lang.Double double30 = point25.x;
        point25.x = (-1.0d);
        java.lang.Class<?> wildcardClass33 = point25.getClass();
        boolean boolean34 = point16.equals((java.lang.Object) wildcardClass33);
        Line line35 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        Point point7 = null;
        Line line8 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.y = 0.0d;
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.y;
        Line line11 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.y = (-1.0d);
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 1.0d;
        point8.x = 100.0d;
        point8.x = 10.0d;
        java.lang.Double double16 = point8.y;
        point8.y = 0.0d;
        Point point21 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 100.0d;
        boolean boolean25 = point8.equals((java.lang.Object) point21);
        point21.y = 1.0d;
        java.lang.Double double28 = point21.x;
        boolean boolean29 = point3.equals((java.lang.Object) double28);
        java.lang.Double double30 = point3.y;
        java.lang.Double double31 = point3.x;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point37.x = 1.0d;
        point37.y = 1.0d;
        boolean boolean42 = point34.equals((java.lang.Object) 1.0d);
        java.lang.Double double43 = point34.y;
        java.lang.Double double44 = point34.x;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.x;
        boolean boolean52 = point34.equals((java.lang.Object) point47);
        java.lang.Double double53 = point34.y;
        java.lang.Double double54 = point34.x;
        boolean boolean55 = point3.equals((java.lang.Object) double54);
        Line line56 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        point18.y = (-1.0d);
        point18.y = 1.0d;
        point18.x = (-1.0d);
        Point point31 = null;
        Line line32 = new Line(point18, point31);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Double double9 = point3.x;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.x;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        java.lang.Double double50 = point2.y;
        java.lang.Double double51 = point2.y;
        point2.y = 0.0d;
        Point point54 = null;
        Line line55 = new Line(point2, point54);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        Point point41 = null;
        Line line42 = new Line(point29, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        point6.y = 1.0d;
        point6.x = 100.0d;
        point6.x = 10.0d;
        java.lang.Double double14 = point6.y;
        java.lang.Double double15 = point6.x;
        boolean boolean16 = point3.equals((java.lang.Object) double15);
        java.lang.Double double17 = point3.x;
        java.lang.Double double18 = point3.x;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        point21.y = 100.0d;
        point21.x = (-1.0d);
        point21.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.x;
        boolean boolean37 = point34.equals((java.lang.Object) 10.0f);
        point34.x = 100.0d;
        java.lang.Double double40 = point34.x;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point43.x = 100.0d;
        boolean boolean46 = point34.equals((java.lang.Object) 100.0d);
        java.lang.Double double47 = point34.y;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        point50.y = 1.0d;
        point50.x = 100.0d;
        java.lang.Double double56 = point50.x;
        boolean boolean57 = point34.equals((java.lang.Object) point50);
        boolean boolean58 = point21.equals((java.lang.Object) point50);
        java.lang.Double double59 = point21.y;
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point62.y = 1.0d;
        point62.y = (-1.0d);
        java.lang.Double double67 = point62.y;
        java.lang.Double double68 = point62.y;
        java.lang.Double double69 = point62.y;
        point62.y = 100.0d;
        java.lang.Double double72 = point62.x;
        java.lang.Double double73 = point62.y;
        Point point76 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        java.lang.Class<?> wildcardClass78 = point76.getClass();
        boolean boolean79 = point62.equals((java.lang.Object) wildcardClass78);
        boolean boolean80 = point21.equals((java.lang.Object) wildcardClass78);
        boolean boolean81 = point3.equals((java.lang.Object) point21);
        java.lang.Double double82 = point3.x;
        java.lang.Double double83 = point3.x;
        point3.x = 100.0d;
        Line line86 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        boolean boolean9 = point2.equals((java.lang.Object) 'a');
        point2.x = 10.0d;
        point2.x = 0.0d;
        java.lang.Double double14 = point2.x;
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        Point point17 = null;
        Line line18 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        java.lang.Double double23 = point2.x;
        point2.x = 0.0d;
        Point point26 = null;
        Line line27 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        point2.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.y;
        point14.y = 10.0d;
        java.lang.Double double21 = point14.y;
        java.lang.Class<?> wildcardClass22 = point14.getClass();
        boolean boolean23 = point2.equals((java.lang.Object) point14);
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        point8.y = (-1.0d);
        java.lang.Double double13 = point8.y;
        java.lang.Double double14 = point8.y;
        point8.y = 1.0d;
        java.lang.Class<?> wildcardClass17 = point8.getClass();
        boolean boolean18 = point3.equals((java.lang.Object) wildcardClass17);
        point3.y = 100.0d;
        java.lang.Double double21 = point3.x;
        point3.y = 1.0d;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        boolean boolean34 = point26.equals((java.lang.Object) double33);
        point26.x = 10.0d;
        java.lang.Double double37 = point26.x;
        point26.y = 0.0d;
        java.lang.Double double40 = point26.x;
        java.lang.Class<?> wildcardClass41 = point26.getClass();
        boolean boolean42 = point3.equals((java.lang.Object) wildcardClass41);
        java.lang.Double double43 = point3.x;
        java.lang.Double double44 = point3.x;
        Line line45 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 0.0d;
        Point point7 = null;
        Line line8 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Object obj9 = null;
        boolean boolean10 = point3.equals(obj9);
        boolean boolean12 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = point3.equals(obj13);
        point3.y = 0.0d;
        point3.y = 1.0d;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point21.y = (-1.0d);
        point21.x = 1.0d;
        boolean boolean26 = point3.equals((java.lang.Object) point21);
        point3.y = 1.0d;
        java.lang.Double double29 = point3.x;
        java.lang.Double double30 = point3.x;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.x;
        boolean boolean14 = point11.equals((java.lang.Object) 10.0f);
        point11.x = 100.0d;
        java.lang.Double double17 = point11.x;
        point11.y = 1.0d;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        point22.y = 10.0d;
        point22.y = (-1.0d);
        java.lang.Class<?> wildcardClass28 = point22.getClass();
        boolean boolean29 = point11.equals((java.lang.Object) wildcardClass28);
        java.lang.Double double30 = point11.y;
        point11.x = 1.0d;
        point11.x = 100.0d;
        point11.y = 1.0d;
        java.lang.Double double37 = point11.x;
        boolean boolean38 = point2.equals((java.lang.Object) point11);
        Point point39 = null;
        Line line40 = new Line(point11, point39);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double12 = point2.x;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point13.x = 1.0d;
        java.lang.Double double16 = point13.y;
        java.lang.Double double17 = point13.y;
        boolean boolean19 = point13.equals((java.lang.Object) ' ');
        boolean boolean20 = point3.equals((java.lang.Object) point13);
        Line line21 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        java.lang.Double double10 = point3.y;
        point3.y = 100.0d;
        java.lang.Double double13 = point3.y;
        point3.y = 1.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        java.lang.Double double24 = point18.x;
        point18.y = 1.0d;
        Point point29 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point32.x = 1.0d;
        point32.y = 1.0d;
        boolean boolean37 = point29.equals((java.lang.Object) 1.0d);
        boolean boolean38 = point18.equals((java.lang.Object) 1.0d);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point41.y = (-1.0d);
        java.lang.Double double44 = point41.x;
        point41.x = (-1.0d);
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double50 = point49.y;
        java.lang.Double double51 = point49.x;
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean56 = point54.equals((java.lang.Object) true);
        boolean boolean57 = point49.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass58 = point49.getClass();
        boolean boolean59 = point41.equals((java.lang.Object) wildcardClass58);
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double63 = point62.y;
        point62.y = 1.0d;
        point62.x = 1.0d;
        java.lang.Object obj68 = null;
        boolean boolean69 = point62.equals(obj68);
        point62.x = 1.0d;
        point62.x = (-1.0d);
        java.lang.Double double74 = point62.x;
        boolean boolean75 = point41.equals((java.lang.Object) point62);
        java.lang.Double double76 = point41.x;
        boolean boolean77 = point18.equals((java.lang.Object) point41);
        java.lang.Class<?> wildcardClass78 = point18.getClass();
        boolean boolean79 = point3.equals((java.lang.Object) wildcardClass78);
        point3.x = (-1.0d);
        Line line82 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line82.equals(line82)", line82.equals(line82));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        Line line6 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        java.lang.Double double11 = point2.x;
        point2.y = 100.0d;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.x = 100.0d;
        java.lang.Double double25 = point19.x;
        boolean boolean26 = point3.equals((java.lang.Object) point19);
        Line line27 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 100.0d;
        point3.x = (-1.0d);
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double16 = point15.x;
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        java.lang.Double double21 = point19.y;
        java.lang.Double double22 = point19.x;
        boolean boolean23 = point15.equals((java.lang.Object) point19);
        point15.x = (-1.0d);
        java.lang.Double double26 = point15.x;
        boolean boolean27 = point3.equals((java.lang.Object) point15);
        java.lang.Double double28 = point15.x;
        java.lang.Double double29 = point15.y;
        java.lang.Double double30 = point15.y;
        Line line31 = new Line(point0, point15);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 100.0d;
        point2.y = 0.0d;
        point2.y = 10.0d;
        Point point9 = null;
        Line line10 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 0.0d;
        Point point14 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 100.0d;
        java.lang.Double double18 = point14.y;
        java.lang.Object obj19 = null;
        boolean boolean20 = point14.equals(obj19);
        boolean boolean21 = point2.equals(obj19);
        java.lang.Double double22 = point2.x;
        point2.y = 10.0d;
        Point point25 = null;
        Line line26 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double15 = point14.x;
        java.lang.Double double16 = point14.y;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.y;
        java.lang.Double double20 = point14.x;
        java.lang.Double double21 = point14.y;
        Point point24 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point24.y = 1.0d;
        java.lang.Double double27 = point24.y;
        java.lang.Double double28 = point24.y;
        java.lang.Double double29 = point24.x;
        java.lang.Double double30 = point24.x;
        boolean boolean31 = point14.equals((java.lang.Object) point24);
        point24.x = 0.0d;
        point24.x = 0.0d;
        boolean boolean36 = point2.equals((java.lang.Object) 0.0d);
        Point point37 = null;
        Line line38 = new Line(point2, point37);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        java.lang.Double double8 = point6.y;
        boolean boolean9 = point3.equals((java.lang.Object) point6);
        java.lang.Double double10 = point6.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean15 = point6.equals((java.lang.Object) double14);
        java.lang.Double double16 = point6.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point19.x = 0.0d;
        point19.y = 1.0d;
        java.lang.Double double24 = point19.x;
        point19.x = 0.0d;
        java.lang.Double double27 = point19.y;
        java.lang.Double double28 = point19.x;
        boolean boolean29 = point6.equals((java.lang.Object) point19);
        java.lang.Double double30 = point6.x;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point33.y = 0.0d;
        java.lang.Double double36 = point33.y;
        java.lang.Double double37 = point33.x;
        point33.x = 1.0d;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj43 = null;
        boolean boolean44 = point42.equals(obj43);
        java.lang.Class<?> wildcardClass45 = point42.getClass();
        boolean boolean46 = point33.equals((java.lang.Object) wildcardClass45);
        java.lang.Double double47 = point33.x;
        java.lang.Double double48 = point33.y;
        java.lang.Double double49 = point33.y;
        boolean boolean50 = point6.equals((java.lang.Object) point33);
        Line line51 = new Line(point0, point33);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        Point point9 = null;
        Line line10 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.x = 0.0d;
        point3.x = (-1.0d);
        java.lang.Double double8 = point3.x;
        Line line9 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double26 = point3.x;
        java.lang.Double double27 = point3.y;
        java.lang.Double double28 = point3.y;
        point3.x = 10.0d;
        point3.y = (-1.0d);
        Line line33 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        Point point8 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.x;
        java.lang.Double double10 = point8.y;
        java.lang.Double double11 = point8.y;
        java.lang.Double double12 = point8.y;
        boolean boolean13 = point3.equals((java.lang.Object) point8);
        java.lang.Double double14 = point3.y;
        java.lang.Double double15 = point3.x;
        point3.y = 10.0d;
        java.lang.Double double18 = point3.x;
        Line line19 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        java.lang.Double double19 = point5.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.x;
        boolean boolean25 = point22.equals((java.lang.Object) 10.0f);
        point22.x = 100.0d;
        java.lang.Double double28 = point22.x;
        point22.y = 1.0d;
        Point point33 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double34 = point33.y;
        point33.y = 10.0d;
        point33.y = (-1.0d);
        java.lang.Class<?> wildcardClass39 = point33.getClass();
        boolean boolean40 = point22.equals((java.lang.Object) wildcardClass39);
        java.lang.Double double41 = point22.y;
        point22.y = 100.0d;
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point46.y = 0.0d;
        java.lang.Double double49 = point46.y;
        java.lang.Double double50 = point46.x;
        point46.x = 1.0d;
        Point point55 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double56 = point55.y;
        point55.y = 1.0d;
        java.lang.Double double59 = point55.y;
        java.lang.Object obj60 = new java.lang.Object();
        boolean boolean61 = point55.equals(obj60);
        java.lang.Double double62 = point55.y;
        point55.x = 1.0d;
        boolean boolean65 = point46.equals((java.lang.Object) point55);
        Point point68 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean69 = point55.equals((java.lang.Object) point68);
        java.lang.Double double70 = point68.x;
        boolean boolean71 = point22.equals((java.lang.Object) double70);
        java.lang.Double double72 = point22.x;
        boolean boolean73 = point5.equals((java.lang.Object) point22);
        java.lang.Double double74 = point5.y;
        Point point75 = null;
        Line line76 = new Line(point5, point75);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        point3.y = 1.0d;
        java.lang.Double double14 = point3.x;
        java.lang.Double double15 = point3.y;
        java.lang.Double double16 = point3.x;
        java.lang.Double double17 = point3.x;
        point3.y = (-1.0d);
        java.lang.Double double20 = point3.y;
        Line line21 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point6 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        java.lang.Double double8 = point6.y;
        boolean boolean9 = point3.equals((java.lang.Object) point6);
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point12.x = 1.0d;
        point12.y = 1.0d;
        java.lang.Double double17 = point12.x;
        java.lang.Double double18 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double21 = point12.y;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point24.x = 1.0d;
        boolean boolean27 = point12.equals((java.lang.Object) 1.0d);
        boolean boolean28 = point6.equals((java.lang.Object) boolean27);
        java.lang.Double double29 = point6.x;
        point6.x = 10.0d;
        Line line32 = new Line(point0, point6);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        point3.y = 100.0d;
        point3.x = (-1.0d);
        point3.x = 100.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        java.lang.Double double25 = point18.y;
        point18.y = 100.0d;
        point18.y = 0.0d;
        boolean boolean30 = point3.equals((java.lang.Object) 0.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point33.x = 1.0d;
        point33.y = 1.0d;
        java.lang.Double double38 = point33.x;
        point33.x = (-1.0d);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        point43.y = 1.0d;
        point43.x = 100.0d;
        point43.x = 10.0d;
        java.lang.Double double51 = point43.y;
        boolean boolean52 = point33.equals((java.lang.Object) double51);
        point33.y = (-1.0d);
        java.lang.Double double55 = point33.x;
        java.lang.Double double56 = point33.x;
        java.lang.Double double57 = point33.y;
        Point point60 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double61 = point60.x;
        java.lang.Double double62 = point60.y;
        point60.y = (-1.0d);
        java.lang.Class<?> wildcardClass65 = point60.getClass();
        boolean boolean66 = point33.equals((java.lang.Object) wildcardClass65);
        boolean boolean67 = point3.equals((java.lang.Object) point33);
        java.lang.Double double68 = point3.x;
        point3.y = (-1.0d);
        Line line71 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line71.equals(line71)", line71.equals(line71));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point6.x = 1.0d;
        point6.y = 1.0d;
        boolean boolean11 = point3.equals((java.lang.Object) 1.0d);
        java.lang.Double double12 = point3.y;
        point3.x = 0.0d;
        point3.y = (-1.0d);
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
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
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.y;
        point26.y = 10.0d;
        point26.y = 10.0d;
        boolean boolean32 = point13.equals((java.lang.Object) point26);
        java.lang.Double double33 = point13.x;
        boolean boolean34 = point3.equals((java.lang.Object) double33);
        java.lang.Double double35 = point3.y;
        java.lang.Double double36 = point3.x;
        java.lang.Double double37 = point3.y;
        java.lang.Double double38 = point3.y;
        point3.x = 1.0d;
        Line line41 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line41.equals(line41)", line41.equals(line41));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean14 = point12.equals((java.lang.Object) (byte) 100);
        java.lang.Double double15 = point12.x;
        point12.x = (-1.0d);
        point12.x = 10.0d;
        point12.y = (-1.0d);
        point12.x = 10.0d;
        boolean boolean24 = point2.equals((java.lang.Object) point12);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point27.x = 0.0d;
        point27.y = 1.0d;
        java.lang.Double double32 = point27.x;
        java.lang.Double double33 = point27.x;
        boolean boolean34 = point2.equals((java.lang.Object) point27);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        point37.x = 100.0d;
        point37.x = 10.0d;
        point37.x = 10.0d;
        point37.x = 10.0d;
        point37.x = 10.0d;
        boolean boolean51 = point2.equals((java.lang.Object) point37);
        Point point52 = null;
        Line line53 = new Line(point2, point52);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        Point point20 = null;
        Line line21 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        point3.y = 0.0d;
        java.lang.Double double14 = point3.x;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        java.lang.Double double20 = point17.y;
        point17.x = 0.0d;
        boolean boolean23 = point3.equals((java.lang.Object) point17);
        Line line24 = new Line(point0, point17);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point10 = null;
        Line line11 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double40 = point39.y;
        point39.y = 10.0d;
        point39.y = (-1.0d);
        java.lang.Object obj45 = null;
        boolean boolean46 = point39.equals(obj45);
        point39.x = (-1.0d);
        java.lang.Object obj49 = null;
        boolean boolean50 = point39.equals(obj49);
        boolean boolean51 = point2.equals((java.lang.Object) boolean50);
        java.lang.Double double52 = point2.x;
        point2.x = 100.0d;
        java.lang.Double double55 = point2.x;
        Point point56 = null;
        Line line57 = new Line(point2, point56);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        point3.x = (-1.0d);
        java.lang.Double double13 = point3.x;
        point3.y = (-1.0d);
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        java.lang.Double double9 = point5.x;
        java.lang.Double double10 = point5.x;
        java.lang.Double double11 = point5.y;
        java.lang.Double double12 = point5.y;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 1.0d;
        point15.y = (-1.0d);
        java.lang.Double double20 = point15.y;
        java.lang.Double double21 = point15.y;
        point15.y = 1.0d;
        point15.y = 100.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj29 = null;
        boolean boolean30 = point28.equals(obj29);
        boolean boolean31 = point15.equals((java.lang.Object) point28);
        point15.x = 100.0d;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        boolean boolean42 = point36.equals((java.lang.Object) point39);
        java.lang.Double double43 = point39.x;
        boolean boolean44 = point15.equals((java.lang.Object) point39);
        point39.y = 1.0d;
        java.lang.Double double47 = point39.y;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point50.y = 1.0d;
        java.lang.Double double53 = point50.y;
        java.lang.Double double54 = point50.y;
        point50.y = 0.0d;
        point50.x = 0.0d;
        point50.y = 100.0d;
        boolean boolean61 = point39.equals((java.lang.Object) point50);
        point50.y = (-1.0d);
        boolean boolean64 = point5.equals((java.lang.Object) point50);
        Point point65 = null;
        Line line66 = new Line(point5, point65);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.x;
        point2.x = 1.0d;
        Point point15 = null;
        Line line16 = new Line(point2, point15);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        Point point38 = null;
        Line line39 = new Line(point7, point38);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean10 = point8.equals((java.lang.Object) true);
        boolean boolean11 = point3.equals((java.lang.Object) true);
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.y = 0.0d;
        boolean boolean21 = point3.equals((java.lang.Object) point15);
        java.lang.Double double22 = point3.y;
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.y;
        java.lang.Double double27 = point25.x;
        point25.y = 0.0d;
        boolean boolean30 = point3.equals((java.lang.Object) 0.0d);
        java.lang.Double double31 = point3.y;
        java.lang.Double double32 = point3.x;
        java.lang.Double double33 = point3.x;
        java.lang.Double double34 = point3.y;
        java.lang.Double double35 = point3.x;
        point3.x = 10.0d;
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.y;
        java.lang.Double double45 = point43.y;
        boolean boolean46 = point40.equals((java.lang.Object) point43);
        point40.y = 0.0d;
        point40.x = (-1.0d);
        java.lang.Double double51 = point40.x;
        boolean boolean52 = point3.equals((java.lang.Object) point40);
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point55.y = 1.0d;
        point55.y = (-1.0d);
        point55.x = 0.0d;
        Point point64 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point64.y = 0.0d;
        boolean boolean67 = point55.equals((java.lang.Object) point64);
        boolean boolean68 = point3.equals((java.lang.Object) point64);
        Line line69 = new Line(point0, point64);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double9 = point8.y;
        point8.y = 10.0d;
        boolean boolean12 = point3.equals((java.lang.Object) point8);
        point8.x = 1.0d;
        java.lang.Double double15 = point8.y;
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double19 = point18.x;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.y;
        java.lang.Double double25 = point22.x;
        boolean boolean26 = point18.equals((java.lang.Object) point22);
        point18.x = (-1.0d);
        java.lang.Double double29 = point18.x;
        boolean boolean30 = point8.equals((java.lang.Object) double29);
        point8.y = 10.0d;
        Line line33 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.x;
        java.lang.Double double15 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point22.y = (-1.0d);
        point22.y = 1.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.x;
        boolean boolean38 = point35.equals((java.lang.Object) 10.0f);
        point35.x = 100.0d;
        java.lang.Double double41 = point35.x;
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point44.x = 100.0d;
        boolean boolean47 = point35.equals((java.lang.Object) 100.0d);
        point35.x = 10.0d;
        boolean boolean50 = point29.equals((java.lang.Object) point35);
        point35.y = (-1.0d);
        boolean boolean53 = point22.equals((java.lang.Object) (-1.0d));
        java.lang.Double double54 = point22.x;
        Point point57 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double58 = point57.x;
        boolean boolean60 = point57.equals((java.lang.Object) 10.0f);
        point57.x = 100.0d;
        java.lang.Double double63 = point57.x;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point66.x = 100.0d;
        boolean boolean69 = point57.equals((java.lang.Object) 100.0d);
        java.lang.Double double70 = point57.y;
        Point point73 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point76.x = 1.0d;
        point76.y = 1.0d;
        boolean boolean81 = point73.equals((java.lang.Object) 1.0d);
        java.lang.Double double82 = point73.y;
        point73.x = 0.0d;
        boolean boolean85 = point57.equals((java.lang.Object) 0.0d);
        point57.x = 100.0d;
        java.lang.Double double88 = point57.y;
        java.lang.Double double89 = point57.x;
        boolean boolean90 = point22.equals((java.lang.Object) double89);
        java.lang.Double double91 = point22.x;
        boolean boolean92 = point2.equals((java.lang.Object) point22);
        Point point93 = null;
        Line line94 = new Line(point22, point93);
        org.junit.Assert.assertTrue("Contract failed: line94.equals(line94)", line94.equals(line94));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        point3.y = (-1.0d);
        point3.x = (-1.0d);
        java.lang.Double double27 = point3.y;
        java.lang.Double double28 = point3.x;
        Point point31 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 0.0d;
        point31.x = 1.0d;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point39.x = 1.0d;
        point39.y = (-1.0d);
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.y;
        point46.y = 10.0d;
        boolean boolean50 = point39.equals((java.lang.Object) 10.0d);
        boolean boolean51 = point31.equals((java.lang.Object) point39);
        boolean boolean52 = point3.equals((java.lang.Object) point31);
        Line line53 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        boolean boolean5 = point2.equals((java.lang.Object) 1L);
        point2.y = (-1.0d);
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        point2.y = 0.0d;
        point2.y = 0.0d;
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.x;
        Point point18 = null;
        Line line19 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        point8.y = 0.0d;
        point8.x = 100.0d;
        Point point32 = null;
        Line line33 = new Line(point8, point32);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        point3.x = 0.0d;
        point3.x = 1.0d;
        point3.x = 10.0d;
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.x;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean22 = point20.equals((java.lang.Object) true);
        boolean boolean23 = point15.equals((java.lang.Object) true);
        java.lang.Double double24 = point15.y;
        java.lang.Double double25 = point15.y;
        point15.y = 100.0d;
        java.lang.Double double28 = point15.y;
        java.lang.Double double29 = point15.x;
        boolean boolean30 = point3.equals((java.lang.Object) point15);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        java.lang.Double double37 = point33.y;
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = point33.equals(obj38);
        java.lang.Double double40 = point33.y;
        boolean boolean42 = point33.equals((java.lang.Object) (byte) 100);
        boolean boolean43 = point15.equals((java.lang.Object) point33);
        java.lang.Double double44 = point33.x;
        Line line45 = new Line(point0, point33);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        java.lang.Double double24 = point9.y;
        Point point25 = null;
        Line line26 = new Line(point9, point25);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        Point point9 = null;
        Line line10 = new Line(point2, point9);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        point3.y = 100.0d;
        java.lang.Double double11 = point3.x;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        java.lang.Double double17 = point14.y;
        java.lang.Double double18 = point14.x;
        point14.x = 1.0d;
        Point point23 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj24 = null;
        boolean boolean25 = point23.equals(obj24);
        java.lang.Class<?> wildcardClass26 = point23.getClass();
        boolean boolean27 = point14.equals((java.lang.Object) wildcardClass26);
        boolean boolean28 = point3.equals((java.lang.Object) wildcardClass26);
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.x = 10.0d;
        java.lang.Double double42 = point34.y;
        java.lang.Double double43 = point34.x;
        boolean boolean44 = point31.equals((java.lang.Object) double43);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point47.y = 0.0d;
        java.lang.Double double50 = point47.y;
        java.lang.Double double51 = point47.x;
        boolean boolean52 = point31.equals((java.lang.Object) point47);
        point31.x = 0.0d;
        boolean boolean55 = point3.equals((java.lang.Object) point31);
        Line line56 = new Line(point0, point31);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 0.0d;
        java.lang.Object obj7 = null;
        boolean boolean8 = point3.equals(obj7);
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point12.y = 1.0d;
        java.lang.Double double15 = point12.y;
        point12.x = 100.0d;
        point12.x = 100.0d;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        point22.x = 100.0d;
        point22.y = 10.0d;
        boolean boolean31 = point22.equals((java.lang.Object) 0L);
        java.lang.Double double32 = point22.y;
        boolean boolean33 = point12.equals((java.lang.Object) double32);
        point12.y = 0.0d;
        java.lang.Double double36 = point12.y;
        boolean boolean37 = point3.equals((java.lang.Object) point12);
        point3.y = 100.0d;
        Line line40 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        java.lang.Double double15 = point2.y;
        java.lang.Double double16 = point2.x;
        point2.x = 100.0d;
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double23 = point22.y;
        java.lang.Double double24 = point22.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean29 = point27.equals((java.lang.Object) true);
        boolean boolean30 = point22.equals((java.lang.Object) true);
        java.lang.Double double31 = point22.y;
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.y = 0.0d;
        boolean boolean40 = point22.equals((java.lang.Object) point34);
        point22.y = 1.0d;
        boolean boolean43 = point2.equals((java.lang.Object) point22);
        Point point44 = null;
        Line line45 = new Line(point22, point44);
        org.junit.Assert.assertTrue("Contract failed: line45.equals(line45)", line45.equals(line45));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
        point3.y = 0.0d;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        point3.y = 100.0d;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.y;
        point3.y = 100.0d;
        java.lang.Double double16 = point3.x;
        point3.x = (-1.0d);
        Line line19 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        point2.y = (-1.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.x;
        boolean boolean53 = point50.equals((java.lang.Object) 10.0f);
        point50.x = 100.0d;
        java.lang.Double double56 = point50.x;
        Point point59 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point59.x = 100.0d;
        boolean boolean62 = point50.equals((java.lang.Object) 100.0d);
        java.lang.Double double63 = point50.y;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        point66.y = 1.0d;
        point66.x = 100.0d;
        java.lang.Double double72 = point66.x;
        boolean boolean73 = point50.equals((java.lang.Object) point66);
        java.lang.Double double74 = point50.x;
        java.lang.Class<?> wildcardClass75 = point50.getClass();
        boolean boolean76 = point2.equals((java.lang.Object) wildcardClass75);
        Point point77 = null;
        Line line78 = new Line(point2, point77);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        point2.x = (-1.0d);
        java.lang.Double double16 = point2.y;
        Point point17 = null;
        Line line18 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        java.lang.Double double19 = point2.y;
        point2.x = 1.0d;
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.x;
        point3.y = 1.0d;
        java.lang.Double double11 = point3.x;
        point3.x = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 0.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        point24.y = 1.0d;
        java.lang.Double double28 = point24.y;
        java.lang.Object obj29 = new java.lang.Object();
        boolean boolean30 = point24.equals(obj29);
        java.lang.Double double31 = point24.x;
        java.lang.Double double32 = point24.y;
        point24.x = (-1.0d);
        boolean boolean35 = point16.equals((java.lang.Object) (-1.0d));
        point16.y = 10.0d;
        java.lang.Double double38 = point16.x;
        boolean boolean39 = point3.equals((java.lang.Object) point16);
        java.lang.Double double40 = point16.y;
        point16.y = 0.0d;
        Line line43 = new Line(point0, point16);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Object obj9 = null;
        boolean boolean10 = point3.equals(obj9);
        boolean boolean12 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = point3.equals(obj13);
        point3.y = 0.0d;
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        point19.x = (-1.0d);
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean38 = point35.equals((java.lang.Object) 1L);
        java.lang.Double double39 = point35.y;
        boolean boolean40 = point32.equals((java.lang.Object) double39);
        point32.x = 10.0d;
        java.lang.Double double43 = point32.x;
        point32.x = 10.0d;
        java.lang.Double double46 = point32.y;
        boolean boolean47 = point19.equals((java.lang.Object) double46);
        boolean boolean48 = point9.equals((java.lang.Object) point19);
        point19.x = 0.0d;
        java.lang.Double double51 = point19.x;
        Point point52 = null;
        Line line53 = new Line(point19, point52);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean14 = point2.equals((java.lang.Object) point12);
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        boolean boolean23 = point20.equals((java.lang.Object) 1L);
        java.lang.Double double24 = point20.y;
        boolean boolean25 = point17.equals((java.lang.Object) double24);
        java.lang.Double double26 = point17.y;
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
        boolean boolean48 = point17.equals((java.lang.Object) point32);
        java.lang.Double double49 = point17.x;
        java.lang.Double double50 = point17.x;
        boolean boolean51 = point12.equals((java.lang.Object) point17);
        Point point54 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point54.x = 1.0d;
        point54.y = (-1.0d);
        Point point61 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double62 = point61.y;
        point61.y = 10.0d;
        boolean boolean65 = point54.equals((java.lang.Object) 10.0d);
        java.lang.Double double66 = point54.y;
        java.lang.Double double67 = point54.y;
        java.lang.Double double68 = point54.x;
        Point point71 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double72 = point71.y;
        point71.y = 0.0d;
        java.lang.Double double75 = point71.y;
        point71.y = (-1.0d);
        point71.y = 100.0d;
        java.lang.Double double80 = point71.y;
        boolean boolean81 = point54.equals((java.lang.Object) point71);
        boolean boolean82 = point17.equals((java.lang.Object) point71);
        java.lang.Double double83 = point71.x;
        Point point84 = null;
        Line line85 = new Line(point71, point84);
        org.junit.Assert.assertTrue("Contract failed: line85.equals(line85)", line85.equals(line85));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        java.lang.Double double17 = point3.y;
        java.lang.Object obj18 = null;
        boolean boolean19 = point3.equals(obj18);
        java.lang.Double double20 = point3.y;
        Line line21 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        point3.y = 1.0d;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.x;
        point3.y = 1.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.x;
        point3.y = 0.0d;
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.x;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        boolean boolean19 = point10.equals((java.lang.Object) point14);
        boolean boolean20 = point3.equals((java.lang.Object) point10);
        Line line21 = new Line(point0, point10);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point3.y = 10.0d;
        java.lang.Double double6 = point3.x;
        point3.y = 1.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        point11.x = 100.0d;
        point11.y = 10.0d;
        point11.y = 10.0d;
        point11.x = 0.0d;
        boolean boolean23 = point3.equals((java.lang.Object) point11);
        java.lang.Double double24 = point3.y;
        java.lang.Double double25 = point3.y;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point28.y = 0.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.x;
        point28.x = 10.0d;
        boolean boolean35 = point3.equals((java.lang.Object) point28);
        Line line36 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 0.0d;
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        point11.y = 1.0d;
        java.lang.Double double15 = point11.y;
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = point11.equals(obj16);
        java.lang.Double double18 = point11.x;
        java.lang.Double double19 = point11.y;
        point11.x = (-1.0d);
        boolean boolean22 = point3.equals((java.lang.Object) (-1.0d));
        point3.y = 10.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean34 = point27.equals((java.lang.Object) point30);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        boolean boolean50 = point30.equals((java.lang.Object) boolean49);
        java.lang.Double double51 = point30.x;
        point30.x = 10.0d;
        point30.x = 10.0d;
        boolean boolean56 = point3.equals((java.lang.Object) point30);
        java.lang.Double double57 = point30.y;
        Line line58 = new Line(point0, point30);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean5 = point3.equals((java.lang.Object) true);
        point3.y = 100.0d;
        point3.y = 1.0d;
        java.lang.Double double10 = point3.x;
        point3.y = 0.0d;
        Line line13 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        java.lang.Double double23 = point20.x;
        Point point26 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point26.y = 0.0d;
        java.lang.Double double29 = point26.y;
        point26.x = 100.0d;
        point26.x = 100.0d;
        java.lang.Double double34 = point26.y;
        boolean boolean35 = point20.equals((java.lang.Object) point26);
        boolean boolean36 = point2.equals((java.lang.Object) point20);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        boolean boolean42 = point39.equals((java.lang.Object) 1L);
        point39.y = (-1.0d);
        java.lang.Double double45 = point39.y;
        java.lang.Double double46 = point39.y;
        point39.y = 10.0d;
        point39.x = 1.0d;
        boolean boolean51 = point2.equals((java.lang.Object) 1.0d);
        Point point52 = null;
        Line line53 = new Line(point2, point52);
        org.junit.Assert.assertTrue("Contract failed: line53.equals(line53)", line53.equals(line53));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        point3.x = 10.0d;
        java.lang.Double double14 = point3.x;
        point3.y = 0.0d;
        point3.x = (-1.0d);
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point21.y = 0.0d;
        java.lang.Double double24 = point21.y;
        point21.x = 100.0d;
        point21.x = 100.0d;
        java.lang.Double double29 = point21.y;
        java.lang.Double double30 = point21.y;
        boolean boolean31 = point3.equals((java.lang.Object) point21);
        java.lang.Double double32 = point21.y;
        Line line33 = new Line(point0, point21);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        point3.x = 1.0d;
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.x;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.x;
        boolean boolean23 = point20.equals((java.lang.Object) 10.0f);
        point20.x = 100.0d;
        java.lang.Double double26 = point20.x;
        point20.y = 1.0d;
        point20.y = 1.0d;
        boolean boolean31 = point16.equals((java.lang.Object) point20);
        java.lang.Class<?> wildcardClass32 = point20.getClass();
        boolean boolean33 = point3.equals((java.lang.Object) point20);
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point36.x = 0.0d;
        point36.y = 1.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        boolean boolean44 = point36.equals((java.lang.Object) (-1.0d));
        boolean boolean45 = point3.equals((java.lang.Object) (-1.0d));
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.y;
        point48.y = 1.0d;
        java.lang.Double double52 = point48.y;
        java.lang.Object obj53 = new java.lang.Object();
        boolean boolean54 = point48.equals(obj53);
        java.lang.Double double55 = point48.y;
        point48.x = 10.0d;
        java.lang.Double double58 = point48.y;
        boolean boolean59 = point3.equals((java.lang.Object) point48);
        java.lang.Double double60 = point48.x;
        Line line61 = new Line(point0, point48);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 10.0d;
        point2.x = 1.0d;
        java.lang.Double double10 = point2.x;
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.x = 0.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = 0.0d;
        java.lang.Double double11 = point3.x;
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
        point19.x = (-1.0d);
        boolean boolean42 = point3.equals((java.lang.Object) point19);
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.x;
        boolean boolean48 = point45.equals((java.lang.Object) 10.0f);
        point45.x = 100.0d;
        java.lang.Double double51 = point45.x;
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point54.x = 100.0d;
        boolean boolean57 = point45.equals((java.lang.Object) 100.0d);
        point45.x = 10.0d;
        java.lang.Double double60 = point45.x;
        java.lang.Double double61 = point45.x;
        boolean boolean62 = point19.equals((java.lang.Object) point45);
        java.lang.Double double63 = point19.y;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point66.y = 1.0d;
        point66.y = (-1.0d);
        java.lang.Double double71 = point66.x;
        java.lang.Double double72 = point66.x;
        point66.x = 0.0d;
        boolean boolean75 = point19.equals((java.lang.Object) point66);
        Line line76 = new Line(point0, point19);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.y;
        point30.y = 10.0d;
        boolean boolean34 = point27.equals((java.lang.Object) point30);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        Point point43 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double44 = point43.x;
        boolean boolean46 = point43.equals((java.lang.Object) 10.0f);
        point43.x = 100.0d;
        boolean boolean49 = point37.equals((java.lang.Object) 100.0d);
        boolean boolean50 = point30.equals((java.lang.Object) boolean49);
        java.lang.Double double51 = point30.x;
        point30.y = (-1.0d);
        point30.y = 100.0d;
        boolean boolean56 = point2.equals((java.lang.Object) 100.0d);
        Point point59 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point62 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point62.x = 1.0d;
        point62.y = 1.0d;
        boolean boolean67 = point59.equals((java.lang.Object) 1.0d);
        java.lang.Double double68 = point59.y;
        boolean boolean69 = point2.equals((java.lang.Object) double68);
        point2.y = (-1.0d);
        Point point72 = null;
        Line line73 = new Line(point2, point72);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        point6.y = 10.0d;
        boolean boolean10 = point3.equals((java.lang.Object) point6);
        point3.y = 0.0d;
        java.lang.Double double13 = point3.x;
        java.lang.Double double14 = point3.y;
        Line line15 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        point2.x = 0.0d;
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
        boolean boolean29 = point2.equals((java.lang.Object) point15);
        java.lang.Double double30 = point2.x;
        point2.x = 10.0d;
        point2.y = 0.0d;
        Point point35 = null;
        Line line36 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        java.lang.Double double37 = point35.y;
        java.lang.Double double38 = point35.y;
        java.lang.Double double39 = point35.y;
        boolean boolean40 = point2.equals((java.lang.Object) point35);
        point2.x = 100.0d;
        java.lang.Double double43 = point2.y;
        java.lang.Double double44 = point2.x;
        Point point45 = null;
        Line line46 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double6 = point2.y;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point9.y = 1.0d;
        java.lang.Double double12 = point9.y;
        boolean boolean13 = point2.equals((java.lang.Object) point9);
        point9.y = 10.0d;
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
        point47.x = 1.0d;
        java.lang.Double double52 = point47.y;
        java.lang.Double double53 = point47.x;
        boolean boolean54 = point9.equals((java.lang.Object) point47);
        Point point55 = null;
        Line line56 = new Line(point9, point55);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 0.0d;
        java.lang.Double double11 = point8.x;
        java.lang.Class<?> wildcardClass12 = point8.getClass();
        boolean boolean13 = point3.equals((java.lang.Object) point8);
        Line line14 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        point3.y = 100.0d;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.y;
        point3.x = 1.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        java.lang.Double double50 = point2.y;
        java.lang.Double double51 = point2.x;
        point2.x = 10.0d;
        point2.x = 0.0d;
        Point point56 = null;
        Line line57 = new Line(point2, point56);
        org.junit.Assert.assertTrue("Contract failed: line57.equals(line57)", line57.equals(line57));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        boolean boolean6 = point3.equals((java.lang.Object) 10.0f);
        point3.x = 100.0d;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point12.x = 100.0d;
        boolean boolean15 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        boolean boolean27 = point19.equals((java.lang.Object) 1.0d);
        java.lang.Double double28 = point19.y;
        point19.x = 0.0d;
        boolean boolean31 = point3.equals((java.lang.Object) 0.0d);
        point3.y = (-1.0d);
        point3.y = (-1.0d);
        java.lang.Double double36 = point3.y;
        Point point39 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point39.y = 0.0d;
        java.lang.Double double42 = point39.y;
        point39.x = 1.0d;
        java.lang.Double double45 = point39.y;
        boolean boolean46 = point3.equals((java.lang.Object) point39);
        Line line47 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.x = 10.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 1.0d;
        Point point16 = null;
        Line line17 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        point2.x = 10.0d;
        Point point28 = null;
        Line line29 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        java.lang.Double double8 = point6.y;
        java.lang.Double double9 = point6.x;
        boolean boolean10 = point2.equals((java.lang.Object) point6);
        java.lang.Double double11 = point6.y;
        Point point12 = null;
        Line line13 = new Line(point6, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.x;
        java.lang.Double double9 = point3.x;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.y;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.y;
        point3.x = 0.0d;
        java.lang.Double double10 = point3.y;
        Line line11 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        point2.x = (-1.0d);
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.y;
        java.lang.Double double15 = point2.x;
        point2.x = 100.0d;
        Point point18 = null;
        Line line19 = new Line(point2, point18);
        org.junit.Assert.assertTrue("Contract failed: line19.equals(line19)", line19.equals(line19));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double9 = point2.x;
        point2.y = 0.0d;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj17 = null;
        boolean boolean18 = point16.equals(obj17);
        boolean boolean19 = point3.equals((java.lang.Object) point16);
        point3.x = 100.0d;
        java.lang.Double double22 = point3.y;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        java.lang.Double double10 = point3.y;
        point3.x = 10.0d;
        java.lang.Double double13 = point3.y;
        point3.y = 10.0d;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        java.lang.Double double22 = point18.y;
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = point18.equals(obj23);
        java.lang.Double double25 = point18.y;
        point18.x = 10.0d;
        java.lang.Double double28 = point18.y;
        boolean boolean29 = point3.equals((java.lang.Object) double28);
        java.lang.Double double30 = point3.y;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        java.lang.Double double22 = point13.y;
        java.lang.Double double23 = point13.x;
        point13.y = 1.0d;
        point13.y = 100.0d;
        java.lang.Double double28 = point13.x;
        point13.x = 10.0d;
        boolean boolean31 = point2.equals((java.lang.Object) point13);
        Point point32 = null;
        Line line33 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        boolean boolean27 = point24.equals((java.lang.Object) 1L);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        boolean boolean36 = point24.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass37 = point24.getClass();
        boolean boolean38 = point21.equals((java.lang.Object) wildcardClass37);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        java.lang.Double double46 = point44.y;
        boolean boolean47 = point41.equals((java.lang.Object) point44);
        point41.x = 10.0d;
        boolean boolean50 = point21.equals((java.lang.Object) point41);
        point21.x = 10.0d;
        point21.y = 100.0d;
        point21.x = (-1.0d);
        java.lang.Double double57 = point21.x;
        java.lang.Double double58 = point21.y;
        java.lang.Class<?> wildcardClass59 = point21.getClass();
        boolean boolean60 = point2.equals((java.lang.Object) wildcardClass59);
        point2.x = 100.0d;
        point2.x = 0.0d;
        Point point65 = null;
        Line line66 = new Line(point2, point65);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        point3.y = (-1.0d);
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.y;
        java.lang.Double double11 = point3.y;
        java.lang.Double double12 = point3.x;
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
        boolean boolean35 = point3.equals((java.lang.Object) point15);
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        java.lang.Double double45 = point41.y;
        boolean boolean46 = point38.equals((java.lang.Object) double45);
        java.lang.Double double47 = point38.y;
        java.lang.Double double48 = point38.x;
        java.lang.Double double49 = point38.x;
        boolean boolean50 = point3.equals((java.lang.Object) double49);
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point56 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double57 = point56.y;
        java.lang.Double double58 = point56.y;
        boolean boolean59 = point53.equals((java.lang.Object) point56);
        java.lang.Double double60 = point56.x;
        Point point63 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double64 = point63.y;
        boolean boolean65 = point56.equals((java.lang.Object) double64);
        point56.x = 0.0d;
        point56.x = 10.0d;
        point56.x = 0.0d;
        java.lang.Double double72 = point56.y;
        boolean boolean73 = point3.equals((java.lang.Object) point56);
        java.lang.Double double74 = point56.y;
        java.lang.Double double75 = point56.x;
        Line line76 = new Line(point0, point56);
        org.junit.Assert.assertTrue("Contract failed: line76.equals(line76)", line76.equals(line76));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        java.lang.Double double44 = point2.y;
        java.lang.Double double45 = point2.y;
        Point point46 = null;
        Line line47 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = 10.0d;
        java.lang.Double double11 = point3.x;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.x;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        java.lang.Double double25 = point2.y;
        point2.y = 100.0d;
        point2.x = 10.0d;
        Point point30 = null;
        Line line31 = new Line(point2, point30);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        point3.y = 0.0d;
        Point point15 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 100.0d;
        java.lang.Double double19 = point15.y;
        java.lang.Object obj20 = null;
        boolean boolean21 = point15.equals(obj20);
        boolean boolean22 = point3.equals(obj20);
        java.lang.Double double23 = point3.x;
        java.lang.Double double24 = point3.x;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        java.lang.Double double31 = point27.y;
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = point27.equals(obj32);
        point27.x = 1.0d;
        java.lang.Double double36 = point27.y;
        point27.y = 100.0d;
        java.lang.Class<?> wildcardClass39 = point27.getClass();
        boolean boolean40 = point3.equals((java.lang.Object) point27);
        java.lang.Double double41 = point3.x;
        Line line42 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        point7.x = 1.0d;
        java.lang.Double double13 = point7.y;
        java.lang.Double double14 = point7.y;
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double18 = point17.y;
        boolean boolean19 = point7.equals((java.lang.Object) point17);
        point17.y = (-1.0d);
        java.lang.Double double22 = point17.x;
        boolean boolean23 = point3.equals((java.lang.Object) point17);
        Line line24 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        point3.y = (-1.0d);
        point3.x = (-1.0d);
        java.lang.Double double27 = point3.y;
        java.lang.Double double28 = point3.x;
        Point point31 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point31.y = 0.0d;
        java.lang.Double double34 = point31.y;
        point31.x = 100.0d;
        point31.x = 100.0d;
        java.lang.Double double39 = point31.y;
        point31.y = 0.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point44.y = (-1.0d);
        java.lang.Double double47 = point44.y;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.x;
        boolean boolean53 = point50.equals((java.lang.Object) 10.0f);
        point50.x = 100.0d;
        java.lang.Double double56 = point50.x;
        point50.y = 1.0d;
        boolean boolean59 = point44.equals((java.lang.Object) point50);
        java.lang.Class<?> wildcardClass60 = point44.getClass();
        boolean boolean61 = point31.equals((java.lang.Object) point44);
        boolean boolean62 = point3.equals((java.lang.Object) boolean61);
        Line line63 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line63.equals(line63)", line63.equals(line63));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 10.0d;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point16.y = 1.0d;
        java.lang.Double double19 = point16.y;
        point16.x = 100.0d;
        point16.x = 100.0d;
        Point point26 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        point26.y = 1.0d;
        point26.x = 100.0d;
        point26.y = 10.0d;
        boolean boolean35 = point26.equals((java.lang.Object) 0L);
        java.lang.Double double36 = point26.y;
        boolean boolean37 = point16.equals((java.lang.Object) double36);
        java.lang.Double double38 = point16.y;
        point16.y = (-1.0d);
        boolean boolean41 = point2.equals((java.lang.Object) (-1.0d));
        Point point42 = null;
        Line line43 = new Line(point2, point42);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point6.x = 1.0d;
        point6.y = 1.0d;
        boolean boolean11 = point3.equals((java.lang.Object) 1.0d);
        java.lang.Double double12 = point3.y;
        point3.x = 0.0d;
        java.lang.Double double15 = point3.x;
        java.lang.Double double16 = point3.x;
        java.lang.Double double17 = point3.y;
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
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
        point17.y = (-1.0d);
        point17.x = 1.0d;
        Point point77 = null;
        Line line78 = new Line(point17, point77);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj17 = null;
        boolean boolean18 = point16.equals(obj17);
        boolean boolean19 = point3.equals((java.lang.Object) point16);
        point3.x = 100.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point27 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        java.lang.Double double29 = point27.y;
        boolean boolean30 = point24.equals((java.lang.Object) point27);
        java.lang.Double double31 = point27.x;
        boolean boolean32 = point3.equals((java.lang.Object) point27);
        point27.y = 1.0d;
        java.lang.Double double35 = point27.y;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        java.lang.Double double41 = point38.y;
        java.lang.Double double42 = point38.y;
        point38.y = 0.0d;
        point38.x = 0.0d;
        point38.y = 100.0d;
        boolean boolean49 = point27.equals((java.lang.Object) point38);
        point38.y = (-1.0d);
        Line line52 = new Line(point0, point38);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point8.y = 0.0d;
        java.lang.Double double11 = point8.y;
        point8.x = 100.0d;
        point8.x = 100.0d;
        java.lang.Double double16 = point8.y;
        boolean boolean17 = point2.equals((java.lang.Object) point8);
        java.lang.Double double18 = point8.x;
        java.lang.Double double19 = point8.y;
        point8.x = 10.0d;
        Point point22 = null;
        Line line23 = new Line(point8, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point5.y = (-1.0d);
        java.lang.Double double8 = point5.x;
        point5.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.x;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean20 = point18.equals((java.lang.Object) true);
        boolean boolean21 = point13.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass22 = point13.getClass();
        boolean boolean23 = point5.equals((java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = point5.getClass();
        boolean boolean25 = point2.equals((java.lang.Object) wildcardClass24);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 1.0d;
        point28.x = 100.0d;
        point28.x = 10.0d;
        point28.y = 10.0d;
        boolean boolean38 = point2.equals((java.lang.Object) point28);
        Point point39 = null;
        Line line40 = new Line(point2, point39);
        org.junit.Assert.assertTrue("Contract failed: line40.equals(line40)", line40.equals(line40));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        Point point20 = null;
        Line line21 = new Line(point6, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        java.lang.Double double41 = point37.y;
        point37.y = 0.0d;
        java.lang.Double double44 = point37.y;
        Point point47 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean49 = point47.equals((java.lang.Object) (byte) 100);
        java.lang.Double double50 = point47.x;
        point47.x = (-1.0d);
        point47.x = 10.0d;
        point47.y = (-1.0d);
        point47.x = 10.0d;
        boolean boolean59 = point37.equals((java.lang.Object) point47);
        Point point62 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point62.x = 0.0d;
        point62.y = 1.0d;
        java.lang.Double double67 = point62.x;
        java.lang.Double double68 = point62.x;
        boolean boolean69 = point37.equals((java.lang.Object) point62);
        boolean boolean70 = point13.equals((java.lang.Object) point62);
        java.lang.Double double71 = point13.x;
        point13.y = 10.0d;
        java.lang.Double double74 = point13.x;
        java.lang.Double double75 = point13.x;
        java.lang.Double double76 = point13.x;
        Point point77 = null;
        Line line78 = new Line(point13, point77);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        java.lang.Double double10 = point3.y;
        point3.y = (-1.0d);
        java.lang.Double double13 = point3.x;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point5.x = 1.0d;
        point5.y = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double11 = point2.y;
        java.lang.Double double12 = point2.y;
        java.lang.Double double13 = point2.x;
        point2.x = 10.0d;
        Point point16 = null;
        Line line17 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Object obj9 = null;
        boolean boolean10 = point3.equals(obj9);
        point3.x = (-1.0d);
        point3.y = (-1.0d);
        java.lang.Double double15 = point3.y;
        java.lang.Double double16 = point3.x;
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point7.y = 10.0d;
        java.lang.Double double10 = point7.x;
        point7.y = 1.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        point15.y = 1.0d;
        point15.x = 100.0d;
        point15.y = 10.0d;
        point15.y = 10.0d;
        point15.x = 0.0d;
        boolean boolean27 = point7.equals((java.lang.Object) point15);
        java.lang.Double double28 = point7.y;
        java.lang.Double double29 = point7.y;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point32.y = 0.0d;
        java.lang.Double double35 = point32.y;
        java.lang.Double double36 = point32.x;
        point32.x = 10.0d;
        boolean boolean39 = point7.equals((java.lang.Object) point32);
        boolean boolean40 = point2.equals((java.lang.Object) boolean39);
        Point point41 = null;
        Line line42 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        java.lang.Double double49 = point26.x;
        Point point50 = null;
        Line line51 = new Line(point26, point50);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        point3.y = (-1.0d);
        java.lang.Double double15 = point3.y;
        point3.x = 10.0d;
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
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
        point20.y = 100.0d;
        java.lang.Double double36 = point20.x;
        Point point37 = null;
        Line line38 = new Line(point20, point37);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        java.lang.Double double50 = point2.y;
        point2.x = 10.0d;
        Point point53 = null;
        Line line54 = new Line(point2, point53);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        point3.y = (-1.0d);
        point3.y = 0.0d;
        java.lang.Double double10 = point3.x;
        point3.y = 100.0d;
        point3.y = 10.0d;
        point3.x = 0.0d;
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.y;
        point3.y = (-1.0d);
        point3.x = 0.0d;
        java.lang.Double double11 = point3.y;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.x;
        Line line14 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        point2.y = (-1.0d);
        point2.x = 0.0d;
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.y = 1.0d;
        Point point7 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point7.y = 1.0d;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        point7.y = 0.0d;
        point7.x = 10.0d;
        point7.y = 1.0d;
        boolean boolean18 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double19 = point2.y;
        Point point20 = null;
        Line line21 = new Line(point2, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        Point point34 = null;
        Line line35 = new Line(point6, point34);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        java.lang.Double double23 = point14.x;
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double27 = point26.y;
        java.lang.Double double28 = point26.y;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        java.lang.Double double35 = point31.y;
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = point31.equals(obj36);
        point31.x = 1.0d;
        point31.x = 10.0d;
        point31.y = 0.0d;
        java.lang.Double double44 = point31.y;
        point31.y = 0.0d;
        boolean boolean47 = point26.equals((java.lang.Object) point31);
        boolean boolean48 = point14.equals((java.lang.Object) point31);
        point14.y = 10.0d;
        Point point51 = null;
        Line line52 = new Line(point14, point51);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.y;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        java.lang.Double double14 = point2.x;
        Point point17 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point17.y = 0.0d;
        java.lang.Double double20 = point17.x;
        point17.x = 10.0d;
        point17.x = 0.0d;
        java.lang.Double double25 = point17.x;
        boolean boolean26 = point2.equals((java.lang.Object) point17);
        java.lang.Double double27 = point2.y;
        Point point28 = null;
        Line line29 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.x;
        point3.x = 1.0d;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        point12.y = 1.0d;
        java.lang.Double double16 = point12.y;
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = point12.equals(obj17);
        java.lang.Double double19 = point12.y;
        point12.x = 1.0d;
        boolean boolean22 = point3.equals((java.lang.Object) point12);
        Point point25 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        boolean boolean26 = point12.equals((java.lang.Object) point25);
        java.lang.Double double27 = point25.x;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point30.x = 0.0d;
        point30.y = 1.0d;
        Point point37 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        boolean boolean38 = point30.equals((java.lang.Object) (-1.0d));
        boolean boolean39 = point25.equals((java.lang.Object) boolean38);
        point25.y = 0.0d;
        Line line42 = new Line(point0, point25);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        point2.x = 0.0d;
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
        boolean boolean29 = point2.equals((java.lang.Object) point15);
        point2.y = 1.0d;
        Point point32 = null;
        Line line33 = new Line(point2, point32);
        org.junit.Assert.assertTrue("Contract failed: line33.equals(line33)", line33.equals(line33));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
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
        point2.x = 100.0d;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        java.lang.Double double24 = point21.y;
        java.lang.Double double25 = point21.y;
        point21.y = 10.0d;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        java.lang.Double double36 = point30.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point39.x = 100.0d;
        boolean boolean42 = point30.equals((java.lang.Object) 100.0d);
        java.lang.Double double43 = point30.y;
        point30.y = 100.0d;
        boolean boolean46 = point21.equals((java.lang.Object) point30);
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
        boolean boolean68 = point30.equals((java.lang.Object) point61);
        java.lang.Double double69 = point61.x;
        java.lang.Double double70 = point61.y;
        point61.x = 0.0d;
        boolean boolean73 = point2.equals((java.lang.Object) point61);
        point61.y = 0.0d;
        java.lang.Double double76 = point61.y;
        Point point77 = null;
        Line line78 = new Line(point61, point77);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        point3.y = 0.0d;
        java.lang.Double double16 = point3.y;
        Point point19 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        boolean boolean25 = point22.equals((java.lang.Object) 1L);
        java.lang.Double double26 = point22.y;
        boolean boolean27 = point19.equals((java.lang.Object) double26);
        java.lang.Double double28 = point19.x;
        boolean boolean29 = point3.equals((java.lang.Object) point19);
        Point point32 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point32.x = 0.0d;
        point32.y = (-1.0d);
        point32.y = 0.0d;
        point32.y = 10.0d;
        point32.x = 1.0d;
        boolean boolean43 = point3.equals((java.lang.Object) point32);
        point3.y = 0.0d;
        point3.x = 0.0d;
        point3.x = 100.0d;
        java.lang.Double double50 = point3.x;
        Line line51 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
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
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        point28.y = 100.0d;
        point28.y = 0.0d;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        java.lang.Double double45 = point42.x;
        point42.y = 1.0d;
        point42.x = 0.0d;
        boolean boolean50 = point28.equals((java.lang.Object) point42);
        point28.y = 100.0d;
        boolean boolean53 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double54 = point2.x;
        Point point55 = null;
        Line line56 = new Line(point2, point55);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double7 = point2.x;
        point2.x = 0.0d;
        java.lang.Double double10 = point2.y;
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double14 = point13.y;
        java.lang.Double double15 = point13.x;
        point13.y = 0.0d;
        point13.y = (-1.0d);
        point13.y = 100.0d;
        java.lang.Double double22 = point13.x;
        java.lang.Double double23 = point13.x;
        point13.x = 1.0d;
        point13.x = (-1.0d);
        boolean boolean28 = point2.equals((java.lang.Object) point13);
        Point point29 = null;
        Line line30 = new Line(point2, point29);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point2.x = 0.0d;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.y;
        point7.y = 1.0d;
        java.lang.Double double11 = point7.y;
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = point7.equals(obj12);
        java.lang.Double double14 = point7.x;
        java.lang.Double double15 = point7.y;
        point7.x = (-1.0d);
        point7.y = 100.0d;
        boolean boolean20 = point2.equals((java.lang.Object) point7);
        Point point21 = null;
        Line line22 = new Line(point7, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 10.0d;
        java.lang.Double double10 = point3.y;
        point3.x = 0.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.x;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        boolean boolean24 = point15.equals((java.lang.Object) point19);
        boolean boolean25 = point3.equals((java.lang.Object) point19);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double29 = point28.y;
        boolean boolean31 = point28.equals((java.lang.Object) 1L);
        point28.y = (-1.0d);
        java.lang.Double double34 = point28.y;
        java.lang.Double double35 = point28.y;
        java.lang.Double double36 = point28.x;
        point28.x = 10.0d;
        java.lang.Class<?> wildcardClass39 = point28.getClass();
        boolean boolean40 = point3.equals((java.lang.Object) point28);
        java.lang.Double double41 = point3.y;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.y;
        boolean boolean50 = point44.equals((java.lang.Object) point47);
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.y;
        java.lang.Double double55 = point53.y;
        boolean boolean56 = point47.equals((java.lang.Object) double55);
        Point point59 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double60 = point59.y;
        java.lang.Double double61 = point59.x;
        java.lang.Double double62 = point59.x;
        Point point65 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point65.y = 0.0d;
        java.lang.Double double68 = point65.y;
        point65.x = 100.0d;
        point65.x = 100.0d;
        java.lang.Double double73 = point65.y;
        boolean boolean74 = point59.equals((java.lang.Object) point65);
        java.lang.Double double75 = point65.x;
        boolean boolean76 = point47.equals((java.lang.Object) point65);
        boolean boolean77 = point3.equals((java.lang.Object) point65);
        java.lang.Double double78 = point65.x;
        Line line79 = new Line(point0, point65);
        org.junit.Assert.assertTrue("Contract failed: line79.equals(line79)", line79.equals(line79));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        java.lang.Double double32 = point28.y;
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = point28.equals(obj33);
        java.lang.Double double35 = point28.y;
        point28.y = 100.0d;
        point28.y = 0.0d;
        Point point42 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double43 = point42.y;
        java.lang.Double double44 = point42.y;
        java.lang.Double double45 = point42.x;
        point42.y = 1.0d;
        point42.x = 0.0d;
        boolean boolean50 = point28.equals((java.lang.Object) point42);
        point28.y = 100.0d;
        boolean boolean53 = point2.equals((java.lang.Object) 100.0d);
        java.lang.Double double54 = point2.x;
        point2.x = 100.0d;
        Point point57 = null;
        Line line58 = new Line(point2, point57);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point17.x = 1.0d;
        point17.y = 1.0d;
        boolean boolean22 = point14.equals((java.lang.Object) 1.0d);
        java.lang.Double double23 = point14.x;
        boolean boolean24 = point3.equals((java.lang.Object) double23);
        java.lang.Double double25 = point3.x;
        Line line26 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        point3.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.y;
        point14.y = 1.0d;
        java.lang.Double double18 = point14.y;
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = point14.equals(obj19);
        point14.x = 1.0d;
        java.lang.Double double23 = point14.x;
        point14.y = 0.0d;
        point14.x = 1.0d;
        java.lang.Double double28 = point14.x;
        java.lang.Double double29 = point14.x;
        point14.x = 10.0d;
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        boolean boolean40 = point37.equals((java.lang.Object) 1L);
        java.lang.Double double41 = point37.y;
        boolean boolean42 = point34.equals((java.lang.Object) double41);
        java.lang.Double double43 = point34.y;
        java.lang.Double double44 = point34.x;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean53 = point50.equals((java.lang.Object) 1L);
        java.lang.Double double54 = point50.y;
        boolean boolean55 = point47.equals((java.lang.Object) double54);
        java.lang.Double double56 = point47.y;
        boolean boolean57 = point34.equals((java.lang.Object) point47);
        point34.x = 100.0d;
        point34.x = 10.0d;
        boolean boolean62 = point14.equals((java.lang.Object) 10.0d);
        boolean boolean63 = point3.equals((java.lang.Object) point14);
        point14.x = 1.0d;
        Line line66 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        java.lang.Double double11 = point2.x;
        point2.y = 10.0d;
        java.lang.Double double14 = point2.x;
        point2.x = 0.0d;
        Point point17 = null;
        Line line18 = new Line(point2, point17);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        java.lang.Double double16 = point2.y;
        java.lang.Double double17 = point2.x;
        java.lang.Double double18 = point2.x;
        Point point19 = null;
        Line line20 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        java.lang.Double double5 = point2.y;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        point8.x = 100.0d;
        point8.y = 0.0d;
        point8.x = (-1.0d);
        point8.x = 1.0d;
        boolean boolean17 = point2.equals((java.lang.Object) point8);
        point2.y = 1.0d;
        java.lang.Double double20 = point2.x;
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.y = 10.0d;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        java.lang.Double double10 = point2.y;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point18 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 10.0d;
        boolean boolean22 = point15.equals((java.lang.Object) point18);
        Point point25 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass26 = point25.getClass();
        boolean boolean27 = point18.equals((java.lang.Object) wildcardClass26);
        Point point30 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point30.x = 1.0d;
        boolean boolean33 = point18.equals((java.lang.Object) point30);
        boolean boolean34 = point3.equals((java.lang.Object) point18);
        java.lang.Double double35 = point3.x;
        java.lang.Double double36 = point3.x;
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.y;
        point39.y = 10.0d;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point49.x = 0.0d;
        point49.y = 1.0d;
        java.lang.Double double54 = point49.x;
        java.lang.Double double55 = point49.x;
        boolean boolean56 = point39.equals((java.lang.Object) point49);
        boolean boolean57 = point3.equals((java.lang.Object) point49);
        point3.x = (-1.0d);
        java.lang.Double double60 = point3.x;
        point3.x = 100.0d;
        point3.y = 1.0d;
        Line line65 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point5.x = 1.0d;
        point5.x = 1.0d;
        boolean boolean10 = point2.equals((java.lang.Object) 1.0d);
        point2.y = (-1.0d);
        java.lang.Double double13 = point2.x;
        point2.y = 1.0d;
        Point point16 = null;
        Line line17 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
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
        java.lang.Double double18 = point2.y;
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        java.lang.Double double23 = point21.x;
        java.lang.Double double24 = point21.x;
        point21.y = 0.0d;
        point21.y = 1.0d;
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        point31.y = 1.0d;
        point31.x = 100.0d;
        java.lang.Double double37 = point31.y;
        point31.y = 100.0d;
        point31.x = (-1.0d);
        java.lang.Double double42 = point31.x;
        boolean boolean43 = point21.equals((java.lang.Object) double42);
        Point point46 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 10.0d;
        point46.y = 0.0d;
        boolean boolean52 = point21.equals((java.lang.Object) point46);
        java.lang.Double double53 = point46.y;
        boolean boolean54 = point2.equals((java.lang.Object) double53);
        Point point55 = null;
        Line line56 = new Line(point2, point55);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        point3.y = 0.0d;
        java.lang.Double double8 = point3.x;
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.x;
        point3.x = 1.0d;
        point3.y = 0.0d;
        Line line15 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = 10.0d;
        java.lang.Object obj11 = null;
        boolean boolean12 = point3.equals(obj11);
        point3.y = 10.0d;
        java.lang.Double double15 = point3.x;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = 100.0d;
        point3.y = 0.0d;
        point3.x = 0.0d;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.y;
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
        boolean boolean31 = point3.equals((java.lang.Object) point14);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point34.y = (-1.0d);
        point34.y = 1.0d;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        boolean boolean47 = point44.equals((java.lang.Object) 1L);
        java.lang.Double double48 = point44.y;
        boolean boolean49 = point41.equals((java.lang.Object) double48);
        point41.x = 10.0d;
        java.lang.Double double52 = point41.x;
        point41.x = 10.0d;
        Point point57 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double58 = point57.y;
        java.lang.Double double59 = point57.y;
        boolean boolean60 = point41.equals((java.lang.Object) double59);
        java.lang.Double double61 = point41.y;
        java.lang.Double double62 = point41.y;
        java.lang.Double double63 = point41.x;
        boolean boolean64 = point34.equals((java.lang.Object) point41);
        boolean boolean65 = point14.equals((java.lang.Object) point34);
        java.lang.Double double66 = point34.y;
        Point point69 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point69.y = 1.0d;
        java.lang.Double double72 = point69.y;
        java.lang.Double double73 = point69.y;
        point69.y = 0.0d;
        point69.y = 1.0d;
        point69.y = 1.0d;
        java.lang.Double double80 = point69.y;
        Point point83 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double84 = point83.y;
        boolean boolean86 = point83.equals((java.lang.Object) 1L);
        point83.y = (-1.0d);
        java.lang.Double double89 = point83.y;
        java.lang.Double double90 = point83.y;
        java.lang.Double double91 = point83.x;
        point83.x = 10.0d;
        boolean boolean94 = point69.equals((java.lang.Object) point83);
        java.lang.Double double95 = point69.x;
        java.lang.Double double96 = point69.y;
        boolean boolean97 = point34.equals((java.lang.Object) point69);
        Line line98 = new Line(point0, point69);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        point3.x = 0.0d;
        java.lang.Double double12 = point3.y;
        Line line13 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = 10.0d;
        Point point8 = null;
        Line line9 = new Line(point2, point8);
        org.junit.Assert.assertTrue("Contract failed: line9.equals(line9)", line9.equals(line9));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Object obj9 = null;
        boolean boolean10 = point3.equals(obj9);
        point3.x = (-1.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = point3.equals(obj13);
        java.lang.Double double15 = point3.y;
        java.lang.Double double16 = point3.x;
        point3.y = 100.0d;
        point3.y = (-1.0d);
        java.lang.Double double21 = point3.x;
        java.lang.Double double22 = point3.y;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double6 = point2.y;
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = point2.equals(obj7);
        java.lang.Double double9 = point2.y;
        boolean boolean11 = point2.equals((java.lang.Object) (byte) 100);
        java.lang.Double double12 = point2.x;
        java.lang.Double double13 = point2.y;
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
        point19.y = 1.0d;
        java.lang.Double double36 = point19.x;
        java.lang.Class<?> wildcardClass37 = point19.getClass();
        boolean boolean38 = point2.equals((java.lang.Object) point19);
        point2.x = 0.0d;
        Point point41 = null;
        Line line42 = new Line(point2, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        Point point40 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double41 = point40.y;
        point40.y = 1.0d;
        point40.x = 1.0d;
        java.lang.Double double46 = point40.y;
        java.lang.Double double47 = point40.x;
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.x;
        java.lang.Double double52 = point50.x;
        Point point55 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double56 = point55.y;
        boolean boolean57 = point50.equals((java.lang.Object) double56);
        boolean boolean58 = point40.equals((java.lang.Object) point50);
        point40.y = (-1.0d);
        point40.y = (-1.0d);
        boolean boolean63 = point2.equals((java.lang.Object) point40);
        java.lang.Double double64 = point40.y;
        java.lang.Double double65 = point40.y;
        Point point66 = null;
        Line line67 = new Line(point40, point66);
        org.junit.Assert.assertTrue("Contract failed: line67.equals(line67)", line67.equals(line67));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        java.lang.Class<?> wildcardClass9 = point7.getClass();
        boolean boolean10 = point3.equals((java.lang.Object) wildcardClass9);
        point3.x = 0.0d;
        point3.x = (-1.0d);
        point3.x = (-1.0d);
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 100.0d;
        java.lang.Double double13 = point2.x;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        point12.y = 0.0d;
        java.lang.Double double19 = point12.x;
        Point point20 = null;
        Line line21 = new Line(point12, point20);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        java.lang.Double double22 = point2.x;
        point2.y = 1.0d;
        point2.x = 10.0d;
        Point point27 = null;
        Line line28 = new Line(point2, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
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
        point2.x = 1.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        point2.x = (-1.0d);
        Point point55 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point55.y = 1.0d;
        java.lang.Double double58 = point55.y;
        java.lang.Double double59 = point55.y;
        point55.y = 0.0d;
        point55.y = 1.0d;
        point55.y = 1.0d;
        java.lang.Double double66 = point55.y;
        Point point69 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double70 = point69.y;
        boolean boolean72 = point69.equals((java.lang.Object) 1L);
        point69.y = (-1.0d);
        java.lang.Double double75 = point69.y;
        java.lang.Double double76 = point69.y;
        java.lang.Double double77 = point69.x;
        point69.x = 10.0d;
        boolean boolean80 = point55.equals((java.lang.Object) point69);
        boolean boolean81 = point2.equals((java.lang.Object) point55);
        Point point82 = null;
        Line line83 = new Line(point55, point82);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        point3.y = 0.0d;
        point3.y = (-1.0d);
        point3.y = 100.0d;
        java.lang.Double double12 = point3.x;
        java.lang.Double double13 = point3.x;
        point3.x = 1.0d;
        point3.x = (-1.0d);
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double11 = point2.y;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double15 = point14.x;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        java.lang.Double double20 = point18.y;
        java.lang.Double double21 = point18.x;
        boolean boolean22 = point14.equals((java.lang.Object) point18);
        point14.x = (-1.0d);
        java.lang.Double double25 = point14.x;
        boolean boolean26 = point2.equals((java.lang.Object) point14);
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        point29.x = 1.0d;
        java.lang.Object obj35 = null;
        boolean boolean36 = point29.equals(obj35);
        point29.x = 1.0d;
        point29.y = 10.0d;
        point29.y = 10.0d;
        point29.y = (-1.0d);
        java.lang.Double double45 = point29.x;
        boolean boolean46 = point2.equals((java.lang.Object) point29);
        point29.y = 100.0d;
        Point point49 = null;
        Line line50 = new Line(point29, point49);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        java.lang.Double double28 = point2.x;
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
        boolean boolean76 = point31.equals((java.lang.Object) double75);
        java.lang.Double double77 = point31.x;
        java.lang.Double double78 = point31.x;
        boolean boolean79 = point2.equals((java.lang.Object) double78);
        Point point80 = null;
        Line line81 = new Line(point2, point80);
        org.junit.Assert.assertTrue("Contract failed: line81.equals(line81)", line81.equals(line81));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        java.lang.Double double4 = point3.x;
        Point point7 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.y;
        java.lang.Class<?> wildcardClass9 = point7.getClass();
        boolean boolean10 = point3.equals((java.lang.Object) wildcardClass9);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 1.0d;
        java.lang.Double double19 = point13.y;
        java.lang.Double double20 = point13.y;
        point13.x = 1.0d;
        point13.y = (-1.0d);
        java.lang.Class<?> wildcardClass25 = point13.getClass();
        boolean boolean26 = point3.equals((java.lang.Object) point13);
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
        point32.y = 0.0d;
        java.lang.Double double46 = point32.y;
        boolean boolean47 = point13.equals((java.lang.Object) point32);
        java.lang.Double double48 = point32.x;
        java.lang.Double double49 = point32.y;
        Line line50 = new Line(point0, point32);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        java.lang.Double double12 = point3.y;
        point3.y = (-1.0d);
        java.lang.Double double15 = point3.y;
        java.lang.Double double16 = point3.x;
        point3.x = 100.0d;
        java.lang.Double double19 = point3.y;
        Line line20 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 100.0d;
        point3.x = 0.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double30 = point29.y;
        point29.y = 10.0d;
        boolean boolean33 = point26.equals((java.lang.Object) point29);
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        boolean boolean39 = point36.equals((java.lang.Object) 1L);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.x;
        boolean boolean45 = point42.equals((java.lang.Object) 10.0f);
        point42.x = 100.0d;
        boolean boolean48 = point36.equals((java.lang.Object) 100.0d);
        boolean boolean49 = point29.equals((java.lang.Object) boolean48);
        java.lang.Double double50 = point29.x;
        point29.x = 10.0d;
        point29.x = 10.0d;
        boolean boolean55 = point2.equals((java.lang.Object) point29);
        point29.y = (-1.0d);
        Point point58 = null;
        Line line59 = new Line(point29, point58);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        java.lang.Double double58 = point2.y;
        point2.x = 100.0d;
        Point point61 = null;
        Line line62 = new Line(point2, point61);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
        java.lang.Double double8 = point3.x;
        java.lang.Double double9 = point3.x;
        point3.y = 1.0d;
        java.lang.Double double12 = point3.x;
        Line line13 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.x = 10.0d;
        java.lang.Double double11 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double14 = point3.x;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        point3.x = 100.0d;
        point3.x = 1.0d;
        point3.y = 100.0d;
        point3.x = (-1.0d);
        java.lang.Double double27 = point3.x;
        point3.x = 100.0d;
        java.lang.Double double30 = point3.y;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        point3.y = (-1.0d);
        point3.y = 0.0d;
        point3.x = 0.0d;
        Line line12 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point38.y = 1.0d;
        Point point43 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point43.y = 1.0d;
        java.lang.Double double46 = point43.y;
        java.lang.Double double47 = point43.y;
        point43.y = 0.0d;
        point43.x = 10.0d;
        point43.y = 1.0d;
        boolean boolean54 = point38.equals((java.lang.Object) 1.0d);
        java.lang.Double double55 = point38.x;
        java.lang.Class<?> wildcardClass56 = point38.getClass();
        boolean boolean57 = point20.equals((java.lang.Object) wildcardClass56);
        point20.x = 1.0d;
        java.lang.Double double60 = point20.x;
        Point point61 = null;
        Line line62 = new Line(point20, point61);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 0.0d;
        point3.y = 1.0d;
        point3.y = 0.0d;
        java.lang.Double double14 = point3.x;
        point3.x = 0.0d;
        Line line17 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double20 = point19.x;
        java.lang.Double double21 = point19.y;
        java.lang.Double double22 = point19.y;
        point19.x = 100.0d;
        boolean boolean25 = point2.equals((java.lang.Object) point19);
        Point point26 = null;
        Line line27 = new Line(point19, point26);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = (-1.0d);
        java.lang.Double double6 = point3.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.x;
        boolean boolean12 = point9.equals((java.lang.Object) 10.0f);
        point9.x = 100.0d;
        java.lang.Double double15 = point9.x;
        point9.y = 1.0d;
        boolean boolean18 = point3.equals((java.lang.Object) point9);
        point9.x = 1.0d;
        java.lang.Double double21 = point9.x;
        point9.y = 1.0d;
        point9.x = 100.0d;
        java.lang.Double double26 = point9.y;
        Point point29 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        boolean boolean35 = point32.equals((java.lang.Object) 1L);
        java.lang.Double double36 = point32.y;
        boolean boolean37 = point29.equals((java.lang.Object) double36);
        point29.x = 10.0d;
        java.lang.Double double40 = point29.x;
        point29.x = 10.0d;
        java.lang.Double double43 = point29.y;
        java.lang.Double double44 = point29.y;
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.x;
        point47.y = 0.0d;
        java.lang.Double double52 = point47.x;
        point47.x = 1.0d;
        point47.y = 0.0d;
        java.lang.Double double57 = point47.y;
        point47.y = 0.0d;
        java.lang.Double double60 = point47.y;
        java.lang.Double double61 = point47.y;
        boolean boolean62 = point29.equals((java.lang.Object) point47);
        boolean boolean63 = point9.equals((java.lang.Object) boolean62);
        Line line64 = new Line(point0, point9);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        Point point26 = null;
        Line line27 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.x = 1.0d;
        point2.y = (-1.0d);
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        java.lang.Double double10 = point3.y;
        point3.y = (-1.0d);
        Line line13 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 100.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point6.x = 1.0d;
        point6.x = 1.0d;
        boolean boolean11 = point3.equals((java.lang.Object) 1.0d);
        point3.y = (-1.0d);
        point3.y = 1.0d;
        Point point18 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double19 = point18.y;
        point18.y = 100.0d;
        java.lang.Double double22 = point18.y;
        boolean boolean23 = point3.equals((java.lang.Object) double22);
        Line line24 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        point3.x = 100.0d;
        point3.x = 0.0d;
        point3.x = 1.0d;
        java.lang.Double double13 = point3.x;
        point3.x = 0.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point8.y = 1.0d;
        point8.y = (-1.0d);
        java.lang.Double double13 = point8.y;
        java.lang.Double double14 = point8.y;
        point8.y = 1.0d;
        java.lang.Class<?> wildcardClass17 = point8.getClass();
        boolean boolean18 = point3.equals((java.lang.Object) wildcardClass17);
        java.lang.Double double19 = point3.y;
        point3.x = (-1.0d);
        Point point24 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double25 = point24.y;
        java.lang.Double double26 = point24.y;
        boolean boolean27 = point3.equals((java.lang.Object) point24);
        java.lang.Double double28 = point24.x;
        point24.y = 0.0d;
        java.lang.Double double31 = point24.x;
        Line line32 = new Line(point0, point24);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double37 = point36.y;
        point36.y = 1.0d;
        java.lang.Double double40 = point36.y;
        java.lang.Object obj41 = new java.lang.Object();
        boolean boolean42 = point36.equals(obj41);
        point36.x = 1.0d;
        java.lang.Double double45 = point36.y;
        java.lang.Double double46 = point36.x;
        Point point49 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        Point point53 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double54 = point53.x;
        boolean boolean56 = point53.equals((java.lang.Object) 10.0f);
        point53.x = 100.0d;
        java.lang.Double double59 = point53.x;
        point53.y = 1.0d;
        point53.y = 1.0d;
        boolean boolean64 = point49.equals((java.lang.Object) point53);
        java.lang.Class<?> wildcardClass65 = point53.getClass();
        boolean boolean66 = point36.equals((java.lang.Object) point53);
        java.lang.Double double67 = point36.x;
        boolean boolean68 = point2.equals((java.lang.Object) double67);
        java.lang.Double double69 = point2.x;
        point2.y = (-1.0d);
        Point point72 = null;
        Line line73 = new Line(point2, point72);
        org.junit.Assert.assertTrue("Contract failed: line73.equals(line73)", line73.equals(line73));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        boolean boolean10 = point3.equals((java.lang.Object) 'a');
        point3.x = 10.0d;
        point3.x = 0.0d;
        point3.y = 10.0d;
        java.lang.Double double17 = point3.y;
        java.lang.Double double18 = point3.y;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        java.lang.Double double25 = point21.y;
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = point21.equals(obj26);
        point21.x = 1.0d;
        java.lang.Double double30 = point21.x;
        point21.y = 0.0d;
        point21.x = 1.0d;
        java.lang.Double double35 = point21.x;
        Point point38 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point41 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double42 = point41.y;
        boolean boolean44 = point41.equals((java.lang.Object) 1L);
        java.lang.Double double45 = point41.y;
        boolean boolean46 = point38.equals((java.lang.Object) double45);
        point38.x = 10.0d;
        java.lang.Double double49 = point38.x;
        point38.x = 10.0d;
        java.lang.Class<?> wildcardClass52 = point38.getClass();
        boolean boolean53 = point21.equals((java.lang.Object) wildcardClass52);
        java.lang.Double double54 = point21.x;
        boolean boolean55 = point3.equals((java.lang.Object) point21);
        Line line56 = new Line(point0, point21);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        point3.x = 0.0d;
        point3.x = 1.0d;
        point3.x = 10.0d;
        Point point14 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point14.y = 0.0d;
        java.lang.Double double17 = point14.y;
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.x;
        boolean boolean22 = point14.equals((java.lang.Object) double21);
        boolean boolean23 = point3.equals((java.lang.Object) double21);
        Point point26 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double27 = point26.x;
        java.lang.Double double28 = point26.y;
        point26.y = (-1.0d);
        java.lang.Double double31 = point26.y;
        java.lang.Double double32 = point26.x;
        java.lang.Double double33 = point26.y;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        java.lang.Double double41 = point36.x;
        java.lang.Double double42 = point36.x;
        boolean boolean43 = point26.equals((java.lang.Object) point36);
        point36.x = 0.0d;
        Point point48 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point48.y = (-1.0d);
        java.lang.Object obj51 = null;
        boolean boolean52 = point48.equals(obj51);
        boolean boolean53 = point36.equals((java.lang.Object) point48);
        point36.y = 10.0d;
        boolean boolean56 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Double double57 = point3.x;
        Line line58 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        java.lang.Double double43 = point5.x;
        java.lang.Double double44 = point5.y;
        point5.x = 1.0d;
        Point point47 = null;
        Line line48 = new Line(point5, point47);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = (-1.0d);
        java.lang.Double double9 = point3.y;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.x;
        boolean boolean21 = point18.equals((java.lang.Object) 10.0f);
        point18.x = 100.0d;
        boolean boolean24 = point12.equals((java.lang.Object) 100.0d);
        boolean boolean25 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double26 = point3.x;
        java.lang.Double double27 = point3.y;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double31 = point30.x;
        point30.x = 1.0d;
        boolean boolean34 = point3.equals((java.lang.Object) 1.0d);
        Point point37 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double38 = point37.y;
        point37.y = 1.0d;
        java.lang.Double double41 = point37.y;
        java.lang.Object obj42 = new java.lang.Object();
        boolean boolean43 = point37.equals(obj42);
        java.lang.Double double44 = point37.x;
        java.lang.Double double45 = point37.y;
        point37.y = 100.0d;
        java.lang.Double double48 = point37.x;
        boolean boolean49 = point3.equals((java.lang.Object) point37);
        java.lang.Double double50 = point37.y;
        java.lang.Double double51 = point37.x;
        Line line52 = new Line(point0, point37);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double8 = point3.x;
        point3.x = (-1.0d);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.x = 10.0d;
        java.lang.Double double21 = point13.y;
        boolean boolean22 = point3.equals((java.lang.Object) double21);
        point3.y = (-1.0d);
        java.lang.Double double25 = point3.x;
        point3.y = 1.0d;
        point3.x = (-1.0d);
        java.lang.Double double30 = point3.x;
        Line line31 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        point18.y = 0.0d;
        java.lang.Double double21 = point18.y;
        java.lang.Double double22 = point18.x;
        boolean boolean23 = point2.equals((java.lang.Object) point18);
        point18.y = 10.0d;
        Point point28 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point28.y = 1.0d;
        java.lang.Double double31 = point28.y;
        java.lang.Double double32 = point28.y;
        point28.y = 0.0d;
        java.lang.Double double35 = point28.y;
        java.lang.Class<?> wildcardClass36 = point28.getClass();
        boolean boolean37 = point18.equals((java.lang.Object) wildcardClass36);
        java.lang.Double double38 = point18.y;
        java.lang.Object obj39 = null;
        boolean boolean40 = point18.equals(obj39);
        Point point41 = null;
        Line line42 = new Line(point18, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.y = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        point2.x = 0.0d;
        point2.x = 10.0d;
        point2.x = (-1.0d);
        Point point19 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point19.y = 10.0d;
        java.lang.Double double22 = point19.x;
        Point point25 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double26 = point25.y;
        boolean boolean28 = point25.equals((java.lang.Object) 1L);
        java.lang.Double double29 = point25.y;
        point25.y = 100.0d;
        point25.x = 10.0d;
        java.lang.Double double34 = point25.x;
        boolean boolean35 = point19.equals((java.lang.Object) point25);
        java.lang.Double double36 = point19.x;
        boolean boolean37 = point2.equals((java.lang.Object) double36);
        Point point38 = null;
        Line line39 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
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
        point32.y = (-1.0d);
        java.lang.Double double54 = point32.x;
        java.lang.Double double55 = point32.x;
        java.lang.Double double56 = point32.y;
        Point point59 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double60 = point59.x;
        java.lang.Double double61 = point59.y;
        point59.y = (-1.0d);
        java.lang.Class<?> wildcardClass64 = point59.getClass();
        boolean boolean65 = point32.equals((java.lang.Object) wildcardClass64);
        boolean boolean66 = point2.equals((java.lang.Object) point32);
        point32.x = (-1.0d);
        point32.x = (-1.0d);
        java.lang.Double double71 = point32.x;
        java.lang.Double double72 = point32.y;
        point32.x = 0.0d;
        java.lang.Double double75 = point32.y;
        java.lang.Double double76 = point32.y;
        Point point77 = null;
        Line line78 = new Line(point32, point77);
        org.junit.Assert.assertTrue("Contract failed: line78.equals(line78)", line78.equals(line78));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        java.lang.Double double22 = point11.x;
        Point point25 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double26 = point25.x;
        java.lang.Double double27 = point25.x;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean32 = point25.equals((java.lang.Object) double31);
        point25.x = (-1.0d);
        java.lang.Double double35 = point25.x;
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
        boolean boolean61 = point25.equals((java.lang.Object) (-1.0d));
        point25.x = (-1.0d);
        point25.y = 10.0d;
        Point point68 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double69 = point68.y;
        java.lang.Double double70 = point68.y;
        java.lang.Double double71 = point68.x;
        point68.y = 1.0d;
        point68.x = 1.0d;
        point68.y = (-1.0d);
        java.lang.Class<?> wildcardClass78 = point68.getClass();
        boolean boolean79 = point25.equals((java.lang.Object) point68);
        java.lang.Class<?> wildcardClass80 = point68.getClass();
        boolean boolean81 = point11.equals((java.lang.Object) point68);
        Point point82 = null;
        Line line83 = new Line(point68, point82);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        java.lang.Double double13 = point9.y;
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = point9.equals(obj14);
        point9.x = 1.0d;
        java.lang.Double double18 = point9.x;
        boolean boolean19 = point3.equals((java.lang.Object) double18);
        java.lang.Double double20 = point3.x;
        point3.x = 10.0d;
        java.lang.Double double23 = point3.x;
        java.lang.Double double24 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        Line line29 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        point2.y = 1.0d;
        java.lang.Double double8 = point2.y;
        Point point11 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point11.y = 1.0d;
        java.lang.Double double14 = point11.y;
        java.lang.Double double15 = point11.y;
        java.lang.Double double16 = point11.y;
        java.lang.Object obj17 = null;
        boolean boolean18 = point11.equals(obj17);
        point11.x = 10.0d;
        point11.y = 0.0d;
        boolean boolean23 = point2.equals((java.lang.Object) 0.0d);
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.x;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double8 = point7.x;
        boolean boolean10 = point7.equals((java.lang.Object) 10.0f);
        point7.x = 100.0d;
        java.lang.Double double13 = point7.x;
        Point point16 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point16.x = 100.0d;
        boolean boolean19 = point7.equals((java.lang.Object) 100.0d);
        java.lang.Double double20 = point7.y;
        Point point23 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double24 = point23.y;
        point23.y = 1.0d;
        point23.x = 100.0d;
        java.lang.Double double29 = point23.x;
        boolean boolean30 = point7.equals((java.lang.Object) point23);
        boolean boolean31 = point3.equals((java.lang.Object) boolean30);
        java.lang.Double double32 = point3.x;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Object obj41 = null;
        boolean boolean42 = point35.equals(obj41);
        java.lang.Double double43 = point35.x;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        boolean boolean49 = point46.equals((java.lang.Object) 1L);
        java.lang.Double double50 = point46.y;
        point46.y = 100.0d;
        point46.y = (-1.0d);
        boolean boolean55 = point35.equals((java.lang.Object) point46);
        point46.x = (-1.0d);
        boolean boolean58 = point3.equals((java.lang.Object) (-1.0d));
        Line line59 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        java.lang.Double double10 = point3.y;
        point3.y = 100.0d;
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 10.0d);
        point15.y = 100.0d;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass21 = point20.getClass();
        boolean boolean22 = point15.equals((java.lang.Object) point20);
        boolean boolean23 = point3.equals((java.lang.Object) point20);
        point3.y = 100.0d;
        point3.x = 0.0d;
        java.lang.Double double28 = point3.x;
        java.lang.Double double29 = point3.y;
        Line line30 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.x = 10.0d;
        java.lang.Double double11 = point3.y;
        point3.y = 0.0d;
        java.lang.Double double14 = point3.x;
        java.lang.Double double15 = point3.x;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point21 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double22 = point21.y;
        point21.y = 10.0d;
        boolean boolean25 = point18.equals((java.lang.Object) point21);
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass29 = point28.getClass();
        boolean boolean30 = point21.equals((java.lang.Object) wildcardClass29);
        point21.y = 0.0d;
        boolean boolean33 = point3.equals((java.lang.Object) point21);
        java.lang.Double double34 = point3.x;
        java.lang.Double double35 = point3.y;
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.x;
        boolean boolean41 = point38.equals((java.lang.Object) 10.0f);
        point38.x = 100.0d;
        java.lang.Double double44 = point38.x;
        Point point47 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.x;
        java.lang.Double double49 = point47.y;
        point47.y = (-1.0d);
        java.lang.Double double52 = point47.y;
        java.lang.Double double53 = point47.x;
        boolean boolean54 = point38.equals((java.lang.Object) double53);
        Point point57 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double58 = point57.x;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        java.lang.Double double65 = point61.y;
        java.lang.Object obj66 = new java.lang.Object();
        boolean boolean67 = point61.equals(obj66);
        java.lang.Double double68 = point61.y;
        java.lang.Class<?> wildcardClass69 = point61.getClass();
        boolean boolean70 = point57.equals((java.lang.Object) point61);
        java.lang.Double double71 = point57.y;
        java.lang.Class<?> wildcardClass72 = point57.getClass();
        boolean boolean73 = point38.equals((java.lang.Object) wildcardClass72);
        point38.x = 100.0d;
        boolean boolean76 = point3.equals((java.lang.Object) 100.0d);
        Line line77 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line77.equals(line77)", line77.equals(line77));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Double double11 = point3.x;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.x;
        boolean boolean17 = point14.equals((java.lang.Object) 10.0f);
        point14.x = 100.0d;
        java.lang.Double double20 = point14.x;
        point14.y = 1.0d;
        boolean boolean23 = point3.equals((java.lang.Object) 1.0d);
        Line line24 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        Point point26 = null;
        Line line27 = new Line(point12, point26);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        point3.y = 100.0d;
        point3.x = (-1.0d);
        point3.x = (-1.0d);
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.x;
        boolean boolean19 = point16.equals((java.lang.Object) 10.0f);
        point16.x = 100.0d;
        java.lang.Double double22 = point16.x;
        Point point25 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point25.x = 100.0d;
        boolean boolean28 = point16.equals((java.lang.Object) 100.0d);
        java.lang.Double double29 = point16.y;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 100.0d;
        java.lang.Double double38 = point32.x;
        boolean boolean39 = point16.equals((java.lang.Object) point32);
        boolean boolean40 = point3.equals((java.lang.Object) point32);
        java.lang.Double double41 = point3.y;
        java.lang.Double double42 = point3.y;
        java.lang.Double double43 = point3.y;
        java.lang.Double double44 = point3.x;
        point3.y = 1.0d;
        point3.y = 0.0d;
        Line line49 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
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
        java.lang.Double double17 = point2.y;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        java.lang.Double double25 = point20.x;
        java.lang.Double double26 = point20.x;
        point20.y = 1.0d;
        point20.x = 10.0d;
        java.lang.Double double31 = point20.y;
        boolean boolean32 = point2.equals((java.lang.Object) point20);
        point20.y = 0.0d;
        Point point35 = null;
        Line line36 = new Line(point20, point35);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        java.lang.Double double29 = point13.x;
        Point point30 = null;
        Line line31 = new Line(point13, point30);
        org.junit.Assert.assertTrue("Contract failed: line31.equals(line31)", line31.equals(line31));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.y;
        java.lang.Double double6 = point3.x;
        point3.y = 1.0d;
        point3.x = 0.0d;
        java.lang.Double double11 = point3.y;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point14.y = 1.0d;
        boolean boolean17 = point3.equals((java.lang.Object) point14);
        point14.y = 10.0d;
        Line line20 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        java.lang.Double double21 = point2.x;
        point2.x = (-1.0d);
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = (-1.0d);
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        point10.y = 10.0d;
        boolean boolean14 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Double double15 = point3.y;
        Point point18 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point18.y = 1.0d;
        point18.y = (-1.0d);
        java.lang.Double double23 = point18.y;
        java.lang.Double double24 = point18.y;
        point18.y = 1.0d;
        point18.y = 100.0d;
        point18.y = 0.0d;
        java.lang.Double double31 = point18.y;
        java.lang.Double double32 = point18.y;
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point35.y = 10.0d;
        java.lang.Double double38 = point35.x;
        java.lang.Double double39 = point35.x;
        java.lang.Double double40 = point35.x;
        java.lang.Class<?> wildcardClass41 = point35.getClass();
        boolean boolean42 = point18.equals((java.lang.Object) wildcardClass41);
        java.lang.Double double43 = point18.y;
        point18.x = 100.0d;
        boolean boolean46 = point3.equals((java.lang.Object) 100.0d);
        java.lang.Double double47 = point3.x;
        point3.x = 100.0d;
        Line line50 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.x;
        point3.x = 100.0d;
        point3.x = 1.0d;
        Point point15 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point15.y = 0.0d;
        java.lang.Double double18 = point15.y;
        java.lang.Double double19 = point15.y;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point22.x = 1.0d;
        point22.y = 1.0d;
        java.lang.Double double27 = point22.x;
        point22.x = (-1.0d);
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        point32.x = 100.0d;
        point32.x = 10.0d;
        java.lang.Double double40 = point32.y;
        boolean boolean41 = point22.equals((java.lang.Object) double40);
        point22.y = (-1.0d);
        java.lang.Double double44 = point22.x;
        point22.y = 1.0d;
        java.lang.Double double47 = point22.y;
        Point point50 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double51 = point50.x;
        java.lang.Double double52 = point50.y;
        java.lang.Double double53 = point50.y;
        point50.y = 0.0d;
        point50.x = 1.0d;
        boolean boolean58 = point22.equals((java.lang.Object) point50);
        boolean boolean59 = point15.equals((java.lang.Object) boolean58);
        java.lang.Double double60 = point15.y;
        boolean boolean61 = point3.equals((java.lang.Object) double60);
        Line line62 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        point2.x = 100.0d;
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
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
        Point point17 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double18 = point17.y;
        point17.y = 10.0d;
        point17.y = (-1.0d);
        java.lang.Object obj23 = null;
        boolean boolean24 = point17.equals(obj23);
        boolean boolean26 = point17.equals((java.lang.Object) 10.0d);
        java.lang.Object obj27 = null;
        boolean boolean28 = point17.equals(obj27);
        point17.y = 0.0d;
        boolean boolean31 = point2.equals((java.lang.Object) point17);
        point2.x = (-1.0d);
        Point point34 = null;
        Line line35 = new Line(point2, point34);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.y = 10.0d;
        java.lang.Double double10 = point3.y;
        point3.x = 0.0d;
        java.lang.Double double13 = point3.x;
        java.lang.Double double14 = point3.x;
        Line line15 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        point3.y = 10.0d;
        point3.y = 10.0d;
        java.lang.Double double9 = point3.x;
        point3.y = 10.0d;
        Point point14 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point14.y = 1.0d;
        point14.y = (-1.0d);
        java.lang.Double double19 = point14.x;
        point14.y = 1.0d;
        point14.y = 0.0d;
        boolean boolean24 = point3.equals((java.lang.Object) point14);
        java.lang.Double double25 = point3.x;
        java.lang.Double double26 = point3.y;
        point3.x = 100.0d;
        Line line29 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }
}

