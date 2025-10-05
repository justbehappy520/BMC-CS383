package org.jfree.chart.renderer.category;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot21.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = null;
        lineAndShapeRenderer16.setLegendItemURLGenerator(categorySeriesLabelGenerator23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = lineAndShapeRenderer16.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer16.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer16.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(100, itemLabelPosition33, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer16.", lineAndShapeRenderer2.equals(lineAndShapeRenderer16) == lineAndShapeRenderer16.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float13 = categoryAxis12.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer17.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis12, valueAxis14, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer17);
        org.jfree.chart.axis.AxisLocation axisLocation25 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot24.setRangeAxisLocation(axisLocation25);
        java.lang.Object obj27 = categoryPlot24.clone();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.plot.Marker marker29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D9, categoryPlot24, valueAxis28, marker29, rectangle2D30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot24 and obj27", categoryPlot24.equals(obj27) ? categoryPlot24.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator12);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer17.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer17.getSeriesPositiveItemLabelPosition((int) 'a');
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition25, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer17.", lineAndShapeRenderer2.equals(lineAndShapeRenderer17) == lineAndShapeRenderer17.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        boolean boolean11 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        java.awt.Stroke stroke19 = lineAndShapeRenderer15.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float23 = categoryAxis22.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color28 = java.awt.Color.BLUE;
        lineAndShapeRenderer27.setBaseItemLabelPaint((java.awt.Paint) color28);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = lineAndShapeRenderer27.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis22, valueAxis24, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer27);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot34.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis37 = lineAndShapeRenderer15.getRangeAxis(categoryPlot34, (int) '4');
        double double38 = categoryPlot34.getRangeCrosshairValue();
        categoryPlot34.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float43 = categoryAxis42.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color48 = java.awt.Color.BLUE;
        lineAndShapeRenderer47.setBaseItemLabelPaint((java.awt.Paint) color48);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = lineAndShapeRenderer47.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot(categoryDataset40, categoryAxis42, valueAxis44, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer47);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer55 = categoryPlot54.getRenderer();
        java.awt.Stroke stroke56 = categoryPlot54.getRangeMinorGridlineStroke();
        categoryPlot34.setOutlineStroke(stroke56);
        lineAndShapeRenderer2.setSeriesStroke((int) '#', stroke56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer15.", lineAndShapeRenderer2.equals(lineAndShapeRenderer15) == lineAndShapeRenderer15.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesVisible(3, (java.lang.Boolean) true, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer14.", lineAndShapeRenderer2.equals(lineAndShapeRenderer14) == lineAndShapeRenderer14.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Stroke stroke32 = lineAndShapeRenderer28.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer2.setSeriesStroke(4, stroke32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer14.", lineAndShapeRenderer2.equals(lineAndShapeRenderer14) == lineAndShapeRenderer14.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float33 = categoryAxis32.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color38 = java.awt.Color.BLUE;
        lineAndShapeRenderer37.setBaseItemLabelPaint((java.awt.Paint) color38);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = lineAndShapeRenderer37.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis32, valueAxis34, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer37);
        categoryAxis32.setUpperMargin(10.0d);
        java.awt.Font font47 = categoryAxis32.getTickLabelFont();
        lineAndShapeRenderer2.setSeriesItemLabelFont(0, font47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer14.", lineAndShapeRenderer2.equals(lineAndShapeRenderer14) == lineAndShapeRenderer14.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        java.awt.Shape shape21 = lineAndShapeRenderer18.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        lineAndShapeRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        java.awt.Shape shape28 = lineAndShapeRenderer24.getLegendShape(0);
        lineAndShapeRenderer24.setAutoPopulateSeriesStroke(false);
        java.awt.Font font32 = lineAndShapeRenderer24.getSeriesItemLabelFont(0);
        lineAndShapeRenderer24.setUseSeriesOffset(true);
        java.awt.Font font36 = null;
        lineAndShapeRenderer24.setSeriesItemLabelFont((int) (short) 1, font36, false);
        java.awt.Stroke stroke42 = lineAndShapeRenderer24.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer18.setBaseStroke(stroke42, true);
        lineAndShapeRenderer2.setSeriesStroke(4, stroke42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer18.", lineAndShapeRenderer2.equals(lineAndShapeRenderer18) == lineAndShapeRenderer18.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.RenderingSource renderingSource30 = null;
        categoryPlot21.select((double) (byte) 0, (double) (short) 100, rectangle2D29, renderingSource30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float35 = categoryAxis34.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = lineAndShapeRenderer39.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis34, valueAxis36, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer39);
        org.jfree.chart.axis.AxisLocation axisLocation47 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot46.setRangeAxisLocation(axisLocation47);
        java.awt.Color color50 = java.awt.Color.BLUE;
        int int51 = color50.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator55 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color50, (float) 1L, 10, (double) 0L);
        double double56 = defaultShadowGenerator55.getAngle();
        categoryPlot46.setShadowGenerator((org.jfree.chart.util.ShadowGenerator) defaultShadowGenerator55);
        categoryPlot21.setShadowGenerator((org.jfree.chart.util.ShadowGenerator) defaultShadowGenerator55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot46", categoryPlot21.equals(categoryPlot46) ? categoryPlot21.hashCode() == categoryPlot46.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Paint paint26 = lineAndShapeRenderer22.getSeriesOutlinePaint(0);
        java.awt.Paint paint30 = lineAndShapeRenderer22.getItemLabelPaint((int) '#', (int) (byte) 1, true);
        lineAndShapeRenderer2.setBaseItemLabelPaint(paint30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer22.", lineAndShapeRenderer2.equals(lineAndShapeRenderer22) == lineAndShapeRenderer22.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jfree.data.general.DatasetGroup datasetGroup0 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj1 = datasetGroup0.clone();
        java.lang.Object obj2 = datasetGroup0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup0 and obj1", datasetGroup0.equals(obj1) ? datasetGroup0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot14.setRangeAxisLocation(axisLocation15);
        java.lang.Object obj17 = categoryPlot14.clone();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot14.getDomainGridlinePosition();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj17", categoryPlot14.equals(obj17) ? categoryPlot14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = new org.jfree.chart.LegendItemCollection();
        categoryPlot14.setFixedLegendItems(legendItemCollection17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection16 and legendItemCollection17", legendItemCollection16.equals(legendItemCollection17) ? legendItemCollection16.hashCode() == legendItemCollection17.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(4, categoryItemLabelGenerator14);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Shape shape23 = lineAndShapeRenderer19.getLegendShape(0);
        lineAndShapeRenderer19.setAutoPopulateSeriesStroke(false);
        java.awt.Font font27 = lineAndShapeRenderer19.getSeriesItemLabelFont(0);
        lineAndShapeRenderer19.setUseSeriesOffset(true);
        java.awt.Shape shape31 = null;
        lineAndShapeRenderer19.setSeriesShape((int) (short) 10, shape31, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer19.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition34, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float44 = categoryAxis43.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color49 = java.awt.Color.BLUE;
        lineAndShapeRenderer48.setBaseItemLabelPaint((java.awt.Paint) color49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = lineAndShapeRenderer48.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = new org.jfree.chart.plot.CategoryPlot(categoryDataset41, categoryAxis43, valueAxis45, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer48);
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = categoryPlot55.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.data.Range range58 = categoryPlot55.getDataRange(valueAxis57);
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.plot.Marker marker60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        lineAndShapeRenderer39.drawRangeMarker(graphics2D40, categoryPlot55, valueAxis59, marker60, rectangle2D61);
        java.awt.Color color64 = java.awt.Color.GRAY;
        lineAndShapeRenderer39.setSeriesFillPaint(100, (java.awt.Paint) color64, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer70 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color71 = java.awt.Color.BLUE;
        lineAndShapeRenderer70.setBaseItemLabelPaint((java.awt.Paint) color71);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator76 = lineAndShapeRenderer70.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = lineAndShapeRenderer70.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer39.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition77, true);
        java.awt.Stroke stroke83 = lineAndShapeRenderer39.getItemOutlineStroke((int) '#', (int) '4', false);
        lineAndShapeRenderer2.setBaseStroke(stroke83, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer48.", lineAndShapeRenderer2.equals(lineAndShapeRenderer48) == lineAndShapeRenderer48.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float20 = categoryAxis19.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color25 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = lineAndShapeRenderer24.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis19, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        boolean boolean32 = categoryPlot31.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection33 = categoryPlot31.getLegendItems();
        legendItemCollection16.addAll(legendItemCollection33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot31", categoryPlot14.equals(categoryPlot31) ? categoryPlot14.hashCode() == categoryPlot31.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getSeriesStroke((int) '4');
        lineAndShapeRenderer6.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        java.awt.Shape shape15 = lineAndShapeRenderer6.lookupLegendShape((int) '#');
        java.awt.Color color19 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        java.awt.Stroke stroke26 = lineAndShapeRenderer22.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = categoryPlot41.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis44 = lineAndShapeRenderer22.getRangeAxis(categoryPlot41, (int) '4');
        boolean boolean45 = categoryPlot41.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge46 = categoryPlot41.getDomainAxisEdge();
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.RenderingSource renderingSource50 = null;
        categoryPlot41.select((double) (byte) 0, (double) (short) 100, rectangle2D49, renderingSource50);
        categoryPlot41.setForegroundAlpha((float) 3);
        org.jfree.chart.axis.ValueAxis valueAxis55 = categoryPlot41.getRangeAxis((int) 'a');
        java.awt.Stroke stroke56 = categoryPlot41.getRangeGridlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer59 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color60 = java.awt.Color.BLUE;
        lineAndShapeRenderer59.setBaseItemLabelPaint((java.awt.Paint) color60);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator65 = lineAndShapeRenderer59.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition67 = lineAndShapeRenderer59.getSeriesPositiveItemLabelPosition((int) 'a');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer70 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color71 = java.awt.Color.BLUE;
        lineAndShapeRenderer70.setBaseItemLabelPaint((java.awt.Paint) color71);
        lineAndShapeRenderer59.setBaseFillPaint((java.awt.Paint) color71);
        org.jfree.chart.LegendItem legendItem74 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = ", "", "PlotEntity: tooltip = null", "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", shape15, (java.awt.Paint) color19, stroke56, (java.awt.Paint) color71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer6 and lineAndShapeRenderer22.", lineAndShapeRenderer6.equals(lineAndShapeRenderer22) == lineAndShapeRenderer22.equals(lineAndShapeRenderer6));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        boolean boolean14 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation13);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer17.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        lineAndShapeRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator24);
        java.awt.Paint paint27 = lineAndShapeRenderer17.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes28 = lineAndShapeRenderer17.getSelectedItemAttributes();
        java.awt.Paint paint29 = renderAttributes28.getDefaultLabelPaint();
        java.awt.Shape shape31 = renderAttributes28.getSeriesShape((-1));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        lineAndShapeRenderer34.setBaseURLGenerator(categoryURLGenerator35);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator38 = null;
        lineAndShapeRenderer34.setSeriesToolTipGenerator(10, categoryToolTipGenerator38);
        boolean boolean40 = lineAndShapeRenderer34.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke42 = null;
        lineAndShapeRenderer34.setSeriesStroke((int) 'a', stroke42, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor46 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color47 = java.awt.Color.yellow;
        boolean boolean48 = itemLabelAnchor46.equals((java.lang.Object) color47);
        lineAndShapeRenderer34.setSeriesFillPaint((int) ' ', (java.awt.Paint) color47);
        renderAttributes28.setDefaultOutlinePaint((java.awt.Paint) color47);
        java.awt.Color color52 = java.awt.Color.white;
        renderAttributes28.setSeriesPaint((int) (byte) 1, (java.awt.Paint) color52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float57 = categoryAxis56.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer61 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color62 = java.awt.Color.BLUE;
        lineAndShapeRenderer61.setBaseItemLabelPaint((java.awt.Paint) color62);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = lineAndShapeRenderer61.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot(categoryDataset54, categoryAxis56, valueAxis58, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer61);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer69 = categoryPlot68.getRenderer();
        categoryPlot68.setDomainCrosshairVisible(false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent72 = null;
        categoryPlot68.rendererChanged(rendererChangeEvent72);
        boolean boolean74 = color52.equals((java.lang.Object) rendererChangeEvent72);
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer34.", lineAndShapeRenderer2.equals(lineAndShapeRenderer34) == lineAndShapeRenderer34.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        int int15 = categoryPlot14.getRangeAxisCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot14.getOrientation();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Stroke stroke23 = lineAndShapeRenderer19.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot38.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis41 = lineAndShapeRenderer19.getRangeAxis(categoryPlot38, (int) '4');
        boolean boolean42 = categoryPlot38.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder43 = categoryPlot38.getDatasetRenderingOrder();
        categoryPlot14.setDatasetRenderingOrder(datasetRenderingOrder43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot38", categoryPlot14.equals(categoryPlot38) ? categoryPlot14.hashCode() == categoryPlot38.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        java.lang.Boolean boolean11 = lineAndShapeRenderer2.getSeriesShapesVisible((int) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float16 = categoryAxis15.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer20.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis15, valueAxis17, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer20);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot27.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.data.Range range30 = categoryPlot27.getDataRange(valueAxis29);
        boolean boolean31 = categoryPlot27.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double34 = rectangleInsets32.calculateBottomInset(0.0d);
        java.lang.String str35 = rectangleInsets32.toString();
        java.lang.String str36 = rectangleInsets32.toString();
        categoryPlot27.setAxisOffset(rectangleInsets32);
        java.awt.Stroke stroke38 = categoryPlot27.getRangeGridlineStroke();
        boolean boolean39 = categoryPlot27.isRangeZeroBaselineVisible();
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType41 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer42 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType41);
        java.awt.Color color43 = java.awt.Color.BLUE;
        int int44 = color43.getRed();
        boolean boolean45 = standardGradientPaintTransformer42.equals((java.lang.Object) color43);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator49 = new org.jfree.chart.util.DefaultShadowGenerator(0, color43, (float) (short) -1, (int) (short) 1, (double) (short) 1);
        categoryPlot27.setShadowGenerator((org.jfree.chart.util.ShadowGenerator) defaultShadowGenerator49);
        java.awt.Paint paint51 = categoryPlot27.getRangeGridlinePaint();
        lineAndShapeRenderer2.setSeriesOutlinePaint(0, paint51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer20.", lineAndShapeRenderer2.equals(lineAndShapeRenderer20) == lineAndShapeRenderer20.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot21.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        lineAndShapeRenderer32.setBaseURLGenerator(categoryURLGenerator33);
        java.awt.Shape shape36 = lineAndShapeRenderer32.getLegendShape(0);
        lineAndShapeRenderer32.setAutoPopulateSeriesStroke(false);
        java.awt.Font font40 = lineAndShapeRenderer32.getSeriesItemLabelFont(0);
        lineAndShapeRenderer32.setUseSeriesOffset(true);
        java.awt.Shape shape44 = null;
        lineAndShapeRenderer32.setSeriesShape((int) (short) 10, shape44, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        java.awt.Stroke stroke53 = lineAndShapeRenderer49.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float57 = categoryAxis56.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer61 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color62 = java.awt.Color.BLUE;
        lineAndShapeRenderer61.setBaseItemLabelPaint((java.awt.Paint) color62);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = lineAndShapeRenderer61.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot(categoryDataset54, categoryAxis56, valueAxis58, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer61);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer69 = categoryPlot68.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis71 = lineAndShapeRenderer49.getRangeAxis(categoryPlot68, (int) '4');
        double double72 = categoryPlot68.getRangeCrosshairValue();
        lineAndShapeRenderer32.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot68);
        java.awt.Graphics2D graphics2D74 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation75 = null;
        java.awt.geom.Rectangle2D rectangle2D76 = null;
        java.awt.geom.Rectangle2D rectangle2D77 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets78 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double80 = rectangleInsets78.calculateBottomInset(0.0d);
        java.lang.String str81 = rectangleInsets78.toString();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType82 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor83 = null;
        java.awt.geom.Point2D point2D84 = lineAndShapeRenderer32.calculateDomainMarkerTextAnchorPoint(graphics2D74, plotOrientation75, rectangle2D76, rectangle2D77, rectangleInsets78, lengthAdjustmentType82, rectangleAnchor83);
        categoryPlot21.zoomDomainAxes((double) 8, (double) 4, plotRenderingInfo29, point2D84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot68", categoryPlot21.equals(categoryPlot68) ? categoryPlot21.hashCode() == categoryPlot68.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        boolean boolean27 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        lineAndShapeRenderer32.setBaseURLGenerator(categoryURLGenerator33);
        java.awt.Shape shape36 = lineAndShapeRenderer32.getLegendShape(0);
        lineAndShapeRenderer32.setAutoPopulateSeriesStroke(false);
        java.awt.Font font40 = lineAndShapeRenderer32.getSeriesItemLabelFont(0);
        lineAndShapeRenderer32.setUseSeriesOffset(true);
        java.awt.Shape shape44 = null;
        lineAndShapeRenderer32.setSeriesShape((int) (short) 10, shape44, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        java.awt.Stroke stroke53 = lineAndShapeRenderer49.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float57 = categoryAxis56.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer61 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color62 = java.awt.Color.BLUE;
        lineAndShapeRenderer61.setBaseItemLabelPaint((java.awt.Paint) color62);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = lineAndShapeRenderer61.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot(categoryDataset54, categoryAxis56, valueAxis58, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer61);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer69 = categoryPlot68.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis71 = lineAndShapeRenderer49.getRangeAxis(categoryPlot68, (int) '4');
        double double72 = categoryPlot68.getRangeCrosshairValue();
        lineAndShapeRenderer32.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot68);
        java.awt.Graphics2D graphics2D74 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation75 = null;
        java.awt.geom.Rectangle2D rectangle2D76 = null;
        java.awt.geom.Rectangle2D rectangle2D77 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets78 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double80 = rectangleInsets78.calculateBottomInset(0.0d);
        java.lang.String str81 = rectangleInsets78.toString();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType82 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor83 = null;
        java.awt.geom.Point2D point2D84 = lineAndShapeRenderer32.calculateDomainMarkerTextAnchorPoint(graphics2D74, plotOrientation75, rectangle2D76, rectangle2D77, rectangleInsets78, lengthAdjustmentType82, rectangleAnchor83);
        categoryPlot21.panRangeAxes((double) ' ', plotRenderingInfo29, point2D84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot68", categoryPlot21.equals(categoryPlot68) ? categoryPlot21.hashCode() == categoryPlot68.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        lineAndShapeRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Shape shape7 = lineAndShapeRenderer3.getLegendShape(0);
        lineAndShapeRenderer3.setAutoPopulateSeriesStroke(false);
        java.awt.Font font11 = lineAndShapeRenderer3.getSeriesItemLabelFont(0);
        lineAndShapeRenderer3.setUseSeriesOffset(true);
        java.awt.Font font15 = null;
        lineAndShapeRenderer3.setSeriesItemLabelFont((int) (short) 1, font15, false);
        lineAndShapeRenderer3.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        lineAndShapeRenderer3.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        lineAndShapeRenderer3.setBaseItemLabelGenerator(categoryItemLabelGenerator26, true);
        boolean boolean29 = paintList0.equals((java.lang.Object) categoryItemLabelGenerator26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList0 and lineAndShapeRenderer3.", paintList0.equals(lineAndShapeRenderer3) == lineAndShapeRenderer3.equals(paintList0));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot14.setRangeAxisLocation(axisLocation15);
        java.lang.Object obj17 = categoryPlot14.clone();
        boolean boolean18 = categoryPlot14.canSelectByPoint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj17", categoryPlot14.equals(obj17) ? categoryPlot14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jfree.data.general.DatasetGroup datasetGroup0 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj1 = datasetGroup0.clone();
        java.lang.Object obj2 = null;
        boolean boolean3 = datasetGroup0.equals(obj2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup0 and obj1", datasetGroup0.equals(obj1) ? datasetGroup0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 100, false);
        java.lang.Boolean boolean21 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        java.awt.Stroke stroke29 = lineAndShapeRenderer25.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float33 = categoryAxis32.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color38 = java.awt.Color.BLUE;
        lineAndShapeRenderer37.setBaseItemLabelPaint((java.awt.Paint) color38);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = lineAndShapeRenderer37.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis32, valueAxis34, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = categoryPlot44.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis47 = lineAndShapeRenderer25.getRangeAxis(categoryPlot44, (int) '4');
        boolean boolean48 = categoryPlot44.isRangeCrosshairVisible();
        java.awt.Paint paint49 = categoryPlot44.getRangeZeroBaselinePaint();
        java.awt.Paint paint50 = categoryPlot44.getRangeZeroBaselinePaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) '4', paint50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer25.", lineAndShapeRenderer2.equals(lineAndShapeRenderer25) == lineAndShapeRenderer25.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color14 = java.awt.Color.BLUE;
        lineAndShapeRenderer13.setBaseItemLabelPaint((java.awt.Paint) color14);
        java.awt.Stroke stroke17 = lineAndShapeRenderer13.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis20, valueAxis22, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot32.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis35 = lineAndShapeRenderer13.getRangeAxis(categoryPlot32, (int) '4');
        boolean boolean36 = categoryPlot32.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder37 = categoryPlot32.getDatasetRenderingOrder();
        java.awt.Color color38 = java.awt.Color.BLUE;
        int int39 = color38.getRed();
        categoryPlot32.setRangeCrosshairPaint((java.awt.Paint) color38);
        lineAndShapeRenderer2.setSeriesItemLabelPaint(3, (java.awt.Paint) color38, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer13.", lineAndShapeRenderer2.equals(lineAndShapeRenderer13) == lineAndShapeRenderer13.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Stroke stroke7 = lineAndShapeRenderer2.getSeriesStroke((int) 'a');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Stroke stroke15 = lineAndShapeRenderer11.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer2.setSeriesStroke((int) '4', stroke15, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer11.", lineAndShapeRenderer2.equals(lineAndShapeRenderer11) == lineAndShapeRenderer11.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot21.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo28, point2D29);
        java.awt.Stroke stroke31 = categoryPlot21.getRangeZeroBaselineStroke();
        org.jfree.data.general.DatasetGroup datasetGroup32 = categoryPlot21.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float36 = categoryAxis35.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = lineAndShapeRenderer40.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis35, valueAxis37, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer40);
        boolean boolean48 = categoryPlot47.canSelectByPoint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot47);
        java.awt.Stroke stroke50 = categoryPlot47.getRangeMinorGridlineStroke();
        categoryPlot21.setDomainCrosshairStroke(stroke50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot47", categoryPlot21.equals(categoryPlot47) ? categoryPlot21.hashCode() == categoryPlot47.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        boolean boolean6 = legendItem1.isShapeFilled();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setShape(shape12);
        legendItem1.setShapeVisible(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Stroke stroke24 = lineAndShapeRenderer20.getSeriesStroke((int) '4');
        lineAndShapeRenderer20.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        java.awt.Shape shape29 = lineAndShapeRenderer20.lookupLegendShape((int) '#');
        legendItem1.setShape(shape29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer9 and lineAndShapeRenderer20.", lineAndShapeRenderer9.equals(lineAndShapeRenderer20) == lineAndShapeRenderer20.equals(lineAndShapeRenderer9));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        lineAndShapeRenderer4.setBaseURLGenerator(categoryURLGenerator5);
        java.awt.Shape shape8 = lineAndShapeRenderer4.getLegendShape(0);
        lineAndShapeRenderer4.setAutoPopulateSeriesStroke(false);
        java.awt.Font font12 = lineAndShapeRenderer4.getSeriesItemLabelFont(0);
        lineAndShapeRenderer4.setUseSeriesOffset(true);
        java.awt.Font font16 = null;
        lineAndShapeRenderer4.setSeriesItemLabelFont((int) (short) 1, font16, false);
        lineAndShapeRenderer4.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = lineAndShapeRenderer4.getDrawingSupplier();
        boolean boolean24 = lineAndShapeRenderer4.getBaseShapesVisible();
        java.awt.Paint paint28 = lineAndShapeRenderer4.getItemLabelPaint(0, 0, true);
        paintList0.setPaint((int) '#', paint28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList0 and lineAndShapeRenderer4.", paintList0.equals(lineAndShapeRenderer4) == lineAndShapeRenderer4.equals(paintList0));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer2.getNegativeItemLabelPosition(0, (int) (byte) 0, false);
        java.awt.Paint paint27 = null;
        lineAndShapeRenderer2.setSeriesOutlinePaint(3, paint27);
        org.jfree.chart.LegendItem legendItem31 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color35 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem31.setLinePaint((java.awt.Paint) color35);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        java.awt.Shape shape42 = lineAndShapeRenderer39.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity44 = new org.jfree.chart.entity.ChartEntity(shape42, "");
        legendItem31.setLine(shape42);
        java.awt.Stroke stroke46 = legendItem31.getLineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        java.awt.Shape shape52 = lineAndShapeRenderer49.getBaseShape();
        java.awt.Stroke stroke53 = lineAndShapeRenderer49.getBaseOutlineStroke();
        java.awt.Paint paint54 = lineAndShapeRenderer49.getBaseItemLabelPaint();
        legendItem31.setOutlinePaint(paint54);
        lineAndShapeRenderer2.setSeriesPaint(8, paint54);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer39.", lineAndShapeRenderer2.equals(lineAndShapeRenderer39) == lineAndShapeRenderer39.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        java.lang.Boolean boolean26 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) '4');
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(2, (java.lang.Boolean) true, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer14.", lineAndShapeRenderer2.equals(lineAndShapeRenderer14) == lineAndShapeRenderer14.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Stroke stroke12 = lineAndShapeRenderer2.getSeriesStroke(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = null;
        lineAndShapeRenderer16.setLegendItemURLGenerator(categorySeriesLabelGenerator23);
        java.awt.Paint paint26 = lineAndShapeRenderer16.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes27 = lineAndShapeRenderer16.getSelectedItemAttributes();
        java.awt.Paint paint28 = renderAttributes27.getDefaultLabelPaint();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float32 = categoryAxis31.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color37 = java.awt.Color.BLUE;
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = lineAndShapeRenderer36.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis31, valueAxis33, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer36);
        boolean boolean44 = categoryPlot43.canSelectByPoint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        lineAndShapeRenderer47.setBaseURLGenerator(categoryURLGenerator48);
        java.awt.Shape shape51 = lineAndShapeRenderer47.getLegendShape(0);
        lineAndShapeRenderer47.setAutoPopulateSeriesStroke(false);
        java.awt.Font font55 = lineAndShapeRenderer47.getSeriesItemLabelFont(0);
        lineAndShapeRenderer47.setUseSeriesOffset(true);
        java.awt.Shape shape59 = null;
        lineAndShapeRenderer47.setSeriesShape((int) (short) 10, shape59, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition62 = lineAndShapeRenderer47.getBasePositiveItemLabelPosition();
        java.awt.Font font64 = null;
        lineAndShapeRenderer47.setSeriesItemLabelFont((int) (short) 1, font64);
        lineAndShapeRenderer47.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Font font72 = lineAndShapeRenderer47.getItemLabelFont((int) '4', (int) 'a', false);
        categoryPlot43.setNoDataMessageFont(font72);
        renderAttributes27.setDefaultLabelFont(font72);
        lineAndShapeRenderer2.setSeriesItemLabelFont(0, font72);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer16.", lineAndShapeRenderer2.equals(lineAndShapeRenderer16) == lineAndShapeRenderer16.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float7 = categoryAxis6.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color12 = java.awt.Color.BLUE;
        lineAndShapeRenderer11.setBaseItemLabelPaint((java.awt.Paint) color12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = lineAndShapeRenderer11.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset4, categoryAxis6, valueAxis8, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer11);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = categoryPlot18.getDataRange(valueAxis20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.Marker marker23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D3, categoryPlot18, valueAxis22, marker23, rectangle2D24);
        java.awt.Color color27 = java.awt.Color.GRAY;
        lineAndShapeRenderer2.setSeriesFillPaint(100, (java.awt.Paint) color27, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = lineAndShapeRenderer33.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition40, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) (short) 100, 0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = lineAndShapeRenderer49.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = lineAndShapeRenderer49.getBaseNegativeItemLabelPosition();
        java.awt.Paint paint60 = lineAndShapeRenderer49.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Font font61 = lineAndShapeRenderer49.getBaseItemLabelFont();
        boolean boolean62 = itemLabelPosition46.equals((java.lang.Object) font61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition46 and itemLabelPosition56", itemLabelPosition46.equals(itemLabelPosition56) ? itemLabelPosition46.hashCode() == itemLabelPosition56.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot21.getDatasetRenderingOrder();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        java.awt.Stroke stroke33 = lineAndShapeRenderer29.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = null;
        lineAndShapeRenderer29.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator35);
        lineAndShapeRenderer29.setDrawOutlines(true);
        java.awt.Shape shape39 = lineAndShapeRenderer29.getBaseShape();
        java.awt.Stroke stroke43 = lineAndShapeRenderer29.getItemOutlineStroke((int) '#', 1, false);
        lineAndShapeRenderer29.setDrawOutlines(false);
        boolean boolean46 = datasetRenderingOrder26.equals((java.lang.Object) lineAndShapeRenderer29);
        java.awt.Shape shape47 = lineAndShapeRenderer29.getBaseShape();
        org.jfree.chart.LegendItem legendItem50 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color54 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem50.setLinePaint((java.awt.Paint) color54);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color59 = java.awt.Color.BLUE;
        lineAndShapeRenderer58.setBaseItemLabelPaint((java.awt.Paint) color59);
        java.awt.Shape shape61 = lineAndShapeRenderer58.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity63 = new org.jfree.chart.entity.ChartEntity(shape61, "");
        legendItem50.setLine(shape61);
        lineAndShapeRenderer29.setSeriesShape((int) ' ', shape61, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer29.", lineAndShapeRenderer2.equals(lineAndShapeRenderer29) == lineAndShapeRenderer29.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        org.jfree.chart.util.ObjectList objectList3 = new org.jfree.chart.util.ObjectList(8);
        int int4 = objectList1.indexOf((java.lang.Object) objectList3);
        int int5 = objectList3.size();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Stroke stroke13 = lineAndShapeRenderer9.getSeriesOutlineStroke((int) (short) 1);
        int int14 = lineAndShapeRenderer9.getDefaultEntityRadius();
        boolean boolean16 = lineAndShapeRenderer9.isSeriesVisibleInLegend((int) (byte) 1);
        java.awt.Stroke stroke20 = lineAndShapeRenderer9.getItemStroke(8, (int) (short) -1, false);
        objectList3.set(2, (java.lang.Object) lineAndShapeRenderer9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and objectList3.", objectList1.equals(objectList3) == objectList3.equals(objectList1));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.axis.AxisLocation axisLocation23 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot22.setRangeAxisLocation(axisLocation23);
        lineAndShapeRenderer2.setPlot(categoryPlot22);
        lineAndShapeRenderer2.setSeriesShapesVisible(2, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        java.awt.Stroke stroke35 = lineAndShapeRenderer31.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float39 = categoryAxis38.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = lineAndShapeRenderer43.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis38, valueAxis40, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer43);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = categoryPlot50.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis53 = lineAndShapeRenderer31.getRangeAxis(categoryPlot50, (int) '4');
        double double54 = categoryPlot50.getRangeCrosshairValue();
        categoryPlot50.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float59 = categoryAxis58.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color64 = java.awt.Color.BLUE;
        lineAndShapeRenderer63.setBaseItemLabelPaint((java.awt.Paint) color64);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator69 = lineAndShapeRenderer63.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot70 = new org.jfree.chart.plot.CategoryPlot(categoryDataset56, categoryAxis58, valueAxis60, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer63);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer71 = categoryPlot70.getRenderer();
        java.awt.Stroke stroke72 = categoryPlot70.getRangeMinorGridlineStroke();
        categoryPlot50.setOutlineStroke(stroke72);
        java.awt.Paint paint74 = categoryPlot50.getRangeCrosshairPaint();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot22 and categoryPlot70", categoryPlot22.equals(categoryPlot70) ? categoryPlot22.hashCode() == categoryPlot70.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis20, valueAxis22, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer25);
        boolean boolean33 = categoryPlot32.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis35 = categoryPlot32.getRangeAxisForDataset((int) '4');
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot32);
        java.lang.String str37 = categoryPlot32.getNoDataMessage();
        java.lang.String str38 = categoryPlot32.getNoDataMessage();
        categoryPlot32.mapDatasetToRangeAxis(2, (int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer45 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator46 = null;
        lineAndShapeRenderer45.setBaseURLGenerator(categoryURLGenerator46);
        boolean boolean48 = lineAndShapeRenderer45.getBaseLinesVisible();
        java.awt.Stroke stroke50 = lineAndShapeRenderer45.getSeriesStroke((int) 'a');
        categoryPlot32.setRenderer((int) (byte) 0, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer45.", lineAndShapeRenderer2.equals(lineAndShapeRenderer45) == lineAndShapeRenderer45.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot14.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot14.getDataRange(valueAxis16);
        boolean boolean18 = categoryPlot14.isDomainGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot14.getInsets();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        java.awt.Stroke stroke26 = lineAndShapeRenderer22.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = categoryPlot41.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis44 = lineAndShapeRenderer22.getRangeAxis(categoryPlot41, (int) '4');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        java.awt.geom.Point2D point2D48 = null;
        categoryPlot41.zoomRangeAxes((double) (short) 1, 1.0d, plotRenderingInfo47, point2D48);
        org.jfree.chart.axis.AxisLocation axisLocation50 = categoryPlot41.getRangeAxisLocation();
        categoryPlot14.setRangeAxisLocation(axisLocation50, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot41", categoryPlot14.equals(categoryPlot41) ? categoryPlot14.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultCategoryDataset0.getGroup();
        defaultCategoryDataset0.fireSelectionEvent();
        org.jfree.data.general.DatasetGroup datasetGroup3 = new org.jfree.data.general.DatasetGroup();
        defaultCategoryDataset0.setGroup(datasetGroup3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup1 and datasetGroup3", datasetGroup1.equals(datasetGroup3) ? datasetGroup1.hashCode() == datasetGroup3.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float20 = categoryAxis19.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color25 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = lineAndShapeRenderer24.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis19, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = categoryPlot31.getRenderer();
        categoryPlot31.setDomainCrosshairVisible(false);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent35 = null;
        categoryPlot31.rendererChanged(rendererChangeEvent35);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset37 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState39 = lineAndShapeRenderer7.initialise(graphics2D15, rectangle2D16, categoryPlot31, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset37, plotRenderingInfo38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot31", categoryPlot14.equals(categoryPlot31) ? categoryPlot14.hashCode() == categoryPlot31.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer6.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer6.getBaseNegativeItemLabelPosition();
        java.awt.Paint paint17 = lineAndShapeRenderer6.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        java.awt.Stroke stroke25 = lineAndShapeRenderer21.getSeriesStroke((int) '4');
        lineAndShapeRenderer21.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        java.awt.Shape shape30 = lineAndShapeRenderer21.lookupLegendShape((int) '#');
        lineAndShapeRenderer6.setSeriesShape((int) (short) 1, shape30);
        boolean boolean35 = lineAndShapeRenderer6.isItemLabelVisible(0, (int) 'a', false);
        boolean boolean36 = objectList1.equals((java.lang.Object) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float41 = categoryAxis40.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer45 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color46 = java.awt.Color.BLUE;
        lineAndShapeRenderer45.setBaseItemLabelPaint((java.awt.Paint) color46);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = lineAndShapeRenderer45.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis40, valueAxis42, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer45);
        boolean boolean53 = categoryPlot52.canSelectByPoint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot52);
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        categoryAxis57.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean61 = categoryAxis57.isVisible();
        categoryPlot52.setDomainAxis(10, categoryAxis57, true);
        float float64 = categoryPlot52.getBackgroundImageAlpha();
        org.jfree.chart.axis.AxisSpace axisSpace65 = null;
        categoryPlot52.setFixedDomainAxisSpace(axisSpace65);
        org.jfree.chart.axis.CategoryAxis categoryAxis68 = categoryPlot52.getDomainAxisForDataset(0);
        objectList1.set(100, (java.lang.Object) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer6 and lineAndShapeRenderer45.", lineAndShapeRenderer6.equals(lineAndShapeRenderer45) == lineAndShapeRenderer45.equals(lineAndShapeRenderer6));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        int int16 = categoryPlot15.getRangeAxisCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot15.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        org.jfree.chart.axis.AxisLocation axisLocation34 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot33.setRangeAxisLocation(axisLocation34);
        categoryPlot33.configureDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder37 = categoryPlot33.getColumnRenderingOrder();
        boolean boolean38 = plotOrientation17.equals((java.lang.Object) categoryPlot33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot15 and categoryPlot33", categoryPlot15.equals(categoryPlot33) ? categoryPlot15.hashCode() == categoryPlot33.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float20 = categoryAxis19.getTickMarkInsideLength();
        categoryAxis19.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean23 = categoryAxis19.isVisible();
        categoryPlot14.setDomainAxis(10, categoryAxis19, true);
        float float26 = categoryPlot14.getBackgroundImageAlpha();
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        categoryPlot14.setFixedDomainAxisSpace(axisSpace27);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot14.getDomainAxisForDataset(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        java.awt.Stroke stroke37 = lineAndShapeRenderer33.getSeriesStroke((int) '4');
        lineAndShapeRenderer33.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        java.awt.Shape shape42 = lineAndShapeRenderer33.lookupLegendShape((int) '#');
        categoryPlot14.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer33.", lineAndShapeRenderer7.equals(lineAndShapeRenderer33) == lineAndShapeRenderer33.equals(lineAndShapeRenderer7));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultCategoryDataset0.getGroup();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float5 = categoryAxis4.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer9.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset2, categoryAxis4, valueAxis6, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot16.getRenderer();
        java.awt.Stroke stroke18 = categoryPlot16.getRangeMinorGridlineStroke();
        categoryPlot16.clearSelection();
        defaultCategoryDataset0.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot16);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset21 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultCategoryDataset21.getGroup();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = categoryPlot37.getRenderer();
        java.awt.Stroke stroke39 = categoryPlot37.getRangeMinorGridlineStroke();
        categoryPlot37.clearSelection();
        defaultCategoryDataset21.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot37);
        defaultCategoryDataset21.addValue((java.lang.Number) 29.0d, (java.lang.Comparable) 2.0f, (java.lang.Comparable) (-1.0f));
        defaultCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup1 and datasetGroup22", datasetGroup1.equals(datasetGroup22) ? datasetGroup1.hashCode() == datasetGroup22.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator12);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        java.awt.Shape shape20 = lineAndShapeRenderer17.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape20);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape20, "");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset26 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultCategoryDataset26.getGroup();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float31 = categoryAxis30.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color36 = java.awt.Color.BLUE;
        lineAndShapeRenderer35.setBaseItemLabelPaint((java.awt.Paint) color36);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = lineAndShapeRenderer35.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis30, valueAxis32, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer35);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = categoryPlot42.getRenderer();
        java.awt.Stroke stroke44 = categoryPlot42.getRangeMinorGridlineStroke();
        categoryPlot42.clearSelection();
        defaultCategoryDataset26.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot42);
        defaultCategoryDataset26.addValue((java.lang.Number) 29.0d, (java.lang.Comparable) 2.0f, (java.lang.Comparable) (-1.0f));
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity53 = new org.jfree.chart.entity.CategoryItemEntity(shape20, "java.awt.Color[r=255,g=255,b=255]", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset26, (java.lang.Comparable) "PlotOrientation.HORIZONTAL", (java.lang.Comparable) 0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset54 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup55 = defaultCategoryDataset54.getGroup();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float59 = categoryAxis58.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color64 = java.awt.Color.BLUE;
        lineAndShapeRenderer63.setBaseItemLabelPaint((java.awt.Paint) color64);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator69 = lineAndShapeRenderer63.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot70 = new org.jfree.chart.plot.CategoryPlot(categoryDataset56, categoryAxis58, valueAxis60, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer63);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer71 = categoryPlot70.getRenderer();
        java.awt.Stroke stroke72 = categoryPlot70.getRangeMinorGridlineStroke();
        categoryPlot70.clearSelection();
        defaultCategoryDataset54.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot70);
        boolean boolean75 = categoryItemEntity53.equals((java.lang.Object) defaultCategoryDataset54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup27 and datasetGroup55", datasetGroup27.equals(datasetGroup55) ? datasetGroup27.hashCode() == datasetGroup55.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        boolean boolean27 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis28 = categoryPlot21.getRangeAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        lineAndShapeRenderer33.setBaseURLGenerator(categoryURLGenerator34);
        java.awt.Shape shape37 = lineAndShapeRenderer33.getLegendShape(0);
        lineAndShapeRenderer33.setAutoPopulateSeriesStroke(false);
        java.awt.Font font41 = lineAndShapeRenderer33.getSeriesItemLabelFont(0);
        lineAndShapeRenderer33.setUseSeriesOffset(true);
        java.awt.Shape shape45 = null;
        lineAndShapeRenderer33.setSeriesShape((int) (short) 10, shape45, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        java.awt.Stroke stroke54 = lineAndShapeRenderer50.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis57, valueAxis59, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer62);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer70 = categoryPlot69.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis72 = lineAndShapeRenderer50.getRangeAxis(categoryPlot69, (int) '4');
        double double73 = categoryPlot69.getRangeCrosshairValue();
        lineAndShapeRenderer33.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot69);
        java.awt.Graphics2D graphics2D75 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation76 = null;
        java.awt.geom.Rectangle2D rectangle2D77 = null;
        java.awt.geom.Rectangle2D rectangle2D78 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets79 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double81 = rectangleInsets79.calculateBottomInset(0.0d);
        java.lang.String str82 = rectangleInsets79.toString();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType83 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor84 = null;
        java.awt.geom.Point2D point2D85 = lineAndShapeRenderer33.calculateDomainMarkerTextAnchorPoint(graphics2D75, plotOrientation76, rectangle2D77, rectangle2D78, rectangleInsets79, lengthAdjustmentType83, rectangleAnchor84);
        categoryPlot21.zoomRangeAxes((double) 0, plotRenderingInfo30, point2D85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot69", categoryPlot21.equals(categoryPlot69) ? categoryPlot21.hashCode() == categoryPlot69.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = categoryPlot38.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.data.Range range41 = categoryPlot38.getDataRange(valueAxis40);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.plot.Marker marker43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        lineAndShapeRenderer22.drawRangeMarker(graphics2D23, categoryPlot38, valueAxis42, marker43, rectangle2D44);
        java.awt.Color color47 = java.awt.Color.GRAY;
        lineAndShapeRenderer22.setSeriesFillPaint(100, (java.awt.Paint) color47, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = lineAndShapeRenderer53.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition60 = lineAndShapeRenderer53.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer22.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition60, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition66 = lineAndShapeRenderer22.getNegativeItemLabelPosition((int) (short) 100, 0, false);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition66, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer31.", lineAndShapeRenderer2.equals(lineAndShapeRenderer31) == lineAndShapeRenderer31.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(8);
        boolean boolean21 = lineAndShapeRenderer2.getUseSeriesOffset();
        java.awt.Stroke stroke23 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) 'a');
        java.awt.Paint paint27 = lineAndShapeRenderer2.getItemFillPaint(1, 4, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = null;
        lineAndShapeRenderer30.setBaseURLGenerator(categoryURLGenerator31);
        java.awt.Shape shape34 = lineAndShapeRenderer30.getLegendShape(0);
        lineAndShapeRenderer30.setAutoPopulateSeriesStroke(false);
        java.awt.Font font38 = lineAndShapeRenderer30.getSeriesItemLabelFont(0);
        lineAndShapeRenderer30.setUseSeriesOffset(true);
        java.awt.Shape shape42 = null;
        lineAndShapeRenderer30.setSeriesShape((int) (short) 10, shape42, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color48 = java.awt.Color.BLUE;
        lineAndShapeRenderer47.setBaseItemLabelPaint((java.awt.Paint) color48);
        java.awt.Stroke stroke51 = lineAndShapeRenderer47.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float55 = categoryAxis54.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer59 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color60 = java.awt.Color.BLUE;
        lineAndShapeRenderer59.setBaseItemLabelPaint((java.awt.Paint) color60);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator65 = lineAndShapeRenderer59.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot66 = new org.jfree.chart.plot.CategoryPlot(categoryDataset52, categoryAxis54, valueAxis56, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer59);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer67 = categoryPlot66.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis69 = lineAndShapeRenderer47.getRangeAxis(categoryPlot66, (int) '4');
        double double70 = categoryPlot66.getRangeCrosshairValue();
        lineAndShapeRenderer30.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot66);
        org.jfree.chart.LegendItem legendItem73 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color77 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem73.setLinePaint((java.awt.Paint) color77);
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color77);
        java.awt.Font font80 = lineAndShapeRenderer30.getBaseLegendTextFont();
        boolean boolean81 = lineAndShapeRenderer30.getAutoPopulateSeriesFillPaint();
        java.awt.Color color83 = java.awt.Color.white;
        lineAndShapeRenderer30.setSeriesOutlinePaint((int) (byte) 1, (java.awt.Paint) color83, true);
        boolean boolean86 = lineAndShapeRenderer2.equals((java.lang.Object) (byte) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer30.", lineAndShapeRenderer2.equals(lineAndShapeRenderer30) == lineAndShapeRenderer30.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis20, valueAxis22, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer25);
        boolean boolean33 = categoryPlot32.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis35 = categoryPlot32.getRangeAxisForDataset((int) '4');
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot32);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        java.awt.Stroke stroke44 = lineAndShapeRenderer40.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float48 = categoryAxis47.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color53 = java.awt.Color.BLUE;
        lineAndShapeRenderer52.setBaseItemLabelPaint((java.awt.Paint) color53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = lineAndShapeRenderer52.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis47, valueAxis49, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer52);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = categoryPlot59.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis62 = lineAndShapeRenderer40.getRangeAxis(categoryPlot59, (int) '4');
        boolean boolean63 = categoryPlot59.isRangeCrosshairVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo66 = null;
        java.awt.geom.Point2D point2D67 = null;
        categoryPlot59.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo66, point2D67);
        java.awt.Stroke stroke69 = categoryPlot59.getRangeZeroBaselineStroke();
        lineAndShapeRenderer2.setSeriesStroke((int) (byte) 100, stroke69, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot32 and categoryPlot59", categoryPlot32.equals(categoryPlot59) ? categoryPlot32.hashCode() == categoryPlot59.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        lineAndShapeRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        java.awt.Shape shape28 = lineAndShapeRenderer24.getLegendShape(0);
        lineAndShapeRenderer24.setAutoPopulateSeriesStroke(false);
        java.awt.Font font32 = lineAndShapeRenderer24.getSeriesItemLabelFont(0);
        lineAndShapeRenderer24.setUseSeriesOffset(true);
        java.awt.Font font36 = null;
        lineAndShapeRenderer24.setSeriesItemLabelFont((int) (short) 1, font36, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = lineAndShapeRenderer24.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor41 = itemLabelPosition40.getItemLabelAnchor();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer24.", lineAndShapeRenderer2.equals(lineAndShapeRenderer24) == lineAndShapeRenderer24.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        lineAndShapeRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Shape shape20 = lineAndShapeRenderer16.getLegendShape(0);
        lineAndShapeRenderer16.setAutoPopulateSeriesStroke(false);
        boolean boolean23 = lineAndShapeRenderer16.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer26.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer16.setBasePositiveItemLabelPosition(itemLabelPosition33, false);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition33);
        boolean boolean39 = lineAndShapeRenderer2.getItemLineVisible(0, (int) (short) -1);
        java.awt.Shape shape45 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator49 = null;
        lineAndShapeRenderer48.setBaseURLGenerator(categoryURLGenerator49);
        java.awt.Shape shape52 = lineAndShapeRenderer48.getLegendShape(0);
        lineAndShapeRenderer48.setAutoPopulateSeriesStroke(false);
        java.awt.Font font56 = lineAndShapeRenderer48.getSeriesItemLabelFont(0);
        lineAndShapeRenderer48.setUseSeriesOffset(true);
        java.awt.Font font60 = null;
        lineAndShapeRenderer48.setSeriesItemLabelFont((int) (short) 1, font60, false);
        java.awt.Stroke stroke66 = lineAndShapeRenderer48.getItemOutlineStroke(0, 1, false);
        java.awt.Color color68 = java.awt.Color.BLUE;
        int int69 = color68.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator73 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color68, (float) 1L, 10, (double) 0L);
        org.jfree.chart.LegendItem legendItem74 = new org.jfree.chart.LegendItem("java.awt.Color[r=255,g=255,b=255]", "{0}", "", "-3,-3,3,3", shape45, stroke66, (java.awt.Paint) color68);
        lineAndShapeRenderer2.setSeriesStroke((int) (byte) 0, stroke66, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer26.", lineAndShapeRenderer2.equals(lineAndShapeRenderer26) == lineAndShapeRenderer26.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        int int16 = categoryPlot15.getRangeAxisCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot15.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation17);
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer19 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        boolean boolean20 = plotOrientation17.equals((java.lang.Object) standardGradientPaintTransformer19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float24 = categoryAxis23.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color29 = java.awt.Color.BLUE;
        lineAndShapeRenderer28.setBaseItemLabelPaint((java.awt.Paint) color29);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = lineAndShapeRenderer28.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis23, valueAxis25, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer28);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = categoryAxis23.getLabelInsets();
        java.awt.Paint paint37 = categoryAxis23.getTickLabelPaint();
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = null;
        double double42 = categoryAxis23.getCategoryEnd((-16580611), 0, rectangle2D40, rectangleEdge41);
        boolean boolean43 = plotOrientation17.equals((java.lang.Object) categoryAxis23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot15 and categoryPlot35", categoryPlot15.equals(categoryPlot35) ? categoryPlot15.hashCode() == categoryPlot35.hashCode() : true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultCategoryDataset0.getGroup();
        defaultCategoryDataset0.setValue((java.lang.Number) 0.2d, (java.lang.Comparable) 0, (java.lang.Comparable) "org.jfree.data.UnknownKeyException: PlotOrientation.HORIZONTAL");
        int int6 = defaultCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup7 = new org.jfree.data.general.DatasetGroup();
        defaultCategoryDataset0.setGroup(datasetGroup7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup1 and datasetGroup7", datasetGroup1.equals(datasetGroup7) ? datasetGroup1.hashCode() == datasetGroup7.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jfree.data.general.DatasetGroup datasetGroup0 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj1 = datasetGroup0.clone();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        lineAndShapeRenderer4.setBaseURLGenerator(categoryURLGenerator5);
        java.awt.Shape shape8 = lineAndShapeRenderer4.getLegendShape(0);
        lineAndShapeRenderer4.setAutoPopulateSeriesStroke(false);
        java.awt.Font font12 = lineAndShapeRenderer4.getSeriesItemLabelFont(0);
        lineAndShapeRenderer4.setUseSeriesOffset(true);
        java.awt.Font font16 = null;
        lineAndShapeRenderer4.setSeriesItemLabelFont((int) (short) 1, font16, false);
        lineAndShapeRenderer4.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        lineAndShapeRenderer4.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false, false);
        java.awt.Paint paint27 = lineAndShapeRenderer4.getBaseFillPaint();
        boolean boolean28 = datasetGroup0.equals((java.lang.Object) paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup0 and obj1", datasetGroup0.equals(obj1) ? datasetGroup0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis20, valueAxis22, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer25);
        boolean boolean33 = categoryPlot32.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis35 = categoryPlot32.getRangeAxisForDataset((int) '4');
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot32);
        boolean boolean37 = categoryPlot32.isDomainCrosshairVisible();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor38 = categoryPlot32.getDomainGridlinePosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color42 = java.awt.Color.BLUE;
        lineAndShapeRenderer41.setBaseItemLabelPaint((java.awt.Paint) color42);
        java.awt.Stroke stroke45 = lineAndShapeRenderer41.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float49 = categoryAxis48.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = lineAndShapeRenderer53.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot60 = new org.jfree.chart.plot.CategoryPlot(categoryDataset46, categoryAxis48, valueAxis50, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer53);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer61 = categoryPlot60.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis63 = lineAndShapeRenderer41.getRangeAxis(categoryPlot60, (int) '4');
        boolean boolean64 = categoryPlot60.isRangeCrosshairVisible();
        java.awt.Paint paint65 = categoryPlot60.getRangeZeroBaselinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent66 = null;
        categoryPlot60.axisChanged(axisChangeEvent66);
        boolean boolean68 = categoryAnchor38.equals((java.lang.Object) axisChangeEvent66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot32 and categoryPlot60", categoryPlot32.equals(categoryPlot60) ? categoryPlot32.hashCode() == categoryPlot60.hashCode() : true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) (short) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        java.awt.Stroke stroke19 = lineAndShapeRenderer15.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float23 = categoryAxis22.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color28 = java.awt.Color.BLUE;
        lineAndShapeRenderer27.setBaseItemLabelPaint((java.awt.Paint) color28);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = lineAndShapeRenderer27.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis22, valueAxis24, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer27);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot34.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis37 = lineAndShapeRenderer15.getRangeAxis(categoryPlot34, (int) '4');
        boolean boolean38 = categoryPlot34.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot34.getDomainAxisEdge();
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        org.jfree.chart.RenderingSource renderingSource43 = null;
        categoryPlot34.select((double) (byte) 0, (double) (short) 100, rectangle2D42, renderingSource43);
        categoryPlot34.setForegroundAlpha((float) 3);
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = categoryPlot34.getDomainAxisEdge();
        categoryPlot34.setAnchorValue((double) 8, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis51 = categoryPlot34.getDomainAxis();
        int int52 = categoryPlot34.getWeight();
        lineAndShapeRenderer2.setPlot(categoryPlot34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer15.", lineAndShapeRenderer2.equals(lineAndShapeRenderer15) == lineAndShapeRenderer15.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getItemOutlineStroke((int) '#', 1, false);
        lineAndShapeRenderer2.setDrawOutlines(false);
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesShapesFilled(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color25 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color25);
        boolean boolean27 = lineAndShapeRenderer24.getAutoPopulateSeriesPaint();
        boolean boolean28 = lineAndShapeRenderer24.getAutoPopulateSeriesFillPaint();
        java.awt.Color color29 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color29);
        boolean boolean31 = lineAndShapeRenderer24.getBaseItemLabelsVisible();
        boolean boolean33 = lineAndShapeRenderer24.isSeriesVisibleInLegend((-1));
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float37 = categoryAxis36.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color42 = java.awt.Color.BLUE;
        lineAndShapeRenderer41.setBaseItemLabelPaint((java.awt.Paint) color42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = lineAndShapeRenderer41.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis36, valueAxis38, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer41);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = categoryPlot48.getRenderer();
        java.awt.Stroke stroke50 = categoryPlot48.getRangeMinorGridlineStroke();
        lineAndShapeRenderer24.setBaseOutlineStroke(stroke50);
        lineAndShapeRenderer2.setSeriesOutlineStroke((int) (byte) 0, stroke50, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer41.", lineAndShapeRenderer2.equals(lineAndShapeRenderer41) == lineAndShapeRenderer41.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        categoryPlot14.setDomainCrosshairVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Shape shape26 = lineAndShapeRenderer22.getLegendShape(0);
        lineAndShapeRenderer22.setAutoPopulateSeriesStroke(false);
        java.awt.Font font30 = lineAndShapeRenderer22.getSeriesItemLabelFont(0);
        lineAndShapeRenderer22.setUseSeriesOffset(true);
        java.awt.Shape shape34 = null;
        lineAndShapeRenderer22.setSeriesShape((int) (short) 10, shape34, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        java.awt.Stroke stroke43 = lineAndShapeRenderer39.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float47 = categoryAxis46.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = lineAndShapeRenderer51.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis46, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = categoryPlot58.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis61 = lineAndShapeRenderer39.getRangeAxis(categoryPlot58, (int) '4');
        double double62 = categoryPlot58.getRangeCrosshairValue();
        lineAndShapeRenderer22.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot58);
        java.awt.Graphics2D graphics2D64 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        java.awt.geom.Rectangle2D rectangle2D67 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double70 = rectangleInsets68.calculateBottomInset(0.0d);
        java.lang.String str71 = rectangleInsets68.toString();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType72 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor73 = null;
        java.awt.geom.Point2D point2D74 = lineAndShapeRenderer22.calculateDomainMarkerTextAnchorPoint(graphics2D64, plotOrientation65, rectangle2D66, rectangle2D67, rectangleInsets68, lengthAdjustmentType72, rectangleAnchor73);
        categoryPlot14.zoomDomainAxes(16.0d, plotRenderingInfo19, point2D74, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot58", categoryPlot14.equals(categoryPlot58) ? categoryPlot14.hashCode() == categoryPlot58.hashCode() : true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        java.awt.Color color1 = java.awt.Color.ORANGE;
        org.jfree.data.KeyedObject keyedObject2 = new org.jfree.data.KeyedObject((java.lang.Comparable) "{0}", (java.lang.Object) color1);
        java.lang.Object obj3 = keyedObject2.clone();
        java.lang.Object obj4 = keyedObject2.getObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObject2 and obj3", keyedObject2.equals(obj3) ? keyedObject2.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Font font19 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font19);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        lineAndShapeRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        java.awt.Shape shape31 = lineAndShapeRenderer27.getLegendShape(0);
        lineAndShapeRenderer27.setAutoPopulateSeriesStroke(false);
        java.awt.Font font35 = lineAndShapeRenderer27.getSeriesItemLabelFont(0);
        lineAndShapeRenderer27.setUseSeriesOffset(true);
        java.awt.Shape shape39 = null;
        lineAndShapeRenderer27.setSeriesShape((int) (short) 10, shape39, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = lineAndShapeRenderer27.getBasePositiveItemLabelPosition();
        java.awt.Font font44 = null;
        lineAndShapeRenderer27.setSeriesItemLabelFont((int) (short) 1, font44);
        lineAndShapeRenderer27.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Font font52 = lineAndShapeRenderer27.getItemLabelFont((int) '4', (int) 'a', false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator56 = null;
        lineAndShapeRenderer55.setBaseURLGenerator(categoryURLGenerator56);
        java.awt.Paint paint59 = lineAndShapeRenderer55.getSeriesOutlinePaint(0);
        java.awt.Paint paint63 = lineAndShapeRenderer55.getItemLabelPaint((int) '#', (int) (byte) 1, true);
        lineAndShapeRenderer27.setBaseItemLabelPaint(paint63);
        lineAndShapeRenderer2.setSeriesPaint((int) (byte) 1, paint63, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer27.", lineAndShapeRenderer2.equals(lineAndShapeRenderer27) == lineAndShapeRenderer27.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        java.awt.Stroke stroke22 = lineAndShapeRenderer18.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = categoryPlot37.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis40 = lineAndShapeRenderer18.getRangeAxis(categoryPlot37, (int) '4');
        boolean boolean41 = categoryPlot37.isRangeCrosshairVisible();
        java.awt.Paint paint42 = categoryPlot37.getRangeZeroBaselinePaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent43 = null;
        categoryPlot37.axisChanged(axisChangeEvent43);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor45 = org.jfree.chart.axis.CategoryAnchor.START;
        categoryPlot37.setDomainGridlinePosition(categoryAnchor45);
        categoryPlot14.setDomainGridlinePosition(categoryAnchor45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot37", categoryPlot14.equals(categoryPlot37) ? categoryPlot14.hashCode() == categoryPlot37.hashCode() : true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        boolean boolean14 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = null;
        lineAndShapeRenderer18.setLegendItemURLGenerator(categorySeriesLabelGenerator25);
        java.awt.Paint paint28 = lineAndShapeRenderer18.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes29 = lineAndShapeRenderer18.getSelectedItemAttributes();
        java.awt.Paint paint30 = renderAttributes29.getDefaultLabelPaint();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float34 = categoryAxis33.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color39 = java.awt.Color.BLUE;
        lineAndShapeRenderer38.setBaseItemLabelPaint((java.awt.Paint) color39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator44 = lineAndShapeRenderer38.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis33, valueAxis35, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer38);
        boolean boolean46 = categoryPlot45.canSelectByPoint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        lineAndShapeRenderer49.setBaseURLGenerator(categoryURLGenerator50);
        java.awt.Shape shape53 = lineAndShapeRenderer49.getLegendShape(0);
        lineAndShapeRenderer49.setAutoPopulateSeriesStroke(false);
        java.awt.Font font57 = lineAndShapeRenderer49.getSeriesItemLabelFont(0);
        lineAndShapeRenderer49.setUseSeriesOffset(true);
        java.awt.Shape shape61 = null;
        lineAndShapeRenderer49.setSeriesShape((int) (short) 10, shape61, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = lineAndShapeRenderer49.getBasePositiveItemLabelPosition();
        java.awt.Font font66 = null;
        lineAndShapeRenderer49.setSeriesItemLabelFont((int) (short) 1, font66);
        lineAndShapeRenderer49.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Font font74 = lineAndShapeRenderer49.getItemLabelFont((int) '4', (int) 'a', false);
        categoryPlot45.setNoDataMessageFont(font74);
        renderAttributes29.setDefaultLabelFont(font74);
        lineAndShapeRenderer2.setSeriesItemLabelFont(0, font74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer18.", lineAndShapeRenderer2.equals(lineAndShapeRenderer18) == lineAndShapeRenderer18.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getColumnRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float20 = categoryAxis19.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color25 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = lineAndShapeRenderer24.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis19, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        boolean boolean32 = categoryPlot31.canSelectByPoint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot31);
        org.jfree.chart.plot.Plot plot34 = plotChangeEvent33.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = plot34.getInsets();
        categoryPlot14.setInsets(rectangleInsets35, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot31", categoryPlot14.equals(categoryPlot31) ? categoryPlot14.hashCode() == categoryPlot31.hashCode() : true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float18 = categoryAxis17.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer22.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis17, valueAxis19, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer22);
        boolean boolean30 = categoryPlot29.canSelectByPoint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        lineAndShapeRenderer33.setBaseURLGenerator(categoryURLGenerator34);
        java.awt.Shape shape37 = lineAndShapeRenderer33.getLegendShape(0);
        lineAndShapeRenderer33.setAutoPopulateSeriesStroke(false);
        java.awt.Font font41 = lineAndShapeRenderer33.getSeriesItemLabelFont(0);
        lineAndShapeRenderer33.setUseSeriesOffset(true);
        java.awt.Shape shape45 = null;
        lineAndShapeRenderer33.setSeriesShape((int) (short) 10, shape45, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = lineAndShapeRenderer33.getBasePositiveItemLabelPosition();
        java.awt.Font font50 = null;
        lineAndShapeRenderer33.setSeriesItemLabelFont((int) (short) 1, font50);
        lineAndShapeRenderer33.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Font font58 = lineAndShapeRenderer33.getItemLabelFont((int) '4', (int) 'a', false);
        categoryPlot29.setNoDataMessageFont(font58);
        renderAttributes13.setDefaultLabelFont(font58);
        java.awt.Paint paint61 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Paint paint62 = renderAttributes13.getDefaultLabelPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer65 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator66 = null;
        lineAndShapeRenderer65.setBaseURLGenerator(categoryURLGenerator66);
        java.awt.Shape shape69 = lineAndShapeRenderer65.getLegendShape(0);
        lineAndShapeRenderer65.setAutoPopulateSeriesStroke(false);
        java.awt.Font font73 = lineAndShapeRenderer65.getSeriesItemLabelFont(0);
        lineAndShapeRenderer65.setUseSeriesOffset(true);
        java.awt.Shape shape77 = null;
        lineAndShapeRenderer65.setSeriesShape((int) (short) 10, shape77, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition80 = lineAndShapeRenderer65.getBasePositiveItemLabelPosition();
        java.awt.Font font82 = null;
        lineAndShapeRenderer65.setSeriesItemLabelFont((int) (short) 1, font82);
        lineAndShapeRenderer65.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Font font90 = lineAndShapeRenderer65.getItemLabelFont((int) '4', (int) 'a', false);
        java.awt.Shape shape91 = lineAndShapeRenderer65.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity93 = new org.jfree.chart.entity.ChartEntity(shape91, "");
        renderAttributes13.setDefaultShape(shape91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition48 and itemLabelPosition80", itemLabelPosition48.equals(itemLabelPosition80) ? itemLabelPosition48.hashCode() == itemLabelPosition80.hashCode() : true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        boolean boolean27 = categoryPlot21.isRangeZoomable();
        int int28 = categoryPlot21.getDomainAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float33 = categoryAxis32.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color38 = java.awt.Color.BLUE;
        lineAndShapeRenderer37.setBaseItemLabelPaint((java.awt.Paint) color38);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = lineAndShapeRenderer37.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis32, valueAxis34, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer37);
        boolean boolean45 = categoryPlot44.canSelectByPoint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot44);
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float50 = categoryAxis49.getTickMarkInsideLength();
        categoryAxis49.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean53 = categoryAxis49.isVisible();
        categoryPlot44.setDomainAxis(10, categoryAxis49, true);
        java.lang.String str56 = categoryAxis49.getLabelURL();
        categoryPlot21.setDomainAxis((int) (byte) 0, categoryAxis49, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot21 and categoryPlot44.", categoryPlot21.equals(categoryPlot44) == categoryPlot44.equals(categoryPlot21));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        int int16 = categoryPlot15.getRangeAxisCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot15.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation17);
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer19 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        boolean boolean20 = plotOrientation17.equals((java.lang.Object) standardGradientPaintTransformer19);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator24);
        boolean boolean28 = lineAndShapeRenderer23.getItemVisible((int) '#', 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        java.awt.Stroke stroke35 = lineAndShapeRenderer31.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float39 = categoryAxis38.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = lineAndShapeRenderer43.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot(categoryDataset36, categoryAxis38, valueAxis40, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer43);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = categoryPlot50.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis53 = lineAndShapeRenderer31.getRangeAxis(categoryPlot50, (int) '4');
        boolean boolean54 = categoryPlot50.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder55 = categoryPlot50.getDatasetRenderingOrder();
        java.awt.Color color56 = java.awt.Color.BLUE;
        int int57 = color56.getRed();
        categoryPlot50.setRangeCrosshairPaint((java.awt.Paint) color56);
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color56);
        boolean boolean60 = plotOrientation17.equals((java.lang.Object) lineAndShapeRenderer23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot15 and categoryPlot50", categoryPlot15.equals(categoryPlot50) ? categoryPlot15.hashCode() == categoryPlot50.hashCode() : true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator26);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        lineAndShapeRenderer2.setSeriesShapesFilled(0, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer14.", lineAndShapeRenderer2.equals(lineAndShapeRenderer14) == lineAndShapeRenderer14.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        boolean boolean26 = categoryPlot21.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        boolean boolean31 = categoryPlot21.removeDomainMarker((int) (byte) 0, marker28, layer29, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        java.awt.Stroke stroke38 = lineAndShapeRenderer34.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float42 = categoryAxis41.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color47 = java.awt.Color.BLUE;
        lineAndShapeRenderer46.setBaseItemLabelPaint((java.awt.Paint) color47);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = lineAndShapeRenderer46.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis41, valueAxis43, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer46);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer54 = categoryPlot53.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis56 = lineAndShapeRenderer34.getRangeAxis(categoryPlot53, (int) '4');
        boolean boolean57 = categoryPlot53.isRangeCrosshairVisible();
        java.awt.Paint paint58 = categoryPlot53.getRangeZeroBaselinePaint();
        java.awt.Paint paint59 = categoryPlot53.getRangeZeroBaselinePaint();
        categoryPlot53.clearSelection();
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float64 = categoryAxis63.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color69 = java.awt.Color.BLUE;
        lineAndShapeRenderer68.setBaseItemLabelPaint((java.awt.Paint) color69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = lineAndShapeRenderer68.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis63, valueAxis65, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer68);
        org.jfree.chart.axis.CategoryAxis categoryAxis76 = categoryPlot75.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis77 = null;
        org.jfree.data.Range range78 = categoryPlot75.getDataRange(valueAxis77);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray79 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot75.setDomainAxes(categoryAxisArray79);
        categoryPlot75.setDomainCrosshairColumnKey((java.lang.Comparable) (-1.0d), false);
        org.jfree.chart.util.RectangleEdge rectangleEdge84 = categoryPlot75.getDomainAxisEdge();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier85 = categoryPlot75.getDrawingSupplier();
        categoryPlot53.setDrawingSupplier(drawingSupplier85);
        java.awt.Stroke stroke87 = drawingSupplier85.getNextStroke();
        categoryPlot21.setDrawingSupplier(drawingSupplier85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot53", categoryPlot21.equals(categoryPlot53) ? categoryPlot21.hashCode() == categoryPlot53.hashCode() : true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Font font19 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font19);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Font font27 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) 'a', false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = null;
        lineAndShapeRenderer30.setBaseURLGenerator(categoryURLGenerator31);
        java.awt.Paint paint34 = lineAndShapeRenderer30.getSeriesOutlinePaint(0);
        java.awt.Paint paint38 = lineAndShapeRenderer30.getItemLabelPaint((int) '#', (int) (byte) 1, true);
        lineAndShapeRenderer2.setBaseItemLabelPaint(paint38);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color43 = java.awt.Color.BLUE;
        lineAndShapeRenderer42.setBaseItemLabelPaint((java.awt.Paint) color43);
        java.awt.Stroke stroke46 = lineAndShapeRenderer42.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = null;
        lineAndShapeRenderer42.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator48);
        lineAndShapeRenderer42.setDrawOutlines(true);
        java.awt.Shape shape52 = lineAndShapeRenderer42.getBaseShape();
        lineAndShapeRenderer2.setBaseShape(shape52, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator59 = null;
        lineAndShapeRenderer58.setBaseURLGenerator(categoryURLGenerator59);
        java.awt.Shape shape62 = lineAndShapeRenderer58.getLegendShape(0);
        boolean boolean63 = lineAndShapeRenderer58.getBaseItemLabelsVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition67 = lineAndShapeRenderer58.getPositiveItemLabelPosition(3, (int) '#', false);
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) 'a', itemLabelPosition67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition17 and itemLabelPosition67", itemLabelPosition17.equals(itemLabelPosition67) ? itemLabelPosition17.hashCode() == itemLabelPosition67.hashCode() : true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        lineAndShapeRenderer27.setBaseURLGenerator(categoryURLGenerator28);
        java.awt.Shape shape31 = lineAndShapeRenderer27.getLegendShape(0);
        boolean boolean32 = lineAndShapeRenderer27.getBaseItemLabelsVisible();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float36 = categoryAxis35.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = lineAndShapeRenderer40.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis35, valueAxis37, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer40);
        org.jfree.chart.axis.AxisLocation axisLocation48 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot47.setRangeAxisLocation(axisLocation48);
        lineAndShapeRenderer27.setPlot(categoryPlot47);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator54 = null;
        lineAndShapeRenderer53.setBaseURLGenerator(categoryURLGenerator54);
        java.awt.Shape shape57 = lineAndShapeRenderer53.getLegendShape(0);
        lineAndShapeRenderer53.setAutoPopulateSeriesStroke(false);
        java.awt.Font font61 = lineAndShapeRenderer53.getSeriesItemLabelFont(0);
        lineAndShapeRenderer53.setUseSeriesOffset(true);
        java.awt.Shape shape65 = null;
        lineAndShapeRenderer53.setSeriesShape((int) (short) 10, shape65, true);
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.data.Range range69 = lineAndShapeRenderer53.findRangeBounds(categoryDataset68);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator70 = null;
        lineAndShapeRenderer53.setBaseToolTipGenerator(categoryToolTipGenerator70);
        java.awt.Shape shape72 = lineAndShapeRenderer53.getBaseShape();
        lineAndShapeRenderer27.setBaseShape(shape72, false);
        lineAndShapeRenderer2.setBaseShape(shape72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot47", categoryPlot21.equals(categoryPlot47) ? categoryPlot21.hashCode() == categoryPlot47.hashCode() : true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        java.awt.Shape shape13 = lineAndShapeRenderer9.getLegendShape(0);
        lineAndShapeRenderer9.setAutoPopulateSeriesStroke(false);
        java.awt.Font font17 = lineAndShapeRenderer9.getSeriesItemLabelFont(0);
        lineAndShapeRenderer9.setUseSeriesOffset(true);
        java.awt.Shape shape21 = null;
        lineAndShapeRenderer9.setSeriesShape((int) (short) 10, shape21, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        java.awt.Stroke stroke30 = lineAndShapeRenderer26.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float34 = categoryAxis33.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color39 = java.awt.Color.BLUE;
        lineAndShapeRenderer38.setBaseItemLabelPaint((java.awt.Paint) color39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator44 = lineAndShapeRenderer38.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot(categoryDataset31, categoryAxis33, valueAxis35, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer38);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = categoryPlot45.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis48 = lineAndShapeRenderer26.getRangeAxis(categoryPlot45, (int) '4');
        double double49 = categoryPlot45.getRangeCrosshairValue();
        lineAndShapeRenderer9.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot45);
        org.jfree.chart.axis.ValueAxis valueAxis51 = categoryPlot45.getRangeAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation52 = categoryPlot45.getOrientation();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset53 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup54 = defaultCategoryDataset53.getGroup();
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis57, valueAxis59, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer62);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer70 = categoryPlot69.getRenderer();
        java.awt.Stroke stroke71 = categoryPlot69.getRangeMinorGridlineStroke();
        categoryPlot69.clearSelection();
        defaultCategoryDataset53.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot69);
        defaultCategoryDataset53.addValue((java.lang.Number) 29.0d, (java.lang.Comparable) 2.0f, (java.lang.Comparable) (-1.0f));
        defaultCategoryDataset53.clearSelection();
        lineAndShapeRenderer2.drawItemLabel(graphics2D6, plotOrientation52, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset53, 4, (-256), true, (double) 8, 100.0d, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot45 and categoryPlot69", categoryPlot45.equals(categoryPlot69) ? categoryPlot45.hashCode() == categoryPlot69.hashCode() : true);
    }
}

