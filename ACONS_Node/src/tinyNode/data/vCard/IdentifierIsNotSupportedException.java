/**
 * 
 */
package tinyNode.data.vCard;

/**
 * @author warlie
 *
 */
public class IdentifierIsNotSupportedException extends RuntimeException {

	public IdentifierIsNotSupportedException(String msg)
	{
		super(msg);
	}
	
	public IdentifierIsNotSupportedException()
	{
	super("Category is not supported");
	}
}
