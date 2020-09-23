package in.sachinshinde.chess.validation;

import java.util.Optional;

import in.sachinshinde.chess.model.Pieces;
import in.sachinshinde.chess.model.ValidPositions;

public class Validate {

	public static boolean isVlaidPiece(String piece) {
		Optional<String> isValidPiece = Pieces.getValidPieces().stream()
				.filter(k -> k.equals(piece))
				.findAny();
		if(!isValidPiece.isPresent()) {
			System.out.println("Invalid piece, Please re-run !!");
			return false;
		}
		return true;
	}
	
	public static boolean isVlaidPosition(String position) {
		Optional<String> isValidPiece = ValidPositions.getValidPostions().stream()
				.filter(k -> k.equals(position))
				.findAny();
		if(!isValidPiece.isPresent()) {
			System.out.println("Invalid Position, Please re-run !!");
			return false;
		}
			
		return true;
	}
}
