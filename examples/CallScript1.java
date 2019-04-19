import bsh.*;

public class CallScript1 {
	public static void main( String [] args ) throws EvalError {
		Object result = new bsh.Interpreter().source("myscript.bsh");
	}
}
