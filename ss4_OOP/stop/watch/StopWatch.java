package ss4_OOP.stop.watch;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch() {
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
