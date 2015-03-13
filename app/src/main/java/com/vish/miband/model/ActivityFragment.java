package com.vish.miband.model;

import java.util.Calendar;
import java.util.List;

/**Activity fragment is activites happend in a given time
 * The whole activity will be a list of activity fragments
 * Created by Vishnudev.K on 3/13/2015.
 */
public class ActivityFragment implements Comparable<ActivityFragment>{

    private List<ActivityData> data;
    private Calendar timestamp;

    @Override
    public String toString() {
        return "ActivityFragment{" +
                "data=" + data +
                ", timestamp=" + timestamp +
                '}';
    }

    public List<ActivityData> getData() {
        return data;
    }

    public void setData(List<ActivityData> data) {
        this.data = data;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * compareTo method will be used to compare
     * and sort two data Fragments.
     * 
     * @param another
     * @return
     */
    @Override
    public int compareTo(ActivityFragment another) {
        if(this.timestamp!=null) {
            return this.timestamp.compareTo(another.getTimestamp());
        }
        if(another.timestamp==null) {
            return 0;
        }
        return 1;
    }
}
