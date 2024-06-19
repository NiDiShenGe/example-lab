package cn.edu.zust.se.AdapterPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-1:29
 * @Description:
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file Name:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
