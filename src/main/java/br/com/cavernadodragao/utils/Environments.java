package br.com.cavernadodragao.utils;

public class Environments {
    public static String get(String driver) {
        String driverPath = null;
        if (driver == "chrome") {
            driverPath = "chromedriver.exe";
        }
        return driverPath;
    }
}
