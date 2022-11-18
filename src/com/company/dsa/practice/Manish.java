package com.company.dsa.practice;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
 class StdIn {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    public StdIn() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    public StdIn(InputStream in) {
        try{
            din = new DataInputStream(in);
        } catch(Exception e) {
            throw new RuntimeException();
        }
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    public String next() {
        int c;
        while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
        StringBuilder s = new StringBuilder();
        while (c != -1)
        {
            if (c == ' ' || c == '\n'||c=='\r')
                break;
            s.append((char)c);
            c=read();
        }
        return s.toString();
    }
    public String nextLine() {
        int c;
        while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
        StringBuilder s = new StringBuilder();
        while (c != -1)
        {
            if (c == '\n'||c=='\r')
                break;
            s.append((char)c);
            c = read();
        }
        return s.toString();
    }
    public int nextInt() {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
            ret = ret * 10 + c - '0';
        while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }
    public int[] readIntArray(int n, int os) {
        int[] ar = new int[n];
        for(int i=0; i<n; ++i)
            ar[i]=nextInt()+os;
        return ar;
    }
    public long nextLong() {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
            ret = ret * 10 + c - '0';
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
    public long[] readLongArray(int n, long os) {
        long[] ar = new long[n];
        for(int i=0; i<n; ++i)
            ar[i]=nextLong()+os;
        return ar;
    }
    public double nextDouble() {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
            ret = ret * 10 + c - '0';
        while ((c = read()) >= '0' && c <= '9');
        if (c == '.')
            while ((c = read()) >= '0' && c <= '9')
                ret += (c - '0') / (div *= 10);
        if (neg)
            return -ret;
        return ret;
    }
    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }
    private byte read() {
        try{
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        } catch(IOException e) {
            throw new RuntimeException();
        }
    }
    public void close() throws IOException {
        if (din == null)
            return;
        din.close();
    }
}
public class Manish {
    public static long solve(int ntrees, long[][] trees, int nwells, long[][] wells) {
        long result = 0;
        for (int i = 0; i < nwells; i++) {
            long xwell = wells[i][0];
            long ywell = wells[i][1];
            long p = 0;
            for (int j = 0; j < ntrees; j++) {
                long xtree = trees[j][0];
                long ytree = trees[j][1];
                double a = Math.pow((xwell - xtree), 2);
                double b = Math.pow((ywell - ytree), 2);
                p += a;
                p += b;
            }
            result += p;
        }
        return result % 1000000007;
    }
    static  final StdIn in  =new StdIn();
    public static void main(String[] args) throws IOException {
        int t = in.nextInt();
        int k = 1;
        while(t-- > 0){
            int ntrees = in.nextInt();
            long[][] tree = new long[ntrees][2];
            for(int i=0;i<ntrees;i++){
                long[] treeCordinates = in.readLongArray(2,0);
                tree[i][0] = treeCordinates[0];
                tree[i][1] = treeCordinates[1];
            }
            //System.out.println(Arrays.deepToString(tree));
            int nWells = in.nextInt();
            long[][] well = new long[nWells][2];
            for(int i=0;i<nWells;i++){
                long[] wellCordinates = in.readLongArray(2,0);
                well[i][0] = wellCordinates[0];
                well[i][1] = wellCordinates[1];
            }
            System.out.print("Case #" + k + ": " +solve(ntrees,tree,nWells,well) +  "\n");
            //System.out.println(Arrays.deepToString(well));
            k++;
        }
    }
    static class StdIn {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        public StdIn() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public StdIn(InputStream in) {
            try{
                din = new DataInputStream(in);
            } catch(Exception e) {
                throw new RuntimeException();
            }
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public String next() {
            int c;
            while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
            StringBuilder s = new StringBuilder();
            while (c != -1)
            {
                if (c == ' ' || c == '\n'||c=='\r')
                    break;
                s.append((char)c);
                c=read();
            }
            return s.toString();
        }
        public String nextLine() {
            int c;
            while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
            StringBuilder s = new StringBuilder();
            while (c != -1)
            {
                if (c == '\n'||c=='\r')
                    break;
                s.append((char)c);
                c = read();
            }
            return s.toString();
        }
        public int nextInt() {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
                ret = ret * 10 + c - '0';
            while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }
        public int[] readIntArray(int n, int os) {
            int[] ar = new int[n];
            for(int i=0; i<n; ++i)
                ar[i]=nextInt()+os;
            return ar;
        }
        public long nextLong() {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
                ret = ret * 10 + c - '0';
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
        public long[] readLongArray(int n, long os) {
            long[] ar = new long[n];
            for(int i=0; i<n; ++i)
                ar[i]=nextLong()+os;
            return ar;
        }
        public double nextDouble() {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
                ret = ret * 10 + c - '0';
            while ((c = read()) >= '0' && c <= '9');
            if (c == '.')
                while ((c = read()) >= '0' && c <= '9')
                    ret += (c - '0') / (div *= 10);
            if (neg)
                return -ret;
            return ret;
        }
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
        private byte read() {
            try{
                if (bufferPointer == bytesRead)
                    fillBuffer();
                return buffer[bufferPointer++];
            } catch(IOException e) {
                throw new RuntimeException();
            }
        }
        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
}
