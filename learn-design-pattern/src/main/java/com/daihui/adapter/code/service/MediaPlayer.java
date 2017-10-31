package com.daihui.adapter.code.service;

/**
 * 步骤 1
 * 为媒体播放器和更高级的媒体播放器创建接口
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/31.
 */
public interface MediaPlayer {

    /**
     * 类型为audioType且名称为fileName的音频文件的播放
     * @param audioType 音频类型
     * @param fileName 文件名称
     */
    void play(String audioType, String fileName);
}
