package com.tujia;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * @Author:lidongw_1
 * @Date 2022/3/17
 * @Description: 删除敏感信息- 安全组
 * 发现频道
 *只有少于 8000行
 *
 * tj_mysqltns27_pxc
 *
 *
 * lingli_7@tujia.com
 *
 * lingli_7
 *
 *删除敏感信息- 安全组
 *
 * lidongw_1@tujia.com
 *
 * 消息中心
 *
 **/
public class ExcelTest {

    public static void main(String[] args) throws IOException {




        Integer a = new Integer(256);
        Integer b = new Integer(256);

        System.out.println(a == b);
        System.out.println(a == 256);

        Integer a1 = new Integer(1);
        Integer b1 = new Integer(1);

        System.out.println(a1 == b1);


        System.out.println(1<<3);
        System.out.println(1>>3);

        ClassPathResource classPathResource = new ClassPathResource("要删除的昵称和头像.xlsx");
        InputStream inputStream = classPathResource.getInputStream();
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet nickNameSheet = workbook.getSheet("昵称");
        writeNickName(nickNameSheet);

        System.out.println("昵称结束");
        System.out.println("用户头像开始");
        writeUrl(workbook.getSheet("头像"));
        System.out.println("用户头像结束");
    }

    private static void writeNickName( XSSFSheet nickNameSheet) throws IOException {
        File file = new File("nickName_sql.txt");
        if (file.exists()) {
            file.delete();
        }else {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        Iterator<Row> rowIterator = nickNameSheet.rowIterator();
        rowIterator.next(); //跳过第一行

        int i = 0;
        while (rowIterator.hasNext()) {
            if (i/8000 > 0 ){
                file = new File("nickName_sql_"+ i/8000 +".txt");
                if (!file.exists()){
                    fw.flush();
                    fw.close();

                    file.createNewFile();
                    fw = new FileWriter(file);
                }
            }

            Row row = rowIterator.next();
            Cell cell = row.getCell(0);
            CellType cellType = cell.getCellType();

            String value ;
            if (cellType == CellType.NUMERIC) {
                value = ((XSSFCell) cell).getRawValue();
            }else {
                value = cell.getStringCellValue();
            }
            String del = String.format("delete from tns_cms.q_user_info where nickname = '%s';", value);
            fw.append(del);
            fw.write("\r\n");
            i++;
        }
        fw.flush();
        fw.close();
        System.out.println(file.getAbsolutePath());
    }


    private static void writeUrl( XSSFSheet nickNameSheet) throws IOException {
        File file1 = new File("head_url_sql.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }else {
            file1.delete();
        }
        FileWriter fw = new FileWriter(file1);
        Iterator<Row> rowIterator = nickNameSheet.rowIterator();
        rowIterator.next(); //跳过第一行

        int i = 0;
        while (rowIterator.hasNext()) {
            if (i/8000 > 0 ){
                 file1 = new File("head_url_sql_"+ i/8000 +".txt");
                if (!file1.exists()){
                    fw.flush();
                    fw.close();

                    file1.createNewFile();
                    fw = new FileWriter(file1);
                }
            }

            Row row = rowIterator.next();
            Cell cell = row.getCell(1);
            String  value = cell.getStringCellValue();

            String del = String.format("delete from tns_cms.q_user_info where url = '%s';", value);
            fw.append(del);
            fw.write("\r\n");

            i++;
        }
        fw.flush();
        fw.close();
        System.out.println(file1.getAbsolutePath());
    }
}
