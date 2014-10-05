package pellet4topbraid;

import org.topbraid.core.activator.IPluginActivator;
import org.topbraid.spin.sparqlmotion.modules.GenericModuleType;
import org.topbraid.spin.sparqlmotion.modules.SMModuleFactory;

public class PelletPluginActivator implements IPluginActivator {

	@Override
	public void activate() {
		// Called when TopBraid starts up to register new SM module type
		SMModuleFactory.get().registerModuleType(
			new PelletSMModule(), 
			new GenericModuleType( PelletSMModule.class ),
			"urn:x-pellet4topbraid#ApplyPellet"
		);
	}

}
