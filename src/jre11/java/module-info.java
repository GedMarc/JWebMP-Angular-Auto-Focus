import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularautofocus.AngularAutoFocusDirective;
import com.jwebmp.plugins.angularautofocus.implementations.AngularAutoFocusExclusionsModule;

module com.jwebmp.plugins.angularautofocus {
	exports com.jwebmp.plugins.angularautofocus;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularautofocus.AngularAutoFocusPageConfigurator;
	provides IAngularDirective with AngularAutoFocusDirective;

	provides IGuiceScanJarExclusions with AngularAutoFocusExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularAutoFocusExclusionsModule;

}
