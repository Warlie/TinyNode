package tinyNode.data.vCard;

import java.util.*;

class VCN extends PersonIDComponent {

	String given;
	Vector<String> additional;
	Vector<String> surname;
	Vector<String> prefix;
	Vector<String> postfix;
	
	
	VCN()
	{
		given = "";
		additional = new Vector<String>();
		surname = new Vector <String>();
		prefix = new Vector <String>();
		postfix = new Vector <String>();
		
		this.insertIndex("given", "String");
		this.insertIndex("additional", "String");
		this.insertIndex("surname", "String");
		this.insertIndex("prefix", "String");
		this.insertIndex("postfix", "String");		
		
	}
	
	VCN(
			String given, 
			String surname, 
			String additional, 
			String prefix, 
			String postfix)
	{
		this();
		if(given.length() > 0)this.given = given;
		if(surname.length() > 0)this.surname.addAll(Arrays.asList(surname.split(" ")));
		if(additional.length() > 0)this.additional.addAll(Arrays.asList(additional.split(" ")));
		if(prefix.length() > 0)this.prefix.addAll(Arrays.asList(prefix.split(" ")));
		if(postfix.length() > 0)this.postfix.addAll(Arrays.asList(postfix.split(" ")));

	}

	@Override
	protected void setIntern(String identifier, Object value) {
		// TODO Auto-generated method stub
		//super.setIntern(identifier, value);
		switch(identifier)
		{
		case "given" :
			given = value.toString();
		break;
		case "surname" :
			surname.addAll(Arrays.asList(value.toString().split(" ")));
		break;
		case "additional" :
			additional.addAll(Arrays.asList(value.toString().split(" ")));
		break;
		case "prefix":
			prefix.addAll(Arrays.asList(value.toString().split(" ")));
		break;
		case "postfix" :
			postfix.addAll(Arrays.asList(value.toString().split(" ")));
		break;
		}
	}
	

	
}
