package com.daihui.builder.code;

import com.daihui.builder.code.model.ChickenBurger;
import com.daihui.builder.code.model.Coke;
import com.daihui.builder.code.model.Pepsi;
import com.daihui.builder.code.model.VegBurger;

/**
 * 步骤 6
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        meal.addItem(new ChickenBurger());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
