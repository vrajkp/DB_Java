/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject;

/**
 *
 * @author asus
 */
class uni {
    private int TIER;
    private String UNIVERSITY_ID,UNIVERSITY_ADDRESS ,UNIVERSITY_NAME;

    public uni(String UNIVERSITY_ID, String UNIVERSITY_ADDRESS, String UNIVERSITY_NAME,int TIER) {
        this.TIER = TIER;
        this.UNIVERSITY_ID = UNIVERSITY_ID;
        this.UNIVERSITY_ADDRESS = UNIVERSITY_ADDRESS;
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
    }

    public int getTIER() {
        return TIER;
    }

    public void setTIER(int TIER) {
        this.TIER = TIER;
    }

    public String getUNIVERSITY_ID() {
        return UNIVERSITY_ID;
    }

    public void setUNIVERSITY_ID(String UNIVERSITY_ID) {
        this.UNIVERSITY_ID = UNIVERSITY_ID;
    }

    public String getUNIVERSITY_ADDRESS() {
        return UNIVERSITY_ADDRESS;
    }

    public void setUNIVERSITY_ADDRESS(String UNIVERSITY_ADDRESS) {
        this.UNIVERSITY_ADDRESS = UNIVERSITY_ADDRESS;
    }

    public String getUNIVERSITY_NAME() {
        return UNIVERSITY_NAME;
    }

    public void setUNIVERSITY_NAME(String UNIVERSITY_NAME) {
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
    }
    
            
}
