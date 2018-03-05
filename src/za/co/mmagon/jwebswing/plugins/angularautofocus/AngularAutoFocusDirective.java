package za.co.mmagon.jwebswing.plugins.angularautofocus;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Auto Focus Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularAutoFocusDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAutoFocusDirective
	 */
	public AngularAutoFocusDirective()
	{
		super("AngularAutoFocus");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularAutoFocusDirective.class, "autoFocus", "autoFocus.min")
		                    .toString();
	}
}
