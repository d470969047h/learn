package com.daihui.adapter.code.adapter;

import com.daihui.adapter.code.service.AdvancedMediaPlayer;
import com.daihui.adapter.code.service.MediaPlayer;
import com.daihui.adapter.code.service.impl.Mp4Player;
import com.daihui.adapter.code.service.impl.VlcPlayer;

/**
 * 步骤 3
 * 创建实现了 MediaPlayer 接口的适配器类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/31.
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    private static final String VLC = "vlc";
    private static final String MP4 = "mp4";

    /**
     * 根据不同类型创建不同媒体播放器
     * @param audioType 播放器类型
     */
    public MediaAdapter(String audioType){
        if (VLC.equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new VlcPlayer();
        } else if (MP4.equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (VLC.equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playVlc(fileName);
        } else if (MP4.equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
