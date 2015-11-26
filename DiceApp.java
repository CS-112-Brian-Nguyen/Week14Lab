public class DiceApp
{

	public static void main(String[] args)
	{
		ThreeDice dice = new ThreeDice();
		Dice d = new Dice();
		
		int i = d.Throw();
		int iThrow = dice.Throw();
		System.out.println("Dice value = " + iThrow);
		//System.out.println("dice.toString() =  " + dice.toString() ); //Using inheritance all along
		//Every java method extends from the object "Object" 
		//Doesn't know anything about ThreeDice so just returns ThreeDice and its location
		System.out.println("dice.toString() = " + dice.toString() );
		System.out.println("dice = " + dice);
		System.out.println("d.toString() = " + d.toString() );
	}

}