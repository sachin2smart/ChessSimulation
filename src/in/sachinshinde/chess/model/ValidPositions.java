package in.sachinshinde.chess.model;

import java.util.ArrayList;
import java.util.List;

public class ValidPositions {
	public static final List<String> getValidPostions(){
		List<String> validPositions = new ArrayList<>();
		for(char block='A'; block <='H'; block++) 
			for(int i=1; i<=8; i++)
				validPositions.add(block+String.valueOf(i));
		
		return validPositions;
	}
}
