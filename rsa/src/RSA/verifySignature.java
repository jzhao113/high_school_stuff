package RSA;
import java.math.*;
public class verifySignature {
	
	private myPublicKey publicKey;
	private BigInteger signature;
	private fastMod fm;
	private BigInteger total=BigInteger.valueOf(0);
	
	public verifySignature(BigInteger sig, myPublicKey pk,String m)
	{
		publicKey =pk;
		signature =sig;
		for(int a=0;a<m.length();a++)
		{
			total=total.add(BigInteger.valueOf((long)(int)m.charAt(a)));
		}
	}
	
	public boolean isSignatureAuth()
	{
		fm =new fastMod(signature, publicKey.getE(),publicKey.getN());
		BigInteger total =fm.fastModding();
		if(total.compareTo(total)==0)
		{
			return true;
		}
		return false;
	}

}
