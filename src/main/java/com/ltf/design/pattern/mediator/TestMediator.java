package com.ltf.design.pattern.mediator;

public class TestMediator {
    public static void main(String[] args) {
        // 创建中介
        HourseMediator mediator = new HourseMediator();
        Buyer buyer = new Buyer(mediator);
        Seller seller = new Seller(mediator);
        mediator.setBuyer(buyer);
        mediator.setSeller(seller);
        buyer.notice("我近期要购房");
        seller.notice("我收到了，我这有房卖");

    }
}
