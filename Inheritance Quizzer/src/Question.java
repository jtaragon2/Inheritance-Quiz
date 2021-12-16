
public class Question
	{
		private String type;
		private String question;
		private String answers;
		private String correctAnswer;
		private boolean isUsed = true;
		private boolean isCorrect;
		public Question(String t, String q, String a, String cA) {
			type = t;
			question = q;
			answers = a;
			correctAnswer=cA;
		}
		public String getType()
			{
				return type;
			}
		public void setType(String type)
			{
				this.type = type;
			}
		public String getQuestion()
			{
				return question;
			}
		public void setQuestion(String question)
			{
				this.question = question;
			}
		public String getAnswers()
			{
				return answers;
			}
		public void setAnswers(String answers)
			{
				this.answers = answers;
			}
		public String getCorrectAnswer()
			{
				return correctAnswer;
			}
		public void setCorrectAnswer(String correctAnswer)
			{
				this.correctAnswer = correctAnswer;
			}
		public boolean notUsed()
			{
				return isUsed;
			}
		public void setUsed(boolean isUsed)
			{
				this.isUsed = isUsed;
			}
		public boolean isCorrect()
			{
				return isCorrect;
			}
		public void setCorrect(boolean isCorrect)
			{
				this.isCorrect = isCorrect;
			}
	}
