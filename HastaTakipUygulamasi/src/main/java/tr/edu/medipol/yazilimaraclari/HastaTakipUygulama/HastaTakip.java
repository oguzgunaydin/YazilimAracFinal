package tr.edu.medipol.yazilimaraclari.HastaTakipUygulama;

import org.springframework.web.bind.annotation.*;

import java.util.*;

public class HastaTakip {
	
	public static List<String> hasta = new ArrayList<>();
	@GetMapping("/listele")
	@ResponseBody
	public List<String> listele(){
		return hasta;
	}
	
	@PostMapping("/ekle")
	@ResponseBody
	public String ekle(@RequestBody String ad) {
		hasta.add(ad);
		return ad;
	}
	
	@PostMapping("/sil")
	@ResponseBody
	public String sil(@RequestBody String ad) {
		hasta.clear();
		return ad;

	}
}
