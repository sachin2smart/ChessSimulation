package in.sachinshinde.chess.model;

public enum Direction {
	UU("Up", "Unlimited"),	//	Up unlimited 
	DU("Down", "Unlimited"),	//	Down Unlimited	
	LU("Left", "Unlimted"),	// 	Left Unlimited
	RU("Right", "Unlimited"),	//	Right Unlimited
	U1("Up", "One"),	//	Up by 1
	D1("Down", "One"),	//	Down by 1
	L1("Left", "One"),	//	Left by 1
	R1("Right", "One"),	//	Right by 1
	DG("Diagonal", "Any"), // Diagonal at any direction
	DG1("Diagonal", "One"), // Diagonal at any direction by 1
	TH("Two", "Half");	//	Two and half 
	
	private final String movement;
	private final String projection;
	
	Direction(String movement, String projection){
		this.movement = movement;
		this.projection = projection;
	}
}
