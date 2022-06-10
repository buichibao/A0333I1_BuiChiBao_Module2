package ss2_vong_lap_java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ViDu5 {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println("i = "+i);
        }
        System.out.println("End of loop");
    }
}
