package Admin.model;

public class QnA {
	private	  int qna_no;
	private	String qna_category;
	private	String qna_qustion;
	private	String qna_answer;
	
	public QnA(int qna_no, String qna_category, String qna_qustion, String qna_answer) {
		super();
		this.qna_no = qna_no;
		this.qna_category = qna_category;
		this.qna_qustion = qna_qustion;
		this.qna_answer = qna_answer;
	}

	public int getQna_no() {
		return qna_no;
	}

	public void setQna_no(int qna_no) {
		this.qna_no = qna_no;
	}

	public String getQna_category() {
		return qna_category;
	}

	public void setQna_category(String qna_category) {
		this.qna_category = qna_category;
	}

	public String getQna_qustion() {
		return qna_qustion;
	}

	public void setQna_qustion(String qna_qustion) {
		this.qna_qustion = qna_qustion;
	}

	public String getQna_answer() {
		return qna_answer;
	}

	public void setQna_answer(String qna_answer) {
		this.qna_answer = qna_answer;
	}

	public QnA() {
		super();
	}

	
	
}
