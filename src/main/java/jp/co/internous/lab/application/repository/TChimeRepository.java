package jp.co.internous.lab.application.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.internous.lab.application.entity.TChimeEntity;

@Repository
@Transactional
public interface TChimeRepository  extends JpaRepository<TChimeEntity, String> {

	@Modifying
	@Query("UPDATE TChimeEntity tc SET chime_flg = ?1 WHERE id = ?2")
	public int saveByStopChimeFlg(boolean stopChimeFlg, int id);

	@Modifying
	@Query("UPDATE TChimeEntity tc SET chime_flg = ?1")
	public int saveAllStopChimeFlg(boolean stopChimeFlg);
}