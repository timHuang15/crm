package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * Created by Administrator on 2017/11/9.
 */
@Entity
@Data
@Table(name="u_student_info")
public class StudentInfo extends BaseEntity {

    @Column(name="student_name")
    private String studentName;
    @Column(name="sex")
    private String sex;
    @Column(name="school")
    private String school;
    @Column(name="department")
    private String department;
    @Column(name="college_major")
    private String collegeMajor;
    @Column(name="school_record")
    private String schoolRecord;
    @Column(name="telephone")
    private String telephone;
    @Column(name="company")
    private String company;
    @Column(name="head_ship")
    private String headShip;
}
