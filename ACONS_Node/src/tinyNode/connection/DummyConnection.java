package tinyNode.connection;

import java.util.List;

import tinyNode.data.vCard.VCard;

public class DummyConnection implements ComConnection {

	/**
	 * 
	 * @param vc
	 * @return
	 */
	
	public boolean storeVC(List<VCard> vc)
	{
		return false;
	}

}
