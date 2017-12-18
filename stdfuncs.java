// Copyright (C) 2017 Kyaw Kyaw Htike @ Ali Abdul Ghafur. All rights reserved.

package KKH.StdLib;

import KKH.StdLib.Interfaces_LamdaFunctions.*;
import org.apache.commons.lang3.ArrayUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

/**
Utilities (static methods) that work with java standard libs
 */
public final class stdfuncs {

    private static void print_line_matrix_separator_begin()
    {
        System.out.println("=========== Printing matrix ============");
    }

    private static void print_line_matrix_separator_end()
    {
        System.out.println("=========== Matrix printed ============");
    }

    public static void print_array(int[][] m) {

        print_line_matrix_separator_begin();
        System.out.println("mat=[");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length-1; j++)
                System.out.print(m[i][j] + ",\t");
            System.out.println(m[i][m[i].length-1] + ";");
        }
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(float[][] m) {

        print_line_matrix_separator_begin();
        System.out.println("mat=[");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length-1; j++)
                System.out.print(m[i][j] + ",\t");
            System.out.println(m[i][m[i].length-1] + ";");
        }
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(double[][] m) {

        print_line_matrix_separator_begin();
        System.out.println("mat=[");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length-1; j++)
                System.out.print(m[i][j] + ",\t");
            System.out.println(m[i][m[i].length-1] + ";");
        }
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(byte[][] m) {

        print_line_matrix_separator_begin();
        System.out.println("mat=[");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length-1; j++)
                System.out.print(m[i][j] + ",\t");
            System.out.println(m[i][m[i].length-1] + ";");
        }
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(int[][][] m) {
        print_line_matrix_separator_begin();
        for (int k = 0; k < m.length; k++) {
            System.out.println("mat(:,:," + (k+1) + ")=[");
            for (int i = 0; i < m[k].length; i++) {
                for (int j = 0; j < m[k][i].length-1; j++)
                    System.out.print(m[k][i][j] + ",\t");
                System.out.println(m[k][i][m[k][i].length-1] + ";");
            }
            System.out.println("];");
        }
        print_line_matrix_separator_end();
    }

    public static void print_array(float[][][] m) {
        print_line_matrix_separator_begin();
        for (int k = 0; k < m.length; k++) {
            System.out.println("mat(:,:," + (k+1) + ")=[");
            for (int i = 0; i < m[k].length; i++) {
                for (int j = 0; j < m[k][i].length-1; j++)
                    System.out.print(m[k][i][j] + ",\t");
                System.out.println(m[k][i][m[k][i].length-1] + ";");
            }
            System.out.println("];");
        }
        print_line_matrix_separator_end();
    }

    public static void print_array(double[][][] m) {
        print_line_matrix_separator_begin();
        for (int k = 0; k < m.length; k++) {
            System.out.println("mat(:,:," + (k+1) + ")=[");
            for (int i = 0; i < m[k].length; i++) {
                for (int j = 0; j < m[k][i].length-1; j++)
                    System.out.print(m[k][i][j] + ",\t");
                System.out.println(m[k][i][m[k][i].length-1] + ";");
            }
            System.out.println("];");
        }
        print_line_matrix_separator_end();
    }

    public static void print_array(byte[][][] m) {
        print_line_matrix_separator_begin();
        for (int k = 0; k < m.length; k++) {
            System.out.println("mat(:,:," + (k+1) + ")=[");
            for (int i = 0; i < m[k].length; i++) {
                for (int j = 0; j < m[k][i].length-1; j++)
                    System.out.print(m[k][i][j] + ",\t");
                System.out.println(m[k][i][m[k][i].length-1] + ";");
            }
            System.out.println("];");
        }
        print_line_matrix_separator_end();
    }

    public static void print_array(int[] m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.length-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m[i] + ",\t");
        }
        System.out.println(m[m.length-1]);
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(double[] m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.length-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m[i] + ",\t");
        }
        System.out.println(m[m.length-1]);
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(float[] m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.length-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m[i] + ",\t");
        }
        System.out.println(m[m.length-1]);
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(byte[] m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.length-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m[i] + ",\t");
        }
        System.out.println(m[m.length-1]);
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static <T> void print_array(T[] m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.length-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m[i] + ",\t");
        }
        System.out.println(m[m.length-1]);
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(List m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.size()-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m.get(i) + ",\t");
        }
        System.out.println(m.get(m.size()-1));
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static void print_array(String[] m)
    {
        print_line_matrix_separator_begin();
        System.out.println("vec=[");
        int cc = 0;
        for(int i=0; i<m.length-1; i++)
        {
            if((i+1)%10 == 0) System.out.println("...");
            System.out.print(m[i] + ",\t");
        }
        System.out.println(m[m.length-1]);
        System.out.println("];");
        print_line_matrix_separator_end();
    }

    public static int[] gen_rand_int_array(int nvals, int min_val, int max_val)
    {
        Random rand = new Random();
        int[] vals = new int[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = rand.nextInt(max_val + 1 - min_val) + min_val;
        return vals;
    }

    // produces continuous random numbers of type double between a given range
    public static double[] gen_rand_double_array(int nvals, double rangeMin, double rangeMax)
    {
        if(Double.valueOf(rangeMax-rangeMin).isInfinite())
            throw new IllegalArgumentException("rangeMax-rangeMin is infinite");
        Random rand = new Random();
        double[] vals = new double[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
        return vals;
    }

    // produces continuous random numbers of type float between a given range
    public static float[] gen_rand_float_array(int nvals, float rangeMin, float rangeMax)
    {
        if(Float.valueOf(rangeMax-rangeMin).isInfinite())
            throw new IllegalArgumentException("rangeMax-rangeMin is infinite");
        Random rand = new Random();
        float[] vals = new float[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = rangeMin + (rangeMax - rangeMin) * rand.nextFloat();
        return vals;
    }

    // produces (discrete) random integers (casted to double) between min_val and max_val
    public static double[] gen_rand_double_array(int nvals, int min_val, int max_val)
    {
        Random rand = new Random();
        double[] vals = new double[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = (double)rand.nextInt(max_val + 1 - min_val) + min_val;
        return vals;
    }

    // produces (discrete) random integers (casted to float) between min_val and max_val
    public static float[] gen_rand_float_array(int nvals, int min_val, int max_val)
    {
        Random rand = new Random();
        float[] vals = new float[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = (float)rand.nextInt(max_val + 1 - min_val) + min_val;
        return vals;
    }

    public static double[] gen_rand_gaussian_double_array(int nvals)
    {
        return gen_rand_gaussian_double_array(nvals, 0, 1);
    }

    public static double[] gen_rand_gaussian_double_array(int nvals, double mean, double std)
    {
        Random rand = new Random();
        double[] vals = new double[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = rand.nextGaussian() * std + mean;
        return vals;
    }

    public static float[] gen_rand_gaussian_float_array(int nvals)
    {
        return gen_rand_gaussian_float_array(nvals, 0, 1);
    }

    public static float[] gen_rand_gaussian_float_array(int nvals, double mean, double std)
    {
        Random rand = new Random();
        float[] vals = new float[nvals];
        for (int i = 0; i < nvals; i++)
            vals[i] = (float)(rand.nextGaussian() * std + mean);
        return vals;
    }

    public static double[] linspace_double(double min, double max, int npoints) {
        double[] d = new double[npoints];
        for (int i = 0; i < npoints; i++){
            d[i] = min + i * (max - min) / (npoints - 1);
        }
        return d;
    }

    public static float[] linspace_float(float min, float max, int npoints) {
        float[] d = new float[npoints];
        for (int i = 0; i < npoints; i++){
            d[i] = min + i * (max - min) / (npoints - 1);
        }
        return d;
    }

    public static double[] fill_ladder_double(int nvals, double start_val, double step)
    {
        double[] v = new double[nvals];
        for(int i=0; i<nvals; i++)
        {
            v[i] = start_val;
            start_val += step;
        }
        return v;
    }

    public static float[] fill_ladder_float(int nvals, float start_val, float step)
    {
        float[] v = new float[nvals];
        for(int i=0; i<nvals; i++)
        {
            v[i] = start_val;
            start_val += step;
        }
        return v;
    }

    public static int[] fill_ladder_int(int nvals, int start_val, int step)
    {
        int[] v = new int[nvals];
        for(int i=0; i<nvals; i++)
        {
            v[i] = start_val;
            start_val += step;
        }
        return v;
    }

    public static Integer[] fill_ladder_Integer(int nvals, int start_val, int step)
    {
        Integer[] v = new Integer[nvals];
        for(int i=0; i<nvals; i++)
        {
            v[i] = start_val;
            start_val += step;
        }
        return v;
    }

    public static int[] rowMajor_to_colMajor(int[] arr, int nrows, int ncols, int nchannels)
    {
        int[] arrOut = new int[arr.length];
        int c=0;
        for(int k=0; k<nchannels; k++)
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    arrOut[c++] = arr[i * nchannels * ncols + j * nchannels + k];
        return arrOut;
    }

    public static float[] rowMajor_to_colMajor(float[] arr, int nrows, int ncols, int nchannels)
    {
        float[] arrOut = new float[arr.length];
        int c=0;
        for(int k=0; k<nchannels; k++)
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    arrOut[c++] = arr[i * nchannels * ncols + j * nchannels + k];
        return arrOut;
    }

    public static double[] rowMajor_to_colMajor(double[] arr, int nrows, int ncols, int nchannels)
    {
        double[] arrOut = new double[arr.length];
        int c=0;
        for(int k=0; k<nchannels; k++)
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    arrOut[c++] = arr[i * nchannels * ncols + j * nchannels + k];
        return arrOut;
    }

    public static byte[] rowMajor_to_colMajor(byte[] arr, int nrows, int ncols, int nchannels)
    {
        byte[] arrOut = new byte[arr.length];
        int c=0;
        for(int k=0; k<nchannels; k++)
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    arrOut[c++] = arr[i * nchannels * ncols + j * nchannels + k];
        return arrOut;
    }

    public static int[] colMajor_to_rowMajor(int[] arr, int nrows, int ncols, int nchannels)
    {
        int[] arrOut = new int[arr.length];
        int c=0;
        final int nelem_slice = nrows * ncols;
        for(int i=0; i<nrows; i++)
            for(int j=0; j<ncols; j++)
                for(int k=0; k<nchannels; k++)
                    arrOut[c++] = arr[k * nelem_slice + j * nrows + i];
        return arrOut;
    }

    public static float[] colMajor_to_rowMajor(float[] arr, int nrows, int ncols, int nchannels)
    {
        float[] arrOut = new float[arr.length];
        int c=0;
        final int nelem_slice = nrows * ncols;
        for(int i=0; i<nrows; i++)
            for(int j=0; j<ncols; j++)
                for(int k=0; k<nchannels; k++)
                    arrOut[c++] = arr[k * nelem_slice + j * nrows + i];
        return arrOut;
    }

    public static double[] colMajor_to_rowMajor(double[] arr, int nrows, int ncols, int nchannels)
    {
        double[] arrOut = new double[arr.length];
        int c=0;
        final int nelem_slice = nrows * ncols;
        for(int i=0; i<nrows; i++)
            for(int j=0; j<ncols; j++)
                for(int k=0; k<nchannels; k++)
                    arrOut[c++] = arr[k * nelem_slice + j * nrows + i];
        return arrOut;
    }

    public static byte[] colMajor_to_rowMajor(byte[] arr, int nrows, int ncols, int nchannels)
    {
        byte[] arrOut = new byte[arr.length];
        int c=0;
        final int nelem_slice = nrows * ncols;
        for(int i=0; i<nrows; i++)
            for(int j=0; j<ncols; j++)
                for(int k=0; k<nchannels; k++)
                    arrOut[c++] = arr[k * nelem_slice + j * nrows + i];
        return arrOut;
    }

    public static int[] byteArray_to_intArray(byte[] arr)
    {
        int[] arrOut = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            arrOut[i] = arr[i] & 0xFF;
        return arrOut;
    }

    public static float[] byteArray_to_floatArray(byte[] arr)
    {
        float[] arrOut = new float[arr.length];
        for(int i=0; i<arr.length; i++)
            arrOut[i] = (float)(arr[i] & 0xFF);
        return arrOut;
    }

    public static double[] byteArray_to_doubleArray(byte[] arr)
    {
        double[] arrOut = new double[arr.length];
        for(int i=0; i<arr.length; i++)
            arrOut[i] = (double)(arr[i] & 0xFF);
        return arrOut;
    }

    public static float[] intArray_to_floatArray(int[] arr)
    {
        float[] arrOut = new float[arr.length];
        for(int i=0; i<arr.length; i++)
            arrOut[i] = (float)arr[i];
        return arrOut;
    }

    public static double[] intArray_to_doubleArray(int[] arr)
    {
        double[] arrOut = new double[arr.length];
        for(int i=0; i<arr.length; i++)
            arrOut[i] = (double)arr[i];
        return arrOut;
    }

    public static double[] floatArray_to_doubleArray(float[] arr)
    {
        double[] arrOut = new double[arr.length];
        for(int i=0; i<arr.length; i++)
            arrOut[i] = (double)arr[i];
        return arrOut;
    }

    public static int[][][] byteMatrix_to_intMatrix(byte[][][] arr)
    {
        int nch = arr.length;
        int nr = arr[0].length;
        int nc = arr[0][0].length;
        int[][][] matOut = new int[nch][nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                for(int k=0; k<nch; k++)
                    matOut[k][i][j] = arr[k][i][j] & 0xFF;
        return matOut;
    }

    public static int[][] byteMatrix_to_intMatrix(byte[][] arr)
    {
        int nr = arr.length;
        int nc = arr[0].length;
        int[][] matOut = new int[nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                matOut[i][j] = arr[i][j] & 0xFF;
        return matOut;
    }

    public static float[][][] byteMatrix_to_floatMatrix(byte[][][] arr)
    {
        int nch = arr.length;
        int nr = arr[0].length;
        int nc = arr[0][0].length;
        float[][][] matOut = new float[nch][nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                for(int k=0; k<nch; k++)
                    matOut[k][i][j] = (float)(arr[k][i][j] & 0xFF);
        return matOut;
    }

    public static float[][] byteMatrix_to_floatMatrix(byte[][] arr)
    {
        int nr = arr.length;
        int nc = arr[0].length;
        float[][] matOut = new float[nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                matOut[i][j] = (float)(arr[i][j] & 0xFF);
        return matOut;
    }

    public static double[][][] byteMatrix_to_doubleMatrix(byte[][][] arr)
    {
        int nch = arr.length;
        int nr = arr[0].length;
        int nc = arr[0][0].length;
        double[][][] matOut = new double[nch][nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                for(int k=0; k<nch; k++)
                    matOut[k][i][j] = (double)(arr[k][i][j] & 0xFF);
        return matOut;
    }

    public static double[][] byteMatrix_to_doubleMatrix(byte[][] arr)
    {
        int nr = arr.length;
        int nc = arr[0].length;
        double[][] matOut = new double[nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                matOut[i][j] = (double)(arr[i][j] & 0xFF);
        return matOut;
    }

    public static float[][][] intMatrix_to_floatMatrix(int[][][] arr)
    {
        int nch = arr.length;
        int nr = arr[0].length;
        int nc = arr[0][0].length;
        float[][][] matOut = new float[nch][nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                for(int k=0; k<nch; k++)
                    matOut[k][i][j] = (float)arr[k][i][j];
        return matOut;
    }

    public static float[][] intMatrix_to_floatMatrix(int[][] arr)
    {
        int nr = arr.length;
        int nc = arr[0].length;
        float[][] matOut = new float[nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                matOut[i][j] = (float)arr[i][j];
        return matOut;
    }

    public static double[][][] intMatrix_to_doubleMatrix(int[][][] arr)
    {
        int nch = arr.length;
        int nr = arr[0].length;
        int nc = arr[0][0].length;
        double[][][] matOut = new double[nch][nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                for(int k=0; k<nch; k++)
                    matOut[k][i][j] = (double)arr[k][i][j];
        return matOut;
    }

    public static double[][] intMatrix_to_doubleMatrix(int[][] arr)
    {
        int nr = arr.length;
        int nc = arr[0].length;
        double[][] matOut = new double[nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                matOut[i][j] = (double)arr[i][j];
        return matOut;
    }

    public static double[][][] floatMatrix_to_doubleMatrix(float[][][] arr)
    {
        int nch = arr.length;
        int nr = arr[0].length;
        int nc = arr[0][0].length;
        double[][][] matOut = new double[nch][nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                for(int k=0; k<nch; k++)
                    matOut[k][i][j] = (double)arr[k][i][j];
        return matOut;
    }

    public static double[][] floatMatrix_to_doubleMatrix(float[][] arr)
    {
        int nr = arr.length;
        int nc = arr[0].length;
        double[][] matOut = new double[nr][nc];
        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
                matOut[i][j] = (double)arr[i][j];
        return matOut;
    }

    public static BufferedImage imread(String img_path)
    {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(img_path));
        } catch (IOException e) {
            System.out.println("ERROR: Could not read image file at img_path.");
        }
        return img;
    }

//    // note: this method is not tested and thus not ready to use.
//    // also, according to certain sources, the "getScaledInstance" method
//    // used in this method is not recommended.
//    // better avoid this method
//    public static BufferedImage imresize(BufferedImage img, int nrows_new, int ncols_new)
//    {
//        //Image tmp = img.getScaledInstance(ncols_new, nrows_new, Image.SCALE_SMOOTH);
//        BufferedImage dimg = new BufferedImage(ncols_new, nrows_new, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = dimg.createGraphics();
//        g2d.drawImage(tmp, 0, 0, null);
//        g2d.dispose();
//        return dimg;
//    }

    // according to comments
    // "found this technique creates an image which isn't high-enough quality for my needs"
    // "The image quality is much worse than what you get with..."
    // "Will try some open-source libraries to see if they fare better."
    public static BufferedImage imresize(BufferedImage img, int nrows_new, int ncols_new, boolean interpolate_bicubic, boolean preserve_alpha)
    {
        int imageType = preserve_alpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
        BufferedImage img_new = new BufferedImage(ncols_new, nrows_new, imageType);
        Graphics2D g = img_new.createGraphics();
        if (preserve_alpha) {
            g.setComposite(AlphaComposite.Src);
        }
        if(interpolate_bicubic)
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        else
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(img, 0, 0, ncols_new, nrows_new, null);
        g.dispose();
        return img_new;
    }

    public static BufferedImage imresize(BufferedImage img, int nrows_new, int ncols_new, boolean interpolate_bicubic)
    {
        return imresize(img, nrows_new, ncols_new, interpolate_bicubic, false);
    }

    public static BufferedImage imresize(BufferedImage img, int nrows_new, int ncols_new)
    {
        return imresize(img, nrows_new, ncols_new, false, false);
    }

    public static BufferedImage convertToType(BufferedImage image, int type) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), type);
        Graphics2D graphics = newImage.createGraphics();
        graphics.drawImage(image, 0, 0, null);
        graphics.dispose();
        return newImage;
    }


    // the resulting byte[] is stored row major
    public static byte[] BufferedImage_to_byteArray(BufferedImage image) {

        int[] pp = new int[]{BufferedImage.TYPE_3BYTE_BGR,BufferedImage.TYPE_4BYTE_ABGR_PRE,
            BufferedImage.TYPE_4BYTE_ABGR, BufferedImage.TYPE_BYTE_BINARY,
            BufferedImage.TYPE_BYTE_GRAY, BufferedImage.TYPE_BYTE_INDEXED};
        if(!Arrays.asList(pp).contains(image.getType()))
            throw new IllegalArgumentException("Input BufferedImage is not of type byte");
        byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        return pixels;
    }

    // the resulting int[] is stored row major
    public static int[] BufferedImage_to_intArray(BufferedImage image) {
        int[] pp = new int[]{BufferedImage.TYPE_INT_ARGB, BufferedImage.TYPE_INT_ARGB_PRE,
        BufferedImage.TYPE_INT_BGR, BufferedImage.TYPE_INT_RGB};
        if(!Arrays.asList(pp).contains(image.getType()))
            throw new IllegalArgumentException("Input BufferedImage is not of type byte");
        int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
        return pixels;
    }

    // returns nrows, ncols, nchannels
    public static int[] get_BufferedImage_size(BufferedImage image)
    {
        int nrows = image.getHeight();
        int ncols = image.getWidth();
        boolean hasAlphaChannel = image.getAlphaRaster() != null;
        int nchannels = 3;
        if (hasAlphaChannel) nchannels++;
        return new int[]{nrows, ncols, nchannels};
    }

    // arr must be stored in row major order
    public static BufferedImage array_to_BufferedImage(byte[] arr, int nrows, int ncols, String img_type)
    {
        int type;
        switch(img_type)
        {
            case "gray":
                type = BufferedImage.TYPE_BYTE_GRAY;
                break;
            case "bgr":
                type = BufferedImage.TYPE_3BYTE_BGR;
                break;
            default:
                throw new IllegalArgumentException("ERROR: unknown img_type: must be \"gray\" or \"bgr\".");
        }

        BufferedImage img = new BufferedImage(ncols, nrows, type);
        byte[] targetPixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
        System.arraycopy(arr, 0, targetPixels, 0, arr.length);
        return img;
    }

    // arr must be stored in row major order
    public static BufferedImage array_to_BufferedImage(int[] arr, int nrows, int ncols, String img_type)
    {
        int type;
        switch(img_type)
        {
            case "rgb":
                type = BufferedImage.TYPE_INT_RGB;
                break;
            case "bgr":
                type = BufferedImage.TYPE_INT_BGR;
                break;
            case "argb":
                type = BufferedImage.TYPE_INT_ARGB;
                break;
            default:
                throw new IllegalArgumentException("ERROR: unknown img_type: must be \"gray\" or \"bgr\".");
        }

        BufferedImage img = new BufferedImage(ncols, nrows, type);
        int[] targetPixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
        System.arraycopy(arr, 0, targetPixels, 0, arr.length);
        return img;
    }

    // convert 1D array to 3D array. 1D array can be stored in either row or col major.
    // if row major, set row_major to true. Converts to a 3D matrix where the first
    // dimension is the channel, the second dimension is the row and the third dimension
    // is the column.
    public static int[][][] array_to_matrix(int[] data, int nrows, int ncols, int nchannels, boolean row_major )
    {
        if(nrows * ncols * nchannels != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols * nchannels != data.length");

        int[][][] aL = new int [nchannels][nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        aL[k][i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                int[][] arr_cur = aL[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        arr_cur[i][j] = data[c++];
            }
        }

        return aL;
    }

    // convert 1D array to 3D array. 1D array can be stored in either row or col major.
    // if row major, set row_major to true. Converts to a 3D matrix where the first
    // dimension is the channel, the second dimension is the row and the third dimension
    // is the column.
    public static float[][][] array_to_matrix(float[] data, int nrows, int ncols, int nchannels, boolean row_major )
    {
        if(nrows * ncols * nchannels != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols * nchannels != data.length");

        float[][][] aL = new float [nchannels][nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        aL[k][i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                float[][] arr_cur = aL[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        arr_cur[i][j] = data[c++];
            }
        }

        return aL;
    }

    // convert 1D array to 3D array. 1D array can be stored in either row or col major.
    // if row major, set row_major to true. Converts to a 3D matrix where the first
    // dimension is the channel, the second dimension is the row and the third dimension
    // is the column.
    public static double[][][] array_to_matrix(double[] data, int nrows, int ncols, int nchannels, boolean row_major )
    {
        if(nrows * ncols * nchannels != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols * nchannels != data.length");

        double[][][] aL = new double [nchannels][nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        aL[k][i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                double[][] arr_cur = aL[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        arr_cur[i][j] = data[c++];
            }
        }

        return aL;
    }

    // convert 1D array to 3D array. 1D array can be stored in either row or col major.
    // if row major, set row_major to true. Converts to a 3D matrix where the first
    // dimension is the channel, the second dimension is the row and the third dimension
    // is the column.
    public static byte[][][] array_to_matrix(byte[] data, int nrows, int ncols, int nchannels, boolean row_major )
    {
        if(nrows * ncols * nchannels != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols * nchannels != data.length");

        byte[][][] aL = new byte [nchannels][nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        aL[k][i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                byte[][] arr_cur = aL[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        arr_cur[i][j] = data[c++];
            }
        }

        return aL;
    }

    // convert 1D array to 2D array. 1D array can be stored in either row or col major.
    // if row major is set to true, converts to a 2D matrix where the first
    // dimension is the row and the 2nd dimension is the column.
    public static int[][] array_to_matrix(int[] data, int nrows, int ncols, boolean row_major )
    {
        if(nrows * ncols != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols != data.length");

        int[][] aL = new int [nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    aL[i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    aL[i][j] = data[c++];
        }

        return aL;
    }

    // convert 1D array to 2D array. 1D array can be stored in either row or col major.
    // if row major is set to true, converts to a 2D matrix where the first
    // dimension is the row and the 2nd dimension is the column.
    public static float[][] array_to_matrix(float[] data, int nrows, int ncols, boolean row_major )
    {
        if(nrows * ncols != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols != data.length");

        float[][] aL = new float [nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    aL[i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    aL[i][j] = data[c++];
        }

        return aL;
    }

    // convert 1D array to 2D array. 1D array can be stored in either row or col major.
    // if row major is set to true, converts to a 2D matrix where the first
    // dimension is the row and the 2nd dimension is the column.
    public static double[][] array_to_matrix(double[] data, int nrows, int ncols, boolean row_major )
    {
        if(nrows * ncols != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols != data.length");

        double[][] aL = new double [nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    aL[i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    aL[i][j] = data[c++];
        }

        return aL;
    }


    // convert 1D array to 2D array. 1D array can be stored in either row or col major.
    // if row major is set to true, converts to a 2D matrix where the first
    // dimension is the row and the 2nd dimension is the column.
    public static byte[][] array_to_matrix(byte[] data, int nrows, int ncols, boolean row_major )
    {
        if(nrows * ncols != data.length)
            throw new IllegalArgumentException("ERROR: nrows * ncols != data.length");

        byte[][] aL = new byte [nrows][ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    aL[i][j] = data[c++];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    aL[i][j] = data[c++];
        }

        return aL;
    }


    // convert 3D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 3D matrix is NOT jagged.
    public static int[] matrix_to_array(int[][][] data, boolean row_major)
    {
        int nchannels = data.length;
        int nrows = data[0].length;
        int ncols = data[0][0].length;

        int[] dataOut = new int [nrows * ncols * nchannels];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        dataOut[c++] = data[k][i][j];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                int[][] arr_cur = data[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        dataOut[c++] = arr_cur[i][j];
            }
        }

        return dataOut;
    }

    // convert 3D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 3D matrix is NOT jagged.
    public static float[] matrix_to_array(float[][][] data, boolean row_major)
    {
        int nchannels = data.length;
        int nrows = data[0].length;
        int ncols = data[0][0].length;

        float[] dataOut = new float [nrows * ncols * nchannels];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        dataOut[c++] = data[k][i][j];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                float[][] arr_cur = data[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        dataOut[c++] = arr_cur[i][j];
            }
        }

        return dataOut;
    }

    // convert 3D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 3D matrix is NOT jagged.
    public static double[] matrix_to_array(double[][][] data, boolean row_major)
    {
        int nchannels = data.length;
        int nrows = data[0].length;
        int ncols = data[0][0].length;

        double[] dataOut = new double [nrows * ncols * nchannels];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        dataOut[c++] = data[k][i][j];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                double[][] arr_cur = data[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        dataOut[c++] = arr_cur[i][j];
            }
        }

        return dataOut;
    }

    // convert 3D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 3D matrix is NOT jagged.
    public static byte[] matrix_to_array(byte[][][] data, boolean row_major)
    {
        int nchannels = data.length;
        int nrows = data[0].length;
        int ncols = data[0][0].length;

        byte[] dataOut = new byte [nrows * ncols * nchannels];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    for(int k=0; k<nchannels; k++)
                        dataOut[c++] = data[k][i][j];
        }

        else // col major
        {
            int c = 0;
            for(int k=0; k<nchannels; k++)
            {
                byte[][] arr_cur = data[k];
                for(int j=0; j<ncols; j++)
                    for(int i=0; i<nrows; i++)
                        dataOut[c++] = arr_cur[i][j];
            }
        }

        return dataOut;
    }


    // convert 2D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 2D matrix is NOT jagged.
    public static int[] matrix_to_array(int[][] data, boolean row_major)
    {
        int nrows = data.length;
        int ncols = data[0].length;

        int[] dataOut = new int [nrows * ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    dataOut[c++] = data[i][j];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    dataOut[c++] = data[i][j];
        }

        return dataOut;
    }

    // convert 2D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 2D matrix is NOT jagged.
    public static float[] matrix_to_array(float[][] data, boolean row_major)
    {
        int nrows = data.length;
        int ncols = data[0].length;

        float[] dataOut = new float [nrows * ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    dataOut[c++] = data[i][j];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    dataOut[c++] = data[i][j];
        }

        return dataOut;
    }

    // convert 2D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 2D matrix is NOT jagged.
    public static double[] matrix_to_array(double[][] data, boolean row_major)
    {
        int nrows = data.length;
        int ncols = data[0].length;

        double[] dataOut = new double [nrows * ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    dataOut[c++] = data[i][j];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    dataOut[c++] = data[i][j];
        }

        return dataOut;
    }

    // convert 2D matrix to 1D array. 1D array can be requested to be stored in
    // either row or col major.
    // assume that 2D matrix is NOT jagged.
    public static byte[] matrix_to_array(byte[][] data, boolean row_major)
    {
        int nrows = data.length;
        int ncols = data[0].length;

        byte[] dataOut = new byte [nrows * ncols];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nrows; i++)
                for(int j=0; j<ncols; j++)
                    dataOut[c++] = data[i][j];
        }

        else // col major
        {
            int c = 0;
            for(int j=0; j<ncols; j++)
                for(int i=0; i<nrows; i++)
                    dataOut[c++] = data[i][j];
        }

        return dataOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static int[][][] extract_submat(int[][][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();
        int[][][] matOut = new int[nch][nr][nc];
        int[] p = new int[3];

        for(int k=0; k<nch; k++)
        {
            int[][] temp_out = matOut[k];
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                {
                    h.to_orig_space(i, j, k, p);
                    temp_out[i][j] = m[p[2]][p[0]][p[1]];
                }

        }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static float[][][] extract_submat(float[][][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();
        float[][][] matOut = new float[nch][nr][nc];
        int[] p = new int[3];

        for(int k=0; k<nch; k++)
        {
            float[][] temp_out = matOut[k];
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                {
                    h.to_orig_space(i, j, k, p);
                    temp_out[i][j] = m[p[2]][p[0]][p[1]];
                }

        }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static double[][][] extract_submat(double[][][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();
        double[][][] matOut = new double[nch][nr][nc];
        int[] p = new int[3];

        for(int k=0; k<nch; k++)
        {
            double[][] temp_out = matOut[k];
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                {
                    h.to_orig_space(i, j, k, p);
                    temp_out[i][j] = m[p[2]][p[0]][p[1]];
                }
        }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static byte[][][] extract_submat(byte[][][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();
        byte[][][] matOut = new byte[nch][nr][nc];
        int[] p = new int[3];

        for(int k=0; k<nch; k++)
        {
            byte[][] temp_out = matOut[k];
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                {
                    h.to_orig_space(i, j, k, p);
                    temp_out[i][j] = m[p[2]][p[0]][p[1]];
                }
        }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static int[][] extract_submat(int[][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        if(nch != 1)
            throw new IllegalArgumentException("MatrixHeader h: nch != 1");

        int[][] matOut = new int[nr][nc];
        int[] p = new int[3];

        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
            {
                h.to_orig_space(i, j, 0, p);
                matOut[i][j] = m[p[0]][p[1]];
            }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static float[][] extract_submat(float[][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        if(nch != 1)
            throw new IllegalArgumentException("MatrixHeader h: nch != 1");

        float[][] matOut = new float[nr][nc];
        int[] p = new int[3];

        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
            {
                h.to_orig_space(i, j, 0, p);
                matOut[i][j] = m[p[0]][p[1]];
            }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static double[][] extract_submat(double[][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        if(nch != 1)
            throw new IllegalArgumentException("MatrixHeader h: nch != 1");

        double[][] matOut = new double[nr][nc];
        int[] p = new int[3];

        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
            {
                h.to_orig_space(i, j, 0, p);
                matOut[i][j] = m[p[0]][p[1]];
            }

        return matOut;
    }

    // extract a submatrix of a given matrix
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static byte[][] extract_submat(byte[][] m, MatrixHeader h)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        if(nch != 1)
            throw new IllegalArgumentException("MatrixHeader h: nch != 1");

        byte[][] matOut = new byte[nr][nc];
        int[] p = new int[3];

        for(int i=0; i<nr; i++)
            for(int j=0; j<nc; j++)
            {
                h.to_orig_space(i, j, 0, p);
                matOut[i][j] = m[p[0]][p[1]];
            }

        return matOut;
    }


    // extract a submatrix of a given matrix (stored in a linear array)
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static int[] extract_submat(int[] m, MatrixHeader h, boolean row_major)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        int nr_orig = h.nrows_orig();
        int nc_orig = h.ncols_orig();
        int nch_orig = h.nchannels_orig();

        int[] matOut = new int[nr * nc * nch];
        int[] p = new int[3];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                    for(int k=0; k<nch; k++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[0] * nch_orig * nc_orig + p[1] * nch_orig + p[2]];
                    }

        }
        else
        {
            int c = 0;
            for(int k=0; k<nch; k++)
                for(int j=0; j<nc; j++)
                    for(int i=0; i<nr; i++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[2] * nr_orig * nc_orig + p[1] * nr_orig + p[0]];
                    }

        }

        return matOut;
    }

    // extract a submatrix of a given matrix (stored in a linear array)
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static byte[] extract_submat(byte[] m, MatrixHeader h, boolean row_major)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        int nr_orig = h.nrows_orig();
        int nc_orig = h.ncols_orig();
        int nch_orig = h.nchannels_orig();

        byte[] matOut = new byte[nr * nc * nch];
        int[] p = new int[3];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                    for(int k=0; k<nch; k++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[0] * nch_orig * nc_orig + p[1] * nch_orig + p[2]];
                    }

        }
        else
        {
            int c = 0;
            for(int k=0; k<nch; k++)
                for(int j=0; j<nc; j++)
                    for(int i=0; i<nr; i++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[2] * nr_orig * nc_orig + p[1] * nr_orig + p[0]];
                    }

        }

        return matOut;
    }

    // extract a submatrix of a given matrix (stored in a linear array)
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static float[] extract_submat(float[] m, MatrixHeader h, boolean row_major)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        int nr_orig = h.nrows_orig();
        int nc_orig = h.ncols_orig();
        int nch_orig = h.nchannels_orig();

        float[] matOut = new float[nr * nc * nch];

        int[] p = new int[3];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                    for(int k=0; k<nch; k++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[0] * nch_orig * nc_orig + p[1] * nch_orig + p[2]];
                    }

        }
        else
        {
            int c = 0;
            for(int k=0; k<nch; k++)
                for(int j=0; j<nc; j++)
                    for(int i=0; i<nr; i++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[2] * nr_orig * nc_orig + p[1] * nr_orig + p[0]];
                    }

        }

        return matOut;
    }

    // extract a submatrix of a given matrix (stored in a linear array)
    // this obviously makes and return a deep copy
    // if I just want to slice without making any copy of the data
    // I can just do use the MatrixHeader object and call methods on it.
    public static double[] extract_submat(double[] m, MatrixHeader h, boolean row_major)
    {
        int nr = h.nrows();
        int nc=  h.ncols();
        int nch = h.nchannels();

        int nr_orig = h.nrows_orig();
        int nc_orig = h.ncols_orig();
        int nch_orig = h.nchannels_orig();

        double[] matOut = new double[nr * nc * nch];
        int[] p = new int[3];

        if(row_major)
        {
            int c = 0;
            for(int i=0; i<nr; i++)
                for(int j=0; j<nc; j++)
                    for(int k=0; k<nch; k++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[0] * nch_orig * nc_orig + p[1] * nch_orig + p[2]];
                    }

        }
        else
        {
            int c = 0;
            for(int k=0; k<nch; k++)
                for(int j=0; j<nc; j++)
                    for(int i=0; i<nr; i++)
                    {
                        h.to_orig_space(i, j, k, p);
                        matOut[c++] = m[p[2] * nr_orig * nc_orig + p[1] * nr_orig + p[0]];
                    }

        }

        return matOut;
    }

    /**
     * Find indices in an array that satisfies a condition
     * @param v
     * @param f
     * @return
     */
    public static int[] find_indices(int[] v, functor_boolean_int f)
    {
        List<Integer> a = new ArrayList<Integer>(v.length);
        for(int i=0; i<v.length; i++)
        {
            if(f.apply(v[i]))
                a.add(i);
        }

        int[] indices = new int[a.size()];
        for(int i=0; i<indices.length; i++)
            indices[i] = a.get(i);

        return indices;
    }

    public static int[] find_indices(float[] v, functor_boolean_float f)
    {
        List<Integer> a = new ArrayList<Integer>(v.length);
        for(int i=0; i<v.length; i++)
        {
            if(f.apply(v[i]))
                a.add(i);
        }

        int[] indices = new int[a.size()];
        for(int i=0; i<indices.length; i++)
            indices[i] = a.get(i);

        return indices;
    }

    public static int[] find_indices(double[] v, functor_boolean_double f)
    {
        List<Integer> a = new ArrayList<Integer>(v.length);
        for(int i=0; i<v.length; i++)
        {
            if(f.apply(v[i]))
                a.add(i);
        }

        int[] indices = new int[a.size()];
        for(int i=0; i<indices.length; i++)
            indices[i] = a.get(i);

        return indices;
    }

    public static <T> int[] find_indices(T[] v, functor_boolean_T f)
    {
        List<Integer> a = new ArrayList<Integer>(v.length);
        for(int i=0; i<v.length; i++)
        {
            if(f.apply(v[i]))
                a.add(i);
        }

        int[] indices = new int[a.size()];
        for(int i=0; i<indices.length; i++)
            indices[i] = a.get(i);

        return indices;
    }

    public static <T> int[] find_indices(List<T> v, functor_boolean_T f)
    {
        List<Integer> a = new ArrayList<Integer>(v.size());
        for(int i=0; i<v.size(); i++)
        {
            if(f.apply(v.get(i)))
                a.add(i);
        }

        int[] indices = new int[a.size()];
        for(int i=0; i<indices.length; i++)
            indices[i] = a.get(i);

        return indices;
    }


    public static int[] multiply(int[] m, int val)
    {
        int[] mOut = new int[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] * val;
        return mOut;
    }

    public static double[] multiply(double[] m, double val)
    {
        double[] mOut = new double[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] * val;
        return mOut;
    }

    public static float[] multiply(float[] m, float val)
    {
        float[] mOut = new float[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] * val;
        return mOut;
    }

    public static int[] divide(int[] m, int val)
    {
        int[] mOut = new int[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] / val;
        return mOut;
    }

    public static double[] divide(double[] m, double val)
    {
        double[] mOut = new double[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] / val;
        return mOut;
    }

    public static float[] divide(float[] m, float val)
    {
        float[] mOut = new float[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] / val;
        return mOut;
    }


    public static int[] plus(int[] m, int val)
    {
        int[] mOut = new int[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] + val;
        return mOut;
    }

    public static double[] plus(double[] m, double val)
    {
        double[] mOut = new double[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] + val;
        return mOut;
    }

    public static float[] plus(float[] m, float val)
    {
        float[] mOut = new float[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] + val;
        return mOut;
    }


    public static int[] minus(int[] m, int val)
    {
        int[] mOut = new int[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] - val;
        return mOut;
    }

    public static double[] minus(double[] m, double val)
    {
        double[] mOut = new double[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] - val;
        return mOut;
    }

    public static float[] minus(float[] m, float val)
    {
        float[] mOut = new float[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = m[i] - val;
        return mOut;
    }

    public static int[] power(int[] m, int val)
    {
        int[] mOut = new int[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = (int)Math.pow((double)m[i], (double)val);
        return mOut;
    }

    public static double[] power(double[] m, double val)
    {
        double[] mOut = new double[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = Math.pow(m[i], val);
        return mOut;
    }

    public static float[] power(float[] m, float val)
    {
        float[] mOut = new float[m.length];
        for(int i=0; i<m.length; i++)
            mOut[i] = (float)Math.pow((float)m[i], (float)val);
        return mOut;
    }

    public static int[] multiply(int[] m1, int[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        int[] mOut = new int[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] * m2[i];
        return mOut;
    }

    public static double[] multiply(double[] m1, double[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        double[] mOut = new double[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] * m2[i];
        return mOut;
    }

    public static float[] multiply(float[] m1, float[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        float[] mOut = new float[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] * m2[i];
        return mOut;
    }

    public static int[] divide(int[] m1, int[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        int[] mOut = new int[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] / m2[i];
        return mOut;
    }

    public static double[] divide(double[] m1, double[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        double[] mOut = new double[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] / m2[i];
        return mOut;
    }

    public static float[] divide(float[] m1, float[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        float[] mOut = new float[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] / m2[i];
        return mOut;
    }

    public static int[] plus(int[] m1, int[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        int[] mOut = new int[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] + m2[i];
        return mOut;
    }

    public static double[] plus(double[] m1, double[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        double[] mOut = new double[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] + m2[i];
        return mOut;
    }

    public static float[] plus(float[] m1, float[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        float[] mOut = new float[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] + m2[i];
        return mOut;
    }


    public static int[] minus(int[] m1, int[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        int[] mOut = new int[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] - m2[i];
        return mOut;
    }

    public static double[] minus(double[] m1, double[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        double[] mOut = new double[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] - m2[i];
        return mOut;
    }

    public static float[] minus(float[] m1, float[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        float[] mOut = new float[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = m1[i] - m2[i];
        return mOut;
    }

    public static int[] power(int[] m1, int[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        int[] mOut = new int[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = (int)Math.pow((double)m1[i], (double)m2[i]);
        return mOut;
    }

    public static double[] power(double[] m1, double[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        double[] mOut = new double[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = Math.pow(m1[i], m2[i]);
        return mOut;
    }

    public static float[] power(float[] m1, float[] m2)
    {
        if(m1.length != m2.length)
            throw new IllegalArgumentException("m1.length != m2.length");
        float[] mOut = new float[m1.length];
        for(int i=0; i<m1.length; i++)
            mOut[i] = (float)Math.pow((float)m1[i], (float)m2[i]);
        return mOut;
    }

    public static void multiply_inplace(int[] m, int val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] * val;
    }

    public static void multiply_inplace(double[] m, double val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] * val;
    }

    public static void multiply_inplace(float[] m, float val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] * val;
    }

    public static void divide_inplace(int[] m, int val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] / val;
    }

    public static void divide_inplace(double[] m, double val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] / val;
    }

    public static void divide_inplace(float[] m, float val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] / val;
    }

    public static void add_inplace(int[] m, int val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] + val;
    }

    public static void add_inplace(double[] m, double val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] + val;
    }

    public static void add_inplace(float[] m, float val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] + val;
    }

    public static void minus_inplace(int[] m, int val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] - val;
    }

    public static void minus_inplace(double[] m, double val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] - val;
    }

    public static void minus_inplace(float[] m, float val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = m[i] - val;
    }

    public static void power_inplace(int[] m, int val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = (int)Math.pow((double)m[i], (double)val);
    }

    public static void power_inplace(double[] m, double val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = Math.pow(m[i], val);
    }

    public static void power_inplace(float[] m, float val)
    {
        for(int i=0; i<m.length; i++)
            m[i] = (float)Math.pow((float)m[i], (float)val);
    }

    public static <T> List<T> apply_opt_list_list(List<T> m1, List<T> m2, functor_T_T_T f)
    {
        if(m1.size() != m2.size())
            throw new IllegalArgumentException("m1.size() != m2.size()");

        List<T>mOut = new ArrayList<T>(m1.size());
        for(int i=0; i< m1.size(); i++)
            mOut.add(i, (T)f.apply(m1.get(i), m2.get(i)));
        return mOut;
    }

    public static <T> List<T> apply_opt_list_scalar(List<T> m, T val, functor_T_T_T f)
    {
        List<T>mOut = new ArrayList<T>(m.size());
        for(int i=0; i<m.size(); i++)
            mOut.add(i, (T)f.apply(m.get(i), val));
        return mOut;
    }

    public static <T> List<T> apply_opt_list(List<T> m, functor_T_T f)
    {
        List<T>mOut = new ArrayList<T>(m.size());
        for(int i=0; i<m.size(); i++)
            mOut.add(i, (T)f.apply(m.get(i)));
        return mOut;
    }

    public static <T> void apply_opt_array_inplace(T[] m, functor_T_T f)
    {
        for(int i=0; i<m.length; i++)
            m[i] = (T)f.apply(m[i]);
    }

    public static <T> void apply_opt_list_inplace(List<T> m, functor_T_T f)
    {
        for(int i=0; i<m.size(); i++)
            m.set(i, (T)f.apply(m.get(i)));
    }

    // get sorted indices given Double array
    public static Integer[] get_sorted_indices(Double[] vals, boolean sort_ascend)
    {
        Integer[] indices = fill_ladder_Integer(vals.length, 0, 1);
        if(sort_ascend)
        {
            Arrays.sort(indices, (ee,ff)->
                    {
                        if((double)vals[(int)ee] > (double)vals[(int)ff]) return 1;
                        else if((double)vals[(int)ee] == (double)vals[(int)ff]) return 0;
                        else return -1;
                    }
            );
        }
        else // descend
        {
            Arrays.sort(indices, (ee,ff)->
                    {
                        if((double)vals[(int)ee] < (double)vals[(int)ff]) return 1;
                        else if((double)vals[(int)ee] == (double)vals[(int)ff]) return 0;
                        else return -1;
                    }
            );
        }
        return indices;
    }

    public static void sort(double[] vals, boolean sort_ascend, double[] vals_sorted, int[] indices_sorted)
    {
        int N = vals.length;
        if(vals_sorted.length!=N || indices_sorted.length != N)
            throw new IllegalArgumentException("ERROR: make sure vals_sorted and indices sorted arrays have same length as vals");

        // convert to Double[]
        Double[] vals_D = new Double[N];
        for(int ii=0; ii < N; ii++)
            vals_D[ii] = vals[ii];

        // get sorted indices
        Integer[] indices_sorted_IA = get_sorted_indices(vals_D, sort_ascend);

        // put results in output
        for(int ii=0; ii < N; ii++)
        {
            vals_sorted[ii] = vals[(int)indices_sorted_IA[ii]];
            indices_sorted[ii] = (int)indices_sorted_IA[ii];
        }
    }

    public static void sort(float[] vals, boolean sort_ascend, float[] vals_sorted, int[] indices_sorted)
    {
        int N = vals.length;
        if(vals_sorted.length!=N || indices_sorted.length != N)
            throw new IllegalArgumentException("ERROR: make sure vals_sorted and indices sorted arrays have same length as vals");

        // convert to Double[]
        Double[] vals_D = new Double[N];
        for(int ii=0; ii < N; ii++)
            vals_D[ii] = (double)vals[ii];

        // get sorted indices
        Integer[] indices_sorted_IA = get_sorted_indices(vals_D, sort_ascend);

        // put results in output
        for(int ii=0; ii < N; ii++)
        {
            vals_sorted[ii] = vals[(int)indices_sorted_IA[ii]];
            indices_sorted[ii] = (int)indices_sorted_IA[ii];
        }
    }

    public static void sort(int[] vals, boolean sort_ascend, int[] vals_sorted, int[] indices_sorted)
    {
        int N = vals.length;
        if(vals_sorted.length!=N || indices_sorted.length != N)
            throw new IllegalArgumentException("ERROR: make sure vals_sorted and indices sorted arrays have same length as vals");

        // convert to Double[]
        Double[] vals_D = new Double[N];
        for(int ii=0; ii < N; ii++)
            vals_D[ii] = (double)vals[ii];

        // get sorted indices
        Integer[] indices_sorted_IA = get_sorted_indices(vals_D, sort_ascend);

        // put results in output
        for(int ii=0; ii < N; ii++)
        {
            vals_sorted[ii] = vals[(int)indices_sorted_IA[ii]];
            indices_sorted[ii] = (int)indices_sorted_IA[ii];
        }
    }

    public static double mean(double[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public static float mean(float[] m) {
        float sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public static double mean(int[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public static double median(double[] m)
    {
        int N = m.length;
        double[] m_sorted = new double[N];
        int[] indices_sorted = new int[N];
        sort(m, true, m_sorted, indices_sorted);

        int middle = N/2;
        if (N%2 == 1) {
            return m_sorted[middle];
        } else {
            return (m_sorted[middle-1] + m_sorted[middle]) / 2.0;
        }
    }

    public static float median(float[] m)
    {
        int N = m.length;
        float[] m_sorted = new float[N];
        int[] indices_sorted = new int[N];
        sort(m, true, m_sorted, indices_sorted);

        int middle = N/2;
        if (N%2 == 1) {
            return m_sorted[middle];
        } else {
            return (m_sorted[middle-1] + m_sorted[middle]) / 2.0f;
        }
    }

    public static double median(int[] m)
    {
        int N = m.length;
        int[] m_sorted = new int[N];
        int[] indices_sorted = new int[N];
        sort(m, true, m_sorted, indices_sorted);

        int middle = N/2;
        if (N%2 == 1) {
            return m_sorted[middle];
        } else {
            return (m_sorted[middle-1] + m_sorted[middle]) / 2.0;
        }
    }

    public static int mode(int a[]) {
        int maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public static float mode(float a[]) {
        float maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public static double mode(double a[]) {
       double maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    // binary search upper bound
    public static int bs_upper_bound(int a[], int n, int x) {
        int l = 0;
        int h = n; // Not n - 1
        while (l < h) {
            int mid = (l + h) / 2;
            if (x >= a[mid]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public static int bs_upper_bound(int a[], int x)
    {
        return bs_upper_bound(a, a.length, x);
    }


    // binary search lower bound
    public static int bs_lower_bound(int a[], int n, int x) {
        int l = 0;
        int h = n; // Not n - 1
        while (l < h) {
            int mid = (l + h) / 2;
            if (x <= a[mid]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static int bs_lower_bound(int a[], int x)
    {
        return bs_lower_bound(a, a.length, x);
    }

    // binary search upper bound
    public static int bs_upper_bound(double a[], int n, double x) {
        int l = 0;
        int h = n; // Not n - 1
        while (l < h) {
            int mid = (l + h) / 2;
            if (x >= a[mid]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public static int bs_upper_bound(double a[], double x)
    {
        return bs_upper_bound(a, a.length, x);
    }

    // binary search lower bound
    public static int bs_lower_bound(double a[], int n, double x) {
        int l = 0;
        int h = n; // Not n - 1
        while (l < h) {
            int mid = (l + h) / 2;
            if (x <= a[mid]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static int bs_lower_bound(double a[], double x)
    {
        return bs_lower_bound(a, a.length, x);
    }

    // binary search upper bound
    public static int bs_upper_bound(float a[], int n, float x) {
        int l = 0;
        int h = n; // Not n - 1
        while (l < h) {
            int mid = (l + h) / 2;
            if (x >= a[mid]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public static int bs_upper_bound(float a[], float x)
    {
        return bs_upper_bound(a, a.length, x);
    }

    // binary search lower bound
    public static int bs_lower_bound(float a[], int n, float x) {
        int l = 0;
        int h = n; // Not n - 1
        while (l < h) {
            int mid = (l + h) / 2;
            if (x <= a[mid]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static int bs_lower_bound(float a[], float x)
    {
        return bs_lower_bound(a, a.length, x);
    }

    // check if the array is sorted in ascending order
    public static boolean is_sorted_ascend(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    // check if the array is sorted in descending order
    public static boolean is_sorted_descend(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    // check if the array is sorted in ascending order
    public static boolean is_sorted_ascend(float[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    // check if the array is sorted in descending order
    public static boolean is_sorted_descend(float[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    // check if the array is sorted in ascending order
    public static boolean is_sorted_ascend(double[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    // check if the array is sorted in descending order
    public static boolean is_sorted_descend(double[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    public static int[] list_to_intArray(List<Integer> vals)
    {
        int[] ret = new int[vals.size()];
        Iterator<Integer> iterator = vals.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }

    public static double[] list_to_doubleArray(List<Double> vals)
    {
        double[] ret = new double[vals.size()];
        Iterator<Double> iterator = vals.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().doubleValue();
        }
        return ret;
    }

    public static float[] list_to_floatArray(List<Float> vals)
    {
        float[] ret = new float[vals.size()];
        Iterator<Float> iterator = vals.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().floatValue();
        }
        return ret;
    }

    // will output an array that is the same as a minus any elements
    // that are in b
    public static int[] set_diff(int[] a, int[] b)
    {
        List<Integer> res = new ArrayList<>(a.length);

        int cur_val;
        boolean is_in_b;
        for(int i=0; i<a.length; i++)
        {
            cur_val = a[i];
            is_in_b = false;
            for(int j=0; j<b.length; j++)
            {
                if(cur_val == b[j])
                {
                    is_in_b = true;
                    break;
                }
            }

            if(!is_in_b)
                res.add(cur_val);
        }

        return list_to_intArray(res);
    }

    public static void serialize_save(String fpath, Object obj)
    {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(fpath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
        }catch(IOException i) {
            i.printStackTrace();
        }
    }

    public static Object serialize_load(String fpath)
    {
        Object obj;
        try {
            FileInputStream fileIn = new FileInputStream(fpath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = in.readObject();
            in.close();
            fileIn.close();
            return obj;
        }catch(IOException i) {
            i.printStackTrace();
            throw new IllegalArgumentException("file_path cannot be read");
        }catch(ClassNotFoundException c) {
            c.printStackTrace();
            throw new IllegalArgumentException("file_path cannot be read");
        }
    }

    public static class Result_fnames
    {
        public String[] fnames;
        public String[] fnames_fullpath;
        public int nfiles;
    }

    public static Result_fnames dir_imgnames(String dir_imgs)
    {
        Result_fnames res = new Result_fnames();
        File fileObj;
        fileObj = new File(dir_imgs);
        res.fnames = fileObj.list((aa,bb)->{
            return bb.endsWith(".png") || bb.endsWith(".jpg") || bb.endsWith("jpeg") ||
                    bb.endsWith(".tiff") || bb.endsWith("tif");
        });
        res.nfiles = res.fnames.length;
        res.fnames_fullpath = new String[res.nfiles];
        for(int i=0; i<res.nfiles; i++)
            res.fnames_fullpath[i] = dir_imgs + res.fnames[i];
        return res;
    }

    public static Result_fnames dir_fnames(String dir_files, String ext_with_period)
    {
        Result_fnames res = new Result_fnames();
        File fileObj;
        fileObj = new File(dir_files);
        res.fnames = fileObj.list((aa,bb)->{
            return bb.endsWith(ext_with_period);
        });
        res.nfiles = res.fnames.length;
        res.fnames_fullpath = new String[res.nfiles];
        for(int i=0; i<res.nfiles; i++)
            res.fnames_fullpath[i] = dir_files + res.fnames[i];
        return res;
    }

    // delete all files inside a given directory
    // note: this does not delete any non-empty subdirectories
    public static void delete_files_in_dir(String dir_given)
    {
        for(File file: new File(dir_given).listFiles())
            file.delete();
    }

    // recursively delete all files/folders inside a given directory
    public static void delete_all_in_dir(String dir_given)
    {
        for(File file: new File(dir_given).listFiles())
        {
            if(file.isDirectory()) delete_all_in_dir(file.getPath());
            file.delete();
        }
    }


    // convert i,j,k 3D position in a matrix to linear index stored in col major format
    public static int matPos_to_linearIndex_colMajor(int nr, int nc, int nch, int i, int j, int k) {
        return k * nr * nc + j * nr + i;
    }

    // convert i,j,k 3D position in a matrix to linear index stored in row major format
    public static int matPos_to_linearIndex_rowMajor(int nr, int nc, int nch, int i, int j, int k) {
        return i * nch * nc + j * nch + k;
    }

    // convert a linear index stored in col major format to i,j,k 3D position in a matrix
    public static void linearIndex_to_matPos_colMajor(int nr, int nc, int nch, int idx, int[] pos) {
        int k= (int)Math.floor((float)idx / (nr * nc));
        int j = (int)Math.floor((float)(idx % (nr * nc)) / nr);
        int i =(int)Math.floor(idx % nr);
        pos[0] = i;
        pos[1] = j;
        pos[2] = k;
    }

    // convert a linear index stored in row major format to i,j,k 3D position in a matrix
    public static void linearIndex_to_matPos_rowMajor(int nr, int nc, int nch, int idx, int[] pos) {
        int i= (int)Math.floor((float)idx / (nch * nc));
        int j = (int)Math.floor((float)(idx % (nch * nc)) / nch);
        int k =(int)Math.floor(idx % nch);
        pos[0] = i;
        pos[1] = j;
        pos[2] = k;
    }

}
