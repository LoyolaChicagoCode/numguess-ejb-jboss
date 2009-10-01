/*
 * Created on Mar 6, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package numguess.ejb;
import javax.ejb.SessionBean;
import numguess.common.*;
/**
 * @ejb.bean name="Range"
 *	jndi-name="RangeBean"
 *	type="Stateless" 
 * 
 *--
 * This is needed for JOnAS.
 * If you are not using JOnAS you can safely remove the tags below.
 * @jonas.bean ejb-name="Range"
 *	jndi-name="RangeBean"
 * 
 *--
 **/
public abstract class RangeBean implements SessionBean, Constants {
	private static final RangeResult range = new RangeResult();
	static {
		range.setMin(MIN);
		range.setMax(MAX);
	}
/**
 * @ejb.interface-method
 *	view-type="local" 
**/
public RangeResult getRange(){ 
 return range; 
}
}