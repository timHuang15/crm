package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/9.
 */
@Entity
@Data
@Table(name="u_student_info")
public class StudentInfo extends BaseEntity {

    @Column(name="student_name")
    private String studentName;
    @Column(name = "class_num")
    private String classNum;
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
    @Column(name="birth_place")
    private String birthPlace;
    @Column(name="birth_day")
    private Date birthDay;
    @Column(name="student_type")
    private String studentType;
    @Column(name = "email")
    private String email;
    @Column (name = "qq")
    private String qq;
    @Column(name = "credential_num")
    private String credentialNum;
    @Column(name="guardian")
    private String guardian;
    @Column(name="guardian_phone")
    private String guardianphone;
    @Column(name="home_address")
    private String homeAddress;

}
