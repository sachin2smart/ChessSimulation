package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

// Left Rules 
public class LRules {
	
	// Left Unlimited moves
	public List<String> getLUmoves(String position){
		List<String> lMoves = new ArrayList<String>();
		char member = position.charAt(0);
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		for(member = (char) (member-1); member>='A'; member--) {
			lMoves.add(String.valueOf(member) + String.valueOf(pointer));
		}
		return lMoves;
	}
	
	// Left by 1 
	public List<String> getL1moves(String position){
		List<String> lMoves = new ArrayList<String>();
		char member = position.charAt(0);
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		member = (char) (member-1); 
		if(member>='A')
			lMoves.add(String.valueOf(member) + String.valueOf(pointer));
		return lMoves;
	}
	
}
