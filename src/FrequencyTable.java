import java.util.HashMap;
import java.util.Map;

/**
 * Created by renstange on 10/18/16.
 */
public class FrequencyTable {

    private HashMap<Character, Integer> thisMap;

    FrequencyTable(){
        this.thisMap = new HashMap<Character, Integer>();
    }

    public void countString(String sentString){
        this.thisMap.clear();

        char sentChars[] = sentString.toCharArray();

        for (Character tempChar: sentChars) {
            if (this.thisMap.containsKey(tempChar)) {
                this.thisMap.put(tempChar, (this.thisMap.get(tempChar)+1));
            } else {
                this.thisMap.putIfAbsent(tempChar, 1);
            }
        }
    }

    @Override
    public String toString(){
        String formattedString = "Key Set:\n";

        for (Map.Entry<Character, Integer> record: this.thisMap.entrySet()) {
            formattedString += "\"" + record.getKey() + "\" = " + record.getValue() + "\n";
        }

        return formattedString;
    }
}
