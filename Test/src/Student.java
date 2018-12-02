
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
class Student {
    long sid;
    String s_name;
    String s_email;
    long s_contact;
    String s_b_No;
    String s_apt_no;
    int Zip_code;
    String s_country;
    Date s_DOB;
    
    public Student(long sid,String s_name,String s_email,long s_contact,String s_b_No,String s_apt_no,int Zip_code,String s_country,Date s_DOB)
    {
        this.sid=sid;
        this.s_name=s_name;
        this.s_email=s_email;
        this.s_country=s_country;
        this.s_contact=s_contact;
        this.s_b_No=s_b_No;
        this.s_apt_no=s_apt_no;
        this.Zip_code=Zip_code;
        this.s_DOB=s_DOB;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public long getS_contact() {
        return s_contact;
    }

    public void setS_contact(long s_contact) {
        this.s_contact = s_contact;
    }

    public String getS_b_No() {
        return s_b_No;
    }

    public void setS_b_No(String s_b_No) {
        this.s_b_No = s_b_No;
    }

    public String getS_apt_no() {
        return s_apt_no;
    }

    public void setS_apt_no(String s_apt_no) {
        this.s_apt_no = s_apt_no;
    }

    public int getZip_code() {
        return Zip_code;
    }

    public void setZip_code(int Zip_code) {
        this.Zip_code = Zip_code;
    }

    public String getS_country() {
        return s_country;
    }

    public void setS_country(String s_country) {
        this.s_country = s_country;
    }

    public Date getS_DOB() {
        return s_DOB;
    }

    public void setS_DOB(Date s_DOB) {
        this.s_DOB = s_DOB;
    }
    
}
