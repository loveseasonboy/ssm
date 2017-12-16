package com.commons;

import org.apache.log4j.Logger;

/**
 * Created by hehd on 2017/4/6.
 * 这种方式只适用于java程序中
 * 每一个类都要写一个静态的全局变量；
 * web:在web.xml中配置启动，来打印日志
 * 也可以在spring中配置启动
 * @author 何海东
 */
public class LogUtils{
    private static Logger logger = Logger.getLogger(LogUtils.class);

    //获取异常的全部信息
    public static String getExceptionInformation(Exception e) {
        String excInfo;
        //e.getMessage 获取的是sql的错误信息
        if (e.getMessage() != null) {
            excInfo = e.getMessage() + "\r\n" + e.toString();
        } else {
            excInfo = e.toString() + "\r\n";
        }
        //获取异常信息内容为数组
        StackTraceElement[] trace = e.getStackTrace();
        //便利数组
        for (StackTraceElement info : trace) {
            excInfo += "\tat " + info + "\r\n";
        }
        return excInfo;
    }

    public static void main(String[] args) {
        logger.info("ss");
        String ss = null;
        try {
            ss.equals("");
        } catch (Exception e) {
            logger.error(getExceptionInformation(e));
        }

    }
}
