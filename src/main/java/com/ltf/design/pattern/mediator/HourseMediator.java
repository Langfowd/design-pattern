package com.ltf.design.pattern.mediator;

/**
 * 具体房屋中介类
 */
public class HourseMediator implements Mediator {
    private Buyer buyer;
    private Seller seller;

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    public void setSeller(Seller seller) {
        this.seller = seller;
    }


    @Override
    public void sendMsg(String msg, AbstractPerson person) {
        if (buyer == person) {
            seller.getNotice(msg);
        } else if (seller == person) {
            buyer.getNotice(msg);
        }

    }
}
