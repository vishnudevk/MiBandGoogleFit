package com.vish.miband.model;

/**Contains steps of an activity
 * ActivityFragment contains list of activity data
 * Created by Vishnudev.K on 3/13/2015.
 */
public class ActivityData {

    private int category;
    private int intensity;
    private int steps;

    @Override
    public String toString() {
        return "ActivityData{" +
                "category=" + category +
                ", intensity=" + intensity +
                ", steps=" + steps +
                '}';
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
