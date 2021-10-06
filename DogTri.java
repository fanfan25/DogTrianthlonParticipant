// exercise on pages 269 - 272


public class DogTri
{
	private final int NUM_EVENTS;
	// this varuable is shared objects of this class 

	private static int totalCumulativeScore = 0;
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	private boolean doScoreAgree;


	//constructor method for this class
	public DogTri(String name, int numEvents, int score1, int score2, int score3)
	{
		this.name = name;
		NUM_EVENTS = numEvents;
		int totalNot0 = 0;
		// check each score parameter and mark  if we don't find a zero
	
		if(score1 != 0)
		{
			totalNot0 = totalNot0 + 1;
		}
		if(score2 != 0)
		{
			totalNot0 = totalNot0 + 1;
		}
		if(score3 != 0)
		{
			totalNot0 = totalNot0 + 1;
		}

		//does Num_EVENTS match the total not0?
		if(NUM_EVENTS == totalNot0)
		{
			obedienceScore = score1;
			conformationScore = score2;
			agilityScore = score3;
		}
		if(numEvents == totalNot0)
		{
			doScoreAgree = true;
		}
		else
		{
			doScoreAgree = false;
		}

		if(doScoreAgree)
		{
		obedienceScore = score1;
		conformationScore = score2;
		agilityScore = score3;

		}
		else
		{
			obedienceScore = 0;
			conformationScore = 0;
			agilityScore = 0;
		}

		if(!doScoreAgree)
		{
			System.out.print("\nNotice! Number of events for " + name + "does not agree  with score reported.");
		}
		total = obedienceScore + conformationScore + agilityScore;
		if(NUM_EVENTS == 0)
		{
			avg = 0;
		}
		else
		{
		avg = (double) total / NUM_EVENTS;
	    }
		totalCumulativeScore = totalCumulativeScore + total;

	}

	public void display()
	{
		System.out.println();
		System.out.println(name + " particited in " + NUM_EVENTS + " events and has an average score of: " + avg);

		System.out.println(" " + name + " has a total average of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
	}
}