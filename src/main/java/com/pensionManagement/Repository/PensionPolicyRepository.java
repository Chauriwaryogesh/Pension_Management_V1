package com.pensionManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pensionManagement.Entity.PensionPolicyEntity;

public interface PensionPolicyRepository extends JpaRepository<PensionPolicyEntity, String>{

}
