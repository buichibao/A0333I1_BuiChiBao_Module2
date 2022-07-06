package ss4_class_object.BaiTap.StopWatch;

public class StopWatch {
    private  long startTime ;
    private  long endTime ;

    public StopWatch() {
        this.startTime=System.currentTimeMillis();
    }
    public long start(){
        return  this.startTime=System.currentTimeMillis();
    }
    public long stop(){
        return this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

}
