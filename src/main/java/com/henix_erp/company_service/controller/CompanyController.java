package com.henix_erp.company_service.controller;

import com.henix_erp.company_service.entity.Company;
import com.henix_erp.company_service.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class CompanyController {

    CompanyService companyService;

    CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/company")
    public ResponseEntity<Company> create(@RequestBody Company company) {
        Company savedCompany = companyService.create(company);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCompany);
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Company> get(@PathVariable int id) {
        Company company = companyService.get(id);
        return ResponseEntity.status(HttpStatus.OK).body(company);
    }

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getAll() {
        List<Company> companies = companyService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(companies);
    }
}
