package RSA;
import java.math.*;
public class signature {
	
	private myPrivateKey privateKey;
	private BigInteger total=BigInteger.valueOf(0);
	private fastMod fm;
	public signature(myPrivateKey pk,String x)
	{
		privateKey=pk;
		for(int a=0;a<x.length();a++)
		{
			BigInteger letter = BigInteger.valueOf((long)(int)x.charAt(a));
			total=total.add(letter);
		}
	}
	
	
	public BigInteger generateSignature()
	{
		fm=new fastMod(total,privateKey.getD(),privateKey.getN());
		return fm.fastModding();
	}

}
