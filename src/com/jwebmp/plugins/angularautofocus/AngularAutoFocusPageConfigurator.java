package com.jwebmp.plugins.angularautofocus;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to have an auto expand by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Auto Focus",
		pluginDescription = "Auto Focus Components with Angular",
		pluginUniqueName = "jwebswing-angular-auto-focus",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,focus,ui,web ui, framework",
		pluginSubtitle = "Auto Focus Components with Angular",
		pluginSourceUrl = "https://www.akveo.com/products.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Auto-Focus/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Auto-Focus",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.akveo.com/products.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAutoFocus.jar/download")
@ComponentInformation(name = "Angular Auto Focus",
		description = "Auto Focus Components with Angular",
		url = "https://www.akveo.com/products.html")
public class AngularAutoFocusPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAutoFocusPageConfigurator
	 */
	public AngularAutoFocusPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
		}
		return page;
	}
}