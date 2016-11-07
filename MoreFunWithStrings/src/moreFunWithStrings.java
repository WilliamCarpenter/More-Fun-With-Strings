import java.util.Scanner;

public class moreFunWithStrings
	{
		public static void main(String[] args)
		{
			exerciseOne();
			System.out.println();
			exerciseTwo();
			System.out.println();
			exerciseThree();
		}
		public static void exerciseOne()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, what is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + ".");
		}
		public static void exerciseTwo()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please type in a complete sentence of at least five words. Do not include punctuation.");
			String sentence = userInput.nextLine();
			System.out.println(sentence.replace(" ",""));
			System.out.println("The number of characters is " + sentence.length() + ".");
			int counter2 = 0;
			for (int i = 0; i < sentence.length(); i++)
				{
					switch (sentence.substring(i, i + 1))
								{
									case " ":
											{
												break;
											}
									default:
											{
												counter2++;
											}
								}
				}
			System.out.println("The number of letters is " + counter2 + ".");
			
			
//			String characterNumber = 
//			System.out.println("The number of characters is " + characterNumber + ".");
			int counter = 0;
			
			for (int i = 0; i < sentence.length(); i++)
				{
					switch (sentence.substring(i, i + 1))
					{
						case "a":
						case "e":
						case "i":
						case "o":
						case "u":
						case "A":
						case "E":
						case "I":
						case "O":
						case "U":
								{
									counter++;
									break;
								}
						
							
					}
								
				}
			if (counter == 1)
				{
			System.out.println("You have " + counter + " vowel.");
				}
			else
				{
				System.out.println("You have " + counter + " vowels");
				}
			int counter3 = 0;
			for (int i = 0; i < sentence.length(); i++)
				{
					switch (sentence.substring(i, i + 1))
					{
						case "a":
						case "e":
						case "i":
						case "o":
						case "u":
						case "A":
						case "E":
						case "I":
						case "O":
						case "U":
						case " ":
								{
									break;
								}
						default:
								{
									counter3++;
									break;								}
					}
				}
			System.out.println("You have " + counter3 + " consonants.");
			
			
		}
		public static void exerciseThree()
			{
				String s = "Mullen High School";
				for (int i = 0 ; i < s.length(); i++)
					{
						System.out.println(s.substring(0, i + 1));

					}
			}
		}
	
