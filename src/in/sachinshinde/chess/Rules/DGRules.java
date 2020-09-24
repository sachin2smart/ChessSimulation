package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

import in.sachinshinde.chess.model.Chess;

// Diagonal Rules
public class DGRules {

	// Diagonal Unlimited moves
	public List<String> getDGmoves(String position){
		List<String> dgMoves = new ArrayList<String>();
		char memberVar = position.charAt(0);
		int pointerVar = Integer.parseInt(String.valueOf(position.charAt(1)));
		
		// both increasing
		for(int pointer = pointerVar+1; pointer<=Chess.pointer; pointer++) {
			for(char member = (char) (memberVar+1); member<=Chess.position; member++) {
				if(pointer<=Chess.pointer)
					dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
				pointer++;
			}
		}
		// both decreasing
		for(int pointer = pointerVar-1; pointer>=1; pointer--) {
			for(char member = (char) (memberVar-1); member>='A'; member--) {
				if(pointer>=1)
					dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
				pointer--;
			}
		}
		// char increasing, num decreasing
		for(int pointer = pointerVar-1; pointer>=1; pointer--) {
			for(char member = (char) (memberVar+1); member<=Chess.position; member++) {
				if(pointer>=1)
					dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
				pointer--;
			}
		}
		// char decreasing, num increasing
		for(int pointer = pointerVar+1; pointer<=Chess.pointer; pointer++) {
			for(char member = (char) (memberVar-1); member>='A'; member--) {
				if(pointer<=Chess.pointer)
					dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
				pointer++;
			}
		}
		
		return dgMoves;
	}
	
}
