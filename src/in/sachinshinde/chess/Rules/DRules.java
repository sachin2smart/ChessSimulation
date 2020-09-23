package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

// Down Rules
public class DRules {

	// Down Unlimited moves
	public List<String> getDUmoves(String position){
		List<String> dMoves = new ArrayList<String>();
		String member = String.valueOf(position.charAt(0));
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		for(pointer = pointer-1; pointer>=1; pointer--) {
			dMoves.add(member + String.valueOf(pointer));
		}
		return dMoves;
	}
	
	// Down by 1 
	public List<String> getD1moves(String position){
		List<String> dMoves = new ArrayList<String>();
		String member = String.valueOf(position.charAt(0));
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		pointer = pointer-1;
		if(pointer>=1)
			dMoves.add(member + String.valueOf(pointer));
		return dMoves;
	}
	
}
