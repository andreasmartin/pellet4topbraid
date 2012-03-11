package pellet4topbraid;

import org.mindswap.pellet.jena.PelletReasonerFactory;
import org.topbraid.base.progress.ProgressMonitor;
import org.topbraid.spin.sparqlmotion.modules.AbstractSMModule;
import org.topbraid.spin.sparqlmotion.modules.SMException;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.Reasoner;

/**
 * A SPARQLMotion module that applies Pellet on the input graph.
 */
public class ApplyPelletModule extends AbstractSMModule {

	@Override
	protected Graph createGraph(ProgressMonitor monitor) throws SMException {
		// Get RDF graph from predecessor modules
		Model inputModel = getRDFInputModel( monitor );
		
		// Wrap this input graph with Pellet
		Reasoner reasoner = PelletReasonerFactory.theInstance().create();
		return ModelFactory.createInfModel( reasoner, inputModel ).getGraph();
	}
}
