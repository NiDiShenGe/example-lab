package cn.edu.zust.se.AdapterPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-1:32
 * @Description:
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file Name:"+fileName);
    }
}
