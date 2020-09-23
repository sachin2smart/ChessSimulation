package in.sachinshinde.chess.simulation;

import java.util.ArrayList;
import java.util.List;

import in.sachinshinde.chess.Rules.URules;
import in.sachinshinde.chess.model.Direction;
import in.sachinshinde.chess.model.Pieces;

public class SimulateMoves {
	
	public static List<String> getSimulatedMoves(String piece, String position){
		Pieces pieces = new Pieces();
		URules uRules = new URules();
		List<String> moves = new ArrayList<String>();
		List<Direction> directionList = pieces.getMoves(piece);
//		directionList.forEach(System.out::println);
		if(directionList.contains(Direction.UU)) {
			moves.addAll(uRules.getUUmoves(position));
		}
		
		return moves;
	}

}
