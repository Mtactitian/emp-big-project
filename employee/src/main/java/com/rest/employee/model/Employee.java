package com.rest.employee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rest.employee.EmpBean;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "EMP")
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@ToString(exclude = "department")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@SqlResultSetMapping(
        name = "EmpBeanMapping",
        classes = @ConstructorResult(
                targetClass = EmpBean.class,
                columns = {
                        @ColumnResult(name = "id", type = Integer.class),
                        @ColumnResult(name = "name", type = String.class),
                        @ColumnResult(name = "job", type = String.class),
                        @ColumnResult(name = "salary", type = Double.class)
                }
        )
)
public class Employee {
    @Id
    @Column(name = "empno", updatable = false)
    private Integer id;

    @Column(name = "ename")
    private String name;

    @Column(name = "job")
    private String job;

    @Column(name = "mgr")
    private Integer managerId;

    @Column(name = "hiredate")
    private LocalDate hireDate;

    @Column(name = "sal")
    private Double salary;

    @Column(name = "comm")
    private Integer commission;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "deptno")
    @JsonIgnore
    private Department department;

}
