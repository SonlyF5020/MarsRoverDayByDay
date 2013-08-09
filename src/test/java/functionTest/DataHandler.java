package functionTest;

import java.util.HashMap;
import java.util.Map;

public class DataHandler {
    private Map<String,UserData> tempData = new HashMap<String,UserData>();
    public UserData getData(String dataKey){

        // code here is complex enough

        return null;
    }

    public Map<String,UserData> getAllData(){

        // code here is complex enough

        return new HashMap<String, UserData>();
    }

    public DataHandler() {
        this.tempData = getAllData();
    }

    public UserData getDataWithTemp(String dataKey){
        if (tempData.containsKey(dataKey)){
            return tempData.get(dataKey);
        }
        UserData newData = getData(dataKey);
        tempData.put(dataKey,newData);
        return newData;
    }
}
