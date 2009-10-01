package numguess.common;

/**
 * This interface defines the various constants used in this application,
 * including forwards and various kinds of keys.
 */

public interface Constants {

  int MIN = 1;
  int MAX = 100;
  String MIN_STRING = Integer.toString(MIN);
  String MAX_STRING = Integer.toString(MAX);

  String FORWARD_SUCCESS = "success";
  String FORWARD_FAILURE = "failure";
  String FORWARD_RESTART = "restart";

  String ATTRIBUTE_GUESS = "guess";
  String ATTRIBUTE_RANGE = "range";

  String PARAMETER_GUESS = "guess";

  String ERROR_GUESS = "guess";

  String EJB_GAMELOGIC = "java:comp/env/ejb/NumguessGameLogic";
  String EJB_RANGE = "java:comp/env/ejb/NumguessRange";
  String EJB_BESTSCORE = "java:comp/env/ejb/NumguessBestScore";
  String EJB_BESTSCORE_KEY = "TheBestScore";
}