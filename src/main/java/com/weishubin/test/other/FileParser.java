package com.weishubin.test.other;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author weishubin
 */
public class FileParser {
    public static void main(String[] args) throws IOException {
        File resource = new File("D:\\DEV\\logs\\video_cost.log");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(resource)));
        String line = bufferedReader.readLine();
        Map<String, Integer> stat = new TreeMap<String, Integer>();
        int count = 0;
        while (line != null) {
            count++;
            String[] ls = line.split(";");
            for (int i = 3; i < 11; i++) {
                String[] services = ls[i].split(",");

                String name = services[0];
                Double cost = NumberUtils.toDouble(services[1]);

                stat(name, stat, cost, 0.01, "10ms");
                stat(name, stat, cost, 0.02, "20ms");
                stat(name, stat, cost, 0.03, "30ms");
                stat(name, stat, cost, 0.04, "40ms");
                stat(name, stat, cost, 0.05, "50ms");
            }
            line = bufferedReader.readLine();
        }

        System.out.println(count);
        for (Map.Entry<String, Integer> entry : stat.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }

    private static void stat(String service, Map<String, Integer> stat, Double cost, Double max, String maxName) {
        if (cost >= max) {
            String key = service + '-' + maxName;
            Integer count = stat.get(key);
            if (count == null) {
                count = 0;
            }
            stat.put(key, count + 1);
        }
    }
}
