package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.AccessDef;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessDefRepo extends CrudRepository<AccessDef, String> {

    @Override
    List<AccessDef> findAll();

}
