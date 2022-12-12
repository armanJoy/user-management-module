package com.arcgen.usermgt.repositories.web.usermanagement;

import com.arcgen.usermgt.models.domain.web.usermanagement.DxrAdminAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DxrAdminAccessRepo extends CrudRepository<DxrAdminAccess, String> {

    DxrAdminAccess findByDxrAdminAccessId(String dxrAdminAccessId);

}
