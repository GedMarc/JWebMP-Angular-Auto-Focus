module com.jwebmp.plugins.angularautofocus {
	exports com.jwebmp.plugins.angularautofocus;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularautofocus.AngularAutoFocusPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularautofocus.AngularAutoFocusDirective;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularautofocus.implementations.AngularAutoFocusExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularautofocus.implementations.AngularAutoFocusExclusionsModule;

}
