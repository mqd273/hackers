package com.tujia;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by lidongw_1 on 2018/6/23.
 */
public class ZipHelper {

    public static String ZipString(String source) {
        return null;
    }

    public  String uncompress(String source){
        return  null;
    }

    public String compress(String source){
        return null;
    }

    public static byte[] gzipCompress(String str, String encoding) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip;
        try {
            gzip = new GZIPOutputStream(out);
            gzip.write(str.getBytes(encoding));
            gzip.close();
        } catch (IOException e) {
            System.out.println("gzip compress error." + e.getMessage());
        }
        return out.toByteArray();
    }


    public static byte[] gzipUncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try {
            GZIPInputStream ungzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while ((n = ungzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        } catch (IOException e) {
            System.out.println("gzip compress error." + e.getMessage());
        }

        return out.toByteArray();
    }


}
