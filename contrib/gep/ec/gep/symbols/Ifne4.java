package ec.gep.symbols;

import ec.gep.GEPFunctionSymbol;

/**
 * If (a != b) then c else d
 */

public class Ifne4 extends GEPFunctionSymbol {

	/**
	 * If (a != b) then c else d
	 */
	public Ifne4() 
	{
		super("ifne4", 4);
	}

	/**
	 * Evaluate Ifne4 with the 4 parameters a, b, c, d such that
	 * If (a != b) then c else d.
	 * 
	 * @param params double array with the required parameter(s)
	 * @return Ifne4(params[0], params[1], params[2], params[3])
	 */
	public double eval(double params[]) 
	{
		//should check that there are 4 params
		double p1 = params[0];
		double p2 = params[1];
		double p3 = params[2];
		double p4 = params[3];
		return (p1 != p2) ? p3 : p4;
	}
	
	/**
	 * Ifne4 is not a logical function.
	 * @return false
	 */
	public boolean isLogicalFunction()
	{
		return false;
	}

	/**
	 * The human readable form of the expression
	 */
	public String getMathExpressionAsString( String p[] )
	{
		return "ifne4(" + p[0] + ", " + p[1] + ", " + p[2] + ", " + p[3] + ")";
	}
}
