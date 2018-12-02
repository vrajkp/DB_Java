
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenil
 */
public class Coursetable {
    String course_id, program_degrees_id, course_name, professor_name, professor_highest_designation, 
            course_type,university_id;
    Date exam_date;

    public Coursetable(String course_id, String program_degrees_id, String course_name, String professor_name, String professor_highest_designation, String course_type, String university_id, Date exam_date) {
        this.course_id = course_id;
        this.program_degrees_id = program_degrees_id;
        this.course_name = course_name;
        this.professor_name = professor_name;
        this.professor_highest_designation = professor_highest_designation;
        this.course_type = course_type;
        this.university_id = university_id;
        this.exam_date = exam_date;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getProgram_and_degree_id() {
        return program_degrees_id;
    }

    public void setProgram_and_degree_id(String program_and_degree_id) {
        this.program_degrees_id = program_and_degree_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getProfessor_name() {
        return professor_name;
    }

    public void setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
    }

    public String getProfessor_highest_designation() {
        return professor_highest_designation;
    }

    public void setProfessor_highest_designation(String professor_highest_designation) {
        this.professor_highest_designation = professor_highest_designation;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public String getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(String university_id) {
        this.university_id = university_id;
    }

    public Date getExam_date() {
        return exam_date;
    }

    public void setExam_date(Date exam_date) {
        this.exam_date = exam_date;
    }
    
    
}
