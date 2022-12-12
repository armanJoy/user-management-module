package com.arcgen.usermgt.repositories.subscription;

import com.arcgen.usermgt.models.domain.subscription.CompanyCategory;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyCategoryRepo extends CrudRepository<CompanyCategory, String> {

    @Override
    List<CompanyCategory> findAll();

    CompanyCategory findByCompanyCategoryId(String companyCategoryId);

}
