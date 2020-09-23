package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

// Up Rules 
public class URules {
	
	// Up Unlimited moves
	public List<String> getUUmoves(String position){
		List<String> uMoves = new ArrayList<String>();
		String member = String.valueOf(position.charAt(0));
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		for(pointer = pointer+1; pointer<=8; pointer++) {
			uMoves.add(member + String.valueOf(pointer));
		}
		return uMoves;
	}
	
	// Up by 1 
	public List<String> getU1moves(String position){
		List<String> uMoves = new ArrayList<String>();
		String member = String.valueOf(position.charAt(0));
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		pointer = pointer+1;
		if(pointer<=8)
			uMoves.add(member + String.valueOf(pointer));
		return uMoves;
	}
}
