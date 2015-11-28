package com.weishubin.test.jmx;

/**
 * Created by weishubin on 15/11/21.
 */
public class ServerMonitor implements ServerMonitorMBean {
    private ServerImpl impl;
    public ServerMonitor(ServerImpl imple) {
        this.impl = imple;
    }

    public Long getUpTime(){
        return System.currentTimeMillis() - impl.startTime;
    }

    public String getName() {
        return "test";
    }
}