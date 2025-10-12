package com.pensionManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pensionManagement.Entity.PensionBenefitEntity;

public interface PensionBenefitRepository  extends JpaRepository<PensionBenefitEntity, String>{

}
