package numguess.struts;

import javax.naming.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import numguess.common.Constants;
import numguess.ejb.*;

/**
 * This class defines methods common to all actions in this application,
 * specifically, actions to obtain the model and the range data.
 */

public abstract class GameUtil implements Constants {

  /**
   * This method creates an instance of the GameLogic session bean
   * and saves it as a session attribute.
   */

  public static GameLogicLocal getGameLogic(HttpServletRequest request) throws Exception {
    HttpSession session = request.getSession();
    synchronized (session) {
      GameLogicLocal model = (GameLogicLocal) session.getAttribute(ATTRIBUTE_GUESS);
      if (model == null) {
        // When attempting to connect to JNDI, we store the reference to the
        // initial JNDI context in this variable. We will use it to lookup the
        // entity bean.
        Context context = new InitialContext();
        // Attempt to lookup an object at the specified location in the JNDI
        // context.
        Object boundObject = context.lookup(EJB_GAMELOGIC);
        // Try to convert it to an instance of GameLogicHome, the home
        // interface for our bean.
        GameLogicLocalHome home = (GameLogicLocalHome) boundObject;
        // If we got this far, we've done it, let's save the reference to the
        // AddressBook home interface in the session for future use by both
        // this page and the other JSP pages.
        model = home.create();
        session.setAttribute(ATTRIBUTE_GUESS, model);
      }
      return model;
    }
  }

  /**
   * This method creates an instance of the Range session bean
   * and saves it as a session attribute.
   */

  public static RangeLocal getRange(HttpServletRequest request) throws Exception {
    HttpSession session = request.getSession();
    synchronized (session) {
      RangeLocal range = (RangeLocal) session.getAttribute(ATTRIBUTE_RANGE);
      if (range == null) {
        Context context = new InitialContext();
        Object boundObject = context.lookup(EJB_RANGE);
        RangeLocalHome home = (RangeLocalHome) boundObject;
        range = home.create();
        session.setAttribute(ATTRIBUTE_RANGE, range);
      }
      return range;
    }
  }
}