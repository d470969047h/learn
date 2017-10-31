package com.daihui.adapter.code.service.impl;

import com.daihui.adapter.code.service.AdvancedMediaPlayer;

/**
 * 步骤 2
 * 创建实现了 AdvancedMediaPlayer 接口的实体类:vlc。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/31.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name is: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        /* nothing */
    }
}
