package com.daihui.adapter.code.client;

import com.daihui.adapter.code.model.AudioPlayer;

/**
 * 步骤 5
 * 使用 AudioPlayer 来播放不同类型的音频格式
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/11/1.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","TokyoHot.mp3");
        audioPlayer.play("mp4","教师和学生的故事.mp4");
        audioPlayer.play("vlc","Mad.vlc");
        audioPlayer.play("avi","《mind me》.avi");
    }
}
