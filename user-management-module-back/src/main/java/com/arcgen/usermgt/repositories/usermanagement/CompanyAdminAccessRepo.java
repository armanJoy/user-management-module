package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.CompanyAdminAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyAdminAccessRepo extends CrudRepository<CompanyAdminAccess, String> {

    CompanyAdminAccess findByCompanyAdminAccessId(String companyAdminAccessId);

}
