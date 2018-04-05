package com.rest.employee;

import lombok.*;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class EmpBean {

    private Integer id;
    private String name;
    private String job;
    private Double salary;
}
