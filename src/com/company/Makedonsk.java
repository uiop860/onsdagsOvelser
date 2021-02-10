package com.company;

public class Makedonsk implements Dialog {

    String s = "Македонски";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "притиснете q за да запрете";
    }

    @Override
    public String selectedLanguage() {
        return "избраниот јазик е";
    }
}
