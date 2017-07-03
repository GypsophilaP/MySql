/**
 * Created by Gypsophila on 2017/6/28.
 */
import java.security.Timestamp;
import java.util.Queue;

import static java.lang.Thread.sleep;

public class Sender {
    static Queue<SensorData> queue;
    class receiverThread extends Thread {
        public void run(){
            while (true){
                sender();
                try {
                    this.sleep(1000000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public void sender() {
        while(queue.isEmpty()!=true)
            queue.poll();
    }

    public void receiver(int sid, String stype, String sdata, Timestamp timestamp) {
        SensorData s = new SensorData(sid,stype,sdata,timestamp);
        queue.add(s);
    }

}
