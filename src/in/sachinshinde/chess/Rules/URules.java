package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

import in.sachinshinde.chess.model.Chess;

// Up Rules 
public class URules {
	
	// Up Unlimited moves
	public List<String> getUUmoves(String position){
		List<String> uMoves = new ArrayList<String>();
		String member = String.valueOf(position.charAt(0));
		int pointer = Integer.parseInt(String.valueOf(position.charAt(1)));
		for(pointer = pointer+1; pointer<=Chess.pointer; pointer++) {
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
		if(pointer<=Chess.pointer)
			uMoves.add(member + String.valueOf(pointer));
		return uMoves;
	}
}
