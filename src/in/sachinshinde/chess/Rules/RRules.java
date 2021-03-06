package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

import in.sachinshinde.chess.model.Chess;

// Right Rules
public class RRules {
	
	// Right Unlimited moves
	public List<String> getRUmoves(String position){
		List<String> rMoves = new ArrayList<String>();
		char member = position.charAt(0);
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		for(member = (char) (member+1); member<=Chess.position; member++) {
			rMoves.add(String.valueOf(member) + String.valueOf(pointer));
		}
		return rMoves;
	}
	
	// Right by 1 
	public List<String> getR1moves(String position){
		List<String> rMoves = new ArrayList<String>();
		char member = position.charAt(0);
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		member = (char) (member+1); 
		if(member<=Chess.position)
			rMoves.add(String.valueOf(member) + String.valueOf(pointer));
		return rMoves;
	}
	
}
