/*
 * Generated by XDoclet - Do not edit!
 */
package numguess.ejb;

/**
 * Home interface for BestScore.
 * @lomboz generated
 */
public interface BestScoreHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/BestScore";
   public static final String JNDI_NAME="BestScoreBean";

   public numguess.ejb.BestScore create(java.lang.String name)
      throws javax.ejb.CreateException,java.rmi.RemoteException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException,java.rmi.RemoteException;

   public numguess.ejb.BestScore findByPrimaryKey(java.lang.String pk)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}