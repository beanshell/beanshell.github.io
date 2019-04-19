import bsh.*;

public class CallScript2 {
	public static void main( String [] args ) throws Exception {
		try {
			Object obj = new bsh.Interpreter().source("myscript.bsh");
		} catch ( TargetError e ) {
			System.out.println(
				"The script or code called by the script threw an exception: "
				+ e.getTarget() );
		} catch ( EvalError e2 ) 	{
			System.out.println(
				"There was an error in evaluating the script:" + e2 );
		}
	}
}
