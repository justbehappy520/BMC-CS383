import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        point21.x = 0.0d;
        point21.y = 1.0d;
        point21.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double35 = point34.y;
        point34.y = 1.0d;
        point34.x = 100.0d;
        point34.y = (-1.0d);
        Point point44 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point44.y = 1.0d;
        point44.y = (-1.0d);
        java.lang.Double double49 = point44.x;
        java.lang.Double double50 = point44.x;
        point44.y = 1.0d;
        boolean boolean53 = point34.equals((java.lang.Object) point44);
        point44.y = (-1.0d);
        point44.x = (-1.0d);
        java.lang.Double double58 = point44.x;
        java.lang.Double double59 = point44.x;
        java.lang.Double double60 = point44.x;
        boolean boolean61 = point21.equals((java.lang.Object) point44);
        java.lang.Double double62 = point21.y;
        java.lang.Double double63 = point21.y;
        boolean boolean64 = point2.equals((java.lang.Object) double63);
        point2.y = 100.0d;
        Point point67 = null;
        Line line68 = new Line(point2, point67);
        org.junit.Assert.assertTrue("Contract failed: line68.equals(line68)", line68.equals(line68));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        java.lang.Double double21 = point5.y;
        java.lang.Double double22 = point5.x;
        Point point23 = null;
        Line line24 = new Line(point5, point23);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.x;
        point3.x = 0.0d;
        point3.x = 100.0d;
        point3.x = 100.0d;
        java.lang.Double double13 = point3.x;
        point3.x = 0.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = 1.0d;
        point2.y = 1.0d;
        point2.y = 100.0d;
        point2.y = 0.0d;
        java.lang.Double double13 = point2.x;
        point2.x = 1.0d;
        Point point16 = null;
        Line line17 = new Line(point2, point16);
        org.junit.Assert.assertTrue("Contract failed: line17.equals(line17)", line17.equals(line17));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        point2.x = 100.0d;
        point2.x = 0.0d;
        point2.x = 100.0d;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
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
        point2.y = 1.0d;
        Point point25 = null;
        Line line26 = new Line(point2, point25);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        point2.y = 10.0d;
        point2.y = 10.0d;
        Point point45 = null;
        Line line46 = new Line(point2, point45);
        org.junit.Assert.assertTrue("Contract failed: line46.equals(line46)", line46.equals(line46));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.x;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        java.lang.Double double9 = point2.y;
        point2.x = (-1.0d);
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = 100.0d;
        point2.x = 100.0d;
        java.lang.Double double11 = point2.y;
        point2.y = 10.0d;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point2.x = 1.0d;
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.y = 10.0d;
        point2.y = 1.0d;
        Point point15 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double16 = point15.y;
        java.lang.Double double17 = point15.x;
        point15.y = 0.0d;
        java.lang.Double double20 = point15.x;
        java.lang.Double double21 = point15.y;
        java.lang.Double double22 = point15.x;
        boolean boolean23 = point2.equals((java.lang.Object) double22);
        java.lang.Double double24 = point2.y;
        point2.x = 100.0d;
        java.lang.Double double27 = point2.y;
        Point point28 = null;
        Line line29 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
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
        java.lang.Double double57 = point10.x;
        point10.y = 0.0d;
        boolean boolean60 = point3.equals((java.lang.Object) 0.0d);
        java.lang.Double double61 = point3.y;
        java.lang.Double double62 = point3.x;
        Point point65 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point65.y = (-1.0d);
        point65.y = 1.0d;
        Point point72 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point75 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double76 = point75.y;
        boolean boolean78 = point75.equals((java.lang.Object) 1L);
        java.lang.Double double79 = point75.y;
        boolean boolean80 = point72.equals((java.lang.Object) double79);
        point72.x = 10.0d;
        java.lang.Double double83 = point72.x;
        point72.x = 10.0d;
        Point point88 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double89 = point88.y;
        java.lang.Double double90 = point88.y;
        boolean boolean91 = point72.equals((java.lang.Object) double90);
        java.lang.Double double92 = point72.y;
        java.lang.Double double93 = point72.y;
        java.lang.Double double94 = point72.x;
        boolean boolean95 = point65.equals((java.lang.Object) point72);
        boolean boolean96 = point3.equals((java.lang.Object) point65);
        java.lang.Double double97 = point3.y;
        Line line98 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line98.equals(line98)", line98.equals(line98));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        point2.y = 0.0d;
        java.lang.Double double19 = point2.x;
        java.lang.Double double20 = point2.y;
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
        point2.x = 10.0d;
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
        java.lang.Double double58 = point47.y;
        point47.y = (-1.0d);
        point47.x = 0.0d;
        boolean boolean63 = point2.equals((java.lang.Object) point47);
        Point point64 = null;
        Line line65 = new Line(point47, point64);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        point15.x = 100.0d;
        point15.y = 100.0d;
        Point point58 = null;
        Line line59 = new Line(point15, point58);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        point2.x = 100.0d;
        java.lang.Object obj48 = null;
        boolean boolean49 = point2.equals(obj48);
        java.lang.Double double50 = point2.y;
        Point point53 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point53.y = 1.0d;
        point53.y = (-1.0d);
        java.lang.Double double58 = point53.y;
        java.lang.Double double59 = point53.y;
        point53.y = 1.0d;
        point53.y = 1.0d;
        point53.y = 100.0d;
        point53.y = (-1.0d);
        boolean boolean68 = point2.equals((java.lang.Object) point53);
        Point point69 = null;
        Line line70 = new Line(point53, point69);
        org.junit.Assert.assertTrue("Contract failed: line70.equals(line70)", line70.equals(line70));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        java.lang.Object obj41 = null;
        boolean boolean42 = point2.equals(obj41);
        java.lang.Double double43 = point2.y;
        point2.y = 1.0d;
        Point point46 = null;
        Line line47 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point5 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double6 = point5.y;
        point5.y = 10.0d;
        boolean boolean9 = point2.equals((java.lang.Object) point5);
        java.lang.Double double10 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double13 = point2.y;
        Point point16 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double17 = point16.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        boolean boolean25 = point16.equals((java.lang.Object) point20);
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point28.x = 100.0d;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        point33.y = 1.0d;
        point33.x = 1.0d;
        java.lang.Double double39 = point33.y;
        java.lang.Double double40 = point33.y;
        point33.x = 10.0d;
        boolean boolean43 = point28.equals((java.lang.Object) point33);
        Point point46 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double47 = point46.y;
        point46.y = 10.0d;
        point46.y = 10.0d;
        boolean boolean52 = point33.equals((java.lang.Object) point46);
        java.lang.Double double53 = point33.x;
        Point point56 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double57 = point56.x;
        java.lang.Double double58 = point56.y;
        java.lang.Double double59 = point56.y;
        point56.y = (-1.0d);
        boolean boolean62 = point33.equals((java.lang.Object) (-1.0d));
        Point point65 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point65.y = 1.0d;
        java.lang.Double double68 = point65.y;
        java.lang.Double double69 = point65.y;
        point65.y = 0.0d;
        point65.y = 1.0d;
        point65.y = 1.0d;
        boolean boolean76 = point33.equals((java.lang.Object) point65);
        point65.x = 10.0d;
        boolean boolean79 = point16.equals((java.lang.Object) point65);
        java.lang.Double double80 = point16.y;
        boolean boolean81 = point2.equals((java.lang.Object) point16);
        Point point82 = null;
        Line line83 = new Line(point2, point82);
        org.junit.Assert.assertTrue("Contract failed: line83.equals(line83)", line83.equals(line83));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
        point24.y = 0.0d;
        java.lang.Double double46 = point24.y;
        boolean boolean47 = point3.equals((java.lang.Object) double46);
        java.lang.Double double48 = point3.x;
        java.lang.Double double49 = point3.y;
        point3.y = 100.0d;
        Line line52 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line52.equals(line52)", line52.equals(line52));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        point3.x = 100.0d;
        point3.y = 1.0d;
        java.lang.Double double31 = point3.y;
        java.lang.Double double32 = point3.y;
        java.lang.Double double33 = point3.y;
        java.lang.Double double34 = point3.y;
        Line line35 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        java.lang.Double double24 = point2.y;
        point2.y = 10.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        point29.x = 100.0d;
        point29.y = (-1.0d);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point39.y = 1.0d;
        point39.y = (-1.0d);
        java.lang.Double double44 = point39.x;
        java.lang.Double double45 = point39.x;
        point39.y = 1.0d;
        boolean boolean48 = point29.equals((java.lang.Object) point39);
        Point point51 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point51.x = 0.0d;
        point51.y = (-1.0d);
        point51.x = 0.0d;
        boolean boolean58 = point29.equals((java.lang.Object) point51);
        point51.y = 100.0d;
        boolean boolean61 = point2.equals((java.lang.Object) point51);
        java.lang.Double double62 = point51.y;
        Point point63 = null;
        Line line64 = new Line(point51, point63);
        org.junit.Assert.assertTrue("Contract failed: line64.equals(line64)", line64.equals(line64));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        point5.x = 0.0d;
        java.lang.Double double37 = point5.y;
        Point point38 = null;
        Line line39 = new Line(point5, point38);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        point3.x = (-1.0d);
        point3.y = (-1.0d);
        Line line28 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        point3.x = 0.0d;
        point3.x = 10.0d;
        point3.y = 1.0d;
        java.lang.Double double25 = point3.x;
        Point point28 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean30 = point28.equals((java.lang.Object) (byte) 100);
        java.lang.Double double31 = point28.x;
        point28.x = (-1.0d);
        java.lang.Double double34 = point28.y;
        point28.x = (-1.0d);
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point39.y = 100.0d;
        point39.x = 0.0d;
        boolean boolean44 = point28.equals((java.lang.Object) 0.0d);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double51 = point50.y;
        boolean boolean53 = point50.equals((java.lang.Object) 1L);
        java.lang.Double double54 = point50.y;
        boolean boolean55 = point47.equals((java.lang.Object) double54);
        java.lang.Double double56 = point47.y;
        point47.x = 1.0d;
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point61.x = 0.0d;
        point61.y = (-1.0d);
        point61.y = 100.0d;
        point61.x = 0.0d;
        java.lang.Double double70 = point61.y;
        boolean boolean71 = point47.equals((java.lang.Object) double70);
        Point point74 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double75 = point74.x;
        java.lang.Double double76 = point74.x;
        Point point79 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point79.y = 1.0d;
        point79.y = (-1.0d);
        java.lang.Double double84 = point79.y;
        java.lang.Double double85 = point79.y;
        point79.y = 1.0d;
        java.lang.Class<?> wildcardClass88 = point79.getClass();
        boolean boolean89 = point74.equals((java.lang.Object) wildcardClass88);
        java.lang.Double double90 = point74.y;
        boolean boolean91 = point47.equals((java.lang.Object) double90);
        boolean boolean92 = point28.equals((java.lang.Object) point47);
        point47.x = 10.0d;
        java.lang.Double double95 = point47.x;
        boolean boolean96 = point3.equals((java.lang.Object) point47);
        Line line97 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line97.equals(line97)", line97.equals(line97));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        Point point7 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double8 = point7.x;
        java.lang.Double double9 = point7.y;
        java.lang.Double double10 = point7.y;
        java.lang.Double double11 = point7.y;
        boolean boolean12 = point2.equals((java.lang.Object) point7);
        java.lang.Double double13 = point2.y;
        java.lang.Double double14 = point2.y;
        point2.y = 1.0d;
        point2.x = 1.0d;
        point2.x = 1.0d;
        Point point21 = null;
        Line line22 = new Line(point2, point21);
        org.junit.Assert.assertTrue("Contract failed: line22.equals(line22)", line22.equals(line22));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        Point point37 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        Point point40 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point40.y = 1.0d;
        point40.y = (-1.0d);
        point40.y = 100.0d;
        boolean boolean47 = point37.equals((java.lang.Object) 100.0d);
        boolean boolean48 = point2.equals((java.lang.Object) boolean47);
        point2.y = 0.0d;
        java.lang.Double double51 = point2.y;
        point2.y = 1.0d;
        Point point54 = null;
        Line line55 = new Line(point2, point54);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        point3.x = 100.0d;
        point3.x = 100.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        point13.y = 10.0d;
        boolean boolean22 = point13.equals((java.lang.Object) 0L);
        java.lang.Double double23 = point13.y;
        boolean boolean24 = point3.equals((java.lang.Object) double23);
        java.lang.Double double25 = point3.y;
        point3.y = (-1.0d);
        Line line28 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        java.lang.Double double30 = point2.y;
        Point point31 = null;
        Line line32 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point5 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        java.lang.Double double7 = point5.y;
        boolean boolean8 = point2.equals((java.lang.Object) point5);
        point2.x = 1.0d;
        java.lang.Double double11 = point2.x;
        java.lang.Double double12 = point2.y;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 1.0d;
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.y;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean15 = point3.equals((java.lang.Object) point13);
        point13.y = (-1.0d);
        point13.y = 1.0d;
        Line line20 = new Line(point0, point13);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        java.lang.Double double35 = point2.y;
        point2.x = 1.0d;
        Point point38 = null;
        Line line39 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        java.lang.Double double9 = point3.y;
        point3.y = 100.0d;
        point3.x = (-1.0d);
        java.lang.Double double14 = point3.x;
        point3.y = 1.0d;
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        java.lang.Double double22 = point19.y;
        java.lang.Double double23 = point19.y;
        java.lang.Double double24 = point19.x;
        boolean boolean25 = point3.equals((java.lang.Object) double24);
        point3.x = 0.0d;
        Line line28 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        java.lang.Double double27 = point3.x;
        point3.y = 100.0d;
        point3.y = 1.0d;
        java.lang.Double double32 = point3.x;
        java.lang.Double double33 = point3.x;
        point3.x = 100.0d;
        Point point38 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point38.y = 1.0d;
        point38.y = (-1.0d);
        java.lang.Double double43 = point38.y;
        java.lang.Double double44 = point38.x;
        java.lang.Double double45 = point38.y;
        boolean boolean46 = point3.equals((java.lang.Object) point38);
        java.lang.Double double47 = point3.x;
        Line line48 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        java.lang.Double double6 = point3.x;
        Point point9 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point9.y = 0.0d;
        java.lang.Double double12 = point9.y;
        point9.x = 100.0d;
        point9.x = 100.0d;
        java.lang.Double double17 = point9.y;
        boolean boolean18 = point3.equals((java.lang.Object) point9);
        java.lang.Double double19 = point9.x;
        java.lang.Double double20 = point9.y;
        Line line21 = new Line(point0, point9);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
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
        Point point35 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point35.x = 0.0d;
        point35.y = (-1.0d);
        point35.y = 100.0d;
        java.lang.Double double42 = point35.x;
        boolean boolean43 = point23.equals((java.lang.Object) point35);
        boolean boolean45 = point23.equals((java.lang.Object) (-1));
        java.lang.Double double46 = point23.x;
        java.lang.Double double47 = point23.x;
        Point point50 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point50.y = (-1.0d);
        java.lang.Double double53 = point50.y;
        java.lang.Class<?> wildcardClass54 = point50.getClass();
        boolean boolean55 = point23.equals((java.lang.Object) point50);
        Line line56 = new Line(point0, point50);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        point3.x = 1.0d;
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.x;
        Point point12 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        boolean boolean15 = point12.equals((java.lang.Object) 1L);
        point12.y = (-1.0d);
        java.lang.Double double18 = point12.y;
        java.lang.Double double19 = point12.y;
        java.lang.Double double20 = point12.x;
        point12.x = 10.0d;
        point12.x = 0.0d;
        Point point27 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double28 = point27.y;
        point27.y = 1.0d;
        point27.x = 1.0d;
        java.lang.Object obj33 = null;
        boolean boolean34 = point27.equals(obj33);
        point27.x = 1.0d;
        boolean boolean38 = point27.equals((java.lang.Object) false);
        java.lang.Double double39 = point27.x;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        point42.y = (-1.0d);
        java.lang.Double double48 = point42.y;
        java.lang.Double double49 = point42.y;
        java.lang.Double double50 = point42.y;
        boolean boolean51 = point27.equals((java.lang.Object) point42);
        boolean boolean52 = point12.equals((java.lang.Object) boolean51);
        java.lang.Double double53 = point12.x;
        boolean boolean54 = point3.equals((java.lang.Object) double53);
        Line line55 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line55.equals(line55)", line55.equals(line55));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        Point point33 = null;
        Line line34 = new Line(point29, point33);
        org.junit.Assert.assertTrue("Contract failed: line34.equals(line34)", line34.equals(line34));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        point2.x = (-1.0d);
        Point point26 = null;
        Line line27 = new Line(point2, point26);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = (-1.0d);
        java.lang.Double double11 = point3.x;
        point3.y = (-1.0d);
        java.lang.Double double14 = point3.y;
        Line line15 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        java.lang.Double double34 = point17.y;
        Line line35 = new Line(point0, point17);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.x;
        java.lang.Double double9 = point2.x;
        Point point10 = null;
        Line line11 = new Line(point2, point10);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point2.y = 1.0d;
        Point point5 = null;
        Line line6 = new Line(point2, point5);
        org.junit.Assert.assertTrue("Contract failed: line6.equals(line6)", line6.equals(line6));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.x;
        point2.x = 10.0d;
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
        java.lang.Double double43 = point21.x;
        point21.y = 1.0d;
        java.lang.Double double46 = point21.y;
        boolean boolean47 = point2.equals((java.lang.Object) double46);
        java.lang.Double double48 = point2.x;
        Point point49 = null;
        Line line50 = new Line(point2, point49);
        org.junit.Assert.assertTrue("Contract failed: line50.equals(line50)", line50.equals(line50));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
        Point point22 = null;
        Line line23 = new Line(point2, point22);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        point6.y = 10.0d;
        boolean boolean10 = point3.equals((java.lang.Object) point6);
        Point point13 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass14 = point13.getClass();
        boolean boolean15 = point6.equals((java.lang.Object) wildcardClass14);
        java.lang.Double double16 = point6.y;
        point6.x = (-1.0d);
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        java.lang.Double double27 = point21.y;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point30.y = 0.0d;
        java.lang.Double double33 = point30.y;
        java.lang.Double double34 = point30.x;
        boolean boolean35 = point21.equals((java.lang.Object) double34);
        point21.y = 1.0d;
        java.lang.Double double38 = point21.x;
        Point point41 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point41.y = 0.0d;
        java.lang.Double double44 = point41.y;
        java.lang.Double double45 = point41.x;
        point41.x = 1.0d;
        Point point50 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Object obj51 = null;
        boolean boolean52 = point50.equals(obj51);
        java.lang.Class<?> wildcardClass53 = point50.getClass();
        boolean boolean54 = point41.equals((java.lang.Object) wildcardClass53);
        java.lang.Double double55 = point41.x;
        boolean boolean56 = point21.equals((java.lang.Object) point41);
        java.lang.Double double57 = point41.x;
        java.lang.Double double58 = point41.x;
        point41.x = 0.0d;
        point41.y = 100.0d;
        boolean boolean63 = point6.equals((java.lang.Object) 100.0d);
        point6.x = 0.0d;
        Line line66 = new Line(point0, point6);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        Point point8 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean10 = point8.equals((java.lang.Object) true);
        boolean boolean11 = point3.equals((java.lang.Object) true);
        java.lang.Double double12 = point3.y;
        java.lang.Double double13 = point3.y;
        point3.y = 100.0d;
        point3.y = 100.0d;
        java.lang.Double double18 = point3.x;
        java.lang.Double double19 = point3.x;
        java.lang.Double double20 = point3.y;
        point3.x = 0.0d;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double4 = point3.y;
        point3.x = 100.0d;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 1.0d;
        boolean boolean16 = point9.equals((java.lang.Object) 'a');
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.y;
        point19.y = 1.0d;
        point19.y = 0.0d;
        java.lang.Double double25 = point19.y;
        boolean boolean26 = point9.equals((java.lang.Object) double25);
        boolean boolean27 = point3.equals((java.lang.Object) boolean26);
        java.lang.Double double28 = point3.x;
        java.lang.Double double29 = point3.x;
        Line line30 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        Point point2 = new Point((java.lang.Double) 1.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        point2.x = 1.0d;
        java.lang.Double double7 = point2.y;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        point2.y = 0.0d;
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        Point point5 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double6 = point5.y;
        point5.y = 1.0d;
        point5.x = 100.0d;
        point5.x = 10.0d;
        java.lang.Double double13 = point5.y;
        java.lang.Double double14 = point5.x;
        boolean boolean15 = point2.equals((java.lang.Object) double14);
        java.lang.Double double16 = point2.x;
        java.lang.Double double17 = point2.x;
        Point point20 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point20.y = 1.0d;
        point20.y = (-1.0d);
        point20.y = 100.0d;
        point20.x = (-1.0d);
        point20.x = (-1.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.x;
        boolean boolean36 = point33.equals((java.lang.Object) 10.0f);
        point33.x = 100.0d;
        java.lang.Double double39 = point33.x;
        Point point42 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point42.x = 100.0d;
        boolean boolean45 = point33.equals((java.lang.Object) 100.0d);
        java.lang.Double double46 = point33.y;
        Point point49 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double50 = point49.y;
        point49.y = 1.0d;
        point49.x = 100.0d;
        java.lang.Double double55 = point49.x;
        boolean boolean56 = point33.equals((java.lang.Object) point49);
        boolean boolean57 = point20.equals((java.lang.Object) point49);
        java.lang.Double double58 = point20.y;
        Point point61 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point61.y = 1.0d;
        point61.y = (-1.0d);
        java.lang.Double double66 = point61.y;
        java.lang.Double double67 = point61.y;
        java.lang.Double double68 = point61.y;
        point61.y = 100.0d;
        java.lang.Double double71 = point61.x;
        java.lang.Double double72 = point61.y;
        Point point75 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double76 = point75.y;
        java.lang.Class<?> wildcardClass77 = point75.getClass();
        boolean boolean78 = point61.equals((java.lang.Object) wildcardClass77);
        boolean boolean79 = point20.equals((java.lang.Object) wildcardClass77);
        boolean boolean80 = point2.equals((java.lang.Object) point20);
        point2.y = 1.0d;
        Point point83 = null;
        Line line84 = new Line(point2, point83);
        org.junit.Assert.assertTrue("Contract failed: line84.equals(line84)", line84.equals(line84));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
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
        point3.x = 0.0d;
        java.lang.Object obj23 = null;
        boolean boolean24 = point3.equals(obj23);
        java.lang.Double double25 = point3.y;
        java.lang.Double double26 = point3.y;
        java.lang.Double double27 = point3.y;
        Point point30 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point30.y = 1.0d;
        point30.y = (-1.0d);
        java.lang.Double double35 = point30.y;
        java.lang.Double double36 = point30.y;
        point30.y = 1.0d;
        point30.y = 1.0d;
        java.lang.Double double41 = point30.y;
        point30.y = (-1.0d);
        point30.y = 1.0d;
        point30.y = 10.0d;
        boolean boolean48 = point3.equals((java.lang.Object) point30);
        point3.y = (-1.0d);
        Line line51 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line51.equals(line51)", line51.equals(line51));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point6 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double7 = point6.y;
        boolean boolean9 = point6.equals((java.lang.Object) 1L);
        java.lang.Double double10 = point6.y;
        boolean boolean11 = point3.equals((java.lang.Object) double10);
        point3.x = 10.0d;
        java.lang.Double double14 = point3.x;
        Line line15 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        java.lang.Double double7 = point2.x;
        java.lang.Double double8 = point2.y;
        point2.y = 1.0d;
        java.lang.Double double11 = point2.y;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        Line line27 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        Point point31 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double32 = point31.y;
        boolean boolean34 = point31.equals((java.lang.Object) 1L);
        java.lang.Double double35 = point31.y;
        point31.y = 100.0d;
        point31.x = 10.0d;
        java.lang.Double double40 = point31.x;
        java.lang.Double double41 = point31.y;
        boolean boolean42 = point5.equals((java.lang.Object) double41);
        Point point43 = null;
        Line line44 = new Line(point5, point43);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass28 = point27.getClass();
        boolean boolean29 = point20.equals((java.lang.Object) wildcardClass28);
        point20.y = 0.0d;
        boolean boolean32 = point2.equals((java.lang.Object) point20);
        java.lang.Double double33 = point2.x;
        java.lang.Double double34 = point2.y;
        Point point35 = null;
        Line line36 = new Line(point2, point35);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        point3.x = (-1.0d);
        Line line11 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point3.y = (-1.0d);
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.x;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.y;
        point10.y = 1.0d;
        point10.x = 100.0d;
        point10.x = 10.0d;
        java.lang.Double double18 = point10.y;
        point10.y = 0.0d;
        Point point23 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        point23.y = 100.0d;
        boolean boolean27 = point10.equals((java.lang.Object) point23);
        point23.y = 1.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point32.x = 1.0d;
        point32.y = 1.0d;
        java.lang.Double double37 = point32.x;
        point32.x = (-1.0d);
        java.lang.Class<?> wildcardClass40 = point32.getClass();
        boolean boolean41 = point23.equals((java.lang.Object) wildcardClass40);
        point23.x = 0.0d;
        boolean boolean44 = point3.equals((java.lang.Object) 0.0d);
        java.lang.Double double45 = point3.x;
        java.lang.Double double46 = point3.y;
        Point point49 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double50 = point49.y;
        boolean boolean52 = point49.equals((java.lang.Object) 0.0d);
        java.lang.Double double53 = point49.x;
        boolean boolean54 = point3.equals((java.lang.Object) point49);
        java.lang.Double double55 = point49.x;
        Line line56 = new Line(point0, point49);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.y;
        java.lang.Double double9 = point3.y;
        point3.y = 1.0d;
        point3.y = 1.0d;
        java.lang.Double double14 = point3.y;
        point3.x = 0.0d;
        java.lang.Double double17 = point3.y;
        point3.x = (-1.0d);
        point3.y = 100.0d;
        point3.y = 0.0d;
        Line line24 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line24.equals(line24)", line24.equals(line24));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        java.lang.Double double5 = point3.x;
        java.lang.Double double6 = point3.x;
        point3.y = 0.0d;
        point3.y = 1.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        point13.x = 100.0d;
        java.lang.Double double19 = point13.y;
        point13.y = 100.0d;
        point13.x = (-1.0d);
        java.lang.Double double24 = point13.x;
        boolean boolean25 = point3.equals((java.lang.Object) double24);
        Point point28 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 10.0d);
        java.lang.Double double29 = point28.y;
        point28.y = 10.0d;
        point28.y = 0.0d;
        boolean boolean34 = point3.equals((java.lang.Object) point28);
        point28.y = 100.0d;
        Line line37 = new Line(point0, point28);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        point3.y = (-1.0d);
        java.lang.Double double9 = point3.y;
        java.lang.Double double10 = point3.y;
        java.lang.Double double11 = point3.x;
        point3.x = 10.0d;
        point3.y = 1.0d;
        point3.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 1.0d;
        java.lang.Object obj26 = null;
        boolean boolean27 = point20.equals(obj26);
        point20.x = 1.0d;
        boolean boolean31 = point20.equals((java.lang.Object) false);
        java.lang.Double double32 = point20.x;
        java.lang.Double double33 = point20.x;
        java.lang.Double double34 = point20.y;
        boolean boolean35 = point3.equals((java.lang.Object) point20);
        point3.x = 10.0d;
        Line line38 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double33 = point32.y;
        point32.y = 1.0d;
        java.lang.Double double36 = point32.y;
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = point32.equals(obj37);
        java.lang.Double double39 = point32.y;
        boolean boolean41 = point32.equals((java.lang.Object) (byte) 100);
        boolean boolean42 = point14.equals((java.lang.Object) point32);
        Point point45 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.x;
        java.lang.Double double47 = point45.y;
        point45.y = (-1.0d);
        point45.y = 0.0d;
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point54.y = 1.0d;
        point54.y = (-1.0d);
        java.lang.Double double59 = point54.y;
        java.lang.Double double60 = point54.y;
        point54.y = 1.0d;
        point54.y = 100.0d;
        point54.x = 1.0d;
        point54.y = (-1.0d);
        boolean boolean69 = point45.equals((java.lang.Object) point54);
        point45.y = 0.0d;
        boolean boolean72 = point32.equals((java.lang.Object) point45);
        Point point73 = null;
        Line line74 = new Line(point45, point73);
        org.junit.Assert.assertTrue("Contract failed: line74.equals(line74)", line74.equals(line74));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        java.lang.Double double25 = point2.x;
        java.lang.Object obj26 = null;
        boolean boolean27 = point2.equals(obj26);
        Point point28 = null;
        Line line29 = new Line(point2, point28);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        point21.y = 10.0d;
        Point point32 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double36 = point35.y;
        point35.y = 10.0d;
        boolean boolean39 = point32.equals((java.lang.Object) point35);
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double43 = point42.y;
        boolean boolean45 = point42.equals((java.lang.Object) 1L);
        Point point48 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double49 = point48.x;
        boolean boolean51 = point48.equals((java.lang.Object) 10.0f);
        point48.x = 100.0d;
        boolean boolean54 = point42.equals((java.lang.Object) 100.0d);
        boolean boolean55 = point35.equals((java.lang.Object) boolean54);
        java.lang.Double double56 = point35.x;
        point35.y = (-1.0d);
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.y;
        point61.y = 1.0d;
        java.lang.Double double65 = point61.y;
        java.lang.Object obj66 = new java.lang.Object();
        boolean boolean67 = point61.equals(obj66);
        java.lang.Double double68 = point61.y;
        point61.x = (-1.0d);
        point61.y = 0.0d;
        point61.x = 1.0d;
        boolean boolean75 = point35.equals((java.lang.Object) 1.0d);
        java.lang.Double double76 = point35.y;
        java.lang.Double double77 = point35.y;
        java.lang.Double double78 = point35.x;
        boolean boolean79 = point21.equals((java.lang.Object) point35);
        point21.x = 0.0d;
        point21.y = 0.0d;
        point21.y = (-1.0d);
        Line line86 = new Line(point0, point21);
        org.junit.Assert.assertTrue("Contract failed: line86.equals(line86)", line86.equals(line86));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        java.lang.Double double19 = point8.y;
        java.lang.Double double20 = point8.x;
        java.lang.Double double21 = point8.x;
        java.lang.Double double22 = point8.x;
        Line line23 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.y;
        point21.y = 1.0d;
        point21.x = 100.0d;
        java.lang.Double double27 = point21.y;
        point21.y = 100.0d;
        Point point32 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        boolean boolean38 = point35.equals((java.lang.Object) 1L);
        java.lang.Double double39 = point35.y;
        boolean boolean40 = point32.equals((java.lang.Object) double39);
        java.lang.Double double41 = point32.y;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.y;
        point47.y = 10.0d;
        boolean boolean51 = point44.equals((java.lang.Object) point47);
        Point point54 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass55 = point54.getClass();
        boolean boolean56 = point47.equals((java.lang.Object) wildcardClass55);
        Point point59 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point59.x = 1.0d;
        boolean boolean62 = point47.equals((java.lang.Object) point59);
        boolean boolean63 = point32.equals((java.lang.Object) point47);
        boolean boolean64 = point21.equals((java.lang.Object) point32);
        java.lang.Double double65 = point32.x;
        java.lang.Double double66 = point32.y;
        boolean boolean67 = point2.equals((java.lang.Object) point32);
        Point point68 = null;
        Line line69 = new Line(point32, point68);
        org.junit.Assert.assertTrue("Contract failed: line69.equals(line69)", line69.equals(line69));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        point2.x = 10.0d;
        Point point7 = null;
        Line line8 = new Line(point2, point7);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        point3.y = 100.0d;
        point3.y = 0.0d;
        point3.y = 1.0d;
        Line line35 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line35.equals(line35)", line35.equals(line35));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
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
        java.lang.Double double36 = point2.y;
        java.lang.Double double37 = point2.y;
        Point point38 = null;
        Line line39 = new Line(point2, point38);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean5 = point3.equals((java.lang.Object) true);
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double9 = point8.y;
        java.lang.Double double10 = point8.x;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean15 = point13.equals((java.lang.Object) true);
        boolean boolean16 = point8.equals((java.lang.Object) true);
        java.lang.Double double17 = point8.y;
        java.lang.Double double18 = point8.y;
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        java.lang.Double double24 = point21.y;
        java.lang.Double double25 = point21.y;
        point21.y = 10.0d;
        java.lang.Double double28 = point21.y;
        point21.x = 10.0d;
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
        point33.y = 1.0d;
        boolean boolean58 = point21.equals((java.lang.Object) 1.0d);
        boolean boolean59 = point8.equals((java.lang.Object) point21);
        point21.x = 1.0d;
        boolean boolean62 = point3.equals((java.lang.Object) point21);
        java.lang.Double double63 = point3.x;
        java.lang.Double double64 = point3.x;
        Line line65 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
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
        java.lang.Double double19 = point2.y;
        point2.x = 1.0d;
        Point point24 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double25 = point24.y;
        boolean boolean27 = point24.equals((java.lang.Object) 1L);
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.x;
        boolean boolean33 = point30.equals((java.lang.Object) 10.0f);
        point30.x = 100.0d;
        boolean boolean36 = point24.equals((java.lang.Object) 100.0d);
        point24.x = (-1.0d);
        Point point41 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point41.y = 1.0d;
        java.lang.Double double44 = point41.y;
        java.lang.Double double45 = point41.y;
        point41.y = 0.0d;
        point41.x = 10.0d;
        point41.y = 1.0d;
        point41.x = (-1.0d);
        java.lang.Class<?> wildcardClass54 = point41.getClass();
        boolean boolean55 = point24.equals((java.lang.Object) wildcardClass54);
        boolean boolean56 = point2.equals((java.lang.Object) point24);
        Point point57 = null;
        Line line58 = new Line(point24, point57);
        org.junit.Assert.assertTrue("Contract failed: line58.equals(line58)", line58.equals(line58));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
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
        point12.y = 100.0d;
        Point point38 = null;
        Line line39 = new Line(point12, point38);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        java.lang.Double double16 = point2.x;
        point2.y = 1.0d;
        Point point19 = null;
        Line line20 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
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
        point3.x = (-1.0d);
        Line line39 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
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
        java.lang.Double double24 = point3.y;
        point3.x = 10.0d;
        Line line27 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.x = 0.0d;
        point2.y = (-1.0d);
        point2.y = (-1.0d);
        Point point13 = null;
        Line line14 = new Line(point2, point13);
        org.junit.Assert.assertTrue("Contract failed: line14.equals(line14)", line14.equals(line14));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 100.0d);
        point3.x = 100.0d;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point11 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double12 = point11.y;
        boolean boolean14 = point11.equals((java.lang.Object) 1L);
        java.lang.Double double15 = point11.y;
        boolean boolean16 = point8.equals((java.lang.Object) double15);
        Point point19 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point19.y = 1.0d;
        point19.y = (-1.0d);
        point19.y = 100.0d;
        Point point28 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass29 = point28.getClass();
        boolean boolean30 = point19.equals((java.lang.Object) point28);
        boolean boolean31 = point8.equals((java.lang.Object) point28);
        java.lang.Double double32 = point8.y;
        boolean boolean33 = point3.equals((java.lang.Object) point8);
        point3.y = 1.0d;
        point3.y = 100.0d;
        Line line38 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line38.equals(line38)", line38.equals(line38));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.x;
        java.lang.Double double5 = point2.x;
        java.lang.Double double6 = point2.x;
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double10 = point9.y;
        point9.y = 1.0d;
        point9.x = 100.0d;
        point9.x = 10.0d;
        point9.x = 10.0d;
        point9.x = (-1.0d);
        java.lang.Double double21 = point9.y;
        java.lang.Class<?> wildcardClass22 = point9.getClass();
        boolean boolean23 = point2.equals((java.lang.Object) wildcardClass22);
        Point point24 = null;
        Line line25 = new Line(point2, point24);
        org.junit.Assert.assertTrue("Contract failed: line25.equals(line25)", line25.equals(line25));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
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
        java.lang.Double double31 = point9.x;
        point9.y = (-1.0d);
        Point point36 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        point36.y = 10.0d;
        java.lang.Double double39 = point36.x;
        point36.y = 1.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.y;
        point44.y = 1.0d;
        point44.x = 100.0d;
        point44.y = 10.0d;
        point44.y = 10.0d;
        point44.x = 0.0d;
        boolean boolean56 = point36.equals((java.lang.Object) point44);
        point36.y = 100.0d;
        java.lang.Double double59 = point36.x;
        boolean boolean60 = point9.equals((java.lang.Object) point36);
        boolean boolean61 = point3.equals((java.lang.Object) point36);
        Line line62 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line62.equals(line62)", line62.equals(line62));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        java.lang.Object obj31 = null;
        boolean boolean32 = point16.equals(obj31);
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.x = 1.0d;
        java.lang.Double double41 = point35.x;
        boolean boolean42 = point16.equals((java.lang.Object) double41);
        Point point43 = null;
        Line line44 = new Line(point16, point43);
        org.junit.Assert.assertTrue("Contract failed: line44.equals(line44)", line44.equals(line44));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point3.y = 0.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        Point point10 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point10.x = 0.0d;
        point10.y = 1.0d;
        java.lang.Double double15 = point10.x;
        point10.x = 0.0d;
        point10.x = 0.0d;
        boolean boolean20 = point3.equals((java.lang.Object) point10);
        Point point23 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double24 = point23.y;
        java.lang.Double double25 = point23.x;
        Point point28 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean30 = point28.equals((java.lang.Object) true);
        boolean boolean31 = point23.equals((java.lang.Object) true);
        java.lang.Double double32 = point23.y;
        Point point35 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double36 = point35.y;
        point35.y = 1.0d;
        point35.y = 0.0d;
        boolean boolean41 = point23.equals((java.lang.Object) point35);
        java.lang.Double double42 = point23.y;
        point23.x = 1.0d;
        Point point47 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.x;
        java.lang.Double double49 = point47.y;
        point47.y = (-1.0d);
        point47.y = 0.0d;
        point47.x = 100.0d;
        boolean boolean56 = point23.equals((java.lang.Object) point47);
        java.lang.Double double57 = point23.x;
        point23.x = 0.0d;
        boolean boolean60 = point10.equals((java.lang.Object) point23);
        Line line61 = new Line(point0, point23);
        org.junit.Assert.assertTrue("Contract failed: line61.equals(line61)", line61.equals(line61));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        java.lang.Double double24 = point2.y;
        java.lang.Double double25 = point2.x;
        point2.x = 100.0d;
        point2.x = (-1.0d);
        java.lang.Double double30 = point2.y;
        Point point31 = null;
        Line line32 = new Line(point2, point31);
        org.junit.Assert.assertTrue("Contract failed: line32.equals(line32)", line32.equals(line32));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean4 = point2.equals((java.lang.Object) true);
        point2.y = 100.0d;
        point2.y = 1.0d;
        point2.x = (-1.0d);
        Point point11 = null;
        Line line12 = new Line(point2, point11);
        org.junit.Assert.assertTrue("Contract failed: line12.equals(line12)", line12.equals(line12));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
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
        java.lang.Double double19 = point8.x;
        Line line20 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point3.x = 1.0d;
        point3.y = (-1.0d);
        Point point10 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double11 = point10.y;
        point10.y = 10.0d;
        boolean boolean14 = point3.equals((java.lang.Object) 10.0d);
        java.lang.Double double15 = point3.y;
        java.lang.Double double16 = point3.y;
        java.lang.Double double17 = point3.x;
        Point point20 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 0.0d;
        java.lang.Double double24 = point20.y;
        point20.y = (-1.0d);
        point20.y = 100.0d;
        java.lang.Double double29 = point20.y;
        boolean boolean30 = point3.equals((java.lang.Object) point20);
        point3.y = 0.0d;
        java.lang.Double double33 = point3.x;
        java.lang.Double double34 = point3.x;
        point3.y = 0.0d;
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
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
        Point point19 = null;
        Line line20 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        Point point2 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        point2.y = 0.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 10.0d;
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        point13.y = 1.0d;
        java.lang.Double double17 = point13.y;
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = point13.equals(obj18);
        point13.x = 1.0d;
        java.lang.Double double22 = point13.x;
        point13.y = 0.0d;
        point13.y = 1.0d;
        point13.x = (-1.0d);
        point13.x = 0.0d;
        point13.x = 10.0d;
        point13.x = 10.0d;
        boolean boolean35 = point2.equals((java.lang.Object) point13);
        Point point36 = null;
        Line line37 = new Line(point13, point36);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
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
        point2.x = 0.0d;
        java.lang.Double double47 = point2.y;
        Point point48 = null;
        Line line49 = new Line(point2, point48);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
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
        point3.y = (-1.0d);
        point3.x = 0.0d;
        Line line23 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line23.equals(line23)", line23.equals(line23));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        point3.y = 10.0d;
        point3.y = 10.0d;
        point3.x = 1.0d;
        java.lang.Double double10 = point3.x;
        java.lang.Double double11 = point3.x;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) (-1.0d));
        point14.y = 100.0d;
        boolean boolean17 = point3.equals((java.lang.Object) 100.0d);
        Point point20 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double21 = point20.y;
        point20.y = 1.0d;
        point20.x = 100.0d;
        point20.x = 10.0d;
        point20.x = 10.0d;
        java.lang.Double double30 = point20.x;
        point20.x = 10.0d;
        java.lang.Double double33 = point20.x;
        Point point36 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point36.y = 1.0d;
        java.lang.Double double39 = point36.y;
        java.lang.Double double40 = point36.y;
        point36.y = 10.0d;
        Point point45 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double46 = point45.x;
        boolean boolean48 = point45.equals((java.lang.Object) 10.0f);
        point45.x = 100.0d;
        java.lang.Double double51 = point45.x;
        Point point54 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point54.x = 100.0d;
        boolean boolean57 = point45.equals((java.lang.Object) 100.0d);
        java.lang.Double double58 = point45.y;
        point45.y = 100.0d;
        boolean boolean61 = point36.equals((java.lang.Object) point45);
        boolean boolean62 = point20.equals((java.lang.Object) point45);
        point45.x = 1.0d;
        boolean boolean65 = point3.equals((java.lang.Object) 1.0d);
        Line line66 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line66.equals(line66)", line66.equals(line66));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Double double8 = point2.x;
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
        point31.x = 10.0d;
        boolean boolean43 = point2.equals((java.lang.Object) point31);
        point2.y = (-1.0d);
        Point point46 = null;
        Line line47 = new Line(point2, point46);
        org.junit.Assert.assertTrue("Contract failed: line47.equals(line47)", line47.equals(line47));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.y;
        Point point7 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point7.x = 1.0d;
        point7.y = 1.0d;
        java.lang.Double double12 = point7.x;
        point7.x = (-1.0d);
        Point point17 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double18 = point17.y;
        point17.y = 1.0d;
        point17.x = 100.0d;
        point17.x = 10.0d;
        java.lang.Double double25 = point17.y;
        boolean boolean26 = point7.equals((java.lang.Object) double25);
        point7.y = (-1.0d);
        java.lang.Double double29 = point7.x;
        point7.y = 1.0d;
        Point point34 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point34.y = 1.0d;
        point34.y = (-1.0d);
        java.lang.Double double39 = point34.y;
        java.lang.Double double40 = point34.y;
        point34.y = 1.0d;
        point34.y = 100.0d;
        point34.x = 1.0d;
        point34.y = (-1.0d);
        point34.y = 10.0d;
        java.lang.Double double51 = point34.x;
        boolean boolean52 = point7.equals((java.lang.Object) point34);
        boolean boolean53 = point3.equals((java.lang.Object) boolean52);
        point3.y = 100.0d;
        Line line56 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line56.equals(line56)", line56.equals(line56));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean5 = point3.equals((java.lang.Object) (byte) 100);
        java.lang.Double double6 = point3.x;
        point3.x = (-1.0d);
        point3.x = 10.0d;
        point3.y = (-1.0d);
        point3.y = 10.0d;
        java.lang.Double double15 = point3.x;
        point3.y = 10.0d;
        Line line18 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line18.equals(line18)", line18.equals(line18));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
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
        Point point27 = null;
        Line line28 = new Line(point11, point27);
        org.junit.Assert.assertTrue("Contract failed: line28.equals(line28)", line28.equals(line28));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 0.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        Point point6 = null;
        Line line7 = new Line(point2, point6);
        org.junit.Assert.assertTrue("Contract failed: line7.equals(line7)", line7.equals(line7));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        point3.x = 100.0d;
        point3.y = 100.0d;
        java.lang.Double double11 = point3.y;
        point3.y = 100.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.x;
        boolean boolean19 = point16.equals((java.lang.Object) 10.0f);
        point16.x = 100.0d;
        java.lang.Double double22 = point16.x;
        point16.y = 1.0d;
        Point point27 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double28 = point27.y;
        point27.y = 10.0d;
        point27.y = (-1.0d);
        java.lang.Class<?> wildcardClass33 = point27.getClass();
        boolean boolean34 = point16.equals((java.lang.Object) wildcardClass33);
        java.lang.Double double35 = point16.y;
        point16.x = 1.0d;
        point16.x = 10.0d;
        java.lang.Double double40 = point16.y;
        boolean boolean41 = point3.equals((java.lang.Object) double40);
        java.lang.Double double42 = point3.x;
        point3.y = 0.0d;
        Point point47 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.x;
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double53 = point52.y;
        point52.y = 1.0d;
        point52.x = 100.0d;
        point52.y = 100.0d;
        java.lang.Double double60 = point52.y;
        point52.y = 100.0d;
        java.lang.Double double63 = point52.y;
        Point point66 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double67 = point66.y;
        point66.y = 1.0d;
        point66.x = 1.0d;
        java.lang.Object obj72 = null;
        boolean boolean73 = point66.equals(obj72);
        point66.x = 1.0d;
        boolean boolean77 = point66.equals((java.lang.Object) false);
        java.lang.Double double78 = point66.x;
        point66.y = (-1.0d);
        point66.x = 1.0d;
        java.lang.Double double83 = point66.x;
        boolean boolean84 = point52.equals((java.lang.Object) point66);
        boolean boolean85 = point47.equals((java.lang.Object) point52);
        boolean boolean86 = point3.equals((java.lang.Object) point52);
        java.lang.Object obj87 = null;
        boolean boolean88 = point3.equals(obj87);
        Line line89 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line89.equals(line89)", line89.equals(line89));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
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
        point2.x = 10.0d;
        point2.y = 0.0d;
        point2.x = 0.0d;
        point2.x = 0.0d;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        point29.y = 1.0d;
        point29.x = 100.0d;
        point29.x = 10.0d;
        java.lang.Double double37 = point29.y;
        point29.y = 0.0d;
        java.lang.Double double40 = point29.x;
        point29.y = (-1.0d);
        point29.y = 10.0d;
        point29.x = 100.0d;
        point29.x = 1.0d;
        point29.x = 0.0d;
        java.lang.Double double51 = point29.x;
        boolean boolean52 = point2.equals((java.lang.Object) double51);
        Point point53 = null;
        Line line54 = new Line(point2, point53);
        org.junit.Assert.assertTrue("Contract failed: line54.equals(line54)", line54.equals(line54));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point6 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double7 = point6.y;
        point6.y = 10.0d;
        boolean boolean10 = point3.equals((java.lang.Object) point6);
        Point point13 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double14 = point13.y;
        boolean boolean16 = point13.equals((java.lang.Object) 1L);
        Point point19 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double20 = point19.x;
        boolean boolean22 = point19.equals((java.lang.Object) 10.0f);
        point19.x = 100.0d;
        boolean boolean25 = point13.equals((java.lang.Object) 100.0d);
        boolean boolean26 = point6.equals((java.lang.Object) boolean25);
        java.lang.Double double27 = point6.x;
        point6.x = 1.0d;
        Line line30 = new Line(point0, point6);
        org.junit.Assert.assertTrue("Contract failed: line30.equals(line30)", line30.equals(line30));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.y;
        point2.y = 0.0d;
        point2.y = 0.0d;
        point2.x = 0.0d;
        Point point12 = null;
        Line line13 = new Line(point2, point12);
        org.junit.Assert.assertTrue("Contract failed: line13.equals(line13)", line13.equals(line13));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
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
        java.lang.Double double17 = point3.y;
        java.lang.Double double18 = point3.x;
        point3.x = 10.0d;
        Line line21 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line21.equals(line21)", line21.equals(line21));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
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
        java.lang.Double double21 = point3.y;
        java.lang.Double double22 = point3.x;
        java.lang.Double double23 = point3.y;
        java.lang.Double double24 = point3.x;
        point3.y = 0.0d;
        point3.x = 0.0d;
        Line line29 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line29.equals(line29)", line29.equals(line29));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        java.lang.Double double5 = point2.y;
        java.lang.Double double6 = point2.y;
        point2.y = 0.0d;
        point2.y = 1.0d;
        point2.y = 0.0d;
        point2.x = 100.0d;
        point2.x = 1.0d;
        point2.y = 10.0d;
        Point point19 = null;
        Line line20 = new Line(point2, point19);
        org.junit.Assert.assertTrue("Contract failed: line20.equals(line20)", line20.equals(line20));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
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
        boolean boolean48 = point3.equals((java.lang.Object) double47);
        Line line49 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line49.equals(line49)", line49.equals(line49));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        java.lang.Double double7 = point3.x;
        java.lang.Object obj8 = null;
        boolean boolean9 = point3.equals(obj8);
        java.lang.Double double10 = point3.y;
        Line line11 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line11.equals(line11)", line11.equals(line11));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point3.x = 0.0d;
        point3.y = (-1.0d);
        point3.x = 10.0d;
        Line line10 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line10.equals(line10)", line10.equals(line10));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        java.lang.Double double6 = point3.y;
        java.lang.Double double7 = point3.y;
        point3.x = 0.0d;
        Point point12 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point15 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double16 = point15.y;
        boolean boolean18 = point15.equals((java.lang.Object) 1L);
        java.lang.Double double19 = point15.y;
        boolean boolean20 = point12.equals((java.lang.Object) double19);
        java.lang.Double double21 = point12.y;
        java.lang.Double double22 = point12.y;
        point12.x = 10.0d;
        point12.x = 1.0d;
        point12.x = (-1.0d);
        point12.x = (-1.0d);
        java.lang.Double double31 = point12.y;
        java.lang.Double double32 = point12.x;
        java.lang.Double double33 = point12.x;
        java.lang.Double double34 = point12.y;
        boolean boolean35 = point3.equals((java.lang.Object) double34);
        Line line36 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line36.equals(line36)", line36.equals(line36));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 0.0d);
        point3.y = 0.0d;
        point3.y = 0.0d;
        Point point10 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double11 = point10.x;
        boolean boolean13 = point10.equals((java.lang.Object) 10.0f);
        point10.x = 100.0d;
        java.lang.Double double16 = point10.x;
        point10.y = 1.0d;
        Point point21 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double22 = point21.x;
        boolean boolean24 = point21.equals((java.lang.Object) 10.0f);
        point21.x = 100.0d;
        java.lang.Double double27 = point21.x;
        point21.y = 1.0d;
        java.lang.Class<?> wildcardClass30 = point21.getClass();
        boolean boolean31 = point10.equals((java.lang.Object) point21);
        point10.x = 10.0d;
        point10.y = (-1.0d);
        boolean boolean36 = point3.equals((java.lang.Object) (-1.0d));
        Line line37 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line37.equals(line37)", line37.equals(line37));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
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
        point8.x = 0.0d;
        point8.x = 100.0d;
        java.lang.Double double38 = point8.x;
        Line line39 = new Line(point0, point8);
        org.junit.Assert.assertTrue("Contract failed: line39.equals(line39)", line39.equals(line39));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
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
        java.lang.Double double22 = point3.x;
        point3.x = (-1.0d);
        point3.x = (-1.0d);
        Line line27 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line27.equals(line27)", line27.equals(line27));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double3 = point2.x;
        java.lang.Double double4 = point2.y;
        point2.y = (-1.0d);
        Point point9 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point12 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double13 = point12.y;
        java.lang.Double double14 = point12.y;
        boolean boolean15 = point9.equals((java.lang.Object) point12);
        point9.x = 1.0d;
        boolean boolean18 = point2.equals((java.lang.Object) 1.0d);
        java.lang.Double double19 = point2.x;
        Point point22 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double23 = point22.y;
        point22.y = 1.0d;
        java.lang.Double double26 = point22.y;
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = point22.equals(obj27);
        java.lang.Double double29 = point22.x;
        point22.x = (-1.0d);
        Point point34 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double35 = point34.y;
        java.lang.Double double36 = point34.x;
        Point point39 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean41 = point39.equals((java.lang.Object) true);
        boolean boolean42 = point34.equals((java.lang.Object) true);
        java.lang.Double double43 = point34.y;
        Point point46 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double47 = point46.y;
        point46.y = 1.0d;
        point46.y = 0.0d;
        boolean boolean52 = point34.equals((java.lang.Object) point46);
        java.lang.Double double53 = point34.y;
        point34.x = 1.0d;
        boolean boolean56 = point22.equals((java.lang.Object) 1.0d);
        boolean boolean57 = point2.equals((java.lang.Object) point22);
        Point point58 = null;
        Line line59 = new Line(point2, point58);
        org.junit.Assert.assertTrue("Contract failed: line59.equals(line59)", line59.equals(line59));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        boolean boolean6 = point3.equals((java.lang.Object) 1L);
        java.lang.Double double7 = point3.y;
        java.lang.Double double8 = point3.y;
        point3.y = (-1.0d);
        Point point13 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean15 = point13.equals((java.lang.Object) (byte) 100);
        java.lang.Double double16 = point13.x;
        point13.x = (-1.0d);
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
        boolean boolean60 = point13.equals((java.lang.Object) double59);
        java.lang.Double double61 = point13.x;
        point13.x = 0.0d;
        boolean boolean64 = point3.equals((java.lang.Object) point13);
        Line line65 = new Line(point0, point13);
        org.junit.Assert.assertTrue("Contract failed: line65.equals(line65)", line65.equals(line65));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
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
        point3.y = (-1.0d);
        Point point20 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double21 = point20.y;
        java.lang.Double double22 = point20.x;
        java.lang.Double double23 = point20.x;
        point20.y = 0.0d;
        boolean boolean27 = point20.equals((java.lang.Object) '#');
        point20.x = 0.0d;
        point20.y = 100.0d;
        point20.x = 10.0d;
        Point point36 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        Point point39 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        java.lang.Double double40 = point39.y;
        java.lang.Double double41 = point39.y;
        boolean boolean42 = point36.equals((java.lang.Object) point39);
        point36.x = 10.0d;
        boolean boolean45 = point20.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass46 = point20.getClass();
        boolean boolean47 = point3.equals((java.lang.Object) wildcardClass46);
        Line line48 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point3.y = 1.0d;
        point3.y = (-1.0d);
        java.lang.Double double8 = point3.x;
        point3.y = 1.0d;
        java.lang.Double double11 = point3.x;
        point3.y = 0.0d;
        Point point16 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double17 = point16.y;
        point16.y = 1.0d;
        point16.x = 1.0d;
        java.lang.Object obj22 = null;
        boolean boolean23 = point16.equals(obj22);
        point16.x = 1.0d;
        boolean boolean27 = point16.equals((java.lang.Object) false);
        java.lang.Double double28 = point16.x;
        java.lang.Double double29 = point16.x;
        java.lang.Double double30 = point16.y;
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.x;
        boolean boolean36 = point33.equals((java.lang.Object) 10.0f);
        point33.x = 100.0d;
        java.lang.Double double39 = point33.x;
        point33.y = 1.0d;
        Point point44 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double45 = point44.y;
        point44.y = 10.0d;
        point44.y = (-1.0d);
        java.lang.Class<?> wildcardClass50 = point44.getClass();
        boolean boolean51 = point33.equals((java.lang.Object) wildcardClass50);
        java.lang.Double double52 = point33.y;
        point33.y = 100.0d;
        boolean boolean55 = point16.equals((java.lang.Object) point33);
        boolean boolean56 = point3.equals((java.lang.Object) point33);
        Point point59 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 100.0d);
        java.lang.Double double60 = point59.y;
        point59.y = 10.0d;
        boolean boolean63 = point3.equals((java.lang.Object) 10.0d);
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point66.y = 1.0d;
        point66.y = (-1.0d);
        java.lang.Double double71 = point66.y;
        point66.y = 100.0d;
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double77 = point76.y;
        point76.y = 1.0d;
        point76.x = 100.0d;
        point76.y = 10.0d;
        boolean boolean84 = point66.equals((java.lang.Object) 10.0d);
        java.lang.Double double85 = point66.y;
        point66.y = 0.0d;
        java.lang.Double double88 = point66.y;
        point66.x = 0.0d;
        point66.x = (-1.0d);
        java.lang.Double double93 = point66.y;
        boolean boolean94 = point3.equals((java.lang.Object) point66);
        Line line95 = new Line(point0, point66);
        org.junit.Assert.assertTrue("Contract failed: line95.equals(line95)", line95.equals(line95));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        Point point2 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        java.lang.Double double4 = point2.y;
        java.lang.Double double5 = point2.x;
        Point point8 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Double double9 = point8.y;
        boolean boolean11 = point8.equals((java.lang.Object) 0.0d);
        boolean boolean12 = point2.equals((java.lang.Object) point8);
        point2.x = 100.0d;
        java.lang.Double double15 = point2.x;
        Point point18 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double19 = point18.y;
        point18.y = 1.0d;
        point18.x = 1.0d;
        java.lang.Object obj24 = null;
        boolean boolean25 = point18.equals(obj24);
        java.lang.Double double26 = point18.x;
        Point point29 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double30 = point29.y;
        boolean boolean32 = point29.equals((java.lang.Object) 1L);
        java.lang.Double double33 = point29.y;
        point29.y = 100.0d;
        point29.y = (-1.0d);
        boolean boolean38 = point18.equals((java.lang.Object) point29);
        point29.x = (-1.0d);
        point29.y = 100.0d;
        java.lang.Class<?> wildcardClass43 = point29.getClass();
        boolean boolean44 = point2.equals((java.lang.Object) point29);
        Point point47 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double48 = point47.y;
        java.lang.Double double49 = point47.x;
        Point point52 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        boolean boolean54 = point52.equals((java.lang.Object) true);
        boolean boolean55 = point47.equals((java.lang.Object) true);
        java.lang.Double double56 = point47.y;
        point47.x = 10.0d;
        Point point61 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double62 = point61.x;
        boolean boolean64 = point61.equals((java.lang.Object) 10.0f);
        point61.x = 100.0d;
        java.lang.Double double67 = point61.x;
        Point point70 = new Point((java.lang.Double) 100.0d, (java.lang.Double) 1.0d);
        point70.x = 100.0d;
        boolean boolean73 = point61.equals((java.lang.Object) 100.0d);
        java.lang.Double double74 = point61.y;
        Point point77 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double78 = point77.y;
        point77.y = 1.0d;
        point77.x = 100.0d;
        java.lang.Double double83 = point77.x;
        boolean boolean84 = point61.equals((java.lang.Object) point77);
        java.lang.Double double85 = point61.x;
        point61.y = 100.0d;
        point61.y = 1.0d;
        boolean boolean90 = point47.equals((java.lang.Object) 1.0d);
        point47.x = 0.0d;
        java.lang.Double double93 = point47.x;
        boolean boolean94 = point2.equals((java.lang.Object) double93);
        Point point95 = null;
        Line line96 = new Line(point2, point95);
        org.junit.Assert.assertTrue("Contract failed: line96.equals(line96)", line96.equals(line96));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
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
        Point point21 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point21.y = 1.0d;
        point21.y = (-1.0d);
        point21.y = 100.0d;
        Point point30 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double31 = point30.y;
        boolean boolean33 = point30.equals((java.lang.Object) 1L);
        point30.y = (-1.0d);
        java.lang.Double double36 = point30.y;
        java.lang.Double double37 = point30.y;
        java.lang.Double double38 = point30.x;
        boolean boolean39 = point21.equals((java.lang.Object) point30);
        point30.y = 0.0d;
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point44.x = 1.0d;
        point44.y = 1.0d;
        java.lang.Double double49 = point44.x;
        point44.x = (-1.0d);
        boolean boolean52 = point30.equals((java.lang.Object) point44);
        java.lang.Double double53 = point30.x;
        point30.y = (-1.0d);
        point30.y = (-1.0d);
        boolean boolean58 = point2.equals((java.lang.Object) (-1.0d));
        Point point59 = null;
        Line line60 = new Line(point2, point59);
        org.junit.Assert.assertTrue("Contract failed: line60.equals(line60)", line60.equals(line60));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
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
        point2.x = (-1.0d);
        java.lang.Double double28 = point2.x;
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
        point31.x = (-1.0d);
        boolean boolean46 = point2.equals((java.lang.Object) (-1.0d));
        Point point47 = null;
        Line line48 = new Line(point2, point47);
        org.junit.Assert.assertTrue("Contract failed: line48.equals(line48)", line48.equals(line48));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) (-1.0d));
        java.lang.Double double4 = point3.x;
        java.lang.Double double5 = point3.y;
        point3.y = (-1.0d);
        point3.x = 100.0d;
        point3.y = 100.0d;
        Point point14 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double15 = point14.x;
        boolean boolean17 = point14.equals((java.lang.Object) 10.0f);
        point14.x = 100.0d;
        java.lang.Double double20 = point14.y;
        boolean boolean21 = point3.equals((java.lang.Object) point14);
        point14.y = 0.0d;
        java.lang.Double double24 = point14.x;
        java.lang.Double double25 = point14.x;
        Line line26 = new Line(point0, point14);
        org.junit.Assert.assertTrue("Contract failed: line26.equals(line26)", line26.equals(line26));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
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
        Point point51 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double52 = point51.y;
        java.lang.Double double53 = point51.y;
        java.lang.Double double54 = point51.x;
        java.lang.Double double55 = point51.y;
        Point point58 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double59 = point58.y;
        point58.y = 1.0d;
        point58.x = 100.0d;
        point58.y = (-1.0d);
        Point point68 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point68.y = 1.0d;
        point68.y = (-1.0d);
        java.lang.Double double73 = point68.x;
        java.lang.Double double74 = point68.x;
        point68.y = 1.0d;
        boolean boolean77 = point58.equals((java.lang.Object) point68);
        point68.y = (-1.0d);
        point68.x = (-1.0d);
        java.lang.Double double82 = point68.x;
        java.lang.Double double83 = point68.x;
        java.lang.Double double84 = point68.x;
        boolean boolean85 = point51.equals((java.lang.Object) double84);
        java.lang.Class<?> wildcardClass86 = point51.getClass();
        boolean boolean87 = point35.equals((java.lang.Object) wildcardClass86);
        point35.y = 10.0d;
        Point point90 = null;
        Line line91 = new Line(point35, point90);
        org.junit.Assert.assertTrue("Contract failed: line91.equals(line91)", line91.equals(line91));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
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
        point3.x = 10.0d;
        point3.x = 1.0d;
        java.lang.Object obj29 = null;
        boolean boolean30 = point3.equals(obj29);
        point3.x = (-1.0d);
        Point point35 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 1.0d);
        Point point38 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double39 = point38.y;
        boolean boolean41 = point38.equals((java.lang.Object) 1L);
        Point point44 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double45 = point44.x;
        boolean boolean47 = point44.equals((java.lang.Object) 10.0f);
        point44.x = 100.0d;
        boolean boolean50 = point38.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass51 = point38.getClass();
        boolean boolean52 = point35.equals((java.lang.Object) wildcardClass51);
        java.lang.Double double53 = point35.y;
        Point point56 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 100.0d);
        java.lang.Double double57 = point56.y;
        Point point60 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        point60.x = 1.0d;
        point60.y = 1.0d;
        point60.y = (-1.0d);
        boolean boolean67 = point56.equals((java.lang.Object) point60);
        java.lang.Double double68 = point60.x;
        point60.x = 0.0d;
        point60.y = 0.0d;
        boolean boolean73 = point35.equals((java.lang.Object) 0.0d);
        point35.y = 0.0d;
        java.lang.Double double76 = point35.x;
        java.lang.Object obj77 = null;
        boolean boolean78 = point35.equals(obj77);
        boolean boolean79 = point3.equals(obj77);
        Line line80 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line80.equals(line80)", line80.equals(line80));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 0.0d);
        boolean boolean5 = point3.equals((java.lang.Object) (byte) 100);
        java.lang.Double double6 = point3.x;
        java.lang.Double double7 = point3.x;
        Line line8 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line8.equals(line8)", line8.equals(line8));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
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
        java.lang.Double double27 = point20.y;
        Point point30 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        Point point33 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double34 = point33.y;
        boolean boolean36 = point33.equals((java.lang.Object) 1L);
        java.lang.Double double37 = point33.y;
        boolean boolean38 = point30.equals((java.lang.Object) double37);
        java.lang.Double double39 = point30.y;
        Point point42 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        Point point45 = new Point((java.lang.Double) 10.0d, (java.lang.Double) (-1.0d));
        java.lang.Double double46 = point45.y;
        point45.y = 10.0d;
        boolean boolean49 = point42.equals((java.lang.Object) point45);
        Point point52 = new Point((java.lang.Double) 10.0d, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass53 = point52.getClass();
        boolean boolean54 = point45.equals((java.lang.Object) wildcardClass53);
        Point point57 = new Point((java.lang.Double) (-1.0d), (java.lang.Double) 1.0d);
        point57.x = 1.0d;
        boolean boolean60 = point45.equals((java.lang.Object) point57);
        boolean boolean61 = point30.equals((java.lang.Object) point45);
        java.lang.Double double62 = point30.x;
        java.lang.Double double63 = point30.x;
        Point point66 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point66.y = 1.0d;
        point66.y = (-1.0d);
        java.lang.Double double71 = point66.y;
        point66.y = 10.0d;
        Point point76 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 0.0d);
        point76.x = 0.0d;
        point76.y = 1.0d;
        java.lang.Double double81 = point76.x;
        java.lang.Double double82 = point76.x;
        boolean boolean83 = point66.equals((java.lang.Object) point76);
        boolean boolean84 = point30.equals((java.lang.Object) point76);
        java.lang.Double double85 = point30.x;
        boolean boolean86 = point20.equals((java.lang.Object) point30);
        Point point87 = null;
        Line line88 = new Line(point30, point87);
        org.junit.Assert.assertTrue("Contract failed: line88.equals(line88)", line88.equals(line88));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        Point point0 = null;
        Point point3 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double4 = point3.y;
        point3.y = 1.0d;
        java.lang.Double double7 = point3.y;
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = point3.equals(obj8);
        java.lang.Double double10 = point3.y;
        point3.x = 1.0d;
        java.lang.Double double13 = point3.x;
        point3.y = 10.0d;
        Line line16 = new Line(point0, point3);
        org.junit.Assert.assertTrue("Contract failed: line16.equals(line16)", line16.equals(line16));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        Point point2 = new Point((java.lang.Double) 100.0d, (java.lang.Double) (-1.0d));
        point2.y = 1.0d;
        point2.y = (-1.0d);
        point2.x = 0.0d;
        java.lang.Double double9 = point2.x;
        java.lang.Double double10 = point2.y;
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
        boolean boolean36 = point2.equals((java.lang.Object) point13);
        point13.y = 1.0d;
        point13.y = 0.0d;
        Point point41 = null;
        Line line42 = new Line(point13, point41);
        org.junit.Assert.assertTrue("Contract failed: line42.equals(line42)", line42.equals(line42));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
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
        Point point42 = null;
        Line line43 = new Line(point26, point42);
        org.junit.Assert.assertTrue("Contract failed: line43.equals(line43)", line43.equals(line43));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        Point point2 = new Point((java.lang.Double) 0.0d, (java.lang.Double) 1.0d);
        java.lang.Double double3 = point2.y;
        point2.y = 1.0d;
        point2.x = 100.0d;
        point2.x = 10.0d;
        java.lang.Double double10 = point2.x;
        point2.y = (-1.0d);
        java.lang.Double double13 = point2.x;
        Point point14 = null;
        Line line15 = new Line(point2, point14);
        org.junit.Assert.assertTrue("Contract failed: line15.equals(line15)", line15.equals(line15));
    }
}

