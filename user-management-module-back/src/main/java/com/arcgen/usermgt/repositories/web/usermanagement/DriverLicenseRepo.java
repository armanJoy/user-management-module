package com.arcgen.usermgt.repositories.web.usermanagement;

import com.arcgen.usermgt.models.domain.web.usermanagement.DrivingLicense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseRepo extends CrudRepository<DrivingLicense, String> {

}
