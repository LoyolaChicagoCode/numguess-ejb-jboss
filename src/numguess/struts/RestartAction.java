package numguess.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import numguess.common.Constants;
/**
 * This action is invoked when the game is restarted.
 */

public class RestartAction extends Action implements Constants {

	public synchronized ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception {
  		GameUtil.getGameLogic(request).reset();
      BeanUtils.copyProperties(form, GameUtil.getRange(request).getRange());
			return mapping.findForward(FORWARD_RESTART);
	}
}