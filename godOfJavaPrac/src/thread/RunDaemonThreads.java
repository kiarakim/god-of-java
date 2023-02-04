package thread;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.runCommonThread();
        sample.runDaemonThread();
    }

    public void runCommonThread(){
        DaemonThread thread = new DaemonThread();
        thread.start();
    }

    public void runDaemonThread(){
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }


}
