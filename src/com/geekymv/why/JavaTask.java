package com.geekymv.why;

import java.util.Scanner;


/**

* @className:JavaTask.java

* @classDescription:

* @author:yeye

* @createTime:2015年9月17日 下午12:08:59

*/

public class JavaTask {

	 // TODO 可以把一些可以复用的判断封装成一个方法
     public static void main(String[] args) {

          Scanner sc = new Scanner(System. in);

          int flag = 0;	// TODO 没有注释 flag = 0 代表什么

          String out = " ";	// TODO 初始化一个""字符串， 注意中间不要有空格"" 和 " "是不一样的（长度不一样）

          System. out.println( "请输入一串不超过8位的数字：" );

          String input = sc.next();

          for ( int i = 0; i < input.length(); i++) {

              char ch = input.charAt( i);

              if ( ch >= '0' && ch <= '9' && input.length() <= 8) {	
            	// TODO input.length() <= 8  这句代码 应该放在for循环外面  用户输入数据后 首先判断长度是否为8位	

              } else {

                   flag = 1;

                   break;

              }


          }

         

          if ( flag == 0) {	// TODO 注释

              for ( int i = 0; i < input.length(); i++) {

                   char ch = input.charAt( i);

                   switch ( ch) {

                   case '1':

                        out = "一";

                        break;

                   case '2':

                        out = "二";

                        break;

                   case '3':

                        out = "三";

                        break;

                   case '4':

                        out = "四";

                        break;

                   case '5':

                        out = "五";

                        break;

                   case '6':

                        out = "六";

                        break;

                   case '7':

                        out = "七";

                        break;

                   case '8':

                        out = "八";

                        break;

                   case '9':

                        out = "九";

                        break;

                   case '0':

                        out = "零";

                        break;


                   default:

                        break;


                   }

                   System. out.println( out);

              }


          }

         

          if ( flag == 1) {

              System. out.println( "输入不正确" );


          }                           

             

     }                 


}