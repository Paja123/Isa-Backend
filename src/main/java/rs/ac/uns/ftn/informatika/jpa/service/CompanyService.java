package rs.ac.uns.ftn.informatika.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.informatika.jpa.repository.CompanyRepository;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

}
