package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "ORDER_ID")
    private Long orderId;

    @Column(name = "ITEM_ID")
    private Long itemId;

    private int orderprice;
    private int count;

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setOrderprice(int orderprice) {
        this.orderprice = orderprice;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public int getOrderprice() {
        return orderprice;
    }

    public int getCount() {
        return count;
    }
}
