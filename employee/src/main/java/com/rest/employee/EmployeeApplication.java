package com.rest.employee;

import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootApplication
public class EmployeeApplication extends SpringBootServletInitializer implements CommandLineRunner {

    private final DataSource dataSource;

    @PersistenceContext
    private EntityManager entityManager;

    public EmployeeApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmployeeApplication.class);
    }

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public void run(String... args) {
        logger = LogFactory.getLog(EmployeeApplication.class);

        logger.info("USING " + dataSource.getUrl() + " datasource url");

        List<EmpBean> empBeanMapping = entityManager.createNativeQuery("select e.EMPNO as \"id\", e.ENAME as \"name\", e.JOB as \"job\", e.SAL as \"salary\" from EMP e", "EmpBeanMapping").getResultList();

        empBeanMapping.forEach(logger::info);

    }
}