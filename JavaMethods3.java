package Methods3;
import java.util.Random;



public class JavaMethods3 {
//TASK1
	
	
	public static void main1 (String[] args) {
		
	}
	
		int a = (int) (Math.random()*(6+1)) +15; //number of symbols
	
		
		String [] RanWord = generateRandomWords(a);	
		
		
		
		
			public static String[] generateRandomWords(int numberOfWords)
			{
			    String[] randomStrings = new String[numberOfWords];
			    Random random = new Random();
			    for(int i = 0; i < numberOfWords; i++)
			    {
			        char[] word = new char[random.nextInt(8)+3]; 
			        for(int j = 0; j < word.length; j++)
			        {
			            word[j] = (char)('a' + random.nextInt(26));
			        }
			        randomStrings[i] = new String(word);
			    }
			    return randomStrings;
			}
		
		
			for (int i = 0; i < RanWord.length; i++) {
				if (i == RanWord.length - 1) {
					System.out.print(RanWord[i]);
				} else {
					System.out.print(RanWord[i] + ",");
				}
			}
			System.out.println("]");
		}}
