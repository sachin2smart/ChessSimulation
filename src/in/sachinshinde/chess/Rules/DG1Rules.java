package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

public class DG1Rules {

	// Diagonal Unlimited moves
	public List<String> getDG1moves(String position){
		List<String> dgMoves = new ArrayList<String>();
		char memberVar = position.charAt(0);
		int pointerVar = Integer.parseInt(String.valueOf(position.charAt(1)));
		
		// both increasing
		int pointer = pointerVar+1;
		char member = (char) (memberVar+1); ; 
		if(pointer<=8 && member<='H')
			dgMoves.add(String.valueOf(member) + String.valueOf(pointer));

		// both decreasing
		pointer = pointerVar-1;
		member = (char) (memberVar-1); ; 
		if(pointer>=1 && member>='A')
			dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
		
		// char increasing, num decreasing
		pointer = pointerVar-1;
		member = (char) (memberVar+1); ; 
		if(pointer>=1 && member<='H')
			dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
		
		// char decreasing, num increasing
		pointer = pointerVar+1;
		member = (char) (memberVar-1); ; 
		if(pointer<=8 && member>='A')
			dgMoves.add(String.valueOf(member) + String.valueOf(pointer));
		
		return dgMoves;
	}
	
}
