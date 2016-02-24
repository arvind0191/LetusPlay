package in.starlabs.letusplay.model;

import android.net.Uri;

/**
 * Created by Arvind on 24/02/16.
 */
public class GameHelper {

    String imageUri;
    String eventName;
    String eventId;
    public GameHelper(String uri,String Name, String Id){
        this.imageUri = uri;
        this.eventName = Name;
        this.eventId=  Id;
    }

    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getImageUri() {
        return imageUri;
    }
}
