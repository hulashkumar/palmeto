package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach1 {
	@Autowired
		private FortuneService fortuneService;
		public TennisCoach1(FortuneService theFortuneService ) {
			fortuneService=theFortuneService;
		}
		@Autowired
		public String getDailyWork() {
			return "Practice your dailyWork";
		}
	
		public String getDailyFortune() {
			return fortuneService.getFortune();
		}
		
}
