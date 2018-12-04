/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenil
 */
public class Query4Table {
    
    String UNIVERSITY_NAME;
    String UNIVERSITY_ID;

    public Query4Table(String UNIVERSITY_NAME, String UNIVERSITY_ID) {
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
        this.UNIVERSITY_ID = UNIVERSITY_ID;
    }

    public String getUNIVERSITY_NAME() {
        return UNIVERSITY_NAME;
    }

    public void setUNIVERSITY_NAME(String UNIVERSITY_NAME) {
        this.UNIVERSITY_NAME = UNIVERSITY_NAME;
    }

    public String getUNIVERSITY_ID() {
        return UNIVERSITY_ID;
    }

    public void setUNIVERSITY_ID(String UNIVERSITY_ID) {
        this.UNIVERSITY_ID = UNIVERSITY_ID;
    }
    
}
