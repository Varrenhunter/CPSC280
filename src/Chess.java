/**
 * This code is created to determine whether a King on a 8x8 chess-board is in check.
 * This excludes multiple pieces checking a king and both kings being in check.
 * @author Ethan Farthing
 * @version 0.01
 *
 */
public class Chess {

	/**
	 * This checks a character value to determine whether it is a black king.
	 * @param spot-Character value that is being checked for being a king.
	 * @return boolean-true if the character is k, false if anything else.
	 */
	private boolean hasBlackKing(char spot){
		if(spot == 'k'){
			return true;
		}
		return false;
	}
	/**
	 * This checks a character value to determine whether it is a white king.
	 * @param spot-Character value that is being checked for being a white king.
	 * @return boolean - true if the character is K, false if anything else.
	 */
	private boolean hasWhiteKing(char spot){
		if(spot == 'K'){
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param board-2D array that is made up of character values.
	 * @return boolean-true if there is a 'K' (white king) in the movement area of the pawn. False
	 * if there is not.
	 */
	private boolean blackPawnChecksKing(char[][] board){
		return true;
	}
	/**
	 * 
	 * @param board-2D array that is made up of character values.
	 * @return boolean-true if there is a 'K' (black king) in the movement area of the pawn. False
	 * if there is not.
	 */
	private boolean whitePawnChecksKing(char[][] board){
		return true;
	}
	/**
	 * This is the main method of the program, that determines whether a king is in check on the
	 * input board.
	 * @param board-2D array that is made up of character values.
	 * @return char- character returned determines whether there is a checked black king ('k'),
	 * a checked white king ('K'), or whether there is no checked king ('-').
	 */
	public static char getCheck(char[][] board){
		return '0';
	}
	
}
