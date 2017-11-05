package com.app.repo;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.*;
import com.app.model.employee.*;
import org.springframework.security.access.prepost.PreAuthorize;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public List<Employee> findAll();
    public Page<Employee> findAll(Pageable p);
    @PreAuthorize("hasAuthority('ADMIN')")
    Employee save(Employee e);
    @PreAuthorize("hasAuthority('ADMIN')")
    void delete(Employee e);
    @PreAuthorize("hasAuthority('ADMIN')")
    void delete(Integer id);
    boolean exists( Integer id);
}

