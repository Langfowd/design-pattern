package com.ltf.design.pattern.template;

public abstract class DayLifeTemplate {
    protected abstract void moniring();
    protected abstract void nong();
    protected abstract void night();
    protected abstract String getName();

    public void oneDayLife() {
        System.out.println("==="+getName()+"===");
        moniring();
        nong();
        night();
    }
}
