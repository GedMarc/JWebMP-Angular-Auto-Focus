package com.jwebmp.plugins.angularautofocus.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularAutoFocusExclusionsModule
		implements IGuiceScanModuleExclusions<AngularAutoFocusExclusionsModule>,
				           IGuiceScanJarExclusions<AngularAutoFocusExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-auto-focus-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularautofocus");
		return strings;
	}
}