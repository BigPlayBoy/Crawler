package com.crawl.util;

import java.io.File;

/**
 * Created by CUI on 2016/8/25.
 * Student
 */
public class Tools {
     public  static  boolean deleteFiles() {
        String reg = ".*ilqs.*";
        int i = 0;
        //第一步  获得当前项目的路径
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File file = new File(path);
        File[] tempList = file.listFiles();
        for (File file1 : tempList) {
            if (file1.isFile()) {
                {
                    if (file1.toString().matches(reg)) {
                        System.out.println("Delete:" + file1);
                        file1.delete();
                        i++;
                    }
                }
            }
        }
        System.out.println("一共删除了" + i + "个文件");
        return true;
    }

    public static void main(String[] args) {
        deleteFiles();
    }

}
