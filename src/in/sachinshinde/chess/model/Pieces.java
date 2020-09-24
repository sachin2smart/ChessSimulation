package in.sachinshinde.chess.model;

import java.util.ArrayList;
import java.util.List;

public class Pieces implements Moves{
	private static final String King = "King";
	private static final String Queen = "Queen";
	private static final String Bishop = "Bishop";
	private static final String Horse = "Horse";
	private static final String Rook = "Rook";
	private static final String Pawn = "Pawn";
	
	public static final List<String> getValidPieces(){
		List<String> validPieces = new ArrayList<>();
		validPieces.add(King);
		validPieces.add(Queen);
		validPieces.add(Bishop);
		validPieces.add(Horse);
		validPieces.add(Rook);
		validPieces.add(King);
		return validPieces;
	}
	
	public List<Direction> getMoves(String piece){
		switch(piece) 
		{
			case King:
				return kingMoves();
			
			case Queen:
				return QueenMoves();
				
			case Bishop:
				return BishopMoves();
				
			case Horse:
				return HorseMoves();
				
			case Rook:
				return RookMoves();
				
			case Pawn:
				return PawnMoves();
				
			default:
				return null;
		}
	}
	
	@Override
	public List<Direction> kingMoves() {
		List<Direction> kingMoves = new ArrayList<>();
		kingMoves.add(Direction.D1);
		kingMoves.add(Direction.U1);
		kingMoves.add(Direction.L1);
		kingMoves.add(Direction.R1);
		kingMoves.add(Direction.DG1);
		return kingMoves;
	}
	
	@Override
	public List<Direction> QueenMoves() {
		List<Direction> queenMoves = new ArrayList<>();
		queenMoves.add(Direction.DU);
		queenMoves.add(Direction.UU);
		queenMoves.add(Direction.LU);
		queenMoves.add(Direction.RU);
		queenMoves.add(Direction.DG);
		return queenMoves;
	}
	
	@Override
	public List<Direction> BishopMoves() {
		List<Direction> bishopMoves = new ArrayList<>();
		bishopMoves.add(Direction.DG);
		return bishopMoves;
	}
	
	@Override
	public List<Direction> HorseMoves() {
		List<Direction> horseMoves = new ArrayList<>();
		horseMoves.add(Direction.TH);
		return horseMoves;
	}
	
	@Override
	public List<Direction> RookMoves() {
		List<Direction> rookMoves = new ArrayList<>();
		rookMoves.add(Direction.DU);
		rookMoves.add(Direction.UU);
		rookMoves.add(Direction.LU);
		rookMoves.add(Direction.RU);
		return rookMoves;
	}
	
	// TODO : Decide opponent moves
	@Override
	public List<Direction> PawnMoves() {
		List<Direction> pawnMoves = new ArrayList<>();
		pawnMoves.add(Direction.U1);
		pawnMoves.add(Direction.D1);
		return pawnMoves;
	}
	
	
}
