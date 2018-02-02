package jp.co.internous.lab.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.entity.TChimeEntity;
import jp.co.internous.lab.application.form.ChimeForm;
import jp.co.internous.lab.application.repository.TChimeRepository;

@Service
public class ChimeServiceImpl implements ChimeServiceInterface{

	@Autowired
	private TChimeRepository tChimeRepository;

	@Override
	public void updateStopChimeFlg(ChimeForm chimeFrom) {
		tChimeRepository.saveByStopChimeFlg(chimeFrom.isStopChimeFlg(), chimeFrom.getId());
	}

	@Override
	public List<TChimeEntity> chekStartChimeFlg() {
		List<TChimeEntity> tChimeEntityList = tChimeRepository.findAll();
		System.out.println(tChimeEntityList.get(0).getChimeFlg());
		System.out.println(tChimeEntityList.get(1).getChimeFlg());
		System.out.println(tChimeEntityList.get(2).getChimeFlg());
		System.out.println(tChimeEntityList.get(3).getChimeFlg());
		return tChimeEntityList;
	}

	@Override
	public void stopChimeFlg(ChimeForm chimeFrom) {
		tChimeRepository.saveAllStopChimeFlg(chimeFrom.isStopChimeFlg());
	}

}
