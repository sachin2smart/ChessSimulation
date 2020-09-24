package in.sachinshinde.chess.simulation;

import java.util.ArrayList;
import java.util.List;

import in.sachinshinde.chess.Rules.DG1Rules;
import in.sachinshinde.chess.Rules.DGRules;
import in.sachinshinde.chess.Rules.DRules;
import in.sachinshinde.chess.Rules.LRules;
import in.sachinshinde.chess.Rules.RRules;
import in.sachinshinde.chess.Rules.THRules;
import in.sachinshinde.chess.Rules.URules;
import in.sachinshinde.chess.model.Direction;
import in.sachinshinde.chess.model.Pieces;

public class SimulateMoves {
	
	public static List<String> getSimulatedMoves(String piece, String position){
		Pieces pieces = new Pieces();
		URules uRules = new URules();
		DRules dRules = new DRules();
		LRules lRules = new LRules();
		RRules rRules = new RRules();
		DGRules dgRules = new DGRules();
		DG1Rules dg1Rules = new DG1Rules();
		THRules thRules = new THRules();
		
		List<String> moves = new ArrayList<String>();
		List<Direction> directionList = pieces.getMoves(piece);
		
//		directionList.forEach(System.out::println);
		
		if(directionList.contains(Direction.UU)) 
			moves.addAll(uRules.getUUmoves(position));
		if(directionList.contains(Direction.U1)) 
			moves.addAll(uRules.getU1moves(position));
		
		if(directionList.contains(Direction.DU)) 
			moves.addAll(dRules.getDUmoves(position));
		if(directionList.contains(Direction.D1)) 
			moves.addAll(dRules.getD1moves(position));
		
		if(directionList.contains(Direction.LU)) 
			moves.addAll(lRules.getLUmoves(position));
		if(directionList.contains(Direction.L1)) 
			moves.addAll(lRules.getL1moves(position));
		
		if(directionList.contains(Direction.RU)) 
			moves.addAll(rRules.getRUmoves(position));
		if(directionList.contains(Direction.R1)) 
			moves.addAll(rRules.getR1moves(position));
		
		if(directionList.contains(Direction.DG)) 
			moves.addAll(dgRules.getDGmoves(position));
		
		if(directionList.contains(Direction.DG1)) 
			moves.addAll(dg1Rules.getDG1moves(position));
		
		if(directionList.contains(Direction.TH)) 
			moves.addAll(thRules.getTHmoves(position));
		
		return moves;
	}

}