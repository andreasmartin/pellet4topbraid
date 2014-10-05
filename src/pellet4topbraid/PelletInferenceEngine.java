package pellet4topbraid;

import org.mindswap.pellet.jena.PelletReasonerFactory;
import org.topbraid.inference.IInferenceEngine;
import org.topbraid.inference.IInferenceEngineConfiguration;
import org.topbraid.spin.progress.ProgressMonitor;

import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.Reasoner;

public class PelletInferenceEngine implements IInferenceEngine {

	@Override
	public String getConfigClassURI() {
		return "urn:x-pellet4topbraid#config";
	}

	@Override
	public String getConfigPropertyURI() {
		return "urn:x-pellet4topbraid#configProperty";
	}

	@Override
	public String getDescription() {
		return "The OWL DL inference engine Pellet 2.3.2-SNAPSHOT";
	}

	@Override
	public InfModel getInferenceModel(InfModel infModel,
			IInferenceEngineConfiguration config, int index, Object init,
			ProgressMonitor monitor) throws InterruptedException {

		// create Pellet reasoner
		Reasoner reasoner = PelletReasonerFactory.theInstance().create();

		// create an inferencing model using Pellet reasoner and provided
		// InfModel
		return ModelFactory.createInfModel(reasoner, infModel);
	}

	@Override
	public String getLabel(IInferenceEngineConfiguration config, int index) {
		return "distro defaults";
	}

	@Override
	public Object prepare(Model model) {
		return null;
	}

}
