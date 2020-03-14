package settersExamples;

import java.util.Iterator;
import java.util.List;

public class TestQB {
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
		String id,name;
		List<String> answers;
	public void showdisplay() {
		System.out.println(id+" "+name);
		Iterator itr=answers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
