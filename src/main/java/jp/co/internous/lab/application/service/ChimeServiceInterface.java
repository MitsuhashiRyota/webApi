package jp.co.internous.lab.application.service;

import java.util.List;

import jp.co.internous.lab.application.entity.TChimeEntity;
import jp.co.internous.lab.application.form.ChimeForm;

public interface ChimeServiceInterface {

	public void updateStopChimeFlg(ChimeForm chimeFrom);

	public List<TChimeEntity> chekStartChimeFlg();

	public void stopChimeFlg(ChimeForm chimeFrom);
}
