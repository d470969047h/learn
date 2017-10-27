package com.daihui.prototype.service;

/**
 * 步骤 1
 * 创建一个实现了 Clonable 接口的抽象类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/27.
 */
public abstract class BaseShape implements Cloneable {

    private String id;

    protected String type;

    /**
     * 画
     */
    public abstract void draw();


    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

}
