package springexamples;

import java.util.Iterator;
import java.util.List;

public class QuestionBank {
	public QuestionBank(int qid, String question, List<String> answers) {
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
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	int qid;
	String question;
	List<String> answers;
	public void showAnswer() {
		System.out.println("QId: "+qid +"Question: "+question);
		Iterator itr=answers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
