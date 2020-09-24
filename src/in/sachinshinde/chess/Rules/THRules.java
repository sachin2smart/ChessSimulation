package in.sachinshinde.chess.Rules;

import java.util.ArrayList;
import java.util.List;

public class THRules {

	// Two and Half moves
	public List<String> getTHmoves(String position){
		List<String> thMoves = new ArrayList<String>();
		char memberVar = position.charAt(0);
		int pointerVar = Integer.parseInt(String.valueOf(position.charAt(1)));
		
		// 2.5 Right moves
		char memberRight = (char) (memberVar+2);
		if(memberRight<='H') {
			int pointerUp = pointerVar+1;
			int pointerDown = pointerVar-1;
			if(pointerUp<=8)
				thMoves.add(String.valueOf(memberRight) + String.valueOf(pointerUp));
			if(pointerDown>=1)
				thMoves.add(String.valueOf(memberRight) + String.valueOf(pointerDown));
		}

		// 2.5 Left moves
		char memberLeft = (char) (memberVar-2);
		if(memberLeft>='A') {
			int pointerUp = pointerVar+1;
			int pointerDown = pointerVar-1;
			if(pointerUp<=8)
				thMoves.add(String.valueOf(memberLeft) + String.valueOf(pointerUp));
			if(pointerDown>=1)
				thMoves.add(String.valueOf(memberLeft) + String.valueOf(pointerDown));
		}
		
		// 2.5 Up moves
		int pointerUp = pointerVar+2;
		if(pointerUp<=8) {
			memberLeft = (char) (memberVar-1);
			memberRight = (char) (memberVar+1);
			if(memberLeft>='A')
				thMoves.add(String.valueOf(memberLeft) + String.valueOf(pointerUp));
			if(memberRight<='H')
				thMoves.add(String.valueOf(memberRight) + String.valueOf(pointerUp));
		}
		
		// 2.5 Down moves
		int pointerDown = pointerVar-2;
		if(pointerUp>=1) {
			memberLeft = (char) (memberVar-1);
			memberRight = (char) (memberVar+1);
			if(memberLeft>='A')
				thMoves.add(String.valueOf(memberLeft) + String.valueOf(pointerDown));
			if(memberRight<='H')
				thMoves.add(String.valueOf(memberRight) + String.valueOf(pointerDown));
		}
		
		return thMoves;
	}
}
