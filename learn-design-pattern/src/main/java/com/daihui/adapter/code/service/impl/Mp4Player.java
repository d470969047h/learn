package com.daihui.adapter.code.service.impl;

import com.daihui.adapter.code.service.AdvancedMediaPlayer;

/**
 * 步骤 2
 * 创建实现了 AdvancedMediaPlayer 接口的实体类:MP4。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/31.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        /* nothing */
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name is: " + fileName);
    }
}
