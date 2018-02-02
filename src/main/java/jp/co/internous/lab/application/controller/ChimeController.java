package jp.co.internous.lab.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.entity.TChimeEntity;
import jp.co.internous.lab.application.form.ChimeForm;
import jp.co.internous.lab.application.service.ChimeServiceInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins="http://ipv4.fiddler:4200")
@RequestMapping("/")
public class ChimeController {

	@Autowired
	private ChimeServiceInterface chimeServiceImpl;

	@GetMapping("/chime")
	public List<TChimeEntity> checkChimeFlg() {
		System.out.println("チャイム確認");
		return chimeServiceImpl.chekStartChimeFlg();
	}

	@RequestMapping(value= "/chime/start", method = RequestMethod.POST)
	public boolean startChime(@ModelAttribute ChimeForm chimeFrom , Model model) {
		System.out.println("チャイム開始");
		System.out.println(chimeFrom.isStopChimeFlg());
		System.out.println(chimeFrom.getId());

		chimeServiceImpl.updateStopChimeFlg(chimeFrom);
		return true;
	}

	@RequestMapping(value= "/chime/stop", method = RequestMethod.POST)
	public boolean stopChime(@ModelAttribute ChimeForm chimeFrom , Model model) {
		System.out.println("チャイム停止");
		System.out.println(chimeFrom.isStopChimeFlg());

		chimeServiceImpl.stopChimeFlg(chimeFrom);
		return true;
	}
}
