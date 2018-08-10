import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.plugins.angularautofocus.AngularAutoFocusDirective;

module com.jwebmp.plugins.angularautofocus {
	exports com.jwebmp.plugins.angularautofocus;

	requires com.jwebmp.core;
	requires java.validation;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularautofocus.AngularAutoFocusPageConfigurator;
	provides IAngularDirective with AngularAutoFocusDirective;

}
