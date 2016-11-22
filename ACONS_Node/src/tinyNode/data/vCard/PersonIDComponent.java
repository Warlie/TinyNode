package tinyNode.data.vCard;

import java.util.*;

public abstract class PersonIDComponent {

	private HashMap <String, String> index = new HashMap<String,String>(11); 
	/*
	public void getElement(String str, String elem )
	{
		
	}
	
	public String getElement(String str)
	{
		return null;
	}
	
	public Date getDateElement(String str)
	{
		return null;
	}
	
	*/
	
	protected void insertIndex(String identifier, String className)
	{
		index.put(identifier, className);
	}
	
	void set(String identifier, Object value)
	{
		if(index.containsKey(identifier))
		{
			if(value.getClass().getName().equals(index.get(identifier)) )
			{
				setIntern(identifier, value);
			}
			else throw new ClassCastException(
					"Value has class " + value.getClass().getName()
					+ " and must have " + index.get(identifier));
		}
		else
			throw new IdentifierIsNotSupportedException(identifier + " is not a valid identifier");
	}
	
	protected void setIntern(String identifier, Object value)
	{
		
	}
	
}
