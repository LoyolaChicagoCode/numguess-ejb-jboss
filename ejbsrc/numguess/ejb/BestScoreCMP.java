/*
 * Generated by XDoclet - Do not edit!
 */
package numguess.ejb;

/**
 * CMP layer for BestScore.
 * @lomboz generated
 */
public abstract class BestScoreCMP
   extends numguess.ejb.BestScoreBean
   implements javax.ejb.EntityBean
{

   public numguess.ejb.BestScoreData getData()
   {
      numguess.ejb.BestScoreData dataHolder = null;
      try
      {
         dataHolder = new numguess.ejb.BestScoreData();

         dataHolder.setName( getName() );
         dataHolder.setScore( getScore() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   /**
    * Generated ejbPostCreate for corresponding ejbCreate method.
    *
    * @see #ejbCreate(java.lang.String name)
    */
   public void ejbPostCreate(java.lang.String name)
   {
   }

   public void ejbLoad() 
   {
   }

   public void ejbStore() 
   {
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
   }

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {

   }

 /* Value Objects BEGIN */

/* Value Objects END */

   public abstract java.lang.String getName() ;

   public abstract void setName( java.lang.String name ) ;

   public abstract int getScore() ;

   public abstract void setScore( int score ) ;

}
