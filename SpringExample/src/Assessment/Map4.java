package Assessment;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map4 {
	public Map4(int qid, String question, Map<String,String> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	int qid;
	String question;
	Map<String, String> answers;
	public void displayAnswers() {
		System.out.println("QId: "+qid +"Question: "+question);
		Set entry=answers.entrySet();
		Iterator itr=entry.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> m1=(Entry<String, String>) itr.next();
			System.out.println(m1.getValue()+"  Answered :"+m1.getKey());
		}
		
	}
}
