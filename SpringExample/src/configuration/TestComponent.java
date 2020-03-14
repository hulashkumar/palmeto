package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext ctx=new ClassPathXmlApplicationContext("Component.xml");
			TennisCoach theCoach=ctx.getBean(TennisCoach.class);
			FootBallCoach thefoot=ctx.getBean(FootBallCoach.class);
			//System.out.println(theCoach.getDailyWork());
			//thefoot.getFootball();
			TennisCoach1 theCoach1=ctx.getBean(TennisCoach1.class);
			System.out.println(theCoach1.getDailyWork());
			System.out.println(theCoach1.getDailyFortune());
			
			//((AbstractApplicationContext) ctx).close();
	}

}
