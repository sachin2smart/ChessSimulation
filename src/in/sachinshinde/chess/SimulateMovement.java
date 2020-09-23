package in.sachinshinde.chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import in.sachinshinde.chess.simulation.SimulateMoves;
import in.sachinshinde.chess.validation.Validate;

public class SimulateMovement {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Specify the Piece:");
		String piece = br.readLine();
		
		if(!Validate.isVlaidPiece(piece))
			return;
		
		System.out.println("Specify the Position:");
		String position = br.readLine();
		
		if(!Validate.isVlaidPosition(position))
			return;
		
		List<String> possibleMoves = SimulateMoves.getSimulatedMoves(piece, position);
		System.out.println("Possible Moves are:");
		possibleMoves.stream()
			.forEach(k -> {System.out.print(k+" ");});
	}

	
}
