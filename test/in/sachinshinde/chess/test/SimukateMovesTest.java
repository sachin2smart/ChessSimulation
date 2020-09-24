package in.sachinshinde.chess.test;

import java.util.ArrayList;
import java.util.List;

import in.sachinshinde.chess.simulation.SimulateMoves;

public class SimukateMovesTest {
	
	public static void test() {
		List<String> movesByProgram = SimulateMoves.getSimulatedMoves("Horse", "H8");
		
		List<String> expectedMoves = new ArrayList<>();
		expectedMoves.add("F7");
		expectedMoves.add("G6");
		
		for(String move : expectedMoves) {
			if(!movesByProgram.contains(move))
				System.out.println("Failure");
		}
		
		System.out.println("Success");
	}
	
	public static void main(String args[]) {
		test();
	}
}
