import java.util.*;

public class Runner
	{
		static ArrayList<Question> qList = new ArrayList<Question>();
		static Scanner stringGetter = new Scanner(System.in);
		static int numOfCorrect = 0;
		static double numCorrect;

		public static void main(String[] args)
			{
				qListFiller();
				quizUser();
			}

		private static void qListFiller()
			{
				qList.add(new Question("CentralProcessingUnit cpu1 = new CentralProcessingUnit();",
						"'cpu1.runInstruction'", "A. 'It is done'\nB. 'No'\nC. 'I don't want to'\nD. It won't output",
						"a"));
			}

		private static void quizUser()
			{
				for (int i = 0; i < 12; i++)
					{
						int index = (int) (Math.random() * 12);
						if (qList.get(index).notUsed())
							{
								qList.get(index).setUsed(false);
								System.out.println(i + ". For the instantiation, " + qList.get(index).getType()
										+ " what would the method call " + qList.get(index).getQuestion() + " return?");
								System.out.println(qList.get(0).getAnswers());
								String tempAnswer = stringGetter.nextLine();
								qList.get(index).setCorrect(qList.get(index).getCorrectAnswer()
										.equalsIgnoreCase(tempAnswer.substring(0, 1)));

							} else
							{
								i--;
							}
					}
				getCorrectPercentage(qList);
				System.out.println("You got " + numOfCorrect + " of " + qList.size() + " correct");
			}

		private static void getCorrectPercentage(ArrayList<Question> list)
			{
				numOfCorrect = 0;
				numCorrect = 0;
				for (int i = 0; i < list.size(); i++)
					{
						if (list.get(i).isCorrect())
							{
								numCorrect++;
								numOfCorrect++;
							}
					}
				numCorrect = (numCorrect / list.size()) * 100;
			}
	}
