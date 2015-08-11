package spring.domain;

import java.util.List;

public class QuestionManage {
	//�����ڵ�, ť�������ڵ�, ���� ����, ��ǰ���� 
	private int questionCode;
	private int curatingCode;
	private String questionText;
	private String prodKind;
	private List<AnswerManage> answers;
	private String answerFormat;
	
	public QuestionManage() {}
	
	
	public String getProdKind() {
		return prodKind;
	}
	public void setProdKind(String prodKind) {
		this.prodKind = prodKind;
	}
	public int getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(int questionCode) {
		this.questionCode = questionCode;
	}
	public int getCuratingCode() {
		return curatingCode;
	}
	public void setCuratingCode(int curatingCode) {
		this.curatingCode = curatingCode;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getQuestionProdKind() {
		return prodKind;
	}
	public void setQuestionProdKind(String prodKind) {
		this.prodKind = prodKind;
	}
	public List<AnswerManage> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerManage> answers) {
		this.answers = answers;
	}
	public String getAnswerFormat() {
		return answerFormat;
	}
	public void setAnswerFormat(String answerFormat) {
		this.answerFormat = answerFormat;
	}

	@Override
	public String toString() {
		return "QuestionManage [questionCode=" + questionCode
				+ ", curatingCode=" + curatingCode + ", questionText="
				+ questionText + ", prodKind=" + prodKind + ", answers="
				+ answers + ", answerFormat=" + answerFormat + "]";
	}
	
	
}
