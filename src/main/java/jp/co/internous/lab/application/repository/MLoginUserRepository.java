package jp.co.internous.lab.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.internous.lab.application.entity.MLoginUserEntity;

@Repository
public interface MLoginUserRepository extends JpaRepository<MLoginUserEntity, String>{

	@Query("SELECT ml FROM MLoginUserEntity ml WHERE ml.loginId = ?1 AND ml.loginPassword = ?2")
	public MLoginUserEntity findLoginUser(String loginId, String loginPassword);
}
