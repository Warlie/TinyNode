/**
 * 
 */
package tinyNode.connection;

import java.util.*;
import java.util.stream.Stream;

import tinyNode.data.vCard.*;
import tinyNode.data.phonecall.*;
import tinyNode.graphics.*;

/**
 * @author Stefan Wegerhoff
 *
 */
public class ComNode {

	
	public ComNode (ComConnection direct)
	{
		
	}

	/**
	 * 
	 * @param cc
	 */

	public static List<VCard> getFilterVCard()
	{
		/*
		VCard vc = new VCard();
		Vector<VCard> vvc = new Vector<VCard>();
		vvc.add(vc);
		*/
		List<VCard> list = new ArrayList<VCard>();
		list.add(new VCard());

		//stream = list.stream();
		
		
		return list;
	}
	

	/**
	 * 
	 * @param filter
	 * @return
	 */
	
	public Map <String, VCard> getVCList(VCard filter)
	{
		return null;
	}

	/**
	 * 
	 * @param vc
	 * @return
	 */
	
	public boolean storeVC(VCard vc)
	{
		return false;
	}

	/**
	 * 
	 * @param pc
	 * @return
	 */
	
	public boolean storeVC(List<VCard> vc)
	{
		return false;
	}	
	
	/**
	 * 
	 * @param pc
	 * @return
	 */
	
	public boolean storePC(PhoneCall pc)
	{
		return false;
	}

	/**
	 * 
	 * @param pc
	 * @return
	 */
	
	public boolean storePC(List<PhoneCall> pc)
	{
		return false;
	}
	
	/**
	 * 
	 * @param vc
	 * @return
	 */
	
	public Map<Date,PhoneCall>getPCList(VCard vc)
	{
		return null;
	}
	
	/**
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	
	public Vector<PhoneCall>getPCBetween(Date d1, Date d2)
	{
		return null;
	}
	
	/**
	 * 
	 * @param pc
	 * @return
	 */
	
	public Map<String,PhoneCall>getPC(PhoneCall pc)
	{
		return null;
	}
	
	/**
	 * 
	 * @param identifer
	 * @return
	 */
	
	public Vector<String>getStringList(String identifer)
	{
		return null;
	}

	
	/**
	public static V StreamLine<V> createCC() {
		// TODO Auto-generated method stub
		return null;
	}
*/
	
}
