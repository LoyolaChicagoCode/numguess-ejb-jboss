/*
 * Generated by XDoclet - Do not edit!
 */
package numguess.ejb;

/**
 * Home interface for GameLogic.
 * @lomboz generated
 */
public interface GameLogicHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/GameLogic";
   public static final String JNDI_NAME="GameLogicBean";

   public numguess.ejb.GameLogic create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
