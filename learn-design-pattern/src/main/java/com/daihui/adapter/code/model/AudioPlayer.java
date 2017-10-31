package com.daihui.adapter.code.model;

import com.daihui.adapter.code.adapter.MediaAdapter;
import com.daihui.adapter.code.service.MediaPlayer;

/**
 * 步骤 4
 * 创建实现了 MediaPlayer 接口的实体类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/11/1.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    private static final String VLC = "vlc";
    private static final String MP4 = "mp4";
    private static final String MP3 = "mp3";

    @Override
    public void play(String audioType, String fileName) {

        if (MP3.equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name is: " + fileName);
        } else if (VLC.equalsIgnoreCase(audioType) || MP4.equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
