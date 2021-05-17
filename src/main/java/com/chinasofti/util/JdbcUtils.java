package com.chinasofti.util;





import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.util.Properties;

public class JdbcUtils {
    private static DataSource  dataSource=null;

    public static DataSource getDataSource(){

        try {
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            HikariConfig config = new HikariConfig(properties);
            dataSource = new HikariDataSource(config);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
