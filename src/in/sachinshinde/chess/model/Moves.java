package in.sachinshinde.chess.model;

import java.util.List;

public interface Moves {
	public abstract List<Direction> kingMoves();
	public abstract List<Direction> QueenMoves();
	public abstract List<Direction> BishopMoves();
	public abstract List<Direction> HorseMoves();
	public abstract List<Direction> RookMoves();
	public abstract List<Direction> PawnMoves();
}
