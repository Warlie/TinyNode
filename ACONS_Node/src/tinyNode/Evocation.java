package tinyNode;

import tinyNode.data.vCard.*;
import tinyNode.graphics.*;
import java.util.*;

class Evocation {

	Castable lastSpell = null;
	
	Evocation(EnumSpells spell, tinyNode.connection.ComNode connection)
	{
		System.out.println("its magic");
		
		
		Vector<AbstractStreamStructurePanel<VCard>> line = new Vector<AbstractStreamStructurePanel<VCard>>();
		
		line.add(new tinyNode.graphics.VCNStreamPanel(tinyNode.TinyNode.<VCard>createFirstElement()));
		line.add(new tinyNode.graphics.VCGenderStreamPanel());
		line.add(new tinyNode.graphics.GeneralCheck());
		
		tinyNode.graphics.AutoFrameGraphic<VCard> summon = new tinyNode.graphics.AutoFrameGraphic<VCard>(line, connection);
	
		summon.setLocationRelativeTo(null);
		summon.pack();
		summon.setVisible(true);
		lastSpell = summon;
		
	}
	
	
	void interruptSpell(){lastSpell.interruptSpell();}
}
