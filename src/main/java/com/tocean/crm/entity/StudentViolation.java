package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/6.
 */
@Entity
@Data
@Table(name="student_violation")
public class StudentViolation extends BaseEntity {

    @Column(name="handle_way")
    private String handleWay;
    @Column(name="student_attitude")
    private String studentAttribute;
    @Column(name="viloation_date")
    private Date viloationDate;
    @Column(name="student_id")
    private String studentId;
    @Column(name="class_num")
    private String classNum;
    @Column(name="violation_situation")
    private String violationSituation;
}

