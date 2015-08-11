package spring.domain;

public class AnswerManage {
	
	//답변코드, 답변문장, 답변키워드, 질문코드
	private int answerCode;
	private String answerText;
	private String answerKeyword;
	private int questionCode;
	
	public AnswerManage() {}
	public int getAnswerCode() {
		return answerCode;
	}
	public void setAnswerCode(int answerCode) {
		this.answerCode = answerCode;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public String getAnswerKeyword() {
		return answerKeyword;
	}
	public void setAnswerKeyword(String answerKeyword) {
		this.answerKeyword = answerKeyword;
	}
	public int getQuestionCode() {
		return questionCode;
	}
	public void setQuestionCode(int questionCode) {
		this.questionCode = questionCode;
	}
	@Override
	public String toString() {
		return "AnswerManage [answerCode=" + answerCode + ", answerText="
				+ answerText + ", answerKeyword=" + answerKeyword
				+ ", questionCode=" + questionCode + "]";
	}
	
	
}
