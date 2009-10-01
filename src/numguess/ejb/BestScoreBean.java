/*
 * Created on Mar 6, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package numguess.ejb;
import javax.ejb.EntityBean;
/**
 * @ejb.bean name="BestScore"
 *	jndi-name="BestScoreBean"
 *	type="CMP"
 *  primkey-field="name"
 *  schema="NumguessBestScore" 
 *  cmp-version="2.x"
 * 
 *--
 * This is needed for JOnAS.
 * If you are not using JOnAS you can safely remove the tags below.
 * @jonas.bean ejb-name="BestScore"
 *	jndi-name="BestScoreBean"
 * @jonas.jdbc-mapping  jndi-name="" jdbc-table-name="numguess" 
 * --
 * 
 *  @ejb.persistence 
 *   table-name="numguess" 
 * 
 * @ejb.finder 
 *    query="SELECT OBJECT(a) FROM NumguessBestScore as a"  
 *    signature="java.util.Collection findAll()"  
 * 
 *--
 * This is needed for JOnAS.
 * If you are not using JOnAS you can safely remove the tags below.
 * @jonas.finder-method-jdbc-mapping  method-name="findAll"
 *	jdbc-where-clause=""
 * @jonas.jdbc-mapping  jndi-name=""
 *	jdbc-table-name="numguess"
 * 
 *--
 *  
 **/
public abstract class BestScoreBean implements EntityBean {
	/**
	 * The  ejbCreate method.
	 * 
	 * @ejb.create-method 
	 */
	public java.lang.String ejbCreate(String name) throws javax.ejb.CreateException {
		// EJB 2.0 spec says return null for CMP ejbCreate methods.
		// YOU MUST INITIALIZE THE FIELDS FOR THE BEAN HERE. 
		// setMyField("Something"); 
    setName(name);
    setScore(Integer.MAX_VALUE);
		return null;
	}
	/**
	 * The container invokes this method immediately after it calls ejbCreate.
	 * 
	 */
	public void ejbPostCreate() throws javax.ejb.CreateException {
	}
	/**
	 * Returns the name
	 * @return the name
	 * 
	 * @ejb.persistent-field 
	 * @ejb.persistence
	 *    column-name="name"
	 *     sql-type="VARCHAR"
	 * @ejb.pk-field 
	 * @ejb.interface-method
   *	view-type="local" 
	 * 
	 * --
	 * This is needed for JOnAS.
	 * If you are not using JOnAS you can safely remove the tags below.
	 * @jonas.cmp-field-jdbc-mapping  field-name="name"
	 *	jdbc-field-name="name"
	 * 
	 --
	 */
	public abstract java.lang.String getName();
	/**
	 * Sets the name
	 * 
	 * @param java.lang.String the new name value
	 * 
	 * @ejb.interface-method
   *	view-type="local" 
 	 */
	public abstract void setName(java.lang.String name);
	/**
	 * Returns the score
	 * @return the score
	 * 
	 * @ejb.persistent-field 
	 * @ejb.persistence
	 *    column-name="score"
	 *     sql-type="INTEGER"
	 *  
	 * @ejb.interface-method
   *	view-type="local" 
	 * 
	 * --
	 * This is needed for JOnAS.
	 * If you are not using JOnAS you can safely remove the tags below.
	 * @jonas.cmp-field-jdbc-mapping  field-name="score"
	 *	jdbc-field-name="score"
	 * 
	 --
	 */
	public abstract int getScore();
	/**
	 * Sets the score
	 * 
	 * @param java.lang.Integer the new score value
	 * 
	 * @ejb.interface-method
   *	view-type="local" 
	 */
	public abstract void setScore(int score);
}