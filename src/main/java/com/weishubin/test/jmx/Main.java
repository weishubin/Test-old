package com.weishubin.test.jmx;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

/**
 * Created by weishubin on 15/11/21.
 */
public class Main {
    private static ObjectName objectName ;
    private static ObjectName objectName2 ;
    private static MBeanServer mBeanServer;
    public static void main(String[] args) throws Exception{
        init();
        manage();
    }
    private static void init() throws Exception{
        ServerImpl serverImpl = new ServerImpl();
        DynamicServerMonitor serverMonitor = new DynamicServerMonitor(serverImpl);

        mBeanServer = MBeanServerFactory.createMBeanServer();

        objectName = new ObjectName("objectName:id=ServerMonitor");
        mBeanServer.registerMBean(serverMonitor,objectName);

        objectName2 = new ObjectName("objectName:id=ServerMonitor2");
        mBeanServer.registerMBean(new ServerMonitor(serverImpl), objectName2);


    }
    private static void manage() throws Exception{
        Long upTime = (Long) mBeanServer.getAttribute(objectName,
                "UpTime");
        System.out.println(upTime);

        upTime = (Long) mBeanServer.getAttribute(objectName2,
                "UpTime");
        System.out.println(upTime);
    }
}