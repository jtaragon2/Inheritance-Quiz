import java.util.*;

public class Runner
	{
		static ArrayList<Question> qList = new ArrayList<Question>();
		static Scanner stringGetter = new Scanner(System.in);
		static int numOfCorrect = 0;
		static double numCorrect;
		
		public static void main(String[] args)
			{
				// codeTester();
				qListFiller();
				quizUser();
			}
			
		private static void qListFiller()
			{
				qList.add(new Question("CentralProcessingUnit cpu1 = new CentralProcessingUnit();",
						"'cpu1.runInstruction();'",
						"A. 'It is done'\nB. 'No'\nC. 'I don't want to'\nD. It won't output/error", "a"));
				qList.add(new Question("CentralProcessingUnit cpu1 = new CentralProcessingUnit();",
						"'cpu1.processCenter();'",
						"A. 'It's on fire'\nB. 'No, I refuse'\nC. 'I don't want to'\nD. It won't output/error", "a"));
				qList.add(new Question("CentralProcessingUnit cpu1 = new CentralProcessingUnit();",
						"'cpu1.addressMemory();'",
						"A. 'It is done'\nB. 'Hello, Memory'\nC. 'I don't want to'\nD. It won't output/error", "d"));
				qList.add(new Question("CentralProcessingUnit cpu1 = new X86();", "'cpu1.runInstruction();'",
						"A. 'It is done'\nB. 'No'\nC. 'It's time to get funky'\nD. It won't output/error", "c"));
				qList.add(new Question("CentralProcessingUnit cpu1 = new X86();", "'cpu1.processCenter();'",
						"A. 'It's on fire'\nB. 'Wow, look at that round center'\nC. 'I don't want to'\nD. It won't output/error",
						"a"));
				qList.add(new Question("CentralProcessingUnit cpu1 = new X86();", "'cpu1.addressMemory();'",
						"A. 'What is the up'\nB. 'Nah'\nC. 'Hello. Memory'\nD. It won't output", "d"));
				qList.add(new Question("X86 cpu1 = new CentralProcessingUnit();", "'cpu1.runInstruction();'",
						"A. 'It is done'\nB. 'It's time to get funky'\nC. 'I don't want to'\nD. It won't output", "d"));
				qList.add(new Question("X86 cpu1 = new CentralProcessingUnit();", "'cpu1.processCenter();'",
						"A. 'It is done'\nB. 'No'\nC. 'I don't want to'\nD. It won't output", "d"));
				qList.add(new Question("X86 cpu1 = new CentralProcessingUnit();", "'cpu1.addressMemory();'",
						"A. 'It is done'\nB. 'No'\nC. 'I don't want to'\nD. It won't output", "d"));
				qList.add(new Question("X86 cpu1 = new X86();", "'cpu1.runInstruction();'",
						"A. 'It's time to get funky'\nB. 'It is done'\nC. 'I don't want to'\nD. It won't output", "a"));
				qList.add(new Question("X86 cpu1 = new X86();", "'cpu1.processCenter();'",
						"A. 'It is done'\nB. 'It won't output/error'\nC. 'It's beginning to look a lot like christmas'\nD. It's on fire",
						"d"));
				qList.add(new Question("X86 cpu1 = new X86();", "'cpu1.addressMemory();'",
						"A. 'Hello World'\nB. 'No, they're boring'\nC. 'Hello, Memory'\nD. Superhappyfuntimes", "c"));
				
			}
			
		private static void quizUser()
			{
				for (int i = 0; i < 12; i++)
					{
						int index = (int) (Math.random() * 12);
						if (qList.get(index).notUsed())
							{
								qList.get(index).setUsed(false);
								System.out.println(i + 1 + ". For the instantiation, " + qList.get(index).getType()
										+ " what would the method call " + qList.get(index).getQuestion() + " return?");
								System.out.println(qList.get(index).getAnswers());
								String tempAnswer = stringGetter.nextLine();
								qList.get(index).setCorrect(qList.get(index).getCorrectAnswer()
										.equalsIgnoreCase(tempAnswer.substring(0, 1)));
								
							}
						else
							{
								i--;
							}
					}
				getCorrectPercentage(qList);
				System.out.println("You got " + numOfCorrect + " of " + qList.size() + " correct");
				System.out.println("That's " + numCorrect + "%");
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
			
		private static void codeTester()
			{
				CentralProcessingUnit cpu1 = new X86();
				
				cpu1.runInstruction();
			}
	}
