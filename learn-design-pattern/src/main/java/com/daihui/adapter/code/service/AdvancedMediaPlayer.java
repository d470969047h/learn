package com.daihui.adapter.code.service;

/**
 * 步骤 1
 * 为媒体播放器和更高级的媒体播放器创建接口
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/31.
 */
public interface AdvancedMediaPlayer {
    /**
     * VLC 格式的音频文件播放
     * @param fileName 文件名称
     */
    void playVlc(String fileName);

    /**
     * MP4 格式的音频文件播放
     * @param fileName 文件名称
     */
    void playMp4(String fileName);
}
