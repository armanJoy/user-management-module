package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.CompanyPreference;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyPreferenceRepo extends CrudRepository<CompanyPreference, String> {

    @Override
    List<CompanyPreference> findAll();

    CompanyPreference findByCompanyPreferenceId(String CompanyPreferenceId);

    CompanyPreference findByUserIdentificationPk(String userIdentificationPK);

}
