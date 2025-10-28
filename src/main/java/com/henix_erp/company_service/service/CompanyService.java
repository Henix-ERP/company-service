package com.henix_erp.company_service.service;

import com.henix_erp.company_service.entity.Company;

import java.util.List;

public interface CompanyService {

    public Company create(Company company);

    public Company get(int id);

    public List<Company> getAll();

    public void delete(int id);
}
