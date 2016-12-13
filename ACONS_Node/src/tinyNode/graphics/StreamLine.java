package tinyNode.graphics;

import java.util.stream.*;
import tinyNode.connection.BrokenStreamException;


public interface StreamLine <T> {

	public boolean computeStream(Stream<T> stream);
	
	public Stream<T> getStream() throws BrokenStreamException;

	
}
