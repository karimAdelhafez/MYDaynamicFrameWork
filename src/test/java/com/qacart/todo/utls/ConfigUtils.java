package com.qacart.todo.utls;

import java.util.Properties;

public class ConfigUtils {
    private Properties properties;
    private static ConfigUtils configUtils;

    public ConfigUtils(){
        String env= System.getProperty("env","PRODUCTION");
        switch (env){
            case "PRODUCTION":
                properties = PropertiesUtils.loadProperties("src/test/java/com/qacart/todo/config/production.properties");
            break;
            case "LOCAL" :
                properties = PropertiesUtils.loadProperties("src/test/java/com/qacart/todo/config/local.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }


    }
    public static ConfigUtils getInstance(){
        if (configUtils==null){
            configUtils=new ConfigUtils();
        }
        return configUtils;
    }
    public  String BaseUrl(){
      String prop = properties.getProperty("baseUrl");
      if (prop!=null) return prop;
      throw new RuntimeException("couldn't found the base url at the property file");

    }
    public String getEmail(){
        String prop = properties.getProperty("email");
        if (prop !=null) return prop;
        throw new RuntimeException("couldn't found the Email at the property file");

    }
    public String getPassword() {
        String prop = properties.getProperty("password");
        if (prop != null) return prop;
        throw new RuntimeException("couldn't found the password at the property file");
    }
}
