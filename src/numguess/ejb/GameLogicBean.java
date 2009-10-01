/*
 * Created on Mar 6, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package numguess.ejb;
import java.util.Random;
import javax.naming.*;
import javax.ejb.*;
import numguess.common.*;
/**
 * @ejb.bean name="GameLogic"
 *	jndi-name="GameLogicBean"
 *	type="Stateful" 
 * 
 *--
 * This is needed for JOnAS.
 * If you are not using JOnAS you can safely remove the tags below.
 * @jonas.bean ejb-name="GameLogic"
 *	jndi-name="GameLogicBean"
 * 
 *--
 **/
public abstract class GameLogicBean implements SessionBean, Constants {
	private int answer = -1;
	private int numGuesses = 0;
	private BestScoreLocal bestScore;
/**
 * @ejb.interface-method
 *	view-type="local" 
**/
public GuessResult guess(int guess) {
	System.out.println("numguess.ejb.GameLogic.guess(" + guess + ")");
	boolean isNewBestScore = false;
	// update data model
	numGuesses++;
	// update best score in shared data model if available
  if (guess == answer && bestScore != null) {
    int best = bestScore.getScore();
    if (numGuesses < best) {
      bestScore.setScore(numGuesses);
      isNewBestScore = true;
    }
  }
	// populate resulting ValueObject
	GuessResult result = new GuessResult();
	result.setGuess(guess);
	result.setNumGuesses(numGuesses);
	result.setComparison(guess - answer);
	result.setBestScore(bestScore.getScore());
	result.setNewBestScore(isNewBestScore);
	return result;
}
/**
 * @ejb.interface-method
 *	view-type="local" 
**/
public void reset(){ 
	System.out.println("numguess.ejb.GameLogic.reset()");
	answer = MIN + Math.abs(new Random().nextInt() % (MAX - MIN + 1));
	numGuesses = 0;
	System.out.println("The answer is " + answer);
}
/**
 * @ejb.create-method
 *	view-type="local" 
**/
public void ejbCreate() throws CreateException{ 
  BestScoreLocalHome home = null;
  // look up home interface of BestScore entity bean
  try {
    Context context = new InitialContext();
    Object boundObject = context.lookup(EJB_BESTSCORE);
    home = (BestScoreLocalHome) boundObject;
  } catch (Exception e) {
    System.out.println("could not access BestScore entity bean");
    return;
  }
  // find (single) instance of BestScore entity bean
  try {
    bestScore = home.findByPrimaryKey(EJB_BESTSCORE_KEY);
    System.out.println("found " + EJB_BESTSCORE_KEY);
  } catch (FinderException e) {
    // create a new instance if not found
    try {
      bestScore = home.create(EJB_BESTSCORE_KEY);
      System.out.println("created " + EJB_BESTSCORE_KEY);
    } catch (CreateException c) {
      System.out.println("could not create BestScore entity bean");
    }
  }
}
}