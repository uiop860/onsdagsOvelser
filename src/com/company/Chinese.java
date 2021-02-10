package com.company;

public class Chinese implements Dialog {

    private String s = "Chinese";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "按q退出";
    }

    @Override
    public String selectedLanguage() {
        return "選擇的語言是";
    }
}
