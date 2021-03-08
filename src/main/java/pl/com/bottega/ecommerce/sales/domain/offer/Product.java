package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String id;
    private Money price;
    private String name;
    private String type;
    private Date snapshotDate;

    public Product(String id, Money price, String name, String type, Date snapshotDate) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.type = type;
        this.snapshotDate = snapshotDate;
    }

    public String getId() {
        return id;
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }
}
