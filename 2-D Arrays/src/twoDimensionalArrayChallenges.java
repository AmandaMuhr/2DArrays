
public class twoDimensionalArrayChallenges
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				extraCreditChallenge();
			}
		
		public static void challengeOne()
			{
				int [][] challengeOneArray = new int [3] [2];
				challengeOneArray [0][0] = 10;
				challengeOneArray [1][0] = 30;
				challengeOneArray [2][0] = 50;
				challengeOneArray [0][1] = 20;
				challengeOneArray [1][1] = 40;
				challengeOneArray [2][1] = 60;
				
				System.out.println(challengeOneArray[2][1]);
				
				
			}
		
		public static void challengeTwo()
			{
				String [][] challengeTwoArray = new String [4][3];
				
				for (int row = 0; row < 4; row++)
					{
						System.out.println("  ");
						for (int col = 0; col < 3; col++)
							{
								challengeTwoArray [row][col] = "MHS";
								System.out.print(challengeTwoArray[row][col] + "  ");
							}
					}
				System.out.println("  ");
				System.out.println("  ");
			}
		
		public static void challengeThree()
			{
				int number = 1;
				int [][] challengeThreeArray = new int [3][3];
				
				for (int row = 0; row < 3; row++)
					{
						
						for (int col = 0; col < 3; col++)
							{
								challengeThreeArray [row][col] = number;
								System.out.print(challengeThreeArray[row][col] + " ");
								number++;
							}
						System.out.println("  ");
					}
				
				int sumOfCorners = (challengeThreeArray[0][0] + challengeThreeArray[0][2] + challengeThreeArray[2][0] + challengeThreeArray[2][2]);
			
				System.out.println("The sum of this box's corners  is " + sumOfCorners);
				System.out.println("  ");
			}
		
		public static void extraCreditChallenge()
			{
				int number = 1;
				int total = 0;
				int [][][] array = new int [3][3][3]; 
				
				for (int row = 0; row < 3; row++)
					{
						for (int col = 0; col < 3; col++)
							{
								for (int depth = 0; depth < 3; depth++)
									{
										array[row][col][depth] = number;
										System.out.print(array[row][col][depth] + "  ");
										total += number;
										number++;
										
									}
						System.out.println("  ");
							}
						System.out.println("  ");
					}
				
				System.out.println("The sum of all these numbers is " + total);
				
			}

	}
