package com.henix_erp.company_service.service.impl;

import com.henix_erp.company_service.entity.Company;
import com.henix_erp.company_service.repository.CompanyRepository;
import com.henix_erp.company_service.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company create(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company get(int id) {
        Optional<Company> optional = companyRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public void delete(int id) {

    }
}
