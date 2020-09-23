package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

// Up Rules 
public class URules {
	
	// Up Unlimited moves
	public List<String> getUUmoves(String position){
		List<String> uuMoves = new ArrayList<String>();
		String member = String.valueOf(position.charAt(0));
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		for(pointer = pointer+1; pointer<=8; pointer++) {
			uuMoves.add(member + String.valueOf(pointer));
		}
		return uuMoves;
	}
}
