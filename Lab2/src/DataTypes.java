public class DataTypes {
	public int intVar;
	public double doubleVar;
	public char charVar;
	public boolean boolVar;
	public ClassA varA;

	public DataTypes() {
	}
	public boolean equals(DataTypes otherObject) {
        if (this.intVar != otherObject.intVar 
            || this.doubleVar != otherObject.doubleVar 
            || this.charVar != otherObject.charVar 
            || this.boolVar != otherObject.boolVar 
            || !this.varA.equals(otherObject.varA)) {
            return false;
        }
        return true;
    }

	public DataTypes(int newIntVar, double newDoubleVar, char newCharVar, boolean newBoolVar, ClassA newVarA) {
		intVar = newIntVar;
		doubleVar = newDoubleVar;
		charVar = newCharVar;
		boolVar = newBoolVar;
		varA = newVarA;
	}
}
