package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@ToString
public class FlowerBucket extends Item{
    List<Item> bucket = new LinkedList<>();

    public FlowerBucket() {
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Item item : bucket) {
            price += item.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "This is flower bucket";
    }

    public void addFlowers(Item item) {
        bucket.add(item);
    }

    public String searchFlower(Item item) {
        String msg;
        if (bucket.contains(item)) {
            msg = "There is " + item + " in your bucket";
        }
        else {
            msg = "There is no such item in your bucket";
        }
        return msg;
    }
}
