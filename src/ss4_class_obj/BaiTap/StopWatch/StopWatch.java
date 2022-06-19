package ss4_class_obj.BaiTap.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public  long start(){
        return this.startTime = System.currentTimeMillis();
    }
    public  long stop(){
        return this.endTime= System.currentTimeMillis();
    }
    public  long  getElapsedTime(){
        return System.currentTimeMillis() - this.startTime;
    }
    public long getStartTime() {
        return this.startTime;
    }


    public long getEndTime() {
        return this.endTime;
    }
}
