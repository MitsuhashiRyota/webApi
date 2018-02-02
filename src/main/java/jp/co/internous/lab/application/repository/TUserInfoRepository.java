package jp.co.internous.lab.application.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.internous.lab.application.entity.TUserInfoEntity;

@Repository
@Transactional
public interface TUserInfoRepository  extends JpaRepository<TUserInfoEntity, String>{

	@Query("SELECT tu FROM TUserInfoEntity tu WHERE user_first_name_kana LIKE %?1% OR user_last_name_kana LIKE %?1% OR user_first_name LIKE %?1% OR user_last_name LIKE %?1%")
	public List<TUserInfoEntity> findByUserName(String searchName);

	@Query("SELECT tu FROM TUserInfoEntity tu WHERE id = ?1")
	public TUserInfoEntity findById(int selectUserId);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET user_first_name_kana = ?1 WHERE id = ?2")
	public int saveByUserFirstNameKana(String editParam, int id);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET user_last_name_kana = ?1 WHERE id = ?2")
	public int saveByUserLastNameKana(String editParam, int id);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET user_first_name = ?1 WHERE id = ?2")
	public int saveByUserFirstName(String editParam, int id);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET user_last_name = ?1 WHERE id = ?2")
	public int saveByUserLastName(String editParam, int id);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET tel_number = ?1 WHERE id = ?2")
	public int saveByTelNumber(String editParam, int id);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET mail_address = ?1 WHERE id = ?2")
	public int saveByMailAddressKana(String editParam, int id);

	@Modifying
	@Query("UPDATE TUserInfoEntity tu SET memo = ?1 WHERE id = ?2")
	public int saveByMemo(String editParam, int id);
}