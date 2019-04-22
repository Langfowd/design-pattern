package com.ltf.design.pattern.template;

public class TestTemplate {
    public static void main(String[] args) {
        DayLifeTemplate template = new XiaoHua();
        template.oneDayLife();
        template = new XiaoMing();
        template.oneDayLife();
    }
}
