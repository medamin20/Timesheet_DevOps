package tn.esprit.spring.rest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entity.Mission;
import tn.esprit.spring.service.MissionServiceImpl;

@RestController
public class MissionRestController {
	
	@Autowired
	MissionServiceImpl ms ;
	

	
	
	// http://localhost:8081/SpringMVC/servlet/ajouterMission
		@PostMapping("/ajouterMission")
		@ResponseBody
		public Mission ajouterMission(@RequestBody Mission mission) 
		{
			ms.ajouterMission(mission);
			return mission ;
		}
	
		
		
		

		@DeleteMapping(value = "/deleteMission/{id}")
		public void deleteMission(@PathVariable("id") int id) {
			ms.deleteMission(id);	}
	    
		
		
		
		@GetMapping("/count-Missions")
		@ResponseBody
		public long getMissionsnumber() {
		return ms.getMissionNumber();
		}
		
		
		
		
		@GetMapping(value = "/getAllMissions")
	    @ResponseBody
		public List<Mission> getAllEmployes() {
			
			return ms.getMissions();
		}
		
		
}
