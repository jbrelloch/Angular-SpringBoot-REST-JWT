package com.app.repo;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.*;
import com.app.model.customer.*;
import org.springframework.security.access.prepost.PreAuthorize;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    public List<Customer> findAll();
    public Page<Customer> findAll(Pageable p);
    @PreAuthorize("hasAuthority('ADMIN')")
    Customer save(Customer c);
    @PreAuthorize("hasAuthority('ADMIN')")
    void delete(Customer c);
    @PreAuthorize("hasAuthority('ADMIN')")
    void delete(Integer id);
    boolean exists( Integer id);


}

