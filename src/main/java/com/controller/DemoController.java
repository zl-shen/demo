package com.controller;

import com.entity.Custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zlshen
 * @date 2020/8/26
 */

public class DemoController {


    //测试提交12345678
    //测试拉取12345678
    //测试提交12
    //测试拉取12
    //模板六：prsf:定义一个私有的静态常量
    private static final Custom CUSTOM = new Custom();
        //变形：psf:定义一个公有的静态常量
    public static final int NUM = 10;
        //变形：psfi   /   psfs
    public static final int NUM2 = 20;
    public static final String STR = "Tom";

    //模板一：psvm:得到main方法
    public static void main(String[] args) {
        //模板二：sout:打印输出语句
            //变形：soutp  soutm   soutv   xxx.sout
            //打印  形参   方法    变量    输出指定变量值
        System.out.println("Hello!");

        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println("DemoController.main");

        int num = 10;
        System.out.println("num = " + num);
        System.out.println(num);

        //模板三：fori:for循环
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","LiLeid"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
            //变形：iter:增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
            //变形：itar:for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for:对集合的遍历
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lilei");
        for (String s : list) {
            System.out.println(s);
        }
            //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
            //变形：list.forr:倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //ifn:判断引用变量是否为null
        if (list == null) {

        }
            //变形：inn:判断变量不为null
        if (list != null) {

        }
            //变形：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }


}
