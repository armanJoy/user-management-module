package com.arcgen.usermgt.repositories.usermanagement;

import com.arcgen.usermgt.models.domain.usermanagement.DrivingLicense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseRepo extends CrudRepository<DrivingLicense, String> {

}
