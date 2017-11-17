package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/14.
 */
@Entity
@Data
@Table(name="student_praise")
public class StudentPraise extends BaseEntity {
    @Column(name="student_id")
    private String studentId;

    @Column(name = "class_num")
    private  String classNum;

    @Column(name="praise_date")
    private Date praiseDate;

    @Column(name = "reason")
    private String reason;

    @Column(name="score")
    private double score;

   /* 获取学生姓名*/

   private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}
