import java.util.Scanner;

public class stopWatch {
    public long startTime;
    public long endTime;

    public stopWatch() {

    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void End() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        stopWatch st =  new stopWatch();
        st.Start();
        System.out.println("hello");
        st.End();
        System.out.println(st.getElapsedTime());
    }

}
