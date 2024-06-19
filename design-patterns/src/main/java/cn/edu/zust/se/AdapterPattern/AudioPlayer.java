package cn.edu.zust.se.AdapterPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-1:55
 * @Description:
 */
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file Name:"+fileName);
        }else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media. "+audioType+" format not supported");
        }
    }
}
