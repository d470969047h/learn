package com.daihui.builder.code;

import com.daihui.builder.code.service.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤 5
 * 创建一个 Meal 类，带有上面定义的 Item 对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    /**
     * 套餐各项
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 费用
     * @return float
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}