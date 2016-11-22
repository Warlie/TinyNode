package tinyNode.data.vCard;

import java.util.HashMap;


public class VCard{

	private HashMap<String,PersonIDComponent> body;
	
	public VCard ()
	{
		body = new HashMap<String,PersonIDComponent>(51);
	}
	
	public VCard (
			String given, 
			String surname, 
			String additional, 
			String prefix, 
			String postfix)
	{
		body = new HashMap<String,PersonIDComponent>(51);
		body.put("N", new VCN(given,surname,additional,prefix,postfix));
	}


	private PersonIDComponent createIDComponent(String identifier) throws IdentifierIsNotSupportedException
	{
		switch(identifier)
		{
		case "n":
		return new VCN();
		
		default:
			throw new IdentifierIsNotSupportedException();
		
		}
	}
	//TODO need to be fit for more deep
	public void set(String ident, Object value) throws IdentifierIsNotSupportedException, ClassCastException
	{
		String[] solve = ident.split(".");
		if(body.containsKey(solve[0]))
			body.put(solve[0], createIDComponent(solve[0]));
		
		body.get(solve[0]).set(solve[1], value);		
		
		
	}

}
