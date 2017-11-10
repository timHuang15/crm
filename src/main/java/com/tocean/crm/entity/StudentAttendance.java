package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/11/10.
 */
@Entity
@Data
@Table(name="u_student_attendance")
public class StudentAttendance extends BaseEntity {

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "start_date")
    private String start_date;

    @Column(name = "end_date")
    private String end_date;

    @Column(name = "status")
    private String status;
}
