import java.security.Timestamp;
import java.util.Date;

/**
 * Created by Gypsophila on 2017/6/28.
 */
public class SensorData {
    SensorData(int sid,String stype,String sdata,Timestamp time){
        sensorId = sid;
        sensorType = stype;
        data = sdata;
        timestamp = time;
    }

    SensorData(){

    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    int sensorId;
    String sensorType;
    Timestamp timestamp;
    String data;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



}
