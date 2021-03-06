package com.javatrip.jdbctemplate.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-08-31 11:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentBean implements Serializable {

    private static final long serialVersionUID = 4618004018169112427L;

    private Integer studentId;
    private Integer age;
    private String name;
    private Integer sex;
    private Date createTime;
    private Integer status;
}
