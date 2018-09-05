import java.util.*;
class Card
{
	private final String face;
	private final String suit;
	
	Card(String face, String suit)
	{
		this.face=face;
		this.suit=suit;
	}
	void PRINT()
	{
		System.out.println(face+" of "+suit);
	}
}

class DeckOfCards
{
	final int NUMBER_OF_CARDS;
	int currentCard;
	Card deck[];

	DeckOfCards()
	{
		NUMBER_OF_CARDS=52;
		deck = new Card[NUMBER_OF_CARDS];
		for(int i=0;i<NUMBER_OF_CARDS;i++)
		{
			if(i<13)
			{
				deck[i]=new Card(String.valueOf(i+1), "SPADES");
			}
			else if((i>=13) && (i<26))
			{
				deck[i]=new Card(String.valueOf(i-12), "HEARTS");
			}
			else if((i>=26) && (i<39))
			{
				deck[i]=new Card(String.valueOf(i-25), "DIAMONDS");
			}
			else
			{
				deck[i]=new Card(String.valueOf(i-38), "CLUBS");
			}
		}
	}
	void Shuffle()
	{
		Random rnd = new Random();
		for (int i = NUMBER_OF_CARDS-1; i > 0; i--)
		{
			int index = rnd.nextInt(i + 1);

			Card a = deck[index];
			deck[index] = deck[i];
			deck[i] = a;
		}
	}
	void dealCard()
	{
		for(int i=0;i<NUMBER_OF_CARDS;i++)
		{
			deck[i].PRINT();
		}
	}
}

class Assignment_8_2_1601cs41
{
	
	public static void main(String args[])
	{
		DeckOfCards obj = new DeckOfCards();
		System.out.println("\n\nOriginal Deck");
		obj.dealCard();
		System.out.println("\n\nShuffled Deck");
		obj.Shuffle();
		obj.dealCard();
	}
	
}